

# ScheduledPayment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier of the Scheduled Payment order. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the Scheduled Payment. |  [optional] |
|**scheduledPaymentName** | **String** | The label describing the goal of the Scheduled Payment. |  [optional] |
|**walletId** | **Integer** | The unique identifier of the Wallet to be debited. |  [optional] |
|**beneficiaryType** | [**BeneficiaryTypeEnum**](#BeneficiaryTypeEnum) | The type of beneficiary for the operation.  |  [optional] |
|**beneficiary** | **Integer** | The unique identifier of the beneficiary of the Scheduled Payment, which can be either &#x60;beneficiaryId&#x60; for Payouts or &#x60;beneficiaryWalletId&#x60; for Wallet-to-Wallet transfers.  |  [optional] |
|**amount** | **BigDecimal** | The amount of the Scheduled Payment. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of Scheduled Payment, which can be:  * &#x60;oneshot&#x60; – The payment will occur only once. * &#x60;periodic&#x60; – The payment will occur periodically over a defined timeframe.  |  [optional] |
|**execAt** | **String** | The date on which the a &#x60;oneshot&#x60; Scheduled Payment is to be executed. This date must be set at least one day in the future. Format: YYYY-MM-DD.  |  [optional] |
|**startAt** | **String** | The date from which a &#x60;periodic&#x60; Scheduled Payment execution starts. This date must be set at least one day in the future. Format: YYYY-MM-DD.  |  [optional] |
|**endAt** | **String** | The date on which a &#x60;periodic&#x60; Scheduled Payment ends. This date must be set after the &#x60;startAt&#x60; date. Format: YYYY-MM-DD.  |  [optional] |
|**creationDate** | **String** | The date and time at which the Scheduled Payment was created. |  [optional] |
|**period** | **String** | The frequency at which a &#x60;periodic&#x60; Scheduled Payment is to occur.  |  [optional] |
|**beneficiaryLabel** | **String** | The label that will be displayed for the Scheduled Payments, regardless of the type. Max. 140 characters. |  [optional] |
|**currency** | **String** | The currency of the Scheduled Payments (ISO-4217). Can only be &#x60;EUR&#x60;.  |  [optional] |
|**userId** | **String** | The unique identifier of the User owning the Wallet to debit. |  [optional] |
|**amr** | **List&lt;String&gt;** | The type of SCA for per-operation SCA (e.g., &#x60;CLOUD_PIN&#x60;, &#x60;HYBRID_PIN&#x60;, &#x60;DEVICE_BIOMETRIC&#x60;).  |  [optional] |
|**failedPayment** | [**List&lt;ScheduledPaymentFailedPaymentInner&gt;**](ScheduledPaymentFailedPaymentInner.md) |  |  [optional] |
|**endToEndId** | **String** | The end-to-end identifier, for Payouts only.  Max. 24 characters. &lt;br&gt; Allowed characters: alphanumeric and &#x60;/&#x60; &#x60;-&#x60; &#x60;?&#x60; &#x60;:&#x60; &#x60;(&#x60; &#x60;)&#x60; &#x60;.&#x60; &#x60;,&#x60; &#x60;+&#x60; &#x60; &#x60; (space). &lt;br&gt; Musn&#39;t start nor end with &#x60;/&#x60;, and musn&#39;t contain &#x60;//&#x60;.  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VALIDATED | &quot;VALIDATED&quot; |
| CANCELED | &quot;CANCELED&quot; |



## Enum: BeneficiaryTypeEnum

| Name | Value |
|---- | -----|
| PAYOUT | &quot;payout&quot; |
| WALLET_TRANSFER | &quot;walletTransfer&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ONESHOT | &quot;oneshot&quot; |
| PERIODIC | &quot;periodic&quot; |



