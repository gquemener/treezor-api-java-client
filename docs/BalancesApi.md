# BalancesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBalances**](BalancesApi.md#getBalances) | **GET** /v1/balances | Search Balances |
| [**getWalletBalanceHistory**](BalancesApi.md#getWalletBalanceHistory) | **GET** /core-connect/balance/{walletId}/balance | Get Wallet Balance history |


<a id="getBalances"></a>
# **getBalances**
> GetBalances200Response getBalances(accessSignature, accessTag, accessUserId, accessUserIp, walletId, userId)

Search Balances

Retrieve Balances for a given &#x60;walletId&#x60; or &#x60;userId&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    BalancesApi apiInstance = new BalancesApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    Integer walletId = 56; // Integer | The unique identifier of the Wallet whose Balance is to be retrieved.
    Integer userId = 56; // Integer | The unique identifier of the User whose Wallet Balances are to be retrieved.
    try {
      GetBalances200Response result = apiInstance.getBalances(accessSignature, accessTag, accessUserId, accessUserIp, walletId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancesApi#getBalances");
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
| **walletId** | **Integer**| The unique identifier of the Wallet whose Balance is to be retrieved. | [optional] |
| **userId** | **Integer**| The unique identifier of the User whose Wallet Balances are to be retrieved. | [optional] |

### Return type

[**GetBalances200Response**](GetBalances200Response.md)

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

<a id="getWalletBalanceHistory"></a>
# **getWalletBalanceHistory**
> GetWalletBalanceHistory200Response getWalletBalanceHistory(walletId, dateFrom, dateTo)

Get Wallet Balance history

Retrieve the Balance History of a Wallet.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BalancesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    BalancesApi apiInstance = new BalancesApi(defaultClient);
    Integer walletId = 56; // Integer | The unique identifier of the Wallet.
    String dateFrom = "dateFrom_example"; // String | Start date in RFC 3339 format
    String dateTo = "dateTo_example"; // String | End date in RFC-3339 format
    try {
      GetWalletBalanceHistory200Response result = apiInstance.getWalletBalanceHistory(walletId, dateFrom, dateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BalancesApi#getWalletBalanceHistory");
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
| **dateFrom** | **String**| Start date in RFC 3339 format | [optional] |
| **dateTo** | **String**| End date in RFC-3339 format | [optional] |

### Return type

[**GetWalletBalanceHistory200Response**](GetWalletBalanceHistory200Response.md)

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

