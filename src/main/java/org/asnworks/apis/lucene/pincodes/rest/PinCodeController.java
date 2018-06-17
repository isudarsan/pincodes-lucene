
package org.asnworks.apis.lucene.pincodes.rest;

import java.util.List;

import org.asnworks.apis.lucene.pincodes.constants.Constants;
import org.asnworks.apis.lucene.pincodes.domain.PinCode;
import org.asnworks.apis.lucene.pincodes.dto.LocalityRequestDTO;
import org.asnworks.apis.lucene.pincodes.dto.LocalityResponseDTO;
import org.asnworks.apis.lucene.pincodes.dto.VillageRequestDTO;
import org.asnworks.apis.lucene.pincodes.dto.VillageResponseDTO;
import org.asnworks.apis.lucene.pincodes.exceptions.InvalidRequestException;
import org.asnworks.apis.lucene.pincodes.exceptions.NoSuchPinCodeException;
import org.asnworks.apis.lucene.pincodes.exceptions.NoSuchVillageException;
import org.asnworks.apis.lucene.pincodes.service.PinCodeService;
import org.asnworks.apis.lucene.pincodes.utils.PinCodeTransformer;
import org.asnworks.apis.lucene.pincodes.utils.PinCodeValidationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PinCodeController {

    @Autowired
    private PinCodeService pinCodeService;

    @Autowired
    private PinCodeTransformer pinCodeTransformer;

    @Autowired
    private PinCodeValidationUtil pinCodeValidationUtil;

    @RequestMapping(method = RequestMethod.POST, value = Constants.PIN_CODE_END_POINT)
    public ResponseEntity<LocalityResponseDTO> getPinCode(@RequestBody final LocalityRequestDTO localityRequestDTO)
        throws NoSuchPinCodeException, InvalidRequestException {

        if (pinCodeValidationUtil.isInvalidRequest(localityRequestDTO)) {
            throw new InvalidRequestException(Constants.INVALID_REQUEST_PIN_CODE_MANDATORY);
        }

        if (!pinCodeValidationUtil.isValidPinCode(localityRequestDTO.getCode())) {
            throw new InvalidRequestException(Constants.INVALID_REQUEST_PIN_CODE_MUST_BE_NUMERIC);
        }

        List<PinCode> pinCodes = pinCodeService.findByCode(localityRequestDTO.getCode());
        LocalityResponseDTO response = pinCodeTransformer.transformToLocalityResponse(pinCodes);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = Constants.VILLAGE_SUGGESTIONS_END_POINT)
    public ResponseEntity<VillageResponseDTO> getVillageSuggestions(@RequestBody final VillageRequestDTO villageRequestDTO)
        throws NoSuchVillageException, InvalidRequestException {
        if (null == villageRequestDTO.getVillageName() || villageRequestDTO.getVillageName().length() == 0) {
            throw new InvalidRequestException(Constants.INVALID_REQUEST_VILLAGE_NAME_MANDATORY);
        }

        List<PinCode> pinCodes = pinCodeService.findByVillageName(villageRequestDTO.getVillageName());
        VillageResponseDTO response = pinCodeTransformer.transformToVillageResponse(pinCodes);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
