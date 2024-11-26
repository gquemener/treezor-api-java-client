# PayinRefundsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPayinrefund**](PayinRefundsApi.md#getPayinrefund) | **GET** /v1/payinrefunds/{id} | Get Payin Refund |
| [**getPayinrefunds**](PayinRefundsApi.md#getPayinrefunds) | **GET** /v1/payinrefunds | Search Payin Refunds |


<a id="getPayinrefund"></a>
# **getPayinrefund**
> GetPayinrefunds200Response getPayinrefund(id)

Get Payin Refund

Get a payin refund.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayinRefundsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    PayinRefundsApi apiInstance = new PayinRefundsApi(defaultClient);
    Long id = 56L; // Long | The unique identifier of the payin refund.
    try {
      GetPayinrefunds200Response result = apiInstance.getPayinrefund(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayinRefundsApi#getPayinrefund");
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
| **id** | **Long**| The unique identifier of the payin refund. | |

### Return type

[**GetPayinrefunds200Response**](GetPayinrefunds200Response.md)

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

<a id="getPayinrefunds"></a>
# **getPayinrefunds**
> GetPayinrefunds200Response getPayinrefunds(accessSignature, accessTag, accessUserId, accessUserIp, payinId, payinrefundId, payinrefundTag, payinrefundStatus, walletId, payinrefundDate, userId, amount, currency, pageNumber, cursor, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Payin Refunds

Search for payin refunds. These can relate to [Acquiring](/guide/acquiring/legacy-v1.html#refunds) or [SEPA recalls](/guide/transfers/sepa-recalls.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayinRefundsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    PayinRefundsApi apiInstance = new PayinRefundsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    Integer payinId = 56; // Integer | The unique identifier of the payin.
    Integer payinrefundId = 56; // Integer | Payinrefund's id.
    String payinrefundTag = "payinrefundTag_example"; // String | Custom data.
    String payinrefundStatus = "PENDING"; // String | The status of the payin refund.
    Integer walletId = 56; // Integer | The unique identifier of the Wallet to refund.
    OffsetDateTime payinrefundDate = OffsetDateTime.now(); // OffsetDateTime | The date of the payin refund. Format: YYYY-MM-DD 
    Integer userId = 56; // Integer | The unique identifier of the User who made the refund.
    String amount = "amount_example"; // String | The amount of the refund.
    String currency = "currency_example"; // String | The currency of the amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    String cursor = "cursor_example"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page. 
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints. 
    String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value: _createdDate_.  
    String sortOrder = "DESC"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort. 
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    try {
      GetPayinrefunds200Response result = apiInstance.getPayinrefunds(accessSignature, accessTag, accessUserId, accessUserIp, payinId, payinrefundId, payinrefundTag, payinrefundStatus, walletId, payinrefundDate, userId, amount, currency, pageNumber, cursor, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayinRefundsApi#getPayinrefunds");
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
| **payinId** | **Integer**| The unique identifier of the payin. | [optional] |
| **payinrefundId** | **Integer**| Payinrefund&#39;s id. | [optional] |
| **payinrefundTag** | **String**| Custom data. | [optional] |
| **payinrefundStatus** | **String**| The status of the payin refund. | [optional] [enum: PENDING, CANCELED, VALIDATED] |
| **walletId** | **Integer**| The unique identifier of the Wallet to refund. | [optional] |
| **payinrefundDate** | **OffsetDateTime**| The date of the payin refund. Format: YYYY-MM-DD  | [optional] |
| **userId** | **Integer**| The unique identifier of the User who made the refund. | [optional] |
| **amount** | **String**| The amount of the refund. | [optional] |
| **currency** | **String**| The currency of the amount. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies).  | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.  | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints.  | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with. Default value: _createdDate_.   | [optional] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  | [optional] [default to DESC] [enum: DESC, ASC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |

### Return type

[**GetPayinrefunds200Response**](GetPayinrefunds200Response.md)

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

