# BusinessesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBusinessInfo**](BusinessesApi.md#getBusinessInfo) | **GET** /v1/businessinformations | Get Business Information |
| [**searchBusiness**](BusinessesApi.md#searchBusiness) | **GET** /v1/businesssearchs | Search Businesses |


<a id="getBusinessInfo"></a>
# **getBusinessInfo**
> GetBusinessInfo200Response getBusinessInfo(country, accessSignature, accessTag, accessUserId, accessUserIp, externalId, registrationNumber, vatNumber)

Get Business Information

The get business information endpoint returns all already known business information. End user will have then to verify/correct it. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    BusinessesApi apiInstance = new BusinessesApi(defaultClient);
    String country = "country_example"; // String | In which country to search. Format [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    String externalId = "externalId_example"; // String | External unique business id. As given in businesssearch reponse.
    String registrationNumber = "registrationNumber_example"; // String | Unique business registration number.
    String vatNumber = "vatNumber_example"; // String | Unique business VAT number.
    try {
      GetBusinessInfo200Response result = apiInstance.getBusinessInfo(country, accessSignature, accessTag, accessUserId, accessUserIp, externalId, registrationNumber, vatNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApi#getBusinessInfo");
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
| **country** | **String**| In which country to search. Format [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries)  | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **externalId** | **String**| External unique business id. As given in businesssearch reponse. | [optional] |
| **registrationNumber** | **String**| Unique business registration number. | [optional] |
| **vatNumber** | **String**| Unique business VAT number. | [optional] |

### Return type

[**GetBusinessInfo200Response**](GetBusinessInfo200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A business information response |  -  |
| **0** | Unexpected error |  -  |

<a id="searchBusiness"></a>
# **searchBusiness**
> List&lt;SearchBusiness200ResponseInner&gt; searchBusiness(country, accessSignature, accessTag, accessUserId, accessUserIp, nameExact, nameMatchBeginning, nameClosestKeywords, registrationNumber, vatNumber, phoneNumber, addressStreet, addressCity, addressPostalCode)

Search Businesses

The search endpoint returns some business information. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    BusinessesApi apiInstance = new BusinessesApi(defaultClient);
    String country = "country_example"; // String | In which country to search. Format [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    String nameExact = "nameExact_example"; // String | Business exact name. Exclusive with `nameMatchBeginning` and `nameClosestKeywords`. 
    String nameMatchBeginning = "nameMatchBeginning_example"; // String | Business names begin with. Exclusive with `nameExact` and `nameClosestKeywords`. 
    String nameClosestKeywords = "nameClosestKeywords_example"; // String | Business names closed to keywords. Exclusive with `nameExact` and `nameMatchBeginning`. 
    String registrationNumber = "registrationNumber_example"; // String | Business registration number.
    String vatNumber = "vatNumber_example"; // String | Business VAT number.
    String phoneNumber = "phoneNumber_example"; // String | Business phone number.
    String addressStreet = "addressStreet_example"; // String | Business' street address.
    String addressCity = "addressCity_example"; // String | Business' city address.
    String addressPostalCode = "addressPostalCode_example"; // String | Business' postal code address.
    try {
      List<SearchBusiness200ResponseInner> result = apiInstance.searchBusiness(country, accessSignature, accessTag, accessUserId, accessUserIp, nameExact, nameMatchBeginning, nameClosestKeywords, registrationNumber, vatNumber, phoneNumber, addressStreet, addressCity, addressPostalCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessesApi#searchBusiness");
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
| **country** | **String**| In which country to search. Format [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries)  | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **nameExact** | **String**| Business exact name. Exclusive with &#x60;nameMatchBeginning&#x60; and &#x60;nameClosestKeywords&#x60;.  | [optional] |
| **nameMatchBeginning** | **String**| Business names begin with. Exclusive with &#x60;nameExact&#x60; and &#x60;nameClosestKeywords&#x60;.  | [optional] |
| **nameClosestKeywords** | **String**| Business names closed to keywords. Exclusive with &#x60;nameExact&#x60; and &#x60;nameMatchBeginning&#x60;.  | [optional] |
| **registrationNumber** | **String**| Business registration number. | [optional] |
| **vatNumber** | **String**| Business VAT number. | [optional] |
| **phoneNumber** | **String**| Business phone number. | [optional] |
| **addressStreet** | **String**| Business&#39; street address. | [optional] |
| **addressCity** | **String**| Business&#39; city address. | [optional] |
| **addressPostalCode** | **String**| Business&#39; postal code address. | [optional] |

### Return type

[**List&lt;SearchBusiness200ResponseInner&gt;**](SearchBusiness200ResponseInner.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A business search response |  -  |
| **0** | Unexpected error |  -  |

