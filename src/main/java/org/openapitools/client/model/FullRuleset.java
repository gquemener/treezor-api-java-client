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
import org.openapitools.client.model.Ruleset;
import org.openapitools.client.model.RulesetMetadataWithIdAndStatus;

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
 * FullRuleset
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class FullRuleset {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  @javax.annotation.Nonnull
  private RulesetMetadataWithIdAndStatus metadata;

  public static final String SERIALIZED_NAME_RULESET = "ruleset";
  @SerializedName(SERIALIZED_NAME_RULESET)
  @javax.annotation.Nonnull
  private Ruleset ruleset;

  public FullRuleset() {
  }

  public FullRuleset metadata(@javax.annotation.Nonnull RulesetMetadataWithIdAndStatus metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nonnull
  public RulesetMetadataWithIdAndStatus getMetadata() {
    return metadata;
  }

  public void setMetadata(@javax.annotation.Nonnull RulesetMetadataWithIdAndStatus metadata) {
    this.metadata = metadata;
  }


  public FullRuleset ruleset(@javax.annotation.Nonnull Ruleset ruleset) {
    this.ruleset = ruleset;
    return this;
  }

  /**
   * Get ruleset
   * @return ruleset
   */
  @javax.annotation.Nonnull
  public Ruleset getRuleset() {
    return ruleset;
  }

  public void setRuleset(@javax.annotation.Nonnull Ruleset ruleset) {
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
    FullRuleset fullRuleset = (FullRuleset) o;
    return Objects.equals(this.metadata, fullRuleset.metadata) &&
        Objects.equals(this.ruleset, fullRuleset.ruleset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, ruleset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullRuleset {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("metadata");
    openapiFields.add("ruleset");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("ruleset");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to FullRuleset
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FullRuleset.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FullRuleset is not found in the empty JSON string", FullRuleset.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!FullRuleset.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FullRuleset` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FullRuleset.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `metadata`
      RulesetMetadataWithIdAndStatus.validateJsonElement(jsonObj.get("metadata"));
      // validate the required field `ruleset`
      Ruleset.validateJsonElement(jsonObj.get("ruleset"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FullRuleset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FullRuleset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FullRuleset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FullRuleset.class));

       return (TypeAdapter<T>) new TypeAdapter<FullRuleset>() {
           @Override
           public void write(JsonWriter out, FullRuleset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FullRuleset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of FullRuleset given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of FullRuleset
   * @throws IOException if the JSON string is invalid with respect to FullRuleset
   */
  public static FullRuleset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FullRuleset.class);
  }

  /**
   * Convert an instance of FullRuleset to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

