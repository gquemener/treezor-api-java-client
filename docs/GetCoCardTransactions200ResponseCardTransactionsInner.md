

# GetCoCardTransactions200ResponseCardTransactionsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardtransactionId** | **String** |  |  [optional] |
|**cardId** | **String** |  |  [optional] |
|**walletId** | **String** |  |  [optional] |
|**acquirerId** | **String** |  |  [optional] |
|**walletCurrency** | **String** |  |  [optional] |
|**merchantId** | **String** |  |  [optional] |
|**merchantName** | **String** |  |  [optional] |
|**merchantCity** | **String** |  |  [optional] |
|**merchantCountry** | **String** |  |  [optional] |
|**mccCode** | **String** |  |  [optional] |
|**paymentLocalTime** | **String** |  |  [optional] |
|**publicToken** | **String** |  |  [optional] |
|**paymentAmount** | **String** |  |  [optional] |
|**paymentCurrency** | **String** |  |  [optional] |
|**fees** | **String** |  |  [optional] |
|**paymentCountry** | **String** |  |  [optional] |
|**paymentId** | **String** |  |  [optional] |
|**paymentStatus** | **String** |  |  [optional] |
|**paymentLocalAmount** | **String** |  |  [optional] |
|**posCardholderPresence** | **String** |  |  [optional] |
|**posPostcode** | **String** |  |  [optional] |
|**posCountry** | **String** |  |  [optional] |
|**posTerminalId** | **String** |  |  [optional] |
|**posCardPresence** | **String** |  |  [optional] |
|**panEntryMethod** | **String** |  |  [optional] |
|**authorizationNote** | **String** |  |  [optional] |
|**authorizationResponseCode** | **String** |  |  [optional] |
|**authorizationIssuerId** | **String** |  |  [optional] |
|**authorizationIssuerTime** | **String** |  |  [optional] |
|**authorizationMti** | **String** |  |  [optional] |
|**authorizedBalance** | **String** |  |  [optional] |
|**limitAtmYear** | **String** |  |  [optional] |
|**limitAtmMonth** | **String** |  |  [optional] |
|**limitAtmWeek** | **String** |  |  [optional] |
|**limitAtmDay** | **String** |  |  [optional] |
|**limitAtmAll** | **String** |  |  [optional] |
|**limitPaymentYear** | **String** |  |  [optional] |
|**limitPaymentMonth** | **String** |  |  [optional] |
|**limitPaymentWeek** | **String** |  |  [optional] |
|**limitPaymentDay** | **String** |  |  [optional] |
|**limitPaymentAll** | **String** |  |  [optional] |
|**totalLimitAtmYear** | **String** |  |  [optional] |
|**totalLimitAtmMonth** | **String** |  |  [optional] |
|**totalLimitAtmWeek** | **String** |  |  [optional] |
|**totalLimitAtmDay** | **String** |  |  [optional] |
|**totalLimitAtmAll** | **String** |  |  [optional] |
|**totalLimitPaymentYear** | **String** |  |  [optional] |
|**totalLimitPaymentMonth** | **String** |  |  [optional] |
|**totalLimitPaymentWeek** | **String** |  |  [optional] |
|**totalLimitPaymentDay** | **String** |  |  [optional] |
|**totalLimitPaymentAll** | **String** |  |  [optional] |
|**cardDigitalizationExternalId** | **String** |  |  [optional] |
|**is3DS** | **Boolean** |  |  [optional] |
|**merchantAddress** | **String** |  |  [optional] |
|**paymentLocalDate** | **String** |  |  [optional] |
|**optimizedMerchantName** | **String** |  |  [optional] |
|**merchantLogo** | **String** |  |  [optional] |
|**merchantCategory** | **String** |  |  [optional] |
|**transactionSubtype** | [**TransactionSubtypeEnum**](#TransactionSubtypeEnum) | Additional information regarding the type of card transaction. Values can be:   * &#x60;OFT&#x60; – Offline transaction   * &#x60;PRE&#x60; – Preauthorization   * &#x60;SEP&#x60; – Second presentment  |  [optional] |
|**_3dsExemptionType** | **String** | Indicates why the transaction was exempted for 3DS authentication. See [3DS Exemption Type](/guide/cards/transactions.html#_3ds-exemption-type-3dsexemptiontype) for the value list.  |  [optional] |
|**receiverData** | **String** | For MoneySend transactions, information regarding the receiver. |  [optional] |
|**senderData** | **String** | For MoneySend transactions, information regarding the sender. |  [optional] |
|**transactionTypeIdentifier** | **String** | For MoneySend transactions, code indicating the type of transaction and the source of funds. Can be:   * &#x60;C07&#x60; – Person-to-Person Transfer   * &#x60;C52&#x60; – General Transfer to Own Account   * &#x60;C53&#x60; – Agent Cash Out   * &#x60;C54&#x60; – Payment of Own Credit Card Bill   * &#x60;C55&#x60; – Business Disbursement   * &#x60;C56&#x60; – Government/Non-profit Disbursement   * &#x60;C57&#x60; – Rapid Merchant Settlement   * &#x60;C59&#x60; – Cash-in at Point of Sale   * &#x60;C65&#x60; – General Business-to-Business Transfer  |  [optional] |
|**localMerchantId** | **String** | Indicates the merchant&#39;s SIREN or SIRET if available. |  [optional] |



## Enum: TransactionSubtypeEnum

| Name | Value |
|---- | -----|
| PRE | &quot;PRE&quot; |
| SEP | &quot;SEP&quot; |
| OFT | &quot;OFT&quot; |



