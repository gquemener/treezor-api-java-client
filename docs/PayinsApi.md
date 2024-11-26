# PayinsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePayin**](PayinsApi.md#deletePayin) | **DELETE** /v1/payins/{payinId} | Delete Payin |
| [**getPayin**](PayinsApi.md#getPayin) | **GET** /v1/payins/{payinId} | Get Payin |
| [**getPayins**](PayinsApi.md#getPayins) | **GET** /v1/payins | Search Payins |
| [**postPayin**](PayinsApi.md#postPayin) | **POST** /v1/payins | Create Payin |


<a id="deletePayin"></a>
# **deletePayin**
> PayinObject deletePayin(payinId)

Delete Payin

Cancels a Payin. This endpoint is only available for the [Check cashing](/guide/cheques/introduction.html) feature, prior to the check reception at the treatment center. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    PayinsApi apiInstance = new PayinsApi(defaultClient);
    String payinId = "payinId_example"; // String | The unique identifier of the payin.
    try {
      PayinObject result = apiInstance.deletePayin(payinId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayinsApi#deletePayin");
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
| **payinId** | **String**| The unique identifier of the payin. | |

### Return type

[**PayinObject**](PayinObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

<a id="getPayin"></a>
# **getPayin**
> PayinObject getPayin(payinId)

Get Payin

Retrieve a payin by its id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    PayinsApi apiInstance = new PayinsApi(defaultClient);
    String payinId = "payinId_example"; // String | The unique identifier of the payin.
    try {
      PayinObject result = apiInstance.getPayin(payinId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayinsApi#getPayin");
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
| **payinId** | **String**| The unique identifier of the payin. | |

### Return type

[**PayinObject**](PayinObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

<a id="getPayins"></a>
# **getPayins**
> PayinObject getPayins(accessSignature, accessTag, accessUserId, accessUserIp, payinId, walletId, payinTag, payinStatus, userId, userName, userEmail, beneficiaryUserId, eventAlias, walletTypeId, paymentMethodId, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, cursor)

Search Payins

Get payins that match search criteria.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    PayinsApi apiInstance = new PayinsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    Integer accessUserIp = 56; // Integer | Legacy attribute, do not use. 
    Integer payinId = 56; // Integer | The unique identifier of the payin.
    Integer walletId = 56; // Integer | Payin's wallet id.
    String payinTag = "payinTag_example"; // String | Client custom data.
    String payinStatus = "payinStatus_example"; // String | The status of the payin.
    String userId = "userId_example"; // String | The unique identifier of the User who performed the operation (debited).
    String userName = "userName_example"; // String | The name of the User who performed the operation (debited).
    String userEmail = "userEmail_example"; // String | The email of the User who performed the operation (debited).
    Integer beneficiaryUserId = 56; // Integer | The unique identifier of the User who received the operation (credited).
    String eventAlias = "eventAlias_example"; // String | The name of the credited Wallet.
    Integer walletTypeId = 56; // Integer | Payin's wallet type id.
    String paymentMethodId = "20"; // String | Payin's payment method id.
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    String cursor = "cursor_example"; // String | 
    try {
      PayinObject result = apiInstance.getPayins(accessSignature, accessTag, accessUserId, accessUserIp, payinId, walletId, payinTag, payinStatus, userId, userName, userEmail, beneficiaryUserId, eventAlias, walletTypeId, paymentMethodId, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayinsApi#getPayins");
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
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **payinId** | **Integer**| The unique identifier of the payin. | [optional] |
| **walletId** | **Integer**| Payin&#39;s wallet id. | [optional] |
| **payinTag** | **String**| Client custom data. | [optional] |
| **payinStatus** | **String**| The status of the payin. | [optional] |
| **userId** | **String**| The unique identifier of the User who performed the operation (debited). | [optional] |
| **userName** | **String**| The name of the User who performed the operation (debited). | [optional] |
| **userEmail** | **String**| The email of the User who performed the operation (debited). | [optional] |
| **beneficiaryUserId** | **Integer**| The unique identifier of the User who received the operation (credited). | [optional] |
| **eventAlias** | **String**| The name of the credited Wallet. | [optional] |
| **walletTypeId** | **Integer**| Payin&#39;s wallet type id. | [optional] |
| **paymentMethodId** | **String**| Payin&#39;s payment method id. | [optional] [enum: 20, 21, 23, 24, 25, 26, 27] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **cursor** | **String**|  | [optional] |

### Return type

[**PayinObject**](PayinObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

<a id="postPayin"></a>
# **postPayin**
> PayinObject postPayin(accessSignature, accessTag, accessUserId, accessUserIp, postPayinRequest)

Create Payin

Create a new payin.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayinsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    PayinsApi apiInstance = new PayinsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PostPayinRequest postPayinRequest = new PostPayinRequest(); // PostPayinRequest | 
    try {
      PayinObject result = apiInstance.postPayin(accessSignature, accessTag, accessUserId, accessUserIp, postPayinRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayinsApi#postPayin");
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
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **postPayinRequest** | [**PostPayinRequest**](PostPayinRequest.md)|  | [optional] |

### Return type

[**PayinObject**](PayinObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

