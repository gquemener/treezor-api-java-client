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
 * UpdateBlockStatusRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class UpdateBlockStatusRequest {
  public static final String SERIALIZED_NAME_LOCK_STATUS = "lockStatus";
  @SerializedName(SERIALIZED_NAME_LOCK_STATUS)
  @javax.annotation.Nonnull
  private Integer lockStatus;

  public static final String SERIALIZED_NAME_ACCESS_TAG = "accessTag";
  @SerializedName(SERIALIZED_NAME_ACCESS_TAG)
  @javax.annotation.Nullable
  private String accessTag;

  public UpdateBlockStatusRequest() {
  }

  public UpdateBlockStatusRequest lockStatus(@javax.annotation.Nonnull Integer lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

  /**
   * The Status of the card, indicating whether it is locked, lost, or destroyed for instance. While this field is an integer, it returns a plaintext value. See the full list of &#x60;lockStatus&#x60;in the [Block a Card](/guide/cards/modification.html#status) article. 
   * @return lockStatus
   */
  @javax.annotation.Nonnull
  public Integer getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(@javax.annotation.Nonnull Integer lockStatus) {
    this.lockStatus = lockStatus;
  }


  public UpdateBlockStatusRequest accessTag(@javax.annotation.Nullable String accessTag) {
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
    UpdateBlockStatusRequest updateBlockStatusRequest = (UpdateBlockStatusRequest) o;
    return Objects.equals(this.lockStatus, updateBlockStatusRequest.lockStatus) &&
        Objects.equals(this.accessTag, updateBlockStatusRequest.accessTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockStatus, accessTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBlockStatusRequest {\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
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
    openapiFields.add("lockStatus");
    openapiFields.add("accessTag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lockStatus");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateBlockStatusRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateBlockStatusRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateBlockStatusRequest is not found in the empty JSON string", UpdateBlockStatusRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateBlockStatusRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateBlockStatusRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateBlockStatusRequest.openapiRequiredFields) {
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
       if (!UpdateBlockStatusRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateBlockStatusRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateBlockStatusRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateBlockStatusRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateBlockStatusRequest>() {
           @Override
           public void write(JsonWriter out, UpdateBlockStatusRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateBlockStatusRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateBlockStatusRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateBlockStatusRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateBlockStatusRequest
   */
  public static UpdateBlockStatusRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateBlockStatusRequest.class);
  }

  /**
   * Convert an instance of UpdateBlockStatusRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

