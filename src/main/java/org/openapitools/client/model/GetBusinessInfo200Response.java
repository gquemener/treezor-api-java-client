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
import org.openapitools.client.model.GetBusinessInfo200ResponseBusinessinformationsInner;

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
 * GetBusinessInfo200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class GetBusinessInfo200Response {
  public static final String SERIALIZED_NAME_BUSINESSINFORMATIONS = "businessinformations";
  @SerializedName(SERIALIZED_NAME_BUSINESSINFORMATIONS)
  @javax.annotation.Nullable
  private List<GetBusinessInfo200ResponseBusinessinformationsInner> businessinformations = new ArrayList<>();

  public GetBusinessInfo200Response() {
  }

  public GetBusinessInfo200Response businessinformations(@javax.annotation.Nullable List<GetBusinessInfo200ResponseBusinessinformationsInner> businessinformations) {
    this.businessinformations = businessinformations;
    return this;
  }

  public GetBusinessInfo200Response addBusinessinformationsItem(GetBusinessInfo200ResponseBusinessinformationsInner businessinformationsItem) {
    if (this.businessinformations == null) {
      this.businessinformations = new ArrayList<>();
    }
    this.businessinformations.add(businessinformationsItem);
    return this;
  }

  /**
   * Get businessinformations
   * @return businessinformations
   */
  @javax.annotation.Nullable
  public List<GetBusinessInfo200ResponseBusinessinformationsInner> getBusinessinformations() {
    return businessinformations;
  }

  public void setBusinessinformations(@javax.annotation.Nullable List<GetBusinessInfo200ResponseBusinessinformationsInner> businessinformations) {
    this.businessinformations = businessinformations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetBusinessInfo200Response getBusinessInfo200Response = (GetBusinessInfo200Response) o;
    return Objects.equals(this.businessinformations, getBusinessInfo200Response.businessinformations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessinformations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetBusinessInfo200Response {\n");
    sb.append("    businessinformations: ").append(toIndentedString(businessinformations)).append("\n");
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
    openapiFields.add("businessinformations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetBusinessInfo200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetBusinessInfo200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetBusinessInfo200Response is not found in the empty JSON string", GetBusinessInfo200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetBusinessInfo200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetBusinessInfo200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("businessinformations") != null && !jsonObj.get("businessinformations").isJsonNull()) {
        JsonArray jsonArraybusinessinformations = jsonObj.getAsJsonArray("businessinformations");
        if (jsonArraybusinessinformations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("businessinformations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `businessinformations` to be an array in the JSON string but got `%s`", jsonObj.get("businessinformations").toString()));
          }

          // validate the optional field `businessinformations` (array)
          for (int i = 0; i < jsonArraybusinessinformations.size(); i++) {
            GetBusinessInfo200ResponseBusinessinformationsInner.validateJsonElement(jsonArraybusinessinformations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetBusinessInfo200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetBusinessInfo200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetBusinessInfo200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetBusinessInfo200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetBusinessInfo200Response>() {
           @Override
           public void write(JsonWriter out, GetBusinessInfo200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetBusinessInfo200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetBusinessInfo200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetBusinessInfo200Response
   * @throws IOException if the JSON string is invalid with respect to GetBusinessInfo200Response
   */
  public static GetBusinessInfo200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetBusinessInfo200Response.class);
  }

  /**
   * Convert an instance of GetBusinessInfo200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

