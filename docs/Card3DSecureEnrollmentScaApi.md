# Card3DSecureEnrollmentScaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteAuthMethods**](Card3DSecureEnrollmentScaApi.md#deleteAuthMethods) | **DELETE** /v1/cards/{cardId}/authentication-methods/{methodId} | Delete Authentication Method |
| [**getAuthMethods**](Card3DSecureEnrollmentScaApi.md#getAuthMethods) | **GET** /v1/cards/{cardId}/authentication-methods | Get Authenticaton Methods |
| [**getAuthMethodsDetails**](Card3DSecureEnrollmentScaApi.md#getAuthMethodsDetails) | **GET** /v1/cards/{cardId}/authentication-methods/{methodId} | Get Authentication Method |
| [**postAuthMethods**](Card3DSecureEnrollmentScaApi.md#postAuthMethods) | **POST** /v1/cards/{cardId}/authentication-methods | Create Authenticaton Methods |


<a id="deleteAuthMethods"></a>
# **deleteAuthMethods**
> deleteAuthMethods(cardId, methodId)

Delete Authentication Method

Delete the authentication method of a Card. Only available for OOB method.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Card3DSecureEnrollmentScaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    Card3DSecureEnrollmentScaApi apiInstance = new Card3DSecureEnrollmentScaApi(defaultClient);
    String cardId = "cardId_example"; // String | The unique identifier of the Card.
    String methodId = "methodId_example"; // String | The unique identifier of the authentication method.
    try {
      apiInstance.deleteAuthMethods(cardId, methodId);
    } catch (ApiException e) {
      System.err.println("Exception when calling Card3DSecureEnrollmentScaApi#deleteAuthMethods");
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
| **cardId** | **String**| The unique identifier of the Card. | |
| **methodId** | **String**| The unique identifier of the authentication method. | |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | The auth method has been removed |  -  |
| **400** | Unknown card ID |  -  |
| **404** | Auth method not found |  -  |
| **500** | Internal server error |  -  |
| **0** | Unexpected error |  -  |

<a id="getAuthMethods"></a>
# **getAuthMethods**
> GetAuthMethods200Response getAuthMethods(cardId)

Get Authenticaton Methods

Retrieve the authentication methods of a Card. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Card3DSecureEnrollmentScaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    Card3DSecureEnrollmentScaApi apiInstance = new Card3DSecureEnrollmentScaApi(defaultClient);
    String cardId = "cardId_example"; // String | The unique identifier of the Card.
    try {
      GetAuthMethods200Response result = apiInstance.getAuthMethods(cardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Card3DSecureEnrollmentScaApi#getAuthMethods");
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
| **cardId** | **String**| The unique identifier of the Card. | |

### Return type

[**GetAuthMethods200Response**](GetAuthMethods200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="getAuthMethodsDetails"></a>
# **getAuthMethodsDetails**
> Object getAuthMethodsDetails(cardId, methodId)

Get Authentication Method

Retrieve details regarding the authentication method of a Card

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Card3DSecureEnrollmentScaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    Card3DSecureEnrollmentScaApi apiInstance = new Card3DSecureEnrollmentScaApi(defaultClient);
    String cardId = "cardId_example"; // String | The unique identifier of the Card.
    String methodId = "methodId_example"; // String | The unique identifier of the authentication method.
    try {
      Object result = apiInstance.getAuthMethodsDetails(cardId, methodId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Card3DSecureEnrollmentScaApi#getAuthMethodsDetails");
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
| **cardId** | **String**| The unique identifier of the Card. | |
| **methodId** | **String**| The unique identifier of the authentication method. | |

### Return type

**Object**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Unknown card ID |  -  |
| **404** | Auth method not found |  -  |
| **500** | Internal server error |  -  |
| **0** | Unexpected error |  -  |

<a id="postAuthMethods"></a>
# **postAuthMethods**
> GetAuthMethods200Response postAuthMethods(cardId, postAuthMethodsRequest)

Create Authenticaton Methods

Define the authentication method of a Card. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.Card3DSecureEnrollmentScaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    Card3DSecureEnrollmentScaApi apiInstance = new Card3DSecureEnrollmentScaApi(defaultClient);
    String cardId = "cardId_example"; // String | The unique identifier of the Card.
    PostAuthMethodsRequest postAuthMethodsRequest = new PostAuthMethodsRequest(); // PostAuthMethodsRequest | 
    try {
      GetAuthMethods200Response result = apiInstance.postAuthMethods(cardId, postAuthMethodsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Card3DSecureEnrollmentScaApi#postAuthMethods");
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
| **cardId** | **String**| The unique identifier of the Card. | |
| **postAuthMethodsRequest** | [**PostAuthMethodsRequest**](PostAuthMethodsRequest.md)|  | [optional] |

### Return type

[**GetAuthMethods200Response**](GetAuthMethods200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

