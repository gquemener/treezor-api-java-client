# ApiTemplatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTemplate**](ApiTemplatesApi.md#deleteTemplate) | **DELETE** /customization/templates/{templateName} | Delete Template |
| [**getTemplate**](ApiTemplatesApi.md#getTemplate) | **GET** /customization/templates/{templateName}/template | Get Template |
| [**getTemplateExample**](ApiTemplatesApi.md#getTemplateExample) | **GET** /customization/templates/{templateName}/example | Build Template Example |
| [**getTemplateVariables**](ApiTemplatesApi.md#getTemplateVariables) | **GET** /customization/templates/{templateName}/variables | Get Template Variables |
| [**putTemplateUpload**](ApiTemplatesApi.md#putTemplateUpload) | **PUT** /customization/templates/{templateName}/template | Upload Template |


<a id="deleteTemplate"></a>
# **deleteTemplate**
> deleteTemplate(templateName)

Delete Template

Delete a Template.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ApiTemplatesApi apiInstance = new ApiTemplatesApi(defaultClient);
    String templateName = "templateName_example"; // String | The name of the Template.
    try {
      apiInstance.deleteTemplate(templateName);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiTemplatesApi#deleteTemplate");
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
| **templateName** | **String**| The name of the Template. | |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplate"></a>
# **getTemplate**
> GetTemplate200Response getTemplate(templateName)

Get Template

Retrieve the currently configured template.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ApiTemplatesApi apiInstance = new ApiTemplatesApi(defaultClient);
    String templateName = "templateName_example"; // String | The name of the Template.
    try {
      GetTemplate200Response result = apiInstance.getTemplate(templateName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiTemplatesApi#getTemplate");
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
| **templateName** | **String**| The name of the Template. | |

### Return type

[**GetTemplate200Response**](GetTemplate200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplateExample"></a>
# **getTemplateExample**
> GetTemplate200Response getTemplateExample(templateName)

Build Template Example

Test your template by building one with dummy values.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ApiTemplatesApi apiInstance = new ApiTemplatesApi(defaultClient);
    String templateName = "templateName_example"; // String | The name of the Template.
    try {
      GetTemplate200Response result = apiInstance.getTemplateExample(templateName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiTemplatesApi#getTemplateExample");
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
| **templateName** | **String**| The name of the Template. | |

### Return type

[**GetTemplate200Response**](GetTemplate200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="getTemplateVariables"></a>
# **getTemplateVariables**
> Object getTemplateVariables(templateName)

Get Template Variables

Retrieve the list of variables for the given template

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ApiTemplatesApi apiInstance = new ApiTemplatesApi(defaultClient);
    String templateName = "templateName_example"; // String | The name of the Template.
    try {
      Object result = apiInstance.getTemplateVariables(templateName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiTemplatesApi#getTemplateVariables");
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
| **templateName** | **String**| The name of the Template. | |

### Return type

**Object**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a id="putTemplateUpload"></a>
# **putTemplateUpload**
> putTemplateUpload(templateName)

Upload Template

Upload a replacement for an existing Template.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ApiTemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    ApiTemplatesApi apiInstance = new ApiTemplatesApi(defaultClient);
    String templateName = "templateName_example"; // String | The name of the Template.
    try {
      apiInstance.putTemplateUpload(templateName);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiTemplatesApi#putTemplateUpload");
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
| **templateName** | **String**| The name of the Template. | |

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
| **201** | CREATED |  -  |
| **400** | Bad Request |  -  |

