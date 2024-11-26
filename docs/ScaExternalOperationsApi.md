# ScaExternalOperationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postExtOperation**](ScaExternalOperationsApi.md#postExtOperation) | **POST** /core-connect/sca/externalOperations | Create External Operation declaration |
| [**putExtOperation**](ScaExternalOperationsApi.md#putExtOperation) | **PUT** /core-connect/sca/externalOperations/{externalOperationId} | Update External Operation declaration |


<a id="postExtOperation"></a>
# **postExtOperation**
> PostExtOperation200Response postExtOperation(postExtOperationRequest)

Create External Operation declaration

Declare an SCA External Operation (i.e., a sensitive action that was made outside of Treezor services).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScaExternalOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScaExternalOperationsApi apiInstance = new ScaExternalOperationsApi(defaultClient);
    PostExtOperationRequest postExtOperationRequest = new PostExtOperationRequest(); // PostExtOperationRequest | 
    try {
      PostExtOperation200Response result = apiInstance.postExtOperation(postExtOperationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScaExternalOperationsApi#postExtOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **postExtOperationRequest** | [**PostExtOperationRequest**](PostExtOperationRequest.md)|  | [optional] |

### Return type

[**PostExtOperation200Response**](PostExtOperation200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The External Operation was successfully created. |  -  |
| **0** | Unexpected error |  -  |

<a id="putExtOperation"></a>
# **putExtOperation**
> PostExtOperation200Response putExtOperation(externalOperationId, putExtOperationRequest)

Update External Operation declaration

Modify an SCA External Operation declaration.   This feature is only available for Per Operation operations, in other words for external operations whose action name is: &#x60;externalMassPayoutOrderCreation&#x60;,  &#x60;externalMassTransferOrderCreation&#x60;, &#x60;externalScheduledPayoutOrder&#x60;, or &#x60;externalScheduledTransferOrder&#x60;. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScaExternalOperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScaExternalOperationsApi apiInstance = new ScaExternalOperationsApi(defaultClient);
    UUID externalOperationId = UUID.randomUUID(); // UUID | The unique identifier (uiid) of the ExternalOperation.
    PutExtOperationRequest putExtOperationRequest = new PutExtOperationRequest(); // PutExtOperationRequest | 
    try {
      PostExtOperation200Response result = apiInstance.putExtOperation(externalOperationId, putExtOperationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScaExternalOperationsApi#putExtOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **externalOperationId** | **UUID**| The unique identifier (uiid) of the ExternalOperation. | |
| **putExtOperationRequest** | [**PutExtOperationRequest**](PutExtOperationRequest.md)|  | [optional] |

### Return type

[**PostExtOperation200Response**](PostExtOperation200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The External Operation was successfully updated. |  -  |
| **0** | Unexpected error |  -  |

