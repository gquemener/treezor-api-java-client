# UserDocumentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDocuments**](UserDocumentsApi.md#createDocuments) | **POST** /v1/documents | Create Document |
| [**deleteDocument**](UserDocumentsApi.md#deleteDocument) | **DELETE** /v1/documents/{documentId} | Delete Document |
| [**getDocument**](UserDocumentsApi.md#getDocument) | **GET** /v1/documents/{documentId} | Get Document |
| [**getDocumentDownloadUrl**](UserDocumentsApi.md#getDocumentDownloadUrl) | **GET** /v1/documents/{documentId}/download | Get Document Download URL |
| [**getDocuments**](UserDocumentsApi.md#getDocuments) | **GET** /v1/documents | Search Documents |
| [**putDocument**](UserDocumentsApi.md#putDocument) | **PUT** /v1/documents/{documentId} | Update Document |


<a id="createDocuments"></a>
# **createDocuments**
> DocumentObject createDocuments(accessSignature, accessTag, accessUserId, accessUserIp, createDocumentsRequest)

Create Document

Create a Document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    CreateDocumentsRequest createDocumentsRequest = new CreateDocumentsRequest(); // CreateDocumentsRequest | 
    try {
      DocumentObject result = apiInstance.createDocuments(accessSignature, accessTag, accessUserId, accessUserIp, createDocumentsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentsApi#createDocuments");
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
| **createDocumentsRequest** | [**CreateDocumentsRequest**](CreateDocumentsRequest.md)|  | [optional] |

### Return type

[**DocumentObject**](DocumentObject.md)

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

<a id="deleteDocument"></a>
# **deleteDocument**
> DocumentObject deleteDocument(documentId)

Delete Document

Remove a document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
    Long documentId = 56L; // Long | The unique identifier of the Document.
    try {
      DocumentObject result = apiInstance.deleteDocument(documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentsApi#deleteDocument");
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
| **documentId** | **Long**| The unique identifier of the Document. | |

### Return type

[**DocumentObject**](DocumentObject.md)

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

<a id="getDocument"></a>
# **getDocument**
> DocumentObject getDocument(documentId)

Get Document

Retrieve a Document using its &#x60;id&#x60;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
    Long documentId = 56L; // Long | The unique identifier of the Document.
    try {
      DocumentObject result = apiInstance.getDocument(documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentsApi#getDocument");
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
| **documentId** | **Long**| The unique identifier of the Document. | |

### Return type

[**DocumentObject**](DocumentObject.md)

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

<a id="getDocumentDownloadUrl"></a>
# **getDocumentDownloadUrl**
> GetDocumentDownloadUrl200Response getDocumentDownloadUrl(documentId)

Get Document Download URL

Retrieve a Document download URL. You may read [the dedicated documentation for this feature](/guide/user-verification/documents.html#download). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
    Long documentId = 56L; // Long | The unique identifier of the Document.
    try {
      GetDocumentDownloadUrl200Response result = apiInstance.getDocumentDownloadUrl(documentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentsApi#getDocumentDownloadUrl");
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
| **documentId** | **Long**| The unique identifier of the Document. | |

### Return type

[**GetDocumentDownloadUrl200Response**](GetDocumentDownloadUrl200Response.md)

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

<a id="getDocuments"></a>
# **getDocuments**
> DocumentObject getDocuments(accessSignature, accessTag, accessUserId, accessUserIp, documentId, documentTag, documentStatus, documentTypeId, documentType, userId, userName, userEmail, fileName, fileSize, fileType, isAgent, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo)

Search Documents

Retrieve Documents based on search criteria.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
    String accessSignature = "accessSignature_example"; // String | Legacy attribute, do not use. 
    String accessTag = "accessTag_example"; // String | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
    Integer accessUserId = 56; // Integer | Legacy attribute, do not use. 
    String accessUserIp = "accessUserIp_example"; // String | Legacy attribute, do not use. 
    Integer documentId = 56; // Integer | The unique identifier of the Document.
    String documentTag = "documentTag_example"; // String | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article. <br>Max length: 250 characters  <br>Format: hc characters and `/` `!` `-` `_` `.` `*` `'` `(` `)` 
    String documentStatus = "PENDING"; // String | The status of the document. 
    Integer documentTypeId = 56; // Integer | Document type id.
    String documentType = "documentType_example"; // String | The type of the Document.
    Integer userId = 56; // Integer | The unique identifier of the user the Document belongs to.
    String userName = "userName_example"; // String | The name of the user the Document belongs to.
    String userEmail = "userEmail_example"; // String | The email of the user the Document belongs to.
    String fileName = "fileName_example"; // String | The name of the Document.
    Integer fileSize = 56; // Integer | The size of the Document.
    Integer fileType = 56; // Integer | The file type of the Document.
    String isAgent = "isAgent_example"; // String | is agent field.
    Integer pageNumber = 56; // Integer | The page number, only available on /v1/ endpoints  
    Integer pageCount = 56; // Integer | The number of items per page, only available on /v1/ endpoints   
    String sortBy = "createdDate"; // String | The transaction element you want to sort the list with. 
    String sortOrder = "DESC"; // String | The order you want to sort the list. 
    OffsetDateTime createdDateFrom = OffsetDateTime.now(); // OffsetDateTime | The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime createdDateTo = OffsetDateTime.now(); // OffsetDateTime | The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateFrom = OffsetDateTime.now(); // OffsetDateTime | The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    OffsetDateTime updatedDateTo = OffsetDateTime.now(); // OffsetDateTime | The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.  
    try {
      DocumentObject result = apiInstance.getDocuments(accessSignature, accessTag, accessUserId, accessUserIp, documentId, documentTag, documentStatus, documentTypeId, documentType, userId, userName, userEmail, fileName, fileSize, fileType, isAgent, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentsApi#getDocuments");
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
| **documentId** | **Integer**| The unique identifier of the Document. | [optional] |
| **documentTag** | **String**| Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article. &lt;br&gt;Max length: 250 characters  &lt;br&gt;Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  | [optional] |
| **documentStatus** | **String**| The status of the document.  | [optional] [enum: PENDING, CANCELED, VALIDATED] |
| **documentTypeId** | **Integer**| Document type id. | [optional] |
| **documentType** | **String**| The type of the Document. | [optional] |
| **userId** | **Integer**| The unique identifier of the user the Document belongs to. | [optional] |
| **userName** | **String**| The name of the user the Document belongs to. | [optional] |
| **userEmail** | **String**| The email of the user the Document belongs to. | [optional] |
| **fileName** | **String**| The name of the Document. | [optional] |
| **fileSize** | **Integer**| The size of the Document. | [optional] |
| **fileType** | **Integer**| The file type of the Document. | [optional] |
| **isAgent** | **String**| is agent field. | [optional] |
| **pageNumber** | **Integer**| The page number, only available on /v1/ endpoints   | [optional] |
| **pageCount** | **Integer**| The number of items per page, only available on /v1/ endpoints    | [optional] |
| **sortBy** | **String**| The transaction element you want to sort the list with.  | [optional] [default to createdDate] |
| **sortOrder** | **String**| The order you want to sort the list.  | [optional] [default to DESC] [enum: DESC, ASC] |
| **createdDateFrom** | **OffsetDateTime**| The creation date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **createdDateTo** | **OffsetDateTime**| The creation date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateFrom** | **OffsetDateTime**| The modification date from which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |
| **updatedDateTo** | **OffsetDateTime**| The modification date up to which you want to filter the request result. Format: YYYY-MM-DD HH:MM:SS.   | [optional] |

### Return type

[**DocumentObject**](DocumentObject.md)

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

<a id="putDocument"></a>
# **putDocument**
> DocumentObject putDocument(documentId, putDocumentRequest)

Update Document

Change the &#x60;name&#x60; of a Document.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserDocumentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    UserDocumentsApi apiInstance = new UserDocumentsApi(defaultClient);
    Long documentId = 56L; // Long | The unique identifier of the Document.
    PutDocumentRequest putDocumentRequest = new PutDocumentRequest(); // PutDocumentRequest | 
    try {
      DocumentObject result = apiInstance.putDocument(documentId, putDocumentRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDocumentsApi#putDocument");
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
| **documentId** | **Long**| The unique identifier of the Document. | |
| **putDocumentRequest** | [**PutDocumentRequest**](PutDocumentRequest.md)|  | [optional] |

### Return type

[**DocumentObject**](DocumentObject.md)

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

