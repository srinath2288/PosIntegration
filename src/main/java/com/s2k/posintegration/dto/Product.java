
package com.s2k.posintegration.dto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"title",
"body_html",
"vendor",
"product_type",
"created_at",
"handle",
"updated_at",
"published_at",
"template_suffix",
"published_scope",
"tags",
"variants",
"options",
"images",
"image"
})
public class Product {

@JsonProperty("id")
private Integer id;
@JsonProperty("title")
private String title;
@JsonProperty("body_html")
private String bodyHtml;
@JsonProperty("vendor")
private String vendor;
@JsonProperty("product_type")
private String productType;
@JsonProperty("created_at")
private String createdAt;
@JsonProperty("handle")
private String handle;
@JsonProperty("updated_at")
private String updatedAt;
@JsonProperty("published_at")
private Object publishedAt;
@JsonProperty("template_suffix")
private Object templateSuffix;
@JsonProperty("published_scope")
private String publishedScope;
@JsonProperty("tags")
private String tags;
@JsonProperty("variants")
private List<Variant> variants = null;
@JsonProperty("options")
private List<Option> options = null;
@JsonProperty("images")
private List<Image> images = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The id
*/
@JsonProperty("id")
public Integer getId() {
return id;
}

/**
* 
* @param id
* The id
*/
@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

/**
* 
* @return
* The title
*/
@JsonProperty("title")
public String getTitle() {
return title;
}

/**
* 
* @param title
* The title
*/
@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

/**
* 
* @return
* The bodyHtml
*/
@JsonProperty("body_html")
public String getBodyHtml() {
return bodyHtml;
}

/**
* 
* @param bodyHtml
* The body_html
*/
@JsonProperty("body_html")
public void setBodyHtml(String bodyHtml) {
this.bodyHtml = bodyHtml;
}

/**
* 
* @return
* The vendor
*/
@JsonProperty("vendor")
public String getVendor() {
return vendor;
}

/**
* 
* @param vendor
* The vendor
*/
@JsonProperty("vendor")
public void setVendor(String vendor) {
this.vendor = vendor;
}

/**
* 
* @return
* The productType
*/
@JsonProperty("product_type")
public String getProductType() {
return productType;
}

/**
* 
* @param productType
* The product_type
*/
@JsonProperty("product_type")
public void setProductType(String productType) {
this.productType = productType;
}

/**
* 
* @return
* The createdAt
*/
@JsonProperty("created_at")
public String getCreatedAt() {
return createdAt;
}

/**
* 
* @param createdAt
* The created_at
*/
@JsonProperty("created_at")
public void setCreatedAt(String createdAt) {
this.createdAt = createdAt;
}

/**
* 
* @return
* The handle
*/
@JsonProperty("handle")
public String getHandle() {
return handle;
}

/**
* 
* @param handle
* The handle
*/
@JsonProperty("handle")
public void setHandle(String handle) {
this.handle = handle;
}

/**
* 
* @return
* The updatedAt
*/
@JsonProperty("updated_at")
public String getUpdatedAt() {
return updatedAt;
}

/**
* 
* @param updatedAt
* The updated_at
*/
@JsonProperty("updated_at")
public void setUpdatedAt(String updatedAt) {
this.updatedAt = updatedAt;
}

/**
* 
* @return
* The publishedAt
*/
@JsonProperty("published_at")
public Object getPublishedAt() {
return publishedAt;
}

/**
* 
* @param publishedAt
* The published_at
*/
@JsonProperty("published_at")
public void setPublishedAt(Object publishedAt) {
this.publishedAt = publishedAt;
}

/**
* 
* @return
* The templateSuffix
*/
@JsonProperty("template_suffix")
public Object getTemplateSuffix() {
return templateSuffix;
}

/**
* 
* @param templateSuffix
* The template_suffix
*/
@JsonProperty("template_suffix")
public void setTemplateSuffix(Object templateSuffix) {
this.templateSuffix = templateSuffix;
}

/**
* 
* @return
* The publishedScope
*/
@JsonProperty("published_scope")
public String getPublishedScope() {
return publishedScope;
}

/**
* 
* @param publishedScope
* The published_scope
*/
@JsonProperty("published_scope")
public void setPublishedScope(String publishedScope) {
this.publishedScope = publishedScope;
}

/**
* 
* @return
* The tags
*/
@JsonProperty("tags")
public String getTags() {
return tags;
}

/**
* 
* @param tags
* The tags
*/
@JsonProperty("tags")
public void setTags(String tags) {
this.tags = tags;
}

/**
* 
* @return
* The variants
*/
@JsonProperty("variants")
public List<Variant> getVariants() {
return variants;
}

/**
* 
* @param variants
* The variants
*/
@JsonProperty("variants")
public void setVariants(List<Variant> variants) {
this.variants = variants;
}

/**
* 
* @return
* The options
*/
@JsonProperty("options")
public List<Option> getOptions() {
return options;
}

/**
* 
* @param options
* The options
*/
@JsonProperty("options")
public void setOptions(List<Option> options) {
this.options = options;
}

/**
* 
* @return
* The images
*/
@JsonProperty("images")
public List<Image> getImages() {
return images;
}

/**
* 
* @param images
* The images
*/
@JsonProperty("images")
public void setImages(List<Image> images) {
this.images = images;
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
