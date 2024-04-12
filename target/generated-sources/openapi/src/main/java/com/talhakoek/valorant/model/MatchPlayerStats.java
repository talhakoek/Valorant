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

import com.talhakoek.valorant.model.MatchAbilityCasts;
import com.talhakoek.valorant.model.MatchDamageEvents;
import com.talhakoek.valorant.model.MatchEconomy;
import com.talhakoek.valorant.model.MatchKillEvents;
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


public class MatchPlayerStats  {
  
  @JsonbProperty("ability_casts")
  private MatchAbilityCasts abilityCasts;

  @JsonbProperty("player_puuid")
  private String playerPuuid;

  @JsonbProperty("player_display_name")
  private String playerDisplayName;

  @JsonbProperty("player_team")
  private String playerTeam;

  @JsonbProperty("damage_events")
  private List<MatchDamageEvents> damageEvents = null;

  @JsonbProperty("damage")
  private Integer damage;

  @JsonbProperty("bodyshots")
  private Integer bodyshots;

  @JsonbProperty("headshots")
  private Integer headshots;

  @JsonbProperty("legshots")
  private Integer legshots;

  @JsonbProperty("kill_events")
  private List<MatchKillEvents> killEvents = null;

  @JsonbProperty("kills")
  private Integer kills;

  @JsonbProperty("score")
  private Integer score;

  @JsonbProperty("economy")
  private MatchEconomy economy;

  @JsonbProperty("was_afk")
  private Boolean wasAfk;

  @JsonbProperty("was_penalized")
  private Boolean wasPenalized;

  @JsonbProperty("stayed_in_spawn")
  private Boolean stayedInSpawn;

 /**
   * Get abilityCasts
   * @return abilityCasts
  **/
  public MatchAbilityCasts getAbilityCasts() {
    return abilityCasts;
  }

  /**
    * Set abilityCasts
  **/
  public void setAbilityCasts(MatchAbilityCasts abilityCasts) {
    this.abilityCasts = abilityCasts;
  }

  public MatchPlayerStats abilityCasts(MatchAbilityCasts abilityCasts) {
    this.abilityCasts = abilityCasts;
    return this;
  }

 /**
   * Get playerPuuid
   * @return playerPuuid
  **/
  public String getPlayerPuuid() {
    return playerPuuid;
  }

  /**
    * Set playerPuuid
  **/
  public void setPlayerPuuid(String playerPuuid) {
    this.playerPuuid = playerPuuid;
  }

  public MatchPlayerStats playerPuuid(String playerPuuid) {
    this.playerPuuid = playerPuuid;
    return this;
  }

 /**
   * Get playerDisplayName
   * @return playerDisplayName
  **/
  public String getPlayerDisplayName() {
    return playerDisplayName;
  }

  /**
    * Set playerDisplayName
  **/
  public void setPlayerDisplayName(String playerDisplayName) {
    this.playerDisplayName = playerDisplayName;
  }

  public MatchPlayerStats playerDisplayName(String playerDisplayName) {
    this.playerDisplayName = playerDisplayName;
    return this;
  }

 /**
   * Get playerTeam
   * @return playerTeam
  **/
  public String getPlayerTeam() {
    return playerTeam;
  }

  /**
    * Set playerTeam
  **/
  public void setPlayerTeam(String playerTeam) {
    this.playerTeam = playerTeam;
  }

  public MatchPlayerStats playerTeam(String playerTeam) {
    this.playerTeam = playerTeam;
    return this;
  }

 /**
   * Get damageEvents
   * @return damageEvents
  **/
  public List<MatchDamageEvents> getDamageEvents() {
    return damageEvents;
  }

  /**
    * Set damageEvents
  **/
  public void setDamageEvents(List<MatchDamageEvents> damageEvents) {
    this.damageEvents = damageEvents;
  }

  public MatchPlayerStats damageEvents(List<MatchDamageEvents> damageEvents) {
    this.damageEvents = damageEvents;
    return this;
  }

  public MatchPlayerStats addDamageEventsItem(MatchDamageEvents damageEventsItem) {
    this.damageEvents.add(damageEventsItem);
    return this;
  }

 /**
   * Get damage
   * @return damage
  **/
  public Integer getDamage() {
    return damage;
  }

  /**
    * Set damage
  **/
  public void setDamage(Integer damage) {
    this.damage = damage;
  }

  public MatchPlayerStats damage(Integer damage) {
    this.damage = damage;
    return this;
  }

 /**
   * Get bodyshots
   * @return bodyshots
  **/
  public Integer getBodyshots() {
    return bodyshots;
  }

  /**
    * Set bodyshots
  **/
  public void setBodyshots(Integer bodyshots) {
    this.bodyshots = bodyshots;
  }

  public MatchPlayerStats bodyshots(Integer bodyshots) {
    this.bodyshots = bodyshots;
    return this;
  }

