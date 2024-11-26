# CardsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateCard**](CardsApi.md#activateCard) | **PUT** /v1/cards/{cardId}/Activate | Activate Card |
| [**activateCardToken**](CardsApi.md#activateCardToken) | **PUT** /v1/cards/{cardToken}/public-token-activation | Activate Card Public Token |
| [**cardOptions**](CardsApi.md#cardOptions) | **PUT** /v1/cards/{cardId}/Options | Update Card Options |
| [**changePin**](CardsApi.md#changePin) | **PUT** /v1/cards/{cardId}/ChangePIN | Change Card PIN |
| [**convertVirtual**](CardsApi.md#convertVirtual) | **PUT** /v1/cards/{cardId}/ConvertVirtual | Convert virtual card to physical |
| [**getCard**](CardsApi.md#getCard) | **GET** /v1/cards/{cardId} | Get Card |
| [**getCardImage**](CardsApi.md#getCardImage) | **GET** /v1/cardimages | Get Card Image |
| [**getCards**](CardsApi.md#getCards) | **GET** /v1/cards | Search Cards |
| [**getRenewalDetails**](CardsApi.md#getRenewalDetails) | **GET** /v1/cards/{cardId}/renewalDetails | Get Renewal Details |
| [**post3ds**](CardsApi.md#post3ds) | **POST** /v1/cards/Register3DS | Register 3D secure |
| [**postCardPhysical**](CardsApi.md#postCardPhysical) | **POST** /v1/cards/RequestPhysical | Create Physical Card |
| [**postCardVirtual**](CardsApi.md#postCardVirtual) | **POST** /v1/cards/CreateVirtual | Create Virtual Card |
| [**putCard**](CardsApi.md#putCard) | **PUT** /v1/cards/{cardId} | Update Card |
| [**putLimits**](CardsApi.md#putLimits) | **PUT** /v1/cards/{cardId}/Limits | Update Card Limits |
| [**putRenew**](CardsApi.md#putRenew) | **PUT** /v1/cards/{cardId}/renew | Renew Card |
| [**reassignCard**](CardsApi.md#reassignCard) | **PUT** /v1/cards/{cardId}/Assign | Reassign Card |
| [**regenerateCard**](CardsApi.md#regenerateCard) | **PUT** /v1/cards/{cardId}/Regenerate | Regenerate Card |
| [**setPin**](CardsApi.md#setPin) | **PUT** /v1/cards/{cardId}/setPIN | Set Card PIN |
| [**unblockCvc**](CardsApi.md#unblockCvc) | **PUT** /v1/cards/{cardId}/unblockcvc2 | Unblock Card CVC2 |
| [**unblockPin**](CardsApi.md#unblockPin) | **PUT** /v1/cards/{cardId}/UnblockPIN | Unblock Card PIN |
| [**updateBlockStatus**](CardsApi.md#updateBlockStatus) | **PUT** /v1/cards/{cardId}/LockUnlock | Update Card Lock Status |
| [**updateRenewalDetails**](CardsApi.md#updateRenewalDetails) | **PUT** /v1/cards/{cardId}/renewalDetails | Update Renewal Details |


<a id="activateCard"></a>
# **activateCard**
> CardObject activateCard(cardId, accessToken, accessSignature, accessUserId, accessUserIp, activateCardRequest)

Activate Card

Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    String accessToken = "accessToken_example"; // String | Legacy attribute, do not use. 
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    ActivateCardRequest activateCardRequest = new ActivateCardRequest(); // ActivateCardRequest | 
    try {
      CardObject result = apiInstance.activateCard(cardId, accessToken, accessSignature, accessUserId, accessUserIp, activateCardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#activateCard");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **accessToken** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **activateCardRequest** | [**ActivateCardRequest**](ActivateCardRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="activateCardToken"></a>
# **activateCardToken**
> CardObject activateCardToken(cardToken)

Activate Card Public Token

Activate the Card (updating the &#x60;isLive&#x60; attribute to &#x60;1&#x60;). Ideal for end-user oriented action. A Card must be activated to be used.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    String cardToken = "cardToken_example"; // String | The `publicToken` of the Card.
    try {
      CardObject result = apiInstance.activateCardToken(cardToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#activateCardToken");
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
| **cardToken** | **String**| The &#x60;publicToken&#x60; of the Card. | |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="cardOptions"></a>
# **cardOptions**
> CardObject cardOptions(cardId, accessSignature, accessUserId, accessUserIp, cardOptionsRequest)

Update Card Options

Modify the Card permissions group.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    CardOptionsRequest cardOptionsRequest = new CardOptionsRequest(); // CardOptionsRequest | 
    try {
      CardObject result = apiInstance.cardOptions(cardId, accessSignature, accessUserId, accessUserIp, cardOptionsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#cardOptions");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **cardOptionsRequest** | [**CardOptionsRequest**](CardOptionsRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="changePin"></a>
# **changePin**
> CardObject changePin(cardId, accessSignature, accessUserId, accessUserIp, changePinRequest)

Change Card PIN

Change the Card PIN code knowing the current one.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    ChangePinRequest changePinRequest = new ChangePinRequest(); // ChangePinRequest | 
    try {
      CardObject result = apiInstance.changePin(cardId, accessSignature, accessUserId, accessUserIp, changePinRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#changePin");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **changePinRequest** | [**ChangePinRequest**](ChangePinRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="convertVirtual"></a>
# **convertVirtual**
> CardObject convertVirtual(cardId, accessSignature, accessUserId, accessUserIp, convertVirtualRequest)

Convert virtual card to physical

Convert a virtual Card into a physical one. The converted card will be both virtual and physical. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card to convert.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    ConvertVirtualRequest convertVirtualRequest = new ConvertVirtualRequest(); // ConvertVirtualRequest | 
    try {
      CardObject result = apiInstance.convertVirtual(cardId, accessSignature, accessUserId, accessUserIp, convertVirtualRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#convertVirtual");
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
| **cardId** | **Integer**| The unique identifier of the Card to convert. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **convertVirtualRequest** | [**ConvertVirtualRequest**](ConvertVirtualRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="getCard"></a>
# **getCard**
> CardObject getCard(cardId)

Get Card

Retrieve a Card based on its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Long cardId = 56L; // Long | The unique identifier of the Card.
    try {
      CardObject result = apiInstance.getCard(cardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#getCard");
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
| **cardId** | **Long**| The unique identifier of the Card. | |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

<a id="getCardImage"></a>
# **getCardImage**
> GetCardImage200Response getCardImage(cardId, accessSignature, accessTag, accessUserId, accessUserIp)

Get Card Image

Retrieve a virtual card image.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the virtual card.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    try {
      GetCardImage200Response result = apiInstance.getCardImage(cardId, accessSignature, accessTag, accessUserId, accessUserIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#getCardImage");
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
| **cardId** | **Integer**| The unique identifier of the virtual card. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |

### Return type

[**GetCardImage200Response**](GetCardImage200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="getCards"></a>
# **getCards**
> CardObject getCards(accessSignature, accessTag, accessUserId, accessUserIp, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Cards

Retrieve Cards based on search criteria.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    Integer userId = 56; // Integer | The unique identifier of the cardholder
    String embossedName = "embossedName_example"; // String | Embossed name of the card
    String publicToken = "publicToken_example"; // String | Public token of the card
    String permsGroup = "permsGroup_example"; // String | Permissions group of the card.  <br /> See [available values on the documentation](/guide/cards/restrictions-limits.html#permission-groups-permsgroup) 
    Integer isPhysical = 56; // Integer | Whether or not the card is a Physical Card. Values can be:   * `1` – Physical card   * `0` – Virtual card 
    Integer isConverted = 56; // Integer | Whether or not the card is a Virtual Card that has been converted into a Physical Card. Values can be:   * `1` – Physical card converted from a virtual card   * `0` – Not converted, virtual card only 
    Integer lockStatus = 56; // Integer | The Status of the card, indicating whether it is locked, lost, or destroyed for instance. While this field is an integer, it returns a plaintext value. See the full list of `lockStatus`in the [Block a Card](/guide/cards/modification.html#status) article. 
    Integer mccRestrictionGroupId = 56; // Integer | mccRestrictionGroupId of the card
    Integer merchantRestrictionGroupId = 56; // Integer | merchantRestrictionGroupId of the card
    Integer countryRestrictionGroupId = 56; // Integer | countryRestrictionGroupId of the card
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
    String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_.  
    String sortOrder = "DESC"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort. 
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.  
    try {
      CardObject result = apiInstance.getCards(accessSignature, accessTag, accessUserId, accessUserIp, cardId, userId, embossedName, publicToken, permsGroup, isPhysical, isConverted, lockStatus, mccRestrictionGroupId, merchantRestrictionGroupId, countryRestrictionGroupId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#getCards");
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
| **cardId** | **Integer**| The unique identifier of the Card. | [optional] |
| **userId** | **Integer**| The unique identifier of the cardholder | [optional] |
| **embossedName** | **String**| Embossed name of the card | [optional] |
| **publicToken** | **String**| Public token of the card | [optional] |
| **permsGroup** | **String**| Permissions group of the card.  &lt;br /&gt; See [available values on the documentation](/guide/cards/restrictions-limits.html#permission-groups-permsgroup)  | [optional] |
| **isPhysical** | **Integer**| Whether or not the card is a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card   * &#x60;0&#x60; – Virtual card  | [optional] |
| **isConverted** | **Integer**| Whether or not the card is a Virtual Card that has been converted into a Physical Card. Values can be:   * &#x60;1&#x60; – Physical card converted from a virtual card   * &#x60;0&#x60; – Not converted, virtual card only  | [optional] |
| **lockStatus** | **Integer**| The Status of the card, indicating whether it is locked, lost, or destroyed for instance. While this field is an integer, it returns a plaintext value. See the full list of &#x60;lockStatus&#x60;in the [Block a Card](/guide/cards/modification.html#status) article.  | [optional] |
| **mccRestrictionGroupId** | **Integer**| mccRestrictionGroupId of the card | [optional] |
| **merchantRestrictionGroupId** | **Integer**| merchantRestrictionGroupId of the card | [optional] |
| **countryRestrictionGroupId** | **Integer**| countryRestrictionGroupId of the card | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_.   | [optional] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  | [optional] [default to DESC] [enum: DESC, ASC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.   | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **0** | Unexpected error |  -  |

<a id="getRenewalDetails"></a>
# **getRenewalDetails**
> GetRenewalDetails200Response getRenewalDetails(cardId)

Get Renewal Details

Retrieve the Card &#x60;renewalType&#x60;. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    try {
      GetRenewalDetails200Response result = apiInstance.getRenewalDetails(cardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#getRenewalDetails");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |

### Return type

[**GetRenewalDetails200Response**](GetRenewalDetails200Response.md)

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
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="post3ds"></a>
# **post3ds**
> CardObject post3ds(accessSignature, post3dsRequest)

Register 3D secure

Register a card to 3D secure service. The user&#39;s mobile number must begin with &#x60;+&#x60;, or &#x60;00&#x60;, and the country dialing code. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use.
    Post3dsRequest post3dsRequest = new Post3dsRequest(); // Post3dsRequest | 
    try {
      CardObject result = apiInstance.post3ds(accessSignature, post3dsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#post3ds");
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
| **accessSignature** | **String**| Legacy attribute, do not use. | [optional] |
| **post3dsRequest** | [**Post3dsRequest**](Post3dsRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="postCardPhysical"></a>
# **postCardPhysical**
> CardObject postCardPhysical(accessSignature, accessUserId, accessUserIp, postCardVirtualRequest)

Create Physical Card

Create a new physical card. To use a card, it must be activated (&#x60;/cards/{id}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PostCardVirtualRequest postCardVirtualRequest = new PostCardVirtualRequest(); // PostCardVirtualRequest | 
    try {
      CardObject result = apiInstance.postCardPhysical(accessSignature, accessUserId, accessUserIp, postCardVirtualRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#postCardPhysical");
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
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **postCardVirtualRequest** | [**PostCardVirtualRequest**](PostCardVirtualRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="postCardVirtual"></a>
# **postCardVirtual**
> CardObject postCardVirtual(accessSignature, accessUserId, accessUserIp, postCardVirtualRequest)

Create Virtual Card

Create a new virtual card. To use a card, it must be activated (&#x60;/v1/cards/{cardId}/Activate&#x60;).  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PostCardVirtualRequest postCardVirtualRequest = new PostCardVirtualRequest(); // PostCardVirtualRequest | 
    try {
      CardObject result = apiInstance.postCardVirtual(accessSignature, accessUserId, accessUserIp, postCardVirtualRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#postCardVirtual");
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
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **postCardVirtualRequest** | [**PostCardVirtualRequest**](PostCardVirtualRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="putCard"></a>
# **putCard**
> CardObject putCard(cardId, accessSignature, accessUserId, accessUserIp, putCardRequest)

Update Card

Update the restriction groups of the card, as well as the &#x60;cardTag&#x60;. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PutCardRequest putCardRequest = new PutCardRequest(); // PutCardRequest | 
    try {
      CardObject result = apiInstance.putCard(cardId, accessSignature, accessUserId, accessUserIp, putCardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#putCard");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **putCardRequest** | [**PutCardRequest**](PutCardRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="putLimits"></a>
# **putLimits**
> CardObject putLimits(cardId, accessSignature, accessUserId, accessUserIp, putLimitsRequest)

Update Card Limits

Modify the Card limits.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PutLimitsRequest putLimitsRequest = new PutLimitsRequest(); // PutLimitsRequest | 
    try {
      CardObject result = apiInstance.putLimits(cardId, accessSignature, accessUserId, accessUserIp, putLimitsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#putLimits");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **putLimitsRequest** | [**PutLimitsRequest**](PutLimitsRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="putRenew"></a>
# **putRenew**
> CardObject putRenew(cardId)

Renew Card

Renew a Card manually. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    try {
      CardObject result = apiInstance.putRenew(cardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#putRenew");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="reassignCard"></a>
# **reassignCard**
> CardObject reassignCard(cardId, accessToken, accessSignature, reassignCardRequest)

Reassign Card

Assign the Card to another User or Wallet. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card to reassign.
    String accessToken = "accessToken_example"; // String | Legacy attribute, do not use. 
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    ReassignCardRequest reassignCardRequest = new ReassignCardRequest(); // ReassignCardRequest | 
    try {
      CardObject result = apiInstance.reassignCard(cardId, accessToken, accessSignature, reassignCardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#reassignCard");
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
| **cardId** | **Integer**| The unique identifier of the Card to reassign. | |
| **accessToken** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **reassignCardRequest** | [**ReassignCardRequest**](ReassignCardRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="regenerateCard"></a>
# **regenerateCard**
> CardObject regenerateCard(cardId, accessSignature, accessUserId, accessUserIp, convertVirtualRequest)

Regenerate Card

Recreate the card image if the card is unlocked.   Useful when changing card design, company name, or when retrieving the image results in a 404. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    ConvertVirtualRequest convertVirtualRequest = new ConvertVirtualRequest(); // ConvertVirtualRequest | 
    try {
      CardObject result = apiInstance.regenerateCard(cardId, accessSignature, accessUserId, accessUserIp, convertVirtualRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#regenerateCard");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **convertVirtualRequest** | [**ConvertVirtualRequest**](ConvertVirtualRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="setPin"></a>
# **setPin**
> CardObject setPin(cardId, accessSignature, accessUserId, accessUserIp, setPinRequest)

Set Card PIN

Overwrite the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    SetPinRequest setPinRequest = new SetPinRequest(); // SetPinRequest | 
    try {
      CardObject result = apiInstance.setPin(cardId, accessSignature, accessUserId, accessUserIp, setPinRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#setPin");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **setPinRequest** | [**SetPinRequest**](SetPinRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="unblockCvc"></a>
# **unblockCvc**
> unblockCvc(cardId)

Unblock Card CVC2

Unblock a Card whose CVC2 is locked. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    try {
      apiInstance.unblockCvc(cardId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#unblockCvc");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | successfully unblocked. |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="unblockPin"></a>
# **unblockPin**
> CardObject unblockPin(cardId, accessSignature, accessUserId, accessUserIp, convertVirtualRequest)

Unblock Card PIN

Unblock the Card PIN code.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    ConvertVirtualRequest convertVirtualRequest = new ConvertVirtualRequest(); // ConvertVirtualRequest | 
    try {
      CardObject result = apiInstance.unblockPin(cardId, accessSignature, accessUserId, accessUserIp, convertVirtualRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#unblockPin");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **convertVirtualRequest** | [**ConvertVirtualRequest**](ConvertVirtualRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="updateBlockStatus"></a>
# **updateBlockStatus**
> CardObject updateBlockStatus(cardId, accessSignature, accessUserId, accessUserIp, updateBlockStatusRequest)

Update Card Lock Status

Block or unblock a card.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    UpdateBlockStatusRequest updateBlockStatusRequest = new UpdateBlockStatusRequest(); // UpdateBlockStatusRequest | 
    try {
      CardObject result = apiInstance.updateBlockStatus(cardId, accessSignature, accessUserId, accessUserIp, updateBlockStatusRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#updateBlockStatus");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **updateBlockStatusRequest** | [**UpdateBlockStatusRequest**](UpdateBlockStatusRequest.md)|  | [optional] |

### Return type

[**CardObject**](CardObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="updateRenewalDetails"></a>
# **updateRenewalDetails**
> GetRenewalDetails200Response updateRenewalDetails(cardId, updateRenewalDetailsRequest)

Update Renewal Details

Update the Card &#x60;renewalType&#x60;. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsApi apiInstance = new CardsApi(defaultClient);
    Integer cardId = 56; // Integer | The unique identifier of the Card.
    UpdateRenewalDetailsRequest updateRenewalDetailsRequest = new UpdateRenewalDetailsRequest(); // UpdateRenewalDetailsRequest | 
    try {
      GetRenewalDetails200Response result = apiInstance.updateRenewalDetails(cardId, updateRenewalDetailsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#updateRenewalDetails");
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
| **cardId** | **Integer**| The unique identifier of the Card. | |
| **updateRenewalDetailsRequest** | [**UpdateRenewalDetailsRequest**](UpdateRenewalDetailsRequest.md)|  | [optional] |

### Return type

[**GetRenewalDetails200Response**](GetRenewalDetails200Response.md)

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
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

