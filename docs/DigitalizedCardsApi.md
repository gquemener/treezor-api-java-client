# DigitalizedCardsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDigitalized**](DigitalizedCardsApi.md#deleteDigitalized) | **DELETE** /v1/digitalizedCard/{id} | Deactivate Payment Token |
| [**getDigitalized**](DigitalizedCardsApi.md#getDigitalized) | **GET** /v1/{cardId}/digitalizedCards | Get Digitalized Cards |
| [**getPaymentToken**](DigitalizedCardsApi.md#getPaymentToken) | **GET** /v1/digitalizedCard/{id} | Get Payment Token |
| [**putDigitalized**](DigitalizedCardsApi.md#putDigitalized) | **PUT** /v1/digitalizedCard/{id} | Update Payment Token Status |
| [**tavRequestPOST**](DigitalizedCardsApi.md#tavRequestPOST) | **POST** /v1/issuerInitiatedDigitizationDatas | Request issuerInitiatedDigitizationData |


<a id="deleteDigitalized"></a>
# **deleteDigitalized**
> DigitalizedCardsDeactivateDigitalizedCardResponse deleteDigitalized(id, reasonCode)

Deactivate Payment Token

Deactivate a payment Token. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DigitalizedCardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    DigitalizedCardsApi apiInstance = new DigitalizedCardsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of a digitalized card. 
    String reasonCode = "L"; // String | The reason code is required only if the card is on Mastercard System. Possible values are:  | Reason code | Description | | :----: | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | C | Account closed | | D | Issuer consumer deleted | | Z | Other | 
    try {
      DigitalizedCardsDeactivateDigitalizedCardResponse result = apiInstance.deleteDigitalized(id, reasonCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DigitalizedCardsApi#deleteDigitalized");
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
| **id** | **String**| The unique identifier of a digitalized card.  | |
| **reasonCode** | **String**| The reason code is required only if the card is on Mastercard System. Possible values are:  | Reason code | Description | | :----: | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | C | Account closed | | D | Issuer consumer deleted | | Z | Other |  | [enum: L, S, F, T, C, D, Z] |

### Return type

[**DigitalizedCardsDeactivateDigitalizedCardResponse**](DigitalizedCardsDeactivateDigitalizedCardResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | one of input is invalid or missing, or else card is not unlock. |  -  |
| **401** | user is not authorized to do this operation. |  -  |
| **404** | digitalized card does not exist. |  -  |
| **500** | internal error. |  -  |

<a id="getDigitalized"></a>
# **getDigitalized**
> List&lt;DigitalizedCardsGetDigitalizedCardResponse&gt; getDigitalized(cardId)

Get Digitalized Cards

Retrieve the list of digitalized cards for a given &#x60;cardId&#x60;. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DigitalizedCardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    DigitalizedCardsApi apiInstance = new DigitalizedCardsApi(defaultClient);
    String cardId = "cardId_example"; // String | The unique identifier of the virtual or physical card.
    try {
      List<DigitalizedCardsGetDigitalizedCardResponse> result = apiInstance.getDigitalized(cardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DigitalizedCardsApi#getDigitalized");
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
| **cardId** | **String**| The unique identifier of the virtual or physical card. | |

### Return type

[**List&lt;DigitalizedCardsGetDigitalizedCardResponse&gt;**](DigitalizedCardsGetDigitalizedCardResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | one of input is invalid or missing. |  -  |
| **401** | user is not authorized to do this operation. |  -  |
| **404** | digitalized card does not exist. |  -  |
| **500** | internal error. |  -  |

<a id="getPaymentToken"></a>
# **getPaymentToken**
> DigitalizedCardsGetDigitalizedCardResponse getPaymentToken(id)

Get Payment Token

Retrieve a payment token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DigitalizedCardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    DigitalizedCardsApi apiInstance = new DigitalizedCardsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of a digitalized card. 
    try {
      DigitalizedCardsGetDigitalizedCardResponse result = apiInstance.getPaymentToken(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DigitalizedCardsApi#getPaymentToken");
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
| **id** | **String**| The unique identifier of a digitalized card.  | |

### Return type

[**DigitalizedCardsGetDigitalizedCardResponse**](DigitalizedCardsGetDigitalizedCardResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | one of input is invalid or missing. |  -  |
| **401** | user is not authorized to do this operation. |  -  |
| **404** | digitalized card does not exist. |  -  |
| **500** | internal error. |  -  |

<a id="putDigitalized"></a>
# **putDigitalized**
> DigitalizedCardsPutDigitalizedCardResponse putDigitalized(id, putDigitalizedRequest)

Update Payment Token Status

Update the status of a payment Token. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DigitalizedCardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    DigitalizedCardsApi apiInstance = new DigitalizedCardsApi(defaultClient);
    String id = "id_example"; // String | The unique identifier of a digitalized card. 
    PutDigitalizedRequest putDigitalizedRequest = new PutDigitalizedRequest(); // PutDigitalizedRequest | 
    try {
      DigitalizedCardsPutDigitalizedCardResponse result = apiInstance.putDigitalized(id, putDigitalizedRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DigitalizedCardsApi#putDigitalized");
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
| **id** | **String**| The unique identifier of a digitalized card.  | |
| **putDigitalizedRequest** | [**PutDigitalizedRequest**](PutDigitalizedRequest.md)|  | |

### Return type

[**DigitalizedCardsPutDigitalizedCardResponse**](DigitalizedCardsPutDigitalizedCardResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | one of input is invalid or missing, or else card is not unlock. |  -  |
| **401** | user is not authorized to do this operation. |  -  |
| **404** | digitalized card does not exist. |  -  |
| **500** | internal error. |  -  |

<a id="tavRequestPOST"></a>
# **tavRequestPOST**
> TavRequestPOST200Response tavRequestPOST(accessSignature, accessTag, accessUserId, accessUserIp, tavRequestPOSTRequest)

Request issuerInitiatedDigitizationData

Create a new issuerInitiatedDigitizationData request  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DigitalizedCardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    DigitalizedCardsApi apiInstance = new DigitalizedCardsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use.
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use.
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use.
    TavRequestPOSTRequest tavRequestPOSTRequest = new TavRequestPOSTRequest(); // TavRequestPOSTRequest | 
    try {
      TavRequestPOST200Response result = apiInstance.tavRequestPOST(accessSignature, accessTag, accessUserId, accessUserIp, tavRequestPOSTRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DigitalizedCardsApi#tavRequestPOST");
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
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use. | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use. | [optional] |
| **tavRequestPOSTRequest** | [**TavRequestPOSTRequest**](TavRequestPOSTRequest.md)|  | [optional] |

### Return type

[**TavRequestPOST200Response**](TavRequestPOST200Response.md)

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
| **401** | Method Not Allowed |  -  |
| **404** | Not Found |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

