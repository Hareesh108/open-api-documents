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
 * CreateWorkflowRunDtoError
 */

@JsonTypeName("CreateWorkflowRunDto.Error")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-03T11:18:37.730717329+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class CreateWorkflowRunDtoError {

  private String type;

  private String message;

  public CreateWorkflowRunDtoError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateWorkflowRunDtoError(String type, String message) {
    this.type = type;
    this.message = message;
  }

  public CreateWorkflowRunDtoError type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of error encountered.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "Type of error encountered.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CreateWorkflowRunDtoError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message describing the issue.
   * @return message
   */
  @NotNull 
  @Schema(name = "message", description = "Error message describing the issue.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowRunDtoError createWorkflowRunDtoError = (CreateWorkflowRunDtoError) o;
    return Objects.equals(this.type, createWorkflowRunDtoError.type) &&
        Objects.equals(this.message, createWorkflowRunDtoError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowRunDtoError {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

