# UserTaxResidencesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTaxresidence**](UserTaxResidencesApi.md#deleteTaxresidence) | **DELETE** /v1/taxResidences/{taxResidenceId} | Delete a residence |
| [**getTaxresidence**](UserTaxResidencesApi.md#getTaxresidence) | **GET** /v1/taxResidences/{taxResidenceId} | Get Tax Residence |
| [**getTaxresidences**](UserTaxResidencesApi.md#getTaxresidences) | **GET** /v1/taxResidences | Search Tax Residences |
| [**postTaxresidence**](UserTaxResidencesApi.md#postTaxresidence) | **POST** /v1/taxResidences | Create Tax Residence |
| [**putTaxresidence**](UserTaxResidencesApi.md#putTaxresidence) | **PUT** /v1/taxResidences/{taxResidenceId} | Update Tax Residence |


<a id="deleteTaxresidence"></a>
# **deleteTaxresidence**
> TaxResidenceObject deleteTaxresidence(taxResidenceId, accessSignature)

Delete a residence

Delete a residence that match id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserTaxResidencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserTaxResidencesApi apiInstance = new UserTaxResidencesApi(defaultClient);
    Integer taxResidenceId = 56; // Integer | The unique identifier of the Tax Residence
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use.
    try {
      TaxResidenceObject result = apiInstance.deleteTaxresidence(taxResidenceId, accessSignature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTaxResidencesApi#deleteTaxresidence");
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
| **taxResidenceId** | **Integer**| The unique identifier of the Tax Residence | |
| **accessSignature** | **String**| Legacy attribute, do not use. | [optional] |

### Return type

[**TaxResidenceObject**](TaxResidenceObject.md)

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

<a id="getTaxresidence"></a>
# **getTaxresidence**
> TaxResidenceObject getTaxresidence(taxResidenceId, accessSignature)

Get Tax Residence

Retrieve a Tax Residence based on its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserTaxResidencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserTaxResidencesApi apiInstance = new UserTaxResidencesApi(defaultClient);
    Integer taxResidenceId = 56; // Integer | The unique identifier of the TaxResidence.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use.
    try {
      TaxResidenceObject result = apiInstance.getTaxresidence(taxResidenceId, accessSignature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTaxResidencesApi#getTaxresidence");
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
| **taxResidenceId** | **Integer**| The unique identifier of the TaxResidence. | |
| **accessSignature** | **String**| Legacy attribute, do not use. | [optional] |

### Return type

[**TaxResidenceObject**](TaxResidenceObject.md)

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

<a id="getTaxresidences"></a>
# **getTaxresidences**
> TaxResidenceObject getTaxresidences(accessSignature, id, userId)

Search Tax Residences

Retrieve Tax Residences that match your search conditions.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserTaxResidencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserTaxResidencesApi apiInstance = new UserTaxResidencesApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    Integer id = 56; // Integer | The unique identifier of the Tax Residence.
    Integer userId = 56; // Integer | The unique identifier of the User.
    try {
      TaxResidenceObject result = apiInstance.getTaxresidences(accessSignature, id, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTaxResidencesApi#getTaxresidences");
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
| **id** | **Integer**| The unique identifier of the Tax Residence. | [optional] |
| **userId** | **Integer**| The unique identifier of the User. | [optional] |

### Return type

[**TaxResidenceObject**](TaxResidenceObject.md)

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

<a id="postTaxresidence"></a>
# **postTaxresidence**
> TaxResidenceObject postTaxresidence(accessSignature, postTaxresidenceRequest)

Create Tax Residence

Create a new Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserTaxResidencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserTaxResidencesApi apiInstance = new UserTaxResidencesApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    PostTaxresidenceRequest postTaxresidenceRequest = new PostTaxresidenceRequest(); // PostTaxresidenceRequest | 
    try {
      TaxResidenceObject result = apiInstance.postTaxresidence(accessSignature, postTaxresidenceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTaxResidencesApi#postTaxresidence");
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
| **postTaxresidenceRequest** | [**PostTaxresidenceRequest**](PostTaxresidenceRequest.md)|  | [optional] |

### Return type

[**TaxResidenceObject**](TaxResidenceObject.md)

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

<a id="putTaxresidence"></a>
# **putTaxresidence**
> TaxResidenceObject putTaxresidence(taxResidenceId, accessSignature, userId, country, taxPayerId, liabilityWaiver)

Update Tax Residence

Modify an existing Tax Residence.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserTaxResidencesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserTaxResidencesApi apiInstance = new UserTaxResidencesApi(defaultClient);
    Integer taxResidenceId = 56; // Integer | The unique identifier of the TaxResidence
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use.
    Integer userId = 56; // Integer | User's id residence
    String country = "country_example"; // String | country of the resident
    String taxPayerId = "taxPayerId_example"; // String | Tax payer's id
    Boolean liabilityWaiver = true; // Boolean | Tax declaration
    try {
      TaxResidenceObject result = apiInstance.putTaxresidence(taxResidenceId, accessSignature, userId, country, taxPayerId, liabilityWaiver);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserTaxResidencesApi#putTaxresidence");
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
| **taxResidenceId** | **Integer**| The unique identifier of the TaxResidence | |
| **accessSignature** | **String**| Legacy attribute, do not use. | [optional] |
| **userId** | **Integer**| User&#39;s id residence | [optional] |
| **country** | **String**| country of the resident | [optional] |
| **taxPayerId** | **String**| Tax payer&#39;s id | [optional] |
| **liabilityWaiver** | **Boolean**| Tax declaration | [optional] |

### Return type

[**TaxResidenceObject**](TaxResidenceObject.md)

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

