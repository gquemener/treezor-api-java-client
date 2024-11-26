# CardTransactionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCardtransaction**](CardTransactionsApi.md#getCardtransaction) | **GET** /v1/cardtransactions/{cardtransactionId} | Get Card Transaction |
| [**getCoCardTransaction**](CardTransactionsApi.md#getCoCardTransaction) | **GET** /core-connect/cardtransactions/{cardId} | Get Card Transactions |
| [**getCoCardTransactions**](CardTransactionsApi.md#getCoCardTransactions) | **GET** /core-connect/cardtransactions | Get all Card Transactions |
| [**readCardTransaction**](CardTransactionsApi.md#readCardTransaction) | **GET** /v1/cardtransactions | Search Card Transactions |
| [**simulateCardTransactions**](CardTransactionsApi.md#simulateCardTransactions) | **POST** /simulation/cardtransactions | Simulate Card Transactions |


<a id="getCardtransaction"></a>
# **getCardtransaction**
> GetCardtransaction200Response getCardtransaction(cardtransactionId)

Get Card Transaction

Retrieve a Card Transaction based on its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardTransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardTransactionsApi apiInstance = new CardTransactionsApi(defaultClient);
    Long cardtransactionId = 56L; // Long | The unique identifier of the Card Transaction.
    try {
      GetCardtransaction200Response result = apiInstance.getCardtransaction(cardtransactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardTransactionsApi#getCardtransaction");
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
| **cardtransactionId** | **Long**| The unique identifier of the Card Transaction. | |

### Return type

[**GetCardtransaction200Response**](GetCardtransaction200Response.md)

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

<a id="getCoCardTransaction"></a>
# **getCoCardTransaction**
> GetCoCardTransactions200Response getCoCardTransaction(cardId, cursor, createdDateFrom, createdDateTo, amountFrom, amountTo, paymentStatus, paymentType, merchantId)

Get Card Transactions

Retrieve the Card Transactions for a specific card. This request is preferred for a dashboard-oriented usage. You shouldn&#39;t expose this endpoint to your end users.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardTransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardTransactionsApi apiInstance = new CardTransactionsApi(defaultClient);
    String cardId = "cardId_example"; // String | The unique identifier of the card.
    String cursor = "cursor_example"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page.
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The date and time from which the transactions are taken into account.
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The date and time up to which the transactions are taken into account.
    BigDecimal amountFrom = new BigDecimal("10.25"); // BigDecimal | The minimum amount of the transactions to be taken into account.
    BigDecimal amountTo = new BigDecimal("100.25"); // BigDecimal | The maximum amount of the transactions to be taken into account.
    List<String> paymentStatus = Arrays.asList(); // List<String> | 
    List<String> paymentType = Arrays.asList(); // List<String> | 
    String merchantId = "merchantId_example"; // String | The unique identifier of the merchant. See [Merchant Identification Number (MID)](/guide/overview/glossary.html#merchant-identification-number-mid). 
    try {
      GetCoCardTransactions200Response result = apiInstance.getCoCardTransaction(cardId, cursor, createdDateFrom, createdDateTo, amountFrom, amountTo, paymentStatus, paymentType, merchantId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardTransactionsApi#getCoCardTransaction");
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
| **cardId** | **String**| The unique identifier of the card. | |
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. | [optional] |
| **createdDateFrom** | **OffsetDateTime**| The date and time from which the transactions are taken into account. | [optional] |
| **createdDateTo** | **OffsetDateTime**| The date and time up to which the transactions are taken into account. | [optional] |
| **amountFrom** | **BigDecimal**| The minimum amount of the transactions to be taken into account. | [optional] |
| **amountTo** | **BigDecimal**| The maximum amount of the transactions to be taken into account. | [optional] |
| **paymentStatus** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: A, R, S, C, I, V, M] |
| **paymentType** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: Withdrawal, Payment] |
| **merchantId** | **String**| The unique identifier of the merchant. See [Merchant Identification Number (MID)](/guide/overview/glossary.html#merchant-identification-number-mid).  | [optional] |

### Return type

[**GetCoCardTransactions200Response**](GetCoCardTransactions200Response.md)

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

<a id="getCoCardTransactions"></a>
# **getCoCardTransactions**
> GetCoCardTransactions200Response getCoCardTransactions(cursor, createdDateFrom, createdDateTo)

Get all Card Transactions

Retrieve all the Card Transactions. This is the preferred request for a dashboard-oriented approach. You shouldn&#39;t expose this endpoint to your end users.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardTransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardTransactionsApi apiInstance = new CardTransactionsApi(defaultClient);
    String cursor = "cursor_example"; // String | Pagination cursor, if you don't pass a cursor, result will start at the first page.
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The date and time from which the transactions are taken into account.
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The date and time up to which the transactions are taken into account.
    try {
      GetCoCardTransactions200Response result = apiInstance.getCoCardTransactions(cursor, createdDateFrom, createdDateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardTransactionsApi#getCoCardTransactions");
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
| **cursor** | **String**| Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page. | [optional] |
| **createdDateFrom** | **OffsetDateTime**| The date and time from which the transactions are taken into account. | [optional] |
| **createdDateTo** | **OffsetDateTime**| The date and time up to which the transactions are taken into account. | [optional] |

### Return type

[**GetCoCardTransactions200Response**](GetCoCardTransactions200Response.md)

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

<a id="readCardTransaction"></a>
# **readCardTransaction**
> ReadCardTransaction200Response readCardTransaction(accessSignature, accessTag, accessUserId, accessUserIp, cardtransactionId, cardId, walletId, merchantId, publicToken, paymentId, pageNumber, pageCount, sortBy)

Search Card Transactions

Retrieve Card Transactions based at least on one of the following intputs: &#x60;cardId&#x60;, &#x60;paymentId&#x60;, &#x60;publicToken&#x60;, &#x60;walletId&#x60;. This is the preferred request for end-user-oriented usage. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardTransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardTransactionsApi apiInstance = new CardTransactionsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    Integer cardtransactionId = 56; // Integer | The unique identifier of the Card Transaction.
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    Integer walletId = 56; // Integer | The unique identifier of the Wallet the card is attached to.
    String merchantId = "merchantId_example"; // String | The Merchant's Id.
    String publicToken = "publicToken_example"; // String | The public token of the Card.
    Integer paymentId = 56; // Integer | The identifier of the payment.
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
    String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value: _createdDate_.  
    try {
      ReadCardTransaction200Response result = apiInstance.readCardTransaction(accessSignature, accessTag, accessUserId, accessUserIp, cardtransactionId, cardId, walletId, merchantId, publicToken, paymentId, pageNumber, pageCount, sortBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardTransactionsApi#readCardTransaction");
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
| **cardtransactionId** | **Integer**| The unique identifier of the Card Transaction. | [optional] |
| **cardId** | **Integer**| The unique identifier of the Card. | [optional] |
| **walletId** | **Integer**| The unique identifier of the Wallet the card is attached to. | [optional] |
| **merchantId** | **String**| The Merchant&#39;s Id. | [optional] |
| **publicToken** | **String**| The public token of the Card. | [optional] |
| **paymentId** | **Integer**| The identifier of the payment. | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with. Default value: _createdDate_.   | [optional] |

### Return type

[**ReadCardTransaction200Response**](ReadCardTransaction200Response.md)

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
import org.openapitools.client.api.CardTransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardTransactionsApi apiInstance = new CardTransactionsApi(defaultClient);
    SimulateCardTransactionsRequest simulateCardTransactionsRequest = new SimulateCardTransactionsRequest(); // SimulateCardTransactionsRequest | 
    try {
      List<SimulateCardTransactions201ResponseInner> result = apiInstance.simulateCardTransactions(simulateCardTransactionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardTransactionsApi#simulateCardTransactions");
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

