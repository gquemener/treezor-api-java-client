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
import org.openapitools.client.model.GetSCAWalletsDefaultResponseInner;
import org.openapitools.client.model.PostExtOperation200Response;
import org.openapitools.client.model.PostExtOperationRequest;
import org.openapitools.client.model.PutExtOperationRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScaExternalOperationsApi
 */
@Disabled
public class ScaExternalOperationsApiTest {

    private final ScaExternalOperationsApi api = new ScaExternalOperationsApi();

    /**
     * Create External Operation declaration
     *
     * Declare an SCA External Operation (i.e., a sensitive action that was made outside of Treezor services).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postExtOperationTest() throws ApiException {
        PostExtOperationRequest postExtOperationRequest = null;
        PostExtOperation200Response response = api.postExtOperation(postExtOperationRequest);
        // TODO: test validations
    }

    /**
     * Update External Operation declaration
     *
     * Modify an SCA External Operation declaration.   This feature is only available for Per Operation operations, in other words for external operations whose action name is: &#x60;externalMassPayoutOrderCreation&#x60;,  &#x60;externalMassTransferOrderCreation&#x60;, &#x60;externalScheduledPayoutOrder&#x60;, or &#x60;externalScheduledTransferOrder&#x60;. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putExtOperationTest() throws ApiException {
        UUID externalOperationId = null;
        PutExtOperationRequest putExtOperationRequest = null;
        PostExtOperation200Response response = api.putExtOperation(externalOperationId, putExtOperationRequest);
        // TODO: test validations
    }

}
