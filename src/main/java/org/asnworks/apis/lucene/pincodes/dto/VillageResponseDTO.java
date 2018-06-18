
package org.asnworks.apis.lucene.pincodes.dto;

import java.util.List;

public class VillageResponseDTO {

    private List<VillageDTO> localities;

    public VillageResponseDTO() {
    }

    public List<VillageDTO> getLocalities() {
        return localities;
    }

    public void setLocalities(List<VillageDTO> localities) {
        this.localities = localities;
    }

}
