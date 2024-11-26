# AuthenticationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**putAuth**](AuthenticationApi.md#putAuth) | **POST** /oauth/token | The token endpoint of the authentication server |


<a id="putAuth"></a>
# **putAuth**
> PutAuth200Response putAuth(grantType, clientId, clientSecret, scope, username, password, refreshToken)

The token endpoint of the authentication server

This endpoint is used to exchange authorization codes or refresh tokens for access tokens. The response will include the access token and optionally a refresh token, along with their expiration details.  You may read more about [OAuth2](https://oauth.net/2/). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    String grantType = "refresh_token"; // String | MUST BE \\\"refresh_token\\\" value for refresh token flow
    String clientId = "clientId_example"; // String | 
    String clientSecret = "clientSecret_example"; // String | 
    String scope = "scope_example"; // String | space separated
    String username = "username_example"; // String | 
    String password = "password_example"; // String | User password
    String refreshToken = "refreshToken_example"; // String | 
    try {
      PutAuth200Response result = apiInstance.putAuth(grantType, clientId, clientSecret, scope, username, password, refreshToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#putAuth");
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
| **grantType** | **String**| MUST BE \\\&quot;refresh_token\\\&quot; value for refresh token flow | [optional] [default to refresh_token] |
| **clientId** | **String**|  | [optional] |
| **clientSecret** | **String**|  | [optional] |
| **scope** | **String**| space separated | [optional] |
| **username** | **String**|  | [optional] |
| **password** | **String**| User password | [optional] |
| **refreshToken** | **String**|  | [optional] |

### Return type

[**PutAuth200Response**](PutAuth200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

