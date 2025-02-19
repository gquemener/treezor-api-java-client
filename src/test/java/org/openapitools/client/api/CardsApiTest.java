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
import org.openapitools.client.model.ActivateCardRequest;
import org.openapitools.client.model.CardObject;
import org.openapitools.client.model.CardOptionsRequest;
import org.openapitools.client.model.ChangePinRequest;
import org.openapitools.client.model.ConvertVirtualRequest;
import org.openapitools.client.model.DefaultError;
import org.openapitools.client.model.GetCardImage200Response;
import org.openapitools.client.model.GetCardsDefaultResponse;
import org.openapitools.client.model.GetRenewalDetails200Response;
import java.time.OffsetDateTime;
import org.openapitools.client.model.Post3dsRequest;
import org.openapitools.client.model.PostCardVirtualRequest;
import org.openapitools.client.model.PutCardRequest;
import org.openapitools.client.model.PutLimitsRequest;
import org.openapitools.client.model.ReassignCardRequest;
import org.openapitools.client.model.SetPinRequest;
import org.openapitools.client.model.UpdateBlockStatusRequest;
import org.openapitools.client.model.UpdateRenewalDetailsRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CardsApi
 */
@Disabled
public class CardsApiTest {

    private final CardsApi api = new CardsApi();

    /**
     * Activate Card
     *
     * Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateCardTest() throws ApiException {
        Integer cardId = null;
        String accessToken = null;
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        ActivateCardRequest activateCardRequest = null;
        CardObject response = api.activateCard(cardId, accessToken, accessSignature, accessUserId, accessUserIp, activateCardRequest);
        // TODO: test validations
    }

    /**
     * Activate Card Public Token
     *
     * Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). Ideal for end-user oriented action. A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activateCardTokenTest() throws ApiException {
        String cardToken = null;
        CardObject response = api.activateCardToken(cardToken);
        // TODO: test validations
    }

    /**
     * Update Card Options
     *
     * Modify the Card permissions group.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cardOptionsTest() throws ApiException {
        Integer cardId = null;
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        CardOptionsRequest cardOptionsRequest = null;
        CardObject response = api.cardOptions(cardId, accessSignature, accessUserId, accessUserIp, cardOptionsRequest);
        // TODO: test validations
    }

    /**
     * Change Card PIN
     *
     * Change the Card PIN code knowing the current one.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changePinTest() throws ApiException {
        Integer cardId = null;
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        ChangePinRequest changePinRequest = null;
        CardObject response = api.changePin(cardId, accessSignature, accessUserId, accessUserIp, changePinRequest);
        // TODO: test validations
    }

    /**
     * Convert virtual card to physical
     *
     * Convert a virtual Card into a physical one. The converted card will be both virtual and physical. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void convertVirtualTest() throws ApiException {
        Integer cardId = null;
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        ConvertVirtualRequest convertVirtualRequest = null;
        CardObject response = api.convertVirtual(cardId, accessSignature, accessUserId, accessUserIp, convertVirtualRequest);
        // TODO: test validations
    }

    /**
     * Get Card
     *
     * Retrieve a Card based on its &#x60;id&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCardTest() throws ApiException {
        Long cardId = null;
        CardObject response = api.getCard(cardId);
        // TODO: test validations
    }

    /**
     * Get Card Image
     *
     * Retrieve a virtual card image.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCardImageTest() throws ApiException {
        Integer cardId = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        GetCardImage200Response response = api.getCardImage(cardId, accessSignature, accessTag, accessUserId, accessUserIp);
        // TODO: test validations
    }

    /**
     * Search Cards
     *
     * Retrieve Cards based on search criteria.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCardsTest() throws ApiException {
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        Integer cardId = null;
        Integer userId = null;
        String embossedName = null;
        String publicToken = null;
        String permsGroup = null;
        Integer isPhysical = null;
        Integer isConverted = null;
        Integer lockStatus = null;
        Integer mccRestrictionGroupId = null;
        Integer merchantRestrictionGroupId = null;
        Integer countryRestrictionGroupId = null;
        Integer pageNumber = null;
        Integer pageCount = null;
        String sortBy = null;
        String sortOrder = null;
        OffsetDateTime createdDateFrom = null;
        OffsetDateTime createdDateTo = null;
        OffsetDateTime updatedDateFrom = null;
        OffsetDateTime updatedDateTo = null;
        CardObject response = api.getCards(accessSignature, accessTag, accessUserId, accessUserIp, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
        // TODO: test validations
    }

    /**
     * Get Renewal Details
     *
     * Retrieve the Card &#x60;renewalType&#x60;. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRenewalDetailsTest() throws ApiException {
        Integer cardId = null;
        GetRenewalDetails200Response response = api.getRenewalDetails(cardId);
        // TODO: test validations
    }

    /**
     * Register 3D secure
     *
     * Register a card to 3D secure service. The user&#39;s mobile number must begin with &#x60;+&#x60;, or &#x60;00&#x60;, and the country dialing code. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void post3dsTest() throws ApiException {
        String accessSignature = null;
        Post3dsRequest post3dsRequest = null;
        CardObject response = api.post3ds(accessSignature, post3dsRequest);
        // TODO: test validations
    }

    /**
     * Create Physical Card
     *
     * Create a new physical card. To use a card, it must be activated (&#x60;/cards/{id}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCardPhysicalTest() throws ApiException {
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        PostCardVirtualRequest postCardVirtualRequest = null;
        CardObject response = api.postCardPhysical(accessSignature, accessUserId, accessUserIp, postCardVirtualRequest);
        // TODO: test validations
    }

    /**
     * Create Virtual Card
     *
     * Create a new virtual card. To use a card, it must be activated (&#x60;/v1/cards/{cardId}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCardVirtualTest() throws ApiException {
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        PostCardVirtualRequest postCardVirtualRequest = null;
        CardObject response = api.postCardVirtual(accessSignature, accessUserId, accessUserIp, postCardVirtualRequest);
        // TODO: test validations
    }

    /**
     * Update Card
     *
     * Update the restriction groups of the card, as well as the &#x60;cardTag&#x60;. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putCardTest() throws ApiException {
        Integer cardId = null;
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        PutCardRequest putCardRequest = null;
        CardObject response = api.putCard(cardId, accessSignature, accessUserId, accessUserIp, putCardRequest);
        // TODO: test validations
    }

    /**
     * Update Card Limits
     *
     * Modify the Card limits.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putLimitsTest() throws ApiException {
        Integer cardId = null;
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        PutLimitsRequest putLimitsRequest = null;
        CardObject response = api.putLimits(cardId, accessSignature, accessUserId, accessUserIp, putLimitsRequest);
        // TODO: test validations
    }

    /**
     * Renew Card
     *
     * Renew a Card manually. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putRenewTest() throws ApiException {
        Integer cardId = null;
        CardObject response = api.putRenew(cardId);
        // TODO: test validations
    }

    /**
     * Reassign Card
     *
     * Assign the Card to another User or Wallet. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void reassignCardTest() throws ApiException {
        Integer cardId = null;
        String accessToken = null;
        String accessSignature = null;
        ReassignCardRequest reassignCardRequest = null;
        CardObject response = api.reassignCard(cardId, accessToken, accessSignature, reassignCardRequest);
        // TODO: test validations
    }

    /**
     * Regenerate Card
     *
     * Recreate the card image if the card is unlocked.   Useful when changing card design, company name, or when retrieving the image results in a 404. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void regenerateCardTest() throws ApiException {
        Integer cardId = null;
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        ConvertVirtualRequest convertVirtualRequest = null;
        CardObject response = api.regenerateCard(cardId, accessSignature, accessUserId, accessUserIp, convertVirtualRequest);
        // TODO: test validations
    }

    /**
     * Set Card PIN
     *
     * Overwrite the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setPinTest() throws ApiException {
        Integer cardId = null;
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        SetPinRequest setPinRequest = null;
        CardObject response = api.setPin(cardId, accessSignature, accessUserId, accessUserIp, setPinRequest);
        // TODO: test validations
    }

    /**
     * Unblock Card CVC2
     *
     * Unblock a Card whose CVC2 is locked. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unblockCvcTest() throws ApiException {
        Integer cardId = null;
        api.unblockCvc(cardId);
        // TODO: test validations
    }

    /**
     * Unblock Card PIN
     *
     * Unblock the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unblockPinTest() throws ApiException {
        Integer cardId = null;
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        ConvertVirtualRequest convertVirtualRequest = null;
        CardObject response = api.unblockPin(cardId, accessSignature, accessUserId, accessUserIp, convertVirtualRequest);
        // TODO: test validations
    }

    /**
     * Update Card Lock Status
     *
     * Block or unblock a card.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateBlockStatusTest() throws ApiException {
        Integer cardId = null;
        String accessSignature = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        UpdateBlockStatusRequest updateBlockStatusRequest = null;
        CardObject response = api.updateBlockStatus(cardId, accessSignature, accessUserId, accessUserIp, updateBlockStatusRequest);
        // TODO: test validations
    }

    /**
     * Update Renewal Details
     *
     * Update the Card &#x60;renewalType&#x60;. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRenewalDetailsTest() throws ApiException {
        Integer cardId = null;
        UpdateRenewalDetailsRequest updateRenewalDetailsRequest = null;
        GetRenewalDetails200Response response = api.updateRenewalDetails(cardId, updateRenewalDetailsRequest);
        // TODO: test validations
    }

}
