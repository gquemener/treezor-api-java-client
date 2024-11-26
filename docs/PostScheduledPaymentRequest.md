

# PostScheduledPaymentRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scheduledPaymentName** | **String** | The label describing the goal of the Scheduled Payment. |  [optional] |
|**walletId** | **Integer** | The unique identifier of the Wallet to debit. |  |
|**beneficiaryType** | [**BeneficiaryTypeEnum**](#BeneficiaryTypeEnum) | The type of beneficiary for the operation, which can be: * &#x60;payout&#x60; – The Scheduled Payment targets an external account. * &#x60;walletTransfer&#x60; – The Scheduled Payment targets another Wallet in your Treezor environment.  |  |
|**beneficiary** | **Integer** | The unique identifier of the beneficiary of the Scheduled Payment, which can be either &#x60;beneficiaryId&#x60; for Payouts or &#x60;beneficiaryWalletId&#x60; for Wallet-to-Wallet transfers.  |  |
|**amount** | **BigDecimal** | The amount of the Scheduled Payment. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of Scheduled Payment, which can be:  * &#x60;oneshot&#x60; – The payment will occur only once. * &#x60;periodic&#x60; – The payment will occur periodically over a defined timeframe.  |  |
|**execAt** | **String** | The date on which the a &#x60;oneshot&#x60; Scheduled Payment is to be executed. This date must be set at least one day in the future. Format: YYYY-MM-DD.  |  [optional] |
|**startAt** | **String** | The date from which a &#x60;periodic&#x60; Scheduled Payment execution starts. This date must be set at least one day in the future. Format: YYYY-MM-DD.  |  [optional] |
|**endAt** | **String** | The date on which a &#x60;periodic&#x60; Scheduled Payment ends. This date must be set after the &#x60;startAt&#x60; date. Format: YYYY-MM-DD.  |  [optional] |
|**period** | [**PeriodEnum**](#PeriodEnum) | The frequency at which a &#x60;periodic&#x60; Scheduled Payment is to occur.  |  [optional] |
|**beneficiaryLabel** | **String** | The label that will be displayed for the Scheduled Payments, regardless of the type. Max. 140 characters. |  [optional] |
|**currency** | **String** | The currency of the Scheduled Payments (ISO-4217). Can only be &#x60;EUR&#x60;.  |  |
|**endToEndId** | **String** | The end-to-end identifier, for Payouts only.  Max. 24 characters. |  [optional] |



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



## Enum: PeriodEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;weekly&quot; |
| MONTHLY | &quot;monthly&quot; |
| QUARTERLY | &quot;quarterly&quot; |
| BI_ANNUAL | &quot;bi-annual&quot; |
| ANNUAL | &quot;annual&quot; |



