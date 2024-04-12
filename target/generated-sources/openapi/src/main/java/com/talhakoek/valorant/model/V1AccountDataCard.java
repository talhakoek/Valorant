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


public class V1AccountDataCard  {
  
  @JsonbProperty("small")
  private String small;

  @JsonbProperty("large")
  private String large;

  @JsonbProperty("wide")
  private String wide;

  @JsonbProperty("id")
  private String id;

 /**
   * Get small
   * @return small
  **/
  public String getSmall() {
    return small;
  }

  /**
    * Set small
  **/
  public void setSmall(String small) {
    this.small = small;
  }

  public V1AccountDataCard small(String small) {
    this.small = small;
    return this;
  }

 /**
   * Get large
   * @return large
  **/
  public String getLarge() {
    return large;
  }

  /**
    * Set large
  **/
  public void setLarge(String large) {
    this.large = large;
  }

  public V1AccountDataCard large(String large) {
    this.large = large;
    return this;
  }

 /**
   * Get wide
   * @return wide
  **/
  public String getWide() {
    return wide;
  }

  /**
    * Set wide
  **/
  public void setWide(String wide) {
    this.wide = wide;
  }

  public V1AccountDataCard wide(String wide) {
    this.wide = wide;
    return this;
  }

 /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  /**
    * Set id
  **/
  public void setId(String id) {
    this.id = id;
  }

  public V1AccountDataCard id(String id) {
    this.id = id;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1AccountDataCard {\n");
    
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
    sb.append("    wide: ").append(toIndentedString(wide)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

