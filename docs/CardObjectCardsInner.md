

# CardObjectCardsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardId** | **Integer** | The unique identifier of the card. |  [optional] |
|**userId** | **Integer** | The unique identifier of the cardholder. |  [optional] |
|**walletId** | **Integer** | The unique identifier of the Wallet the card is attached to. |  [optional] |
|**walletCardtransactionId** | **Integer** |  |  [optional] |
|**mccRestrictionGroupId** | **Integer** | The merchant category restriction group (&#x60;mccRestrictionGroup&#x60;) applied to the card.  |  [optional] |
|**merchantRestrictionGroupId** | **Integer** | The merchant Id restriction group (&#x60;merchantRestrictionGroupId&#x60;) applied to the card.  |  [optional] |
|**countryRestrictionGroupId** | **Integer** | The country restriction group (&#x60;countryRestrictionGroupId&#x60;) applied to the card.  |  [optional] |
|**publicToken** | **String** |  |  [optional] |
|**cardTag** | **String** |  |  [optional] |
|**statusCode** | [**StatusCodeEnum**](#StatusCodeEnum) |  |  [optional] |
|**isLive** | **Integer** |  |  [optional] |
|**pinTryExceeds** | **Integer** |  |  [optional] |
|**maskedPan** | **String** |  |  [optional] |
|**embossedName** | **String** |  |  [optional] |
|**expiryDate** | **String** | The date on which the card expires.  The [&#x60;card.expiryAlert&#x60;](/guide/cards/events.md#structure-of-a-card-expiryalert) webhook is sent a month before the &#x60;expiryDate&#x60; for you to anticipate [Renewal](/guide/cards/renewal.html). Format: YYYY-MM-DD   |  [optional] |
|**CVV** | **String** | The verification code of the card. This field is to be deprecated and hence may return a value of &#x60;000&#x60;.   You may retrieve the card CVV by using the [&#x60;/v1/cardimages&#x60;](/guide/swagger/introduction.html#/Cards/getCardImage) request or by migrating to the [PCI DSS-compliant services](/guide/cards/pci-dss.html).  |  [optional] |
|**startDate** | **String** |  |  [optional] |
|**endDate** | **String** |  |  [optional] |
|**countryCode** | **String** | Inherited from the cardholder&#39;s country. |  [optional] |
|**currencyCode** | **String** |  |  [optional] |
|**lang** | **String** | Inherited from the cardholder&#39;s language. |  [optional] |
|**deliveryTitle** | **String** |  |  [optional] |
|**deliveryLastname** | **String** |  |  [optional] |
|**deliveryFirstname** | **String** |  |  [optional] |
|**deliveryAddress1** | **String** |  |  [optional] |
|**deliveryAddress2** | **String** |  |  [optional] |
|**deliveryAddress3** | **String** |  |  [optional] |
|**deliveryCity** | **String** |  |  [optional] |
|**deliveryPostcode** | **String** |  |  [optional] |
|**deliveryCountry** | **String** |  |  [optional] |
|**mobileSent** | **String** | Inherited from the cardholder&#39; phone. |  [optional] |
|**limitsGroup** | **String** |  |  [optional] |
|**permsGroup** | **String** |  |  [optional] |
|**cardDesign** | **String** |  |  [optional] |
|**virtualConverted** | [**VirtualConvertedEnum**](#VirtualConvertedEnum) | Whether or not the card is a Virtual Card that has been converted into a Physical Card. Values can be: * &#x60;1&#x60; – Physical card converted from a virtual card * &#x60;0&#x60; – Not converted, virtual card only  |  [optional] |
|**physical** | **Integer** |  |  [optional] |
|**optionAtm** | **Integer** |  |  [optional] |
|**optionForeign** | **Integer** |  |  [optional] |
|**optionOnline** | **Integer** |  |  [optional] |
|**optionNfc** | **Integer** |  |  [optional] |
|**limitAtmYear** | **Integer** |  |  [optional] |
|**limitAtmMonth** | **Integer** |  |  [optional] |
|**limitAtmWeek** | **Integer** |  |  [optional] |
|**limitAtmDay** | **Integer** |  |  [optional] |
|**limitAtmAll** | **Integer** |  |  [optional] |
|**limitPaymentYear** | **Integer** |  |  [optional] |
|**limitPaymentMonth** | **Integer** |  |  [optional] |
|**limitPaymentWeek** | **Integer** |  |  [optional] |
|**limitPaymentDay** | **Integer** |  |  [optional] |
|**limitPaymentAll** | **Integer** |  |  [optional] |
|**paymentDailyLimit** | **Float** |  |  [optional] |
|**totalAtmYear** | **Integer** |  |  [optional] |
|**totalAtmMonth** | **Integer** |  |  [optional] |
|**totalAtmWeek** | **Integer** |  |  [optional] |
|**totalAtmDay** | **Integer** |  |  [optional] |
|**totalAtmAll** | **Integer** |  |  [optional] |
|**totalPaymentYear** | **Integer** |  |  [optional] |
|**totalPaymentMonth** | **Integer** |  |  [optional] |
|**totalPaymentWeek** | **Integer** |  |  [optional] |
|**totalPaymentDay** | **Integer** |  |  [optional] |
|**totalPaymentAll** | **Integer** |  |  [optional] |
|**createdBy** | **Integer** |  |  [optional] |
|**createdDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional] |
|**modifiedBy** | **Integer** |  |  [optional] |
|**modifiedDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional] |
|**totalRows** | **Integer** |  |  [optional] |
|**designCode** | **String** |  |  [optional] |
|**cardLanguages** | **String** |  |  [optional] |
|**eventName** | **String** | Name of the Wallet, inherited from the wallet the card is attached to. |  [optional] |
|**eventAlias** | **String** | Description of the Wallet, inherited from the wallet the card is attached to. |  [optional] |
|**restrictionGroupLimits** | [**List&lt;CardObjectCardsInnerRestrictionGroupLimitsInner&gt;**](CardObjectCardsInnerRestrictionGroupLimitsInner.md) |  |  [optional] |
|**cancellationNumber** | **String** | Number generated when the card &#x60;statusCode&#x60; is set to &#x60;STOLEN&#x60; or &#x60;LOST&#x60;.  |  [optional] |
|**metadata** | **String** |  |  [optional] |
|**renewalDate** | **String** | Date on which the card was renewed (field populated for the original card only). YYYY-MM-DD. |  [optional] |
|**renewalType** | [**RenewalTypeEnum**](#RenewalTypeEnum) | Indicates how the Card is to be renewed. &#x60;A&#x60; for automatic renewal, &#x60;N&#x60; for non-automatic renewal.  |  [optional] |
|**originalCardId** | **Integer** | The unique identifier of the original Card (field populated for renewed cards only). |  [optional] |
|**logoId** | **String** | The file name of the logo for the card. Learn more in the [Logo](/guide/cards/creation.html#logo-logoid) article.  |  [optional] |
|**logoBackId** | **String** | The file name of the logo for the back of the card. Learn more in the [Back Logo](/guide/cards/creation.html#back-logo-logobackid) article.  |  [optional] |
|**packageId** | **String** | Packaging reference for card shipping. Max. 8 characters. |  [optional] |
|**customizeInfo** | **String** | Customized text to be displayed on the card. |  [optional] |
|**letterCustomizedInfo** | **String** | Customized text for the letter that is joined to the card. |  [optional] |
|**freeCustomizedInfo** | **String** | More customized text to be displayed on the card. |  [optional] |



## Enum: StatusCodeEnum

| Name | Value |
|---- | -----|
| UNLOCK | &quot;UNLOCK&quot; |
| LOCK | &quot;LOCK&quot; |
| LOST | &quot;LOST&quot; |
| STOLEN | &quot;STOLEN&quot; |
| DESTROYED | &quot;DESTROYED&quot; |
| LOCK_INTERNAL | &quot;LOCK_INTERNAL&quot; |
| EXPIRED | &quot;EXPIRED&quot; |



## Enum: VirtualConvertedEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



## Enum: RenewalTypeEnum

| Name | Value |
|---- | -----|
| A | &quot;A&quot; |
| N | &quot;N&quot; |



