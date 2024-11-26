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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * PaymentLifeCycle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class PaymentLifeCycle {
  public static final String SERIALIZED_NAME_AUTHORIZATION_ISSUER_TIME = "authorizationIssuerTime";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_ISSUER_TIME)
  @javax.annotation.Nullable
  private String authorizationIssuerTime;

  public static final String SERIALIZED_NAME_VALUE_DATE = "valueDate";
  @SerializedName(SERIALIZED_NAME_VALUE_DATE)
  @javax.annotation.Nullable
  private String valueDate;

  public static final String SERIALIZED_NAME_PAYMENT_AMOUNT = "paymentAmount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AMOUNT)
  @javax.annotation.Nullable
  private String paymentAmount;

  public static final String SERIALIZED_NAME_PAYMENT_LOCAL_AMOUNT = "paymentLocalAmount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_LOCAL_AMOUNT)
  @javax.annotation.Nullable
  private String paymentLocalAmount;

  public static final String SERIALIZED_NAME_PAYMENT_CURRENCY = "paymentCurrency";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CURRENCY)
  @javax.annotation.Nullable
  private String paymentCurrency;

  public PaymentLifeCycle() {
  }

  public PaymentLifeCycle authorizationIssuerTime(@javax.annotation.Nullable String authorizationIssuerTime) {
    this.authorizationIssuerTime = authorizationIssuerTime;
    return this;
  }

  /**
   * Get authorizationIssuerTime
   * @return authorizationIssuerTime
   */
  @javax.annotation.Nullable
  public String getAuthorizationIssuerTime() {
    return authorizationIssuerTime;
  }

  public void setAuthorizationIssuerTime(@javax.annotation.Nullable String authorizationIssuerTime) {
    this.authorizationIssuerTime = authorizationIssuerTime;
  }


  public PaymentLifeCycle valueDate(@javax.annotation.Nullable String valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * Get valueDate
   * @return valueDate
   */
  @javax.annotation.Nullable
  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(@javax.annotation.Nullable String valueDate) {
    this.valueDate = valueDate;
  }


  public PaymentLifeCycle paymentAmount(@javax.annotation.Nullable String paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

  /**
   * Get paymentAmount
   * @return paymentAmount
   */
  @javax.annotation.Nullable
  public String getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(@javax.annotation.Nullable String paymentAmount) {
    this.paymentAmount = paymentAmount;
  }


  public PaymentLifeCycle paymentLocalAmount(@javax.annotation.Nullable String paymentLocalAmount) {
    this.paymentLocalAmount = paymentLocalAmount;
    return this;
  }

  /**
   * Get paymentLocalAmount
   * @return paymentLocalAmount
   */
  @javax.annotation.Nullable
  public String getPaymentLocalAmount() {
    return paymentLocalAmount;
  }

  public void setPaymentLocalAmount(@javax.annotation.Nullable String paymentLocalAmount) {
    this.paymentLocalAmount = paymentLocalAmount;
  }


  public PaymentLifeCycle paymentCurrency(@javax.annotation.Nullable String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
    return this;
  }

  /**
   * Get paymentCurrency
   * @return paymentCurrency
   */
  @javax.annotation.Nullable
  public String getPaymentCurrency() {
    return paymentCurrency;
  }

  public void setPaymentCurrency(@javax.annotation.Nullable String paymentCurrency) {
    this.paymentCurrency = paymentCurrency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLifeCycle paymentLifeCycle = (PaymentLifeCycle) o;
    return Objects.equals(this.authorizationIssuerTime, paymentLifeCycle.authorizationIssuerTime) &&
        Objects.equals(this.valueDate, paymentLifeCycle.valueDate) &&
        Objects.equals(this.paymentAmount, paymentLifeCycle.paymentAmount) &&
        Objects.equals(this.paymentLocalAmount, paymentLifeCycle.paymentLocalAmount) &&
        Objects.equals(this.paymentCurrency, paymentLifeCycle.paymentCurrency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationIssuerTime, valueDate, paymentAmount, paymentLocalAmount, paymentCurrency);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLifeCycle {\n");
    sb.append("    authorizationIssuerTime: ").append(toIndentedString(authorizationIssuerTime)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    paymentLocalAmount: ").append(toIndentedString(paymentLocalAmount)).append("\n");
    sb.append("    paymentCurrency: ").append(toIndentedString(paymentCurrency)).append("\n");
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
    openapiFields.add("authorizationIssuerTime");
    openapiFields.add("valueDate");
    openapiFields.add("paymentAmount");
    openapiFields.add("paymentLocalAmount");
    openapiFields.add("paymentCurrency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PaymentLifeCycle
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PaymentLifeCycle.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentLifeCycle is not found in the empty JSON string", PaymentLifeCycle.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PaymentLifeCycle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PaymentLifeCycle` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("authorizationIssuerTime") != null && !jsonObj.get("authorizationIssuerTime").isJsonNull()) && !jsonObj.get("authorizationIssuerTime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorizationIssuerTime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorizationIssuerTime").toString()));
      }
      if ((jsonObj.get("valueDate") != null && !jsonObj.get("valueDate").isJsonNull()) && !jsonObj.get("valueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueDate").toString()));
      }
      if ((jsonObj.get("paymentAmount") != null && !jsonObj.get("paymentAmount").isJsonNull()) && !jsonObj.get("paymentAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentAmount").toString()));
      }
      if ((jsonObj.get("paymentLocalAmount") != null && !jsonObj.get("paymentLocalAmount").isJsonNull()) && !jsonObj.get("paymentLocalAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentLocalAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentLocalAmount").toString()));
      }
      if ((jsonObj.get("paymentCurrency") != null && !jsonObj.get("paymentCurrency").isJsonNull()) && !jsonObj.get("paymentCurrency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `paymentCurrency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("paymentCurrency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentLifeCycle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentLifeCycle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentLifeCycle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentLifeCycle.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentLifeCycle>() {
           @Override
           public void write(JsonWriter out, PaymentLifeCycle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PaymentLifeCycle read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PaymentLifeCycle given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PaymentLifeCycle
   * @throws IOException if the JSON string is invalid with respect to PaymentLifeCycle
   */
  public static PaymentLifeCycle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentLifeCycle.class);
  }

  /**
   * Convert an instance of PaymentLifeCycle to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

