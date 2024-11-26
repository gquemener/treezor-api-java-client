

# PutCardRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mccRestrictionGroupId** | **Integer** | The merchant category restriction group (&#x60;mccRestrictionGroup&#x60;) to apply to the card.  |  [optional] |
|**merchantRestrictionGroupId** | **Integer** | The merchant Id restriction group (&#x60;merchantRestrictionGroupId&#x60;) to apply to the card.  |  [optional] |
|**countryRestrictionGroupId** | **Integer** | The country restriction group (&#x60;countryRestrictionGroupId&#x60;) to apply to the card.  |  [optional] |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  |  [optional] |
|**cardTag** | **String** | This attribute is a string which can store a maximum of 250 characters that you are free to populate to suit your needs &lt;br /&gt; You can [read more about tags](/guide/api-basics/objects-tags.html)  |  [optional] |



