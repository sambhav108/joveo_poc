
package pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientParams {

    private String name;
    private String country;
    private String exportedName;
    private String advertiserName;
    private String ats;
    private String atsUrl;
    private String frequency;
    private Integer applyConvWindow;
    private String timezone;
    private String type;
    private String industry;
    private String excludedPublishers;
    private String endDate;
    private String startDate;
    private String markdown;
    private List<Feed> feeds = null;
    private Boolean sjCreate;
    private BudgetCap budgetCap;
    private List<String> industries = null;
    private String globallyExcludedPublishers;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientParams withName(String name) {
        this.name = name;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ClientParams withCountry(String country) {
        this.country = country;
        return this;
    }

    public String getExportedName() {
        return exportedName;
    }

    public void setExportedName(String exportedName) {
        this.exportedName = exportedName;
    }

    public ClientParams withExportedName(String exportedName) {
        this.exportedName = exportedName;
        return this;
    }

    public String getAdvertiserName() {
        return advertiserName;
    }

    public void setAdvertiserName(String advertiserName) {
        this.advertiserName = advertiserName;
    }

    public ClientParams withAdvertiserName(String advertiserName) {
        this.advertiserName = advertiserName;
        return this;
    }

    public String getAts() {
        return ats;
    }

    public void setAts(String ats) {
        this.ats = ats;
    }

    public ClientParams withAts(String ats) {
        this.ats = ats;
        return this;
    }

    public String getAtsUrl() {
        return atsUrl;
    }

    public void setAtsUrl(String atsUrl) {
        this.atsUrl = atsUrl;
    }

    public ClientParams withAtsUrl(String atsUrl) {
        this.atsUrl = atsUrl;
        return this;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public ClientParams withFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    public Integer getApplyConvWindow() {
        return applyConvWindow;
    }

    public void setApplyConvWindow(Integer applyConvWindow) {
        this.applyConvWindow = applyConvWindow;
    }

    public ClientParams withApplyConvWindow(Integer applyConvWindow) {
        this.applyConvWindow = applyConvWindow;
        return this;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public ClientParams withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClientParams withType(String type) {
        this.type = type;
        return this;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public ClientParams withIndustry(String industry) {
        this.industry = industry;
        return this;
    }

    public String getExcludedPublishers() {
        return excludedPublishers;
    }

    public void setExcludedPublishers(String excludedPublishers) {
        this.excludedPublishers = excludedPublishers;
    }

    public ClientParams withExcludedPublishers(String excludedPublishers) {
        this.excludedPublishers = excludedPublishers;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ClientParams withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ClientParams withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public ClientParams withMarkdown(String markdown) {
        this.markdown = markdown;
        return this;
    }

    public List<Feed> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<Feed> feeds) {
        this.feeds = feeds;
    }

    public ClientParams withFeeds(List<Feed> feeds) {
        this.feeds = feeds;
        return this;
    }

    public Boolean getSjCreate() {
        return sjCreate;
    }

    public void setSjCreate(Boolean sjCreate) {
        this.sjCreate = sjCreate;
    }

    public ClientParams withSjCreate(Boolean sjCreate) {
        this.sjCreate = sjCreate;
        return this;
    }

    public BudgetCap getBudgetCap() {
        return budgetCap;
    }

    public void setBudgetCap(BudgetCap budgetCap) {
        this.budgetCap = budgetCap;
    }

    public ClientParams withBudgetCap(BudgetCap budgetCap) {
        this.budgetCap = budgetCap;
        return this;
    }

    public List<String> getIndustries() {
        return industries;
    }

    public void setIndustries(List<String> industries) {
        this.industries = industries;
    }

    public ClientParams withIndustries(List<String> industries) {
        this.industries = industries;
        return this;
    }

    public String getGloballyExcludedPublishers() {
        return globallyExcludedPublishers;
    }

    public void setGloballyExcludedPublishers(String globallyExcludedPublishers) {
        this.globallyExcludedPublishers = globallyExcludedPublishers;
    }

    public ClientParams withGloballyExcludedPublishers(String globallyExcludedPublishers) {
        this.globallyExcludedPublishers = globallyExcludedPublishers;
        return this;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ClientParams withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
