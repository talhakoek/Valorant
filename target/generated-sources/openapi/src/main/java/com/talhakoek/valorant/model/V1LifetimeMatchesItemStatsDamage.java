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


public class V1LifetimeMatchesItemStatsDamage  {
  
  @JsonbProperty("made")
  private BigDecimal made;

  @JsonbProperty("received")
  private BigDecimal received;

 /**
   * Get made
   * @return made
  **/
  public BigDecimal getMade() {
    return made;
  }

  /**
    * Set made
  **/
  public void setMade(BigDecimal made) {
    this.made = made;
  }

  public V1LifetimeMatchesItemStatsDamage made(BigDecimal made) {
    this.made = made;
    return this;
  }

 /**
   * Get received
   * @return received
  **/
  public BigDecimal getReceived() {
    return received;
  }

  /**
    * Set received
  **/
  public void setReceived(BigDecimal received) {
    this.received = received;
  }

  public V1LifetimeMatchesItemStatsDamage received(BigDecimal received) {
    this.received = received;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LifetimeMatchesItemStatsDamage {\n");
    
    sb.append("    made: ").append(toIndentedString(made)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
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
