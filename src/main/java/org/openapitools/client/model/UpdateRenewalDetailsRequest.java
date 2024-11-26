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
 * UpdateRenewalDetailsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class UpdateRenewalDetailsRequest {
  /**
   * The type of renewal for the card. Can be:  * &#x60;A&#x60; – Automatic * &#x60;N&#x60; – Non automatic 
   */
  @JsonAdapter(RenewalTypeEnum.Adapter.class)
  public enum RenewalTypeEnum {
    A("A"),
    
    N("N");

    private String value;

    RenewalTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RenewalTypeEnum fromValue(String value) {
      for (RenewalTypeEnum b : RenewalTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RenewalTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RenewalTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RenewalTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RenewalTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RenewalTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_RENEWAL_TYPE = "renewalType";
  @SerializedName(SERIALIZED_NAME_RENEWAL_TYPE)
  @javax.annotation.Nonnull
  private RenewalTypeEnum renewalType;

  public UpdateRenewalDetailsRequest() {
  }

  public UpdateRenewalDetailsRequest renewalType(@javax.annotation.Nonnull RenewalTypeEnum renewalType) {
    this.renewalType = renewalType;
    return this;
  }

  /**
   * The type of renewal for the card. Can be:  * &#x60;A&#x60; – Automatic * &#x60;N&#x60; – Non automatic 
   * @return renewalType
   */
  @javax.annotation.Nonnull
  public RenewalTypeEnum getRenewalType() {
    return renewalType;
  }

  public void setRenewalType(@javax.annotation.Nonnull RenewalTypeEnum renewalType) {
    this.renewalType = renewalType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateRenewalDetailsRequest updateRenewalDetailsRequest = (UpdateRenewalDetailsRequest) o;
    return Objects.equals(this.renewalType, updateRenewalDetailsRequest.renewalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renewalType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateRenewalDetailsRequest {\n");
    sb.append("    renewalType: ").append(toIndentedString(renewalType)).append("\n");
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
    openapiFields.add("renewalType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("renewalType");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateRenewalDetailsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateRenewalDetailsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateRenewalDetailsRequest is not found in the empty JSON string", UpdateRenewalDetailsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateRenewalDetailsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateRenewalDetailsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateRenewalDetailsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("renewalType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `renewalType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("renewalType").toString()));
      }
      // validate the required field `renewalType`
      RenewalTypeEnum.validateJsonElement(jsonObj.get("renewalType"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateRenewalDetailsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateRenewalDetailsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateRenewalDetailsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateRenewalDetailsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateRenewalDetailsRequest>() {
           @Override
           public void write(JsonWriter out, UpdateRenewalDetailsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateRenewalDetailsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateRenewalDetailsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateRenewalDetailsRequest
   * @throws IOException if the JSON string is invalid with respect to UpdateRenewalDetailsRequest
   */
  public static UpdateRenewalDetailsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateRenewalDetailsRequest.class);
  }

  /**
   * Convert an instance of UpdateRenewalDetailsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

