# CardsDigitalizationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cardDigitalizationsId**](CardsDigitalizationApi.md#cardDigitalizationsId) | **GET** /v1/cardDigitalizations/{id} | Get Card Digitalization |
| [**deletecardDigitalizationsId**](CardsDigitalizationApi.md#deletecardDigitalizationsId) | **DELETE** /v1/cardDigitalizations/{id} | Delete Payment Token |
| [**putcardDigitalizationsId**](CardsDigitalizationApi.md#putcardDigitalizationsId) | **PUT** /v1/cardDigitalizations/{id} | Update Payment Token Status |
| [**readcardDigitalizations**](CardsDigitalizationApi.md#readcardDigitalizations) | **GET** /v1/cardDigitalizations | Search Card Digitalizations |


<a id="cardDigitalizationsId"></a>
# **cardDigitalizationsId**
> CardDigitalizationsId200Response cardDigitalizationsId(id)

Get Card Digitalization

Retrieve a Card Digitalization based on its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsDigitalizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsDigitalizationApi apiInstance = new CardsDigitalizationApi(defaultClient);
    Long id = 56L; // Long | Card digitalization internal id.
    try {
      CardDigitalizationsId200Response result = apiInstance.cardDigitalizationsId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsDigitalizationApi#cardDigitalizationsId");
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
| **id** | **Long**| Card digitalization internal id. | |

### Return type

[**CardDigitalizationsId200Response**](CardDigitalizationsId200Response.md)

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

<a id="deletecardDigitalizationsId"></a>
# **deletecardDigitalizationsId**
> ReadcardDigitalizations200Response deletecardDigitalizationsId(id, reasonCode)

Delete Payment Token

Delete a payment Token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsDigitalizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsDigitalizationApi apiInstance = new CardsDigitalizationApi(defaultClient);
    Long id = 56L; // Long | The unique identifier of the Card Digitalization (internal).
    String reasonCode = "reasonCode_example"; // String | The reason code for the action. Possible values are:  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | T | Issuer or cardholder confirmed fraudulent token transactions | | C | Account closed | | Z | Other | 
    try {
      ReadcardDigitalizations200Response result = apiInstance.deletecardDigitalizationsId(id, reasonCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsDigitalizationApi#deletecardDigitalizationsId");
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
| **id** | **Long**| The unique identifier of the Card Digitalization (internal). | |
| **reasonCode** | **String**| The reason code for the action. Possible values are:  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | F | Issuer or cardholder confirmed fraudulent token transactions (Deprecated) | | T | Issuer or cardholder confirmed fraudulent token transactions | | C | Account closed | | Z | Other |  | |

### Return type

[**ReadcardDigitalizations200Response**](ReadcardDigitalizations200Response.md)

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

<a id="putcardDigitalizationsId"></a>
# **putcardDigitalizationsId**
> CardDigitalizationsId200Response putcardDigitalizationsId(id, status, reasonCode)

Update Payment Token Status

Update the status of a payment Token  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsDigitalizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsDigitalizationApi apiInstance = new CardsDigitalizationApi(defaultClient);
    Long id = 56L; // Long | Card digitalization internal id.
    String status = "status_example"; // String | The new status for the payment Token. Possible values are :  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend | 
    String reasonCode = "reasonCode_example"; // String | The reason code for the action. Possible values are:  For a suspension:  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  For an unsuspension:  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other | 
    try {
      CardDigitalizationsId200Response result = apiInstance.putcardDigitalizationsId(id, status, reasonCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsDigitalizationApi#putcardDigitalizationsId");
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
| **id** | **Long**| Card digitalization internal id. | |
| **status** | **String**| The new status for the payment Token. Possible values are :  | Status | Description | | ---- | ----------- | | unsuspend | Unsuspend | | suspend | Suspend |  | |
| **reasonCode** | **String**| The reason code for the action. Possible values are:  For a suspension:  | Reason code | Description | | ---- | ----------- | | L | Cardholder confirmed token device lost | | S | Cardholder confirmed token device stolen | | T | Issuer or cardholder confirmed fraudulent token transactions | | Z | Other |  For an unsuspension:  | Reason code | Description | | ---- | ----------- | | F | Cardholder reported token device found or not stolen | | T | Issuer or cardholder confirmed no fraudulent token transactions | | Z | Other |  | |

### Return type

[**CardDigitalizationsId200Response**](CardDigitalizationsId200Response.md)

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

<a id="readcardDigitalizations"></a>
# **readcardDigitalizations**
> ReadcardDigitalizations200Response readcardDigitalizations(accessSignature, accessTag, accessUserId, accessUserIp, filter)

Search Card Digitalizations

Search for card digitalizations.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CardsDigitalizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CardsDigitalizationApi apiInstance = new CardsDigitalizationApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    String filter = "filter_example"; // String | Filterable fields are : - id - externalId - cardId - status - detailsFromGPS - createdDate - modifiedDate 
    try {
      ReadcardDigitalizations200Response result = apiInstance.readcardDigitalizations(accessSignature, accessTag, accessUserId, accessUserIp, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsDigitalizationApi#readcardDigitalizations");
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
| **filter** | **String**| Filterable fields are : - id - externalId - cardId - status - detailsFromGPS - createdDate - modifiedDate  | [optional] |

### Return type

[**ReadcardDigitalizations200Response**](ReadcardDigitalizations200Response.md)

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

