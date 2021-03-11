
package pojo;

import java.util.HashMap;
import java.util.Map;

public class CreateClient {

    private ClientParams params;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public ClientParams getParams() {
        return params;
    }

    public void setParams(ClientParams params) {
        this.params = params;
    }

    public CreateClient withParams(ClientParams params) {
        this.params = params;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CreateClient withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
