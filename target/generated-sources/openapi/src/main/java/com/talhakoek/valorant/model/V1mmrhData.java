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

import com.talhakoek.valorant.model.V1mmrhImages;
import com.talhakoek.valorant.model.V1mmrhMap;

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


public class V1mmrhData  {
  
  @JsonbProperty("currenttier")
  private Integer currenttier;

  @JsonbProperty("currenttier_patched")
  private String currenttierPatched;

  @JsonbProperty("images")
  private V1mmrhImages images;

  @JsonbProperty("match_id")
  private String matchId;

  @JsonbProperty("map")
  private V1mmrhMap map;

  @JsonbProperty("season_id")
  private String seasonId;

  @JsonbProperty("ranking_in_tier")
  private Integer rankingInTier;

  @JsonbProperty("mmr_change_to_last_game")
  private Integer mmrChangeToLastGame;

  @JsonbProperty("elo")
  private Integer elo;

  @JsonbProperty("date")
  private String date;

  @JsonbProperty("date_raw")
  private Integer dateRaw;

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

  public V1mmrhData currenttier(Integer currenttier) {
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

  public V1mmrhData currenttierPatched(String currenttierPatched) {
    this.currenttierPatched = currenttierPatched;
    return this;
  }

 /**
   * Get images
   * @return images
  **/
  public V1mmrhImages getImages() {
    return images;
  }

  /**
    * Set images
  **/
  public void setImages(V1mmrhImages images) {
    this.images = images;
  }

  public V1mmrhData images(V1mmrhImages images) {
    this.images = images;
    return this;
  }

 /**
   * Get matchId
   * @return matchId
  **/
  public String getMatchId() {
    return matchId;
  }

  /**
    * Set matchId
  **/
  public void setMatchId(String matchId) {
    this.matchId = matchId;
  }

  public V1mmrhData matchId(String matchId) {
    this.matchId = matchId;
    return this;
  }

 /**
   * Get map
   * @return map
  **/
  public V1mmrhMap getMap() {
    return map;
  }

  /**
    * Set map
  **/
  public void setMap(V1mmrhMap map) {
    this.map = map;
  }

  public V1mmrhData map(V1mmrhMap map) {
    this.map = map;
    return this;
  }

 /**
   * Get seasonId
   * @return seasonId
  **/
  public String getSeasonId() {
    return seasonId;
  }

  /**
    * Set seasonId
  **/
  public void setSeasonId(String seasonId) {
    this.seasonId = seasonId;
  }

  public V1mmrhData seasonId(String seasonId) {
    this.seasonId = seasonId;
    return this;
  }

 /**
   * Get rankingInTier
   * @return rankingInTier
  **/
  public Integer getRankingInTier() {
    return rankingInTier;
  }

  /**
    * Set rankingInTier
  **/
  public void setRankingInTier(Integer rankingInTier) {
    this.rankingInTier = rankingInTier;
  }

  public V1mmrhData rankingInTier(Integer rankingInTier) {
    this.rankingInTier = rankingInTier;
    return this;
  }

 /**
   * Get mmrChangeToLastGame
   * @return mmrChangeToLastGame
  **/
  public Integer getMmrChangeToLastGame() {
    return mmrChangeToLastGame;
  }

  /**
    * Set mmrChangeToLastGame
  **/
  public void setMmrChangeToLastGame(Integer mmrChangeToLastGame) {
    this.mmrChangeToLastGame = mmrChangeToLastGame;
  }

  public V1mmrhData mmrChangeToLastGame(Integer mmrChangeToLastGame) {
    this.mmrChangeToLastGame = mmrChangeToLastGame;
    return this;
  }

 /**
   * Get elo
   * @return elo
  **/
  public Integer getElo() {
    return elo;
  }

  /**
    * Set elo
  **/
  public void setElo(Integer elo) {
    this.elo = elo;
  }

  public V1mmrhData elo(Integer elo) {
    this.elo = elo;
    return this;
  }

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

  public V1mmrhData date(String date) {
    this.date = date;
    return this;
  }

 /**
   * Get dateRaw
   * @return dateRaw
  **/
  public Integer getDateRaw() {
    return dateRaw;
  }

  /**
    * Set dateRaw
  **/
  public void setDateRaw(Integer dateRaw) {
    this.dateRaw = dateRaw;
  }

  public V1mmrhData dateRaw(Integer dateRaw) {
    this.dateRaw = dateRaw;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1mmrhData {\n");
    
    sb.append("    currenttier: ").append(toIndentedString(currenttier)).append("\n");
    sb.append("    currenttierPatched: ").append(toIndentedString(currenttierPatched)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    matchId: ").append(toIndentedString(matchId)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    seasonId: ").append(toIndentedString(seasonId)).append("\n");
    sb.append("    rankingInTier: ").append(toIndentedString(rankingInTier)).append("\n");
    sb.append("    mmrChangeToLastGame: ").append(toIndentedString(mmrChangeToLastGame)).append("\n");
    sb.append("    elo: ").append(toIndentedString(elo)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateRaw: ").append(toIndentedString(dateRaw)).append("\n");
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
