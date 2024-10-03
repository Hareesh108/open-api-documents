package com.example.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.example.openapi.model.CreateWorkflowRunDtoLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateWorkflowRunDtoRequest
 */

@JsonTypeName("CreateWorkflowRunDto.Request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-03T11:18:37.730717329+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class CreateWorkflowRunDtoRequest {

  private String applicantId;

  private String workflowId;

  @Valid
  private List<String> tags = new ArrayList<>();

  private String customerUserId;

  private CreateWorkflowRunDtoLink link;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  @Valid
  private Map<String, Object> customData = new HashMap<>();

  public CreateWorkflowRunDtoRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateWorkflowRunDtoRequest(String applicantId, String workflowId) {
    this.applicantId = applicantId;
    this.workflowId = workflowId;
  }

  public CreateWorkflowRunDtoRequest applicantId(String applicantId) {
    this.applicantId = applicantId;
    return this;
  }

  /**
   * The ID of the applicant associated with the workflow.
   * @return applicantId
   */
  @NotNull 
  @Schema(name = "applicant_id", description = "The ID of the applicant associated with the workflow.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("applicant_id")
  public String getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(String applicantId) {
    this.applicantId = applicantId;
  }

  public CreateWorkflowRunDtoRequest workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * The workflow ID to run for the applicant.
   * @return workflowId
   */
  @NotNull 
  @Schema(name = "workflow_id", description = "The workflow ID to run for the applicant.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workflow_id")
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  public CreateWorkflowRunDtoRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateWorkflowRunDtoRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the workflow run.
   * @return tags
   */
  
  @Schema(name = "tags", description = "Tags associated with the workflow run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CreateWorkflowRunDtoRequest customerUserId(String customerUserId) {
    this.customerUserId = customerUserId;
    return this;
  }

  /**
   * Customer-specific user ID for tracking the applicant.
   * @return customerUserId
   */
  
  @Schema(name = "customer_user_id", description = "Customer-specific user ID for tracking the applicant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customer_user_id")
  public String getCustomerUserId() {
    return customerUserId;
  }

  public void setCustomerUserId(String customerUserId) {
    this.customerUserId = customerUserId;
  }

  public CreateWorkflowRunDtoRequest link(CreateWorkflowRunDtoLink link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
   */
  @Valid 
  @Schema(name = "link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public CreateWorkflowRunDtoLink getLink() {
    return link;
  }

  public void setLink(CreateWorkflowRunDtoLink link) {
    this.link = link;
  }

  public CreateWorkflowRunDtoRequest createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp of when the workflow run was created.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", description = "Timestamp of when the workflow run was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CreateWorkflowRunDtoRequest updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp of when the workflow run was last updated.
   * @return updatedAt
   */
  @Valid 
  @Schema(name = "updated_at", description = "Timestamp of when the workflow run was last updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CreateWorkflowRunDtoRequest customData(Map<String, Object> customData) {
    this.customData = customData;
    return this;
  }

  public CreateWorkflowRunDtoRequest putCustomDataItem(String key, Object customDataItem) {
    if (this.customData == null) {
      this.customData = new HashMap<>();
    }
    this.customData.put(key, customDataItem);
    return this;
  }

  /**
   * Custom data provided for the workflow run.
   * @return customData
   */
  
  @Schema(name = "custom_data", description = "Custom data provided for the workflow run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_data")
  public Map<String, Object> getCustomData() {
    return customData;
  }

  public void setCustomData(Map<String, Object> customData) {
    this.customData = customData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowRunDtoRequest createWorkflowRunDtoRequest = (CreateWorkflowRunDtoRequest) o;
    return Objects.equals(this.applicantId, createWorkflowRunDtoRequest.applicantId) &&
        Objects.equals(this.workflowId, createWorkflowRunDtoRequest.workflowId) &&
        Objects.equals(this.tags, createWorkflowRunDtoRequest.tags) &&
        Objects.equals(this.customerUserId, createWorkflowRunDtoRequest.customerUserId) &&
        Objects.equals(this.link, createWorkflowRunDtoRequest.link) &&
        Objects.equals(this.createdAt, createWorkflowRunDtoRequest.createdAt) &&
        Objects.equals(this.updatedAt, createWorkflowRunDtoRequest.updatedAt) &&
        Objects.equals(this.customData, createWorkflowRunDtoRequest.customData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, workflowId, tags, customerUserId, link, createdAt, updatedAt, customData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowRunDtoRequest {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customerUserId: ").append(toIndentedString(customerUserId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
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

