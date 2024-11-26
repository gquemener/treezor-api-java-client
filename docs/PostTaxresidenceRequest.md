

# PostTaxresidenceRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **Integer** | The unique identifier of the user. |  |
|**country** | **String** | The country of the resident. |  |
|**taxPayerId** | **String** | Tax payer&#39;s id. This field is mandatory if the country of the resident is &#x60;US&#x60;, but optional otherwise.  |  [optional] |
|**liabilityWaiver** | **Boolean** | Must be set to true if the &#x60;taxPayerId&#x60; is empty or null, and set to false otherwise.  |  |



