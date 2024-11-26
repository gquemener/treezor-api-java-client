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
 * DigitalizedCardsDeactivateDigitalizedCardResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class DigitalizedCardsDeactivateDigitalizedCardResponse {
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

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  @javax.annotation.Nullable
  private String createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  @javax.annotation.Nullable
  private String modifiedDate;

  public DigitalizedCardsDeactivateDigitalizedCardResponse() {
  }

  public DigitalizedCardsDeactivateDigitalizedCardResponse id(@javax.annotation.Nullable String id) {
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


  public DigitalizedCardsDeactivateDigitalizedCardResponse cardId(@javax.annotation.Nullable String cardId) {
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


  public DigitalizedCardsDeactivateDigitalizedCardResponse status(@javax.annotation.Nullable String status) {
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


  public DigitalizedCardsDeactivateDigitalizedCardResponse createdDate(@javax.annotation.Nullable String createdDate) {
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


  public DigitalizedCardsDeactivateDigitalizedCardResponse modifiedDate(@javax.annotation.Nullable String modifiedDate) {
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
    DigitalizedCardsDeactivateDigitalizedCardResponse digitalizedCardsDeactivateDigitalizedCardResponse = (DigitalizedCardsDeactivateDigitalizedCardResponse) o;
    return Objects.equals(this.id, digitalizedCardsDeactivateDigitalizedCardResponse.id) &&
        Objects.equals(this.cardId, digitalizedCardsDeactivateDigitalizedCardResponse.cardId) &&
        Objects.equals(this.status, digitalizedCardsDeactivateDigitalizedCardResponse.status) &&
        Objects.equals(this.createdDate, digitalizedCardsDeactivateDigitalizedCardResponse.createdDate) &&
        Objects.equals(this.modifiedDate, digitalizedCardsDeactivateDigitalizedCardResponse.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardId, status, createdDate, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalizedCardsDeactivateDigitalizedCardResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cardId: ").append(toIndentedString(cardId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DigitalizedCardsDeactivateDigitalizedCardResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DigitalizedCardsDeactivateDigitalizedCardResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DigitalizedCardsDeactivateDigitalizedCardResponse is not found in the empty JSON string", DigitalizedCardsDeactivateDigitalizedCardResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DigitalizedCardsDeactivateDigitalizedCardResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DigitalizedCardsDeactivateDigitalizedCardResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
       if (!DigitalizedCardsDeactivateDigitalizedCardResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DigitalizedCardsDeactivateDigitalizedCardResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DigitalizedCardsDeactivateDigitalizedCardResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DigitalizedCardsDeactivateDigitalizedCardResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DigitalizedCardsDeactivateDigitalizedCardResponse>() {
           @Override
           public void write(JsonWriter out, DigitalizedCardsDeactivateDigitalizedCardResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DigitalizedCardsDeactivateDigitalizedCardResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DigitalizedCardsDeactivateDigitalizedCardResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DigitalizedCardsDeactivateDigitalizedCardResponse
   * @throws IOException if the JSON string is invalid with respect to DigitalizedCardsDeactivateDigitalizedCardResponse
   */
  public static DigitalizedCardsDeactivateDigitalizedCardResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DigitalizedCardsDeactivateDigitalizedCardResponse.class);
  }

  /**
   * Convert an instance of DigitalizedCardsDeactivateDigitalizedCardResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

