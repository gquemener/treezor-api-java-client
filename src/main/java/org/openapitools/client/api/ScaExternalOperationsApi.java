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


import org.openapitools.client.model.GetSCAWalletsDefaultResponseInner;
import org.openapitools.client.model.PostExtOperation200Response;
import org.openapitools.client.model.PostExtOperationRequest;
import org.openapitools.client.model.PutExtOperationRequest;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScaExternalOperationsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ScaExternalOperationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ScaExternalOperationsApi(ApiClient apiClient) {
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
     * Build call for postExtOperation
     * @param postExtOperationRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The External Operation was successfully created. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postExtOperationCall(PostExtOperationRequest postExtOperationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = postExtOperationRequest;

        // create path and map variables
        String localVarPath = "/core-connect/sca/externalOperations";

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

        String[] localVarAuthNames = new String[] { "jwt" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call postExtOperationValidateBeforeCall(PostExtOperationRequest postExtOperationRequest, final ApiCallback _callback) throws ApiException {
        return postExtOperationCall(postExtOperationRequest, _callback);

    }

    /**
     * Create External Operation declaration
     * Declare an SCA External Operation (i.e., a sensitive action that was made outside of Treezor services).
     * @param postExtOperationRequest  (optional)
     * @return PostExtOperation200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The External Operation was successfully created. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public PostExtOperation200Response postExtOperation(PostExtOperationRequest postExtOperationRequest) throws ApiException {
        ApiResponse<PostExtOperation200Response> localVarResp = postExtOperationWithHttpInfo(postExtOperationRequest);
        return localVarResp.getData();
    }

    /**
     * Create External Operation declaration
     * Declare an SCA External Operation (i.e., a sensitive action that was made outside of Treezor services).
     * @param postExtOperationRequest  (optional)
     * @return ApiResponse&lt;PostExtOperation200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The External Operation was successfully created. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PostExtOperation200Response> postExtOperationWithHttpInfo(PostExtOperationRequest postExtOperationRequest) throws ApiException {
        okhttp3.Call localVarCall = postExtOperationValidateBeforeCall(postExtOperationRequest, null);
        Type localVarReturnType = new TypeToken<PostExtOperation200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create External Operation declaration (asynchronously)
     * Declare an SCA External Operation (i.e., a sensitive action that was made outside of Treezor services).
     * @param postExtOperationRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The External Operation was successfully created. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call postExtOperationAsync(PostExtOperationRequest postExtOperationRequest, final ApiCallback<PostExtOperation200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = postExtOperationValidateBeforeCall(postExtOperationRequest, _callback);
        Type localVarReturnType = new TypeToken<PostExtOperation200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for putExtOperation
     * @param externalOperationId The unique identifier (uiid) of the ExternalOperation. (required)
     * @param putExtOperationRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The External Operation was successfully updated. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putExtOperationCall(UUID externalOperationId, PutExtOperationRequest putExtOperationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = putExtOperationRequest;

        // create path and map variables
        String localVarPath = "/core-connect/sca/externalOperations/{externalOperationId}"
            .replace("{" + "externalOperationId" + "}", localVarApiClient.escapeString(externalOperationId.toString()));

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

        String[] localVarAuthNames = new String[] { "jwt" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call putExtOperationValidateBeforeCall(UUID externalOperationId, PutExtOperationRequest putExtOperationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'externalOperationId' is set
        if (externalOperationId == null) {
            throw new ApiException("Missing the required parameter 'externalOperationId' when calling putExtOperation(Async)");
        }

        return putExtOperationCall(externalOperationId, putExtOperationRequest, _callback);

    }

    /**
     * Update External Operation declaration
     * Modify an SCA External Operation declaration.   This feature is only available for Per Operation operations, in other words for external operations whose action name is: &#x60;externalMassPayoutOrderCreation&#x60;,  &#x60;externalMassTransferOrderCreation&#x60;, &#x60;externalScheduledPayoutOrder&#x60;, or &#x60;externalScheduledTransferOrder&#x60;. 
     * @param externalOperationId The unique identifier (uiid) of the ExternalOperation. (required)
     * @param putExtOperationRequest  (optional)
     * @return PostExtOperation200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The External Operation was successfully updated. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public PostExtOperation200Response putExtOperation(UUID externalOperationId, PutExtOperationRequest putExtOperationRequest) throws ApiException {
        ApiResponse<PostExtOperation200Response> localVarResp = putExtOperationWithHttpInfo(externalOperationId, putExtOperationRequest);
        return localVarResp.getData();
    }

    /**
     * Update External Operation declaration
     * Modify an SCA External Operation declaration.   This feature is only available for Per Operation operations, in other words for external operations whose action name is: &#x60;externalMassPayoutOrderCreation&#x60;,  &#x60;externalMassTransferOrderCreation&#x60;, &#x60;externalScheduledPayoutOrder&#x60;, or &#x60;externalScheduledTransferOrder&#x60;. 
     * @param externalOperationId The unique identifier (uiid) of the ExternalOperation. (required)
     * @param putExtOperationRequest  (optional)
     * @return ApiResponse&lt;PostExtOperation200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The External Operation was successfully updated. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PostExtOperation200Response> putExtOperationWithHttpInfo(UUID externalOperationId, PutExtOperationRequest putExtOperationRequest) throws ApiException {
        okhttp3.Call localVarCall = putExtOperationValidateBeforeCall(externalOperationId, putExtOperationRequest, null);
        Type localVarReturnType = new TypeToken<PostExtOperation200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update External Operation declaration (asynchronously)
     * Modify an SCA External Operation declaration.   This feature is only available for Per Operation operations, in other words for external operations whose action name is: &#x60;externalMassPayoutOrderCreation&#x60;,  &#x60;externalMassTransferOrderCreation&#x60;, &#x60;externalScheduledPayoutOrder&#x60;, or &#x60;externalScheduledTransferOrder&#x60;. 
     * @param externalOperationId The unique identifier (uiid) of the ExternalOperation. (required)
     * @param putExtOperationRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The External Operation was successfully updated. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Unexpected error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call putExtOperationAsync(UUID externalOperationId, PutExtOperationRequest putExtOperationRequest, final ApiCallback<PostExtOperation200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = putExtOperationValidateBeforeCall(externalOperationId, putExtOperationRequest, _callback);
        Type localVarReturnType = new TypeToken<PostExtOperation200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
