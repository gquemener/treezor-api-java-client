# CardsBulkCreationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBulkCard**](CardsBulkCreationApi.md#getBulkCard) | **GET** /core-connect/card/bulk | Get Bulk Card Order |
| [**getCardBulkReport**](CardsBulkCreationApi.md#getCardBulkReport) | **GET** /core-connect/card/bulk/{id}/report | Get Report |
| [**postBulkCard**](CardsBulkCreationApi.md#postBulkCard) | **POST** /core-connect/card/bulk | Create Bulk Card Order |


<a id="getBulkCard"></a>
# **getBulkCard**
> GetBulkCard200Response getBulkCard()

Get Bulk Card Order

Search bulk card orders.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsBulkCreationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsBulkCreationApi apiInstance = new CardsBulkCreationApi(defaultClient);
    try {
      GetBulkCard200Response result = apiInstance.getBulkCard();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsBulkCreationApi#getBulkCard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetBulkCard200Response**](GetBulkCard200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a id="getCardBulkReport"></a>
# **getCardBulkReport**
> GetCardBulkReport200Response getCardBulkReport(id)

Get Report

Get a link to download the bulk creation report.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsBulkCreationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsBulkCreationApi apiInstance = new CardsBulkCreationApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of the card bulk creation.
    try {
      GetCardBulkReport200Response result = apiInstance.getCardBulkReport(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsBulkCreationApi#getCardBulkReport");
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
| **id** | **String**| The unique identifier of the card bulk creation. | |

### Return type

[**GetCardBulkReport200Response**](GetCardBulkReport200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a id="postBulkCard"></a>
# **postBulkCard**
> GetBulkCard200Response postBulkCard(postBulkCardRequest)

Create Bulk Card Order

Create a Bulk Card order to create multiple cards at once.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsBulkCreationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsBulkCreationApi apiInstance = new CardsBulkCreationApi(defaultClient);
    PostBulkCardRequest postBulkCardRequest = new PostBulkCardRequest(); // PostBulkCardRequest | 
    try {
      GetBulkCard200Response result = apiInstance.postBulkCard(postBulkCardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsBulkCreationApi#postBulkCard");
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
| **postBulkCardRequest** | [**PostBulkCardRequest**](PostBulkCardRequest.md)|  | [optional] |

### Return type

[**GetBulkCard200Response**](GetBulkCard200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **0** | Unexpected error |  -  |

