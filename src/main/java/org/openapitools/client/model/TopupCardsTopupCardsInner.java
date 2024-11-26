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
 * TopupCardsTopupCardsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class TopupCardsTopupCardsInner {
  public static final String SERIALIZED_NAME_TOPUP_CARD_ID = "topupCardId";
  @SerializedName(SERIALIZED_NAME_TOPUP_CARD_ID)
  @javax.annotation.Nullable
  private String topupCardId;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  @javax.annotation.Nullable
  private String token;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private String userId;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  @javax.annotation.Nullable
  private String brand;

  public static final String SERIALIZED_NAME_MASKED_PAN = "maskedPan";
  @SerializedName(SERIALIZED_NAME_MASKED_PAN)
  @javax.annotation.Nullable
  private String maskedPan;

  public static final String SERIALIZED_NAME_CARD_HOLDER = "cardHolder";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER)
  @javax.annotation.Nullable
  private String cardHolder;

  public static final String SERIALIZED_NAME_CARD_EXPIRY_MONTH = "cardExpiryMonth";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_MONTH)
  @javax.annotation.Nullable
  private String cardExpiryMonth;

  public static final String SERIALIZED_NAME_CARD_EXPIRY_YEAR = "cardExpiryYear";
  @SerializedName(SERIALIZED_NAME_CARD_EXPIRY_YEAR)
  @javax.annotation.Nullable
  private String cardExpiryYear;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  @javax.annotation.Nullable
  private String issuer;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_DOMESTIC_NETWORK = "domesticNetwork";
  @SerializedName(SERIALIZED_NAME_DOMESTIC_NETWORK)
  @javax.annotation.Nullable
  private String domesticNetwork;

  public static final String SERIALIZED_NAME_CARD_TYPE = "cardType";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  @javax.annotation.Nullable
  private String cardType;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  @javax.annotation.Nullable
  private String createdDate;

  public static final String SERIALIZED_NAME_UPDATED_DATE = "updatedDate";
  @SerializedName(SERIALIZED_NAME_UPDATED_DATE)
  @javax.annotation.Nullable
  private String updatedDate;

  /**
   * Status of the TopupCard. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    VALIDATED("VALIDATED"),
    
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

  public static final String SERIALIZED_NAME_PROVIDER_NAME = "providerName";
  @SerializedName(SERIALIZED_NAME_PROVIDER_NAME)
  @javax.annotation.Nullable
  private String providerName;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  @javax.annotation.Nullable
  private String profile;

  public TopupCardsTopupCardsInner() {
  }

  public TopupCardsTopupCardsInner topupCardId(@javax.annotation.Nullable String topupCardId) {
    this.topupCardId = topupCardId;
    return this;
  }

  /**
   * The tokenized card universally unique identifier (UUID)
   * @return topupCardId
   */
  @javax.annotation.Nullable
  public String getTopupCardId() {
    return topupCardId;
  }

  public void setTopupCardId(@javax.annotation.Nullable String topupCardId) {
    this.topupCardId = topupCardId;
  }


  public TopupCardsTopupCardsInner token(@javax.annotation.Nullable String token) {
    this.token = token;
    return this;
  }

  /**
   * HiPay token of the card
   * @return token
   */
  @javax.annotation.Nullable
  public String getToken() {
    return token;
  }

  public void setToken(@javax.annotation.Nullable String token) {
    this.token = token;
  }


  public TopupCardsTopupCardsInner userId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Treezor user unique identifier
   * @return userId
   */
  @javax.annotation.Nullable
  public String getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable String userId) {
    this.userId = userId;
  }


  public TopupCardsTopupCardsInner brand(@javax.annotation.Nullable String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Brand of the payment method
   * @return brand
   */
  @javax.annotation.Nullable
  public String getBrand() {
    return brand;
  }

  public void setBrand(@javax.annotation.Nullable String brand) {
    this.brand = brand;
  }


  public TopupCardsTopupCardsInner maskedPan(@javax.annotation.Nullable String maskedPan) {
    this.maskedPan = maskedPan;
    return this;
  }

  /**
   * Masked card number
   * @return maskedPan
   */
  @javax.annotation.Nullable
  public String getMaskedPan() {
    return maskedPan;
  }

  public void setMaskedPan(@javax.annotation.Nullable String maskedPan) {
    this.maskedPan = maskedPan;
  }


  public TopupCardsTopupCardsInner cardHolder(@javax.annotation.Nullable String cardHolder) {
    this.cardHolder = cardHolder;
    return this;
  }

  /**
   * Cardholder name
   * @return cardHolder
   */
  @javax.annotation.Nullable
  public String getCardHolder() {
    return cardHolder;
  }

  public void setCardHolder(@javax.annotation.Nullable String cardHolder) {
    this.cardHolder = cardHolder;
  }


  public TopupCardsTopupCardsInner cardExpiryMonth(@javax.annotation.Nullable String cardExpiryMonth) {
    this.cardExpiryMonth = cardExpiryMonth;
    return this;
  }

  /**
   * Expiry month of the card
   * @return cardExpiryMonth
   */
  @javax.annotation.Nullable
  public String getCardExpiryMonth() {
    return cardExpiryMonth;
  }

  public void setCardExpiryMonth(@javax.annotation.Nullable String cardExpiryMonth) {
    this.cardExpiryMonth = cardExpiryMonth;
  }


  public TopupCardsTopupCardsInner cardExpiryYear(@javax.annotation.Nullable String cardExpiryYear) {
    this.cardExpiryYear = cardExpiryYear;
    return this;
  }

  /**
   * Expiry year of the card
   * @return cardExpiryYear
   */
  @javax.annotation.Nullable
  public String getCardExpiryYear() {
    return cardExpiryYear;
  }

  public void setCardExpiryYear(@javax.annotation.Nullable String cardExpiryYear) {
    this.cardExpiryYear = cardExpiryYear;
  }


  public TopupCardsTopupCardsInner issuer(@javax.annotation.Nullable String issuer) {
    this.issuer = issuer;
    return this;
  }

  /**
   * Issuer bank name
   * @return issuer
   */
  @javax.annotation.Nullable
  public String getIssuer() {
    return issuer;
  }

  public void setIssuer(@javax.annotation.Nullable String issuer) {
    this.issuer = issuer;
  }


  public TopupCardsTopupCardsInner country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * Country code of the bank where the card was issued. This two-letter country code complies with ISO 3166-1 (alpha 2). 
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public TopupCardsTopupCardsInner domesticNetwork(@javax.annotation.Nullable String domesticNetwork) {
    this.domesticNetwork = domesticNetwork;
    return this;
  }

  /**
   * Card domestic network
   * @return domesticNetwork
   */
  @javax.annotation.Nullable
  public String getDomesticNetwork() {
    return domesticNetwork;
  }

  public void setDomesticNetwork(@javax.annotation.Nullable String domesticNetwork) {
    this.domesticNetwork = domesticNetwork;
  }


  public TopupCardsTopupCardsInner cardType(@javax.annotation.Nullable String cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Type of the card.  Possible values:  - *DEBIT*  - *CREDIT* 
   * @return cardType
   */
  @javax.annotation.Nullable
  public String getCardType() {
    return cardType;
  }

  public void setCardType(@javax.annotation.Nullable String cardType) {
    this.cardType = cardType;
  }


  public TopupCardsTopupCardsInner createdDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Creation date of the TopupCard
   * @return createdDate
   */
  @javax.annotation.Nullable
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
  }


  public TopupCardsTopupCardsInner updatedDate(@javax.annotation.Nullable String updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Updated date of the TopupCard
   * @return updatedDate
   */
  @javax.annotation.Nullable
  public String getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(@javax.annotation.Nullable String updatedDate) {
    this.updatedDate = updatedDate;
  }


  public TopupCardsTopupCardsInner status(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the TopupCard. 
   * @return status
   */
  @javax.annotation.Nullable
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(@javax.annotation.Nullable StatusEnum status) {
    this.status = status;
  }


  public TopupCardsTopupCardsInner providerName(@javax.annotation.Nullable String providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * Token provider name (eg HiPay)
   * @return providerName
   */
  @javax.annotation.Nullable
  public String getProviderName() {
    return providerName;
  }

  public void setProviderName(@javax.annotation.Nullable String providerName) {
    this.providerName = providerName;
  }


  public TopupCardsTopupCardsInner profile(@javax.annotation.Nullable String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Acquisition profile used for operations on this card
   * @return profile
   */
  @javax.annotation.Nullable
  public String getProfile() {
    return profile;
  }

  public void setProfile(@javax.annotation.Nullable String profile) {
    this.profile = profile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopupCardsTopupCardsInner topupCardsTopupCardsInner = (TopupCardsTopupCardsInner) o;
    return Objects.equals(this.topupCardId, topupCardsTopupCardsInner.topupCardId) &&
        Objects.equals(this.token, topupCardsTopupCardsInner.token) &&
        Objects.equals(this.userId, topupCardsTopupCardsInner.userId) &&
        Objects.equals(this.brand, topupCardsTopupCardsInner.brand) &&
        Objects.equals(this.maskedPan, topupCardsTopupCardsInner.maskedPan) &&
        Objects.equals(this.cardHolder, topupCardsTopupCardsInner.cardHolder) &&
        Objects.equals(this.cardExpiryMonth, topupCardsTopupCardsInner.cardExpiryMonth) &&
        Objects.equals(this.cardExpiryYear, topupCardsTopupCardsInner.cardExpiryYear) &&
        Objects.equals(this.issuer, topupCardsTopupCardsInner.issuer) &&
        Objects.equals(this.country, topupCardsTopupCardsInner.country) &&
        Objects.equals(this.domesticNetwork, topupCardsTopupCardsInner.domesticNetwork) &&
        Objects.equals(this.cardType, topupCardsTopupCardsInner.cardType) &&
        Objects.equals(this.createdDate, topupCardsTopupCardsInner.createdDate) &&
        Objects.equals(this.updatedDate, topupCardsTopupCardsInner.updatedDate) &&
        Objects.equals(this.status, topupCardsTopupCardsInner.status) &&
        Objects.equals(this.providerName, topupCardsTopupCardsInner.providerName) &&
        Objects.equals(this.profile, topupCardsTopupCardsInner.profile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topupCardId, token, userId, brand, maskedPan, cardHolder, cardExpiryMonth, cardExpiryYear, issuer, country, domesticNetwork, cardType, createdDate, updatedDate, status, providerName, profile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopupCardsTopupCardsInner {\n");
    sb.append("    topupCardId: ").append(toIndentedString(topupCardId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    maskedPan: ").append(toIndentedString(maskedPan)).append("\n");
    sb.append("    cardHolder: ").append(toIndentedString(cardHolder)).append("\n");
    sb.append("    cardExpiryMonth: ").append(toIndentedString(cardExpiryMonth)).append("\n");
    sb.append("    cardExpiryYear: ").append(toIndentedString(cardExpiryYear)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    domesticNetwork: ").append(toIndentedString(domesticNetwork)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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
    openapiFields.add("topupCardId");
    openapiFields.add("token");
    openapiFields.add("userId");
    openapiFields.add("brand");
    openapiFields.add("maskedPan");
    openapiFields.add("cardHolder");
    openapiFields.add("cardExpiryMonth");
    openapiFields.add("cardExpiryYear");
    openapiFields.add("issuer");
    openapiFields.add("country");
    openapiFields.add("domesticNetwork");
    openapiFields.add("cardType");
    openapiFields.add("createdDate");
    openapiFields.add("updatedDate");
    openapiFields.add("status");
    openapiFields.add("providerName");
    openapiFields.add("profile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TopupCardsTopupCardsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TopupCardsTopupCardsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopupCardsTopupCardsInner is not found in the empty JSON string", TopupCardsTopupCardsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TopupCardsTopupCardsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TopupCardsTopupCardsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("topupCardId") != null && !jsonObj.get("topupCardId").isJsonNull()) && !jsonObj.get("topupCardId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topupCardId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topupCardId").toString()));
      }
      if ((jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) && !jsonObj.get("token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token").toString()));
      }
      if ((jsonObj.get("userId") != null && !jsonObj.get("userId").isJsonNull()) && !jsonObj.get("userId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userId").toString()));
      }
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      if ((jsonObj.get("maskedPan") != null && !jsonObj.get("maskedPan").isJsonNull()) && !jsonObj.get("maskedPan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maskedPan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maskedPan").toString()));
      }
      if ((jsonObj.get("cardHolder") != null && !jsonObj.get("cardHolder").isJsonNull()) && !jsonObj.get("cardHolder").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardHolder` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardHolder").toString()));
      }
      if ((jsonObj.get("cardExpiryMonth") != null && !jsonObj.get("cardExpiryMonth").isJsonNull()) && !jsonObj.get("cardExpiryMonth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardExpiryMonth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardExpiryMonth").toString()));
      }
      if ((jsonObj.get("cardExpiryYear") != null && !jsonObj.get("cardExpiryYear").isJsonNull()) && !jsonObj.get("cardExpiryYear").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardExpiryYear` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardExpiryYear").toString()));
      }
      if ((jsonObj.get("issuer") != null && !jsonObj.get("issuer").isJsonNull()) && !jsonObj.get("issuer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuer").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("domesticNetwork") != null && !jsonObj.get("domesticNetwork").isJsonNull()) && !jsonObj.get("domesticNetwork").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `domesticNetwork` to be a primitive type in the JSON string but got `%s`", jsonObj.get("domesticNetwork").toString()));
      }
      if ((jsonObj.get("cardType") != null && !jsonObj.get("cardType").isJsonNull()) && !jsonObj.get("cardType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cardType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardType").toString()));
      }
      if ((jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) && !jsonObj.get("createdDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdDate").toString()));
      }
      if ((jsonObj.get("updatedDate") != null && !jsonObj.get("updatedDate").isJsonNull()) && !jsonObj.get("updatedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedDate").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        StatusEnum.validateJsonElement(jsonObj.get("status"));
      }
      if ((jsonObj.get("providerName") != null && !jsonObj.get("providerName").isJsonNull()) && !jsonObj.get("providerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `providerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("providerName").toString()));
      }
      if ((jsonObj.get("profile") != null && !jsonObj.get("profile").isJsonNull()) && !jsonObj.get("profile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopupCardsTopupCardsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopupCardsTopupCardsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopupCardsTopupCardsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopupCardsTopupCardsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TopupCardsTopupCardsInner>() {
           @Override
           public void write(JsonWriter out, TopupCardsTopupCardsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TopupCardsTopupCardsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TopupCardsTopupCardsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TopupCardsTopupCardsInner
   * @throws IOException if the JSON string is invalid with respect to TopupCardsTopupCardsInner
   */
  public static TopupCardsTopupCardsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopupCardsTopupCardsInner.class);
  }

  /**
   * Convert an instance of TopupCardsTopupCardsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

