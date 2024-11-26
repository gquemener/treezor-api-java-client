

# CardtransactionInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardtransactionId** | **Integer** |  |  [optional] |
|**cardId** | **Integer** |  |  [optional] |
|**walletId** | **Integer** |  |  [optional] |
|**acquirerId** | **Integer** |  |  [optional] |
|**walletCurrency** | **String** |  |  [optional] |
|**merchantId** | **String** |  |  [optional] |
|**merchantName** | **String** |  |  [optional] |
|**merchantAddress** | **String** |  |  [optional] |
|**merchantCity** | **String** |  |  [optional] |
|**merchantCountry** | **String** |  |  [optional] |
|**mccCode** | **String** |  |  [optional] |
|**paymentLocalTime** | **String** |  |  [optional] |
|**publicToken** | **String** |  |  [optional] |
|**paymentAmount** | **String** |  |  [optional] |
|**paymentCurrency** | **String** | The currency of the payment. Format: [ISO 4217](/guide/api-basics/data-format.html#currencies).  |  [optional] |
|**fees** | **String** |  |  [optional] |
|**paymentCountry** | **String** |  |  [optional] |
|**paymentId** | **String** |  |  [optional] |
|**paymentStatus** | **String** | Payment status.  | Status | Description | Note | | ------ | -------     | --- | | A | Accepted | | | C | Cleared | Offline transactions are processed asynchronously. It may take up to several days.| | I | Declined | | | S | Settled | | | V | Reversed | | | M | MoneySend | |  |  [optional] |
|**paymentLocalAmount** | **String** |  |  [optional] |
|**paymentLocalDate** | **String** |  |  [optional] |
|**is3DS** | **Boolean** |  |  [optional] |
|**posCardholderPresence** | **String** |  |  [optional] |
|**posPostcode** | **String** |  |  [optional] |
|**posCountry** | **String** |  |  [optional] |
|**posTerminalId** | **String** |  |  [optional] |
|**posCardPresence** | **String** |  |  [optional] |
|**panEntryMethod** | **String** |  |  [optional] |
|**authorizationNote** | **String** |  |  [optional] |
|**authorizationResponseCode** | **String** | Authorization response code.  | Code | Description | | ---- | ----------- | | 00 | All Good | | 01 | Refer to card issuer Refer | | 03 | Invalid merchant Decline | | 05 | Do not honour Decline | | 10 | Partial Approval Approve | | 13 | Invalid amount Decline | | 14 | Invalid card number (no such number) Decline | | 17 | Customer Cancellation Decline | | 33 | Expired card (Capture) Decline &amp; Pickup | | 41 | Lost card (Capture) Decline &amp; Pickup | | 43 | Stolen card (Capture) Decline &amp; Pickup | | 51 | Insufficient funds Decline | | 54 | Expired card Decline | | 55 | Incorrect PIN Decline | | 57 | Transaction not permitted to cardholder Decline | | 58 | Transaction not permitted to terminal Decline | | 61 | Exceeds withdrawal amount limit Decline | | 62 | Restricted card Decline | | 63 | Security Violation Decline | | 65 | Exceeds withdrawal frequency limit Decline | | 68 | Response received too late Decline | | 70 | Cardholder to contact issuer Decline | | 75 | Allowable number of PIN tries exceeded Decline | | 82 | Timeout at IEM Decline | | 85 | PIN Unblock request Approve | | 91 | Issuer or switch is inoperative Decline | | N7 | Decline for CVV2 failure Decline |  |  [optional] |
|**authorizationIssuerId** | **String** |  |  [optional] |
|**authorizationIssuerTime** | **String** |  |  [optional] |
|**authorizationMti** | **String** | Authorization Message Type Identifier. Please rely on the &#x60;paymentStatus&#x60; value.  |  [optional] |
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
|**totalRows** | **Integer** |  |  [optional] |
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



