# BeneficiariesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBeneficiaries**](BeneficiariesApi.md#getBeneficiaries) | **GET** /v1/beneficiaries | Search Beneficiaries |
| [**getBeneficiary**](BeneficiariesApi.md#getBeneficiary) | **GET** /v1/beneficiaries/{beneficiaryId} | Get Beneficiary |
| [**postBeneficiary**](BeneficiariesApi.md#postBeneficiary) | **POST** /v1/beneficiaries | Create Beneficiary |
| [**putBeneficiary**](BeneficiariesApi.md#putBeneficiary) | **PUT** /v1/beneficiaries/{beneficiaryId} | Update Beneficiary |


<a id="getBeneficiaries"></a>
# **getBeneficiaries**
> BeneficiaryObject getBeneficiaries(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, id, userId, iban, bic, nickName, name, pageNumber, pageCount, sortBy, sortOrder)

Search Beneficiaries

Retrieve Beneficiary bank accounts that match search criteria.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeneficiariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    BeneficiariesApi apiInstance = new BeneficiariesApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    List<String> fields = Arrays.asList(); // List<String> | List of the object properties you want to pick up.
    String filter = "filter_example"; // String | You can filter the API response by using filter(s).  Filterable fields are:  - id  - tag  - userId  - isActive (1 for yes, 0 for no)  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  - createdDate  - modifiedDate  Filters should be separated by a \";\". Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax : \"fieldName criterion expression\".  Where:  - fieldName: the name of a filterable field of this object.  - expression: the values to be included or excluded (see the table below for more information)  - criterion: a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     >    |      greater than      |            alphanumeric string           |         100        |  |    >=    | greater or equal than  |            alphanumeric string           |         100        |  |     <    |        less than       |            alphanumeric string           |         100        |  |    <=    |   less or equal than   |            alphanumeric string           |         100        |  |    !=    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    ==    |         equals         |            alphanumeric string           |         100        | 
    Integer id = 56; // Integer | The unique identifier of the Beneficiary.
    Integer userId = 56; // Integer | Deprecated, use the `filter` parameter instead.
    String iban = "iban_example"; // String | Deprecated, use the `filter` parameter instead.
    String bic = "bic_example"; // String | Deprecated, use the `filter` parameter instead.
    String nickName = "nickName_example"; // String | Deprecated, use the `filter` parameter instead.
    String name = "name_example"; // String | Deprecated, use the `filter` parameter instead.
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
    String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value : _createdDate_.  
    String sortOrder = "DESC"; // String | The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort. 
    try {
      BeneficiaryObject result = apiInstance.getBeneficiaries(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, id, userId, iban, bic, nickName, name, pageNumber, pageCount, sortBy, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeneficiariesApi#getBeneficiaries");
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
| **fields** | [**List&lt;String&gt;**](String.md)| List of the object properties you want to pick up. | [optional] |
| **filter** | **String**| You can filter the API response by using filter(s).  Filterable fields are:  - id  - tag  - userId  - isActive (1 for yes, 0 for no)  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  - createdDate  - modifiedDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;.  Where:  - fieldName: the name of a filterable field of this object.  - expression: the values to be included or excluded (see the table below for more information)  - criterion: a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  | [optional] |
| **id** | **Integer**| The unique identifier of the Beneficiary. | [optional] |
| **userId** | **Integer**| Deprecated, use the &#x60;filter&#x60; parameter instead. | [optional] |
| **iban** | **String**| Deprecated, use the &#x60;filter&#x60; parameter instead. | [optional] |
| **bic** | **String**| Deprecated, use the &#x60;filter&#x60; parameter instead. | [optional] |
| **nickName** | **String**| Deprecated, use the &#x60;filter&#x60; parameter instead. | [optional] |
| **name** | **String**| Deprecated, use the &#x60;filter&#x60; parameter instead. | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with. Default value : _createdDate_.   | [optional] |
| **sortOrder** | **String**| The order you want to sort the list. * **DESC** for a descending sort * **ASC** for a ascending sort.  | [optional] [default to DESC] [enum: DESC, ASC] |

### Return type

[**BeneficiaryObject**](BeneficiaryObject.md)

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

<a id="getBeneficiary"></a>
# **getBeneficiary**
> BeneficiaryObject getBeneficiary(beneficiaryId, fields)

Get Beneficiary

Retrieve a Beneficiary bank account based on its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeneficiariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    BeneficiariesApi apiInstance = new BeneficiariesApi(defaultClient);
    Long beneficiaryId = 56L; // Long | The unique identifier of the Beneficiary.
    List<String> fields = Arrays.asList(); // List<String> | List of the object properties you want to pick up.
    try {
      BeneficiaryObject result = apiInstance.getBeneficiary(beneficiaryId, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeneficiariesApi#getBeneficiary");
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
| **beneficiaryId** | **Long**| The unique identifier of the Beneficiary. | |
| **fields** | [**List&lt;String&gt;**](String.md)| List of the object properties you want to pick up. | [optional] |

### Return type

[**BeneficiaryObject**](BeneficiaryObject.md)

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

<a id="postBeneficiary"></a>
# **postBeneficiary**
> BeneficiaryObject postBeneficiary(postBeneficiaryRequest, accessSignature, accessTag, accessUserId, accessUserIp)

Create Beneficiary

Create a new benefeciary bank account.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeneficiariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    BeneficiariesApi apiInstance = new BeneficiariesApi(defaultClient);
    PostBeneficiaryRequest postBeneficiaryRequest = new PostBeneficiaryRequest(); // PostBeneficiaryRequest | 
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    try {
      BeneficiaryObject result = apiInstance.postBeneficiary(postBeneficiaryRequest, accessSignature, accessTag, accessUserId, accessUserIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeneficiariesApi#postBeneficiary");
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
| **postBeneficiaryRequest** | [**PostBeneficiaryRequest**](PostBeneficiaryRequest.md)|  | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |

### Return type

[**BeneficiaryObject**](BeneficiaryObject.md)

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
| **0** | Unexpected error |  -  |

<a id="putBeneficiary"></a>
# **putBeneficiary**
> BeneficiaryObject putBeneficiary(beneficiaryId, accessSignature, accessTag, accessUserId, accessUserIp, putBeneficiaryRequest)

Update Beneficiary

Modify a benefeciary bank account information.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BeneficiariesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    BeneficiariesApi apiInstance = new BeneficiariesApi(defaultClient);
    Integer beneficiaryId = 56; // Integer | The unique identifier of the Beneficiary.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PutBeneficiaryRequest putBeneficiaryRequest = new PutBeneficiaryRequest(); // PutBeneficiaryRequest | 
    try {
      BeneficiaryObject result = apiInstance.putBeneficiary(beneficiaryId, accessSignature, accessTag, accessUserId, accessUserIp, putBeneficiaryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BeneficiariesApi#putBeneficiary");
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
| **beneficiaryId** | **Integer**| The unique identifier of the Beneficiary. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **putBeneficiaryRequest** | [**PutBeneficiaryRequest**](PutBeneficiaryRequest.md)|  | [optional] |

### Return type

[**BeneficiaryObject**](BeneficiaryObject.md)

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

