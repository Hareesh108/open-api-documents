package com.example.openapi.api;

import com.example.openapi.model.CreateApplicantDtoRequest;
import com.example.openapi.model.CreateApplicantDtoResponse;
import com.example.openapi.model.CreateWorkflowRunDtoRequest;
import com.example.openapi.model.CreateWorkflowRunDtoResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link RestApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-03T11:18:37.730717329+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public interface RestApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /rest/api/v1/callback : Handle webhook callbacks
     * Handles callbacks from external systems.
     *
     * @param body  (required)
     * @return Callback received and processed successfully. (status code 200)
     *         or Error processing webhook. (status code 500)
     * @see RestApi#restApiV1CallbackPost
     */
    default ResponseEntity<String> restApiV1CallbackPost(Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /rest/api/v1/create-applicant : Create a new applicant
     * Creates a new applicant in Onfido and returns the applicant details.
     *
     * @param createApplicantDtoRequest  (required)
     * @return Applicant created successfully. (status code 200)
     *         or Invalid request payload. (status code 400)
     * @see RestApi#restApiV1CreateApplicantPost
     */
    default ResponseEntity<CreateApplicantDtoResponse> restApiV1CreateApplicantPost(CreateApplicantDtoRequest createApplicantDtoRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"building_name\" : \"building_name\", \"country\" : \"country\", \"town\" : \"town\", \"flat_number\" : \"flat_number\", \"street\" : \"street\", \"postcode\" : \"postcode\", \"state\" : \"state\", \"line3\" : \"line3\", \"line2\" : \"line2\", \"building_number\" : \"building_number\", \"line1\" : \"line1\", \"sub_street\" : \"sub_street\" }, \"sandbox\" : true, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"last_name\" : \"last_name\", \"id_numbers\" : [ \"id_numbers\", \"id_numbers\" ], \"dob\" : \"2000-01-23\", \"delete_at\" : \"2000-01-23T04:56:07.000+00:00\", \"phone_number\" : \"phone_number\", \"location\" : { \"country_of_residence\" : \"country_of_residence\", \"ip_address\" : \"ip_address\" }, \"id\" : \"id\", \"href\" : \"href\", \"first_name\" : \"first_name\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /rest/api/v1/create-workflow-run : Create a new workflow run
     * Creates a new workflow run for the given applicant and workflow ID.
     *
     * @param createWorkflowRunDtoRequest  (required)
     * @return Workflow run created successfully. (status code 200)
     *         or Invalid request payload. (status code 400)
     * @see RestApi#restApiV1CreateWorkflowRunPost
     */
    default ResponseEntity<CreateWorkflowRunDtoResponse> restApiV1CreateWorkflowRunPost(CreateWorkflowRunDtoRequest createWorkflowRunDtoRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"workflow_id\" : \"workflow_id\", \"reasons\" : [ \"reasons\", \"reasons\" ], \"link\" : { \"expires_at\" : \"2000-01-23T04:56:07.000+00:00\", \"expired_redirect_url\" : \"https://openapi-generator.tech\", \"completed_redirect_url\" : \"https://openapi-generator.tech\", \"language\" : \"language\", \"url\" : \"https://openapi-generator.tech\" }, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"error\" : { \"type\" : \"type\", \"message\" : \"message\" }, \"tags\" : [ \"tags\", \"tags\" ], \"output\" : { \"key\" : \"\" }, \"applicant_id\" : \"applicant_id\", \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"sdk_token\" : \"sdk_token\", \"id\" : \"id\", \"customer_user_id\" : \"customer_user_id\", \"workflow_version_id\" : 0, \"dashboard_url\" : \"dashboard_url\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /rest/api/v1/retrieve-workflow-run : Retrieve a list of workflow runs
     * Retrieves a list of all workflow runs.
     *
     * @return List of workflow runs retrieved successfully. (status code 200)
     * @see RestApi#restApiV1RetrieveWorkflowRunGet
     */
    default ResponseEntity<List<CreateWorkflowRunDtoResponse>> restApiV1RetrieveWorkflowRunGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"workflow_id\" : \"workflow_id\", \"reasons\" : [ \"reasons\", \"reasons\" ], \"link\" : { \"expires_at\" : \"2000-01-23T04:56:07.000+00:00\", \"expired_redirect_url\" : \"https://openapi-generator.tech\", \"completed_redirect_url\" : \"https://openapi-generator.tech\", \"language\" : \"language\", \"url\" : \"https://openapi-generator.tech\" }, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"error\" : { \"type\" : \"type\", \"message\" : \"message\" }, \"tags\" : [ \"tags\", \"tags\" ], \"output\" : { \"key\" : \"\" }, \"applicant_id\" : \"applicant_id\", \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"sdk_token\" : \"sdk_token\", \"id\" : \"id\", \"customer_user_id\" : \"customer_user_id\", \"workflow_version_id\" : 0, \"dashboard_url\" : \"dashboard_url\", \"status\" : \"status\" }, { \"workflow_id\" : \"workflow_id\", \"reasons\" : [ \"reasons\", \"reasons\" ], \"link\" : { \"expires_at\" : \"2000-01-23T04:56:07.000+00:00\", \"expired_redirect_url\" : \"https://openapi-generator.tech\", \"completed_redirect_url\" : \"https://openapi-generator.tech\", \"language\" : \"language\", \"url\" : \"https://openapi-generator.tech\" }, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"error\" : { \"type\" : \"type\", \"message\" : \"message\" }, \"tags\" : [ \"tags\", \"tags\" ], \"output\" : { \"key\" : \"\" }, \"applicant_id\" : \"applicant_id\", \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"sdk_token\" : \"sdk_token\", \"id\" : \"id\", \"customer_user_id\" : \"customer_user_id\", \"workflow_version_id\" : 0, \"dashboard_url\" : \"dashboard_url\", \"status\" : \"status\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /rest/api/v1/retrieve-workflow-run/{workflowRunId} : Retrieve a specific workflow run
     * Retrieves the details of a specific workflow run by ID.
     *
     * @param workflowRunId The ID of the workflow run to retrieve. (required)
     * @return Workflow run retrieved successfully. (status code 200)
     *         or Workflow run not found. (status code 404)
     * @see RestApi#restApiV1RetrieveWorkflowRunWorkflowRunIdGet
     */
    default ResponseEntity<CreateWorkflowRunDtoResponse> restApiV1RetrieveWorkflowRunWorkflowRunIdGet(String workflowRunId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"workflow_id\" : \"workflow_id\", \"reasons\" : [ \"reasons\", \"reasons\" ], \"link\" : { \"expires_at\" : \"2000-01-23T04:56:07.000+00:00\", \"expired_redirect_url\" : \"https://openapi-generator.tech\", \"completed_redirect_url\" : \"https://openapi-generator.tech\", \"language\" : \"language\", \"url\" : \"https://openapi-generator.tech\" }, \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"error\" : { \"type\" : \"type\", \"message\" : \"message\" }, \"tags\" : [ \"tags\", \"tags\" ], \"output\" : { \"key\" : \"\" }, \"applicant_id\" : \"applicant_id\", \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"sdk_token\" : \"sdk_token\", \"id\" : \"id\", \"customer_user_id\" : \"customer_user_id\", \"workflow_version_id\" : 0, \"dashboard_url\" : \"dashboard_url\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
