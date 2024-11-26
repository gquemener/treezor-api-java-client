

# PutVirtualIbanRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**validFrom** | **String** | The date from which the Virtual IBAN validity starts. Defaults to today&#39;s date and must be set in the future.&lt;br&gt; Format: YYYY-MM-DD  |  [optional] |
|**validTo** | **String** | The date from which the Virtual IBAN validity ends. Must be set after the &#x60;validFrom&#x60; date.&lt;br&gt; Format: YYYY-MM-DD  |  [optional] |
|**maxUsage** | **Integer** | The maximum number of transactions allowed (&#x60;0&#x60; &#x3D; unlimited).   |  [optional] |
|**maxAmount** | **Float** | The maximum cumulated amount of all transactions (&#x60;\&quot;0.00\&quot;&#x60; &#x3D; unlimited).  |  [optional] |
|**reference** | **String** | Custom field for your internal reference of the Virtual IBAN.  Max. length: 255 characters.  |  [optional] |



