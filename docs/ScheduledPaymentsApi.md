# ScheduledPaymentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteScheduledPayment**](ScheduledPaymentsApi.md#deleteScheduledPayment) | **DELETE** /core-connect/scheduledPayment/{scheduledPaymentId} | Delete Scheduled Payment |
| [**getScheduledPayment**](ScheduledPaymentsApi.md#getScheduledPayment) | **GET** /core-connect/scheduledPayment | Get Scheduled Payment |
| [**getScheduledPaymentOperations**](ScheduledPaymentsApi.md#getScheduledPaymentOperations) | **GET** /core-connect/scheduledPayment/{scheduledPaymentId}/payments | Get Scheduled Payment Operations |
| [**postScheduledPayment**](ScheduledPaymentsApi.md#postScheduledPayment) | **POST** /core-connect/scheduledPayment | Create Scheduled Payment |


<a id="deleteScheduledPayment"></a>
# **deleteScheduledPayment**
> ScheduledPayment1 deleteScheduledPayment(scheduledPaymentId)

Delete Scheduled Payment

Cancel a Scheduled Payment order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduledPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScheduledPaymentsApi apiInstance = new ScheduledPaymentsApi(defaultClient);
    String scheduledPaymentId = "scheduledPaymentId_example"; // String | The unique identifier of the Scheduled Payment order.
    try {
      ScheduledPayment1 result = apiInstance.deleteScheduledPayment(scheduledPaymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduledPaymentsApi#deleteScheduledPayment");
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
| **scheduledPaymentId** | **String**| The unique identifier of the Scheduled Payment order. | |

### Return type

[**ScheduledPayment1**](ScheduledPayment1.md)

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

<a id="getScheduledPayment"></a>
# **getScheduledPayment**
> ScheduledPayment getScheduledPayment(userId, walletId, cursor, pageSize)

Get Scheduled Payment

Retrieve Scheduled Payment orders based on the corresponding &#x60;userId&#x60; and/or &#x60;walletId&#x60;

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduledPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScheduledPaymentsApi apiInstance = new ScheduledPaymentsApi(defaultClient);
    Integer userId = 56; // Integer | The unique identifier of the Wallet to be debited.
    Integer walletId = 56; // Integer | The unique identifier of the User owning the Wallet to debit.
    String cursor = "cursor_example"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page.
    BigDecimal pageSize = new BigDecimal(78); // BigDecimal | Number of results per page.
    try {
      ScheduledPayment result = apiInstance.getScheduledPayment(userId, walletId, cursor, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduledPaymentsApi#getScheduledPayment");
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
| **userId** | **Integer**| The unique identifier of the Wallet to be debited. | [optional] |
| **walletId** | **Integer**| The unique identifier of the User owning the Wallet to debit. | [optional] |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. | [optional] |
| **pageSize** | **BigDecimal**| Number of results per page. | [optional] |

### Return type

[**ScheduledPayment**](ScheduledPayment.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK – Scheduled payment created |  -  |
| **0** | Unexpected error |  -  |

<a id="getScheduledPaymentOperations"></a>
# **getScheduledPaymentOperations**
> GetScheduledPaymentOperations200Response getScheduledPaymentOperations(scheduledPaymentId)

Get Scheduled Payment Operations

Retrieve the list of executed payments for a given Scheduled Payment order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduledPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScheduledPaymentsApi apiInstance = new ScheduledPaymentsApi(defaultClient);
    String scheduledPaymentId = "scheduledPaymentId_example"; // String | The unique identifier of the Scheduled Payment order.
    try {
      GetScheduledPaymentOperations200Response result = apiInstance.getScheduledPaymentOperations(scheduledPaymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduledPaymentsApi#getScheduledPaymentOperations");
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
| **scheduledPaymentId** | **String**| The unique identifier of the Scheduled Payment order. | |

### Return type

[**GetScheduledPaymentOperations200Response**](GetScheduledPaymentOperations200Response.md)

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

<a id="postScheduledPayment"></a>
# **postScheduledPayment**
> ScheduledPayment postScheduledPayment(postScheduledPaymentRequest)

Create Scheduled Payment

Schedule a Payout or a Wallet-to-Wallet transfer for a future date.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduledPaymentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScheduledPaymentsApi apiInstance = new ScheduledPaymentsApi(defaultClient);
    PostScheduledPaymentRequest postScheduledPaymentRequest = new PostScheduledPaymentRequest(); // PostScheduledPaymentRequest | 
    try {
      ScheduledPayment result = apiInstance.postScheduledPayment(postScheduledPaymentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScheduledPaymentsApi#postScheduledPayment");
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
| **postScheduledPaymentRequest** | [**PostScheduledPaymentRequest**](PostScheduledPaymentRequest.md)|  | [optional] |

### Return type

[**ScheduledPayment**](ScheduledPayment.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK – Scheduled payment created |  -  |
| **0** | Unexpected error |  -  |

