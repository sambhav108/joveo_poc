
package pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

    private List<Datum> data = null;
    private Summary summary;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Data withData(List<Datum> data) {
        this.data = data;
        return this;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Data withSummary(Summary summary) {
        this.summary = summary;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Data withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
