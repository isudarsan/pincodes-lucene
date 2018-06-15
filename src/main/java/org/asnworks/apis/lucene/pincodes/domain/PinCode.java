
package org.asnworks.apis.lucene.pincodes.domain;

import org.springframework.data.solr.core.mapping.SolrDocument;

/***
 * @author Sudarshan
 */
@SolrDocument()
public class PinCode implements java.io.Serializable {

    private static final long serialVersionUID = -2416436344701442703L;


    private Long id;


    private String villageName;
    private String officeName;
    private String code;
    private String subDistrictName;
    private String districtName;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
