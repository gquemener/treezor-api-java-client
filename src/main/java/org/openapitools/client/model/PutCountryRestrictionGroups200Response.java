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
import org.openapitools.client.model.PutCountryRestrictionGroups200ResponseCountryRestrictionGroupsInner;

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
 * PutCountryRestrictionGroups200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class PutCountryRestrictionGroups200Response {
  public static final String SERIALIZED_NAME_COUNTRY_RESTRICTION_GROUPS = "countryRestrictionGroups";
  @SerializedName(SERIALIZED_NAME_COUNTRY_RESTRICTION_GROUPS)
  @javax.annotation.Nullable
  private List<PutCountryRestrictionGroups200ResponseCountryRestrictionGroupsInner> countryRestrictionGroups = new ArrayList<>();

  public PutCountryRestrictionGroups200Response() {
  }

  public PutCountryRestrictionGroups200Response countryRestrictionGroups(@javax.annotation.Nullable List<PutCountryRestrictionGroups200ResponseCountryRestrictionGroupsInner> countryRestrictionGroups) {
    this.countryRestrictionGroups = countryRestrictionGroups;
    return this;
  }

  public PutCountryRestrictionGroups200Response addCountryRestrictionGroupsItem(PutCountryRestrictionGroups200ResponseCountryRestrictionGroupsInner countryRestrictionGroupsItem) {
    if (this.countryRestrictionGroups == null) {
      this.countryRestrictionGroups = new ArrayList<>();
    }
    this.countryRestrictionGroups.add(countryRestrictionGroupsItem);
    return this;
  }

  /**
   * Get countryRestrictionGroups
   * @return countryRestrictionGroups
   */
  @javax.annotation.Nullable
  public List<PutCountryRestrictionGroups200ResponseCountryRestrictionGroupsInner> getCountryRestrictionGroups() {
    return countryRestrictionGroups;
  }

  public void setCountryRestrictionGroups(@javax.annotation.Nullable List<PutCountryRestrictionGroups200ResponseCountryRestrictionGroupsInner> countryRestrictionGroups) {
    this.countryRestrictionGroups = countryRestrictionGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutCountryRestrictionGroups200Response putCountryRestrictionGroups200Response = (PutCountryRestrictionGroups200Response) o;
    return Objects.equals(this.countryRestrictionGroups, putCountryRestrictionGroups200Response.countryRestrictionGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryRestrictionGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutCountryRestrictionGroups200Response {\n");
    sb.append("    countryRestrictionGroups: ").append(toIndentedString(countryRestrictionGroups)).append("\n");
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
    openapiFields.add("countryRestrictionGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PutCountryRestrictionGroups200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PutCountryRestrictionGroups200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PutCountryRestrictionGroups200Response is not found in the empty JSON string", PutCountryRestrictionGroups200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PutCountryRestrictionGroups200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PutCountryRestrictionGroups200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("countryRestrictionGroups") != null && !jsonObj.get("countryRestrictionGroups").isJsonNull()) {
        JsonArray jsonArraycountryRestrictionGroups = jsonObj.getAsJsonArray("countryRestrictionGroups");
        if (jsonArraycountryRestrictionGroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("countryRestrictionGroups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `countryRestrictionGroups` to be an array in the JSON string but got `%s`", jsonObj.get("countryRestrictionGroups").toString()));
          }

          // validate the optional field `countryRestrictionGroups` (array)
          for (int i = 0; i < jsonArraycountryRestrictionGroups.size(); i++) {
            PutCountryRestrictionGroups200ResponseCountryRestrictionGroupsInner.validateJsonElement(jsonArraycountryRestrictionGroups.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PutCountryRestrictionGroups200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PutCountryRestrictionGroups200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PutCountryRestrictionGroups200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PutCountryRestrictionGroups200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<PutCountryRestrictionGroups200Response>() {
           @Override
           public void write(JsonWriter out, PutCountryRestrictionGroups200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PutCountryRestrictionGroups200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PutCountryRestrictionGroups200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PutCountryRestrictionGroups200Response
   * @throws IOException if the JSON string is invalid with respect to PutCountryRestrictionGroups200Response
   */
  public static PutCountryRestrictionGroups200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PutCountryRestrictionGroups200Response.class);
  }

  /**
   * Convert an instance of PutCountryRestrictionGroups200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

