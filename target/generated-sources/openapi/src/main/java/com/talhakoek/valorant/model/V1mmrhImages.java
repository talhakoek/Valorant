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


public class V1mmrhImages  {
  
  @JsonbProperty("small")
  private String small;

  @JsonbProperty("large")
  private String large;

  @JsonbProperty("triangle_down")
  private String triangleDown;

  @JsonbProperty("triangle_up")
  private String triangleUp;

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

  public V1mmrhImages small(String small) {
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

  public V1mmrhImages large(String large) {
    this.large = large;
    return this;
  }

 /**
   * Get triangleDown
   * @return triangleDown
  **/
  public String getTriangleDown() {
    return triangleDown;
  }

  /**
    * Set triangleDown
  **/
  public void setTriangleDown(String triangleDown) {
    this.triangleDown = triangleDown;
  }

  public V1mmrhImages triangleDown(String triangleDown) {
    this.triangleDown = triangleDown;
    return this;
  }

 /**
   * Get triangleUp
   * @return triangleUp
  **/
  public String getTriangleUp() {
    return triangleUp;
  }

  /**
    * Set triangleUp
  **/
  public void setTriangleUp(String triangleUp) {
    this.triangleUp = triangleUp;
  }

  public V1mmrhImages triangleUp(String triangleUp) {
    this.triangleUp = triangleUp;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1mmrhImages {\n");
    
    sb.append("    small: ").append(toIndentedString(small)).append("\n");
    sb.append("    large: ").append(toIndentedString(large)).append("\n");
    sb.append("    triangleDown: ").append(toIndentedString(triangleDown)).append("\n");
    sb.append("    triangleUp: ").append(toIndentedString(triangleUp)).append("\n");
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

