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
import org.openapitools.client.model.GetCardsDefaultResponse;
import java.time.OffsetDateTime;
import org.openapitools.client.model.PostUsersRequest;
import org.openapitools.client.model.PutUserRequest;
import org.openapitools.client.model.UserObject;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Disabled
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * Disable User
     *
     * Update the user Status to &#x60;CANCELED&#x60;. See the [Deletion](/guide/users/modifications.html#deletion) article for more information. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        Integer userId = null;
        String origin = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        UserObject response = api.deleteUser(userId, origin, accessSignature, accessTag, accessUserId, accessUserIp);
        // TODO: test validations
    }

    /**
     * Get User
     *
     * Retrieve user&#39;s information for given user&#39;s &#x60;id&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserTest() throws ApiException {
        Integer userId = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        UserObject response = api.getUser(userId, accessSignature, accessTag, accessUserId, accessUserIp);
        // TODO: test validations
    }

    /**
     * Search Users
     *
     * Retrieve Users matching your search criteria.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        Integer userId = null;
        Integer userTypeId = null;
        String userStatus = null;
        String userTag = null;
        Integer specifiedUSPerson = null;
        Integer controllingPersonType = null;
        Integer employeeType = null;
        String email = null;
        String name = null;
        String legalName = null;
        String parentUserId = null;
        Integer pageNumber = null;
        Integer pageCount = null;
        String sortBy = null;
        String sortOrder = null;
        OffsetDateTime createdDateFrom = null;
        OffsetDateTime createdDateTo = null;
        OffsetDateTime updatedDateFrom = null;
        OffsetDateTime updatedDateTo = null;
        UserObject response = api.getUsers(accessSignature, accessTag, accessUserId, accessUserIp, userId, userTypeId, userStatus, userTag, specifiedUSPerson, controllingPersonType, employeeType, email, name, legalName, parentUserId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
        // TODO: test validations
    }

    /**
     * Create User
     *
     * You may read [the dedicated documentation for this feature](/guide/users/introduction.html#creation) 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postUsersTest() throws ApiException {
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        PostUsersRequest postUsersRequest = null;
        UserObject response = api.postUsers(accessSignature, accessTag, accessUserId, accessUserIp, postUsersRequest);
        // TODO: test validations
    }

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

    /**
     * Update User
     *
     * Update user&#39;s information.  This endpoint may require per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putUserTest() throws ApiException {
        Integer userId = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        PutUserRequest putUserRequest = null;
        UserObject response = api.putUser(userId, accessSignature, accessTag, accessUserId, accessUserIp, putUserRequest);
        // TODO: test validations
    }

}
