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
import java.time.LocalDate;
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
 * SupportUserObjectClientsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class SupportUserObjectClientsInner {
  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  @javax.annotation.Nullable
  private String clientId;

  /**
   * Gets or Sets scopes
   */
  @JsonAdapter(ScopesEnum.Adapter.class)
  public enum ScopesEnum {
    READ_ALL("read_all"),
    
    READ_WRITE("read_write"),
    
    READ_ONLY("read_only"),
    
    ADMIN("admin"),
    
    SUPPORT_USER_MANAGEMENT("support_user_management"),
    
    LEGAL("legal");

    private String value;

    ScopesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ScopesEnum fromValue(String value) {
      for (ScopesEnum b : ScopesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ScopesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ScopesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ScopesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ScopesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ScopesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  @javax.annotation.Nullable
  private List<ScopesEnum> scopes = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_LOGIN_AT = "lastLoginAt";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN_AT)
  @javax.annotation.Nullable
  private LocalDate lastLoginAt;

  public static final String SERIALIZED_NAME_ACCEPTED_AT = "acceptedAt";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_AT)
  @javax.annotation.Nullable
  private LocalDate acceptedAt;

  public SupportUserObjectClientsInner() {
  }

  public SupportUserObjectClientsInner clientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
   */
  @javax.annotation.Nullable
  public String getClientId() {
    return clientId;
  }

  public void setClientId(@javax.annotation.Nullable String clientId) {
    this.clientId = clientId;
  }


  public SupportUserObjectClientsInner scopes(@javax.annotation.Nullable List<ScopesEnum> scopes) {
    this.scopes = scopes;
    return this;
  }

  public SupportUserObjectClientsInner addScopesItem(ScopesEnum scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Get scopes
   * @return scopes
   */
  @javax.annotation.Nullable
  public List<ScopesEnum> getScopes() {
    return scopes;
  }

  public void setScopes(@javax.annotation.Nullable List<ScopesEnum> scopes) {
    this.scopes = scopes;
  }


  public SupportUserObjectClientsInner lastLoginAt(@javax.annotation.Nullable LocalDate lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
    return this;
  }

  /**
   * Get lastLoginAt
   * @return lastLoginAt
   */
  @javax.annotation.Nullable
  public LocalDate getLastLoginAt() {
    return lastLoginAt;
  }

  public void setLastLoginAt(@javax.annotation.Nullable LocalDate lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }


  public SupportUserObjectClientsInner acceptedAt(@javax.annotation.Nullable LocalDate acceptedAt) {
    this.acceptedAt = acceptedAt;
    return this;
  }

  /**
   * Get acceptedAt
   * @return acceptedAt
   */
  @javax.annotation.Nullable
  public LocalDate getAcceptedAt() {
    return acceptedAt;
  }

  public void setAcceptedAt(@javax.annotation.Nullable LocalDate acceptedAt) {
    this.acceptedAt = acceptedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportUserObjectClientsInner supportUserObjectClientsInner = (SupportUserObjectClientsInner) o;
    return Objects.equals(this.clientId, supportUserObjectClientsInner.clientId) &&
        Objects.equals(this.scopes, supportUserObjectClientsInner.scopes) &&
        Objects.equals(this.lastLoginAt, supportUserObjectClientsInner.lastLoginAt) &&
        Objects.equals(this.acceptedAt, supportUserObjectClientsInner.acceptedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, scopes, lastLoginAt, acceptedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportUserObjectClientsInner {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
    sb.append("    acceptedAt: ").append(toIndentedString(acceptedAt)).append("\n");
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
    openapiFields.add("clientId");
    openapiFields.add("scopes");
    openapiFields.add("lastLoginAt");
    openapiFields.add("acceptedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SupportUserObjectClientsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SupportUserObjectClientsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SupportUserObjectClientsInner is not found in the empty JSON string", SupportUserObjectClientsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SupportUserObjectClientsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SupportUserObjectClientsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonNull()) && !jsonObj.get("clientId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("scopes") != null && !jsonObj.get("scopes").isJsonNull() && !jsonObj.get("scopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopes` to be an array in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SupportUserObjectClientsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SupportUserObjectClientsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SupportUserObjectClientsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SupportUserObjectClientsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SupportUserObjectClientsInner>() {
           @Override
           public void write(JsonWriter out, SupportUserObjectClientsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SupportUserObjectClientsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SupportUserObjectClientsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SupportUserObjectClientsInner
   * @throws IOException if the JSON string is invalid with respect to SupportUserObjectClientsInner
   */
  public static SupportUserObjectClientsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SupportUserObjectClientsInner.class);
  }

  /**
   * Convert an instance of SupportUserObjectClientsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

