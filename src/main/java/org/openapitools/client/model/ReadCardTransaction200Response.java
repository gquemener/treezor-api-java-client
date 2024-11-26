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
import org.openapitools.client.model.CardtransactionInner;

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
 * ReadCardTransaction200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class ReadCardTransaction200Response {
  public static final String SERIALIZED_NAME_CARDTRANSACTIONS = "cardtransactions";
  @SerializedName(SERIALIZED_NAME_CARDTRANSACTIONS)
  @javax.annotation.Nullable
  private List<CardtransactionInner> cardtransactions = new ArrayList<>();

  public ReadCardTransaction200Response() {
  }

  public ReadCardTransaction200Response cardtransactions(@javax.annotation.Nullable List<CardtransactionInner> cardtransactions) {
    this.cardtransactions = cardtransactions;
    return this;
  }

  public ReadCardTransaction200Response addCardtransactionsItem(CardtransactionInner cardtransactionsItem) {
    if (this.cardtransactions == null) {
      this.cardtransactions = new ArrayList<>();
    }
    this.cardtransactions.add(cardtransactionsItem);
    return this;
  }

  /**
   * Get cardtransactions
   * @return cardtransactions
   */
  @javax.annotation.Nullable
  public List<CardtransactionInner> getCardtransactions() {
    return cardtransactions;
  }

  public void setCardtransactions(@javax.annotation.Nullable List<CardtransactionInner> cardtransactions) {
    this.cardtransactions = cardtransactions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReadCardTransaction200Response readCardTransaction200Response = (ReadCardTransaction200Response) o;
    return Objects.equals(this.cardtransactions, readCardTransaction200Response.cardtransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardtransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReadCardTransaction200Response {\n");
    sb.append("    cardtransactions: ").append(toIndentedString(cardtransactions)).append("\n");
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
    openapiFields.add("cardtransactions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReadCardTransaction200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReadCardTransaction200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReadCardTransaction200Response is not found in the empty JSON string", ReadCardTransaction200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReadCardTransaction200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReadCardTransaction200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("cardtransactions") != null && !jsonObj.get("cardtransactions").isJsonNull()) {
        JsonArray jsonArraycardtransactions = jsonObj.getAsJsonArray("cardtransactions");
        if (jsonArraycardtransactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("cardtransactions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `cardtransactions` to be an array in the JSON string but got `%s`", jsonObj.get("cardtransactions").toString()));
          }

          // validate the optional field `cardtransactions` (array)
          for (int i = 0; i < jsonArraycardtransactions.size(); i++) {
            CardtransactionInner.validateJsonElement(jsonArraycardtransactions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReadCardTransaction200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReadCardTransaction200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReadCardTransaction200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReadCardTransaction200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ReadCardTransaction200Response>() {
           @Override
           public void write(JsonWriter out, ReadCardTransaction200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReadCardTransaction200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReadCardTransaction200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReadCardTransaction200Response
   * @throws IOException if the JSON string is invalid with respect to ReadCardTransaction200Response
   */
  public static ReadCardTransaction200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReadCardTransaction200Response.class);
  }

  /**
   * Convert an instance of ReadCardTransaction200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

