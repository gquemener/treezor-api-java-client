# OperationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOperations**](OperationsApi.md#getOperations) | **GET** /core-connect/operations | Search Operations |
| [**getOperationsReport**](OperationsApi.md#getOperationsReport) | **GET** /core-connect/operations/{walletId}/report | Get Operations Report |
| [**postOperationsReport**](OperationsApi.md#postOperationsReport) | **POST** /core-connect/operations/{walletId}/report | Create Operations Report |
| [**simulateOperations**](OperationsApi.md#simulateOperations) | **POST** /simulation/operations | Simulate Operations |


<a id="getOperations"></a>
# **getOperations**
> GetOperations200Response getOperations(cardId, walletId, dateFrom, dateTo, pageSize, operationType, cursor)

Search Operations

Retrieve Operations that match your search conditions. The request must specify at least: &#x60;walletId&#x60;, &#x60;dateTo&#x60;, &#x60;dateFrom&#x60;.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html) for operations that are more than 90 days old. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    Long cardId = 56L; // Long | The unique identifier of the card.
    Long walletId = 56L; // Long | The unique identifier of the Wallet.
    OffsetDateTime dateFrom = OffsetDateTime.now(); // OffsetDateTime | The start of the period to take into account operations. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes `2024-01-11T11:25:36%2B01:00`) 
    OffsetDateTime dateTo = OffsetDateTime.now(); // OffsetDateTime | The end of the period to take into account operations. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes `2024-01-11T11:25:36%2B01:00`) 
    Long pageSize = 15L; // Long | Number of results per page
    String operationType = "operationType_example"; // String | The type of operation. Multiple values separated by a comma is authorized. May be:  `cardTransaction`, `bankTransfer`, `instantBankTransfer`, `check`, `walletTransfer`, `bankDirectDebit`, `cardTopup`, `fees`, `creditNote`, `other`  By default, Treezor returns all operation types when this field isn't defined. 
    String cursor = "cursor_example"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page. 
    try {
      GetOperations200Response result = apiInstance.getOperations(cardId, walletId, dateFrom, dateTo, pageSize, operationType, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#getOperations");
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
| **cardId** | **Long**| The unique identifier of the card. | |
| **walletId** | **Long**| The unique identifier of the Wallet. | |
| **dateFrom** | **OffsetDateTime**| The start of the period to take into account operations. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;)  | |
| **dateTo** | **OffsetDateTime**| The end of the period to take into account operations. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;)  | |
| **pageSize** | **Long**| Number of results per page | [optional] [default to 15] |
| **operationType** | **String**| The type of operation. Multiple values separated by a comma is authorized. May be:  &#x60;cardTransaction&#x60;, &#x60;bankTransfer&#x60;, &#x60;instantBankTransfer&#x60;, &#x60;check&#x60;, &#x60;walletTransfer&#x60;, &#x60;bankDirectDebit&#x60;, &#x60;cardTopup&#x60;, &#x60;fees&#x60;, &#x60;creditNote&#x60;, &#x60;other&#x60;  By default, Treezor returns all operation types when this field isn&#39;t defined.  | [optional] |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.  | [optional] |

### Return type

[**GetOperations200Response**](GetOperations200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

<a id="getOperationsReport"></a>
# **getOperationsReport**
> GetOperationsReport200Response getOperationsReport(walletId, dateFrom, dateTo)

Get Operations Report

Retrieve an Operations Report based on the corresponding Wallet &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    Integer walletId = 56; // Integer | The unique identifier of the Wallet.
    String dateFrom = "2024-06-05T00:00:00%2B02:00"; // String | The date and time from which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes `2024-01-11T11:25:36%2B01:00`) 
    String dateTo = "2024-07-05T00:00:00%2B02:00"; // String | The date and time up to which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes `2024-01-11T11:25:36%2B01:00`) 
    try {
      GetOperationsReport200Response result = apiInstance.getOperationsReport(walletId, dateFrom, dateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#getOperationsReport");
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
| **walletId** | **Integer**| The unique identifier of the Wallet. | |
| **dateFrom** | **String**| The date and time from which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;)  | |
| **dateTo** | **String**| The date and time up to which the operations are taken into account for the report. The dates are to be html encoded (e.g., 2024-01-11T11:25:36+01:00 becomes &#x60;2024-01-11T11:25:36%2B01:00&#x60;)  | |

### Return type

[**GetOperationsReport200Response**](GetOperationsReport200Response.md)

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

<a id="postOperationsReport"></a>
# **postOperationsReport**
> postOperationsReport(walletId, postOperationsReportRequest)

Create Operations Report

Create a CSV export that includes all operations for a given Wallet on a given period.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    Integer walletId = 56; // Integer | The unique identifier of the Wallet.
    PostOperationsReportRequest postOperationsReportRequest = new PostOperationsReportRequest(); // PostOperationsReportRequest | 
    try {
      apiInstance.postOperationsReport(walletId, postOperationsReportRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#postOperationsReport");
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
| **walletId** | **Integer**| The unique identifier of the Wallet. | |
| **postOperationsReportRequest** | [**PostOperationsReportRequest**](PostOperationsReportRequest.md)|  | [optional] |

### Return type

null (empty response body)

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

<a id="simulateOperations"></a>
# **simulateOperations**
> simulateOperations(simulateOperationsRequest)

Simulate Operations

Create fake operations for a given Wallet.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    SimulateOperationsRequest simulateOperationsRequest = new SimulateOperationsRequest(); // SimulateOperationsRequest | 
    try {
      apiInstance.simulateOperations(simulateOperationsRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#simulateOperations");
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
| **simulateOperationsRequest** | [**SimulateOperationsRequest**](SimulateOperationsRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

