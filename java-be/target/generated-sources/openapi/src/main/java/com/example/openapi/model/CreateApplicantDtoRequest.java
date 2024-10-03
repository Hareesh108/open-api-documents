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
 * CreateApplicantDtoRequest
 */

@JsonTypeName("CreateApplicantDto.Request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-03T11:18:37.730717329+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class CreateApplicantDtoRequest {

  private String firstName;

  private String lastName;

  public CreateApplicantDtoRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateApplicantDtoRequest(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public CreateApplicantDtoRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the applicant.
   * @return firstName
   */
  @NotNull 
  @Schema(name = "first_name", description = "The first name of the applicant.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public CreateApplicantDtoRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the applicant.
   * @return lastName
   */
  @NotNull 
  @Schema(name = "last_name", description = "The last name of the applicant.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApplicantDtoRequest createApplicantDtoRequest = (CreateApplicantDtoRequest) o;
    return Objects.equals(this.firstName, createApplicantDtoRequest.firstName) &&
        Objects.equals(this.lastName, createApplicantDtoRequest.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApplicantDtoRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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

