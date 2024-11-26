

# UpdateBlockStatusRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lockStatus** | **Integer** | The Status of the card, indicating whether it is locked, lost, or destroyed for instance. While this field is an integer, it returns a plaintext value. See the full list of &#x60;lockStatus&#x60;in the [Block a Card](/guide/cards/modification.html#status) article.  |  |
|**accessTag** | **String** | A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters.  |  [optional] |



