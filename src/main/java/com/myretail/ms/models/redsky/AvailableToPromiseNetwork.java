package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Map;

public class AvailableToPromiseNetwork {
    @JsonProperty("product_id")
    private Integer productId;
    @JsonProperty("id_type")
    private String idType;
    @JsonProperty("available_to_promise_quantity")
    private String availableToPromiseQuantity;
    @JsonProperty("street_date")
    private String streetDate;
    @JsonProperty("availability")
    private String availability;
    @JsonProperty("online_available_to_promise_quantity")
    private Integer onlineAvailableToPromiseQuantity;
    @JsonProperty("stores_available_to_promise_quantity")
    private Integer storesAvailableToPromiseQuantity;
    @JsonProperty("availability_status")
    private String availabilityStatus;
    @JsonProperty("multichannel_options")
    private Object multichannelOptions;
    @JsonProperty("is_infinite_inventory")
    private Boolean isInfiniteInventory;
    @JsonProperty("loyalty_availability_status")
    private String loyaltyAvailabilityStatus;
    @JsonProperty("loyalty_purchase_start_date_time")
    private String loyaltyPurchaseStartDateTime;
    @JsonProperty("is_loyalty_purchase_enabled")
    private Boolean isLoyaltyPurchaseEnabled;
    @JsonProperty("is_out_of_stock_in_all_store_locations")
    private Boolean isOutOfStockInAllStoreLocations;
    @JsonProperty("is_out_of_stock_in_all_online_locations")
    private Boolean isOutOfStockInAllOnlineLocations;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getAvailableToPromiseQuantity() {
        return availableToPromiseQuantity;
    }

    public void setAvailableToPromiseQuantity(String availableToPromiseQuantity) {
        this.availableToPromiseQuantity = availableToPromiseQuantity;
    }

    public String getStreetDate() {
        return streetDate;
    }

    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Integer getOnlineAvailableToPromiseQuantity() {
        return onlineAvailableToPromiseQuantity;
    }

    public void setOnlineAvailableToPromiseQuantity(Integer onlineAvailableToPromiseQuantity) {
        this.onlineAvailableToPromiseQuantity = onlineAvailableToPromiseQuantity;
    }

    public Integer getStoresAvailableToPromiseQuantity() {
        return storesAvailableToPromiseQuantity;
    }

    public void setStoresAvailableToPromiseQuantity(Integer storesAvailableToPromiseQuantity) {
        this.storesAvailableToPromiseQuantity = storesAvailableToPromiseQuantity;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public Object getMultichannelOptions() {
        return multichannelOptions;
    }

    public void setMultichannelOptions(Object multichannelOptions) {
        this.multichannelOptions = multichannelOptions;
    }

    public Boolean getInfiniteInventory() {
        return isInfiniteInventory;
    }

    public void setInfiniteInventory(Boolean infiniteInventory) {
        isInfiniteInventory = infiniteInventory;
    }

    public String getLoyaltyAvailabilityStatus() {
        return loyaltyAvailabilityStatus;
    }

    public void setLoyaltyAvailabilityStatus(String loyaltyAvailabilityStatus) {
        this.loyaltyAvailabilityStatus = loyaltyAvailabilityStatus;
    }

    public String getLoyaltyPurchaseStartDateTime() {
        return loyaltyPurchaseStartDateTime;
    }

    public void setLoyaltyPurchaseStartDateTime(String loyaltyPurchaseStartDateTime) {
        this.loyaltyPurchaseStartDateTime = loyaltyPurchaseStartDateTime;
    }

    public Boolean getLoyaltyPurchaseEnabled() {
        return isLoyaltyPurchaseEnabled;
    }

    public void setLoyaltyPurchaseEnabled(Boolean loyaltyPurchaseEnabled) {
        isLoyaltyPurchaseEnabled = loyaltyPurchaseEnabled;
    }

    public Boolean getOutOfStockInAllStoreLocations() {
        return isOutOfStockInAllStoreLocations;
    }

    public void setOutOfStockInAllStoreLocations(Boolean outOfStockInAllStoreLocations) {
        isOutOfStockInAllStoreLocations = outOfStockInAllStoreLocations;
    }

    public Boolean getOutOfStockInAllOnlineLocations() {
        return isOutOfStockInAllOnlineLocations;
    }

    public void setOutOfStockInAllOnlineLocations(Boolean outOfStockInAllOnlineLocations) {
        isOutOfStockInAllOnlineLocations = outOfStockInAllOnlineLocations;
    }
}
