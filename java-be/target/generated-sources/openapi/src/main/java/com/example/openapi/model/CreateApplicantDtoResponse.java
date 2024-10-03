package com.example.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.example.openapi.model.CreateApplicantDtoAddress;
import com.example.openapi.model.CreateApplicantDtoLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateApplicantDtoResponse
 */

@JsonTypeName("CreateApplicantDto.Response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-03T11:18:37.730717329+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class CreateApplicantDtoResponse {

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private Boolean sandbox;

  private String firstName;

  private String lastName;

  private String email;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dob;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deleteAt;

  private String href;

  @Valid
  private List<String> idNumbers = new ArrayList<>();

  private String phoneNumber;

  private CreateApplicantDtoAddress address;

  private CreateApplicantDtoLocation location;

  public CreateApplicantDtoResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateApplicantDtoResponse(String id, OffsetDateTime createdAt, String firstName, String lastName) {
    this.id = id;
    this.createdAt = createdAt;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public CreateApplicantDtoResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the applicant.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Unique identifier for the applicant.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateApplicantDtoResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp of when the applicant was created.
   * @return createdAt
   */
  @NotNull @Valid 
  @Schema(name = "created_at", description = "Timestamp of when the applicant was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CreateApplicantDtoResponse sandbox(Boolean sandbox) {
    this.sandbox = sandbox;
    return this;
  }

  /**
   * Indicates if the applicant is in a sandbox environment.
   * @return sandbox
   */
  
  @Schema(name = "sandbox", description = "Indicates if the applicant is in a sandbox environment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sandbox")
  public Boolean getSandbox() {
    return sandbox;
  }

  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }

  public CreateApplicantDtoResponse firstName(String firstName) {
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

  public CreateApplicantDtoResponse lastName(String lastName) {
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

  public CreateApplicantDtoResponse email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address of the applicant.
   * @return email
   */
  @jakarta.validation.constraints.Email 
  @Schema(name = "email", description = "Email address of the applicant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateApplicantDtoResponse dob(LocalDate dob) {
    this.dob = dob;
    return this;
  }

  /**
   * Date of birth of the applicant in YYYY-MM-DD format.
   * @return dob
   */
  @Valid 
  @Schema(name = "dob", description = "Date of birth of the applicant in YYYY-MM-DD format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dob")
  public LocalDate getDob() {
    return dob;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public CreateApplicantDtoResponse deleteAt(OffsetDateTime deleteAt) {
    this.deleteAt = deleteAt;
    return this;
  }

  /**
   * Timestamp of when the applicant will be deleted.
   * @return deleteAt
   */
  @Valid 
  @Schema(name = "delete_at", description = "Timestamp of when the applicant will be deleted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete_at")
  public OffsetDateTime getDeleteAt() {
    return deleteAt;
  }

  public void setDeleteAt(OffsetDateTime deleteAt) {
    this.deleteAt = deleteAt;
  }

  public CreateApplicantDtoResponse href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URL link for the applicant resource.
   * @return href
   */
  
  @Schema(name = "href", description = "URL link for the applicant resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public CreateApplicantDtoResponse idNumbers(List<String> idNumbers) {
    this.idNumbers = idNumbers;
    return this;
  }

  public CreateApplicantDtoResponse addIdNumbersItem(String idNumbersItem) {
    if (this.idNumbers == null) {
      this.idNumbers = new ArrayList<>();
    }
    this.idNumbers.add(idNumbersItem);
    return this;
  }

  /**
   * List of ID numbers associated with the applicant.
   * @return idNumbers
   */
  
  @Schema(name = "id_numbers", description = "List of ID numbers associated with the applicant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id_numbers")
  public List<String> getIdNumbers() {
    return idNumbers;
  }

  public void setIdNumbers(List<String> idNumbers) {
    this.idNumbers = idNumbers;
  }

  public CreateApplicantDtoResponse phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Phone number of the applicant.
   * @return phoneNumber
   */
  
  @Schema(name = "phone_number", description = "Phone number of the applicant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("phone_number")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public CreateApplicantDtoResponse address(CreateApplicantDtoAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public CreateApplicantDtoAddress getAddress() {
    return address;
  }

  public void setAddress(CreateApplicantDtoAddress address) {
    this.address = address;
  }

  public CreateApplicantDtoResponse location(CreateApplicantDtoLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   */
  @Valid 
  @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public CreateApplicantDtoLocation getLocation() {
    return location;
  }

  public void setLocation(CreateApplicantDtoLocation location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateApplicantDtoResponse createApplicantDtoResponse = (CreateApplicantDtoResponse) o;
    return Objects.equals(this.id, createApplicantDtoResponse.id) &&
        Objects.equals(this.createdAt, createApplicantDtoResponse.createdAt) &&
        Objects.equals(this.sandbox, createApplicantDtoResponse.sandbox) &&
        Objects.equals(this.firstName, createApplicantDtoResponse.firstName) &&
        Objects.equals(this.lastName, createApplicantDtoResponse.lastName) &&
        Objects.equals(this.email, createApplicantDtoResponse.email) &&
        Objects.equals(this.dob, createApplicantDtoResponse.dob) &&
        Objects.equals(this.deleteAt, createApplicantDtoResponse.deleteAt) &&
        Objects.equals(this.href, createApplicantDtoResponse.href) &&
        Objects.equals(this.idNumbers, createApplicantDtoResponse.idNumbers) &&
        Objects.equals(this.phoneNumber, createApplicantDtoResponse.phoneNumber) &&
        Objects.equals(this.address, createApplicantDtoResponse.address) &&
        Objects.equals(this.location, createApplicantDtoResponse.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, sandbox, firstName, lastName, email, dob, deleteAt, href, idNumbers, phoneNumber, address, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateApplicantDtoResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    deleteAt: ").append(toIndentedString(deleteAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    idNumbers: ").append(toIndentedString(idNumbers)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

