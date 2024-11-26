# VirtualIbansApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getvirtualiban**](VirtualIbansApi.md#getvirtualiban) | **GET** /v1/virtualibans/{virtualIbanId} | Get Virtual IBAN |
| [**getvirtualibans**](VirtualIbansApi.md#getvirtualibans) | **GET** /v1/virtualibans | Search Virtual IBANs |
| [**postVirtualIban**](VirtualIbansApi.md#postVirtualIban) | **POST** /v1/virtualibans | Create Virtual IBAN |
| [**putVirtualIban**](VirtualIbansApi.md#putVirtualIban) | **PUT** /v1/virtualibans/{virtualIbanId} | Update Virtual IBAN |


<a id="getvirtualiban"></a>
# **getvirtualiban**
> VirtualIbanObject getvirtualiban(virtualIbanId)

Get Virtual IBAN

Retrieve a Virtual IBAN based on its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VirtualIbansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    VirtualIbansApi apiInstance = new VirtualIbansApi(defaultClient);
    Integer virtualIbanId = 56; // Integer | The unique identifier of the Virtual IBAN.
    try {
      VirtualIbanObject result = apiInstance.getvirtualiban(virtualIbanId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualIbansApi#getvirtualiban");
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
| **virtualIbanId** | **Integer**| The unique identifier of the Virtual IBAN. | |

### Return type

[**VirtualIbanObject**](VirtualIbanObject.md)

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

<a id="getvirtualibans"></a>
# **getvirtualibans**
> VirtualIbanObject getvirtualibans(accessSignature, accessTag, accessUserId, accessUserIp, virtualIbanId, walletId, typeId, tag, reference, validFrom, validTo, maxUsage, maxAmount, numberOfTransactions, cumulatedAmount, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder)

Search Virtual IBANs

Retrieve virtual IBANs that match search criteria.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VirtualIbansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    VirtualIbansApi apiInstance = new VirtualIbansApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    Integer accessUserIp = 56; // Integer | Legacy attribute, do not use. 
    Integer virtualIbanId = 56; // Integer | The unique identifier of the Virtual IBAN.
    Integer walletId = 56; // Integer | The unique identifier of the Wallet to which the Virtual IBAN is associated.
    Integer typeId = 1; // Integer | The type of the Virtual IBAN.
    Integer tag = 56; // Integer | Custom attribute that you can use as you see fit. <br> Learn more in the [Object tags](/guide/api-basics/objects-tags.html) article. 
    String reference = "reference_example"; // String | The client's internal reference of the Virtual IBAN.
    LocalDate validFrom = LocalDate.now(); // LocalDate | The date from which the Virtual IBAN validity starts. Defaults to today's date and must be set in the future.
    LocalDate validTo = LocalDate.now(); // LocalDate | The date from which the Virtual IBAN validity ends. Must be set after the `validFrom` date. 
    Integer maxUsage = 56; // Integer | The maximum number of transactions allowed.
    Float maxAmount = 3.4F; // Float | The maximum cumulated amount allowed.
    Integer numberOfTransactions = 56; // Integer | The current number of transactions for the Virtual IBAN.
    Float cumulatedAmount = 3.4F; // Float | The cumulated amount of transactions for the Virtual IBAN.
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
    String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value: createdDate.  
    String sortOrder = "DESC"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort. 
    try {
      VirtualIbanObject result = apiInstance.getvirtualibans(accessSignature, accessTag, accessUserId, accessUserIp, virtualIbanId, walletId, typeId, tag, reference, validFrom, validTo, maxUsage, maxAmount, numberOfTransactions, cumulatedAmount, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo, pageNumber, pageCount, sortBy, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualIbansApi#getvirtualibans");
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
| **virtualIbanId** | **Integer**| The unique identifier of the Virtual IBAN. | [optional] |
| **walletId** | **Integer**| The unique identifier of the Wallet to which the Virtual IBAN is associated. | [optional] |
| **typeId** | **Integer**| The type of the Virtual IBAN. | [optional] [enum: 1, 2] |
| **tag** | **Integer**| Custom attribute that you can use as you see fit. &lt;br&gt; Learn more in the [Object tags](/guide/api-basics/objects-tags.html) article.  | [optional] |
| **reference** | **String**| The client&#39;s internal reference of the Virtual IBAN. | [optional] |
| **validFrom** | **LocalDate**| The date from which the Virtual IBAN validity starts. Defaults to today&#39;s date and must be set in the future. | [optional] |
| **validTo** | **LocalDate**| The date from which the Virtual IBAN validity ends. Must be set after the &#x60;validFrom&#x60; date.  | [optional] |
| **maxUsage** | **Integer**| The maximum number of transactions allowed. | [optional] |
| **maxAmount** | **Float**| The maximum cumulated amount allowed. | [optional] |
| **numberOfTransactions** | **Integer**| The current number of transactions for the Virtual IBAN. | [optional] |
| **cumulatedAmount** | **Float**| The cumulated amount of transactions for the Virtual IBAN. | [optional] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with. Default value: createdDate.   | [optional] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  | [optional] [default to DESC] [enum: DESC, ASC] |

### Return type

[**VirtualIbanObject**](VirtualIbanObject.md)

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

<a id="postVirtualIban"></a>
# **postVirtualIban**
> VirtualIbanObject postVirtualIban(accessSignature, accessTag, accessUserId, accessUserIp, postVirtualIbanRequest)

Create Virtual IBAN

Create a new virtual IBAN associated with a given Wallet.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VirtualIbansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    VirtualIbansApi apiInstance = new VirtualIbansApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PostVirtualIbanRequest postVirtualIbanRequest = new PostVirtualIbanRequest(); // PostVirtualIbanRequest | 
    try {
      VirtualIbanObject result = apiInstance.postVirtualIban(accessSignature, accessTag, accessUserId, accessUserIp, postVirtualIbanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualIbansApi#postVirtualIban");
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
| **postVirtualIbanRequest** | [**PostVirtualIbanRequest**](PostVirtualIbanRequest.md)|  | [optional] |

### Return type

[**VirtualIbanObject**](VirtualIbanObject.md)

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

<a id="putVirtualIban"></a>
# **putVirtualIban**
> VirtualIbanObject putVirtualIban(virtualIbanId, accessSignature, accessTag, accessUserId, accessUserIp, putVirtualIbanRequest)

Update Virtual IBAN

Update a Virtual IBAN&#39;s information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VirtualIbansApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    VirtualIbansApi apiInstance = new VirtualIbansApi(defaultClient);
    Integer virtualIbanId = 56; // Integer | The unique identifier of the Virtual IBAN.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PutVirtualIbanRequest putVirtualIbanRequest = new PutVirtualIbanRequest(); // PutVirtualIbanRequest | 
    try {
      VirtualIbanObject result = apiInstance.putVirtualIban(virtualIbanId, accessSignature, accessTag, accessUserId, accessUserIp, putVirtualIbanRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VirtualIbansApi#putVirtualIban");
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
| **virtualIbanId** | **Integer**| The unique identifier of the Virtual IBAN. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **putVirtualIbanRequest** | [**PutVirtualIbanRequest**](PutVirtualIbanRequest.md)|  | [optional] |

### Return type

[**VirtualIbanObject**](VirtualIbanObject.md)

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

