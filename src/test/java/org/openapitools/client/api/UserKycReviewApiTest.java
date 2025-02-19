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
import org.openapitools.client.model.GetCardsDefaultResponse;
import org.openapitools.client.model.UserObject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserKycReviewApi
 */
@Disabled
public class UserKycReviewApiTest {

    private final UserKycReviewApi api = new UserKycReviewApi();

    /**
     * Request KYC Review
     *
     * Request a KYC review for a given user and its children to Treezor. Learn more in the [KYC Request](/guide/user-verification/kyc-request.html) article. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putKycreviewTest() throws ApiException {
        Integer userId = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        UserObject response = api.putKycreview(userId, accessSignature, accessTag, accessUserId, accessUserIp);
        // TODO: test validations
    }

}
