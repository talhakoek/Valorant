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


public class MatchAssistants  {
  
  @JsonbProperty("assistant_puuid")
  private String assistantPuuid;

  @JsonbProperty("assistant_display_name")
  private String assistantDisplayName;

  @JsonbProperty("assistant_team")
  private String assistantTeam;

 /**
   * Get assistantPuuid
   * @return assistantPuuid
  **/
  public String getAssistantPuuid() {
    return assistantPuuid;
  }

  /**
    * Set assistantPuuid
  **/
  public void setAssistantPuuid(String assistantPuuid) {
    this.assistantPuuid = assistantPuuid;
  }

  public MatchAssistants assistantPuuid(String assistantPuuid) {
    this.assistantPuuid = assistantPuuid;
    return this;
  }

 /**
   * Get assistantDisplayName
   * @return assistantDisplayName
  **/
  public String getAssistantDisplayName() {
    return assistantDisplayName;
  }

  /**
    * Set assistantDisplayName
  **/
  public void setAssistantDisplayName(String assistantDisplayName) {
    this.assistantDisplayName = assistantDisplayName;
  }

  public MatchAssistants assistantDisplayName(String assistantDisplayName) {
    this.assistantDisplayName = assistantDisplayName;
    return this;
  }

 /**
   * Get assistantTeam
   * @return assistantTeam
  **/
  public String getAssistantTeam() {
    return assistantTeam;
  }

  /**
    * Set assistantTeam
  **/
  public void setAssistantTeam(String assistantTeam) {
    this.assistantTeam = assistantTeam;
  }

  public MatchAssistants assistantTeam(String assistantTeam) {
    this.assistantTeam = assistantTeam;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchAssistants {\n");
    
    sb.append("    assistantPuuid: ").append(toIndentedString(assistantPuuid)).append("\n");
    sb.append("    assistantDisplayName: ").append(toIndentedString(assistantDisplayName)).append("\n");
    sb.append("    assistantTeam: ").append(toIndentedString(assistantTeam)).append("\n");
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

