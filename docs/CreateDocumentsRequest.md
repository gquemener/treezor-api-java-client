

# CreateDocumentsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**documentTag** | **String** | Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article. &lt;br&gt;Max length: 250 characters  &lt;br&gt;Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60;  |  [optional] |
|**userId** | **Integer** | The unique identifier of the User the document belongs to. |  |
|**residenceId** | **Long** | The unique identifier of the User&#39;s [Tax Residence](/guide/user-verification/tax-residence.html). Required if the document type is &#x60;24&#x60; or &#x60;25&#x60;.  Shouldn&#39;t be provided otherwise.  |  [optional] |
|**documentTypeId** | **Integer** | The type of document. See the Document [Types](/guide/user-verification/documents.html#types-documenttypeid) article for the list.  |  |
|**name** | **String** | The name of the document. |  |
|**fileContentBase64** | **byte[]** | The file encoded in standard base64 (RFC 4648). |  |



