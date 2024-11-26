# ScaWalletsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteScaWallet**](ScaWalletsApi.md#deleteScaWallet) | **DELETE** /core-connect/sca/scawallets/{scaWalletId} | Delete SCA Wallet |
| [**getSCAWallets**](ScaWalletsApi.md#getSCAWallets) | **GET** /core-connect/sca/scawallets | Search SCA Wallets |
| [**getScaWallet**](ScaWalletsApi.md#getScaWallet) | **GET** /core-connect/sca/scawallets/{scaWalletId} | Get SCA Wallet |
| [**postScaWallet**](ScaWalletsApi.md#postScaWallet) | **POST** /core-connect/sca/scawallets | Create SCA Wallet |
| [**putScaWallet**](ScaWalletsApi.md#putScaWallet) | **PUT** /core-connect/sca/scawallets/{scaWalletId}/lock | Lock SCA Wallet |
| [**resetScaWalletPin**](ScaWalletsApi.md#resetScaWalletPin) | **PUT** /core-connect/sca/scawallets/{scaWalletId}/resetPin | Reset PIN |
| [**setPasscode**](ScaWalletsApi.md#setPasscode) | **PUT** /core-connect/sca/setPasscode | Change Passcode |
| [**swapSCAWallets**](ScaWalletsApi.md#swapSCAWallets) | **POST** /core-connect/sca/scawallets/swap | Swap SCA Wallets |
| [**unlockScaWallet**](ScaWalletsApi.md#unlockScaWallet) | **PUT** /core-connect/sca/scawallets/{scaWalletId}/unlock | Unlock SCA Wallet |


<a id="deleteScaWallet"></a>
# **deleteScaWallet**
> ScaWalletObject deleteScaWallet(scaWalletId)

Delete SCA Wallet

Permanently delete an SCA Wallet.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScaWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScaWalletsApi apiInstance = new ScaWalletsApi(defaultClient);
    String scaWalletId = "scaWalletId_example"; // String | The unique identifier of the SCA Wallet.
    try {
      ScaWalletObject result = apiInstance.deleteScaWallet(scaWalletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScaWalletsApi#deleteScaWallet");
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
| **scaWalletId** | **String**| The unique identifier of the SCA Wallet. | |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The wallet was successfully deleted. |  -  |
| **0** | Unexpected error |  -  |

<a id="getSCAWallets"></a>
# **getSCAWallets**
> ScaWalletObject getSCAWallets(userId, cursor)

Search SCA Wallets

Retrieve the list of [SCA Wallets](/guide/strong-customer-authentication/sca-wallets.html) for a given user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScaWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScaWalletsApi apiInstance = new ScaWalletsApi(defaultClient);
    String userId = "123456"; // String | The unique identifier of the user.
    String cursor = "cursor_example"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page.
    try {
      ScaWalletObject result = apiInstance.getSCAWallets(userId, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScaWalletsApi#getSCAWallets");
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
| **userId** | **String**| The unique identifier of the user. | |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. | [optional] |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of wallet was successfully retrieved. |  -  |
| **0** | Unexpected error |  -  |

<a id="getScaWallet"></a>
# **getScaWallet**
> ScaWalletObject getScaWallet(scaWalletId)

Get SCA Wallet

Retrieve an SCA Wallet by providing its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScaWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScaWalletsApi apiInstance = new ScaWalletsApi(defaultClient);
    String scaWalletId = "scaWalletId_example"; // String | The unique identifier of the SCA Wallet.
    try {
      ScaWalletObject result = apiInstance.getScaWallet(scaWalletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScaWalletsApi#getScaWallet");
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
| **scaWalletId** | **String**| The unique identifier of the SCA Wallet. | |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The wallet was successfully retrieved. |  -  |
| **404** | The wallet was not found. |  -  |
| **0** | Unexpected error |  -  |

<a id="postScaWallet"></a>
# **postScaWallet**
> ScaWalletObject postScaWallet(postScaWalletRequest)

Create SCA Wallet

Create a new [SCA Wallet](/guide/strong-customer-authentication/sca-wallets.html) manually.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScaWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScaWalletsApi apiInstance = new ScaWalletsApi(defaultClient);
    PostScaWalletRequest postScaWalletRequest = new PostScaWalletRequest(); // PostScaWalletRequest | 
    try {
      ScaWalletObject result = apiInstance.postScaWallet(postScaWalletRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScaWalletsApi#postScaWallet");
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
| **postScaWalletRequest** | [**PostScaWalletRequest**](PostScaWalletRequest.md)|  | [optional] |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The wallet was successfully created. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="putScaWallet"></a>
# **putScaWallet**
> ScaWalletObject putScaWallet(scaWalletId, putScaWalletRequest)

Lock SCA Wallet

Locks an SCA Wallet so that none of the services it offers can be unlocked until it is unlocked. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScaWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScaWalletsApi apiInstance = new ScaWalletsApi(defaultClient);
    String scaWalletId = "scaWalletId_example"; // String | The unique identifier of the SCA Wallet.
    PutScaWalletRequest putScaWalletRequest = new PutScaWalletRequest(); // PutScaWalletRequest | 
    try {
      ScaWalletObject result = apiInstance.putScaWallet(scaWalletId, putScaWalletRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScaWalletsApi#putScaWallet");
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
| **scaWalletId** | **String**| The unique identifier of the SCA Wallet. | |
| **putScaWalletRequest** | [**PutScaWalletRequest**](PutScaWalletRequest.md)|  | [optional] |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The wallet is locked. |  -  |
| **400** | The lock reason field is required. |  -  |
| **0** | Unexpected error |  -  |

<a id="resetScaWalletPin"></a>
# **resetScaWalletPin**
> ScaWalletObject resetScaWalletPin(scaWalletId)

Reset PIN

This endpoint is used to reset the PIN code of a Wallet. &lt;br&gt; This web service should be used when a Customer has locked their Wallet after too many consecutive wrong PIN attempts. &lt;br&gt; Once the PIN has been reset, the Customer is able to set a new PIN via the mobile application, without having to enter the previous PIN. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScaWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScaWalletsApi apiInstance = new ScaWalletsApi(defaultClient);
    String scaWalletId = "scaWalletId_example"; // String | 
    try {
      ScaWalletObject result = apiInstance.resetScaWalletPin(scaWalletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScaWalletsApi#resetScaWalletPin");
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
| **scaWalletId** | **String**|  | |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | PIN has been reset. |  -  |
| **0** | Unexpected error |  -  |

<a id="setPasscode"></a>
# **setPasscode**
> setPasscode(setPasscodeRequest)

Change Passcode

Change the passcode ([Web Native SCA](/guide/strong-customer-authentication/web-native.html)). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScaWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScaWalletsApi apiInstance = new ScaWalletsApi(defaultClient);
    SetPasscodeRequest setPasscodeRequest = new SetPasscodeRequest(); // SetPasscodeRequest | 
    try {
      apiInstance.setPasscode(setPasscodeRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScaWalletsApi#setPasscode");
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
| **setPasscodeRequest** | [**SetPasscodeRequest**](SetPasscodeRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Accepted |  -  |

<a id="swapSCAWallets"></a>
# **swapSCAWallets**
> ScaWalletObject swapSCAWallets(swapSCAWalletsRequest)

Swap SCA Wallets

Create an SCA Wallet while deleting the previous one as users should have only one device enrolled.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScaWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScaWalletsApi apiInstance = new ScaWalletsApi(defaultClient);
    SwapSCAWalletsRequest swapSCAWalletsRequest = new SwapSCAWalletsRequest(); // SwapSCAWalletsRequest | 
    try {
      ScaWalletObject result = apiInstance.swapSCAWallets(swapSCAWalletsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScaWalletsApi#swapSCAWallets");
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
| **swapSCAWalletsRequest** | [**SwapSCAWalletsRequest**](SwapSCAWalletsRequest.md)|  | [optional] |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of wallet was successfully retrieved. |  -  |
| **0** | Unexpected error |  -  |

<a id="unlockScaWallet"></a>
# **unlockScaWallet**
> ScaWalletObject unlockScaWallet(scaWalletId)

Unlock SCA Wallet

Unlock an SCA Wallet.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScaWalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ScaWalletsApi apiInstance = new ScaWalletsApi(defaultClient);
    String scaWalletId = "scaWalletId_example"; // String | The unique identifier of the SCA Wallet.
    try {
      ScaWalletObject result = apiInstance.unlockScaWallet(scaWalletId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScaWalletsApi#unlockScaWallet");
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
| **scaWalletId** | **String**| The unique identifier of the SCA Wallet. | |

### Return type

[**ScaWalletObject**](ScaWalletObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The wallet is unlocked. |  -  |
| **0** | Unexpected error |  -  |

