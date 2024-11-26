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
import org.openapitools.client.model.GetRecallSctInst200ResponseRecallsInner;

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
 * GetRecallSctInst200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class GetRecallSctInst200Response {
  public static final String SERIALIZED_NAME_RECALLS = "recalls";
  @SerializedName(SERIALIZED_NAME_RECALLS)
  @javax.annotation.Nullable
  private List<GetRecallSctInst200ResponseRecallsInner> recalls = new ArrayList<>();

  public GetRecallSctInst200Response() {
  }

  public GetRecallSctInst200Response recalls(@javax.annotation.Nullable List<GetRecallSctInst200ResponseRecallsInner> recalls) {
    this.recalls = recalls;
    return this;
  }

  public GetRecallSctInst200Response addRecallsItem(GetRecallSctInst200ResponseRecallsInner recallsItem) {
    if (this.recalls == null) {
      this.recalls = new ArrayList<>();
    }
    this.recalls.add(recallsItem);
    return this;
  }

  /**
   * Get recalls
   * @return recalls
   */
  @javax.annotation.Nullable
  public List<GetRecallSctInst200ResponseRecallsInner> getRecalls() {
    return recalls;
  }

  public void setRecalls(@javax.annotation.Nullable List<GetRecallSctInst200ResponseRecallsInner> recalls) {
    this.recalls = recalls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecallSctInst200Response getRecallSctInst200Response = (GetRecallSctInst200Response) o;
    return Objects.equals(this.recalls, getRecallSctInst200Response.recalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecallSctInst200Response {\n");
    sb.append("    recalls: ").append(toIndentedString(recalls)).append("\n");
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
    openapiFields.add("recalls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRecallSctInst200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRecallSctInst200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRecallSctInst200Response is not found in the empty JSON string", GetRecallSctInst200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRecallSctInst200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRecallSctInst200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("recalls") != null && !jsonObj.get("recalls").isJsonNull()) {
        JsonArray jsonArrayrecalls = jsonObj.getAsJsonArray("recalls");
        if (jsonArrayrecalls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("recalls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `recalls` to be an array in the JSON string but got `%s`", jsonObj.get("recalls").toString()));
          }

          // validate the optional field `recalls` (array)
          for (int i = 0; i < jsonArrayrecalls.size(); i++) {
            GetRecallSctInst200ResponseRecallsInner.validateJsonElement(jsonArrayrecalls.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRecallSctInst200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRecallSctInst200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRecallSctInst200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRecallSctInst200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRecallSctInst200Response>() {
           @Override
           public void write(JsonWriter out, GetRecallSctInst200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRecallSctInst200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRecallSctInst200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRecallSctInst200Response
   * @throws IOException if the JSON string is invalid with respect to GetRecallSctInst200Response
   */
  public static GetRecallSctInst200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRecallSctInst200Response.class);
  }

  /**
   * Convert an instance of GetRecallSctInst200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

