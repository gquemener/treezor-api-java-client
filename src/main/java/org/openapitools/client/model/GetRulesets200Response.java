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
import org.openapitools.client.model.GetRulesets200ResponseRulesetInner;

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
 * GetRulesets200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class GetRulesets200Response {
  public static final String SERIALIZED_NAME_RULESET = "ruleset";
  @SerializedName(SERIALIZED_NAME_RULESET)
  @javax.annotation.Nullable
  private List<GetRulesets200ResponseRulesetInner> ruleset = new ArrayList<>();

  public GetRulesets200Response() {
  }

  public GetRulesets200Response ruleset(@javax.annotation.Nullable List<GetRulesets200ResponseRulesetInner> ruleset) {
    this.ruleset = ruleset;
    return this;
  }

  public GetRulesets200Response addRulesetItem(GetRulesets200ResponseRulesetInner rulesetItem) {
    if (this.ruleset == null) {
      this.ruleset = new ArrayList<>();
    }
    this.ruleset.add(rulesetItem);
    return this;
  }

  /**
   * Get ruleset
   * @return ruleset
   */
  @javax.annotation.Nullable
  public List<GetRulesets200ResponseRulesetInner> getRuleset() {
    return ruleset;
  }

  public void setRuleset(@javax.annotation.Nullable List<GetRulesets200ResponseRulesetInner> ruleset) {
    this.ruleset = ruleset;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRulesets200Response getRulesets200Response = (GetRulesets200Response) o;
    return Objects.equals(this.ruleset, getRulesets200Response.ruleset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRulesets200Response {\n");
    sb.append("    ruleset: ").append(toIndentedString(ruleset)).append("\n");
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
    openapiFields.add("ruleset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetRulesets200Response
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetRulesets200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetRulesets200Response is not found in the empty JSON string", GetRulesets200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetRulesets200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetRulesets200Response` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("ruleset") != null && !jsonObj.get("ruleset").isJsonNull()) {
        JsonArray jsonArrayruleset = jsonObj.getAsJsonArray("ruleset");
        if (jsonArrayruleset != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ruleset").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ruleset` to be an array in the JSON string but got `%s`", jsonObj.get("ruleset").toString()));
          }

          // validate the optional field `ruleset` (array)
          for (int i = 0; i < jsonArrayruleset.size(); i++) {
            GetRulesets200ResponseRulesetInner.validateJsonElement(jsonArrayruleset.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetRulesets200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetRulesets200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetRulesets200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetRulesets200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetRulesets200Response>() {
           @Override
           public void write(JsonWriter out, GetRulesets200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetRulesets200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetRulesets200Response given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetRulesets200Response
   * @throws IOException if the JSON string is invalid with respect to GetRulesets200Response
   */
  public static GetRulesets200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetRulesets200Response.class);
  }

  /**
   * Convert an instance of GetRulesets200Response to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

