
package pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Feed {

    private String xmlFeedUrl;
    private Object id;
    private SchemaMappings schemaMappings;
    private List<String> mandatoryFields = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getXmlFeedUrl() {
        return xmlFeedUrl;
    }

    public void setXmlFeedUrl(String xmlFeedUrl) {
        this.xmlFeedUrl = xmlFeedUrl;
    }

    public Feed withXmlFeedUrl(String xmlFeedUrl) {
        this.xmlFeedUrl = xmlFeedUrl;
        return this;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Feed withId(Object id) {
        this.id = id;
        return this;
    }

    public SchemaMappings getSchemaMappings() {
        return schemaMappings;
    }

    public void setSchemaMappings(SchemaMappings schemaMappings) {
        this.schemaMappings = schemaMappings;
    }

    public Feed withSchemaMappings(SchemaMappings schemaMappings) {
        this.schemaMappings = schemaMappings;
        return this;
    }

    public List<String> getMandatoryFields() {
        return mandatoryFields;
    }

    public void setMandatoryFields(List<String> mandatoryFields) {
        this.mandatoryFields = mandatoryFields;
    }

    public Feed withMandatoryFields(List<String> mandatoryFields) {
        this.mandatoryFields = mandatoryFields;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Feed withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
