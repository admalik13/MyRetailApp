package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Item {
    @JsonProperty("tcin")
    private Integer tcin;
    @JsonProperty("bundle_components")
    private BundleComponents bundleComponents;
    @JsonProperty("dpci")
    private String dpci;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("product_description")
    private ProductDescription productDescription;
    @JsonProperty("buy_url")
    private String buyUrl;
    @JsonProperty("variation")
    private Map<String,Object> variation;
    @JsonProperty("enrichment")
    private Enrichment enrichment;
    @JsonProperty("return_method")
    private String returnMethod;
    @JsonProperty("handling")
    private Map<String,Object> handling;
    @JsonProperty("recall_compliance")
    private RecallCompliance recallCompliance;
    @JsonProperty("tax_category")
    private TaxCategory taxCategory;
    @JsonProperty("display_option")
    private DisplayOption displayOption;
    @JsonProperty("fulfillment")
    private Fulfillment fulfillment;
    @JsonProperty("package_dimensions")
    private PackageDimensions packageDimensions;
    @JsonProperty("environmental_segmentation")
    private EnvironmentalSegmentation environmentalSegmentation;
    @JsonProperty("manufacturer")
    private Map<String,Object> manufacturer;
    @JsonProperty("product_vendors")
    private List<ProductVendor> productVendors;
    @JsonProperty("product_classification")
    private ProductClassification productClassification;
    @JsonProperty("product_brand")
    private ProductBrand productBrand;
    @JsonProperty("item_state")
    private String itemState;
    @JsonProperty("specifications")
    private Object specifications;
    @JsonProperty("attributes")
    private Attributes attributes;
    @JsonProperty("country_of_origin")
    private String countryOfOrigin;
    @JsonProperty("relationship_type_code")
    private String relationshipTypeCode;
    @JsonProperty("subscription_eligible")
    private Boolean subscriptionEligible;
    @JsonProperty("ribbons")
    private Object ribbons;
    @JsonProperty("tags")
    private Object tags;
    @JsonProperty("estore_item_status_code")
    private Character eStoreItemStatusCode;
    @JsonProperty("is_proposition_65")
    private Boolean isProposition65;
    @JsonProperty("return_policies")
    private ReturnPolicies returnPolicies;
    @JsonProperty("gifting_enabled")
    private Boolean giftingEnabled;


    public Integer getTcin() {
        return tcin;
    }

    public void setTcin(Integer tcin) {
        this.tcin = tcin;
    }

    public BundleComponents getBundleComponents() {
        return bundleComponents;
    }

    public void setBundleComponents(BundleComponents bundleComponents) {
        this.bundleComponents = bundleComponents;
    }

    public String getDpci() {
        return dpci;
    }

    public void setDpci(String dpci) {
        this.dpci = dpci;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public ProductDescription getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(ProductDescription productDescription) {
        this.productDescription = productDescription;
    }

    public String getBuyUrl() {
        return buyUrl;
    }

    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    public Map<String, Object> getVariation() {
        return variation;
    }

    public void setVariation(Map<String, Object> variation) {
        this.variation = variation;
    }

    public Enrichment getEnrichment() {
        return enrichment;
    }

    public void setEnrichment(Enrichment enrichment) {
        this.enrichment = enrichment;
    }

    public String getReturnMethod() {
        return returnMethod;
    }

    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
    }

    public Map<String, Object> getHandling() {
        return handling;
    }

    public void setHandling(Map<String, Object> handling) {
        this.handling = handling;
    }

    public RecallCompliance getRecallCompliance() {
        return recallCompliance;
    }

    public void setRecallCompliance(RecallCompliance recallCompliance) {
        this.recallCompliance = recallCompliance;
    }

    public TaxCategory getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(TaxCategory taxCategory) {
        this.taxCategory = taxCategory;
    }

    public DisplayOption getDisplayOption() {
        return displayOption;
    }

    public void setDisplayOption(DisplayOption displayOption) {
        this.displayOption = displayOption;
    }

    public Fulfillment getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public PackageDimensions getPackageDimensions() {
        return packageDimensions;
    }

    public void setPackageDimensions(PackageDimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }

    public EnvironmentalSegmentation getEnvironmentalSegmentation() {
        return environmentalSegmentation;
    }

    public void setEnvironmentalSegmentation(EnvironmentalSegmentation environmentalSegmentation) {
        this.environmentalSegmentation = environmentalSegmentation;
    }

    public Map<String, Object> getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Map<String, Object> manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<ProductVendor> getProductVendors() {
        return productVendors;
    }

    public void setProductVendors(List<ProductVendor> productVendors) {
        this.productVendors = productVendors;
    }

    public ProductClassification getProductClassification() {
        return productClassification;
    }

    public void setProductClassification(ProductClassification productClassification) {
        this.productClassification = productClassification;
    }

    public ProductBrand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(ProductBrand productBrand) {
        this.productBrand = productBrand;
    }

    public String getItemState() {
        return itemState;
    }

    public void setItemState(String itemState) {
        this.itemState = itemState;
    }

    public Object getSpecifications() {
        return specifications;
    }

    public void setSpecifications(Object specifications) {
        this.specifications = specifications;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getRelationshipTypeCode() {
        return relationshipTypeCode;
    }

    public void setRelationshipTypeCode(String relationshipTypeCode) {
        this.relationshipTypeCode = relationshipTypeCode;
    }

    public Boolean getSubscriptionEligible() {
        return subscriptionEligible;
    }

    public void setSubscriptionEligible(Boolean subscriptionEligible) {
        this.subscriptionEligible = subscriptionEligible;
    }

    public Object getRibbons() {
        return ribbons;
    }

    public void setRibbons(Object ribbons) {
        this.ribbons = ribbons;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Character geteStoreItemStatusCode() {
        return eStoreItemStatusCode;
    }

    public void seteStoreItemStatusCode(Character eStoreItemStatusCode) {
        this.eStoreItemStatusCode = eStoreItemStatusCode;
    }

    public Boolean getProposition65() {
        return isProposition65;
    }

    public void setProposition65(Boolean proposition65) {
        isProposition65 = proposition65;
    }

    public ReturnPolicies getReturnPolicies() {
        return returnPolicies;
    }

    public void setReturnPolicies(ReturnPolicies returnPolicies) {
        this.returnPolicies = returnPolicies;
    }

    public Boolean getGiftingEnabled() {
        return giftingEnabled;
    }

    public void setGiftingEnabled(Boolean giftingEnabled) {
        this.giftingEnabled = giftingEnabled;
    }
}
