
package org.asnworks.apis.lucene.pincodes.dto;


public class VillageDTO {

    private String villageName;
    private String pinCode;
    private String districtName;
    private String subDistrictName;
    private String stateName;

    public VillageDTO() {
    }

    public VillageDTO(String villageName, String pinCode, String districtName, String subDistrictName, String stateName) {
        super();
        this.villageName = villageName;
        this.pinCode = pinCode;
        this.districtName = districtName;
        this.subDistrictName = subDistrictName;
        this.stateName = stateName;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getSubDistrictName() {
        return subDistrictName;
    }

    public void setSubDistrictName(String subDistrictName) {
        this.subDistrictName = subDistrictName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

}
