

# ScaWalletObjectScaWalletsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**subStatus** | [**SubStatusEnum**](#SubStatusEnum) |  |  [optional] |
|**passcodeStatus** | [**PasscodeStatusEnum**](#PasscodeStatusEnum) |  |  [optional] |
|**locked** | **Boolean** |  |  [optional] |
|**lockReasons** | [**List&lt;LockReasonsEnum&gt;**](#List&lt;LockReasonsEnum&gt;) |  |  [optional] |
|**lockMessage** | **String** |  |  [optional] |
|**settingsProfile** | **String** |  |  [optional] |
|**mobileWallet** | [**ScaWalletObjectScaWalletsInnerMobileWallet**](ScaWalletObjectScaWalletsInnerMobileWallet.md) |  |  [optional] |
|**activationCode** | **String** |  |  [optional] |
|**creationDate** | **OffsetDateTime** |  |  [optional] |
|**deletionDate** | **OffsetDateTime** |  |  [optional] |
|**activationCodeExpiryDate** | **OffsetDateTime** |  |  [optional] |
|**authenticationMethods** | **List&lt;Object&gt;** |  |  [optional] |
|**invalidActivationAttempts** | **String** |  |  [optional] |
|**userId** | **String** |  |  [optional] |
|**scaWalletTag** | **String** |  |  [optional] |
|**clientId** | **String** |  |  [optional] |
|**activationDate** | **String** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CREATING | &quot;CREATING&quot; |
| CREATED | &quot;CREATED&quot; |
| INITIALIZING | &quot;INITIALIZING&quot; |
| ACTIVE | &quot;ACTIVE&quot; |
| DELETED | &quot;DELETED&quot; |



## Enum: SubStatusEnum

| Name | Value |
|---- | -----|
| CREATING_IN_PROGRESS | &quot;CREATING_IN_PROGRESS&quot; |
| CREATED_BLOCKED | &quot;CREATED_BLOCKED&quot; |
| CREATED_READY | &quot;CREATED_READY&quot; |
| INITIALIZING_MOBILE | &quot;INITIALIZING_MOBILE&quot; |
| ACTIVATED_LOGGED_IN | &quot;ACTIVATED_LOGGED_IN&quot; |
| ACTIVATED_LOGGED_OUT | &quot;ACTIVATED_LOGGED_OUT&quot; |
| DELETED_BY_ISSUER | &quot;DELETED_BY_ISSUER&quot; |
| DELETED_UNINSTALLED | &quot;DELETED_UNINSTALLED&quot; |



## Enum: PasscodeStatusEnum

| Name | Value |
|---- | -----|
| SET | &quot;SET&quot; |
| NOT_SET | &quot;NOT_SET&quot; |
| TO_BE_CHANGED | &quot;TO_BE_CHANGED&quot; |
| NONE | &quot;NONE&quot; |



## Enum: List&lt;LockReasonsEnum&gt;

| Name | Value |
|---- | -----|
| ISSUER | &quot;ISSUER&quot; |
| LOST_DEVICE | &quot;LOST_DEVICE&quot; |
| STOLEN_DEVICE | &quot;STOLEN_DEVICE&quot; |
| FRAUDULENT_USE_SUSPECTED_BY_ISSUER | &quot;FRAUDULENT_USE_SUSPECTED_BY_ISSUER&quot; |
| FRAUDULENT_USE_SUSPECTED_BY_CLIENT | &quot;FRAUDULENT_USE_SUSPECTED_BY_CLIENT&quot; |
| TERMINATE_SERVICE | &quot;TERMINATE_SERVICE&quot; |
| INCIDENT | &quot;INCIDENT&quot; |



