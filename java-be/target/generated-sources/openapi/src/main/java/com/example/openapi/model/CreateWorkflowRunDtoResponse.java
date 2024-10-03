package com.example.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.example.openapi.model.CreateWorkflowRunDtoError;
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
 * CreateWorkflowRunDtoResponse
 */

@JsonTypeName("CreateWorkflowRunDto.Response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-03T11:18:37.730717329+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class CreateWorkflowRunDtoResponse {

  private String applicantId;

  private String id;

  private String workflowId;

  @Valid
  private List<String> tags = new ArrayList<>();

  private String customerUserId;

  private CreateWorkflowRunDtoLink link;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  private Integer workflowVersionId;

  private String dashboardUrl;

  private String status;

  @Valid
  private Map<String, Object> output = new HashMap<>();

  @Valid
  private List<String> reasons = new ArrayList<>();

  private CreateWorkflowRunDtoError error;

  private String sdkToken;

  public CreateWorkflowRunDtoResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateWorkflowRunDtoResponse(String id, String status) {
    this.id = id;
    this.status = status;
  }

  public CreateWorkflowRunDtoResponse applicantId(String applicantId) {
    this.applicantId = applicantId;
    return this;
  }

  /**
   * The ID of the applicant associated with the workflow.
   * @return applicantId
   */
  
  @Schema(name = "applicant_id", description = "The ID of the applicant associated with the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicant_id")
  public String getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(String applicantId) {
    this.applicantId = applicantId;
  }

  public CreateWorkflowRunDtoResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID of the workflow run.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "Unique ID of the workflow run.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateWorkflowRunDtoResponse workflowId(String workflowId) {
    this.workflowId = workflowId;
    return this;
  }

  /**
   * ID of the executed workflow.
   * @return workflowId
   */
  
  @Schema(name = "workflow_id", description = "ID of the executed workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workflow_id")
  public String getWorkflowId() {
    return workflowId;
  }

  public void setWorkflowId(String workflowId) {
    this.workflowId = workflowId;
  }

  public CreateWorkflowRunDtoResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CreateWorkflowRunDtoResponse addTagsItem(String tagsItem) {
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

  public CreateWorkflowRunDtoResponse customerUserId(String customerUserId) {
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

  public CreateWorkflowRunDtoResponse link(CreateWorkflowRunDtoLink link) {
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

  public CreateWorkflowRunDtoResponse createdAt(OffsetDateTime createdAt) {
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

  public CreateWorkflowRunDtoResponse updatedAt(OffsetDateTime updatedAt) {
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

  public CreateWorkflowRunDtoResponse workflowVersionId(Integer workflowVersionId) {
    this.workflowVersionId = workflowVersionId;
    return this;
  }

  /**
   * Version ID of the workflow.
   * @return workflowVersionId
   */
  
  @Schema(name = "workflow_version_id", description = "Version ID of the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workflow_version_id")
  public Integer getWorkflowVersionId() {
    return workflowVersionId;
  }

  public void setWorkflowVersionId(Integer workflowVersionId) {
    this.workflowVersionId = workflowVersionId;
  }

  public CreateWorkflowRunDtoResponse dashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
    return this;
  }

  /**
   * URL to view the workflow run in the dashboard.
   * @return dashboardUrl
   */
  
  @Schema(name = "dashboard_url", description = "URL to view the workflow run in the dashboard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dashboard_url")
  public String getDashboardUrl() {
    return dashboardUrl;
  }

  public void setDashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
  }

  public CreateWorkflowRunDtoResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the workflow run.
   * @return status
   */
  @NotNull 
  @Schema(name = "status", description = "Status of the workflow run.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CreateWorkflowRunDtoResponse output(Map<String, Object> output) {
    this.output = output;
    return this;
  }

  public CreateWorkflowRunDtoResponse putOutputItem(String key, Object outputItem) {
    if (this.output == null) {
      this.output = new HashMap<>();
    }
    this.output.put(key, outputItem);
    return this;
  }

  /**
   * Output generated by the workflow run.
   * @return output
   */
  
  @Schema(name = "output", description = "Output generated by the workflow run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("output")
  public Map<String, Object> getOutput() {
    return output;
  }

  public void setOutput(Map<String, Object> output) {
    this.output = output;
  }

  public CreateWorkflowRunDtoResponse reasons(List<String> reasons) {
    this.reasons = reasons;
    return this;
  }

  public CreateWorkflowRunDtoResponse addReasonsItem(String reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

  /**
   * Reasons for the workflow run outcome, if any.
   * @return reasons
   */
  
  @Schema(name = "reasons", description = "Reasons for the workflow run outcome, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reasons")
  public List<String> getReasons() {
    return reasons;
  }

  public void setReasons(List<String> reasons) {
    this.reasons = reasons;
  }

  public CreateWorkflowRunDtoResponse error(CreateWorkflowRunDtoError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @Valid 
  @Schema(name = "error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public CreateWorkflowRunDtoError getError() {
    return error;
  }

  public void setError(CreateWorkflowRunDtoError error) {
    this.error = error;
  }

  public CreateWorkflowRunDtoResponse sdkToken(String sdkToken) {
    this.sdkToken = sdkToken;
    return this;
  }

  /**
   * SDK token generated for the workflow run.
   * @return sdkToken
   */
  
  @Schema(name = "sdk_token", description = "SDK token generated for the workflow run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sdk_token")
  public String getSdkToken() {
    return sdkToken;
  }

  public void setSdkToken(String sdkToken) {
    this.sdkToken = sdkToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowRunDtoResponse createWorkflowRunDtoResponse = (CreateWorkflowRunDtoResponse) o;
    return Objects.equals(this.applicantId, createWorkflowRunDtoResponse.applicantId) &&
        Objects.equals(this.id, createWorkflowRunDtoResponse.id) &&
        Objects.equals(this.workflowId, createWorkflowRunDtoResponse.workflowId) &&
        Objects.equals(this.tags, createWorkflowRunDtoResponse.tags) &&
        Objects.equals(this.customerUserId, createWorkflowRunDtoResponse.customerUserId) &&
        Objects.equals(this.link, createWorkflowRunDtoResponse.link) &&
        Objects.equals(this.createdAt, createWorkflowRunDtoResponse.createdAt) &&
        Objects.equals(this.updatedAt, createWorkflowRunDtoResponse.updatedAt) &&
        Objects.equals(this.workflowVersionId, createWorkflowRunDtoResponse.workflowVersionId) &&
        Objects.equals(this.dashboardUrl, createWorkflowRunDtoResponse.dashboardUrl) &&
        Objects.equals(this.status, createWorkflowRunDtoResponse.status) &&
        Objects.equals(this.output, createWorkflowRunDtoResponse.output) &&
        Objects.equals(this.reasons, createWorkflowRunDtoResponse.reasons) &&
        Objects.equals(this.error, createWorkflowRunDtoResponse.error) &&
        Objects.equals(this.sdkToken, createWorkflowRunDtoResponse.sdkToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, id, workflowId, tags, customerUserId, link, createdAt, updatedAt, workflowVersionId, dashboardUrl, status, output, reasons, error, sdkToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowRunDtoResponse {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customerUserId: ").append(toIndentedString(customerUserId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    workflowVersionId: ").append(toIndentedString(workflowVersionId)).append("\n");
    sb.append("    dashboardUrl: ").append(toIndentedString(dashboardUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    sdkToken: ").append(toIndentedString(sdkToken)).append("\n");
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

