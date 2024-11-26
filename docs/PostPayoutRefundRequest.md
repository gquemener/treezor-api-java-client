

# PostPayoutRefundRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payoutId** | **String** | The unique identifier of the payout for which the recall is to be made. |  |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html).  &lt;br&gt;Max length: 250 characters.  |  [optional] |
|**payoutRefundTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article. &lt;br&gt;Max length: 250 characters &lt;br&gt;Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**requestAmount** | **Float** | The amount of the recall request. Defaults to the initial Payout amount. |  [optional] |
|**requestCurrency** | **String** | The currency of the recall request. |  [optional] |
|**requestComment** | **String** | Max length: 105 characters.  |  [optional] |
|**reasonCode** | [**ReasonCodeEnum**](#ReasonCodeEnum) | The reason for the recall, as listed in the [Types of Recalls](/guide/transfers/sepa-recalls.html#types-of-recalls-reasoncode) article.  |  |



## Enum: ReasonCodeEnum

| Name | Value |
|---- | -----|
| DUPL | &quot;DUPL&quot; |
| TECH | &quot;TECH&quot; |
| FRAD | &quot;FRAD&quot; |
| CUST | &quot;CUST&quot; |
| AM09 | &quot;AM09&quot; |
| AC03 | &quot;AC03&quot; |



