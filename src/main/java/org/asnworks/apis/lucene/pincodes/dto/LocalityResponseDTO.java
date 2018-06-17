
package org.asnworks.apis.lucene.pincodes.dto;

import java.util.List;

public class LocalityResponseDTO {

    private List<LocalityDTO> localities;

    public LocalityResponseDTO() {

    }

    public List<LocalityDTO> getLocalities() {
        return localities;
    }

    public void setLocalities(List<LocalityDTO> localities) {
        this.localities = localities;
    }

}
