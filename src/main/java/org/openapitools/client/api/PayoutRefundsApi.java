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

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.DefaultError;
import org.openapitools.client.model.PostPayoutRefund200Response;
import org.openapitools.client.model.PostPayoutRefundRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayoutRefundsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PayoutRefundsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PayoutRefundsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getPayoutRefund
     * @param payoutRefundId The unique identifier of the payout refund. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPayoutRefundCall(String payoutRefundId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/payoutRefunds/{payoutRefundId}"
            .replace("{" + "payoutRefundId" + "}", localVarApiClient.escapeString(payoutRefundId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPayoutRefundValidateBeforeCall(String payoutRefundId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'payoutRefundId' is set
        if (payoutRefundId == null) {
            throw new ApiException("Missing the required parameter 'payoutRefundId' when calling getPayoutRefund(Async)");
        }

        return getPayoutRefundCall(payoutRefundId, _callback);

    }

    /**
     * Get Payout Refund
     * Retrieve a given Payout Refund with its &#x60;id&#x60;. 
     * @param payoutRefundId The unique identifier of the payout refund. (required)
     * @return PostPayoutRefund200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public PostPayoutRefund200Response getPayoutRefund(String payoutRefundId) throws ApiException {
        ApiResponse<PostPayoutRefund200Response> localVarResp = getPayoutRefundWithHttpInfo(payoutRefundId);
        return localVarResp.getData();
    }

    /**
     * Get Payout Refund
     * Retrieve a given Payout Refund with its &#x60;id&#x60;. 
     * @param payoutRefundId The unique identifier of the payout refund. (required)
     * @return ApiResponse&lt;PostPayoutRefund200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PostPayoutRefund200Response> getPayoutRefundWithHttpInfo(String payoutRefundId) throws ApiException {
        okhttp3.Call localVarCall = getPayoutRefundValidateBeforeCall(payoutRefundId, null);
        Type localVarReturnType = new TypeToken<PostPayoutRefund200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Payout Refund (asynchronously)
     * Retrieve a given Payout Refund with its &#x60;id&#x60;. 
     * @param payoutRefundId The unique identifier of the payout refund. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPayoutRefundAsync(String payoutRefundId, final ApiCallback<PostPayoutRefund200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPayoutRefundValidateBeforeCall(payoutRefundId, _callback);
        Type localVarReturnType = new TypeToken<PostPayoutRefund200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for postPayoutRefund
     * @param postPayoutRefundRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postPayoutRefundCall(PostPayoutRefundRequest postPayoutRefundRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = postPayoutRefundRequest;

        // create path and map variables
        String localVarPath = "/v1/payoutRefunds";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postPayoutRefundValidateBeforeCall(PostPayoutRefundRequest postPayoutRefundRequest, final ApiCallback _callback) throws ApiException {
        return postPayoutRefundCall(postPayoutRefundRequest, _callback);

    }

    /**
     * Create Payout Refund
     * Create a Payout Refund.  As of today, this feature is only available for [emitting SCTE Inst Recalls](/guide/transfers/sepa-recalls.html#emitting-scte-inst-recalls). Otherwise, you need to [open a ticket](https://treezor.zendesk.com/hc/en-us/articles/4402731372306-How-to-create-a-Zendesk-ticket) to request payout recalls. 
     * @param postPayoutRefundRequest  (optional)
     * @return PostPayoutRefund200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public PostPayoutRefund200Response postPayoutRefund(PostPayoutRefundRequest postPayoutRefundRequest) throws ApiException {
        ApiResponse<PostPayoutRefund200Response> localVarResp = postPayoutRefundWithHttpInfo(postPayoutRefundRequest);
        return localVarResp.getData();
    }

    /**
     * Create Payout Refund
     * Create a Payout Refund.  As of today, this feature is only available for [emitting SCTE Inst Recalls](/guide/transfers/sepa-recalls.html#emitting-scte-inst-recalls). Otherwise, you need to [open a ticket](https://treezor.zendesk.com/hc/en-us/articles/4402731372306-How-to-create-a-Zendesk-ticket) to request payout recalls. 
     * @param postPayoutRefundRequest  (optional)
     * @return ApiResponse&lt;PostPayoutRefund200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PostPayoutRefund200Response> postPayoutRefundWithHttpInfo(PostPayoutRefundRequest postPayoutRefundRequest) throws ApiException {
        okhttp3.Call localVarCall = postPayoutRefundValidateBeforeCall(postPayoutRefundRequest, null);
        Type localVarReturnType = new TypeToken<PostPayoutRefund200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Payout Refund (asynchronously)
     * Create a Payout Refund.  As of today, this feature is only available for [emitting SCTE Inst Recalls](/guide/transfers/sepa-recalls.html#emitting-scte-inst-recalls). Otherwise, you need to [open a ticket](https://treezor.zendesk.com/hc/en-us/articles/4402731372306-How-to-create-a-Zendesk-ticket) to request payout recalls. 
     * @param postPayoutRefundRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postPayoutRefundAsync(PostPayoutRefundRequest postPayoutRefundRequest, final ApiCallback<PostPayoutRefund200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = postPayoutRefundValidateBeforeCall(postPayoutRefundRequest, _callback);
        Type localVarReturnType = new TypeToken<PostPayoutRefund200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
