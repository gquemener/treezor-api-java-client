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
 * ChargebackResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class ChargebackResponse {
  public static final String SERIALIZED_NAME_CHARGEBACK_ID = "chargebackId";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_ID)
  @javax.annotation.Nullable
  private String chargebackId;

  public static final String SERIALIZED_NAME_CHARGEBACK_TAG = "chargebackTag";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_TAG)
  @javax.annotation.Nullable
  private String chargebackTag = "null";

  public static final String SERIALIZED_NAME_CHARGEBACK_STATUS = "chargebackStatus";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_STATUS)
  @javax.annotation.Nullable
  private String chargebackStatus;

  public static final String SERIALIZED_NAME_CHARGEBACK_DATE = "chargebackDate";
  @SerializedName(SERIALIZED_NAME_CHARGEBACK_DATE)
  @javax.annotation.Nullable
  private String chargebackDate;

  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  @javax.annotation.Nullable
  private String walletId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  @javax.annotation.Nullable
  private String createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  @javax.annotation.Nullable
  private String modifiedDate;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  @javax.annotation.Nullable
  private String profile;

  public ChargebackResponse() {
  }

  public ChargebackResponse chargebackId(@javax.annotation.Nullable String chargebackId) {
    this.chargebackId = chargebackId;
    return this;
  }

  /**
   * The universally unique identifier (UUID) of the chargeback
   * @return chargebackId
   */
  @javax.annotation.Nullable
  public String getChargebackId() {
    return chargebackId;
  }

  public void setChargebackId(@javax.annotation.Nullable String chargebackId) {
    this.chargebackId = chargebackId;
  }


  public ChargebackResponse chargebackTag(@javax.annotation.Nullable String chargebackTag) {
    this.chargebackTag = chargebackTag;
    return this;
  }

  /**
   * Get chargebackTag
   * @return chargebackTag
   */
  @javax.annotation.Nullable
  public String getChargebackTag() {
    return chargebackTag;
  }

  public void setChargebackTag(@javax.annotation.Nullable String chargebackTag) {
    this.chargebackTag = chargebackTag;
  }


  public ChargebackResponse chargebackStatus(@javax.annotation.Nullable String chargebackStatus) {
    this.chargebackStatus = chargebackStatus;
    return this;
  }

  /**
   * The status of the chargeback.
   * @return chargebackStatus
   */
  @javax.annotation.Nullable
  public String getChargebackStatus() {
    return chargebackStatus;
  }

  public void setChargebackStatus(@javax.annotation.Nullable String chargebackStatus) {
    this.chargebackStatus = chargebackStatus;
  }


  public ChargebackResponse chargebackDate(@javax.annotation.Nullable String chargebackDate) {
    this.chargebackDate = chargebackDate;
    return this;
  }

  /**
   * The date of the chargeback
   * @return chargebackDate
   */
  @javax.annotation.Nullable
  public String getChargebackDate() {
    return chargebackDate;
  }

  public void setChargebackDate(@javax.annotation.Nullable String chargebackDate) {
    this.chargebackDate = chargebackDate;
  }


  public ChargebackResponse walletId(@javax.annotation.Nullable String walletId) {
    this.walletId = walletId;
    return this;
  }

  /**
   * The identifier of the wallet to be debited
   * @return walletId
   */
  @javax.annotation.Nullable
  public String getWalletId() {
    return walletId;
  }

  public void setWalletId(@javax.annotation.Nullable String walletId) {
    this.walletId = walletId;
  }


  public ChargebackResponse amount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount to be chargebacked
   * @return amount
   */
  @javax.annotation.Nullable
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable BigDecimal amount) {
    this.amount = amount;
  }


  public ChargebackResponse currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Base currency for the chargeback.  This three-character currency code must comply with ISO-4217
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public ChargebackResponse createdDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Creation date of the chargeback
   * @return createdDate
   */
  @javax.annotation.Nullable
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
  }


  public ChargebackResponse modifiedDate(@javax.annotation.Nullable String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Last updated date of the chargeback
   * @return modifiedDate
   */
  @javax.annotation.Nullable
  public String getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(@javax.annotation.Nullable String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public ChargebackResponse profile(@javax.annotation.Nullable String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * HiPay merchant identifier (mid)
   * @return profile
   */
  @javax.annotation.Nullable
  public String getProfile() {
    return profile;
  }

  public void setProfile(@javax.annotation.Nullable String profile) {
    this.profile = profile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargebackResponse chargebackResponse = (ChargebackResponse) o;
    return Objects.equals(this.chargebackId, chargebackResponse.chargebackId) &&
        Objects.equals(this.chargebackTag, chargebackResponse.chargebackTag) &&
        Objects.equals(this.chargebackStatus, chargebackResponse.chargebackStatus) &&
        Objects.equals(this.chargebackDate, chargebackResponse.chargebackDate) &&
        Objects.equals(this.walletId, chargebackResponse.walletId) &&
        Objects.equals(this.amount, chargebackResponse.amount) &&
        Objects.equals(this.currency, chargebackResponse.currency) &&
        Objects.equals(this.createdDate, chargebackResponse.createdDate) &&
        Objects.equals(this.modifiedDate, chargebackResponse.modifiedDate) &&
        Objects.equals(this.profile, chargebackResponse.profile);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargebackId, chargebackTag, chargebackStatus, chargebackDate, walletId, amount, currency, createdDate, modifiedDate, profile);
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
    sb.append("class ChargebackResponse {\n");
    sb.append("    chargebackId: ").append(toIndentedString(chargebackId)).append("\n");
    sb.append("    chargebackTag: ").append(toIndentedString(chargebackTag)).append("\n");
    sb.append("    chargebackStatus: ").append(toIndentedString(chargebackStatus)).append("\n");
    sb.append("    chargebackDate: ").append(toIndentedString(chargebackDate)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
    openapiFields.add("chargebackId");
    openapiFields.add("chargebackTag");
    openapiFields.add("chargebackStatus");
    openapiFields.add("chargebackDate");
    openapiFields.add("walletId");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("profile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChargebackResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChargebackResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChargebackResponse is not found in the empty JSON string", ChargebackResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChargebackResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChargebackResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chargebackId") != null && !jsonObj.get("chargebackId").isJsonNull()) && !jsonObj.get("chargebackId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargebackId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargebackId").toString()));
      }
      if ((jsonObj.get("chargebackTag") != null && !jsonObj.get("chargebackTag").isJsonNull()) && !jsonObj.get("chargebackTag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargebackTag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargebackTag").toString()));
      }
      if ((jsonObj.get("chargebackStatus") != null && !jsonObj.get("chargebackStatus").isJsonNull()) && !jsonObj.get("chargebackStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargebackStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargebackStatus").toString()));
      }
      if ((jsonObj.get("chargebackDate") != null && !jsonObj.get("chargebackDate").isJsonNull()) && !jsonObj.get("chargebackDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargebackDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargebackDate").toString()));
      }
      if ((jsonObj.get("walletId") != null && !jsonObj.get("walletId").isJsonNull()) && !jsonObj.get("walletId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletId").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) && !jsonObj.get("createdDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdDate").toString()));
      }
      if ((jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) && !jsonObj.get("modifiedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedDate").toString()));
      }
      if ((jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull()) && !jsonObj.get("profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChargebackResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChargebackResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChargebackResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChargebackResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ChargebackResponse>() {
           @Override
           public void write(JsonWriter out, ChargebackResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChargebackResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ChargebackResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChargebackResponse
   * @throws IOException if the JSON string is invalid with respect to ChargebackResponse
   */
  public static ChargebackResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChargebackResponse.class);
  }

  /**
   * Convert an instance of ChargebackResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

