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

import com.talhakoek.valorant.model.V1PremierSeasonEvents;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
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


public class V1PremierSeasonData  {
  
  @JsonbProperty("id")
  private UUID id;

  @JsonbProperty("championship_event_id")
  private UUID championshipEventId;

  @JsonbProperty("championship_points_required")
  private BigDecimal championshipPointsRequired;

  @JsonbProperty("starts_at")
  private OffsetDateTime startsAt;

  @JsonbProperty("ends_at")
  private OffsetDateTime endsAt;

  @JsonbProperty("enrollment_starts_at")
  private OffsetDateTime enrollmentStartsAt;

  @JsonbProperty("enrollment_ends_at")
  private OffsetDateTime enrollmentEndsAt;

  @JsonbProperty("events")
  private List<V1PremierSeasonEvents> events = null;

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

  public V1PremierSeasonData id(UUID id) {
    this.id = id;
    return this;
  }

 /**
   * Get championshipEventId
   * @return championshipEventId
  **/
  public UUID getChampionshipEventId() {
    return championshipEventId;
  }

  /**
    * Set championshipEventId
  **/
  public void setChampionshipEventId(UUID championshipEventId) {
    this.championshipEventId = championshipEventId;
  }

  public V1PremierSeasonData championshipEventId(UUID championshipEventId) {
    this.championshipEventId = championshipEventId;
    return this;
  }

 /**
   * Get championshipPointsRequired
   * @return championshipPointsRequired
  **/
  public BigDecimal getChampionshipPointsRequired() {
    return championshipPointsRequired;
  }

  /**
    * Set championshipPointsRequired
  **/
  public void setChampionshipPointsRequired(BigDecimal championshipPointsRequired) {
    this.championshipPointsRequired = championshipPointsRequired;
  }

  public V1PremierSeasonData championshipPointsRequired(BigDecimal championshipPointsRequired) {
    this.championshipPointsRequired = championshipPointsRequired;
    return this;
  }

 /**
   * Get startsAt
   * @return startsAt
  **/
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  /**
    * Set startsAt
  **/
  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  public V1PremierSeasonData startsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
    return this;
  }

 /**
   * Get endsAt
   * @return endsAt
  **/
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  /**
    * Set endsAt
  **/
  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  public V1PremierSeasonData endsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
    return this;
  }

 /**
   * Get enrollmentStartsAt
   * @return enrollmentStartsAt
  **/
  public OffsetDateTime getEnrollmentStartsAt() {
    return enrollmentStartsAt;
  }

  /**
    * Set enrollmentStartsAt
  **/
  public void setEnrollmentStartsAt(OffsetDateTime enrollmentStartsAt) {
    this.enrollmentStartsAt = enrollmentStartsAt;
  }

  public V1PremierSeasonData enrollmentStartsAt(OffsetDateTime enrollmentStartsAt) {
    this.enrollmentStartsAt = enrollmentStartsAt;
    return this;
  }

 /**
   * Get enrollmentEndsAt
   * @return enrollmentEndsAt
  **/
  public OffsetDateTime getEnrollmentEndsAt() {
    return enrollmentEndsAt;
  }

  /**
    * Set enrollmentEndsAt
  **/
  public void setEnrollmentEndsAt(OffsetDateTime enrollmentEndsAt) {
    this.enrollmentEndsAt = enrollmentEndsAt;
  }

  public V1PremierSeasonData enrollmentEndsAt(OffsetDateTime enrollmentEndsAt) {
    this.enrollmentEndsAt = enrollmentEndsAt;
    return this;
  }

 /**
   * Get events
   * @return events
  **/
  public List<V1PremierSeasonEvents> getEvents() {
    return events;
  }

  /**
    * Set events
  **/
  public void setEvents(List<V1PremierSeasonEvents> events) {
    this.events = events;
  }

  public V1PremierSeasonData events(List<V1PremierSeasonEvents> events) {
    this.events = events;
    return this;
  }

  public V1PremierSeasonData addEventsItem(V1PremierSeasonEvents eventsItem) {
    this.events.add(eventsItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PremierSeasonData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    championshipEventId: ").append(toIndentedString(championshipEventId)).append("\n");
    sb.append("    championshipPointsRequired: ").append(toIndentedString(championshipPointsRequired)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    enrollmentStartsAt: ").append(toIndentedString(enrollmentStartsAt)).append("\n");
    sb.append("    enrollmentEndsAt: ").append(toIndentedString(enrollmentEndsAt)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

