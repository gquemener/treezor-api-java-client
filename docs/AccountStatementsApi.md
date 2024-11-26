# AccountStatementsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPdfAccountStatement**](AccountStatementsApi.md#getPdfAccountStatement) | **GET** /core-connect/statements/{walletId}/computed | Get PDF Account Statement |
| [**getRawStatement**](AccountStatementsApi.md#getRawStatement) | **GET** /core-connect/statements/{walletId}/raw | Get JSON Account Statement |


<a id="getPdfAccountStatement"></a>
# **getPdfAccountStatement**
> GetComputedWalletAccountDetail200Response getPdfAccountStatement(walletId, month, year)

Get PDF Account Statement

Retrieve a Wallet account statement in pdf format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountStatementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AccountStatementsApi apiInstance = new AccountStatementsApi(defaultClient);
    String walletId = "walletId_example"; // String | The unique identifier of the Wallet.
    Integer month = 56; // Integer | The month of the statement (2 digits leading with `0`)
    Integer year = 56; // Integer | The year of the statement (4 digits, e.g., `2022`)
    try {
      GetComputedWalletAccountDetail200Response result = apiInstance.getPdfAccountStatement(walletId, month, year);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountStatementsApi#getPdfAccountStatement");
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
| **walletId** | **String**| The unique identifier of the Wallet. | |
| **month** | **Integer**| The month of the statement (2 digits leading with &#x60;0&#x60;) | |
| **year** | **Integer**| The year of the statement (4 digits, e.g., &#x60;2022&#x60;) | |

### Return type

[**GetComputedWalletAccountDetail200Response**](GetComputedWalletAccountDetail200Response.md)

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

<a id="getRawStatement"></a>
# **getRawStatement**
> GetRawStatement200Response getRawStatement(walletId, month, year)

Get JSON Account Statement

Retrieve the raw data (json) to build a Wallet account statement.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountStatementsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AccountStatementsApi apiInstance = new AccountStatementsApi(defaultClient);
    String walletId = "walletId_example"; // String | The unique identifier of the Wallet.
    Integer month = 56; // Integer | The month of the statement (2 digits, e.g., `02`)
    Integer year = 56; // Integer | The year of the statement (4 digits, e.g., `2023`)
    try {
      GetRawStatement200Response result = apiInstance.getRawStatement(walletId, month, year);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountStatementsApi#getRawStatement");
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
| **walletId** | **String**| The unique identifier of the Wallet. | |
| **month** | **Integer**| The month of the statement (2 digits, e.g., &#x60;02&#x60;) | |
| **year** | **Integer**| The year of the statement (4 digits, e.g., &#x60;2023&#x60;) | |

### Return type

[**GetRawStatement200Response**](GetRawStatement200Response.md)

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

