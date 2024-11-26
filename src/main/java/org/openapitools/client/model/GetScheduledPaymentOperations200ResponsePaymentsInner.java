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
import java.math.BigDecimal;
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
 * GetScheduledPaymentOperations200ResponsePaymentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class GetScheduledPaymentOperations200ResponsePaymentsInner {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @javax.annotation.Nullable
  private String date;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_END_TO_END_ID = "endToEndId";
  @SerializedName(SERIALIZED_NAME_END_TO_END_ID)
  @javax.annotation.Nullable
  private String endToEndId;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_PAYMENT_ID = "paymentId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_ID)
  @javax.annotation.Nullable
  private Integer paymentId;

  public static final String SERIALIZED_NAME_ERROR_CODE = "errorCode";
  @SerializedName(SERIALIZED_NAME_ERROR_CODE)
  @javax.annotation.Nullable
  private String errorCode;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  @javax.annotation.Nullable
  private String errorMessage;

  public GetScheduledPaymentOperations200ResponsePaymentsInner() {
  }

  public GetScheduledPaymentOperations200ResponsePaymentsInner date(@javax.annotation.Nullable String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }

  public void setDate(@javax.annotation.Nullable String date) {
    this.date = date;
  }


  public GetScheduledPaymentOperations200ResponsePaymentsInner amount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
  }


  public GetScheduledPaymentOperations200ResponsePaymentsInner currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public GetScheduledPaymentOperations200ResponsePaymentsInner endToEndId(@javax.annotation.Nullable String endToEndId) {
    this.endToEndId = endToEndId;
    return this;
  }

  /**
   * Get endToEndId
   * @return endToEndId
   */
  @javax.annotation.Nullable
  public String getEndToEndId() {
    return endToEndId;
  }

  public void setEndToEndId(@javax.annotation.Nullable String endToEndId) {
    this.endToEndId = endToEndId;
  }


  public GetScheduledPaymentOperations200ResponsePaymentsInner label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public GetScheduledPaymentOperations200ResponsePaymentsInner status(@javax.annotation.Nullable String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable String status) {
    this.status = status;
  }


  public GetScheduledPaymentOperations200ResponsePaymentsInner paymentId(@javax.annotation.Nullable Integer paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Get paymentId
   * @return paymentId
   */
  @javax.annotation.Nullable
  public Integer getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(@javax.annotation.Nullable Integer paymentId) {
    this.paymentId = paymentId;
  }


  public GetScheduledPaymentOperations200ResponsePaymentsInner errorCode(@javax.annotation.Nullable String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
   */
  @javax.annotation.Nullable
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@javax.annotation.Nullable String errorCode) {
    this.errorCode = errorCode;
  }


  public GetScheduledPaymentOperations200ResponsePaymentsInner errorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   */
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(@javax.annotation.Nullable String errorMessage) {
    this.errorMessage = errorMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetScheduledPaymentOperations200ResponsePaymentsInner getScheduledPaymentOperations200ResponsePaymentsInner = (GetScheduledPaymentOperations200ResponsePaymentsInner) o;
    return Objects.equals(this.date, getScheduledPaymentOperations200ResponsePaymentsInner.date) &&
        Objects.equals(this.amount, getScheduledPaymentOperations200ResponsePaymentsInner.amount) &&
        Objects.equals(this.currency, getScheduledPaymentOperations200ResponsePaymentsInner.currency) &&
        Objects.equals(this.endToEndId, getScheduledPaymentOperations200ResponsePaymentsInner.endToEndId) &&
        Objects.equals(this.label, getScheduledPaymentOperations200ResponsePaymentsInner.label) &&
        Objects.equals(this.status, getScheduledPaymentOperations200ResponsePaymentsInner.status) &&
        Objects.equals(this.paymentId, getScheduledPaymentOperations200ResponsePaymentsInner.paymentId) &&
        Objects.equals(this.errorCode, getScheduledPaymentOperations200ResponsePaymentsInner.errorCode) &&
        Objects.equals(this.errorMessage, getScheduledPaymentOperations200ResponsePaymentsInner.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, amount, currency, endToEndId, label, status, paymentId, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetScheduledPaymentOperations200ResponsePaymentsInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("endToEndId");
    openapiFields.add("label");
    openapiFields.add("status");
    openapiFields.add("paymentId");
    openapiFields.add("errorCode");
    openapiFields.add("errorMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetScheduledPaymentOperations200ResponsePaymentsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetScheduledPaymentOperations200ResponsePaymentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetScheduledPaymentOperations200ResponsePaymentsInner is not found in the empty JSON string", GetScheduledPaymentOperations200ResponsePaymentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetScheduledPaymentOperations200ResponsePaymentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetScheduledPaymentOperations200ResponsePaymentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("endToEndId") != null && !jsonObj.get("endToEndId").isJsonNull()) && !jsonObj.get("endToEndId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endToEndId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endToEndId").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("errorCode") != null && !jsonObj.get("errorCode").isJsonNull()) && !jsonObj.get("errorCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorCode").toString()));
      }
      if ((jsonObj.get("errorMessage") != null && !jsonObj.get("errorMessage").isJsonNull()) && !jsonObj.get("errorMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `errorMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("errorMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetScheduledPaymentOperations200ResponsePaymentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetScheduledPaymentOperations200ResponsePaymentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetScheduledPaymentOperations200ResponsePaymentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetScheduledPaymentOperations200ResponsePaymentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetScheduledPaymentOperations200ResponsePaymentsInner>() {
           @Override
           public void write(JsonWriter out, GetScheduledPaymentOperations200ResponsePaymentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetScheduledPaymentOperations200ResponsePaymentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetScheduledPaymentOperations200ResponsePaymentsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetScheduledPaymentOperations200ResponsePaymentsInner
   * @throws IOException if the JSON string is invalid with respect to GetScheduledPaymentOperations200ResponsePaymentsInner
   */
  public static GetScheduledPaymentOperations200ResponsePaymentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetScheduledPaymentOperations200ResponsePaymentsInner.class);
  }

  /**
   * Convert an instance of GetScheduledPaymentOperations200ResponsePaymentsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

