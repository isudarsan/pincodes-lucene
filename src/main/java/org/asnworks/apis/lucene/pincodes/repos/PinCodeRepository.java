/**
 * 
 */
package org.asnworks.apis.lucene.pincodes.repos;

import java.util.List;

import org.asnworks.apis.lucene.pincodes.domain.PinCode;
import org.springframework.data.solr.repository.SolrCrudRepository;

/**
 * @author sudambat
 *
 */
public interface PinCodeRepository extends SolrCrudRepository<PinCode, String> {

    List<PinCode> findByCode(final String code);

    List<PinCode> findByVillageName(final String villageName);
}
