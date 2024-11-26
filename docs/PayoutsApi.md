# PayoutsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePayout**](PayoutsApi.md#deletePayout) | **DELETE** /v1/payouts/{payoutId} | Cancel Payout |
| [**getPayout**](PayoutsApi.md#getPayout) | **GET** /v1/payouts/{payoutId} | Get Payout |
| [**getPayouts**](PayoutsApi.md#getPayouts) | **GET** /v1/payouts | Search Payouts |
| [**getProofPayout**](PayoutsApi.md#getProofPayout) | **GET** /core-connect/payouts/{payoutId}/proof | Create Payout Proof |
| [**postPayout**](PayoutsApi.md#postPayout) | **POST** /v1/payouts | Create Payout |


<a id="deletePayout"></a>
# **deletePayout**
> PostPayout200Response deletePayout(payoutId)

Cancel Payout

Change payout status to &#x60;CANCELED&#x60;. A &#x60;VALIDATED&#x60; payout can&#39;t be canceled. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    PayoutsApi apiInstance = new PayoutsApi(defaultClient);
    Long payoutId = 56L; // Long | The unique identifier of the Payout.
    try {
      PostPayout200Response result = apiInstance.deletePayout(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutsApi#deletePayout");
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
| **payoutId** | **Long**| The unique identifier of the Payout. | |

### Return type

[**PostPayout200Response**](PostPayout200Response.md)

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

<a id="getPayout"></a>
# **getPayout**
> PostPayout200Response getPayout(payoutId)

Get Payout

Retrieve a given Payout.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    PayoutsApi apiInstance = new PayoutsApi(defaultClient);
    Long payoutId = 56L; // Long | The unique identifier of the Payout.
    try {
      PostPayout200Response result = apiInstance.getPayout(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutsApi#getPayout");
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
| **payoutId** | **Long**| The unique identifier of the Payout. | |

### Return type

[**PostPayout200Response**](PostPayout200Response.md)

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

<a id="getPayouts"></a>
# **getPayouts**
> GetPayouts200Response getPayouts(accessSignature, accessTag, accessUserId, accessUserIp, payoutId, payoutTag, payoutStatus, payoutTypeId, walletId, userId, payoutDate, bankaccountId, beneficiaryId, amount, currency, cursor, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Payouts

Retrieve Payouts that match search criteria. The request must contain at least one of the following inputs: &#x60;userId&#x60;, &#x60;walletId&#x60;. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    PayoutsApi apiInstance = new PayoutsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    Integer payoutId = 56; // Integer | The unique identifier of the payout.
    String payoutTag = "payoutTag_example"; // String | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article. <br>Max length: 250 characters  <br>Format: hc characters and `/` `!` `-` `_` `.` `*` `'` `(` `)` 
    String payoutStatus = "CANCELED"; // String | The status of the payout. 
    Integer payoutTypeId = 1; // Integer | Payout type's id:  | ID | Description | |-----|-----| | 1 | Credit Transfer | | 2 | Direct Debit | | 3 | Sepa Instant Credit Transfer | 
    Integer walletId = 56; // Integer | The unique identifier of the payout Wallet.
    Integer userId = 56; // Integer | The unique identifier of the payout User.
    OffsetDateTime payoutDate = OffsetDateTime.now(); // OffsetDateTime | Payout execution date. Format: YYYY-MM-DD HH:MM:SS 
    Integer bankaccountId = 56; // Integer | Legacy attribute, do not use.
    Integer beneficiaryId = 56; // Integer | The unique identifier of the payout Beneficiary.
    String amount = "amount_example"; // String | The amount of the payout.
    String currency = "currency_example"; // String | The currency of the amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
    String cursor = "cursor_example"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page.
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    try {
      GetPayouts200Response result = apiInstance.getPayouts(accessSignature, accessTag, accessUserId, accessUserIp, payoutId, payoutTag, payoutStatus, payoutTypeId, walletId, userId, payoutDate, bankaccountId, beneficiaryId, amount, currency, cursor, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutsApi#getPayouts");
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
| **payoutId** | **Integer**| The unique identifier of the payout. | [optional] |
| **payoutTag** | **String**| Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article. &lt;br&gt;Max length: 250 characters  &lt;br&gt;Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  | [optional] |
| **payoutStatus** | **String**| The status of the payout.  | [optional] [enum: CANCELED, PENDING, VALIDATED] |
| **payoutTypeId** | **Integer**| Payout type&#39;s id:  | ID | Description | |-----|-----| | 1 | Credit Transfer | | 2 | Direct Debit | | 3 | Sepa Instant Credit Transfer |  | [optional] [enum: 1, 2, 3] |
| **walletId** | **Integer**| The unique identifier of the payout Wallet. | [optional] |
| **userId** | **Integer**| The unique identifier of the payout User. | [optional] |
| **payoutDate** | **OffsetDateTime**| Payout execution date. Format: YYYY-MM-DD HH:MM:SS  | [optional] |
| **bankaccountId** | **Integer**| Legacy attribute, do not use. | [optional] |
| **beneficiaryId** | **Integer**| The unique identifier of the payout Beneficiary. | [optional] |
| **amount** | **String**| The amount of the payout. | [optional] |
| **currency** | **String**| The currency of the amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies).  | [optional] |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. | [optional] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |

### Return type

[**GetPayouts200Response**](GetPayouts200Response.md)

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

<a id="getProofPayout"></a>
# **getProofPayout**
> GetProofPayout200Response getProofPayout(payoutId)

Create Payout Proof

Generate and download a proof of payout in .PDF format. See [Proof of Payout](/guide/transfers/proof-of-payout.html) for more information. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    PayoutsApi apiInstance = new PayoutsApi(defaultClient);
    String payoutId = "payoutId_example"; // String | The unique identifier of the Payout.
    try {
      GetProofPayout200Response result = apiInstance.getProofPayout(payoutId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutsApi#getProofPayout");
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
| **payoutId** | **String**| The unique identifier of the Payout. | |

### Return type

[**GetProofPayout200Response**](GetProofPayout200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="postPayout"></a>
# **postPayout**
> PostPayout200Response postPayout(accessSignature, accessTag, accessUserId, accessUserIp, postPayoutRequest)

Create Payout

Create a new payout.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    PayoutsApi apiInstance = new PayoutsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PostPayoutRequest postPayoutRequest = new PostPayoutRequest(); // PostPayoutRequest | 
    try {
      PostPayout200Response result = apiInstance.postPayout(accessSignature, accessTag, accessUserId, accessUserIp, postPayoutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutsApi#postPayout");
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
| **postPayoutRequest** | [**PostPayoutRequest**](PostPayoutRequest.md)|  | [optional] |

### Return type

[**PostPayout200Response**](PostPayout200Response.md)

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

