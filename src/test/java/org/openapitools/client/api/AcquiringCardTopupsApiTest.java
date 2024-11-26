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
import org.openapitools.client.model.AcquiringPayin;
import org.openapitools.client.model.Authorization;
import org.openapitools.client.model.AuthorizationDeleteResponse;
import org.openapitools.client.model.AuthorizationRequest;
import java.math.BigDecimal;
import org.openapitools.client.model.CaptureResponse;
import org.openapitools.client.model.ChargebacksResponse;
import org.openapitools.client.model.DefaultError;
import org.openapitools.client.model.PostAcqAuthPayinRequest;
import org.openapitools.client.model.RefundsResponse;
import org.openapitools.client.model.TopupCardRequest;
import org.openapitools.client.model.TopupCards;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AcquiringCardTopupsApi
 */
@Disabled
public class AcquiringCardTopupsApiTest {

    private final AcquiringCardTopupsApi api = new AcquiringCardTopupsApi();

    /**
     * Get Chargeback
     *
     * Retrieve a card acquiring a chargeback from the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void acquiringv2TopupCardsChargebacksGetTest() throws ApiException {
        String chargebackUuid = null;
        ChargebacksResponse response = api.acquiringv2TopupCardsChargebacksGet(chargebackUuid);
        // TODO: test validations
    }

    /**
     * Get Refund
     *
     * Retrieve a card acquring refund from the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void acquiringv2TopupCardsRefundsGetTest() throws ApiException {
        String refundUuid = null;
        RefundsResponse response = api.acquiringv2TopupCardsRefundsGet(refundUuid);
        // TODO: test validations
    }

    /**
     * Create Refund
     *
     * Create a new card topup refund.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void acquiringv2TopupCardsRefundsPostTest() throws ApiException {
        String payinId = null;
        BigDecimal amount = null;
        String currency = null;
        String profile = null;
        RefundsResponse response = api.acquiringv2TopupCardsRefundsPost(payinId, amount, currency, profile);
        // TODO: test validations
    }

    /**
     * Delete Authorization
     *
     * Delete an authorization from the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAcqAuthTest() throws ApiException {
        String authorizationUuid = null;
        AuthorizationDeleteResponse response = api.deleteAcqAuth(authorizationUuid);
        // TODO: test validations
    }

    /**
     * Cancel Topup Card
     *
     * Change topup card status to CANCELED.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTopupCardTest() throws ApiException {
        String userId = null;
        String topupCardId = null;
        TopupCards response = api.deleteTopupCard(userId, topupCardId);
        // TODO: test validations
    }

    /**
     * Get Authorization
     *
     * Retrieve an authorization from the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAcqAuthTest() throws ApiException {
        String authorizationUuid = null;
        Authorization response = api.getAcqAuth(authorizationUuid);
        // TODO: test validations
    }

    /**
     * Get Authorization Payins
     *
     * List payins created from a given authorization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAcqAuthPayinsTest() throws ApiException {
        String authorizationUuid = null;
        String exclusiveStartKey = null;
        List<AcquiringPayin> response = api.getAcqAuthPayins(authorizationUuid, exclusiveStartKey);
        // TODO: test validations
    }

    /**
     * Get Topup Card
     *
     * Retrieve the details of a Topup Card.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTopupCardTest() throws ApiException {
        String userId = null;
        String topupCardId = null;
        TopupCards response = api.getTopupCard(userId, topupCardId);
        // TODO: test validations
    }

    /**
     * Search Topup Cards
     *
     * Get topup cards.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTopupCardsTest() throws ApiException {
        String userId = null;
        TopupCards response = api.getTopupCards(userId);
        // TODO: test validations
    }

    /**
     * Create Authorization
     *
     * Create an authorization to make a card topup payin within 7 days. The card must be [tokenized](/guide/acquiring/card-tokenization.html) first. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postAcqAuthTest() throws ApiException {
        AuthorizationRequest authorizationRequest = null;
        Authorization response = api.postAcqAuth(authorizationRequest);
        // TODO: test validations
    }

    /**
     * Create Payin from Authorization
     *
     * Create a payin from an authorization. The amount must be ≤ to the authorization amount. [Learn more](/guide/acquiring/preauthorized.html#advanced-capture).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postAcqAuthPayinTest() throws ApiException {
        String authorizationUuid = null;
        PostAcqAuthPayinRequest postAcqAuthPayinRequest = null;
        CaptureResponse response = api.postAcqAuthPayin(authorizationUuid, postAcqAuthPayinRequest);
        // TODO: test validations
    }

    /**
     * Create Topup Card
     *
     * Create a new topup card. The card must have been previously tokenized. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postTopupCardTest() throws ApiException {
        String userId = null;
        TopupCardRequest topupCardRequest = null;
        TopupCards response = api.postTopupCard(userId, topupCardRequest);
        // TODO: test validations
    }

}
