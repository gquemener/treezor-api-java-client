# SimulationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**simulateAcquiringPayin**](SimulationApi.md#simulateAcquiringPayin) | **POST** /simulation/acquiring/payin | Simulate Acquiring Payin |
| [**simulateCardTransactions**](SimulationApi.md#simulateCardTransactions) | **POST** /simulation/cardtransactions | Simulate Card Transactions |
| [**simulateOperations**](SimulationApi.md#simulateOperations) | **POST** /simulation/operations | Simulate Operations |
| [**simulateSDDR**](SimulationApi.md#simulateSDDR) | **POST** /simulation/payout-sddr | Simulate SDDR Core |
| [**simulateSctInstRecall**](SimulationApi.md#simulateSctInstRecall) | **POST** /simulation/sct-inst/recall | Simulate SCT Inst recall |
| [**simulateSctInstReception**](SimulationApi.md#simulateSctInstReception) | **POST** /simulation/sct-inst/payin | Simulate SCTR Inst |


<a id="simulateAcquiringPayin"></a>
# **simulateAcquiringPayin**
> simulateAcquiringPayin(simulateAcquiringPayinRequest)

Simulate Acquiring Payin

Simulate operations resulting from the card acquisition feature.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    SimulateAcquiringPayinRequest simulateAcquiringPayinRequest = new SimulateAcquiringPayinRequest(); // SimulateAcquiringPayinRequest | 
    try {
      apiInstance.simulateAcquiringPayin(simulateAcquiringPayinRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#simulateAcquiringPayin");
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
| **simulateAcquiringPayinRequest** | [**SimulateAcquiringPayinRequest**](SimulateAcquiringPayinRequest.md)|  | [optional] |

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
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

<a id="simulateCardTransactions"></a>
# **simulateCardTransactions**
> List&lt;SimulateCardTransactions201ResponseInner&gt; simulateCardTransactions(simulateCardTransactionsRequest)

Simulate Card Transactions

Simulate Card Transactions in Sandbox environment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    SimulateCardTransactionsRequest simulateCardTransactionsRequest = new SimulateCardTransactionsRequest(); // SimulateCardTransactionsRequest | 
    try {
      List<SimulateCardTransactions201ResponseInner> result = apiInstance.simulateCardTransactions(simulateCardTransactionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#simulateCardTransactions");
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
| **simulateCardTransactionsRequest** | [**SimulateCardTransactionsRequest**](SimulateCardTransactionsRequest.md)|  | [optional] |

### Return type

[**List&lt;SimulateCardTransactions201ResponseInner&gt;**](SimulateCardTransactions201ResponseInner.md)

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
import org.openapitools.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    SimulateOperationsRequest simulateOperationsRequest = new SimulateOperationsRequest(); // SimulateOperationsRequest | 
    try {
      apiInstance.simulateOperations(simulateOperationsRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#simulateOperations");
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

<a id="simulateSDDR"></a>
# **simulateSDDR**
> simulateSDDR(simulateSDDRRequest)

Simulate SDDR Core

Simulate a received SEPA Direct Debit into one of your Wallet in Sandbox.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    SimulateSDDRRequest simulateSDDRRequest = new SimulateSDDRRequest(); // SimulateSDDRRequest | 
    try {
      apiInstance.simulateSDDR(simulateSDDRRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#simulateSDDR");
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
| **simulateSDDRRequest** | [**SimulateSDDRRequest**](SimulateSDDRRequest.md)|  | [optional] |

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
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

<a id="simulateSctInstRecall"></a>
# **simulateSctInstRecall**
> SimulateSctInstRecall201Response simulateSctInstRecall(simulateSctInstRecallRequest)

Simulate SCT Inst recall

Simulate a recall for an instantaneous SEPA Credit Transfer.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    SimulateSctInstRecallRequest simulateSctInstRecallRequest = new SimulateSctInstRecallRequest(); // SimulateSctInstRecallRequest | 
    try {
      SimulateSctInstRecall201Response result = apiInstance.simulateSctInstRecall(simulateSctInstRecallRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#simulateSctInstRecall");
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
| **simulateSctInstRecallRequest** | [**SimulateSctInstRecallRequest**](SimulateSctInstRecallRequest.md)|  | [optional] |

### Return type

[**SimulateSctInstRecall201Response**](SimulateSctInstRecall201Response.md)

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

<a id="simulateSctInstReception"></a>
# **simulateSctInstReception**
> SimulateSctInstReception201Response simulateSctInstReception(simulateSctInstReceptionRequest)

Simulate SCTR Inst

Simulate the reception of an instantaneous SEPA Credit Transfer into one of your Wallet in Sandbox.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SimulationApi apiInstance = new SimulationApi(defaultClient);
    SimulateSctInstReceptionRequest simulateSctInstReceptionRequest = new SimulateSctInstReceptionRequest(); // SimulateSctInstReceptionRequest | 
    try {
      SimulateSctInstReception201Response result = apiInstance.simulateSctInstReception(simulateSctInstReceptionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SimulationApi#simulateSctInstReception");
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
| **simulateSctInstReceptionRequest** | [**SimulateSctInstReceptionRequest**](SimulateSctInstReceptionRequest.md)|  | [optional] |

### Return type

[**SimulateSctInstReception201Response**](SimulateSctInstReception201Response.md)

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

