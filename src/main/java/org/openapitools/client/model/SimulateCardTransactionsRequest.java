/*
 * Treezor API
 * Official endpoint documentation for Treezor.
 *
 * The version of the OpenAPI document: 24.11.21
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * SimulateCardTransactionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class SimulateCardTransactionsRequest {
  public static final String SERIALIZED_NAME_PUBLIC_TOKEN = "publicToken";
  @SerializedName(SERIALIZED_NAME_PUBLIC_TOKEN)
  @javax.annotation.Nullable
  private String publicToken;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nullable
  private String date;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private Float amount;

  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  @javax.annotation.Nullable
  private String mcc;

  public static final String SERIALIZED_NAME_MERCHANT_ID = "merchantId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ID)
  @javax.annotation.Nonnull
  private String merchantId;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchantName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  @javax.annotation.Nonnull
  private String merchantName;

  public static final String SERIALIZED_NAME_PAYMENT_STATUS = "paymentStatus";
  @SerializedName(SERIALIZED_NAME_PAYMENT_STATUS)
  @javax.annotation.Nullable
  private String paymentStatus;

  public static final String SERIALIZED_NAME_TRANS_LINK = "transLink";
  @SerializedName(SERIALIZED_NAME_TRANS_LINK)
  @javax.annotation.Nonnull
  private String transLink;

  public static final String SERIALIZED_NAME_PAYMENT_CODE = "paymentCode";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_PAYMENT_CODE)
  @javax.annotation.Nullable
  private String paymentCode;

  public SimulateCardTransactionsRequest() {
  }

  public SimulateCardTransactionsRequest publicToken(@javax.annotation.Nullable String publicToken) {
    this.publicToken = publicToken;
    return this;
  }

  /**
   * The public token of the Card.
   * @return publicToken
   */
  @javax.annotation.Nullable
  public String getPublicToken() {
    return publicToken;
  }

  public void setPublicToken(@javax.annotation.Nullable String publicToken) {
    this.publicToken = publicToken;
  }


  public SimulateCardTransactionsRequest date(@javax.annotation.Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * The date and time of the CardTransaction, as seen in the &#x60;authorizationIssuerTime&#x60; attribute.
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nullable String date) {
    this.date = date;
  }


  public SimulateCardTransactionsRequest amount(@javax.annotation.Nullable Float amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the CardTransaction, as seen it the &#x60;paymentAmount&#x60; and &#x60;paymentLocalAmount&#x60; attributes.
   * @return amount
   */
  @javax.annotation.Nullable
  public Float getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable Float amount) {
    this.amount = amount;
  }


  public SimulateCardTransactionsRequest mcc(@javax.annotation.Nullable String mcc) {
    this.mcc = mcc;
    return this;
  }

  /**
   * The Merchant Category Code for the CardTransaction, allowing you to check [Card MCC restrictions](/guide/cards/restrictions-limits.html#mcc-restrictions). 
   * @return mcc
   */
  @javax.annotation.Nullable
  public String getMcc() {
    return mcc;
  }

  public void setMcc(@javax.annotation.Nullable String mcc) {
    this.mcc = mcc;
  }


  public SimulateCardTransactionsRequest merchantId(@javax.annotation.Nonnull String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

  /**
   * The Merchant&#39;s ID for the CardTransaction, allowing you to check [Card MID restrictions](/guide/cards/restrictions-limits.html#mid-restrictions). 
   * @return merchantId
   */
  @javax.annotation.Nonnull
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(@javax.annotation.Nonnull String merchantId) {
    this.merchantId = merchantId;
  }


  public SimulateCardTransactionsRequest merchantName(@javax.annotation.Nonnull String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * The name of the merchant.
   * @return merchantName
   */
  @javax.annotation.Nonnull
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(@javax.annotation.Nonnull String merchantName) {
    this.merchantName = merchantName;
  }


  public SimulateCardTransactionsRequest paymentStatus(@javax.annotation.Nullable String paymentStatus) {
    this.paymentStatus = paymentStatus;
    return this;
  }

  /**
   * The type of CardTransaction. In the specific case of simulation, allowed values are: * &#x60;A&#x60; – Authorization accepted * &#x60;S&#x60; – Settled  See the full list of values in the [Statuses](/guide/cards/transactions.html#statuses-paymentstatus) article. 
   * @return paymentStatus
   */
  @javax.annotation.Nullable
  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(@javax.annotation.Nullable String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }


  public SimulateCardTransactionsRequest transLink(@javax.annotation.Nonnull String transLink) {
    this.transLink = transLink;
    return this;
  }

  /**
   * A unique reference used to associate the Card Transaction with a &#x60;paymentId&#x60;. Must be &#x60;100000000000000&#x60; or higher.  To emulate a complete flow, set a &#x60;paymentStatus &#x3D; A&#x60; followed by a &#x60;S&#x60; while specifying the same &#x60;transLink&#x60; for both requests. 
   * @return transLink
   */
  @javax.annotation.Nonnull
  public String getTransLink() {
    return transLink;
  }

  public void setTransLink(@javax.annotation.Nonnull String transLink) {
    this.transLink = transLink;
  }


  @Deprecated
  public SimulateCardTransactionsRequest paymentCode(@javax.annotation.Nullable String paymentCode) {
    this.paymentCode = paymentCode;
    return this;
  }

  /**
   * Deprecated. Use the &#x60;transLink&#x60; parameter instead.
   * @return paymentCode
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public String getPaymentCode() {
    return paymentCode;
  }

  @Deprecated
  public void setPaymentCode(@javax.annotation.Nullable String paymentCode) {
    this.paymentCode = paymentCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulateCardTransactionsRequest simulateCardTransactionsRequest = (SimulateCardTransactionsRequest) o;
    return Objects.equals(this.publicToken, simulateCardTransactionsRequest.publicToken) &&
        Objects.equals(this.date, simulateCardTransactionsRequest.date) &&
        Objects.equals(this.amount, simulateCardTransactionsRequest.amount) &&
        Objects.equals(this.mcc, simulateCardTransactionsRequest.mcc) &&
        Objects.equals(this.merchantId, simulateCardTransactionsRequest.merchantId) &&
        Objects.equals(this.merchantName, simulateCardTransactionsRequest.merchantName) &&
        Objects.equals(this.paymentStatus, simulateCardTransactionsRequest.paymentStatus) &&
        Objects.equals(this.transLink, simulateCardTransactionsRequest.transLink) &&
        Objects.equals(this.paymentCode, simulateCardTransactionsRequest.paymentCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicToken, date, amount, mcc, merchantId, merchantName, paymentStatus, transLink, paymentCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulateCardTransactionsRequest {\n");
    sb.append("    publicToken: ").append(toIndentedString(publicToken)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    paymentStatus: ").append(toIndentedString(paymentStatus)).append("\n");
    sb.append("    transLink: ").append(toIndentedString(transLink)).append("\n");
    sb.append("    paymentCode: ").append(toIndentedString(paymentCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("publicToken");
    openapiFields.add("date");
    openapiFields.add("amount");
    openapiFields.add("mcc");
    openapiFields.add("merchantId");
    openapiFields.add("merchantName");
    openapiFields.add("paymentStatus");
    openapiFields.add("transLink");
    openapiFields.add("paymentCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("merchantId");
    openapiRequiredFields.add("merchantName");
    openapiRequiredFields.add("transLink");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SimulateCardTransactionsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimulateCardTransactionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimulateCardTransactionsRequest is not found in the empty JSON string", SimulateCardTransactionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SimulateCardTransactionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimulateCardTransactionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimulateCardTransactionsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("publicToken") != null && !jsonObj.get("publicToken").isJsonNull()) && !jsonObj.get("publicToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicToken").toString()));
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("mcc") != null && !jsonObj.get("mcc").isJsonNull()) && !jsonObj.get("mcc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc").toString()));
      }
      if (!jsonObj.get("merchantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantId").toString()));
      }
      if (!jsonObj.get("merchantName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantName").toString()));
      }
      if ((jsonObj.get("paymentStatus") != null && !jsonObj.get("paymentStatus").isJsonNull()) && !jsonObj.get("paymentStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentStatus").toString()));
      }
      if (!jsonObj.get("transLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transLink").toString()));
      }
      if ((jsonObj.get("paymentCode") != null && !jsonObj.get("paymentCode").isJsonNull()) && !jsonObj.get("paymentCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimulateCardTransactionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimulateCardTransactionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimulateCardTransactionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimulateCardTransactionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SimulateCardTransactionsRequest>() {
           @Override
           public void write(JsonWriter out, SimulateCardTransactionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimulateCardTransactionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SimulateCardTransactionsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SimulateCardTransactionsRequest
   * @throws IOException if the JSON string is invalid with respect to SimulateCardTransactionsRequest
   */
  public static SimulateCardTransactionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimulateCardTransactionsRequest.class);
  }

  /**
   * Convert an instance of SimulateCardTransactionsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

