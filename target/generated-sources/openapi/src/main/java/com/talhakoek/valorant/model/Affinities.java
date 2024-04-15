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



/**
 * Gets or Sets affinities
 */
public enum Affinities {
  
  EU("eu"),
  
  NA("na"),
  
  LATAM("latam"),
  
  BR("br"),
  
  AP("ap"),
  
  KR("kr");

  private String value;

  Affinities(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Affinities fromValue(String text) {
    for (Affinities b : Affinities.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

}
