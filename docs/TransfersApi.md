# TransfersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTransfer**](TransfersApi.md#deleteTransfer) | **DELETE** /v1/transfers/{transferId} | Cancel Transfer |
| [**getTransfer**](TransfersApi.md#getTransfer) | **GET** /v1/transfers/{transferId} | Get Transfer |
| [**getTransfers**](TransfersApi.md#getTransfers) | **GET** /v1/transfers | Search Transfers |
| [**postTransfers**](TransfersApi.md#postTransfers) | **POST** /v1/transfers | Create Transfer |


<a id="deleteTransfer"></a>
# **deleteTransfer**
> TransferObject deleteTransfer(transferId)

Cancel Transfer

Change status of the Transfer to &#x60;CANCELED&#x60;. A validated transfer can&#39;t be canceled. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransfersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    TransfersApi apiInstance = new TransfersApi(defaultClient);
    Long transferId = 56L; // Long | The unique identifier of the Transfer.
    try {
      TransferObject result = apiInstance.deleteTransfer(transferId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#deleteTransfer");
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
| **transferId** | **Long**| The unique identifier of the Transfer. | |

### Return type

[**TransferObject**](TransferObject.md)

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

<a id="getTransfer"></a>
# **getTransfer**
> TransferObject getTransfer(transferId)

Get Transfer

Retrieve a transfer using its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransfersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    TransfersApi apiInstance = new TransfersApi(defaultClient);
    Long transferId = 56L; // Long | The unique identifier of the Transfer.
    try {
      TransferObject result = apiInstance.getTransfer(transferId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#getTransfer");
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
| **transferId** | **Long**| The unique identifier of the Transfer. | |

### Return type

[**TransferObject**](TransferObject.md)

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

<a id="getTransfers"></a>
# **getTransfers**
> TransferObject getTransfers(accessSignature, accessTag, accessUserId, accessUserIp, transferId, transferTag, transferStatus, walletId, beneficiaryWalletId, userId, beneficiaryUserId, transferDate, amount, currency, transferTypeId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Transfers

Retrieve the list of transfers for at least one of those inputs: &#x60;walletId&#x60;, &#x60;beneficiaryWalletId&#x60;, &#x60;userId&#x60;, &#x60;beneficiaryUserId&#x60;, &#x60;transferId&#x60;, &#x60;transferTag&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransfersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    TransfersApi apiInstance = new TransfersApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    Integer transferId = 56; // Integer | The unique identifier of the Transfer.
    String transferTag = "transferTag_example"; // String | Custom data.
    String transferStatus = "transferStatus_example"; // String | The status of the Transfer. Possible values: * `PENDING` * `CANCELED` * `VALIDATED` 
    Integer walletId = 56; // Integer | The unique identifier of the debited Wallet.
    Integer beneficiaryWalletId = 56; // Integer | The unique identifier of the credited Wallet.
    Integer userId = 56; // Integer | The unique identifier of the owner of the debited Wallet.
    Integer beneficiaryUserId = 56; // Integer | The unique identifier of the owner of the credited Wallet.
    OffsetDateTime transferDate = OffsetDateTime.now(); // OffsetDateTime | The date and time of the transfer. Format: YYYY-MM-DD HH:MM:SS 
    String amount = "amount_example"; // String | The amount of the Transfer.
    String currency = "currency_example"; // String | The currency of the Transfer amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
    Integer transferTypeId = 56; // Integer | The type of the Transfer: * `1` – Wallet to wallet  * `2` – Card transaction * `3` – Client fees * `4` – Credit note 
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
    String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value: `createdDate`.  
    String sortOrder = "DESC"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort. 
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    try {
      TransferObject result = apiInstance.getTransfers(accessSignature, accessTag, accessUserId, accessUserIp, transferId, transferTag, transferStatus, walletId, beneficiaryWalletId, userId, beneficiaryUserId, transferDate, amount, currency, transferTypeId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#getTransfers");
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
| **transferId** | **Integer**| The unique identifier of the Transfer. | [optional] |
| **transferTag** | **String**| Custom data. | [optional] |
| **transferStatus** | **String**| The status of the Transfer. Possible values: * &#x60;PENDING&#x60; * &#x60;CANCELED&#x60; * &#x60;VALIDATED&#x60;  | [optional] |
| **walletId** | **Integer**| The unique identifier of the debited Wallet. | [optional] |
| **beneficiaryWalletId** | **Integer**| The unique identifier of the credited Wallet. | [optional] |
| **userId** | **Integer**| The unique identifier of the owner of the debited Wallet. | [optional] |
| **beneficiaryUserId** | **Integer**| The unique identifier of the owner of the credited Wallet. | [optional] |
| **transferDate** | **OffsetDateTime**| The date and time of the transfer. Format: YYYY-MM-DD HH:MM:SS  | [optional] |
| **amount** | **String**| The amount of the Transfer. | [optional] |
| **currency** | **String**| The currency of the Transfer amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies).  | [optional] |
| **transferTypeId** | **Integer**| The type of the Transfer: * &#x60;1&#x60; – Wallet to wallet  * &#x60;2&#x60; – Card transaction * &#x60;3&#x60; – Client fees * &#x60;4&#x60; – Credit note  | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with. Default value: &#x60;createdDate&#x60;.   | [optional] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  | [optional] [default to DESC] [enum: DESC, ASC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |

### Return type

[**TransferObject**](TransferObject.md)

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

<a id="postTransfers"></a>
# **postTransfers**
> TransferObject postTransfers(accessSignature, accessTag, accessUserId, accessUserIp, postTransfersRequest)

Create Transfer

Create a new Wallet-to-Wallet transfer.  This endpoint requires per-session or per-operation [SCA](/guide/strong-customer-authentication/introduction.html) on if the &#x60;beneficiaryWalletId&#x60; belongs to the current User or not. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransfersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    TransfersApi apiInstance = new TransfersApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PostTransfersRequest postTransfersRequest = new PostTransfersRequest(); // PostTransfersRequest | 
    try {
      TransferObject result = apiInstance.postTransfers(accessSignature, accessTag, accessUserId, accessUserIp, postTransfersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransfersApi#postTransfers");
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
| **postTransfersRequest** | [**PostTransfersRequest**](PostTransfersRequest.md)|  | [optional] |

### Return type

[**TransferObject**](TransferObject.md)

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

