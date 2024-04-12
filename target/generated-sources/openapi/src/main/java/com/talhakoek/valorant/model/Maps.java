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
 * Gets or Sets maps
 */
public enum Maps {
  
  ASCENT("Ascent"),
  
  SPLIT("Split"),
  
  FRACTURE("Fracture"),
  
  BIND("Bind"),
  
  BREEZE("Breeze"),
  
  DISTRICT("District"),
  
  KASBAH("Kasbah"),
  
  PIAZZA("Piazza"),
  
  LOTUS("Lotus"),
  
  PEARL("Pearl"),
  
  ICEBOX("Icebox"),
  
  HAVEN("Haven");

  private String value;

  Maps(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Maps fromValue(String text) {
    for (Maps b : Maps.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

}

