# WalletsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWallet**](WalletsApi.md#deleteWallet) | **DELETE** /v1/wallets/{walletId} | Delete Wallet |
| [**getWallet**](WalletsApi.md#getWallet) | **GET** /v1/wallets/{walletId} | Get Wallet |
| [**getWallets**](WalletsApi.md#getWallets) | **GET** /v1/wallets | Search Wallets |
| [**postWallets**](WalletsApi.md#postWallets) | **POST** /v1/wallets | Create Wallet |
| [**putWallet**](WalletsApi.md#putWallet) | **PUT** /v1/wallets/{walletId} | Update Wallet |


<a id="deleteWallet"></a>
# **deleteWallet**
> DeleteWallet200Response deleteWallet(walletId, origin, accessSignature, accessTag, accessUserId, accessUserIp)

Delete Wallet

Change the status of the Wallet to &#x60;CANCELED&#x60;. This action is irreversible.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    Integer walletId = 56; // Integer | The unique identifier of the Wallet.
    String origin = "origin_example"; // String | The origin of the request for cancelling the Wallet, which can be one of the following: <ul><li>`OPERATOR` – When **you** are at the origin of the deactivation.</li><li>`USER` – When the **end user** is at the origin of the deactivation.</li></ul> 
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    try {
      DeleteWallet200Response result = apiInstance.deleteWallet(walletId, origin, accessSignature, accessTag, accessUserId, accessUserIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#deleteWallet");
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
| **origin** | **String**| The origin of the request for cancelling the Wallet, which can be one of the following: &lt;ul&gt;&lt;li&gt;&#x60;OPERATOR&#x60; – When **you** are at the origin of the deactivation.&lt;/li&gt;&lt;li&gt;&#x60;USER&#x60; – When the **end user** is at the origin of the deactivation.&lt;/li&gt;&lt;/ul&gt;  | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |

### Return type

[**DeleteWallet200Response**](DeleteWallet200Response.md)

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

<a id="getWallet"></a>
# **getWallet**
> WalletObject getWallet(walletId, accessSignature, accessTag, accessUserId, accessUserIp)

Get Wallet

Retrieve a Wallet based on its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    Long walletId = 56L; // Long | The unique identifier of the Wallet.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    try {
      WalletObject result = apiInstance.getWallet(walletId, accessSignature, accessTag, accessUserId, accessUserIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWallet");
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
| **walletId** | **Long**| The unique identifier of the Wallet. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |

### Return type

[**WalletObject**](WalletObject.md)

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

<a id="getWallets"></a>
# **getWallets**
> WalletObject getWallets(accessSignature, accessTag, accessUserId, accessUserIp, walletId, walletStatus, userId, parentUserId, walletTag, walletTypeId, eventAlias, tariffId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Wallets

Retrieve Wallets that match your search conditions. The request must specify at least one of those fields: &#x60;walletId&#x60;, &#x60;eventAlias&#x60;, &#x60;userId&#x60;, &#x60;walletTypeId&#x60;. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    Integer accessUserIp = 56; // Integer | Legacy attribute, do not use. 
    Integer walletId = 56; // Integer | The unique identifier of the Wallet.
    String walletStatus = "PENDING"; // String | The status of the Wallet, which can be one of the following: * `PENDING` – The Wallet has just been created. * `VALIDATED` – The Wallet is active. * `CANCELED` – The Wallet is deactivated. 
    Integer userId = 56; // Integer | The unique identifier of the User owning the Wallet.
    Integer parentUserId = 56; // Integer | The unique identifier of the Parent User of the Wallet owner.
    String walletTag = "walletTag_example"; // String | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article. <br>Max length: 250 characters  <br>Format: hc characters and `/` `!` `-` `_` `.` `*` `'` `(` `)` 
    Integer walletTypeId = 56; // Integer | The type of Wallet. The following values are allowed: * `9` – Electronic Money Wallet * `10` – Payment Account Wallet <br> Other types are available but can only be set by Treezor. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
    String eventAlias = "eventAlias_example"; // String | Legacy attribute, do not use. 
    Integer tariffId = 56; // Integer | The fees applied to the Wallet, as defined by your contract with Treezor. Usually required, but may have a default value set by Treezor.
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
    String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
    String sortOrder = "DESC"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort. 
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    try {
      WalletObject result = apiInstance.getWallets(accessSignature, accessTag, accessUserId, accessUserIp, walletId, walletStatus, userId, parentUserId, walletTag, walletTypeId, eventAlias, tariffId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#getWallets");
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
| **accessUserIp** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **walletId** | **Integer**| The unique identifier of the Wallet. | [optional] |
| **walletStatus** | **String**| The status of the Wallet, which can be one of the following: * &#x60;PENDING&#x60; – The Wallet has just been created. * &#x60;VALIDATED&#x60; – The Wallet is active. * &#x60;CANCELED&#x60; – The Wallet is deactivated.  | [optional] [enum: PENDING, VALIDATED, CANCELED] |
| **userId** | **Integer**| The unique identifier of the User owning the Wallet. | [optional] |
| **parentUserId** | **Integer**| The unique identifier of the Parent User of the Wallet owner. | [optional] |
| **walletTag** | **String**| Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article. &lt;br&gt;Max length: 250 characters  &lt;br&gt;Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  | [optional] |
| **walletTypeId** | **Integer**| The type of Wallet. The following values are allowed: * &#x60;9&#x60; – Electronic Money Wallet * &#x60;10&#x60; – Payment Account Wallet &lt;br&gt; Other types are available but can only be set by Treezor. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation.  | [optional] |
| **eventAlias** | **String**| Legacy attribute, do not use.  | [optional] |
| **tariffId** | **Integer**| The fees applied to the Wallet, as defined by your contract with Treezor. Usually required, but may have a default value set by Treezor. | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  | [optional] [default to DESC] [enum: DESC, ASC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |

### Return type

[**WalletObject**](WalletObject.md)

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

<a id="postWallets"></a>
# **postWallets**
> WalletObject postWallets(accessSignature, accessTag, accessUserId, accessUserIp, postWalletsRequest)

Create Wallet

Create a new Wallet. This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    Integer accessUserIp = 56; // Integer | Legacy attribute, do not use. 
    PostWalletsRequest postWalletsRequest = new PostWalletsRequest(); // PostWalletsRequest | 
    try {
      WalletObject result = apiInstance.postWallets(accessSignature, accessTag, accessUserId, accessUserIp, postWalletsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#postWallets");
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
| **accessUserIp** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **postWalletsRequest** | [**PostWalletsRequest**](PostWalletsRequest.md)|  | [optional] |

### Return type

[**WalletObject**](WalletObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

<a id="putWallet"></a>
# **putWallet**
> WalletObject putWallet(walletId, accessSignature, accessTag, accessUserId, accessUserIp, putWalletRequest)

Update Wallet

Modifiy a Wallet information

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    WalletsApi apiInstance = new WalletsApi(defaultClient);
    Long walletId = 56L; // Long | The unique identifier of the Wallet.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PutWalletRequest putWalletRequest = new PutWalletRequest(); // PutWalletRequest | 
    try {
      WalletObject result = apiInstance.putWallet(walletId, accessSignature, accessTag, accessUserId, accessUserIp, putWalletRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#putWallet");
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
| **walletId** | **Long**| The unique identifier of the Wallet. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **putWalletRequest** | [**PutWalletRequest**](PutWalletRequest.md)|  | [optional] |

### Return type

[**WalletObject**](WalletObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

