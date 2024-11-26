

# PostWalletsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletTypeId** | [**WalletTypeIdEnum**](#WalletTypeIdEnum) | The type of Wallet. The following values are allowed: * &#x60;9&#x60; – Electronic Money Wallet * &#x60;10&#x60; – Payment Account Wallet  Other types are available but can only be set by Treezor. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation.  |  |
|**tariffId** | **Integer** | The fees applied to the Wallet, as defined by your contract with Treezor. Usually required, but may have a default value set by Treezor. |  |
|**userId** | **Integer** | The unique identifier of the User owning the Wallet. |  |
|**jointUserId** | **Integer** | Legacy attribute, do not use. |  [optional] |
|**walletTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article. &lt;br&gt;Max length: 250 characters  &lt;br&gt;Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**currency** | **String** | The currency of the Wallet, which will be used for money transactions. &lt;br&gt;Format: [ISO 4217 3-letter code](/guide/api-basics/data-format.html#currencies)  |  |
|**eventName** | **String** | The name of the Wallet. |  |
|**eventAlias** | **String** | Legacy attribute, do not use. |  [optional] |
|**eventMessage** | **String** | Can be used to describe the Wallet. |  [optional] |



## Enum: WalletTypeIdEnum

| Name | Value |
|---- | -----|
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |



