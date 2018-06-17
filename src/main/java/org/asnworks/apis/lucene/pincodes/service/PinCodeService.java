
package org.asnworks.apis.lucene.pincodes.service;

import java.util.List;

import org.asnworks.apis.lucene.pincodes.domain.PinCode;
import org.asnworks.apis.lucene.pincodes.exceptions.NoSuchPinCodeException;
import org.asnworks.apis.lucene.pincodes.exceptions.NoSuchVillageException;


public interface PinCodeService {

    List<PinCode> findByCode(final String pinCode) throws NoSuchPinCodeException;

    List<PinCode> findByVillageName(final String villageName) throws NoSuchVillageException;
}
