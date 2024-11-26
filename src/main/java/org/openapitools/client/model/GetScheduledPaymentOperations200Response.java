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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.GetCoCardTransactions200ResponseCursor;
import org.openapitools.client.model.GetScheduledPaymentOperations200ResponsePaymentsInner;

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
 * GetScheduledPaymentOperations200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class GetScheduledPaymentOperations200Response {
  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  @javax.annotation.Nullable
  private GetCoCardTransactions200ResponseCursor cursor;

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  @javax.annotation.Nullable
  private List<GetScheduledPaymentOperations200ResponsePaymentsInner> payments = new ArrayList<>();

  public GetScheduledPaymentOperations200Response() {
  }

  public GetScheduledPaymentOperations200Response cursor(@javax.annotation.Nullable GetCoCardTransactions200ResponseCursor cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * Get cursor
   * @return cursor
   */
  @javax.annotation.Nullable
  public GetCoCardTransactions200ResponseCursor getCursor() {
    return cursor;
  }

  public void setCursor(@javax.annotation.Nullable GetCoCardTransactions200ResponseCursor cursor) {
    this.cursor = cursor;
  }


  public GetScheduledPaymentOperations200Response payments(@javax.annotation.Nullable List<GetScheduledPaymentOperations200ResponsePaymentsInner> payments) {
    this.payments = payments;
    return this;
  }

  public GetScheduledPaymentOperations200Response addPaymentsItem(GetScheduledPaymentOperations200ResponsePaymentsInner paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

  /**
   * Get payments
   * @return payments
   */
  @javax.annotation.Nullable
  public List<GetScheduledPaymentOperations200ResponsePaymentsInner> getPayments() {
    return payments;
  }

  public void setPayments(@javax.annotation.Nullable List<GetScheduledPaymentOperations200ResponsePaymentsInner> payments) {
    this.payments = payments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetScheduledPaymentOperations200Response getScheduledPaymentOperations200Response = (GetScheduledPaymentOperations200Response) o;
    return Objects.equals(this.cursor, getScheduledPaymentOperations200Response.cursor) &&
        Objects.equals(this.payments, getScheduledPaymentOperations200Response.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, payments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetScheduledPaymentOperations200Response {\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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
    openapiFields.add("cursor");
    openapiFields.add("payments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetScheduledPaymentOperations200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetScheduledPaymentOperations200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetScheduledPaymentOperations200Response is not found in the empty JSON string", GetScheduledPaymentOperations200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetScheduledPaymentOperations200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetScheduledPaymentOperations200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `cursor`
      if (jsonObj.get("cursor") != null && !jsonObj.get("cursor").isJsonNull()) {
        GetCoCardTransactions200ResponseCursor.validateJsonElement(jsonObj.get("cursor"));
      }
      if (jsonObj.get("payments") != null && !jsonObj.get("payments").isJsonNull()) {
        JsonArray jsonArraypayments = jsonObj.getAsJsonArray("payments");
        if (jsonArraypayments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("payments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `payments` to be an array in the JSON string but got `%s`", jsonObj.get("payments").toString()));
          }

          // validate the optional field `payments` (array)
          for (int i = 0; i < jsonArraypayments.size(); i++) {
            GetScheduledPaymentOperations200ResponsePaymentsInner.validateJsonElement(jsonArraypayments.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetScheduledPaymentOperations200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetScheduledPaymentOperations200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetScheduledPaymentOperations200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetScheduledPaymentOperations200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetScheduledPaymentOperations200Response>() {
           @Override
           public void write(JsonWriter out, GetScheduledPaymentOperations200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetScheduledPaymentOperations200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetScheduledPaymentOperations200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetScheduledPaymentOperations200Response
   * @throws IOException if the JSON string is invalid with respect to GetScheduledPaymentOperations200Response
   */
  public static GetScheduledPaymentOperations200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetScheduledPaymentOperations200Response.class);
  }

  /**
   * Convert an instance of GetScheduledPaymentOperations200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

