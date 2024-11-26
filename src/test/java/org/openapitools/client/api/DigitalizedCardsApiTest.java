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
import org.openapitools.client.model.DigitalizedCardsBadRequestInner;
import org.openapitools.client.model.DigitalizedCardsDeactivateDigitalizedCardResponse;
import org.openapitools.client.model.DigitalizedCardsGetDigitalizedCardResponse;
import org.openapitools.client.model.DigitalizedCardsInternalErrorInner;
import org.openapitools.client.model.DigitalizedCardsNotFoundInner;
import org.openapitools.client.model.DigitalizedCardsPutDigitalizedCardResponse;
import org.openapitools.client.model.DigitalizedCardsUnauthorizedErrorInner;
import org.openapitools.client.model.PutDigitalizedRequest;
import org.openapitools.client.model.TavRequestPOST200Response;
import org.openapitools.client.model.TavRequestPOSTRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DigitalizedCardsApi
 */
@Disabled
public class DigitalizedCardsApiTest {

    private final DigitalizedCardsApi api = new DigitalizedCardsApi();

    /**
     * Deactivate Payment Token
     *
     * Deactivate a payment Token. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDigitalizedTest() throws ApiException {
        String id = null;
        String reasonCode = null;
        DigitalizedCardsDeactivateDigitalizedCardResponse response = api.deleteDigitalized(id, reasonCode);
        // TODO: test validations
    }

    /**
     * Get Digitalized Cards
     *
     * Retrieve the list of digitalized cards for a given &#x60;cardId&#x60;. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDigitalizedTest() throws ApiException {
        String cardId = null;
        List<DigitalizedCardsGetDigitalizedCardResponse> response = api.getDigitalized(cardId);
        // TODO: test validations
    }

    /**
     * Get Payment Token
     *
     * Retrieve a payment token.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPaymentTokenTest() throws ApiException {
        String id = null;
        DigitalizedCardsGetDigitalizedCardResponse response = api.getPaymentToken(id);
        // TODO: test validations
    }

    /**
     * Update Payment Token Status
     *
     * Update the status of a payment Token. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putDigitalizedTest() throws ApiException {
        String id = null;
        PutDigitalizedRequest putDigitalizedRequest = null;
        DigitalizedCardsPutDigitalizedCardResponse response = api.putDigitalized(id, putDigitalizedRequest);
        // TODO: test validations
    }

    /**
     * Request issuerInitiatedDigitizationData
     *
     * Create a new issuerInitiatedDigitizationData request  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tavRequestPOSTTest() throws ApiException {
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        TavRequestPOSTRequest tavRequestPOSTRequest = null;
        TavRequestPOST200Response response = api.tavRequestPOST(accessSignature, accessTag, accessUserId, accessUserIp, tavRequestPOSTRequest);
        // TODO: test validations
    }

}
