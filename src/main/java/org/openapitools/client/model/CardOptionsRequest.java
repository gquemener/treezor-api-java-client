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
 * CardOptionsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class CardOptionsRequest {
  public static final String SERIALIZED_NAME_FOREIGN = "foreign";
  @SerializedName(SERIALIZED_NAME_FOREIGN)
  @javax.annotation.Nonnull
  private Integer foreign;

  public static final String SERIALIZED_NAME_ONLINE = "online";
  @SerializedName(SERIALIZED_NAME_ONLINE)
  @javax.annotation.Nonnull
  private Integer online;

  public static final String SERIALIZED_NAME_ATM = "atm";
  @SerializedName(SERIALIZED_NAME_ATM)
  @javax.annotation.Nonnull
  private Integer atm;

  public static final String SERIALIZED_NAME_NFC = "nfc";
  @SerializedName(SERIALIZED_NAME_NFC)
  @javax.annotation.Nonnull
  private Integer nfc;

  public static final String SERIALIZED_NAME_ACCESS_TAG = "accessTag";
  @SerializedName(SERIALIZED_NAME_ACCESS_TAG)
  @javax.annotation.Nullable
  private String accessTag;

  public CardOptionsRequest() {
  }

  public CardOptionsRequest foreign(@javax.annotation.Nonnull Integer foreign) {
    this.foreign = foreign;
    return this;
  }

  /**
   * Whether or not the card is usable abroad.
   * @return foreign
   */
  @javax.annotation.Nonnull
  public Integer getForeign() {
    return foreign;
  }

  public void setForeign(@javax.annotation.Nonnull Integer foreign) {
    this.foreign = foreign;
  }


  public CardOptionsRequest online(@javax.annotation.Nonnull Integer online) {
    this.online = online;
    return this;
  }

  /**
   * Whether or not the card is usable online.
   * @return online
   */
  @javax.annotation.Nonnull
  public Integer getOnline() {
    return online;
  }

  public void setOnline(@javax.annotation.Nonnull Integer online) {
    this.online = online;
  }


  public CardOptionsRequest atm(@javax.annotation.Nonnull Integer atm) {
    this.atm = atm;
    return this;
  }

  /**
   * Whether or not the card is usable on ATMs (withdrawal).
   * @return atm
   */
  @javax.annotation.Nonnull
  public Integer getAtm() {
    return atm;
  }

  public void setAtm(@javax.annotation.Nonnull Integer atm) {
    this.atm = atm;
  }


  public CardOptionsRequest nfc(@javax.annotation.Nonnull Integer nfc) {
    this.nfc = nfc;
    return this;
  }

  /**
   * Whether or not the card can be used for contactless payments.
   * @return nfc
   */
  @javax.annotation.Nonnull
  public Integer getNfc() {
    return nfc;
  }

  public void setNfc(@javax.annotation.Nonnull Integer nfc) {
    this.nfc = nfc;
  }


  public CardOptionsRequest accessTag(@javax.annotation.Nullable String accessTag) {
    this.accessTag = accessTag;
    return this;
  }

  /**
   * A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). Max length: 250 characters. 
   * @return accessTag
   */
  @javax.annotation.Nullable
  public String getAccessTag() {
    return accessTag;
  }

  public void setAccessTag(@javax.annotation.Nullable String accessTag) {
    this.accessTag = accessTag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardOptionsRequest cardOptionsRequest = (CardOptionsRequest) o;
    return Objects.equals(this.foreign, cardOptionsRequest.foreign) &&
        Objects.equals(this.online, cardOptionsRequest.online) &&
        Objects.equals(this.atm, cardOptionsRequest.atm) &&
        Objects.equals(this.nfc, cardOptionsRequest.nfc) &&
        Objects.equals(this.accessTag, cardOptionsRequest.accessTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(foreign, online, atm, nfc, accessTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardOptionsRequest {\n");
    sb.append("    foreign: ").append(toIndentedString(foreign)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    atm: ").append(toIndentedString(atm)).append("\n");
    sb.append("    nfc: ").append(toIndentedString(nfc)).append("\n");
    sb.append("    accessTag: ").append(toIndentedString(accessTag)).append("\n");
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
    openapiFields.add("foreign");
    openapiFields.add("online");
    openapiFields.add("atm");
    openapiFields.add("nfc");
    openapiFields.add("accessTag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("foreign");
    openapiRequiredFields.add("online");
    openapiRequiredFields.add("atm");
    openapiRequiredFields.add("nfc");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CardOptionsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CardOptionsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardOptionsRequest is not found in the empty JSON string", CardOptionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CardOptionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CardOptionsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CardOptionsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("accessTag") != null && !jsonObj.get("accessTag").isJsonNull()) && !jsonObj.get("accessTag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accessTag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accessTag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardOptionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardOptionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardOptionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardOptionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CardOptionsRequest>() {
           @Override
           public void write(JsonWriter out, CardOptionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CardOptionsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CardOptionsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CardOptionsRequest
   * @throws IOException if the JSON string is invalid with respect to CardOptionsRequest
   */
  public static CardOptionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardOptionsRequest.class);
  }

  /**
   * Convert an instance of CardOptionsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

