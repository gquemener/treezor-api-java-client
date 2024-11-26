# TransactionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /v1/transactions/{transactionId} | Get Transaction |
| [**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /v1/transactions | Search Transactions |


<a id="getTransaction"></a>
# **getTransaction**
> GetTransactions200Response getTransaction(transactionId)

Get Transaction

Retrieve a transaction.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    Long transactionId = 56L; // Long | The unique identifier of the Transaction.
    try {
      GetTransactions200Response result = apiInstance.getTransaction(transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransaction");
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
| **transactionId** | **Long**| The unique identifier of the Transaction. | |

### Return type

[**GetTransactions200Response**](GetTransactions200Response.md)

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

<a id="getTransactions"></a>
# **getTransactions**
> GetTransactions200Response getTransactions(accessSignature, accessTag, accessUserId, accessUserIp, transactionId, transactionType, transactionTypeId, walletId, userId, name, description, amount, currency, valueDate, executionDate, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo)

Search Transactions

Retrieve Transactions that match search criteria. The request must contain at least one of the following inputs: &#x60;walletId&#x60;, &#x60;transactionId&#x60;, &#x60;executionDate&#x60;, &#x60;valueDate&#x60; 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TransactionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    TransactionsApi apiInstance = new TransactionsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    Integer transactionId = 56; // Integer | The unique identifier of the transaction.
    String transactionType = "transactionType_example"; // String | Names of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions#transaction-types-transactiontype) article for the list of possible values. 
    Integer transactionTypeId = 56; // Integer | The Id of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions#transaction-types-transactiontype) article for the list of possible values. 
    Integer walletId = 56; // Integer | Unique identifier of the transactions Wallet.
    Integer userId = 56; // Integer | Unique identifier of the transactions User.
    String name = "name_example"; // String | The name of the transaction.
    String description = "description_example"; // String | The description of the transaction.
    String amount = "amount_example"; // String | The amount of the transaction.
    String currency = "currency_example"; // String | The currency of the transaction amount currency. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies). 
    OffsetDateTime valueDate = OffsetDateTime.now(); // OffsetDateTime | The value date of the transaction (date applied for the payment).  Format: YYYY-MM-DD HH:MM:SS
    OffsetDateTime executionDate = OffsetDateTime.now(); // OffsetDateTime | Date of the execution of the transaction.  Format: YYYY-MM-DD HH:MM:SS
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
    String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
    String sortOrder = "DESC"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort. 
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    try {
      GetTransactions200Response result = apiInstance.getTransactions(accessSignature, accessTag, accessUserId, accessUserIp, transactionId, transactionType, transactionTypeId, walletId, userId, name, description, amount, currency, valueDate, executionDate, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getTransactions");
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
| **transactionId** | **Integer**| The unique identifier of the transaction. | [optional] |
| **transactionType** | **String**| Names of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions#transaction-types-transactiontype) article for the list of possible values.  | [optional] |
| **transactionTypeId** | **Integer**| The Id of the transaction types. Please refer to the [Transactions](/guide/wallets/transactions#transaction-types-transactiontype) article for the list of possible values.  | [optional] |
| **walletId** | **Integer**| Unique identifier of the transactions Wallet. | [optional] |
| **userId** | **Integer**| Unique identifier of the transactions User. | [optional] |
| **name** | **String**| The name of the transaction. | [optional] |
| **description** | **String**| The description of the transaction. | [optional] |
| **amount** | **String**| The amount of the transaction. | [optional] |
| **currency** | **String**| The currency of the transaction amount currency. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies).  | [optional] |
| **valueDate** | **OffsetDateTime**| The value date of the transaction (date applied for the payment).  Format: YYYY-MM-DD HH:MM:SS | [optional] |
| **executionDate** | **OffsetDateTime**| Date of the execution of the transaction.  Format: YYYY-MM-DD HH:MM:SS | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  | [optional] [default to DESC] [enum: DESC, ASC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |

### Return type

[**GetTransactions200Response**](GetTransactions200Response.md)

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

