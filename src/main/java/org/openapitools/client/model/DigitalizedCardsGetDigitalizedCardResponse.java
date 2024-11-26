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
 * DigitalizedCardsGetDigitalizedCardResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class DigitalizedCardsGetDigitalizedCardResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_CARD_ID = "cardId";
  @SerializedName(SERIALIZED_NAME_CARD_ID)
  @javax.annotation.Nullable
  private String cardId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private String status;

  public static final String SERIALIZED_NAME_WALLET_PROVIDER = "walletProvider";
  @SerializedName(SERIALIZED_NAME_WALLET_PROVIDER)
  @javax.annotation.Nullable
  private String walletProvider;

  public static final String SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE = "tokenUniqueReference";
  @SerializedName(SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE)
  @javax.annotation.Nullable
  private String tokenUniqueReference;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchantName";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  @javax.annotation.Nullable
  private String merchantName;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "deviceType";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  @javax.annotation.Nullable
  private String deviceType;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  @javax.annotation.Nullable
  private String deviceId;

  public static final String SERIALIZED_NAME_DEVICE_NAME = "deviceName";
  @SerializedName(SERIALIZED_NAME_DEVICE_NAME)
  @javax.annotation.Nullable
  private String deviceName;

  public static final String SERIALIZED_NAME_ACTIVATION_METHOD = "activationMethod";
  @SerializedName(SERIALIZED_NAME_ACTIVATION_METHOD)
  @javax.annotation.Nullable
  private String activationMethod;

  public static final String SERIALIZED_NAME_TOKEN_SERVICE_PROVIDER = "tokenServiceProvider";
  @SerializedName(SERIALIZED_NAME_TOKEN_SERVICE_PROVIDER)
  @javax.annotation.Nullable
  private String tokenServiceProvider;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  @javax.annotation.Nullable
  private String expirationDate;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  @javax.annotation.Nullable
  private String createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  @javax.annotation.Nullable
  private String modifiedDate;

  public DigitalizedCardsGetDigitalizedCardResponse() {
  }

  public DigitalizedCardsGetDigitalizedCardResponse id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public DigitalizedCardsGetDigitalizedCardResponse cardId(@javax.annotation.Nullable String cardId) {
    this.cardId = cardId;
    return this;
  }

  /**
   * Get cardId
   * @return cardId
   */
  @javax.annotation.Nullable
  public String getCardId() {
    return cardId;
  }

  public void setCardId(@javax.annotation.Nullable String cardId) {
    this.cardId = cardId;
  }


  public DigitalizedCardsGetDigitalizedCardResponse status(@javax.annotation.Nullable String status) {
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


  public DigitalizedCardsGetDigitalizedCardResponse walletProvider(@javax.annotation.Nullable String walletProvider) {
    this.walletProvider = walletProvider;
    return this;
  }

  /**
   * Get walletProvider
   * @return walletProvider
   */
  @javax.annotation.Nullable
  public String getWalletProvider() {
    return walletProvider;
  }

  public void setWalletProvider(@javax.annotation.Nullable String walletProvider) {
    this.walletProvider = walletProvider;
  }


  public DigitalizedCardsGetDigitalizedCardResponse tokenUniqueReference(@javax.annotation.Nullable String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
    return this;
  }

  /**
   * Get tokenUniqueReference
   * @return tokenUniqueReference
   */
  @javax.annotation.Nullable
  public String getTokenUniqueReference() {
    return tokenUniqueReference;
  }

  public void setTokenUniqueReference(@javax.annotation.Nullable String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
  }


  public DigitalizedCardsGetDigitalizedCardResponse merchantName(@javax.annotation.Nullable String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * Get merchantName
   * @return merchantName
   */
  @javax.annotation.Nullable
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(@javax.annotation.Nullable String merchantName) {
    this.merchantName = merchantName;
  }


  public DigitalizedCardsGetDigitalizedCardResponse deviceType(@javax.annotation.Nullable String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Get deviceType
   * @return deviceType
   */
  @javax.annotation.Nullable
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(@javax.annotation.Nullable String deviceType) {
    this.deviceType = deviceType;
  }


  public DigitalizedCardsGetDigitalizedCardResponse deviceId(@javax.annotation.Nullable String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

  /**
   * Get deviceId
   * @return deviceId
   */
  @javax.annotation.Nullable
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(@javax.annotation.Nullable String deviceId) {
    this.deviceId = deviceId;
  }


  public DigitalizedCardsGetDigitalizedCardResponse deviceName(@javax.annotation.Nullable String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * Get deviceName
   * @return deviceName
   */
  @javax.annotation.Nullable
  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(@javax.annotation.Nullable String deviceName) {
    this.deviceName = deviceName;
  }


  public DigitalizedCardsGetDigitalizedCardResponse activationMethod(@javax.annotation.Nullable String activationMethod) {
    this.activationMethod = activationMethod;
    return this;
  }

  /**
   * Get activationMethod
   * @return activationMethod
   */
  @javax.annotation.Nullable
  public String getActivationMethod() {
    return activationMethod;
  }

  public void setActivationMethod(@javax.annotation.Nullable String activationMethod) {
    this.activationMethod = activationMethod;
  }


  public DigitalizedCardsGetDigitalizedCardResponse tokenServiceProvider(@javax.annotation.Nullable String tokenServiceProvider) {
    this.tokenServiceProvider = tokenServiceProvider;
    return this;
  }

  /**
   * Get tokenServiceProvider
   * @return tokenServiceProvider
   */
  @javax.annotation.Nullable
  public String getTokenServiceProvider() {
    return tokenServiceProvider;
  }

  public void setTokenServiceProvider(@javax.annotation.Nullable String tokenServiceProvider) {
    this.tokenServiceProvider = tokenServiceProvider;
  }


  public DigitalizedCardsGetDigitalizedCardResponse expirationDate(@javax.annotation.Nullable String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
   */
  @javax.annotation.Nullable
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(@javax.annotation.Nullable String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public DigitalizedCardsGetDigitalizedCardResponse createdDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
   */
  @javax.annotation.Nullable
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
  }


  public DigitalizedCardsGetDigitalizedCardResponse modifiedDate(@javax.annotation.Nullable String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Get modifiedDate
   * @return modifiedDate
   */
  @javax.annotation.Nullable
  public String getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(@javax.annotation.Nullable String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalizedCardsGetDigitalizedCardResponse digitalizedCardsGetDigitalizedCardResponse = (DigitalizedCardsGetDigitalizedCardResponse) o;
    return Objects.equals(this.id, digitalizedCardsGetDigitalizedCardResponse.id) &&
        Objects.equals(this.cardId, digitalizedCardsGetDigitalizedCardResponse.cardId) &&
        Objects.equals(this.status, digitalizedCardsGetDigitalizedCardResponse.status) &&
        Objects.equals(this.walletProvider, digitalizedCardsGetDigitalizedCardResponse.walletProvider) &&
        Objects.equals(this.tokenUniqueReference, digitalizedCardsGetDigitalizedCardResponse.tokenUniqueReference) &&
        Objects.equals(this.merchantName, digitalizedCardsGetDigitalizedCardResponse.merchantName) &&
        Objects.equals(this.deviceType, digitalizedCardsGetDigitalizedCardResponse.deviceType) &&
        Objects.equals(this.deviceId, digitalizedCardsGetDigitalizedCardResponse.deviceId) &&
        Objects.equals(this.deviceName, digitalizedCardsGetDigitalizedCardResponse.deviceName) &&
        Objects.equals(this.activationMethod, digitalizedCardsGetDigitalizedCardResponse.activationMethod) &&
        Objects.equals(this.tokenServiceProvider, digitalizedCardsGetDigitalizedCardResponse.tokenServiceProvider) &&
        Objects.equals(this.expirationDate, digitalizedCardsGetDigitalizedCardResponse.expirationDate) &&
        Objects.equals(this.createdDate, digitalizedCardsGetDigitalizedCardResponse.createdDate) &&
        Objects.equals(this.modifiedDate, digitalizedCardsGetDigitalizedCardResponse.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardId, status, walletProvider, tokenUniqueReference, merchantName, deviceType, deviceId, deviceName, activationMethod, tokenServiceProvider, expirationDate, createdDate, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalizedCardsGetDigitalizedCardResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    walletProvider: ").append(toIndentedString(walletProvider)).append("\n");
    sb.append("    tokenUniqueReference: ").append(toIndentedString(tokenUniqueReference)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    activationMethod: ").append(toIndentedString(activationMethod)).append("\n");
    sb.append("    tokenServiceProvider: ").append(toIndentedString(tokenServiceProvider)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("cardId");
    openapiFields.add("status");
    openapiFields.add("walletProvider");
    openapiFields.add("tokenUniqueReference");
    openapiFields.add("merchantName");
    openapiFields.add("deviceType");
    openapiFields.add("deviceId");
    openapiFields.add("deviceName");
    openapiFields.add("activationMethod");
    openapiFields.add("tokenServiceProvider");
    openapiFields.add("expirationDate");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DigitalizedCardsGetDigitalizedCardResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DigitalizedCardsGetDigitalizedCardResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DigitalizedCardsGetDigitalizedCardResponse is not found in the empty JSON string", DigitalizedCardsGetDigitalizedCardResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DigitalizedCardsGetDigitalizedCardResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DigitalizedCardsGetDigitalizedCardResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("cardId") != null && !jsonObj.get("cardId").isJsonNull()) && !jsonObj.get("cardId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("walletProvider") != null && !jsonObj.get("walletProvider").isJsonNull()) && !jsonObj.get("walletProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletProvider").toString()));
      }
      if ((jsonObj.get("tokenUniqueReference") != null && !jsonObj.get("tokenUniqueReference").isJsonNull()) && !jsonObj.get("tokenUniqueReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenUniqueReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenUniqueReference").toString()));
      }
      if ((jsonObj.get("merchantName") != null && !jsonObj.get("merchantName").isJsonNull()) && !jsonObj.get("merchantName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantName").toString()));
      }
      if ((jsonObj.get("deviceType") != null && !jsonObj.get("deviceType").isJsonNull()) && !jsonObj.get("deviceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceType").toString()));
      }
      if ((jsonObj.get("deviceId") != null && !jsonObj.get("deviceId").isJsonNull()) && !jsonObj.get("deviceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceId").toString()));
      }
      if ((jsonObj.get("deviceName") != null && !jsonObj.get("deviceName").isJsonNull()) && !jsonObj.get("deviceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceName").toString()));
      }
      if ((jsonObj.get("activationMethod") != null && !jsonObj.get("activationMethod").isJsonNull()) && !jsonObj.get("activationMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activationMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activationMethod").toString()));
      }
      if ((jsonObj.get("tokenServiceProvider") != null && !jsonObj.get("tokenServiceProvider").isJsonNull()) && !jsonObj.get("tokenServiceProvider").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tokenServiceProvider` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tokenServiceProvider").toString()));
      }
      if ((jsonObj.get("expirationDate") != null && !jsonObj.get("expirationDate").isJsonNull()) && !jsonObj.get("expirationDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expirationDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expirationDate").toString()));
      }
      if ((jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) && !jsonObj.get("createdDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdDate").toString()));
      }
      if ((jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) && !jsonObj.get("modifiedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DigitalizedCardsGetDigitalizedCardResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigitalizedCardsGetDigitalizedCardResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigitalizedCardsGetDigitalizedCardResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigitalizedCardsGetDigitalizedCardResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DigitalizedCardsGetDigitalizedCardResponse>() {
           @Override
           public void write(JsonWriter out, DigitalizedCardsGetDigitalizedCardResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigitalizedCardsGetDigitalizedCardResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DigitalizedCardsGetDigitalizedCardResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DigitalizedCardsGetDigitalizedCardResponse
   * @throws IOException if the JSON string is invalid with respect to DigitalizedCardsGetDigitalizedCardResponse
   */
  public static DigitalizedCardsGetDigitalizedCardResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigitalizedCardsGetDigitalizedCardResponse.class);
  }

  /**
   * Convert an instance of DigitalizedCardsGetDigitalizedCardResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

