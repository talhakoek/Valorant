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


public class InlineResponse2003Data  {
  
  @JsonbProperty("maintenances")
  private List<Object> maintenances = null;

  @JsonbProperty("incidents")
  private List<Object> incidents = null;

 /**
   * Get maintenances
   * @return maintenances
  **/
  public List<Object> getMaintenances() {
    return maintenances;
  }

  /**
    * Set maintenances
  **/
  public void setMaintenances(List<Object> maintenances) {
    this.maintenances = maintenances;
  }

  public InlineResponse2003Data maintenances(List<Object> maintenances) {
    this.maintenances = maintenances;
    return this;
  }

  public InlineResponse2003Data addMaintenancesItem(Object maintenancesItem) {
    this.maintenances.add(maintenancesItem);
    return this;
  }

 /**
   * Get incidents
   * @return incidents
  **/
  public List<Object> getIncidents() {
    return incidents;
  }

  /**
    * Set incidents
  **/
  public void setIncidents(List<Object> incidents) {
    this.incidents = incidents;
  }

  public InlineResponse2003Data incidents(List<Object> incidents) {
    this.incidents = incidents;
    return this;
  }

  public InlineResponse2003Data addIncidentsItem(Object incidentsItem) {
    this.incidents.add(incidentsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Data {\n");
    
    sb.append("    maintenances: ").append(toIndentedString(maintenances)).append("\n");
    sb.append("    incidents: ").append(toIndentedString(incidents)).append("\n");
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
