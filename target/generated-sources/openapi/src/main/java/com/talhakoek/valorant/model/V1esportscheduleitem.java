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

import com.talhakoek.valorant.model.V1esportscheduleitemLeague;
import com.talhakoek.valorant.model.V1esportscheduleitemMatch;
import com.talhakoek.valorant.model.V1esportscheduleitemTournament;

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


public class V1esportscheduleitem  {
  
  @JsonbProperty("date")
  private String date;

  @JsonbProperty("state")
  private String state;

  @JsonbProperty("type")
  private String type;

  @JsonbProperty("vod")
  private String vod;

  @JsonbProperty("league")
  private V1esportscheduleitemLeague league;

  @JsonbProperty("tournament")
  private V1esportscheduleitemTournament tournament;

  @JsonbProperty("match")
  private V1esportscheduleitemMatch match;

 /**
   * Get date
   * @return date
  **/
  public String getDate() {
    return date;
  }

  /**
    * Set date
  **/
  public void setDate(String date) {
    this.date = date;
  }

  public V1esportscheduleitem date(String date) {
    this.date = date;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  public String getState() {
    return state;
  }

  /**
    * Set state
  **/
  public void setState(String state) {
    this.state = state;
  }

  public V1esportscheduleitem state(String state) {
    this.state = state;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(String type) {
    this.type = type;
  }

  public V1esportscheduleitem type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get vod
   * @return vod
  **/
  public String getVod() {
    return vod;
  }

  /**
    * Set vod
  **/
  public void setVod(String vod) {
    this.vod = vod;
  }

  public V1esportscheduleitem vod(String vod) {
    this.vod = vod;
    return this;
  }

 /**
   * Get league
   * @return league
  **/
  public V1esportscheduleitemLeague getLeague() {
    return league;
  }

  /**
    * Set league
  **/
  public void setLeague(V1esportscheduleitemLeague league) {
    this.league = league;
  }

  public V1esportscheduleitem league(V1esportscheduleitemLeague league) {
    this.league = league;
    return this;
  }

 /**
   * Get tournament
   * @return tournament
  **/
  public V1esportscheduleitemTournament getTournament() {
    return tournament;
  }

  /**
    * Set tournament
  **/
  public void setTournament(V1esportscheduleitemTournament tournament) {
    this.tournament = tournament;
  }

  public V1esportscheduleitem tournament(V1esportscheduleitemTournament tournament) {
    this.tournament = tournament;
    return this;
  }

 /**
   * Get match
   * @return match
  **/
  public V1esportscheduleitemMatch getMatch() {
    return match;
  }

  /**
    * Set match
  **/
  public void setMatch(V1esportscheduleitemMatch match) {
    this.match = match;
  }

  public V1esportscheduleitem match(V1esportscheduleitemMatch match) {
    this.match = match;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1esportscheduleitem {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vod: ").append(toIndentedString(vod)).append("\n");
    sb.append("    league: ").append(toIndentedString(league)).append("\n");
    sb.append("    tournament: ").append(toIndentedString(tournament)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
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

