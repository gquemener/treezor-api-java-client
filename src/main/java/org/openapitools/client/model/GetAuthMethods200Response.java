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
 * GetAuthMethods200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class GetAuthMethods200Response {
  public static final String SERIALIZED_NAME_PUBLIC_TOKEN = "publicToken";
  @SerializedName(SERIALIZED_NAME_PUBLIC_TOKEN)
  @javax.annotation.Nullable
  private String publicToken;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private String id;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  @javax.annotation.Nullable
  private String method;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  @javax.annotation.Nullable
  private String system;

  public GetAuthMethods200Response() {
  }

  public GetAuthMethods200Response publicToken(@javax.annotation.Nullable String publicToken) {
    this.publicToken = publicToken;
    return this;
  }

  /**
   * The public token of the Card
   * @return publicToken
   */
  @javax.annotation.Nullable
  public String getPublicToken() {
    return publicToken;
  }

  public void setPublicToken(@javax.annotation.Nullable String publicToken) {
    this.publicToken = publicToken;
  }


  public GetAuthMethods200Response id(@javax.annotation.Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the authentication method.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public GetAuthMethods200Response method(@javax.annotation.Nullable String method) {
    this.method = method;
    return this;
  }

  /**
   * The method used, either &#x60;OOB&#x60; or &#x60;OTPSMS&#x60;
   * @return method
   */
  @javax.annotation.Nullable
  public String getMethod() {
    return method;
  }

  public void setMethod(@javax.annotation.Nullable String method) {
    this.method = method;
  }


  public GetAuthMethods200Response system(@javax.annotation.Nullable String system) {
    this.system = system;
    return this;
  }

  /**
   * Get system
   * @return system
   */
  @javax.annotation.Nullable
  public String getSystem() {
    return system;
  }

  public void setSystem(@javax.annotation.Nullable String system) {
    this.system = system;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAuthMethods200Response getAuthMethods200Response = (GetAuthMethods200Response) o;
    return Objects.equals(this.publicToken, getAuthMethods200Response.publicToken) &&
        Objects.equals(this.id, getAuthMethods200Response.id) &&
        Objects.equals(this.method, getAuthMethods200Response.method) &&
        Objects.equals(this.system, getAuthMethods200Response.system);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicToken, id, method, system);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAuthMethods200Response {\n");
    sb.append("    publicToken: ").append(toIndentedString(publicToken)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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
    openapiFields.add("publicToken");
    openapiFields.add("id");
    openapiFields.add("method");
    openapiFields.add("system");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetAuthMethods200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetAuthMethods200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetAuthMethods200Response is not found in the empty JSON string", GetAuthMethods200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetAuthMethods200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetAuthMethods200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("publicToken") != null && !jsonObj.get("publicToken").isJsonNull()) && !jsonObj.get("publicToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `publicToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("publicToken").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("method") != null && !jsonObj.get("method").isJsonNull()) && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("system") != null && !jsonObj.get("system").isJsonNull()) && !jsonObj.get("system").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `system` to be a primitive type in the JSON string but got `%s`", jsonObj.get("system").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetAuthMethods200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetAuthMethods200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetAuthMethods200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetAuthMethods200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetAuthMethods200Response>() {
           @Override
           public void write(JsonWriter out, GetAuthMethods200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetAuthMethods200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetAuthMethods200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetAuthMethods200Response
   * @throws IOException if the JSON string is invalid with respect to GetAuthMethods200Response
   */
  public static GetAuthMethods200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetAuthMethods200Response.class);
  }

  /**
   * Convert an instance of GetAuthMethods200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

