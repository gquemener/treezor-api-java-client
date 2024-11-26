# VerificationSolutionsKycApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postKycVconf**](VerificationSolutionsKycApi.md#postKycVconf) | **POST** /v1/users/{userId}/videoconference | Initiate Video Conference Verification |
| [**postKycliveness**](VerificationSolutionsKycApi.md#postKycliveness) | **POST** /v1/users/{userId}/kycliveness | Initiate Live Verification |
| [**postKycqes**](VerificationSolutionsKycApi.md#postKycqes) | **POST** /v1/users/{userId}/qes | Initiate QES Verification |
| [**putKycLiveness**](VerificationSolutionsKycApi.md#putKycLiveness) | **PUT** /v1/users/{userId}/kycliveness | Retrieve and Upload Live Verification Result |


<a id="postKycVconf"></a>
# **postKycVconf**
> PostKycqes201Response postKycVconf(userId, postKycqesRequest)

Initiate Video Conference Verification

Start the [Video conference verification](/guide/user-verification/videoconf.html) process. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VerificationSolutionsKycApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    VerificationSolutionsKycApi apiInstance = new VerificationSolutionsKycApi(defaultClient);
    Integer userId = 56; // Integer | The unique identifier of the user.
    PostKycqesRequest postKycqesRequest = new PostKycqesRequest(); // PostKycqesRequest | 
    try {
      PostKycqes201Response result = apiInstance.postKycVconf(userId, postKycqesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationSolutionsKycApi#postKycVconf");
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
| **userId** | **Integer**| The unique identifier of the user. | |
| **postKycqesRequest** | [**PostKycqesRequest**](PostKycqesRequest.md)|  | [optional] |

### Return type

[**PostKycqes201Response**](PostKycqes201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **403** | Forbidden |  -  |
| **428** | Precondition Required. |  -  |
| **500** | nternal server error |  -  |
| **0** | Unexpected error |  -  |

<a id="postKycliveness"></a>
# **postKycliveness**
> PostKycliveness201Response postKycliveness(userId, postKyclivenessRequest)

Initiate Live Verification

Start the Live Verficiation process, whether it is KYC Liveness or Certified Video. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VerificationSolutionsKycApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    VerificationSolutionsKycApi apiInstance = new VerificationSolutionsKycApi(defaultClient);
    Integer userId = 56; // Integer | The unique identifier of the user.
    PostKyclivenessRequest postKyclivenessRequest = new PostKyclivenessRequest(); // PostKyclivenessRequest | 
    try {
      PostKycliveness201Response result = apiInstance.postKycliveness(userId, postKyclivenessRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationSolutionsKycApi#postKycliveness");
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
| **userId** | **Integer**| The unique identifier of the user. | |
| **postKyclivenessRequest** | [**PostKyclivenessRequest**](PostKyclivenessRequest.md)|  | [optional] |

### Return type

[**PostKycliveness201Response**](PostKycliveness201Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | 201 response |  -  |
| **400** | 400 response is returned when the request is invalid i.e missing userId  |  -  |
| **401** | 401 response is returned when the Authorization header is missing |  -  |
| **403** | 403 response is returned when your agent is not found in our services  |  -  |
| **428** | 428 response is returned if specified userId is not found in our services  |  -  |
| **500** | 500 response is returned for an internal error |  -  |
| **504** | Internal server error : response is returned when the request did not respond on time  |  -  |
| **0** | Unexpected error |  -  |

<a id="postKycqes"></a>
# **postKycqes**
> PostKycqes201Response postKycqes(userId, postKycqesRequest)

Initiate QES Verification

Start the qualified electronic signature (QES) verification.  

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VerificationSolutionsKycApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    VerificationSolutionsKycApi apiInstance = new VerificationSolutionsKycApi(defaultClient);
    Integer userId = 56; // Integer | The unique identifier of the user.
    PostKycqesRequest postKycqesRequest = new PostKycqesRequest(); // PostKycqesRequest | 
    try {
      PostKycqes201Response result = apiInstance.postKycqes(userId, postKycqesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationSolutionsKycApi#postKycqes");
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
| **userId** | **Integer**| The unique identifier of the user. | |
| **postKycqesRequest** | [**PostKycqesRequest**](PostKycqesRequest.md)|  | [optional] |

### Return type

[**PostKycqes201Response**](PostKycqes201Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |
| **410** | Gone |  -  |
| **500** | nternal server error |  -  |
| **0** | Unexpected error |  -  |

<a id="putKycLiveness"></a>
# **putKycLiveness**
> Object putKycLiveness(userId)

Retrieve and Upload Live Verification Result

Retrieve the live verification results, and make them available to Treezor. You may read [the dedicated documentation for this feature](/guide/user-verification/live-verification.html) 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VerificationSolutionsKycApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    VerificationSolutionsKycApi apiInstance = new VerificationSolutionsKycApi(defaultClient);
    Integer userId = 56; // Integer | The unique identifier of the user.
    try {
      Object result = apiInstance.putKycLiveness(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationSolutionsKycApi#putKycLiveness");
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
| **userId** | **Integer**| The unique identifier of the user. | |

### Return type

**Object**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |
| **400** | 400 response is returned when the request is incorrect e.g., missing userId  |  -  |
| **401** | 401 response is returned when the Authorization header is missing |  -  |
| **403** | 403 response is returned when your agent is not found in our services  |  -  |
| **404** | 404 response is returned when the identification is not found in our services  |  -  |
| **405** | 405 response is returned when the documents can not be stored in our services  |  -  |
| **406** | 406 response is returned when last initiated identification for userId is not in processed state.  |  -  |
| **410** | 410 response is returned when the identification no longer exists |  -  |
| **504** | Internal server error : response is returned when the request did not respond on time  |  -  |
| **0** | Unexpected error |  -  |

