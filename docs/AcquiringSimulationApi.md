# AcquiringSimulationApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acquiringv2TopupCardsSimulationNotificationAutorization**](AcquiringSimulationApi.md#acquiringv2TopupCardsSimulationNotificationAutorization) | **POST** /simulation/topups/cards/notification/authorizations | Simulate an HiPay authorization notification |
| [**acquiringv2TopupCardsSimulationNotificationChargebacks**](AcquiringSimulationApi.md#acquiringv2TopupCardsSimulationNotificationChargebacks) | **POST** /simulation/topups/cards/notification/chargebacks | Simulate an HiPay chargeback notification |
| [**acquiringv2TopupCardsSimulationNotificationPayins**](AcquiringSimulationApi.md#acquiringv2TopupCardsSimulationNotificationPayins) | **POST** /simulation/topups/cards/notification/payins | Simulate an HiPay payin notification |
| [**acquiringv2TopupCardsSimulationNotificationRefunds**](AcquiringSimulationApi.md#acquiringv2TopupCardsSimulationNotificationRefunds) | **POST** /simulation/topups/cards/notification/refunds | Simulate an HiPay refund notification |


<a id="acquiringv2TopupCardsSimulationNotificationAutorization"></a>
# **acquiringv2TopupCardsSimulationNotificationAutorization**
> NotificationSimulationAuthorizationResponse acquiringv2TopupCardsSimulationNotificationAutorization(notificationSimulationAuthorizations)

Simulate an HiPay authorization notification

Mocks an HiPay authorization notification provided the minimal set of parameters to generate a refund notification. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringSimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringSimulationApi apiInstance = new AcquiringSimulationApi(defaultClient);
    NotificationSimulationAuthorizations notificationSimulationAuthorizations = new NotificationSimulationAuthorizations(); // NotificationSimulationAuthorizations | 
    try {
      NotificationSimulationAuthorizationResponse result = apiInstance.acquiringv2TopupCardsSimulationNotificationAutorization(notificationSimulationAuthorizations);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringSimulationApi#acquiringv2TopupCardsSimulationNotificationAutorization");
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
| **notificationSimulationAuthorizations** | [**NotificationSimulationAuthorizations**](NotificationSimulationAuthorizations.md)|  | [optional] |

### Return type

[**NotificationSimulationAuthorizationResponse**](NotificationSimulationAuthorizationResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authorization notification successfully created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="acquiringv2TopupCardsSimulationNotificationChargebacks"></a>
# **acquiringv2TopupCardsSimulationNotificationChargebacks**
> NotificationSimulationChargebackResponse acquiringv2TopupCardsSimulationNotificationChargebacks(transactionReference)

Simulate an HiPay chargeback notification

Mocks an HiPay chargeback notification providing the minimal set of parameters to generate a chargeback notification. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringSimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringSimulationApi apiInstance = new AcquiringSimulationApi(defaultClient);
    String transactionReference = "transactionReference_example"; // String | The reference of the transaction
    try {
      NotificationSimulationChargebackResponse result = apiInstance.acquiringv2TopupCardsSimulationNotificationChargebacks(transactionReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringSimulationApi#acquiringv2TopupCardsSimulationNotificationChargebacks");
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
| **transactionReference** | **String**| The reference of the transaction | |

### Return type

[**NotificationSimulationChargebackResponse**](NotificationSimulationChargebackResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Chargeback notification successfully created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="acquiringv2TopupCardsSimulationNotificationPayins"></a>
# **acquiringv2TopupCardsSimulationNotificationPayins**
> NotificationSimulationPayinResponse acquiringv2TopupCardsSimulationNotificationPayins(walletId, amount, currency, userId, status, transactionReference, cardPaymentMethod, profile)

Simulate an HiPay payin notification

Mocks an HiPay payin notification providing the minimal set of parameters to generate a payin notification. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringSimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringSimulationApi apiInstance = new AcquiringSimulationApi(defaultClient);
    String walletId = "walletId_example"; // String | Identifier of the wallet to be credited
    BigDecimal amount = new BigDecimal(78); // BigDecimal | Payin amount
    String currency = "currency_example"; // String | Base currency for this payin  This three-character currency code must comply with ISO-4217
    String userId = "userId_example"; // String | Identifier of the user on behalf of which the simulated payin should be executed 
    Integer status = 56; // Integer | The status code of the simulated notification
    String transactionReference = "transactionReference_example"; // String | The reference of the transaction
    NotificationSimulationPayinsCardPaymentMethod cardPaymentMethod = new NotificationSimulationPayinsCardPaymentMethod(); // NotificationSimulationPayinsCardPaymentMethod | 
    String profile = "profile_example"; // String | HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation. 
    try {
      NotificationSimulationPayinResponse result = apiInstance.acquiringv2TopupCardsSimulationNotificationPayins(walletId, amount, currency, userId, status, transactionReference, cardPaymentMethod, profile);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringSimulationApi#acquiringv2TopupCardsSimulationNotificationPayins");
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
| **walletId** | **String**| Identifier of the wallet to be credited | |
| **amount** | **BigDecimal**| Payin amount | |
| **currency** | **String**| Base currency for this payin  This three-character currency code must comply with ISO-4217 | |
| **userId** | **String**| Identifier of the user on behalf of which the simulated payin should be executed  | [optional] |
| **status** | **Integer**| The status code of the simulated notification | [optional] |
| **transactionReference** | **String**| The reference of the transaction | [optional] |
| **cardPaymentMethod** | [**NotificationSimulationPayinsCardPaymentMethod**](NotificationSimulationPayinsCardPaymentMethod.md)|  | [optional] |
| **profile** | **String**| HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation.  | [optional] |

### Return type

[**NotificationSimulationPayinResponse**](NotificationSimulationPayinResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payin notification successfully created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

<a id="acquiringv2TopupCardsSimulationNotificationRefunds"></a>
# **acquiringv2TopupCardsSimulationNotificationRefunds**
> NotificationSimulationRefundResponse acquiringv2TopupCardsSimulationNotificationRefunds(payinId, userId, walletId, amount, currency, status, transactionReference)

Simulate an HiPay refund notification

Mocks an HiPay refund notification providing the minimal set of parameters to generate a refund notification. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AcquiringSimulationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure OAuth2 access token for authorization: jwt
    OAuth jwt = (OAuth) defaultClient.getAuthentication("jwt");
    jwt.setAccessToken("YOUR ACCESS TOKEN");

    AcquiringSimulationApi apiInstance = new AcquiringSimulationApi(defaultClient);
    String payinId = "payinId_example"; // String | The universally unique identifier (UUID) of the payin
    String userId = "userId_example"; // String | Identifier of the user on behalf of which the simulated refund should be executed 
    String walletId = "walletId_example"; // String | Identifier of the wallet to be credited
    BigDecimal amount = new BigDecimal(78); // BigDecimal | Refund amount
    String currency = "currency_example"; // String | Base currency for this refund  This three-character currency code must comply with ISO-4217
    Integer status = 56; // Integer | The status code of the simulated notification
    String transactionReference = "transactionReference_example"; // String | The reference of the transaction
    try {
      NotificationSimulationRefundResponse result = apiInstance.acquiringv2TopupCardsSimulationNotificationRefunds(payinId, userId, walletId, amount, currency, status, transactionReference);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AcquiringSimulationApi#acquiringv2TopupCardsSimulationNotificationRefunds");
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
| **payinId** | **String**| The universally unique identifier (UUID) of the payin | |
| **userId** | **String**| Identifier of the user on behalf of which the simulated refund should be executed  | [optional] |
| **walletId** | **String**| Identifier of the wallet to be credited | [optional] |
| **amount** | **BigDecimal**| Refund amount | [optional] |
| **currency** | **String**| Base currency for this refund  This three-character currency code must comply with ISO-4217 | [optional] |
| **status** | **Integer**| The status code of the simulated notification | [optional] |
| **transactionReference** | **String**| The reference of the transaction | [optional] |

### Return type

[**NotificationSimulationRefundResponse**](NotificationSimulationRefundResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded, application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Refund notification successfully created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **0** | Unexpected error |  -  |

