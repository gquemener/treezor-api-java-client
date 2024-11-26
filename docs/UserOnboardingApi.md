# UserOnboardingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**config**](UserOnboardingApi.md#config) | **POST** /core-connect/onboard/user/config | Configure Onboarding File |
| [**getAllUsers**](UserOnboardingApi.md#getAllUsers) | **GET** /core-connect/onboarding/users | Get Onboarded Users |
| [**getConfig**](UserOnboardingApi.md#getConfig) | **GET** /core-connect/onboard/user/config | Get Onboarding Configuration File |
| [**getConfig_0**](UserOnboardingApi.md#getConfig_0) | **GET** /core-connect/onboard/config | Get Onboarding Callback URL |
| [**getPasswordConfig**](UserOnboardingApi.md#getPasswordConfig) | **GET** /core-connect/password/config | Get Password Configuration |
| [**onboardUser**](UserOnboardingApi.md#onboardUser) | **POST** /core-connect/onboard/users | Onboard User |
| [**onboardUserValidate**](UserOnboardingApi.md#onboardUserValidate) | **GET** /core-connect/onboard/users/validate/{confirmationCode} | Onboard User |
| [**postForgotPassword**](UserOnboardingApi.md#postForgotPassword) | **POST** /core-connect/password/forgot | Send Password Reset Email |
| [**putChangePassword**](UserOnboardingApi.md#putChangePassword) | **PUT** /core-connect/password/change | Change User Password |
| [**putPasswordConfig**](UserOnboardingApi.md#putPasswordConfig) | **PUT** /core-connect/password/config | Update Password Configuration |
| [**putUserPassword**](UserOnboardingApi.md#putUserPassword) | **PUT** /core-connect/password/users/{userId} | Update User Password |
| [**updateConfig**](UserOnboardingApi.md#updateConfig) | **PUT** /core-connect/onboard/config | Update Onboarding Callback URL |


<a id="config"></a>
# **config**
> GetConfig200Response config(getConfig200Response)

Configure Onboarding File

Configure onboarding file

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    GetConfig200Response getConfig200Response = new GetConfig200Response(); // GetConfig200Response | 
    try {
      GetConfig200Response result = apiInstance.config(getConfig200Response);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#config");
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
| **getConfig200Response** | [**GetConfig200Response**](GetConfig200Response.md)|  | [optional] |

### Return type

[**GetConfig200Response**](GetConfig200Response.md)

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

<a id="getAllUsers"></a>
# **getAllUsers**
> GetAllUsers200Response getAllUsers(onboardingComplete, cursor)

Get Onboarded Users

Retrieve all the onboarded users.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    String onboardingComplete = "onboardingComplete_example"; // String | `1` onboarding complete, `0` onboarding not complete 
    String cursor = "cursor_example"; // String | 
    try {
      GetAllUsers200Response result = apiInstance.getAllUsers(onboardingComplete, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#getAllUsers");
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
| **onboardingComplete** | **String**| &#x60;1&#x60; onboarding complete, &#x60;0&#x60; onboarding not complete  | |
| **cursor** | **String**|  | [optional] |

### Return type

[**GetAllUsers200Response**](GetAllUsers200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a id="getConfig"></a>
# **getConfig**
> GetConfig200Response getConfig()

Get Onboarding Configuration File

Retrieve the onboarding configuration file

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    try {
      GetConfig200Response result = apiInstance.getConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#getConfig");
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

[**GetConfig200Response**](GetConfig200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | OK |  -  |

<a id="getConfig_0"></a>
# **getConfig_0**
> List&lt;GetConfig200ResponseInner&gt; getConfig_0()

Get Onboarding Callback URL

Get onboarding success url and onboarding error.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    try {
      List<GetConfig200ResponseInner> result = apiInstance.getConfig_0();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#getConfig_0");
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

[**List&lt;GetConfig200ResponseInner&gt;**](GetConfig200ResponseInner.md)

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

<a id="getPasswordConfig"></a>
# **getPasswordConfig**
> GetPasswordConfig200Response getPasswordConfig()

Get Password Configuration

Retrieve the password configuration. You may read [the dedicated documentation for this feature](/guide/users/onboarding.html#passwords) 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    try {
      GetPasswordConfig200Response result = apiInstance.getPasswordConfig();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#getPasswordConfig");
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

[**GetPasswordConfig200Response**](GetPasswordConfig200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a id="onboardUser"></a>
# **onboardUser**
> onboardUser(onboardUserRequest)

Onboard User

Create a User using the onboarding feature.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    OnboardUserRequest onboardUserRequest = new OnboardUserRequest(); // OnboardUserRequest | 
    try {
      apiInstance.onboardUser(onboardUserRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#onboardUser");
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
| **onboardUserRequest** | [**OnboardUserRequest**](OnboardUserRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

<a id="onboardUserValidate"></a>
# **onboardUserValidate**
> onboardUserValidate(confirmationCode)

Onboard User

onboard user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    String confirmationCode = "confirmationCode_example"; // String | Confirmation code
    try {
      apiInstance.onboardUserValidate(confirmationCode);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#onboardUserValidate");
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
| **confirmationCode** | **String**| Confirmation code | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **301** | OK |  -  |

<a id="postForgotPassword"></a>
# **postForgotPassword**
> postForgotPassword(postForgotPasswordRequest)

Send Password Reset Email

Send an email with a password reset link

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    PostForgotPasswordRequest postForgotPasswordRequest = new PostForgotPasswordRequest(); // PostForgotPasswordRequest | 
    try {
      apiInstance.postForgotPassword(postForgotPasswordRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#postForgotPassword");
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
| **postForgotPasswordRequest** | [**PostForgotPasswordRequest**](PostForgotPasswordRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **0** | Unexpected error |  -  |

<a id="putChangePassword"></a>
# **putChangePassword**
> putChangePassword(putChangePasswordRequest)

Change User Password

Change the password user with the data collected from the user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    PutChangePasswordRequest putChangePasswordRequest = new PutChangePasswordRequest(); // PutChangePasswordRequest | 
    try {
      apiInstance.putChangePassword(putChangePasswordRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#putChangePassword");
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
| **putChangePasswordRequest** | [**PutChangePasswordRequest**](PutChangePasswordRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **0** | Unexpected error |  -  |

<a id="putPasswordConfig"></a>
# **putPasswordConfig**
> GetPasswordConfig200Response putPasswordConfig(getPasswordConfig200Response)

Update Password Configuration

Update the password configuration. You may read [the dedicated documentation for this feature](/guide/users/passwords.html#configuration) 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    GetPasswordConfig200Response getPasswordConfig200Response = new GetPasswordConfig200Response(); // GetPasswordConfig200Response | 
    try {
      GetPasswordConfig200Response result = apiInstance.putPasswordConfig(getPasswordConfig200Response);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#putPasswordConfig");
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
| **getPasswordConfig200Response** | [**GetPasswordConfig200Response**](GetPasswordConfig200Response.md)|  | [optional] |

### Return type

[**GetPasswordConfig200Response**](GetPasswordConfig200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a id="putUserPassword"></a>
# **putUserPassword**
> putUserPassword(userId, putUserPasswordRequest)

Update User Password

Change the password of a User.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    String userId = "userId_example"; // String | The unique identifier of the User.
    PutUserPasswordRequest putUserPasswordRequest = new PutUserPasswordRequest(); // PutUserPasswordRequest | 
    try {
      apiInstance.putUserPassword(userId, putUserPasswordRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#putUserPassword");
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
| **userId** | **String**| The unique identifier of the User. | |
| **putUserPasswordRequest** | [**PutUserPasswordRequest**](PutUserPasswordRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="updateConfig"></a>
# **updateConfig**
> List&lt;GetConfig200ResponseInner&gt; updateConfig(getConfig200ResponseInner)

Update Onboarding Callback URL

Update onboarding success url callback and/or onboarding error url callback 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserOnboardingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserOnboardingApi apiInstance = new UserOnboardingApi(defaultClient);
    GetConfig200ResponseInner getConfig200ResponseInner = new GetConfig200ResponseInner(); // GetConfig200ResponseInner | 
    try {
      List<GetConfig200ResponseInner> result = apiInstance.updateConfig(getConfig200ResponseInner);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserOnboardingApi#updateConfig");
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
| **getConfig200ResponseInner** | [**GetConfig200ResponseInner**](GetConfig200ResponseInner.md)|  | [optional] |

### Return type

[**List&lt;GetConfig200ResponseInner&gt;**](GetConfig200ResponseInner.md)

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

