

# PostPayout200ResponsePayoutsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutId** | **Integer** |  |  [optional] |
|**payoutTag** | **String** |  |  [optional] |
|**payoutStatus** | [**PayoutStatusEnum**](#PayoutStatusEnum) |  |  [optional] |
|**payoutTypeId** | **Integer** |  |  [optional] |
|**payoutType** | [**PayoutTypeEnum**](#PayoutTypeEnum) |  |  [optional] |
|**walletId** | **Integer** |  |  [optional] |
|**payoutDate** | **String** | Date YYYY-MM-DD |  [optional] |
|**walletEventName** | **String** |  |  [optional] |
|**walletAlias** | **String** |  |  [optional] |
|**userFirstname** | **String** |  |  [optional] |
|**userLastname** | **String** |  |  [optional] |
|**userId** | **Integer** |  |  [optional] |
|**beneficiaryId** | **Integer** |  |  [optional] |
|**uniqueMandateReference** | **String** |  |  [optional] |
|**bankaccountIBAN** | **String** |  |  [optional] |
|**virtualIbanId** | **Integer** |  |  [optional] |
|**virtualIbanReference** | **String** |  |  [optional] |
|**label** | **String** |  |  [optional] |
|**endToEndId** | **String** |  |  [optional] |
|**reasonCode** | **String** |  |  [optional] |
|**reasonDescription** | **String** |  |  [optional] |
|**codeStatus** | **String** |  |  [optional] |
|**informationStatus** | **String** |  |  [optional] |
|**supportingFileLink** | **String** |  |  [optional] |
|**amount** | **String** |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**partnerFee** | **String** |  |  [optional] |
|**createdDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional] |
|**modifiedDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional] |
|**totalRows** | **Integer** |  |  [optional] |
|**metadata** | **Object** |  |  [optional] |



## Enum: PayoutStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: PayoutTypeEnum

| Name | Value |
|---- | -----|
| CREDIT_TRANSFER | &quot;Credit Transfer&quot; |
| DIRECT_DEBIT | &quot;Direct Debit&quot; |
| INSTANT_SEPA_CREDIT_TRANSFER | &quot;Instant Sepa Credit Transfer&quot; |



