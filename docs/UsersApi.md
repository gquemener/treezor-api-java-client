# UsersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /v1/users/{userId} | Disable User |
| [**getUser**](UsersApi.md#getUser) | **GET** /v1/users/{userId} | Get User |
| [**getUsers**](UsersApi.md#getUsers) | **GET** /v1/users | Search Users |
| [**postUsers**](UsersApi.md#postUsers) | **POST** /v1/users | Create User |
| [**putKycreview**](UsersApi.md#putKycreview) | **PUT** /v1/users/{userId}/Kycreview | Request KYC Review |
| [**putUser**](UsersApi.md#putUser) | **PUT** /v1/users/{userId} | Update User |


<a id="deleteUser"></a>
# **deleteUser**
> UserObject deleteUser(userId, origin, accessSignature, accessTag, accessUserId, accessUserIp)

Disable User

Update the user Status to &#x60;CANCELED&#x60;. See the [Deletion](/guide/users/modifications.html#deletion) article for more information. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userId = 56; // Integer | The unique identifier of the User.
    String origin = "origin_example"; // String | The origin of the request for cancelling the User, which can be one of the following:  * `OPERATOR` – When you are at the origin of the deactivation. * `USER` – When the end user is at the origin of the deactivation. 
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    try {
      UserObject result = apiInstance.deleteUser(userId, origin, accessSignature, accessTag, accessUserId, accessUserIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteUser");
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
| **userId** | **Integer**| The unique identifier of the User. | |
| **origin** | **String**| The origin of the request for cancelling the User, which can be one of the following:  * &#x60;OPERATOR&#x60; – When you are at the origin of the deactivation. * &#x60;USER&#x60; – When the end user is at the origin of the deactivation.  | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |

### Return type

[**UserObject**](UserObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="getUser"></a>
# **getUser**
> UserObject getUser(userId, accessSignature, accessTag, accessUserId, accessUserIp)

Get User

Retrieve user&#39;s information for given user&#39;s &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userId = 56; // Integer | The unique identifier of the User.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    try {
      UserObject result = apiInstance.getUser(userId, accessSignature, accessTag, accessUserId, accessUserIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUser");
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
| **userId** | **Integer**| The unique identifier of the User. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |

### Return type

[**UserObject**](UserObject.md)

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

<a id="getUsers"></a>
# **getUsers**
> UserObject getUsers(accessSignature, accessTag, accessUserId, accessUserIp, userId, userTypeId, userStatus, userTag, specifiedUSPerson, controllingPersonType, employeeType, email, name, legalName, parentUserId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Users

Retrieve Users matching your search criteria.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    Integer userId = 56; // Integer | The unique identifier of the User.
    Integer userTypeId = 1; // Integer | The type of the user.
    String userStatus = "userStatus_example"; // String | Status of the user.
    String userTag = "userTag_example"; // String | Custom data that you can add to this item.
    Integer specifiedUSPerson = 56; // Integer | You may read more about who is considered a US Person in the [dedicated article](https://docs.treezor.com/guide/user-verification/tax-residence.html#the-specific-case-of-us-taxpayers). 
    Integer controllingPersonType = 56; // Integer | Type of relationship
    Integer employeeType = 56; // Integer | Type of user's role
    String email = "email_example"; // String | User's email address (must be valid).
    String name = "name_example"; // String | Name of the user.
    String legalName = "legalName_example"; // String | Business name
    String parentUserId = "parentUserId_example"; // String | Unique identifier of the parent of the user.
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
    String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
    String sortOrder = "DESC"; // String | The order you want to sort the list. 
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS. 
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.  
    try {
      UserObject result = apiInstance.getUsers(accessSignature, accessTag, accessUserId, accessUserIp, userId, userTypeId, userStatus, userTag, specifiedUSPerson, controllingPersonType, employeeType, email, name, legalName, parentUserId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUsers");
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
| **userId** | **Integer**| The unique identifier of the User. | [optional] |
| **userTypeId** | **Integer**| The type of the user. | [optional] [enum: 1, 2, 3, 4] |
| **userStatus** | **String**| Status of the user. | [optional] |
| **userTag** | **String**| Custom data that you can add to this item. | [optional] |
| **specifiedUSPerson** | **Integer**| You may read more about who is considered a US Person in the [dedicated article](https://docs.treezor.com/guide/user-verification/tax-residence.html#the-specific-case-of-us-taxpayers).  | [optional] |
| **controllingPersonType** | **Integer**| Type of relationship | [optional] |
| **employeeType** | **Integer**| Type of user&#39;s role | [optional] |
| **email** | **String**| User&#39;s email address (must be valid). | [optional] |
| **name** | **String**| Name of the user. | [optional] |
| **legalName** | **String**| Business name | [optional] |
| **parentUserId** | **String**| Unique identifier of the parent of the user. | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list.  | [optional] [default to DESC] [enum: DESC, ASC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format YYYY-MM-DD HH:MM:SS.   | [optional] |

### Return type

[**UserObject**](UserObject.md)

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
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

<a id="postUsers"></a>
# **postUsers**
> UserObject postUsers(accessSignature, accessTag, accessUserId, accessUserIp, postUsersRequest)

Create User

You may read [the dedicated documentation for this feature](/guide/users/introduction.html#creation) 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PostUsersRequest postUsersRequest = new PostUsersRequest(); // PostUsersRequest | 
    try {
      UserObject result = apiInstance.postUsers(accessSignature, accessTag, accessUserId, accessUserIp, postUsersRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#postUsers");
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
| **postUsersRequest** | [**PostUsersRequest**](PostUsersRequest.md)|  | [optional] |

### Return type

[**UserObject**](UserObject.md)

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

<a id="putKycreview"></a>
# **putKycreview**
> UserObject putKycreview(userId, accessSignature, accessTag, accessUserId, accessUserIp)

Request KYC Review

Request a KYC review for a given user and its children to Treezor. Learn more in the [KYC Request](/guide/user-verification/kyc-request.html) article. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userId = 56; // Integer | The unique identifier of the User.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    try {
      UserObject result = apiInstance.putKycreview(userId, accessSignature, accessTag, accessUserId, accessUserIp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#putKycreview");
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
| **userId** | **Integer**| The unique identifier of the User. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |

### Return type

[**UserObject**](UserObject.md)

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
| **403** | Forbidden |  -  |
| **0** | Unexpected error |  -  |

<a id="putUser"></a>
# **putUser**
> UserObject putUser(userId, accessSignature, accessTag, accessUserId, accessUserIp, putUserRequest)

Update User

Update user&#39;s information.  This endpoint may require per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UsersApi apiInstance = new UsersApi(defaultClient);
    Integer userId = 56; // Integer | The unique identifier of the User.
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    PutUserRequest putUserRequest = new PutUserRequest(); // PutUserRequest | 
    try {
      UserObject result = apiInstance.putUser(userId, accessSignature, accessTag, accessUserId, accessUserIp, putUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#putUser");
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
| **userId** | **Integer**| The unique identifier of the User. | |
| **accessSignature** | **String**| Legacy attribute, do not use.  | [optional] |
| **accessTag** | **String**| A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  | [optional] |
| **accessUserId** | **Integer**| Legacy attribute, do not use.  | [optional] |
| **accessUserIp** | **String**| Legacy attribute, do not use.  | [optional] |
| **putUserRequest** | [**PutUserRequest**](PutUserRequest.md)|  | [optional] |

### Return type

[**UserObject**](UserObject.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: applicationcjson, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **405** | Method Not Allowed |  -  |
| **0** | Unexpected error |  -  |

