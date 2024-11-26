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
import java.math.BigDecimal;
import org.openapitools.client.model.DefaultError;
import org.openapitools.client.model.GetScheduledPaymentOperations200Response;
import org.openapitools.client.model.PostScheduledPaymentRequest;
import org.openapitools.client.model.ScheduledPayment;
import org.openapitools.client.model.ScheduledPayment1;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScheduledPaymentsApi
 */
@Disabled
public class ScheduledPaymentsApiTest {

    private final ScheduledPaymentsApi api = new ScheduledPaymentsApi();

    /**
     * Delete Scheduled Payment
     *
     * Cancel a Scheduled Payment order
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteScheduledPaymentTest() throws ApiException {
        String scheduledPaymentId = null;
        ScheduledPayment1 response = api.deleteScheduledPayment(scheduledPaymentId);
        // TODO: test validations
    }

    /**
     * Get Scheduled Payment
     *
     * Retrieve Scheduled Payment orders based on the corresponding &#x60;userId&#x60; and/or &#x60;walletId&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getScheduledPaymentTest() throws ApiException {
        Integer userId = null;
        Integer walletId = null;
        String cursor = null;
        BigDecimal pageSize = null;
        ScheduledPayment response = api.getScheduledPayment(userId, walletId, cursor, pageSize);
        // TODO: test validations
    }

    /**
     * Get Scheduled Payment Operations
     *
     * Retrieve the list of executed payments for a given Scheduled Payment order
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getScheduledPaymentOperationsTest() throws ApiException {
        String scheduledPaymentId = null;
        GetScheduledPaymentOperations200Response response = api.getScheduledPaymentOperations(scheduledPaymentId);
        // TODO: test validations
    }

    /**
     * Create Scheduled Payment
     *
     * Schedule a Payout or a Wallet-to-Wallet transfer for a future date.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postScheduledPaymentTest() throws ApiException {
        PostScheduledPaymentRequest postScheduledPaymentRequest = null;
        ScheduledPayment response = api.postScheduledPayment(postScheduledPaymentRequest);
        // TODO: test validations
    }

}
