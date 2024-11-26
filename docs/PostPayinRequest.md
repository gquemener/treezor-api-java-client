

# PostPayinRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payinTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article. &lt;br&gt;Max length: 250 characters  &lt;br&gt;Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**walletId** | **Integer** | The unique identifier of the credited Wallet. |  |
|**userId** | **String** | The unique identifier of the User making the payin.  Note that for the &#x60;paymentMethodId&#x60; of &#x60;21&#x60; and &#x60;26&#x60;, you don&#39;t need to provide this value. It will be set automatically by Treezor.  |  |
|**paymentMethodId** | [**PaymentMethodIdEnum**](#PaymentMethodIdEnum) | | Id | Payment by | | ---| --- | | &#x60;20&#x60; | SEPA Credit Transfer (SCTR) – You can only create such payins in Sandbox, otherwise created automatically upon receiving a transfer. | | &#x60;21&#x60; | SEPA Direct Debit Core | | &#x60;23&#x60; | Full Hosted HTML Payment Form. If you use this &#x60;paymentMethodId&#x60;, the &#x60;paymentAcceptedUrl&#x60;, &#x60;paymentRefusedUrl&#x60;, &#x60;paymentWaitingUrl&#x60;, &#x60;paymentCanceledUrl&#x60; and &#x60;paymentExceptionUrl&#x60; fields are mandatory. CSS of the payment page can be customized. | | &#x60;24&#x60; | IFrame Payment Form. Please note that if you use this &#x60;paymentMethodId&#x60;, the &#x60;paymentAcceptedUrl&#x60;, &#x60;paymentRefusedUrl&#x60;, &#x60;paymentWaitingUrl&#x60;, &#x60;paymentCanceledUrl&#x60; and &#x60;paymentExceptionUrl&#x60; fields are mandatory. CSS of the payment page can be customized. | | &#x60;25&#x60; | Card topup - You cannot create a payin directly with this method id. The payin will be automatically created by Treezor. | | &#x60;26&#x60; | Check | | &#x60;27&#x60; | Instant Credit Transfers (SCTR Inst) – You cannot create a payin directly with this method id. The payin will be automatically created by Treezor. |  |  |
|**paymentAcceptedUrl** | **String** | URL to which the cardholder is redirected if payment is successful. When using &#x60;paymentMethodId&#x60; &#x60;23&#x60; and &#x60;24&#x60; an HTTPS URL is mandatory.  |  [optional] |
|**paymentWaitingUrl** | **String** | URL to which the cardholder is redirected to wait payment processing. When using &#x60;paymentMethodId&#x60; &#x60;23&#x60; and &#x60;24&#x60; an HTTPS URL is mandatory.  |  [optional] |
|**paymentCanceledUrl** | **String** | URL to which the cardholder is redirected if payment is canceled. When using &#x60;paymentMethodId&#x60; &#x60;23&#x60; and &#x60;24&#x60; an HTTPS URL is mandatory.  |  [optional] |
|**paymentRefusedUrl** | **String** | URL to which the cardholder is redirected if payment is refused. When using &#x60;paymentMethodId&#x60; &#x60;23&#x60; and &#x60;24&#x60; an HTTPS URL is mandatory.  |  [optional] |
|**paymentExceptionUrl** | **String** | URL to which the cardholder is redirected if the payment process raised an exception. When using &#x60;paymentMethodId&#x60; &#x60;23&#x60; and &#x60;24&#x60; an HTTPS URL is mandatory.  |  [optional] |
|**amount** | **Float** | The amount of the payin. |  |
|**distributorFee** | **Float** | Distributor fee. |  [optional] |
|**currency** | **String** | The currency of the payin. Must be the same as the Wallet currency. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies).  |  |
|**messageToUser** | **String** | Message to send to Wallet of the user. In the case of a SEPA Direct Debit Core payment method, this parameter will be the reconciliation information transmitted to the Debtor (i.e., Invoice number). In this case it can&#39;t exceed 140 characters. |  [optional] |
|**language** | [**LanguageEnum**](#LanguageEnum) | Language for the third party interface. |  [optional] |
|**createdIp** | **String** | The IP address of the User. |  [optional] |
|**payinDate** | **String** | The date at which the SDD should be presented.   In the case of SDD Core, this parameter defaults to the third working day following the payin creation if left empty.   Format: YYYY-MM-DD, a [SEPA Open Banking Day](/guide/overview/glossary.html#sepa-open-banking-days) is expected (at least 2 days after the creation).  |  [optional] |
|**mandateId** | **Integer** | The unique identifier of the Mandate. This parameter is mandatory when performing a payin with method SDD Core. |  [optional] |



## Enum: PaymentMethodIdEnum

| Name | Value |
|---- | -----|
| NUMBER_20 | 20 |
| NUMBER_21 | 21 |
| NUMBER_23 | 23 |
| NUMBER_24 | 24 |
| NUMBER_25 | 25 |
| NUMBER_26 | 26 |
| NUMBER_27 | 27 |



## Enum: LanguageEnum

| Name | Value |
|---- | -----|
| FRA | &quot;FRA&quot; |
| GBR | &quot;GBR&quot; |
| ESP | &quot;ESP&quot; |
| ITA | &quot;ITA&quot; |
| PRT | &quot;PRT&quot; |



