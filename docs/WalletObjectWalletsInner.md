

# WalletObjectWalletsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **Integer** | The unique identifier of the Wallet. |  [optional] |
|**walletTypeId** | [**WalletTypeIdEnum**](#WalletTypeIdEnum) | The type of Wallet. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation.  |  [optional] |
|**walletStatus** | [**WalletStatusEnum**](#WalletStatusEnum) | The status of the Wallet. |  [optional] |
|**codeStatus** | **Integer** | See [Wallet status](/guide/wallets/introduction.html#wallet-status).  |  [optional] |
|**informationStatus** | **String** |  |  [optional] |
|**walletTag** | **String** | Custom attribute to use as you see fit. |  [optional] |
|**userId** | **Integer** | The unique identifier of the User owning the Wallet. |  [optional] |
|**userLastname** | **String** |  |  [optional] |
|**userFirstname** | **String** |  |  [optional] |
|**jointUserId** | **Integer** |  |  [optional] |
|**tariffId** | **Integer** |  |  [optional] |
|**eventName** | **String** |  |  [optional] |
|**eventAlias** | **String** |  |  [optional] |
|**eventDate** | **String** | Date YYYY-MM-DD |  [optional] |
|**eventMessage** | **String** |  |  [optional] |
|**eventPayinStartDate** | **String** | Date YYYY-MM-DD |  [optional] |
|**eventPayinEndDate** | **String** | Date YYYY-MM-DD |  [optional] |
|**contractSigned** | **Integer** |  |  [optional] |
|**bic** | **String** |  |  [optional] |
|**iban** | **String** |  |  [optional] |
|**urlImage** | **String** |  |  [optional] |
|**currency** | **String** |  |  [optional] |
|**createdDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional] |
|**modifiedDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional] |
|**payinCount** | **Integer** |  |  [optional] |
|**payoutCount** | **Integer** |  |  [optional] |
|**transferCount** | **Integer** |  |  [optional] |
|**solde** | **Integer** |  |  [optional] |
|**authorizedBalance** | **Integer** |  |  [optional] |
|**totalRows** | **Integer** |  |  [optional] |



## Enum: WalletTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |



## Enum: WalletStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



