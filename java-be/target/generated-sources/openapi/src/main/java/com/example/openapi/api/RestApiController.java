package com.example.openapi.api;

import com.example.openapi.model.CreateApplicantDtoRequest;
import com.example.openapi.model.CreateApplicantDtoResponse;
import com.example.openapi.model.CreateWorkflowRunDtoRequest;
import com.example.openapi.model.CreateWorkflowRunDtoResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-03T14:31:57.747198048+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
@Controller
@RequestMapping("${openapi.mergedSpec.base-path:}")
public class RestApiController implements RestApi {

    private final RestApiDelegate delegate;

    public RestApiController(@Autowired(required = false) RestApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new RestApiDelegate() {});
    }

    @Override
    public RestApiDelegate getDelegate() {
        return delegate;
    }

}
