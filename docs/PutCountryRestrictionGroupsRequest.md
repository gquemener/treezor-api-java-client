

# PutCountryRestrictionGroupsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the Country Group. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the Country Group. |  [optional] |
|**isWhitelist** | **Boolean** | Indicates the kind of restriction:    * &#x60;true&#x60; (default) – Allows only a specified list of countries (whitelist)   * &#x60;false&#x60; – Allows all countries except the specified list (blacklist)  |  [optional] |
|**countries** | **List&lt;Integer&gt;** | List of countries (each item is a string). |  [optional] |
|**startDate** | **String** | The date and time at which the restriction starts. Format: YYYY-MM-DD HH:MM:SS  |  [optional] |
|**fields** | **List&lt;String&gt;** | List of the object properties you want to pick up. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VALIDATED | &quot;VALIDATED&quot; |
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |



