/**
 * 
 */
package org.asnworks.apis.lucene.pincodes.repos;

import java.util.List;

import org.asnworks.apis.lucene.pincodes.domain.PinCode;
import org.springframework.data.repository.query.Param;
import org.springframework.data.solr.repository.SolrCrudRepository;

/**
 * @author sudambat
 *
 */
public interface PinCodeRepository extends SolrCrudRepository<PinCode, Long> {

    List<PinCode> fetchByCode(@Param("code") final String code);
}
