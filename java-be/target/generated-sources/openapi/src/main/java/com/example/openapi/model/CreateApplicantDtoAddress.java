package com.example.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateApplicantDtoAddress
 */

@JsonTypeName("CreateApplicantDto.Address")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-03T11:18:37.730717329+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class CreateApplicantDtoAddress {

  private String flatNumber;

  private String buildingNumber;

  private String buildingName;

  private String street;

  private String subStreet;

  private String town;

  private String state;

  private String postcode;

  private String country;

  private String line1;

  private String line2;

  private String line3;

  public CreateApplicantDtoAddress() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateApplicantDtoAddress(String street, String town, String country) {
    this.street = street;
    this.town = town;
    this.country = country;
  }

  public CreateApplicantDtoAddress flatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
    return this;
  }

  /**
   * Flat number in the applicant's address.
   * @return flatNumber
   */
  
  @Schema(name = "flat_number", description = "Flat number in the applicant's address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flat_number")
  public String getFlatNumber() {
    return flatNumber;
  }

  public void setFlatNumber(String flatNumber) {
    this.flatNumber = flatNumber;
  }

  public CreateApplicantDtoAddress buildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
    return this;
  }

  /**
   * Building number in the applicant's address.
   * @return buildingNumber
   */
  
  @Schema(name = "building_number", description = "Building number in the applicant's address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("building_number")
  public String getBuildingNumber() {
    return buildingNumber;
  }

  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  public CreateApplicantDtoAddress buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

  /**
   * Building name in the applicant's address.
   * @return buildingName
   */
  
  @Schema(name = "building_name", description = "Building name in the applicant's address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("building_name")
  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public CreateApplicantDtoAddress street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Street name in the applicant's address.
   * @return street
   */
  @NotNull 
  @Schema(name = "street", description = "Street name in the applicant's address.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("street")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public CreateApplicantDtoAddress subStreet(String subStreet) {
    this.subStreet = subStreet;
    return this;
  }

  /**
   * Additional street details, if any.
   * @return subStreet
   */
  
  @Schema(name = "sub_street", description = "Additional street details, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sub_street")
  public String getSubStreet() {
    return subStreet;
  }

  public void setSubStreet(String subStreet) {
    this.subStreet = subStreet;
  }

  public CreateApplicantDtoAddress town(String town) {
    this.town = town;
    return this;
  }

  /**
   * Town or city of the applicant's address.
   * @return town
   */
  @NotNull 
  @Schema(name = "town", description = "Town or city of the applicant's address.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("town")
  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public CreateApplicantDtoAddress state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State or province of the applicant's address.
   * @return state
   */
  
  @Schema(name = "state", description = "State or province of the applicant's address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public CreateApplicantDtoAddress postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Postal code or ZIP code of the address.
   * @return postcode
   */
  
  @Schema(name = "postcode", description = "Postal code or ZIP code of the address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("postcode")
  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public CreateApplicantDtoAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country of the address.
   * @return country
   */
  @NotNull 
  @Schema(name = "country", description = "Country of the address.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CreateApplicantDtoAddress line1(String line1) {
    this.line1 = line1;
    return this;
  }

  /**
   * First address line.
   * @return line1
   */
  
  @Schema(name = "line1", description = "First address line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line1")
  public String getLine1() {
    return line1;
  }

  public void setLine1(String line1) {
    this.line1 = line1;
  }

  public CreateApplicantDtoAddress line2(String line2) {
    this.line2 = line2;
    return this;
  }

  /**
   * Second address line.
   * @return line2
   */
  
  @Schema(name = "line2", description = "Second address line.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line2")
  public String getLine2() {
    return line2;
  }

  public void setLine2(String line2) {
    this.line2 = line2;
  }

  public CreateApplicantDtoAddress line3(String line3) {
    this.line3 = line3;
    return this;
  }

  /**
   * Third address line, if applicable.
   * @return line3
   */
  
  @Schema(name = "line3", description = "Third address line, if applicable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line3")
  public String getLine3() {
    return line3;
  }

  public void setLine3(String line3) {
    this.line3 = line3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApplicantDtoAddress createApplicantDtoAddress = (CreateApplicantDtoAddress) o;
    return Objects.equals(this.flatNumber, createApplicantDtoAddress.flatNumber) &&
        Objects.equals(this.buildingNumber, createApplicantDtoAddress.buildingNumber) &&
        Objects.equals(this.buildingName, createApplicantDtoAddress.buildingName) &&
        Objects.equals(this.street, createApplicantDtoAddress.street) &&
        Objects.equals(this.subStreet, createApplicantDtoAddress.subStreet) &&
        Objects.equals(this.town, createApplicantDtoAddress.town) &&
        Objects.equals(this.state, createApplicantDtoAddress.state) &&
        Objects.equals(this.postcode, createApplicantDtoAddress.postcode) &&
        Objects.equals(this.country, createApplicantDtoAddress.country) &&
        Objects.equals(this.line1, createApplicantDtoAddress.line1) &&
        Objects.equals(this.line2, createApplicantDtoAddress.line2) &&
        Objects.equals(this.line3, createApplicantDtoAddress.line3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flatNumber, buildingNumber, buildingName, street, subStreet, town, state, postcode, country, line1, line2, line3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApplicantDtoAddress {\n");
    sb.append("    flatNumber: ").append(toIndentedString(flatNumber)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    subStreet: ").append(toIndentedString(subStreet)).append("\n");
    sb.append("    town: ").append(toIndentedString(town)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    line3: ").append(toIndentedString(line3)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

