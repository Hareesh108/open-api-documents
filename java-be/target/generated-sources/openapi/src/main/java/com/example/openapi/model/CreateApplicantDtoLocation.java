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
 * CreateApplicantDtoLocation
 */

@JsonTypeName("CreateApplicantDto.Location")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-06T22:08:31.121573904+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class CreateApplicantDtoLocation {

  private String ipAddress;

  private String countryOfResidence;

  public CreateApplicantDtoLocation ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * The IP address associated with the applicant.
   * @return ipAddress
   */
  
  @Schema(name = "ip_address", description = "The IP address associated with the applicant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ip_address")
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public CreateApplicantDtoLocation countryOfResidence(String countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
    return this;
  }

  /**
   * Country of residence for the applicant.
   * @return countryOfResidence
   */
  
  @Schema(name = "country_of_residence", description = "Country of residence for the applicant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country_of_residence")
  public String getCountryOfResidence() {
    return countryOfResidence;
  }

  public void setCountryOfResidence(String countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApplicantDtoLocation createApplicantDtoLocation = (CreateApplicantDtoLocation) o;
    return Objects.equals(this.ipAddress, createApplicantDtoLocation.ipAddress) &&
        Objects.equals(this.countryOfResidence, createApplicantDtoLocation.countryOfResidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, countryOfResidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApplicantDtoLocation {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    countryOfResidence: ").append(toIndentedString(countryOfResidence)).append("\n");
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

