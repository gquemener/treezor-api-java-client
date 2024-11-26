# CountryRestrictionGroupsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCountryRestrictionGroups**](CountryRestrictionGroupsApi.md#deleteCountryRestrictionGroups) | **DELETE** /v1/countryRestrictionGroups/{id} | Cancel Country Restriction Group |
| [**getCountryRestrictionGroups**](CountryRestrictionGroupsApi.md#getCountryRestrictionGroups) | **GET** /v1/countryRestrictionGroups | Search Country Restriction Groups |
| [**getCountryRestrictionGroupsId**](CountryRestrictionGroupsApi.md#getCountryRestrictionGroupsId) | **GET** /v1/countryRestrictionGroups/{id} | Get Country Restriction Group |
| [**postCountryRestrictionGroup**](CountryRestrictionGroupsApi.md#postCountryRestrictionGroup) | **POST** /v1/countryRestrictionGroups | Create Country Restriction Group |
| [**putCountryRestrictionGroups**](CountryRestrictionGroupsApi.md#putCountryRestrictionGroups) | **PUT** /v1/countryRestrictionGroups/{id} | Update Country Restriction Group |


<a id="deleteCountryRestrictionGroups"></a>
# **deleteCountryRestrictionGroups**
> GetCountryRestrictionGroupsId200Response deleteCountryRestrictionGroups(id, fields)

Cancel Country Restriction Group

Cancel a country restriction group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountryRestrictionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CountryRestrictionGroupsApi apiInstance = new CountryRestrictionGroupsApi(defaultClient);
    Long id = 56L; // Long | The unique identifier of the Country Group.
    List<String> fields = Arrays.asList(); // List<String> | List of the object properties you want to pick up.
    try {
      GetCountryRestrictionGroupsId200Response result = apiInstance.deleteCountryRestrictionGroups(id, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountryRestrictionGroupsApi#deleteCountryRestrictionGroups");
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
| **id** | **Long**| The unique identifier of the Country Group. | |
| **fields** | [**List&lt;String&gt;**](String.md)| List of the object properties you want to pick up. | [optional] |

### Return type

[**GetCountryRestrictionGroupsId200Response**](GetCountryRestrictionGroupsId200Response.md)

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

<a id="getCountryRestrictionGroups"></a>
# **getCountryRestrictionGroups**
> GetCountryRestrictionGroups200Response getCountryRestrictionGroups(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder)

Search Country Restriction Groups

Retrive country restriction groups that match search criteria.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountryRestrictionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CountryRestrictionGroupsApi apiInstance = new CountryRestrictionGroupsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    List<String> fields = Arrays.asList(); // List<String> | List of the object properties you want to pick up.
    String filter = "filter_example"; // String | You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \";\". Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \"fieldName criterion expression\", where:   - fieldName: the name of a filterable field of this object.   - expression: the values to be included or excluded (see the table below for more information)   - criterion: a filter criterion.  Here are the possible values for criterion:  | Criteria |         Description    |                   Type                   | Expression Example | |----------|------------------------|------------------------------------------|--------------------| |     >    |      greater than      |            alphanumeric string           |         100        | |    >=    | greater or equal than  |            alphanumeric string           |         100        | |     <    |        less than       |            alphanumeric string           |         100        | |    <=    |   less or equal than   |            alphanumeric string           |         100        | |    !=    |      not equal to      |            alphanumeric string           |         100        | |   like   |          like          |            alphanumeric string           |         100        | |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     | |    ==    |         equals         |            alphanumeric string           |         100        | 
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
    String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
    String sortOrder = "DESC"; // String | The order you want to sort the list. 
    try {
      GetCountryRestrictionGroups200Response result = apiInstance.getCountryRestrictionGroups(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountryRestrictionGroupsApi#getCountryRestrictionGroups");
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
| **filter** | **String**| You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where:   - fieldName: the name of a filterable field of this object.   - expression: the values to be included or excluded (see the table below for more information)   - criterion: a filter criterion.  Here are the possible values for criterion:  | Criteria |         Description    |                   Type                   | Expression Example | |----------|------------------------|------------------------------------------|--------------------| |     &gt;    |      greater than      |            alphanumeric string           |         100        | |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        | |     &lt;    |        less than       |            alphanumeric string           |         100        | |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        | |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        | |   like   |          like          |            alphanumeric string           |         100        | |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     | |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list.  | [optional] [default to DESC] [enum: DESC, ASC] |

### Return type

[**GetCountryRestrictionGroups200Response**](GetCountryRestrictionGroups200Response.md)

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

<a id="getCountryRestrictionGroupsId"></a>
# **getCountryRestrictionGroupsId**
> GetCountryRestrictionGroupsId200Response getCountryRestrictionGroupsId(id, fields)

Get Country Restriction Group

Retrive a Country Restriction Group based on its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountryRestrictionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CountryRestrictionGroupsApi apiInstance = new CountryRestrictionGroupsApi(defaultClient);
    Long id = 56L; // Long | The unique identifier of the Country Group.
    List<String> fields = Arrays.asList(); // List<String> | List of the object properties you want to pick up.
    try {
      GetCountryRestrictionGroupsId200Response result = apiInstance.getCountryRestrictionGroupsId(id, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountryRestrictionGroupsApi#getCountryRestrictionGroupsId");
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
| **id** | **Long**| The unique identifier of the Country Group. | |
| **fields** | [**List&lt;String&gt;**](String.md)| List of the object properties you want to pick up. | [optional] |

### Return type

[**GetCountryRestrictionGroupsId200Response**](GetCountryRestrictionGroupsId200Response.md)

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

<a id="postCountryRestrictionGroup"></a>
# **postCountryRestrictionGroup**
> PostCountryRestrictionGroup200Response postCountryRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, postCountryRestrictionGroupRequest)

Create Country Restriction Group

Create a new country restriction group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountryRestrictionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CountryRestrictionGroupsApi apiInstance = new CountryRestrictionGroupsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    List<String> fields = Arrays.asList(); // List<String> | List of the object properties you want to pick up.
    PostCountryRestrictionGroupRequest postCountryRestrictionGroupRequest = new PostCountryRestrictionGroupRequest(); // PostCountryRestrictionGroupRequest | 
    try {
      PostCountryRestrictionGroup200Response result = apiInstance.postCountryRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, postCountryRestrictionGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountryRestrictionGroupsApi#postCountryRestrictionGroup");
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
| **postCountryRestrictionGroupRequest** | [**PostCountryRestrictionGroupRequest**](PostCountryRestrictionGroupRequest.md)|  | [optional] |

### Return type

[**PostCountryRestrictionGroup200Response**](PostCountryRestrictionGroup200Response.md)

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

<a id="putCountryRestrictionGroups"></a>
# **putCountryRestrictionGroups**
> PutCountryRestrictionGroups200Response putCountryRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, putCountryRestrictionGroupsRequest)

Update Country Restriction Group

Edit a country restriction group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountryRestrictionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    CountryRestrictionGroupsApi apiInstance = new CountryRestrictionGroupsApi(defaultClient);
    Integer id = 56; // Integer | The unique identifier of the Country Group.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PutCountryRestrictionGroupsRequest putCountryRestrictionGroupsRequest = new PutCountryRestrictionGroupsRequest(); // PutCountryRestrictionGroupsRequest | 
    try {
      PutCountryRestrictionGroups200Response result = apiInstance.putCountryRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, putCountryRestrictionGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CountryRestrictionGroupsApi#putCountryRestrictionGroups");
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
| **id** | **Integer**| The unique identifier of the Country Group. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **putCountryRestrictionGroupsRequest** | [**PutCountryRestrictionGroupsRequest**](PutCountryRestrictionGroupsRequest.md)|  | [optional] |

### Return type

[**PutCountryRestrictionGroups200Response**](PutCountryRestrictionGroups200Response.md)

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

