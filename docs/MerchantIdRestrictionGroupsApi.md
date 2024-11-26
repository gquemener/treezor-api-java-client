# MerchantIdRestrictionGroupsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteMerchantIdRestrictionGroups**](MerchantIdRestrictionGroupsApi.md#deleteMerchantIdRestrictionGroups) | **DELETE** /v1/merchantIdRestrictionGroup/{id} | Cancel MID Restriction Group |
| [**getMerchantIdRestrictionGroup**](MerchantIdRestrictionGroupsApi.md#getMerchantIdRestrictionGroup) | **GET** /v1/merchantIdRestrictionGroups | Search MID Restriction Groups |
| [**postMerchantIdRestrictionGroup**](MerchantIdRestrictionGroupsApi.md#postMerchantIdRestrictionGroup) | **POST** /v1/merchantIdRestrictionGroups | Create MID Restriction Group |
| [**putMerchandidrestrictiongroupsDeltaupdate**](MerchantIdRestrictionGroupsApi.md#putMerchandidrestrictiongroupsDeltaupdate) | **PUT** /v1/merchantIdRestrictionGroups/{id}/DeltaUpdate | Update MID Restriction Group |
| [**putMerchantIdRestrictionGroups**](MerchantIdRestrictionGroupsApi.md#putMerchantIdRestrictionGroups) | **PUT** /v1/merchantIdRestrictionGroup/{id} | (DEPRECATED) Update MID Restriction Group |
| [**putMidrestrictiongroups**](MerchantIdRestrictionGroupsApi.md#putMidrestrictiongroups) | **PUT** /v1/merchantIdRestrictionGroups/{id}/PresenceCheck | Check the presence of merchants IDs list for a restriction group |


<a id="deleteMerchantIdRestrictionGroups"></a>
# **deleteMerchantIdRestrictionGroups**
> MerchantIdGroupObject deleteMerchantIdRestrictionGroups(id, fields)

Cancel MID Restriction Group

Cancel a merchant id restriction group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MerchantIdRestrictionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
    Long id = 56L; // Long | The unique identifier of the Merchant ID restriction group.
    List<String> fields = Arrays.asList(); // List<String> | List of the object properties you want to pick up.
    try {
      MerchantIdGroupObject result = apiInstance.deleteMerchantIdRestrictionGroups(id, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#deleteMerchantIdRestrictionGroups");
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
| **id** | **Long**| The unique identifier of the Merchant ID restriction group. | |
| **fields** | [**List&lt;String&gt;**](String.md)| List of the object properties you want to pick up. | [optional] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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

<a id="getMerchantIdRestrictionGroup"></a>
# **getMerchantIdRestrictionGroup**
> MerchantIdGroupObject getMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder)

Search MID Restriction Groups

Retrieve Merchant ID Restriction Groups that match search criteria.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MerchantIdRestrictionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    List<String> fields = Arrays.asList(); // List<String> | List of the object properties you want to pick up.
    String filter = "filter_example"; // String | You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \";\". Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \"fieldName criterion expression\", where: - fieldName: the name of a filterable field of this object. - expression: the values to be included or excluded (see the table below for more information) - criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     >    |      greater than      |            alphanumeric string           |         100        |   |    >=    | greater or equal than  |            alphanumeric string           |         100        |   |     <    |        less than       |            alphanumeric string           |         100        |   |    <=    |   less or equal than   |            alphanumeric string           |         100        |   |    !=    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    ==    |         equals         |            alphanumeric string           |         100        | 
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
    String sortBy = "sortBy_example"; // String | The transaction element you want to sort the list with. Default value: _createdDate_.  
    String sortOrder = "DESC"; // String | The order you want to sort the list. 
    try {
      MerchantIdGroupObject result = apiInstance.getMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, fields, filter, pageNumber, pageCount, sortBy, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#getMerchantIdRestrictionGroup");
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
| **filter** | **String**| You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where: - fieldName: the name of a filterable field of this object. - expression: the values to be included or excluded (see the table below for more information) - criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        |  | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with. Default value: _createdDate_.   | [optional] |
| **sortOrder** | **String**| The order you want to sort the list.  | [optional] [default to DESC] [enum: DESC, ASC] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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

<a id="postMerchantIdRestrictionGroup"></a>
# **postMerchantIdRestrictionGroup**
> MerchantIdGroupObject postMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, postMerchantIdRestrictionGroupRequest)

Create MID Restriction Group

Create a new Merchant ID restriction group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MerchantIdRestrictionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PostMerchantIdRestrictionGroupRequest postMerchantIdRestrictionGroupRequest = new PostMerchantIdRestrictionGroupRequest(); // PostMerchantIdRestrictionGroupRequest | 
    try {
      MerchantIdGroupObject result = apiInstance.postMerchantIdRestrictionGroup(accessSignature, accessTag, accessUserId, accessUserIp, postMerchantIdRestrictionGroupRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#postMerchantIdRestrictionGroup");
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
| **postMerchantIdRestrictionGroupRequest** | [**PostMerchantIdRestrictionGroupRequest**](PostMerchantIdRestrictionGroupRequest.md)|  | [optional] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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

<a id="putMerchandidrestrictiongroupsDeltaupdate"></a>
# **putMerchandidrestrictiongroupsDeltaupdate**
> MerchantIdGroupObject putMerchandidrestrictiongroupsDeltaupdate(id, accessSignature, accessTag, accessUserId, accessUserIp, putMerchandidrestrictiongroupsDeltaupdateRequest)

Update MID Restriction Group

Update the list of Merchant Ids for a MID Restriction Group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MerchantIdRestrictionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
    Integer id = 56; // Integer | The unique identifier of the Merchant ID restriction group.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PutMerchandidrestrictiongroupsDeltaupdateRequest putMerchandidrestrictiongroupsDeltaupdateRequest = new PutMerchandidrestrictiongroupsDeltaupdateRequest(); // PutMerchandidrestrictiongroupsDeltaupdateRequest | 
    try {
      MerchantIdGroupObject result = apiInstance.putMerchandidrestrictiongroupsDeltaupdate(id, accessSignature, accessTag, accessUserId, accessUserIp, putMerchandidrestrictiongroupsDeltaupdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#putMerchandidrestrictiongroupsDeltaupdate");
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
| **id** | **Integer**| The unique identifier of the Merchant ID restriction group. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **putMerchandidrestrictiongroupsDeltaupdateRequest** | [**PutMerchandidrestrictiongroupsDeltaupdateRequest**](PutMerchandidrestrictiongroupsDeltaupdateRequest.md)|  | [optional] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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

<a id="putMerchantIdRestrictionGroups"></a>
# **putMerchantIdRestrictionGroups**
> MerchantIdGroupObject putMerchantIdRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, putMerchantIdRestrictionGroupsRequest)

(DEPRECATED) Update MID Restriction Group

Deprecated

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MerchantIdRestrictionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
    Integer id = 56; // Integer | The unique identifier of the Merchant Id restriction group.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PutMerchantIdRestrictionGroupsRequest putMerchantIdRestrictionGroupsRequest = new PutMerchantIdRestrictionGroupsRequest(); // PutMerchantIdRestrictionGroupsRequest | 
    try {
      MerchantIdGroupObject result = apiInstance.putMerchantIdRestrictionGroups(id, accessSignature, accessTag, accessUserId, accessUserIp, putMerchantIdRestrictionGroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#putMerchantIdRestrictionGroups");
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
| **id** | **Integer**| The unique identifier of the Merchant Id restriction group. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **putMerchantIdRestrictionGroupsRequest** | [**PutMerchantIdRestrictionGroupsRequest**](PutMerchantIdRestrictionGroupsRequest.md)|  | [optional] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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

<a id="putMidrestrictiongroups"></a>
# **putMidrestrictiongroups**
> MerchantIdGroupObject putMidrestrictiongroups(id, accessSignature, accessTag, accessUserId, accessUserIp, putMidrestrictiongroupsRequest)

Check the presence of merchants IDs list for a restriction group

Check if Merchant IDs list for a restriction group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MerchantIdRestrictionGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    MerchantIdRestrictionGroupsApi apiInstance = new MerchantIdRestrictionGroupsApi(defaultClient);
    Integer id = 56; // Integer | The unique identifier of the Merchant ID restriction group.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PutMidrestrictiongroupsRequest putMidrestrictiongroupsRequest = new PutMidrestrictiongroupsRequest(); // PutMidrestrictiongroupsRequest | 
    try {
      MerchantIdGroupObject result = apiInstance.putMidrestrictiongroups(id, accessSignature, accessTag, accessUserId, accessUserIp, putMidrestrictiongroupsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantIdRestrictionGroupsApi#putMidrestrictiongroups");
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
| **id** | **Integer**| The unique identifier of the Merchant ID restriction group. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **putMidrestrictiongroupsRequest** | [**PutMidrestrictiongroupsRequest**](PutMidrestrictiongroupsRequest.md)|  | [optional] |

### Return type

[**MerchantIdGroupObject**](MerchantIdGroupObject.md)

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

