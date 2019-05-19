package com.myretail.ms.models.redsky;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes {
    @JsonProperty("gift_wrapable")
    private Character giftWrapAble;
    @JsonProperty("has_prop65")
    private Character hasProp65;
    @JsonProperty("is_hazmat")
    private Character isHazmat;
    @JsonProperty("max_order_qty")
    private Integer maxOrderQty;
    @JsonProperty("street_date")
    private String streetDate;
    @JsonProperty("media_format")
    private String mediaFormat;
    @JsonProperty("merch_class")
    private String merchantClass;
    @JsonProperty("merch_classid")
    private Integer merchantClassId;
    @JsonProperty("merch_subclass")
    private Integer merchantSubclass;
    @JsonProperty("return_method")
    private String returnMethod;

    public Character getGiftWrapAble() {
        return giftWrapAble;
    }

    public void setGiftWrapAble(Character giftWrapAble) {
        this.giftWrapAble = giftWrapAble;
    }

    public Character getHasProp65() {
        return hasProp65;
    }

    public void setHasProp65(Character hasProp65) {
        this.hasProp65 = hasProp65;
    }

    public Character getIsHazmat() {
        return isHazmat;
    }

    public void setIsHazmat(Character isHazmat) {
        this.isHazmat = isHazmat;
    }

    public Integer getMaxOrderQty() {
        return maxOrderQty;
    }

    public void setMaxOrderQty(Integer maxOrderQty) {
        this.maxOrderQty = maxOrderQty;
    }

    public String getStreetDate() {
        return streetDate;
    }

    public void setStreetDate(String streetDate) {
        this.streetDate = streetDate;
    }

    public String getMediaFormat() {
        return mediaFormat;
    }

    public void setMediaFormat(String mediaFormat) {
        this.mediaFormat = mediaFormat;
    }

    public String getMerchantClass() {
        return merchantClass;
    }

    public void setMerchantClass(String merchantClass) {
        this.merchantClass = merchantClass;
    }

    public Integer getMerchantClassId() {
        return merchantClassId;
    }

    public void setMerchantClassId(Integer merchantClassId) {
        this.merchantClassId = merchantClassId;
    }

    public Integer getMerchantSubclass() {
        return merchantSubclass;
    }

    public void setMerchantSubclass(Integer merchantSubclass) {
        this.merchantSubclass = merchantSubclass;
    }

    public String getReturnMethod() {
        return returnMethod;
    }

    public void setReturnMethod(String returnMethod) {
        this.returnMethod = returnMethod;
    }
}
