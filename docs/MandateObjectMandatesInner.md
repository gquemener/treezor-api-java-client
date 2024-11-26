

# MandateObjectMandatesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mandateId** | **Integer** | The unique identifier of the Mandate. |  [optional] |
|**title** | **String** |  |  [optional] |
|**legalInformations** | **String** |  |  [optional] |
|**uniqueMandateReference** | **String** |  |  [optional] |
|**mandateStatus** | [**MandateStatusEnum**](#MandateStatusEnum) |  |  [optional] |
|**userId** | **Integer** | The unique identifier of the User. |  [optional] |
|**debtorName** | **String** |  |  [optional] |
|**debtorAddress** | **String** |  |  [optional] |
|**debtorCity** | **String** |  |  [optional] |
|**debtorZipCode** | **String** |  |  [optional] |
|**debtorCountry** | **String** |  |  [optional] |
|**debtorIban** | **String** |  |  [optional] |
|**debtorBic** | **String** |  |  [optional] |
|**sequenceType** | [**SequenceTypeEnum**](#SequenceTypeEnum) | Defines whether or not the debtor will be debited multiple times. Can be one of the following: * &#x60;one-off&#x60; – For a one-time payment. * &#x60;recurrent&#x60; – For recurring payments.  |  [optional] |
|**creditorName** | **String** |  |  [optional] |
|**sepaCreditorIdentifier** | **String** |  |  [optional] |
|**creditorAddress** | **String** |  |  [optional] |
|**creditorCity** | **String** |  |  [optional] |
|**creditorZipCode** | **String** |  |  [optional] |
|**creditorCountry** | **String** |  |  [optional] |
|**signatureDate** | **LocalDate** | The date on which the Mandate was signed. |  [optional] |
|**debtorSignatureIp** | **String** |  |  [optional] |
|**signed** | **Integer** |  |  [optional] |
|**debtorIdentificationCode** | **String** |  |  [optional] |
|**debtorReferencePartyName** | **String** |  |  [optional] |
|**debtorReferenceIdentificationCode** | **String** |  |  [optional] |
|**creditorReferencePartyName** | **String** |  |  [optional] |
|**creditorReferenceIdentificationCode** | **String** |  |  [optional] |
|**contractIdentificationNumber** | **String** |  |  [optional] |
|**contractDescription** | **String** |  |  [optional] |
|**isPaper** | **Boolean** |  |  [optional] |
|**sddType** | [**SddTypeEnum**](#SddTypeEnum) |  |  [optional] |
|**revocationSignatureDate** | **OffsetDateTime** | Date YYYY-MM-DD HH:MM:SS |  [optional] |
|**createdIp** | **String** |  |  [optional] |
|**createdDate** | **OffsetDateTime** | Date YYYY-MM-DD HH:MM:SS |  [optional] |
|**modifiedDate** | **OffsetDateTime** | Date YYYY-MM-DD HH:MM:SS |  [optional] |



## Enum: MandateStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: SequenceTypeEnum

| Name | Value |
|---- | -----|
| ONE_OFF | &quot;one-off&quot; |
| RECURRENT | &quot;recurrent&quot; |



## Enum: SddTypeEnum

| Name | Value |
|---- | -----|
| CORE | &quot;core&quot; |
| B2B | &quot;b2b&quot; |



