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
 * GetCoCardTransactions200ResponseCursor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class GetCoCardTransactions200ResponseCursor {
  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  @javax.annotation.Nullable
  private String current;

  public static final String SERIALIZED_NAME_PREV = "prev";
  @SerializedName(SERIALIZED_NAME_PREV)
  @javax.annotation.Nullable
  private String prev;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  @javax.annotation.Nullable
  private String next;

  public GetCoCardTransactions200ResponseCursor() {
  }

  public GetCoCardTransactions200ResponseCursor current(@javax.annotation.Nullable String current) {
    this.current = current;
    return this;
  }

  /**
   * Get current
   * @return current
   */
  @javax.annotation.Nullable
  public String getCurrent() {
    return current;
  }

  public void setCurrent(@javax.annotation.Nullable String current) {
    this.current = current;
  }


  public GetCoCardTransactions200ResponseCursor prev(@javax.annotation.Nullable String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * Get prev
   * @return prev
   */
  @javax.annotation.Nullable
  public String getPrev() {
    return prev;
  }

  public void setPrev(@javax.annotation.Nullable String prev) {
    this.prev = prev;
  }


  public GetCoCardTransactions200ResponseCursor next(@javax.annotation.Nullable String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
   */
  @javax.annotation.Nullable
  public String getNext() {
    return next;
  }

  public void setNext(@javax.annotation.Nullable String next) {
    this.next = next;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCoCardTransactions200ResponseCursor getCoCardTransactions200ResponseCursor = (GetCoCardTransactions200ResponseCursor) o;
    return Objects.equals(this.current, getCoCardTransactions200ResponseCursor.current) &&
        Objects.equals(this.prev, getCoCardTransactions200ResponseCursor.prev) &&
        Objects.equals(this.next, getCoCardTransactions200ResponseCursor.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, prev, next);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCoCardTransactions200ResponseCursor {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
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
    openapiFields.add("current");
    openapiFields.add("prev");
    openapiFields.add("next");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetCoCardTransactions200ResponseCursor
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetCoCardTransactions200ResponseCursor.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetCoCardTransactions200ResponseCursor is not found in the empty JSON string", GetCoCardTransactions200ResponseCursor.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetCoCardTransactions200ResponseCursor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetCoCardTransactions200ResponseCursor` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("current") != null && !jsonObj.get("current").isJsonNull()) && !jsonObj.get("current").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current").toString()));
      }
      if ((jsonObj.get("prev") != null && !jsonObj.get("prev").isJsonNull()) && !jsonObj.get("prev").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prev` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prev").toString()));
      }
      if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull()) && !jsonObj.get("next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetCoCardTransactions200ResponseCursor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetCoCardTransactions200ResponseCursor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetCoCardTransactions200ResponseCursor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetCoCardTransactions200ResponseCursor.class));

       return (TypeAdapter<T>) new TypeAdapter<GetCoCardTransactions200ResponseCursor>() {
           @Override
           public void write(JsonWriter out, GetCoCardTransactions200ResponseCursor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetCoCardTransactions200ResponseCursor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetCoCardTransactions200ResponseCursor given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetCoCardTransactions200ResponseCursor
   * @throws IOException if the JSON string is invalid with respect to GetCoCardTransactions200ResponseCursor
   */
  public static GetCoCardTransactions200ResponseCursor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetCoCardTransactions200ResponseCursor.class);
  }

  /**
   * Convert an instance of GetCoCardTransactions200ResponseCursor to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

