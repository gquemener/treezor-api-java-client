

# PostMccRestrictionGroup200ResponseMccRestrictionGroupsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The unique identifier of the MCC restriction group. |  [optional] |
|**name** | **String** | The name of the MCC restriction group. |  [optional] |
|**isWhitelist** | **Boolean** | Indicates the kind of restriction:  * &#x60;true&#x60; (default) – Allows only a specified list of merchant caegories (whitelist) * &#x60;false&#x60; – Allows all merchant categories except the specified list (blacklist)  |  [optional] |
|**mcc** | **List&lt;Integer&gt;** | The list of MCC (each item is an integer) |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the MCC group. |  [optional] |
|**startDate** | **String** | The date and time at which the restriction starts. Defaults to the date and time of creation. Format: YYYY-MM-DD HH:MM:SS  |  [optional] |
|**createdDate** | **String** | The date and time at which the restriction group was created.  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



