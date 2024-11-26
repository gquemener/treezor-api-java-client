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
 * Payment card used during authorization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class NotificationSimulationAuthorizationsCardPaymentMethod {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  @javax.annotation.Nullable
  private String brand;

  public static final String SERIALIZED_NAME_CARD_EXPIRY_MONTH = "cardExpiryMonth";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_MONTH)
  @javax.annotation.Nullable
  private String cardExpiryMonth;

  public static final String SERIALIZED_NAME_CARD_EXPIRY_YEAR = "cardExpiryYear";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_YEAR)
  @javax.annotation.Nullable
  private String cardExpiryYear;

  public static final String SERIALIZED_NAME_CARD_HOLDER = "cardHolder";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER)
  @javax.annotation.Nullable
  private String cardHolder;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  @javax.annotation.Nullable
  private String issuer;

  public static final String SERIALIZED_NAME_MASKED_PAN = "maskedPan";
  @SerializedName(SERIALIZED_NAME_MASKED_PAN)
  @javax.annotation.Nullable
  private String maskedPan;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public NotificationSimulationAuthorizationsCardPaymentMethod() {
  }

  public NotificationSimulationAuthorizationsCardPaymentMethod brand(@javax.annotation.Nullable String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
   */
  @javax.annotation.Nullable
  public String getBrand() {
    return brand;
  }

  public void setBrand(@javax.annotation.Nullable String brand) {
    this.brand = brand;
  }


  public NotificationSimulationAuthorizationsCardPaymentMethod cardExpiryMonth(@javax.annotation.Nullable String cardExpiryMonth) {
    this.cardExpiryMonth = cardExpiryMonth;
    return this;
  }

  /**
   * Get cardExpiryMonth
   * @return cardExpiryMonth
   */
  @javax.annotation.Nullable
  public String getCardExpiryMonth() {
    return cardExpiryMonth;
  }

  public void setCardExpiryMonth(@javax.annotation.Nullable String cardExpiryMonth) {
    this.cardExpiryMonth = cardExpiryMonth;
  }


  public NotificationSimulationAuthorizationsCardPaymentMethod cardExpiryYear(@javax.annotation.Nullable String cardExpiryYear) {
    this.cardExpiryYear = cardExpiryYear;
    return this;
  }

  /**
   * Get cardExpiryYear
   * @return cardExpiryYear
   */
  @javax.annotation.Nullable
  public String getCardExpiryYear() {
    return cardExpiryYear;
  }

  public void setCardExpiryYear(@javax.annotation.Nullable String cardExpiryYear) {
    this.cardExpiryYear = cardExpiryYear;
  }


  public NotificationSimulationAuthorizationsCardPaymentMethod cardHolder(@javax.annotation.Nullable String cardHolder) {
    this.cardHolder = cardHolder;
    return this;
  }

  /**
   * Get cardHolder
   * @return cardHolder
   */
  @javax.annotation.Nullable
  public String getCardHolder() {
    return cardHolder;
  }

  public void setCardHolder(@javax.annotation.Nullable String cardHolder) {
    this.cardHolder = cardHolder;
  }


  public NotificationSimulationAuthorizationsCardPaymentMethod country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public NotificationSimulationAuthorizationsCardPaymentMethod issuer(@javax.annotation.Nullable String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Get issuer
   * @return issuer
   */
  @javax.annotation.Nullable
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(@javax.annotation.Nullable String issuer) {
    this.issuer = issuer;
  }


  public NotificationSimulationAuthorizationsCardPaymentMethod maskedPan(@javax.annotation.Nullable String maskedPan) {
    this.maskedPan = maskedPan;
    return this;
  }

  /**
   * Get maskedPan
   * @return maskedPan
   */
  @javax.annotation.Nullable
  public String getMaskedPan() {
    return maskedPan;
  }

  public void setMaskedPan(@javax.annotation.Nullable String maskedPan) {
    this.maskedPan = maskedPan;
  }


  public NotificationSimulationAuthorizationsCardPaymentMethod token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSimulationAuthorizationsCardPaymentMethod notificationSimulationAuthorizationsCardPaymentMethod = (NotificationSimulationAuthorizationsCardPaymentMethod) o;
    return Objects.equals(this.brand, notificationSimulationAuthorizationsCardPaymentMethod.brand) &&
        Objects.equals(this.cardExpiryMonth, notificationSimulationAuthorizationsCardPaymentMethod.cardExpiryMonth) &&
        Objects.equals(this.cardExpiryYear, notificationSimulationAuthorizationsCardPaymentMethod.cardExpiryYear) &&
        Objects.equals(this.cardHolder, notificationSimulationAuthorizationsCardPaymentMethod.cardHolder) &&
        Objects.equals(this.country, notificationSimulationAuthorizationsCardPaymentMethod.country) &&
        Objects.equals(this.issuer, notificationSimulationAuthorizationsCardPaymentMethod.issuer) &&
        Objects.equals(this.maskedPan, notificationSimulationAuthorizationsCardPaymentMethod.maskedPan) &&
        Objects.equals(this.token, notificationSimulationAuthorizationsCardPaymentMethod.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, cardExpiryMonth, cardExpiryYear, cardHolder, country, issuer, maskedPan, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSimulationAuthorizationsCardPaymentMethod {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    cardExpiryMonth: ").append(toIndentedString(cardExpiryMonth)).append("\n");
    sb.append("    cardExpiryYear: ").append(toIndentedString(cardExpiryYear)).append("\n");
    sb.append("    cardHolder: ").append(toIndentedString(cardHolder)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("cardExpiryMonth");
    openapiFields.add("cardExpiryYear");
    openapiFields.add("cardHolder");
    openapiFields.add("country");
    openapiFields.add("issuer");
    openapiFields.add("maskedPan");
    openapiFields.add("token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NotificationSimulationAuthorizationsCardPaymentMethod
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NotificationSimulationAuthorizationsCardPaymentMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationSimulationAuthorizationsCardPaymentMethod is not found in the empty JSON string", NotificationSimulationAuthorizationsCardPaymentMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!NotificationSimulationAuthorizationsCardPaymentMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationSimulationAuthorizationsCardPaymentMethod` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      if ((jsonObj.get("cardExpiryMonth") != null && !jsonObj.get("cardExpiryMonth").isJsonNull()) && !jsonObj.get("cardExpiryMonth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardExpiryMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardExpiryMonth").toString()));
      }
      if ((jsonObj.get("cardExpiryYear") != null && !jsonObj.get("cardExpiryYear").isJsonNull()) && !jsonObj.get("cardExpiryYear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardExpiryYear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardExpiryYear").toString()));
      }
      if ((jsonObj.get("cardHolder") != null && !jsonObj.get("cardHolder").isJsonNull()) && !jsonObj.get("cardHolder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardHolder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardHolder").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonNull()) && !jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      if ((jsonObj.get("maskedPan") != null && !jsonObj.get("maskedPan").isJsonNull()) && !jsonObj.get("maskedPan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskedPan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskedPan").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationSimulationAuthorizationsCardPaymentMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationSimulationAuthorizationsCardPaymentMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationSimulationAuthorizationsCardPaymentMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationSimulationAuthorizationsCardPaymentMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationSimulationAuthorizationsCardPaymentMethod>() {
           @Override
           public void write(JsonWriter out, NotificationSimulationAuthorizationsCardPaymentMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationSimulationAuthorizationsCardPaymentMethod read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NotificationSimulationAuthorizationsCardPaymentMethod given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NotificationSimulationAuthorizationsCardPaymentMethod
   * @throws IOException if the JSON string is invalid with respect to NotificationSimulationAuthorizationsCardPaymentMethod
   */
  public static NotificationSimulationAuthorizationsCardPaymentMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationSimulationAuthorizationsCardPaymentMethod.class);
  }

  /**
   * Convert an instance of NotificationSimulationAuthorizationsCardPaymentMethod to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

