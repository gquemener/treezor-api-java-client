# AcquiringCardTopupsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acquiringv2TopupCardsChargebacksGet**](AcquiringCardTopupsApi.md#acquiringv2TopupCardsChargebacksGet) | **GET** /v1/topups/cards/chargebacks/{chargebackUuid} | Get Chargeback |
| [**acquiringv2TopupCardsRefundsGet**](AcquiringCardTopupsApi.md#acquiringv2TopupCardsRefundsGet) | **GET** /v1/topups/cards/refunds/{refundUuid} | Get Refund |
| [**acquiringv2TopupCardsRefundsPost**](AcquiringCardTopupsApi.md#acquiringv2TopupCardsRefundsPost) | **POST** /v1/topups/cards/refunds | Create Refund |
| [**deleteAcqAuth**](AcquiringCardTopupsApi.md#deleteAcqAuth) | **DELETE** /v1/topups/cards/authorizations/{authorizationUuid} | Delete Authorization |
| [**deleteTopupCard**](AcquiringCardTopupsApi.md#deleteTopupCard) | **DELETE** /v1/topups/users/{userId}/topupCards/{topupCardId} | Cancel Topup Card |
| [**getAcqAuth**](AcquiringCardTopupsApi.md#getAcqAuth) | **GET** /v1/topups/cards/authorizations/{authorizationUuid} | Get Authorization |
| [**getAcqAuthPayins**](AcquiringCardTopupsApi.md#getAcqAuthPayins) | **GET** /v1/topups/cards/authorizations/{authorizationUuid}/payins | Get Authorization Payins |
| [**getTopupCard**](AcquiringCardTopupsApi.md#getTopupCard) | **GET** /v1/topups/users/{userId}/topupCards/{topupCardId} | Get Topup Card |
| [**getTopupCards**](AcquiringCardTopupsApi.md#getTopupCards) | **GET** /v1/topups/users/{userId}/topupCards | Search Topup Cards |
| [**postAcqAuth**](AcquiringCardTopupsApi.md#postAcqAuth) | **POST** /v1/topups/cards/authorizations | Create Authorization |
| [**postAcqAuthPayin**](AcquiringCardTopupsApi.md#postAcqAuthPayin) | **POST** /v1/topups/cards/authorizations/{authorizationUuid}/payins | Create Payin from Authorization |
| [**postTopupCard**](AcquiringCardTopupsApi.md#postTopupCard) | **POST** /v1/topups/users/{userId}/topupCards | Create Topup Card |


<a id="acquiringv2TopupCardsChargebacksGet"></a>
# **acquiringv2TopupCardsChargebacksGet**
> ChargebacksResponse acquiringv2TopupCardsChargebacksGet(chargebackUuid)

Get Chargeback

Retrieve a card acquiring a chargeback from the system.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    String chargebackUuid = "chargebackUuid_example"; // String | Universally unique identifier (UUID) of the chargeback
    try {
      ChargebacksResponse result = apiInstance.acquiringv2TopupCardsChargebacksGet(chargebackUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#acquiringv2TopupCardsChargebacksGet");
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
| **chargebackUuid** | **String**| Universally unique identifier (UUID) of the chargeback | |

### Return type

[**ChargebacksResponse**](ChargebacksResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Chargeback returned |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="acquiringv2TopupCardsRefundsGet"></a>
# **acquiringv2TopupCardsRefundsGet**
> RefundsResponse acquiringv2TopupCardsRefundsGet(refundUuid)

Get Refund

Retrieve a card acquring refund from the system.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    String refundUuid = "refundUuid_example"; // String | Universally unique identifier (UUID) of the refund
    try {
      RefundsResponse result = apiInstance.acquiringv2TopupCardsRefundsGet(refundUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#acquiringv2TopupCardsRefundsGet");
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
| **refundUuid** | **String**| Universally unique identifier (UUID) of the refund | |

### Return type

[**RefundsResponse**](RefundsResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refund returned |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="acquiringv2TopupCardsRefundsPost"></a>
# **acquiringv2TopupCardsRefundsPost**
> RefundsResponse acquiringv2TopupCardsRefundsPost(payinId, amount, currency, profile)

Create Refund

Create a new card topup refund.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    String payinId = "payinId_example"; // String | The payin universally unique identifier (UUID)
    BigDecimal amount = new BigDecimal(78); // BigDecimal | Refund amount
    String currency = "currency_example"; // String | Base currency for this refund  This three-character currency code must comply with ISO-4217
    String profile = "profile_example"; // String | HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation. Mandatory for legacy payins refunds 
    try {
      RefundsResponse result = apiInstance.acquiringv2TopupCardsRefundsPost(payinId, amount, currency, profile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#acquiringv2TopupCardsRefundsPost");
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
| **payinId** | **String**| The payin universally unique identifier (UUID) | [optional] |
| **amount** | **BigDecimal**| Refund amount | [optional] |
| **currency** | **String**| Base currency for this refund  This three-character currency code must comply with ISO-4217 | [optional] |
| **profile** | **String**| HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation. Mandatory for legacy payins refunds  | [optional] |

### Return type

[**RefundsResponse**](RefundsResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payin successfully refunded. A list of refunds is returned. |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="deleteAcqAuth"></a>
# **deleteAcqAuth**
> AuthorizationDeleteResponse deleteAcqAuth(authorizationUuid)

Delete Authorization

Delete an authorization from the system

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    String authorizationUuid = "authorizationUuid_example"; // String | Universally unique identifier (UUID) of the authorization
    try {
      AuthorizationDeleteResponse result = apiInstance.deleteAcqAuth(authorizationUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#deleteAcqAuth");
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
| **authorizationUuid** | **String**| Universally unique identifier (UUID) of the authorization | |

### Return type

[**AuthorizationDeleteResponse**](AuthorizationDeleteResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authorization returned |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="deleteTopupCard"></a>
# **deleteTopupCard**
> TopupCards deleteTopupCard(userId, topupCardId)

Cancel Topup Card

Change topup card status to CANCELED.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    String userId = "userId_example"; // String | The owning user identifier
    String topupCardId = "topupCardId_example"; // String | The identifier of the topup card to be cancelled
    try {
      TopupCards result = apiInstance.deleteTopupCard(userId, topupCardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#deleteTopupCard");
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
| **userId** | **String**| The owning user identifier | |
| **topupCardId** | **String**| The identifier of the topup card to be cancelled | |

### Return type

[**TopupCards**](TopupCards.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Topup card was cancelled |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="getAcqAuth"></a>
# **getAcqAuth**
> Authorization getAcqAuth(authorizationUuid)

Get Authorization

Retrieve an authorization from the system.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    String authorizationUuid = "authorizationUuid_example"; // String | Universally unique identifier (UUID) of the authorization
    try {
      Authorization result = apiInstance.getAcqAuth(authorizationUuid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#getAcqAuth");
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
| **authorizationUuid** | **String**| Universally unique identifier (UUID) of the authorization | |

### Return type

[**Authorization**](Authorization.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authorization returned |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="getAcqAuthPayins"></a>
# **getAcqAuthPayins**
> List&lt;AcquiringPayin&gt; getAcqAuthPayins(authorizationUuid, exclusiveStartKey)

Get Authorization Payins

List payins created from a given authorization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    String authorizationUuid = "authorizationUuid_example"; // String | Universally unique identifier (UUID) of the authorization
    String exclusiveStartKey = "exclusiveStartKey_example"; // String | The exclusive start key returned by a previous call
    try {
      List<AcquiringPayin> result = apiInstance.getAcqAuthPayins(authorizationUuid, exclusiveStartKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#getAcqAuthPayins");
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
| **authorizationUuid** | **String**| Universally unique identifier (UUID) of the authorization | |
| **exclusiveStartKey** | **String**| The exclusive start key returned by a previous call | [optional] |

### Return type

[**List&lt;AcquiringPayin&gt;**](AcquiringPayin.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Payins is returned |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="getTopupCard"></a>
# **getTopupCard**
> TopupCards getTopupCard(userId, topupCardId)

Get Topup Card

Retrieve the details of a Topup Card.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    String userId = "userId_example"; // String | The owning user identifier
    String topupCardId = "topupCardId_example"; // String | The identifier of the topup card to be retrieved
    try {
      TopupCards result = apiInstance.getTopupCard(userId, topupCardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#getTopupCard");
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
| **userId** | **String**| The owning user identifier | |
| **topupCardId** | **String**| The identifier of the topup card to be retrieved | |

### Return type

[**TopupCards**](TopupCards.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A topup card details search response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="getTopupCards"></a>
# **getTopupCards**
> TopupCards getTopupCards(userId)

Search Topup Cards

Get topup cards.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    String userId = "userId_example"; // String | The owning user identifier
    try {
      TopupCards result = apiInstance.getTopupCards(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#getTopupCards");
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
| **userId** | **String**| The owning user identifier | |

### Return type

[**TopupCards**](TopupCards.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A topup cards details search response |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="postAcqAuth"></a>
# **postAcqAuth**
> Authorization postAcqAuth(authorizationRequest)

Create Authorization

Create an authorization to make a card topup payin within 7 days. The card must be [tokenized](/guide/acquiring/card-tokenization.html) first. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    AuthorizationRequest authorizationRequest = new AuthorizationRequest(); // AuthorizationRequest | 
    try {
      Authorization result = apiInstance.postAcqAuth(authorizationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#postAcqAuth");
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
| **authorizationRequest** | [**AuthorizationRequest**](AuthorizationRequest.md)|  | [optional] |

### Return type

[**Authorization**](Authorization.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An authorization has been created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="postAcqAuthPayin"></a>
# **postAcqAuthPayin**
> CaptureResponse postAcqAuthPayin(authorizationUuid, postAcqAuthPayinRequest)

Create Payin from Authorization

Create a payin from an authorization. The amount must be ≤ to the authorization amount. [Learn more](/guide/acquiring/preauthorized.html#advanced-capture).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    String authorizationUuid = "authorizationUuid_example"; // String | Universally unique identifier (UUID) of the authorization
    PostAcqAuthPayinRequest postAcqAuthPayinRequest = new PostAcqAuthPayinRequest(); // PostAcqAuthPayinRequest | 
    try {
      CaptureResponse result = apiInstance.postAcqAuthPayin(authorizationUuid, postAcqAuthPayinRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#postAcqAuthPayin");
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
| **authorizationUuid** | **String**| Universally unique identifier (UUID) of the authorization | |
| **postAcqAuthPayinRequest** | [**PostAcqAuthPayinRequest**](PostAcqAuthPayinRequest.md)|  | [optional] |

### Return type

[**CaptureResponse**](CaptureResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payin returned |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="postTopupCard"></a>
# **postTopupCard**
> TopupCards postTopupCard(userId, topupCardRequest)

Create Topup Card

Create a new topup card. The card must have been previously tokenized. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringCardTopupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringCardTopupsApi apiInstance = new AcquiringCardTopupsApi(defaultClient);
    String userId = "userId_example"; // String | The owning user identifier
    TopupCardRequest topupCardRequest = new TopupCardRequest(); // TopupCardRequest | 
    try {
      TopupCards result = apiInstance.postTopupCard(userId, topupCardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringCardTopupsApi#postTopupCard");
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
| **userId** | **String**| The owning user identifier | |
| **topupCardRequest** | [**TopupCardRequest**](TopupCardRequest.md)|  | [optional] |

### Return type

[**TopupCards**](TopupCards.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Topup card was created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

