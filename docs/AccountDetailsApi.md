# AccountDetailsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getComputedWalletAccountDetail**](AccountDetailsApi.md#getComputedWalletAccountDetail) | **GET** /core-connect/account-details/{walletId}/computed | Get PDF Account Details |
| [**getRawWalletAccountDetail**](AccountDetailsApi.md#getRawWalletAccountDetail) | **GET** /core-connect/account-details/{walletId}/raw | Get JSON Account Details |


<a id="getComputedWalletAccountDetail"></a>
# **getComputedWalletAccountDetail**
> GetComputedWalletAccountDetail200Response getComputedWalletAccountDetail(walletId)

Get PDF Account Details

Retrieve a Wallet RIB and IBAN in PDF format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountDetailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AccountDetailsApi apiInstance = new AccountDetailsApi(defaultClient);
    String walletId = "walletId_example"; // String | The unique identifier of the Wallet.
    try {
      GetComputedWalletAccountDetail200Response result = apiInstance.getComputedWalletAccountDetail(walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDetailsApi#getComputedWalletAccountDetail");
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
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

<a id="getRawWalletAccountDetail"></a>
# **getRawWalletAccountDetail**
> GetRawWalletAccountDetail200Response getRawWalletAccountDetail(walletId)

Get JSON Account Details

Retrieve a Wallet RIB and IBAN in json format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountDetailsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AccountDetailsApi apiInstance = new AccountDetailsApi(defaultClient);
    String walletId = "walletId_example"; // String | The unique identifier of the Wallet.
    try {
      GetRawWalletAccountDetail200Response result = apiInstance.getRawWalletAccountDetail(walletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountDetailsApi#getRawWalletAccountDetail");
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

### Return type

[**GetRawWalletAccountDetail200Response**](GetRawWalletAccountDetail200Response.md)

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

