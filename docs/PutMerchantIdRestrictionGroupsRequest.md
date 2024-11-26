

# PutMerchantIdRestrictionGroupsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Name of the merchant ID restriction group |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the merchant ID restriction group |  [optional] |
|**isWhitelist** | **Boolean** | Indicates the kind of restriction:  * &#x60;true&#x60; (default) – Allows only a specified list of merchant ids (whitelist) * &#x60;false&#x60; – Allows all merchant ids except the specified list (blacklist)  |  [optional] |
|**merchants** | **List&lt;String&gt;** | (Deprecated. Use &#x60;PUT /merchantIdRestrictionGroups/{id}/DeltaUpdate&#x60; to update merchants ID list)  |  [optional] |
|**startDate** | **String** | The date and time at which the restriction starts. Format: YYYY-MM-DD HH:MM:SS  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VALIDATED | &quot;VALIDATED&quot; |
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |



