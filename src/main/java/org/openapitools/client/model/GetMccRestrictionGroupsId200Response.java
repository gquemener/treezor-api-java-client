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
import org.openapitools.client.model.GetMccRestrictionGroupsId200ResponseMccRestrictionGroupsInner;

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
 * GetMccRestrictionGroupsId200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class GetMccRestrictionGroupsId200Response {
  public static final String SERIALIZED_NAME_MCC_RESTRICTION_GROUPS = "mccRestrictionGroups";
  @SerializedName(SERIALIZED_NAME_MCC_RESTRICTION_GROUPS)
  @javax.annotation.Nullable
  private List<GetMccRestrictionGroupsId200ResponseMccRestrictionGroupsInner> mccRestrictionGroups = new ArrayList<>();

  public GetMccRestrictionGroupsId200Response() {
  }

  public GetMccRestrictionGroupsId200Response mccRestrictionGroups(@javax.annotation.Nullable List<GetMccRestrictionGroupsId200ResponseMccRestrictionGroupsInner> mccRestrictionGroups) {
    this.mccRestrictionGroups = mccRestrictionGroups;
    return this;
  }

  public GetMccRestrictionGroupsId200Response addMccRestrictionGroupsItem(GetMccRestrictionGroupsId200ResponseMccRestrictionGroupsInner mccRestrictionGroupsItem) {
    if (this.mccRestrictionGroups == null) {
      this.mccRestrictionGroups = new ArrayList<>();
    }
    this.mccRestrictionGroups.add(mccRestrictionGroupsItem);
    return this;
  }

  /**
   * Get mccRestrictionGroups
   * @return mccRestrictionGroups
   */
  @javax.annotation.Nullable
  public List<GetMccRestrictionGroupsId200ResponseMccRestrictionGroupsInner> getMccRestrictionGroups() {
    return mccRestrictionGroups;
  }

  public void setMccRestrictionGroups(@javax.annotation.Nullable List<GetMccRestrictionGroupsId200ResponseMccRestrictionGroupsInner> mccRestrictionGroups) {
    this.mccRestrictionGroups = mccRestrictionGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMccRestrictionGroupsId200Response getMccRestrictionGroupsId200Response = (GetMccRestrictionGroupsId200Response) o;
    return Objects.equals(this.mccRestrictionGroups, getMccRestrictionGroupsId200Response.mccRestrictionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mccRestrictionGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMccRestrictionGroupsId200Response {\n");
    sb.append("    mccRestrictionGroups: ").append(toIndentedString(mccRestrictionGroups)).append("\n");
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
    openapiFields.add("mccRestrictionGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetMccRestrictionGroupsId200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetMccRestrictionGroupsId200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetMccRestrictionGroupsId200Response is not found in the empty JSON string", GetMccRestrictionGroupsId200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetMccRestrictionGroupsId200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetMccRestrictionGroupsId200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("mccRestrictionGroups") != null && !jsonObj.get("mccRestrictionGroups").isJsonNull()) {
        JsonArray jsonArraymccRestrictionGroups = jsonObj.getAsJsonArray("mccRestrictionGroups");
        if (jsonArraymccRestrictionGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mccRestrictionGroups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mccRestrictionGroups` to be an array in the JSON string but got `%s`", jsonObj.get("mccRestrictionGroups").toString()));
          }

          // validate the optional field `mccRestrictionGroups` (array)
          for (int i = 0; i < jsonArraymccRestrictionGroups.size(); i++) {
            GetMccRestrictionGroupsId200ResponseMccRestrictionGroupsInner.validateJsonElement(jsonArraymccRestrictionGroups.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetMccRestrictionGroupsId200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetMccRestrictionGroupsId200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetMccRestrictionGroupsId200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetMccRestrictionGroupsId200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetMccRestrictionGroupsId200Response>() {
           @Override
           public void write(JsonWriter out, GetMccRestrictionGroupsId200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetMccRestrictionGroupsId200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetMccRestrictionGroupsId200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetMccRestrictionGroupsId200Response
   * @throws IOException if the JSON string is invalid with respect to GetMccRestrictionGroupsId200Response
   */
  public static GetMccRestrictionGroupsId200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetMccRestrictionGroupsId200Response.class);
  }

  /**
   * Convert an instance of GetMccRestrictionGroupsId200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

