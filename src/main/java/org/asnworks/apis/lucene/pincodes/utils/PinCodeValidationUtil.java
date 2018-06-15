/**
 * 
 */
package org.asnworks.apis.lucene.pincodes.utils;

import org.asnworks.apis.lucene.pincodes.Constants;
import org.asnworks.apis.lucene.pincodes.dto.LocalityRequestDTO;
import org.springframework.stereotype.Component;

/**
 * @author sudambat
 *
 */
@Component
public class PinCodeValidationUtil {

    public boolean isValidPinCode(final String pinCode) {
        return pinCode.matches(Constants.PIN_CODE_REGEX);
    }

    public boolean isInvalidRequest(final LocalityRequestDTO localityRequestDTO) {
        return (null == localityRequestDTO || null == localityRequestDTO.getCode()) ? true : false;
    }
}
