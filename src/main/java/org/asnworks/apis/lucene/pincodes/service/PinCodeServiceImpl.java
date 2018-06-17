
package org.asnworks.apis.lucene.pincodes.service;

import java.util.List;

import org.asnworks.apis.lucene.pincodes.domain.PinCode;
import org.asnworks.apis.lucene.pincodes.exceptions.NoSuchPinCodeException;
import org.asnworks.apis.lucene.pincodes.exceptions.NoSuchVillageException;
import org.asnworks.apis.lucene.pincodes.repos.PinCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PinCodeServiceImpl implements PinCodeService {

    @Autowired
    PinCodeRepository pinCoderepository;

    @Override
    public List<PinCode> findByCode(final String pinCode) throws NoSuchPinCodeException {
        List<PinCode> pinCodes = pinCoderepository.findByCode(pinCode);
        if (null == pinCodes || pinCodes.isEmpty()) {
            throw new NoSuchPinCodeException("Pincode not found.");
        }
        return pinCodes;
    }

    @Override
    public List<PinCode> findByVillageName(final String villageName) throws NoSuchVillageException {
        List<PinCode> pinCodes = pinCoderepository.findByVillageName(villageName);

        if (null == pinCodes || pinCodes.isEmpty()) {
            throw new NoSuchVillageException("Village not found");
        }
        return pinCodes;
    }

}
