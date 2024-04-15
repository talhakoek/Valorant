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


public class MatchAbilityCasts  {
  
  @JsonbProperty("c_casts")
  private Integer cCasts;

  @JsonbProperty("q_casts")
  private Integer qCasts;

  @JsonbProperty("e_casts")
  private Integer eCasts;

  @JsonbProperty("x_casts")
  private Integer xCasts;

 /**
   * Get cCasts
   * @return cCasts
  **/
  public Integer getcCasts() {
    return cCasts;
  }

  /**
    * Set cCasts
  **/
  public void setcCasts(Integer cCasts) {
    this.cCasts = cCasts;
  }

  public MatchAbilityCasts cCasts(Integer cCasts) {
    this.cCasts = cCasts;
    return this;
  }

 /**
   * Get qCasts
   * @return qCasts
  **/
  public Integer getqCasts() {
    return qCasts;
  }

  /**
    * Set qCasts
  **/
  public void setqCasts(Integer qCasts) {
    this.qCasts = qCasts;
  }

  public MatchAbilityCasts qCasts(Integer qCasts) {
    this.qCasts = qCasts;
    return this;
  }

 /**
   * Get eCasts
   * @return eCasts
  **/
  public Integer geteCasts() {
    return eCasts;
  }

  /**
    * Set eCasts
  **/
  public void seteCasts(Integer eCasts) {
    this.eCasts = eCasts;
  }

  public MatchAbilityCasts eCasts(Integer eCasts) {
    this.eCasts = eCasts;
    return this;
  }

 /**
   * Get xCasts
   * @return xCasts
  **/
  public Integer getxCasts() {
    return xCasts;
  }

  /**
    * Set xCasts
  **/
  public void setxCasts(Integer xCasts) {
    this.xCasts = xCasts;
  }

  public MatchAbilityCasts xCasts(Integer xCasts) {
    this.xCasts = xCasts;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchAbilityCasts {\n");
    
    sb.append("    cCasts: ").append(toIndentedString(cCasts)).append("\n");
    sb.append("    qCasts: ").append(toIndentedString(qCasts)).append("\n");
    sb.append("    eCasts: ").append(toIndentedString(eCasts)).append("\n");
    sb.append("    xCasts: ").append(toIndentedString(xCasts)).append("\n");
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
