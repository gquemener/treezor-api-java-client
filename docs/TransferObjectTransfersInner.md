

# TransferObjectTransfersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transferId** | **Integer** | The unique identifier of the Transfer. |  [optional] |
|**transferStatus** | [**TransferStatusEnum**](#TransferStatusEnum) | The status of the Transfer. |  [optional] |
|**transferTag** | **String** |  |  [optional] |
|**walletId** | **Integer** | The unique identifier of the debited Wallet. |  [optional] |
|**walletTypeId** | **Integer** | The type of the debited Wallet:  * &#x60;9&#x60; – Electronic Money Wallet  * &#x60;10&#x60; – Payment Account Wallet * &#x60;13&#x60; – Mirror Wallet  |  [optional] |
|**beneficiaryWalletId** | **Integer** | The unique identifier of the credited Wallet. |  [optional] |
|**beneficiaryWalletTypeId** | [**BeneficiaryWalletTypeIdEnum**](#BeneficiaryWalletTypeIdEnum) | The type of Wallet. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation.  |  [optional] |
|**transferDate** | **String** | The date of the Transfer. Format: YYYY-MM-DD  |  [optional] |
|**walletEventName** | **String** | The name of the debited Wallet. |  [optional] |
|**walletAlias** | **String** |  |  [optional] |
|**beneficiaryWalletEventName** | **String** | The name of the credited Wallet. |  [optional] |
|**beneficiaryWalletAlias** | **String** |  |  [optional] |
|**amount** | **String** | The amount of the transfer. |  [optional] |
|**currency** | **String** | The currency of the transfer. |  [optional] |
|**label** | **String** |  |  [optional] |
|**transferTypeId** | **Integer** | The type of transfer: * &#x60;1&#x60; – Wallet to wallet  * &#x60;2&#x60; – Card transaction * &#x60;3&#x60; – Client fees * &#x60;4&#x60; – Credit note  |  [optional] |
|**createdDate** | **String** | The date and time at which the transfer is created. Format: YYYY-MM-DD HH:MM:SS  |  [optional] |
|**modifiedDate** | **String** | The date and time at which the transfer is updated. Format: YYYY-MM-DD HH:MM:SS  |  [optional] |
|**totalRows** | **Integer** |  |  [optional] |
|**foreignId** | **String** |  |  [optional] |
|**partnerFee** | **String** |  |  [optional] |
|**codeStatus** | **String** |  |  [optional] |
|**informationStatu** | **String** |  |  [optional] |



## Enum: TransferStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: BeneficiaryWalletTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |



