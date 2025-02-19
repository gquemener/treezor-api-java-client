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
 * PostMerchantIdRestrictionGroupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class PostMerchantIdRestrictionGroupRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nonnull
  private String name;

  /**
   * Status of the Merchant ID restriction group.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    VALIDATED("VALIDATED"),
    
    PENDING("PENDING"),
    
    CANCELED("CANCELED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  @javax.annotation.Nullable
  private StatusEnum status;

  public static final String SERIALIZED_NAME_IS_WHITELIST = "isWhitelist";
  @SerializedName(SERIALIZED_NAME_IS_WHITELIST)
  @javax.annotation.Nullable
  private Boolean isWhitelist = true;

  public static final String SERIALIZED_NAME_MERCHANTS = "merchants";
  @SerializedName(SERIALIZED_NAME_MERCHANTS)
  @javax.annotation.Nonnull
  private List<String> merchants = new ArrayList<>();

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  @javax.annotation.Nullable
  private String startDate;

  public PostMerchantIdRestrictionGroupRequest() {
  }

  public PostMerchantIdRestrictionGroupRequest name(@javax.annotation.Nonnull String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Merchant ID restriction group.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nonnull String name) {
    this.name = name;
  }


  public PostMerchantIdRestrictionGroupRequest status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the Merchant ID restriction group.
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public PostMerchantIdRestrictionGroupRequest isWhitelist(@javax.annotation.Nullable Boolean isWhitelist) {
    this.isWhitelist = isWhitelist;
    return this;
  }

  /**
   * Indicates the kind of restriction:  * &#x60;true&#x60; (default) – Allows only a specified list of merchant ids (whitelist) * &#x60;false&#x60; – Allows all merchant ids except the specified list (blacklist) 
   * @return isWhitelist
   */
  @javax.annotation.Nullable
  public Boolean getIsWhitelist() {
    return isWhitelist;
  }

  public void setIsWhitelist(@javax.annotation.Nullable Boolean isWhitelist) {
    this.isWhitelist = isWhitelist;
  }


  public PostMerchantIdRestrictionGroupRequest merchants(@javax.annotation.Nonnull List<String> merchants) {
    this.merchants = merchants;
    return this;
  }

  public PostMerchantIdRestrictionGroupRequest addMerchantsItem(String merchantsItem) {
    if (this.merchants == null) {
      this.merchants = new ArrayList<>();
    }
    this.merchants.add(merchantsItem);
    return this;
  }

  /**
   * List of Merchant Ids (each item is a string).
   * @return merchants
   */
  @javax.annotation.Nonnull
  public List<String> getMerchants() {
    return merchants;
  }

  public void setMerchants(@javax.annotation.Nonnull List<String> merchants) {
    this.merchants = merchants;
  }


  public PostMerchantIdRestrictionGroupRequest startDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The date and time at which the restriction starts. Format: YYYY-MM-DD HH:MM:SS 
   * @return startDate
   */
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(@javax.annotation.Nullable String startDate) {
    this.startDate = startDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMerchantIdRestrictionGroupRequest postMerchantIdRestrictionGroupRequest = (PostMerchantIdRestrictionGroupRequest) o;
    return Objects.equals(this.name, postMerchantIdRestrictionGroupRequest.name) &&
        Objects.equals(this.status, postMerchantIdRestrictionGroupRequest.status) &&
        Objects.equals(this.isWhitelist, postMerchantIdRestrictionGroupRequest.isWhitelist) &&
        Objects.equals(this.merchants, postMerchantIdRestrictionGroupRequest.merchants) &&
        Objects.equals(this.startDate, postMerchantIdRestrictionGroupRequest.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, isWhitelist, merchants, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMerchantIdRestrictionGroupRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isWhitelist: ").append(toIndentedString(isWhitelist)).append("\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("isWhitelist");
    openapiFields.add("merchants");
    openapiFields.add("startDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("merchants");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PostMerchantIdRestrictionGroupRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostMerchantIdRestrictionGroupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostMerchantIdRestrictionGroupRequest is not found in the empty JSON string", PostMerchantIdRestrictionGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PostMerchantIdRestrictionGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostMerchantIdRestrictionGroupRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostMerchantIdRestrictionGroupRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      // ensure the required json array is present
      if (jsonObj.get("merchants") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("merchants").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchants` to be an array in the JSON string but got `%s`", jsonObj.get("merchants").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostMerchantIdRestrictionGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostMerchantIdRestrictionGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostMerchantIdRestrictionGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostMerchantIdRestrictionGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PostMerchantIdRestrictionGroupRequest>() {
           @Override
           public void write(JsonWriter out, PostMerchantIdRestrictionGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostMerchantIdRestrictionGroupRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PostMerchantIdRestrictionGroupRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PostMerchantIdRestrictionGroupRequest
   * @throws IOException if the JSON string is invalid with respect to PostMerchantIdRestrictionGroupRequest
   */
  public static PostMerchantIdRestrictionGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostMerchantIdRestrictionGroupRequest.class);
  }

  /**
   * Convert an instance of PostMerchantIdRestrictionGroupRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

