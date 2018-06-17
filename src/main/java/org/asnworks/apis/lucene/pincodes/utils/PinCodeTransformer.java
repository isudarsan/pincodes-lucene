
package org.asnworks.apis.lucene.pincodes.utils;

import java.util.List;

import org.asnworks.apis.lucene.pincodes.domain.PinCode;
import org.asnworks.apis.lucene.pincodes.dto.LocalityDTO;
import org.asnworks.apis.lucene.pincodes.dto.LocalityResponseDTO;
import org.asnworks.apis.lucene.pincodes.dto.VillageDTO;
import org.asnworks.apis.lucene.pincodes.dto.VillageResponseDTO;
import org.springframework.stereotype.Component;

import com.google.common.collect.Lists;


@Component
public class PinCodeTransformer {

    public LocalityResponseDTO transformToLocalityResponse(final List<PinCode> pinCodes) {
        LocalityResponseDTO localityResponseDTO = new LocalityResponseDTO();
        List<LocalityDTO> localityDTOs = Lists.newArrayList();
        for (PinCode pinCode : pinCodes) {
            LocalityDTO localityDTO = new LocalityDTO(pinCode.getVillageName(), pinCode.getSubDistrictName(),
                pinCode.getDistrictName(), pinCode.getStateName());
            localityDTOs.add(localityDTO);
        }

        localityResponseDTO.setLocalities(localityDTOs);
        return localityResponseDTO;
    }

    public VillageResponseDTO transformToVillageResponse(final List<PinCode> pinCodes) {

        VillageResponseDTO villageResponseDTO = new VillageResponseDTO();
        List<VillageDTO> villageDTOs = Lists.newArrayList();
        for (PinCode pinCode : pinCodes) {
            VillageDTO villageDTO = new VillageDTO(pinCode.getVillageName(),
                pinCode.getCode(), pinCode.getDistrictName(), pinCode.getSubDistrictName(), pinCode.getStateName());
            villageDTOs.add(villageDTO);
        }

        villageResponseDTO.setLocalities(villageDTOs);

        return villageResponseDTO;
    }
}
