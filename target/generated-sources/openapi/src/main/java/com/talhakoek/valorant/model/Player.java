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

import com.talhakoek.valorant.model.PlayerAbilityCasts;
import com.talhakoek.valorant.model.PlayerAssets;
import com.talhakoek.valorant.model.PlayerBehaviour;
import com.talhakoek.valorant.model.PlayerEconomy;
import com.talhakoek.valorant.model.PlayerPlatform;
import com.talhakoek.valorant.model.PlayerSessionPlaytime;
import com.talhakoek.valorant.model.PlayerStats;

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


public class Player  {
  
  @JsonbProperty("puuid")
  private String puuid;

  @JsonbProperty("name")
  private String name;

  @JsonbProperty("tag")
  private String tag;

  @JsonbProperty("team")
  private String team;

  @JsonbProperty("level")
  private Integer level;

  @JsonbProperty("character")
  private String character;

  @JsonbProperty("currenttier")
  private Integer currenttier;

  @JsonbProperty("currenttier_patched")
  private String currenttierPatched;

  @JsonbProperty("player_card")
  private String playerCard;

  @JsonbProperty("player_title")
  private String playerTitle;

  @JsonbProperty("party_id")
  private String partyId;

  @JsonbProperty("session_playtime")
  private PlayerSessionPlaytime sessionPlaytime;

  @JsonbProperty("assets")
  private PlayerAssets assets;

  @JsonbProperty("behaviour")
  private PlayerBehaviour behaviour;

  @JsonbProperty("platform")
  private PlayerPlatform platform;

  @JsonbProperty("ability_casts")
  private PlayerAbilityCasts abilityCasts;

  @JsonbProperty("stats")
  private PlayerStats stats;

  @JsonbProperty("economy")
  private PlayerEconomy economy;

  @JsonbProperty("damage_made")
  private Integer damageMade;

  @JsonbProperty("damage_received")
  private Integer damageReceived;

 /**
   * Get puuid
   * @return puuid
  **/
  public String getPuuid() {
    return puuid;
  }

  /**
    * Set puuid
  **/
  public void setPuuid(String puuid) {
    this.puuid = puuid;
  }

