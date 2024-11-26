# SupportUsersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSupportUser**](SupportUsersApi.md#createSupportUser) | **POST** /core-connect/support-user | Create Support User |
| [**deleteSupportUser**](SupportUsersApi.md#deleteSupportUser) | **DELETE** /core-connect/support-user/{supportUserId} | Delete Support User |
| [**findOneSupportUserById**](SupportUsersApi.md#findOneSupportUserById) | **GET** /core-connect/support-user/{supportUserId} | Get Support User |
| [**getAllSupportUser**](SupportUsersApi.md#getAllSupportUser) | **GET** /core-connect/support-user | Get all Support Users |
| [**unblockSupportUser**](SupportUsersApi.md#unblockSupportUser) | **PUT** /core-connect/support-user/{supportUserId}/unblock | Unblock Support User |
| [**updateSupportUser**](SupportUsersApi.md#updateSupportUser) | **PUT** /core-connect/support-user/{supportUserId} | Update Support User |


<a id="createSupportUser"></a>
# **createSupportUser**
> SupportUserObject createSupportUser(createSupportUserRequest)

Create Support User

Create a new Support User.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SupportUsersApi apiInstance = new SupportUsersApi(defaultClient);
    CreateSupportUserRequest createSupportUserRequest = new CreateSupportUserRequest(); // CreateSupportUserRequest | 
    try {
      SupportUserObject result = apiInstance.createSupportUser(createSupportUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportUsersApi#createSupportUser");
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
| **createSupportUserRequest** | [**CreateSupportUserRequest**](CreateSupportUserRequest.md)|  | [optional] |

### Return type

[**SupportUserObject**](SupportUserObject.md)

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

<a id="deleteSupportUser"></a>
# **deleteSupportUser**
> deleteSupportUser(supportUserId)

Delete Support User

Delete a Support User

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SupportUsersApi apiInstance = new SupportUsersApi(defaultClient);
    String supportUserId = "supportUserId_example"; // String | The unique identifier of the Support User.
    try {
      apiInstance.deleteSupportUser(supportUserId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportUsersApi#deleteSupportUser");
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
| **supportUserId** | **String**| The unique identifier of the Support User. | |

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
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

<a id="findOneSupportUserById"></a>
# **findOneSupportUserById**
> SupportUserObject findOneSupportUserById(supportUserId)

Get Support User

Retrieve a Support User based on its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SupportUsersApi apiInstance = new SupportUsersApi(defaultClient);
    String supportUserId = "supportUserId_example"; // String | The unique identifier of the Support User.
    try {
      SupportUserObject result = apiInstance.findOneSupportUserById(supportUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportUsersApi#findOneSupportUserById");
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
| **supportUserId** | **String**| The unique identifier of the Support User. | |

### Return type

[**SupportUserObject**](SupportUserObject.md)

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
| **0** | Unexpected error |  -  |

<a id="getAllSupportUser"></a>
# **getAllSupportUser**
> List&lt;SupportUserObject&gt; getAllSupportUser()

Get all Support Users

Retrieve all the Support Users.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SupportUsersApi apiInstance = new SupportUsersApi(defaultClient);
    try {
      List<SupportUserObject> result = apiInstance.getAllSupportUser();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportUsersApi#getAllSupportUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SupportUserObject&gt;**](SupportUserObject.md)

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
| **0** | Unexpected error |  -  |

<a id="unblockSupportUser"></a>
# **unblockSupportUser**
> unblockSupportUser(supportUserId)

Unblock Support User

Unblock a Support User. Support Users may be blocked if they failed to login 3 times in a row.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SupportUsersApi apiInstance = new SupportUsersApi(defaultClient);
    String supportUserId = "supportUserId_example"; // String | The unique identifier of the Support User.
    try {
      apiInstance.unblockSupportUser(supportUserId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportUsersApi#unblockSupportUser");
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
| **supportUserId** | **String**| The unique identifier of the Support User. | |

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
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

<a id="updateSupportUser"></a>
# **updateSupportUser**
> SupportUserObject updateSupportUser(supportUserId, updateSupportUserRequest)

Update Support User

Modify a Support User information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupportUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    SupportUsersApi apiInstance = new SupportUsersApi(defaultClient);
    String supportUserId = "supportUserId_example"; // String | The unique identifier of the Support User.
    UpdateSupportUserRequest updateSupportUserRequest = new UpdateSupportUserRequest(); // UpdateSupportUserRequest | 
    try {
      SupportUserObject result = apiInstance.updateSupportUser(supportUserId, updateSupportUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportUsersApi#updateSupportUser");
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
| **supportUserId** | **String**| The unique identifier of the Support User. | |
| **updateSupportUserRequest** | [**UpdateSupportUserRequest**](UpdateSupportUserRequest.md)|  | [optional] |

### Return type

[**SupportUserObject**](SupportUserObject.md)

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

