# MassPayoutsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMassPayoutReportRef**](MassPayoutsApi.md#getMassPayoutReportRef) | **GET** /core-connect/mass-payouts/report/{reference} | Get Mass Payout Report |
| [**postMassPayoutImport**](MassPayoutsApi.md#postMassPayoutImport) | **POST** /core-connect/mass-payouts/import | Import SEPA.xml File |


<a id="getMassPayoutReportRef"></a>
# **getMassPayoutReportRef**
> GetMassPayoutReportRef200Response getMassPayoutReportRef(reference)

Get Mass Payout Report

Check the progress of the process of creating the report file and allows you to retrieve it. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MassPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    MassPayoutsApi apiInstance = new MassPayoutsApi(defaultClient);
    String reference = "reference_example"; // String | Unique reference of the `MassPayoutImport` object.
    try {
      GetMassPayoutReportRef200Response result = apiInstance.getMassPayoutReportRef(reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MassPayoutsApi#getMassPayoutReportRef");
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
| **reference** | **String**| Unique reference of the &#x60;MassPayoutImport&#x60; object. | |

### Return type

[**GetMassPayoutReportRef200Response**](GetMassPayoutReportRef200Response.md)

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

<a id="postMassPayoutImport"></a>
# **postMassPayoutImport**
> PostMassPayoutImport201Response postMassPayoutImport(_file, reference)

Import SEPA.xml File

Import a SEPA.xml file for mass payout

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MassPayoutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    MassPayoutsApi apiInstance = new MassPayoutsApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    String reference = "reference_example"; // String | 
    try {
      PostMassPayoutImport201Response result = apiInstance.postMassPayoutImport(_file, reference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MassPayoutsApi#postMassPayoutImport");
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
| **_file** | **File**|  | [optional] |
| **reference** | **String**|  | [optional] |

### Return type

[**PostMassPayoutImport201Response**](PostMassPayoutImport201Response.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | CREATED |  -  |
| **400** | Bad Request |  -  |
| **0** | Unexpected error |  -  |

