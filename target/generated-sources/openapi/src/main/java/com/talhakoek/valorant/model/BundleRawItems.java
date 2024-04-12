/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.talhakoek.valorant.model;

import com.talhakoek.valorant.model.BundleRawItem;
import java.math.BigDecimal;

import java.lang.reflect.Type;
import jakarta.json.bind.annotation.JsonbTypeDeserializer;
import jakarta.json.bind.annotation.JsonbTypeSerializer;
import jakarta.json.bind.serializer.DeserializationContext;
import jakarta.json.bind.serializer.JsonbDeserializer;
import jakarta.json.bind.serializer.JsonbSerializer;
import jakarta.json.bind.serializer.SerializationContext;
import jakarta.json.stream.JsonGenerator;
import jakarta.json.stream.JsonParser;
import jakarta.json.bind.annotation.JsonbProperty;


public class BundleRawItems  {
  
  @JsonbProperty("Item")
  private BundleRawItem item;

  @JsonbProperty("BasePrice")
  private Integer basePrice;

  @JsonbProperty("CurrencyID")
  private String currencyID;

  @JsonbProperty("DiscountPercent")
  private BigDecimal discountPercent;

  @JsonbProperty("DiscountedPrice")
  private Integer discountedPrice;

  @JsonbProperty("IsPromoItem")
  private Boolean isPromoItem;

 /**
   * Get item
   * @return item
  **/
  public BundleRawItem getItem() {
    return item;
  }

  /**
    * Set item
  **/
  public void setItem(BundleRawItem item) {
    this.item = item;
  }

  public BundleRawItems item(BundleRawItem item) {
    this.item = item;
    return this;
  }

 /**
   * Get basePrice
   * @return basePrice
  **/
  public Integer getBasePrice() {
    return basePrice;
  }

  /**
    * Set basePrice
  **/
  public void setBasePrice(Integer basePrice) {
    this.basePrice = basePrice;
  }

  public BundleRawItems basePrice(Integer basePrice) {
    this.basePrice = basePrice;
    return this;
  }

 /**
   * Get currencyID
   * @return currencyID
  **/
  public String getCurrencyID() {
    return currencyID;
  }

  /**
    * Set currencyID
  **/
  public void setCurrencyID(String currencyID) {
    this.currencyID = currencyID;
  }

  public BundleRawItems currencyID(String currencyID) {
    this.currencyID = currencyID;
    return this;
  }

 /**
   * Get discountPercent
   * @return discountPercent
  **/
  public BigDecimal getDiscountPercent() {
    return discountPercent;
  }

  /**
    * Set discountPercent
  **/
  public void setDiscountPercent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
  }

  public BundleRawItems discountPercent(BigDecimal discountPercent) {
    this.discountPercent = discountPercent;
    return this;
  }

 /**
   * Get discountedPrice
   * @return discountedPrice
  **/
  public Integer getDiscountedPrice() {
    return discountedPrice;
  }

  /**
    * Set discountedPrice
  **/
  public void setDiscountedPrice(Integer discountedPrice) {
    this.discountedPrice = discountedPrice;
  }

  public BundleRawItems discountedPrice(Integer discountedPrice) {
    this.discountedPrice = discountedPrice;
    return this;
  }

 /**
   * Get isPromoItem
   * @return isPromoItem
  **/
  public Boolean getIsPromoItem() {
    return isPromoItem;
  }

  /**
    * Set isPromoItem
  **/
  public void setIsPromoItem(Boolean isPromoItem) {
    this.isPromoItem = isPromoItem;
  }

  public BundleRawItems isPromoItem(Boolean isPromoItem) {
    this.isPromoItem = isPromoItem;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleRawItems {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    currencyID: ").append(toIndentedString(currencyID)).append("\n");
    sb.append("    discountPercent: ").append(toIndentedString(discountPercent)).append("\n");
    sb.append("    discountedPrice: ").append(toIndentedString(discountedPrice)).append("\n");
    sb.append("    isPromoItem: ").append(toIndentedString(isPromoItem)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

