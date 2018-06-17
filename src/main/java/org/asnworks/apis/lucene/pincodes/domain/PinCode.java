package org.asnworks.apis.lucene.pincodes.domain;

import org.apache.solr.client.solrj.beans.Field;
import org.asnworks.apis.lucene.pincodes.constants.SolrConstants;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = SolrConstants.SOLR_CORE_NAME)
public class PinCode implements java.io.Serializable {

    private static final long serialVersionUID = -2416436344701442703L;

    @Id
    private String id;

    @Indexed(name = SolrConstants.VILLAGE_NAME)
    private String villageName;

    private String officeName;

    @Indexed(name = SolrConstants.PIN_CODE)
    private String code;

    @Field(value = SolrConstants.SUB_DISTRICT_NAME)
    private String subDistrictName;

    @Indexed(name = SolrConstants.DISTRICT_NAME)
    private String districtName;

    @Indexed(name = SolrConstants.STATE_NAME)
    private String stateName;

    public PinCode() {
    }

    public PinCode(String villageName, String officeName, String code, String subDistrictName, String districtName, String stateName) {
        super();
        this.villageName = villageName;
        this.officeName = officeName;
        this.code = code;
        this.subDistrictName = subDistrictName;
        this.districtName = districtName;
        this.stateName = stateName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSubDistrictName() {
        return subDistrictName;
    }

    public void setSubDistrictName(String subDistrictName) {
        this.subDistrictName = subDistrictName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

}
