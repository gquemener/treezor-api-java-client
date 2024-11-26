# PayoutRefundsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPayoutRefund**](PayoutRefundsApi.md#getPayoutRefund) | **GET** /v1/payoutRefunds/{payoutRefundId} | Get Payout Refund |
| [**postPayoutRefund**](PayoutRefundsApi.md#postPayoutRefund) | **POST** /v1/payoutRefunds | Create Payout Refund |


<a id="getPayoutRefund"></a>
# **getPayoutRefund**
> PostPayoutRefund200Response getPayoutRefund(payoutRefundId)

Get Payout Refund

Retrieve a given Payout Refund with its &#x60;id&#x60;. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayoutRefundsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PayoutRefundsApi apiInstance = new PayoutRefundsApi(defaultClient);
    String payoutRefundId = "payoutRefundId_example"; // String | The unique identifier of the payout refund.
    try {
      PostPayoutRefund200Response result = apiInstance.getPayoutRefund(payoutRefundId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutRefundsApi#getPayoutRefund");
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
| **payoutRefundId** | **String**| The unique identifier of the payout refund. | |

### Return type

[**PostPayoutRefund200Response**](PostPayoutRefund200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

<a id="postPayoutRefund"></a>
# **postPayoutRefund**
> PostPayoutRefund200Response postPayoutRefund(postPayoutRefundRequest)

Create Payout Refund

Create a Payout Refund.  As of today, this feature is only available for [emitting SCTE Inst Recalls](/guide/transfers/sepa-recalls.html#emitting-scte-inst-recalls). Otherwise, you need to [open a ticket](https://treezor.zendesk.com/hc/en-us/articles/4402731372306-How-to-create-a-Zendesk-ticket) to request payout recalls. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PayoutRefundsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PayoutRefundsApi apiInstance = new PayoutRefundsApi(defaultClient);
    PostPayoutRefundRequest postPayoutRefundRequest = new PostPayoutRefundRequest(); // PostPayoutRefundRequest | 
    try {
      PostPayoutRefund200Response result = apiInstance.postPayoutRefund(postPayoutRefundRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutRefundsApi#postPayoutRefund");
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
| **postPayoutRefundRequest** | [**PostPayoutRefundRequest**](PostPayoutRefundRequest.md)|  | [optional] |

### Return type

[**PostPayoutRefund200Response**](PostPayoutRefund200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Unexpected error |  -  |

