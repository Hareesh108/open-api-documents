package com.example.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.net.URI;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateWorkflowRunDtoLink
 */

@JsonTypeName("CreateWorkflowRunDto.Link")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-06T22:08:31.121573904+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class CreateWorkflowRunDtoLink {

  private URI url;

  private URI completedRedirectUrl;

  private URI expiredRedirectUrl;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expiresAt;

  private String language;

  public CreateWorkflowRunDtoLink() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateWorkflowRunDtoLink(URI url) {
    this.url = url;
  }

  public CreateWorkflowRunDtoLink url(URI url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the workflow link.
   * @return url
   */
  @NotNull @Valid 
  @Schema(name = "url", description = "URL of the workflow link.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public URI getUrl() {
    return url;
  }

  public void setUrl(URI url) {
    this.url = url;
  }

  public CreateWorkflowRunDtoLink completedRedirectUrl(URI completedRedirectUrl) {
    this.completedRedirectUrl = completedRedirectUrl;
    return this;
  }

  /**
   * Redirect URL when the workflow is completed.
   * @return completedRedirectUrl
   */
  @Valid 
  @Schema(name = "completed_redirect_url", description = "Redirect URL when the workflow is completed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_redirect_url")
  public URI getCompletedRedirectUrl() {
    return completedRedirectUrl;
  }

  public void setCompletedRedirectUrl(URI completedRedirectUrl) {
    this.completedRedirectUrl = completedRedirectUrl;
  }

  public CreateWorkflowRunDtoLink expiredRedirectUrl(URI expiredRedirectUrl) {
    this.expiredRedirectUrl = expiredRedirectUrl;
    return this;
  }

  /**
   * Redirect URL when the workflow link has expired.
   * @return expiredRedirectUrl
   */
  @Valid 
  @Schema(name = "expired_redirect_url", description = "Redirect URL when the workflow link has expired.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expired_redirect_url")
  public URI getExpiredRedirectUrl() {
    return expiredRedirectUrl;
  }

  public void setExpiredRedirectUrl(URI expiredRedirectUrl) {
    this.expiredRedirectUrl = expiredRedirectUrl;
  }

  public CreateWorkflowRunDtoLink expiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Expiration timestamp for the workflow link.
   * @return expiresAt
   */
  @Valid 
  @Schema(name = "expires_at", description = "Expiration timestamp for the workflow link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_at")
  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }

  public CreateWorkflowRunDtoLink language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Language preference for the workflow link.
   * @return language
   */
  
  @Schema(name = "language", description = "Language preference for the workflow link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowRunDtoLink createWorkflowRunDtoLink = (CreateWorkflowRunDtoLink) o;
    return Objects.equals(this.url, createWorkflowRunDtoLink.url) &&
        Objects.equals(this.completedRedirectUrl, createWorkflowRunDtoLink.completedRedirectUrl) &&
        Objects.equals(this.expiredRedirectUrl, createWorkflowRunDtoLink.expiredRedirectUrl) &&
        Objects.equals(this.expiresAt, createWorkflowRunDtoLink.expiresAt) &&
        Objects.equals(this.language, createWorkflowRunDtoLink.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, completedRedirectUrl, expiredRedirectUrl, expiresAt, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowRunDtoLink {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    completedRedirectUrl: ").append(toIndentedString(completedRedirectUrl)).append("\n");
    sb.append("    expiredRedirectUrl: ").append(toIndentedString(expiredRedirectUrl)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

