/**
 * 
 */
package org.asnworks.apis.lucene.pincodes.service;

import java.util.List;

import org.asnworks.apis.lucene.pincodes.domain.PinCode;
import org.asnworks.apis.lucene.pincodes.exceptions.NoSuchPinCodeException;

/**
 * @author sudambat
 *
 */
public interface PinCodeService {

    List<PinCode> get(final String pinCode) throws NoSuchPinCodeException;
}
