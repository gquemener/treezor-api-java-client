

# MerchantIdGroupObjectMerchantIdRestrictionGroupsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The unique identifier of the Merchant ID restriction group. |  [optional] |
|**name** | **String** | The name of the Merchant ID restriction group. |  [optional] |
|**isWhitelist** | **Boolean** | Indicates the kind of restriction:  * &#x60;true&#x60; (default) – Allows only a specified list of merchant ids(whitelist) * &#x60;false&#x60; – Allows all merchant ids except the specified list (blacklist)  |  [optional] |
|**merchants** | **List&lt;String&gt;** | List of Merchant IDs (each item is a string). |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the Merchant ID restriction group. |  [optional] |
|**startDate** | **String** | The date and time at which the restriction starts. Format: YYYY-MM-DD HH:MM:SS  |  [optional] |
|**createdDate** | **String** | The date and time at which the restriction group was created. Format: YYYY-MM-DD HH:MM:SS  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



