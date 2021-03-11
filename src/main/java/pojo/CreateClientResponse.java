
package pojo;

import java.util.HashMap;
import java.util.Map;

public class CreateClientResponse {

    private Boolean success;
    private Data data;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public CreateClientResponse withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public CreateClientResponse withData(Data data) {
        this.data = data;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CreateClientResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
