
package pojo;

import java.util.HashMap;
import java.util.Map;

public class CreateCampaign {

    private CampaignParams params;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public CampaignParams getParams() {
        return params;
    }

    public void setParams(CampaignParams params) {
        this.params = params;
    }

    public CreateCampaign withParams(CampaignParams params) {
        this.params = params;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CreateCampaign withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
