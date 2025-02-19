/*
 * Treezor API
 * Official endpoint documentation for Treezor.
 *
 * The version of the OpenAPI document: 24.11.21
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.DefaultError;
import org.openapitools.client.model.GetTemplate200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiTemplatesApi
 */
@Disabled
public class ApiTemplatesApiTest {

    private final ApiTemplatesApi api = new ApiTemplatesApi();

    /**
     * Delete Template
     *
     * Delete a Template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTemplateTest() throws ApiException {
        String templateName = null;
        api.deleteTemplate(templateName);
        // TODO: test validations
    }

    /**
     * Get Template
     *
     * Retrieve the currently configured template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTemplateTest() throws ApiException {
        String templateName = null;
        GetTemplate200Response response = api.getTemplate(templateName);
        // TODO: test validations
    }

    /**
     * Build Template Example
     *
     * Test your template by building one with dummy values.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTemplateExampleTest() throws ApiException {
        String templateName = null;
        GetTemplate200Response response = api.getTemplateExample(templateName);
        // TODO: test validations
    }

    /**
     * Get Template Variables
     *
     * Retrieve the list of variables for the given template
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTemplateVariablesTest() throws ApiException {
        String templateName = null;
        Object response = api.getTemplateVariables(templateName);
        // TODO: test validations
    }

    /**
     * Upload Template
     *
     * Upload a replacement for an existing Template.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putTemplateUploadTest() throws ApiException {
        String templateName = null;
        api.putTemplateUpload(templateName);
        // TODO: test validations
    }

}