  public Player puuid(String puuid) {
    this.puuid = puuid;
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

  public Player name(String name) {
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

  public Player tag(String tag) {
    this.tag = tag;
    return this;
  }

 /**
   * Get team
   * @return team
  **/
  public String getTeam() {
    return team;
  }

  /**
    * Set team
  **/
  public void setTeam(String team) {
    this.team = team;
  }

  public Player team(String team) {
    this.team = team;
    return this;
  }

 /**
   * Get level
   * @return level
  **/
  public Integer getLevel() {
    return level;
  }

  /**
    * Set level
  **/
  public void setLevel(Integer level) {
    this.level = level;
  }

  public Player level(Integer level) {
    this.level = level;
    return this;
  }

 /**
   * Get character
   * @return character
  **/
  public String getCharacter() {
    return character;
  }

  /**
    * Set character
  **/
  public void setCharacter(String character) {
    this.character = character;
  }

  public Player character(String character) {
    this.character = character;
    return this;
  }

 /**
   * Get currenttier
   * @return currenttier
  **/
  public Integer getCurrenttier() {
    return currenttier;
  }

  /**
    * Set currenttier
  **/
  public void setCurrenttier(Integer currenttier) {
    this.currenttier = currenttier;
  }

  public Player currenttier(Integer currenttier) {
    this.currenttier = currenttier;
    return this;
  }

 /**
   * Get currenttierPatched
   * @return currenttierPatched
  **/
  public String getCurrenttierPatched() {
    return currenttierPatched;
  }

  /**
    * Set currenttierPatched
  **/
  public void setCurrenttierPatched(String currenttierPatched) {
    this.currenttierPatched = currenttierPatched;
  }

  public Player currenttierPatched(String currenttierPatched) {
    this.currenttierPatched = currenttierPatched;
    return this;
  }

 /**
   * Get playerCard
   * @return playerCard
  **/
  public String getPlayerCard() {
    return playerCard;
  }

  /**
    * Set playerCard
  **/
  public void setPlayerCard(String playerCard) {
    this.playerCard = playerCard;
  }

  public Player playerCard(String playerCard) {
    this.playerCard = playerCard;
    return this;
  }

 /**
   * Get playerTitle
   * @return playerTitle
  **/
  public String getPlayerTitle() {
    return playerTitle;
  }

  /**
    * Set playerTitle
  **/
  public void setPlayerTitle(String playerTitle) {
    this.playerTitle = playerTitle;
  }

  public Player playerTitle(String playerTitle) {
    this.playerTitle = playerTitle;
    return this;
  }

 /**
   * Get partyId
   * @return partyId
  **/
  public String getPartyId() {
    return partyId;
  }

  /**
    * Set partyId
  **/
  public void setPartyId(String partyId) {
    this.partyId = partyId;
  }

  public Player partyId(String partyId) {
    this.partyId = partyId;
    return this;
  }

 /**
   * Get sessionPlaytime
   * @return sessionPlaytime
  **/
  public PlayerSessionPlaytime getSessionPlaytime() {
    return sessionPlaytime;
  }

  /**
    * Set sessionPlaytime
  **/
  public void setSessionPlaytime(PlayerSessionPlaytime sessionPlaytime) {
    this.sessionPlaytime = sessionPlaytime;
  }

  public Player sessionPlaytime(PlayerSessionPlaytime sessionPlaytime) {
    this.sessionPlaytime = sessionPlaytime;
    return this;
  }

 /**
   * Get assets
   * @return assets
  **/
  public PlayerAssets getAssets() {
    return assets;
  }

  /**
    * Set assets
  **/
  public void setAssets(PlayerAssets assets) {
    this.assets = assets;
  }

  public Player assets(PlayerAssets assets) {
    this.assets = assets;
    return this;
  }

 /**
   * Get behaviour
   * @return behaviour
  **/
  public PlayerBehaviour getBehaviour() {
    return behaviour;
  }

  /**
    * Set behaviour
  **/
  public void setBehaviour(PlayerBehaviour behaviour) {
    this.behaviour = behaviour;
  }

  public Player behaviour(PlayerBehaviour behaviour) {
    this.behaviour = behaviour;
    return this;
  }

 /**
   * Get platform
   * @return platform
  **/
  public PlayerPlatform getPlatform() {
    return platform;
  }

  /**
    * Set platform
  **/
  public void setPlatform(PlayerPlatform platform) {
    this.platform = platform;
  }

  public Player platform(PlayerPlatform platform) {
    this.platform = platform;
    return this;
  }

 /**
   * Get abilityCasts
   * @return abilityCasts
  **/
  public PlayerAbilityCasts getAbilityCasts() {
    return abilityCasts;
  }

  /**
    * Set abilityCasts
  **/
  public void setAbilityCasts(PlayerAbilityCasts abilityCasts) {
    this.abilityCasts = abilityCasts;
  }

  public Player abilityCasts(PlayerAbilityCasts abilityCasts) {
    this.abilityCasts = abilityCasts;
    return this;
  }

 /**
   * Get stats
   * @return stats
  **/
  public PlayerStats getStats() {
    return stats;
  }

  /**
    * Set stats
  **/
  public void setStats(PlayerStats stats) {
    this.stats = stats;
  }

  public Player stats(PlayerStats stats) {
    this.stats = stats;
    return this;
  }

 /**
   * Get economy
   * @return economy
  **/
  public PlayerEconomy getEconomy() {
    return economy;
  }

  /**
    * Set economy
  **/
  public void setEconomy(PlayerEconomy economy) {
    this.economy = economy;
  }

  public Player economy(PlayerEconomy economy) {
    this.economy = economy;
    return this;
  }

 /**
   * Get damageMade
   * @return damageMade
  **/
  public Integer getDamageMade() {
    return damageMade;
  }

  /**
    * Set damageMade
  **/
  public void setDamageMade(Integer damageMade) {
    this.damageMade = damageMade;
  }

  public Player damageMade(Integer damageMade) {
    this.damageMade = damageMade;
    return this;
  }

 /**
   * Get damageReceived
   * @return damageReceived
  **/
  public Integer getDamageReceived() {
    return damageReceived;
  }

  /**
    * Set damageReceived
  **/
  public void setDamageReceived(Integer damageReceived) {
    this.damageReceived = damageReceived;
  }

  public Player damageReceived(Integer damageReceived) {
    this.damageReceived = damageReceived;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Player {\n");
    
    sb.append("    puuid: ").append(toIndentedString(puuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    currenttier: ").append(toIndentedString(currenttier)).append("\n");
    sb.append("    currenttierPatched: ").append(toIndentedString(currenttierPatched)).append("\n");
    sb.append("    playerCard: ").append(toIndentedString(playerCard)).append("\n");
    sb.append("    playerTitle: ").append(toIndentedString(playerTitle)).append("\n");
    sb.append("    partyId: ").append(toIndentedString(partyId)).append("\n");
    sb.append("    sessionPlaytime: ").append(toIndentedString(sessionPlaytime)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    behaviour: ").append(toIndentedString(behaviour)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    abilityCasts: ").append(toIndentedString(abilityCasts)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    economy: ").append(toIndentedString(economy)).append("\n");
    sb.append("    damageMade: ").append(toIndentedString(damageMade)).append("\n");
    sb.append("    damageReceived: ").append(toIndentedString(damageReceived)).append("\n");
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