 /**
   * Get headshots
   * @return headshots
  **/
  public Integer getHeadshots() {
    return headshots;
  }

  /**
    * Set headshots
  **/
  public void setHeadshots(Integer headshots) {
    this.headshots = headshots;
  }

  public MatchPlayerStats headshots(Integer headshots) {
    this.headshots = headshots;
    return this;
  }

 /**
   * Get legshots
   * @return legshots
  **/
  public Integer getLegshots() {
    return legshots;
  }

  /**
    * Set legshots
  **/
  public void setLegshots(Integer legshots) {
    this.legshots = legshots;
  }

  public MatchPlayerStats legshots(Integer legshots) {
    this.legshots = legshots;
    return this;
  }

 /**
   * Get killEvents
   * @return killEvents
  **/
  public List<MatchKillEvents> getKillEvents() {
    return killEvents;
  }

  /**
    * Set killEvents
  **/
  public void setKillEvents(List<MatchKillEvents> killEvents) {
    this.killEvents = killEvents;
  }

  public MatchPlayerStats killEvents(List<MatchKillEvents> killEvents) {
    this.killEvents = killEvents;
    return this;
  }

  public MatchPlayerStats addKillEventsItem(MatchKillEvents killEventsItem) {
    this.killEvents.add(killEventsItem);
    return this;
  }

 /**
   * Get kills
   * @return kills
  **/
  public Integer getKills() {
    return kills;
  }

  /**
    * Set kills
  **/
  public void setKills(Integer kills) {
    this.kills = kills;
  }

  public MatchPlayerStats kills(Integer kills) {
    this.kills = kills;
    return this;
  }

 /**
   * Get score
   * @return score
  **/
  public Integer getScore() {
    return score;
  }

  /**
    * Set score
  **/
  public void setScore(Integer score) {
    this.score = score;
  }

  public MatchPlayerStats score(Integer score) {
    this.score = score;
    return this;
  }

 /**
   * Get economy
   * @return economy
  **/
  public MatchEconomy getEconomy() {
    return economy;
  }

  /**
    * Set economy
  **/
  public void setEconomy(MatchEconomy economy) {
    this.economy = economy;
  }

  public MatchPlayerStats economy(MatchEconomy economy) {
    this.economy = economy;
    return this;
  }

 /**
   * Get wasAfk
   * @return wasAfk
  **/
  public Boolean getWasAfk() {
    return wasAfk;
  }

  /**
    * Set wasAfk
  **/
  public void setWasAfk(Boolean wasAfk) {
    this.wasAfk = wasAfk;
  }

  public MatchPlayerStats wasAfk(Boolean wasAfk) {
    this.wasAfk = wasAfk;
    return this;
  }

 /**
   * Get wasPenalized
   * @return wasPenalized
  **/
  public Boolean getWasPenalized() {
    return wasPenalized;
  }

  /**
    * Set wasPenalized
  **/
  public void setWasPenalized(Boolean wasPenalized) {
    this.wasPenalized = wasPenalized;
  }

  public MatchPlayerStats wasPenalized(Boolean wasPenalized) {
    this.wasPenalized = wasPenalized;
    return this;
  }

 /**
   * Get stayedInSpawn
   * @return stayedInSpawn
  **/
  public Boolean getStayedInSpawn() {
    return stayedInSpawn;
  }

  /**
    * Set stayedInSpawn
  **/
  public void setStayedInSpawn(Boolean stayedInSpawn) {
    this.stayedInSpawn = stayedInSpawn;
  }

  public MatchPlayerStats stayedInSpawn(Boolean stayedInSpawn) {
    this.stayedInSpawn = stayedInSpawn;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchPlayerStats {\n");
    
    sb.append("    abilityCasts: ").append(toIndentedString(abilityCasts)).append("\n");
    sb.append("    playerPuuid: ").append(toIndentedString(playerPuuid)).append("\n");
    sb.append("    playerDisplayName: ").append(toIndentedString(playerDisplayName)).append("\n");
    sb.append("    playerTeam: ").append(toIndentedString(playerTeam)).append("\n");
    sb.append("    damageEvents: ").append(toIndentedString(damageEvents)).append("\n");
    sb.append("    damage: ").append(toIndentedString(damage)).append("\n");
    sb.append("    bodyshots: ").append(toIndentedString(bodyshots)).append("\n");
    sb.append("    headshots: ").append(toIndentedString(headshots)).append("\n");
    sb.append("    legshots: ").append(toIndentedString(legshots)).append("\n");
    sb.append("    killEvents: ").append(toIndentedString(killEvents)).append("\n");
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    economy: ").append(toIndentedString(economy)).append("\n");
    sb.append("    wasAfk: ").append(toIndentedString(wasAfk)).append("\n");
    sb.append("    wasPenalized: ").append(toIndentedString(wasPenalized)).append("\n");
    sb.append("    stayedInSpawn: ").append(toIndentedString(stayedInSpawn)).append("\n");
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

