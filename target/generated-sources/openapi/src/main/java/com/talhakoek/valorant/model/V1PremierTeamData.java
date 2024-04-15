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

import com.talhakoek.valorant.model.TeamRoasterCustomization;
import com.talhakoek.valorant.model.V1PremierTeamDataMember;
import com.talhakoek.valorant.model.V1PremierTeamDataPlacement;
import com.talhakoek.valorant.model.V1PremierTeamDataStats;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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


public class V1PremierTeamData  {
  
  @JsonbProperty("id")
  private UUID id;

  @JsonbProperty("name")
  private String name;

  @JsonbProperty("tag")
  private String tag;

  @JsonbProperty("enrolled")
  private Boolean enrolled;

  @JsonbProperty("stats")
  private V1PremierTeamDataStats stats;

  @JsonbProperty("placement")
  private V1PremierTeamDataPlacement placement;

  @JsonbProperty("customization")
  private TeamRoasterCustomization customization;

  @JsonbProperty("member")
  private List<V1PremierTeamDataMember> member = null;

 /**
   * Get id
   * @return id
  **/
  public UUID getId() {
    return id;
  }

  /**
    * Set id
  **/
  public void setId(UUID id) {
    this.id = id;
  }

  public V1PremierTeamData id(UUID id) {
    this.id = id;
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

  public V1PremierTeamData name(String name) {
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

  public V1PremierTeamData tag(String tag) {
    this.tag = tag;
    return this;
  }

 /**
   * Get enrolled
   * @return enrolled
  **/
  public Boolean getEnrolled() {
    return enrolled;
  }

  /**
    * Set enrolled
  **/
  public void setEnrolled(Boolean enrolled) {
    this.enrolled = enrolled;
  }

  public V1PremierTeamData enrolled(Boolean enrolled) {
    this.enrolled = enrolled;
    return this;
  }

 /**
   * Get stats
   * @return stats
  **/
  public V1PremierTeamDataStats getStats() {
    return stats;
  }

  /**
    * Set stats
  **/
  public void setStats(V1PremierTeamDataStats stats) {
    this.stats = stats;
  }

  public V1PremierTeamData stats(V1PremierTeamDataStats stats) {
    this.stats = stats;
    return this;
  }

 /**
   * Get placement
   * @return placement
  **/
  public V1PremierTeamDataPlacement getPlacement() {
    return placement;
  }

  /**
    * Set placement
  **/
  public void setPlacement(V1PremierTeamDataPlacement placement) {
    this.placement = placement;
  }

  public V1PremierTeamData placement(V1PremierTeamDataPlacement placement) {
    this.placement = placement;
    return this;
  }

 /**
   * Get customization
   * @return customization
  **/
  public TeamRoasterCustomization getCustomization() {
    return customization;
  }

  /**
    * Set customization
  **/
  public void setCustomization(TeamRoasterCustomization customization) {
    this.customization = customization;
  }

  public V1PremierTeamData customization(TeamRoasterCustomization customization) {
    this.customization = customization;
    return this;
  }

 /**
   * Get member
   * @return member
  **/
  public List<V1PremierTeamDataMember> getMember() {
    return member;
  }

  /**
    * Set member
  **/
  public void setMember(List<V1PremierTeamDataMember> member) {
    this.member = member;
  }

  public V1PremierTeamData member(List<V1PremierTeamDataMember> member) {
    this.member = member;
    return this;
  }

  public V1PremierTeamData addMemberItem(V1PremierTeamDataMember memberItem) {
    this.member.add(memberItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PremierTeamData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    enrolled: ").append(toIndentedString(enrolled)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    customization: ").append(toIndentedString(customization)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
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
