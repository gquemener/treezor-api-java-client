

# PostTransfersRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transferTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article. &lt;br&gt;Max length: 250 characters  &lt;br&gt;Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**walletId** | **Integer** | The debited Wallet unique identifier. |  |
|**beneficiaryWalletId** | **Integer** | The credited Wallet unique identifier. |  |
|**amount** | **Float** | The amount of the Transfer. |  |
|**currency** | **String** | The currency of the Transfer. Debited wallet and credited wallet must share same currency.  Format: [ISO 4217](/guide/api-basics/data-format.html#currencies).  |  |
|**label** | **String** | Custom data. |  [optional] |
|**transferTypeId** | **Integer** | The type of the Transfer: * &#x60;1&#x60; – Wallet to wallet  * &#x60;3&#x60; – Client fees * &#x60;4&#x60; – Credit note  |  [optional] |



