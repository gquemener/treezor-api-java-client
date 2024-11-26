

# PostCountryRestrictionGroup200ResponseCountryRestrictionGroupsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | The unique identifier of the Country Group. |  [optional] |
|**name** | **String** | The name of the Country Group. |  [optional] |
|**isWhitelist** | **Boolean** | Indicates the kind of restriction:   * &#x60;true&#x60; (default) – Allows only a specified list of countries (whitelist)  * &#x60;false&#x60; – Allows all countries except the specified list (blacklist)  |  [optional] |
|**countries** | **List&lt;String&gt;** | Array of countries |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the Country Group. |  [optional] |
|**startDate** | **String** | The date and time at which the restriction starts. Format: YYYY-MM-DD HH:MM:SS  |  [optional] |
|**createdDate** | **String** | The date and time at which the restriction group was created. Format: YYYY-MM-DD HH:MM:SS  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



