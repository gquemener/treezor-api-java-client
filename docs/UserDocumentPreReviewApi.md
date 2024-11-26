# UserDocumentPreReviewApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteKYCDocumentcument**](UserDocumentPreReviewApi.md#deleteKYCDocumentcument) | **DELETE** /core-connect/kyc/documents/{documentId} | Delete Pre-review Document |
| [**getKYCDocuments**](UserDocumentPreReviewApi.md#getKYCDocuments) | **GET** /core-connect/users/{userId}/kyc/document | Search Pre-review Documents |
| [**getKYCDocumentsToReview**](UserDocumentPreReviewApi.md#getKYCDocumentsToReview) | **GET** /core-connect/kyc/documents/need-review | Search Documents to pre-review |
| [**getPreSignedKycForm**](UserDocumentPreReviewApi.md#getPreSignedKycForm) | **POST** /core-connect/users/{userId}/kyc/document | Create Upload Document Form |
| [**getPresignedUrlDocument**](UserDocumentPreReviewApi.md#getPresignedUrlDocument) | **GET** /core-connect/kyc/documents/{documentId}/preview | Get Download URL |
| [**updateDocument**](UserDocumentPreReviewApi.md#updateDocument) | **PUT** /core-connect/kyc/documents/{documentId}/status | Pre-review Document |


<a id="deleteKYCDocumentcument"></a>
# **deleteKYCDocumentcument**
> List&lt;GetKYCDocuments200ResponseInner&gt; deleteKYCDocumentcument(documentId)

Delete Pre-review Document

Delete a pre-review document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentPreReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
    String documentId = "documentId_example"; // String | The unique identifier of the Document (UUID).
    try {
      List<GetKYCDocuments200ResponseInner> result = apiInstance.deleteKYCDocumentcument(documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentPreReviewApi#deleteKYCDocumentcument");
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
| **documentId** | **String**| The unique identifier of the Document (UUID). | |

### Return type

[**List&lt;GetKYCDocuments200ResponseInner&gt;**](GetKYCDocuments200ResponseInner.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="getKYCDocuments"></a>
# **getKYCDocuments**
> List&lt;GetKYCDocuments200ResponseInner&gt; getKYCDocuments(userId)

Search Pre-review Documents

Retrieve all pre-review documents for given user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentPreReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
    Integer userId = 56; // Integer | The unique identifier of the User.
    try {
      List<GetKYCDocuments200ResponseInner> result = apiInstance.getKYCDocuments(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentPreReviewApi#getKYCDocuments");
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

### Return type

[**List&lt;GetKYCDocuments200ResponseInner&gt;**](GetKYCDocuments200ResponseInner.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="getKYCDocumentsToReview"></a>
# **getKYCDocumentsToReview**
> List&lt;GetKYCDocuments200ResponseInner&gt; getKYCDocumentsToReview()

Search Documents to pre-review

Retrieve all pre-review documents to review. This endpoint is for [Onboarded Users](/guide/swagger/introduction.html#/User%20Onboarding) only. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentPreReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
    try {
      List<GetKYCDocuments200ResponseInner> result = apiInstance.getKYCDocumentsToReview();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentPreReviewApi#getKYCDocumentsToReview");
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

[**List&lt;GetKYCDocuments200ResponseInner&gt;**](GetKYCDocuments200ResponseInner.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="getPreSignedKycForm"></a>
# **getPreSignedKycForm**
> List&lt;GetPreSignedKycForm200ResponseInner&gt; getPreSignedKycForm(userId, getPreSignedKycFormRequest)

Create Upload Document Form

Generate a pre-signed form to upload documents for pre-review.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentPreReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
    String userId = "userId_example"; // String | The unique identifier of the User.
    GetPreSignedKycFormRequest getPreSignedKycFormRequest = new GetPreSignedKycFormRequest(); // GetPreSignedKycFormRequest | 
    try {
      List<GetPreSignedKycForm200ResponseInner> result = apiInstance.getPreSignedKycForm(userId, getPreSignedKycFormRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentPreReviewApi#getPreSignedKycForm");
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
| **getPreSignedKycFormRequest** | [**GetPreSignedKycFormRequest**](GetPreSignedKycFormRequest.md)|  | [optional] |

### Return type

[**List&lt;GetPreSignedKycForm200ResponseInner&gt;**](GetPreSignedKycForm200ResponseInner.md)

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

<a id="getPresignedUrlDocument"></a>
# **getPresignedUrlDocument**
> GetPresignedUrlDocument200Response getPresignedUrlDocument(documentId)

Get Download URL

Retrieve the pre-signed URL to download the pre-review document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentPreReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
    String documentId = "documentId_example"; // String | The unique identifier of the Document (UUID).
    try {
      GetPresignedUrlDocument200Response result = apiInstance.getPresignedUrlDocument(documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentPreReviewApi#getPresignedUrlDocument");
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
| **documentId** | **String**| The unique identifier of the Document (UUID). | |

### Return type

[**GetPresignedUrlDocument200Response**](GetPresignedUrlDocument200Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The URL and content type of the file. |  -  |
| **403** | forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="updateDocument"></a>
# **updateDocument**
> GetKYCDocuments200ResponseInner updateDocument(documentId, updateDocumentRequest)

Pre-review Document

Update the pre-review status and comment of the document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentPreReviewApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentPreReviewApi apiInstance = new UserDocumentPreReviewApi(defaultClient);
    Integer documentId = 56; // Integer | The unique identifier of the Document.
    UpdateDocumentRequest updateDocumentRequest = new UpdateDocumentRequest(); // UpdateDocumentRequest | 
    try {
      GetKYCDocuments200ResponseInner result = apiInstance.updateDocument(documentId, updateDocumentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentPreReviewApi#updateDocument");
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
| **documentId** | **Integer**| The unique identifier of the Document. | |
| **updateDocumentRequest** | [**UpdateDocumentRequest**](UpdateDocumentRequest.md)|  | [optional] |

### Return type

[**GetKYCDocuments200ResponseInner**](GetKYCDocuments200ResponseInner.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

