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

import com.talhakoek.valorant.model.V1PremierSeasonData;
import java.math.BigDecimal;
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


public class V1PremierSeason  {
  
  @JsonbProperty("status")
  private BigDecimal status;

  @JsonbProperty("data")
  private List<V1PremierSeasonData> data = null;

 /**
   * Get status
   * @return status
  **/
  public BigDecimal getStatus() {
    return status;
  }

  /**
    * Set status
  **/
  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public V1PremierSeason status(BigDecimal status) {
    this.status = status;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  public List<V1PremierSeasonData> getData() {
    return data;
  }

  /**
    * Set data
  **/
  public void setData(List<V1PremierSeasonData> data) {
    this.data = data;
  }

  public V1PremierSeason data(List<V1PremierSeasonData> data) {
    this.data = data;
    return this;
  }

  public V1PremierSeason addDataItem(V1PremierSeasonData dataItem) {
    this.data.add(dataItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PremierSeason {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

