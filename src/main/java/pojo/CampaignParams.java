
package pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CampaignParams {

    private String clientId;
    private List<String> clientIds = null;
    private String name;
    private String startDate;
    private String endDate;
    private BudgetCap budgetCap;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public CampaignParams withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public List<String> getClientIds() {
        return clientIds;
    }

    public void setClientIds(List<String> clientIds) {
        this.clientIds = clientIds;
    }

    public CampaignParams withClientIds(List<String> clientIds) {
        this.clientIds = clientIds;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CampaignParams withName(String name) {
        this.name = name;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public CampaignParams withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public CampaignParams withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public BudgetCap getBudgetCap() {
        return budgetCap;
    }

    public void setBudgetCap(BudgetCap budgetCap) {
        this.budgetCap = budgetCap;
    }

    public CampaignParams withBudgetCap(BudgetCap budgetCap) {
        this.budgetCap = budgetCap;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CampaignParams withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
