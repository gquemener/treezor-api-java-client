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
import org.openapitools.client.model.PutAuth200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Disabled
public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    /**
     * The token endpoint of the authentication server
     *
     * This endpoint is used to exchange authorization codes or refresh tokens for access tokens. The response will include the access token and optionally a refresh token, along with their expiration details.  You may read more about [OAuth2](https://oauth.net/2/). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putAuthTest() throws ApiException {
        String grantType = null;
        String clientId = null;
        String clientSecret = null;
        String scope = null;
        String username = null;
        String password = null;
        String refreshToken = null;
        PutAuth200Response response = api.putAuth(grantType, clientId, clientSecret, scope, username, password, refreshToken);
        // TODO: test validations
    }

}
