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
import org.openapitools.client.model.GetComputedWalletAccountDetail200Response;
import org.openapitools.client.model.GetRawWalletAccountDetail200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountDetailsApi
 */
@Disabled
public class AccountDetailsApiTest {

    private final AccountDetailsApi api = new AccountDetailsApi();

    /**
     * Get PDF Account Details
     *
     * Retrieve a Wallet RIB and IBAN in PDF format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getComputedWalletAccountDetailTest() throws ApiException {
        String walletId = null;
        GetComputedWalletAccountDetail200Response response = api.getComputedWalletAccountDetail(walletId);
        // TODO: test validations
    }

    /**
     * Get JSON Account Details
     *
     * Retrieve a Wallet RIB and IBAN in json format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRawWalletAccountDetailTest() throws ApiException {
        String walletId = null;
        GetRawWalletAccountDetail200Response response = api.getRawWalletAccountDetail(walletId);
        // TODO: test validations
    }

}
