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

import com.talhakoek.valorant.model.V1mmrhData;
import java.util.ArrayList;
import java.util.List;

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


public class V1mmrh  {
  
  @JsonbProperty("status")
  private Integer status;

  @JsonbProperty("name")
  private String name;

  @JsonbProperty("tag")
  private String tag;

  @JsonbProperty("data")
  private List<V1mmrhData> data = null;

 /**
   * Get status
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  /**
    * Set status
  **/
  public void setStatus(Integer status) {
    this.status = status;
  }

  public V1mmrh status(Integer status) {
    this.status = status;
    return this;
  }

 /**
   * Get name
   * @return name
  **/
  public String getName() {
    return name;
  }

  /**
    * Set name
  **/
  public void setName(String name) {
    this.name = name;
  }

  public V1mmrh name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get tag
   * @return tag
  **/
  public String getTag() {
    return tag;
  }

  /**
    * Set tag
  **/
  public void setTag(String tag) {
    this.tag = tag;
  }

  public V1mmrh tag(String tag) {
    this.tag = tag;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  public List<V1mmrhData> getData() {
    return data;
  }

  /**
    * Set data
  **/
  public void setData(List<V1mmrhData> data) {
    this.data = data;
  }

  public V1mmrh data(List<V1mmrhData> data) {
    this.data = data;
    return this;
  }

  public V1mmrh addDataItem(V1mmrhData dataItem) {
    this.data.add(dataItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1mmrh {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
