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

import com.talhakoek.valorant.model.V1esportscheduleitemMatchRecord;

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


public class V1esportscheduleitemMatchTeams  {
  
  @JsonbProperty("name")
  private String name;

  @JsonbProperty("code")
  private String code;

  @JsonbProperty("icon")
  private String icon;

  @JsonbProperty("has_won")
  private Boolean hasWon;

  @JsonbProperty("game_wins")
  private Integer gameWins;

  @JsonbProperty("record")
  private V1esportscheduleitemMatchRecord record;

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

  public V1esportscheduleitemMatchTeams name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  public String getCode() {
    return code;
  }

  /**
    * Set code
  **/
  public void setCode(String code) {
    this.code = code;
  }

  public V1esportscheduleitemMatchTeams code(String code) {
    this.code = code;
    return this;
  }

 /**
   * Get icon
   * @return icon
  **/
  public String getIcon() {
    return icon;
  }

  /**
    * Set icon
  **/
  public void setIcon(String icon) {
    this.icon = icon;
  }

  public V1esportscheduleitemMatchTeams icon(String icon) {
    this.icon = icon;
    return this;
  }

 /**
   * Get hasWon
   * @return hasWon
  **/
  public Boolean getHasWon() {
    return hasWon;
  }

  /**
    * Set hasWon
  **/
  public void setHasWon(Boolean hasWon) {
    this.hasWon = hasWon;
  }

  public V1esportscheduleitemMatchTeams hasWon(Boolean hasWon) {
    this.hasWon = hasWon;
    return this;
  }

 /**
   * Get gameWins
   * @return gameWins
  **/
  public Integer getGameWins() {
    return gameWins;
  }

  /**
    * Set gameWins
  **/
  public void setGameWins(Integer gameWins) {
    this.gameWins = gameWins;
  }

  public V1esportscheduleitemMatchTeams gameWins(Integer gameWins) {
    this.gameWins = gameWins;
    return this;
  }

 /**
   * Get record
   * @return record
  **/
  public V1esportscheduleitemMatchRecord getRecord() {
    return record;
  }

  /**
    * Set record
  **/
  public void setRecord(V1esportscheduleitemMatchRecord record) {
    this.record = record;
  }

  public V1esportscheduleitemMatchTeams record(V1esportscheduleitemMatchRecord record) {
    this.record = record;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1esportscheduleitemMatchTeams {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    hasWon: ").append(toIndentedString(hasWon)).append("\n");
    sb.append("    gameWins: ").append(toIndentedString(gameWins)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
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

