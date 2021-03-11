
package pojo;

import java.util.HashMap;
import java.util.Map;

public class BudgetCap {

    private Integer value;
    private Boolean pacing;
    private String freq;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public BudgetCap withValue(Integer value) {
        this.value = value;
        return this;
    }

    public Boolean getPacing() {
        return pacing;
    }

    public void setPacing(Boolean pacing) {
        this.pacing = pacing;
    }

    public BudgetCap withPacing(Boolean pacing) {
        this.pacing = pacing;
        return this;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public BudgetCap withFreq(String freq) {
        this.freq = freq;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public BudgetCap withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
