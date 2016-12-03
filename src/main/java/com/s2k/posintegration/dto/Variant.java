
package com.s2k.posintegration.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "product_id",
    "title",
    "price",
    "sku",
    "position",
    "grams",
    "inventory_policy",
    "compare_at_price",
    "fulfillment_service",
    "inventory_management",
    "option1",
    "option2",
    "option3",
    "created_at",
    "updated_at",
    "taxable",
    "barcode",
    "image_id",
    "inventory_quantity",
    "weight",
    "weight_unit",
    "old_inventory_quantity",
    "requires_shipping"
})
public class Variant {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("product_id")
    private Integer productId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("price")
    private String price;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("grams")
    private Integer grams;
    @JsonProperty("inventory_policy")
    private String inventoryPolicy;
    @JsonProperty("compare_at_price")
    private Object compareAtPrice;
    @JsonProperty("fulfillment_service")
    private String fulfillmentService;
    @JsonProperty("inventory_management")
    private Object inventoryManagement;
    @JsonProperty("option1")
    private String option1;
    @JsonProperty("option2")
    private Object option2;
    @JsonProperty("option3")
    private Object option3;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("taxable")
    private Boolean taxable;
    @JsonProperty("barcode")
    private String barcode;
    @JsonProperty("image_id")
    private Object imageId;
    @JsonProperty("inventory_quantity")
    private Integer inventoryQuantity;
    @JsonProperty("weight")
    private Integer weight;
    @JsonProperty("weight_unit")
    private String weightUnit;
    @JsonProperty("old_inventory_quantity")
    private Integer oldInventoryQuantity;
    @JsonProperty("requires_shipping")
    private Boolean requiresShipping;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The productId
     */
    @JsonProperty("product_id")
    public Integer getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The product_id
     */
    @JsonProperty("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The price
     */
    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The sku
     */
    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    /**
     * 
     * @param sku
     *     The sku
     */
    @JsonProperty("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * 
     * @return
     *     The position
     */
    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    /**
     * 
     * @return
     *     The grams
     */
    @JsonProperty("grams")
    public Integer getGrams() {
        return grams;
    }

    /**
     * 
     * @param grams
     *     The grams
     */
    @JsonProperty("grams")
    public void setGrams(Integer grams) {
        this.grams = grams;
    }

    /**
     * 
     * @return
     *     The inventoryPolicy
     */
    @JsonProperty("inventory_policy")
    public String getInventoryPolicy() {
        return inventoryPolicy;
    }

    /**
     * 
     * @param inventoryPolicy
     *     The inventory_policy
     */
    @JsonProperty("inventory_policy")
    public void setInventoryPolicy(String inventoryPolicy) {
        this.inventoryPolicy = inventoryPolicy;
    }

    /**
     * 
     * @return
     *     The compareAtPrice
     */
    @JsonProperty("compare_at_price")
    public Object getCompareAtPrice() {
        return compareAtPrice;
    }

    /**
     * 
     * @param compareAtPrice
     *     The compare_at_price
     */
    @JsonProperty("compare_at_price")
    public void setCompareAtPrice(Object compareAtPrice) {
        this.compareAtPrice = compareAtPrice;
    }

    /**
     * 
     * @return
     *     The fulfillmentService
     */
    @JsonProperty("fulfillment_service")
    public String getFulfillmentService() {
        return fulfillmentService;
    }

    /**
     * 
     * @param fulfillmentService
     *     The fulfillment_service
     */
    @JsonProperty("fulfillment_service")
    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    /**
     * 
     * @return
     *     The inventoryManagement
     */
    @JsonProperty("inventory_management")
    public Object getInventoryManagement() {
        return inventoryManagement;
    }

    /**
     * 
     * @param inventoryManagement
     *     The inventory_management
     */
    @JsonProperty("inventory_management")
    public void setInventoryManagement(Object inventoryManagement) {
        this.inventoryManagement = inventoryManagement;
    }

    /**
     * 
     * @return
     *     The option1
     */
    @JsonProperty("option1")
    public String getOption1() {
        return option1;
    }

    /**
     * 
     * @param option1
     *     The option1
     */
    @JsonProperty("option1")
    public void setOption1(String option1) {
        this.option1 = option1;
    }

    /**
     * 
     * @return
     *     The option2
     */
    @JsonProperty("option2")
    public Object getOption2() {
        return option2;
    }

    /**
     * 
     * @param option2
     *     The option2
     */
    @JsonProperty("option2")
    public void setOption2(Object option2) {
        this.option2 = option2;
    }

    /**
     * 
     * @return
     *     The option3
     */
    @JsonProperty("option3")
    public Object getOption3() {
        return option3;
    }

    /**
     * 
     * @param option3
     *     The option3
     */
    @JsonProperty("option3")
    public void setOption3(Object option3) {
        this.option3 = option3;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * @return
     *     The taxable
     */
    @JsonProperty("taxable")
    public Boolean getTaxable() {
        return taxable;
    }

    /**
     * 
     * @param taxable
     *     The taxable
     */
    @JsonProperty("taxable")
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    /**
     * 
     * @return
     *     The barcode
     */
    @JsonProperty("barcode")
    public String getBarcode() {
        return barcode;
    }

    /**
     * 
     * @param barcode
     *     The barcode
     */
    @JsonProperty("barcode")
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * 
     * @return
     *     The imageId
     */
    @JsonProperty("image_id")
    public Object getImageId() {
        return imageId;
    }

    /**
     * 
     * @param imageId
     *     The image_id
     */
    @JsonProperty("image_id")
    public void setImageId(Object imageId) {
        this.imageId = imageId;
    }

    /**
     * 
     * @return
     *     The inventoryQuantity
     */
    @JsonProperty("inventory_quantity")
    public Integer getInventoryQuantity() {
        return inventoryQuantity;
    }

    /**
     * 
     * @param inventoryQuantity
     *     The inventory_quantity
     */
    @JsonProperty("inventory_quantity")
    public void setInventoryQuantity(Integer inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    /**
     * 
     * @return
     *     The weight
     */
    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The weightUnit
     */
    @JsonProperty("weight_unit")
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * 
     * @param weightUnit
     *     The weight_unit
     */
    @JsonProperty("weight_unit")
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    /**
     * 
     * @return
     *     The oldInventoryQuantity
     */
    @JsonProperty("old_inventory_quantity")
    public Integer getOldInventoryQuantity() {
        return oldInventoryQuantity;
    }

    /**
     * 
     * @param oldInventoryQuantity
     *     The old_inventory_quantity
     */
    @JsonProperty("old_inventory_quantity")
    public void setOldInventoryQuantity(Integer oldInventoryQuantity) {
        this.oldInventoryQuantity = oldInventoryQuantity;
    }

    /**
     * 
     * @return
     *     The requiresShipping
     */
    @JsonProperty("requires_shipping")
    public Boolean getRequiresShipping() {
        return requiresShipping;
    }

    /**
     * 
     * @param requiresShipping
     *     The requires_shipping
     */
    @JsonProperty("requires_shipping")
    public void setRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
