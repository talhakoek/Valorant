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

import com.talhakoek.valorant.model.V1QueueStatusMap;

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


public class V1QueueStatusMaps  {
  
  @JsonbProperty("map")
  private V1QueueStatusMap map;

  @JsonbProperty("enabled")
  private Boolean enabled;

 /**
   * Get map
   * @return map
  **/
  public V1QueueStatusMap getMap() {
    return map;
  }

  /**
    * Set map
  **/
  public void setMap(V1QueueStatusMap map) {
    this.map = map;
  }

  public V1QueueStatusMaps map(V1QueueStatusMap map) {
    this.map = map;
    return this;
  }

 /**
   * Get enabled
   * @return enabled
  **/
  public Boolean getEnabled() {
    return enabled;
  }

  /**
    * Set enabled
  **/
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public V1QueueStatusMaps enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1QueueStatusMaps {\n");
    
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

