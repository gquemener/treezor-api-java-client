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
import java.math.BigDecimal;
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
 * PostScheduledPaymentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class PostScheduledPaymentRequest {
  public static final String SERIALIZED_NAME_SCHEDULED_PAYMENT_NAME = "scheduledPaymentName";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_PAYMENT_NAME)
  @javax.annotation.Nullable
  private String scheduledPaymentName;

  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  @javax.annotation.Nonnull
  private Integer walletId;

  /**
   * The type of beneficiary for the operation, which can be: * &#x60;payout&#x60; – The Scheduled Payment targets an external account. * &#x60;walletTransfer&#x60; – The Scheduled Payment targets another Wallet in your Treezor environment. 
   */
  @JsonAdapter(BeneficiaryTypeEnum.Adapter.class)
  public enum BeneficiaryTypeEnum {
    PAYOUT("payout"),
    
    WALLET_TRANSFER("walletTransfer");

    private String value;

    BeneficiaryTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BeneficiaryTypeEnum fromValue(String value) {
      for (BeneficiaryTypeEnum b : BeneficiaryTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BeneficiaryTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BeneficiaryTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BeneficiaryTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BeneficiaryTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      BeneficiaryTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_BENEFICIARY_TYPE = "beneficiaryType";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_TYPE)
  @javax.annotation.Nonnull
  private BeneficiaryTypeEnum beneficiaryType;

  public static final String SERIALIZED_NAME_BENEFICIARY = "beneficiary";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY)
  @javax.annotation.Nonnull
  private Integer beneficiary;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nonnull
  private BigDecimal amount;

  /**
   * The type of Scheduled Payment, which can be:  * &#x60;oneshot&#x60; – The payment will occur only once. * &#x60;periodic&#x60; – The payment will occur periodically over a defined timeframe. 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ONESHOT("oneshot"),
    
    PERIODIC("periodic");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  @javax.annotation.Nonnull
  private TypeEnum type;

  public static final String SERIALIZED_NAME_EXEC_AT = "execAt";
  @SerializedName(SERIALIZED_NAME_EXEC_AT)
  @javax.annotation.Nullable
  private String execAt;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  @javax.annotation.Nullable
  private String startAt;

  public static final String SERIALIZED_NAME_END_AT = "endAt";
  @SerializedName(SERIALIZED_NAME_END_AT)
  @javax.annotation.Nullable
  private String endAt;

  /**
   * The frequency at which a &#x60;periodic&#x60; Scheduled Payment is to occur. 
   */
  @JsonAdapter(PeriodEnum.Adapter.class)
  public enum PeriodEnum {
    WEEKLY("weekly"),
    
    MONTHLY("monthly"),
    
    QUARTERLY("quarterly"),
    
    BI_ANNUAL("bi-annual"),
    
    ANNUAL("annual");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PeriodEnum fromValue(String value) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PeriodEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      PeriodEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  @javax.annotation.Nullable
  private PeriodEnum period;

  public static final String SERIALIZED_NAME_BENEFICIARY_LABEL = "beneficiaryLabel";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_LABEL)
  @javax.annotation.Nullable
  private String beneficiaryLabel;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nonnull
  private String currency;

  public static final String SERIALIZED_NAME_END_TO_END_ID = "endToEndId";
  @SerializedName(SERIALIZED_NAME_END_TO_END_ID)
  @javax.annotation.Nullable
  private String endToEndId;

  public PostScheduledPaymentRequest() {
  }

  public PostScheduledPaymentRequest scheduledPaymentName(@javax.annotation.Nullable String scheduledPaymentName) {
    this.scheduledPaymentName = scheduledPaymentName;
    return this;
  }

  /**
   * The label describing the goal of the Scheduled Payment.
   * @return scheduledPaymentName
   */
  @javax.annotation.Nullable
  public String getScheduledPaymentName() {
    return scheduledPaymentName;
  }

  public void setScheduledPaymentName(@javax.annotation.Nullable String scheduledPaymentName) {
    this.scheduledPaymentName = scheduledPaymentName;
  }


  public PostScheduledPaymentRequest walletId(@javax.annotation.Nonnull Integer walletId) {
    this.walletId = walletId;
    return this;
  }

  /**
   * The unique identifier of the Wallet to debit.
   * @return walletId
   */
  @javax.annotation.Nonnull
  public Integer getWalletId() {
    return walletId;
  }

  public void setWalletId(@javax.annotation.Nonnull Integer walletId) {
    this.walletId = walletId;
  }


  public PostScheduledPaymentRequest beneficiaryType(@javax.annotation.Nonnull BeneficiaryTypeEnum beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
    return this;
  }

  /**
   * The type of beneficiary for the operation, which can be: * &#x60;payout&#x60; – The Scheduled Payment targets an external account. * &#x60;walletTransfer&#x60; – The Scheduled Payment targets another Wallet in your Treezor environment. 
   * @return beneficiaryType
   */
  @javax.annotation.Nonnull
  public BeneficiaryTypeEnum getBeneficiaryType() {
    return beneficiaryType;
  }

  public void setBeneficiaryType(@javax.annotation.Nonnull BeneficiaryTypeEnum beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
  }


  public PostScheduledPaymentRequest beneficiary(@javax.annotation.Nonnull Integer beneficiary) {
    this.beneficiary = beneficiary;
    return this;
  }

  /**
   * The unique identifier of the beneficiary of the Scheduled Payment, which can be either &#x60;beneficiaryId&#x60; for Payouts or &#x60;beneficiaryWalletId&#x60; for Wallet-to-Wallet transfers. 
   * @return beneficiary
   */
  @javax.annotation.Nonnull
  public Integer getBeneficiary() {
    return beneficiary;
  }

  public void setBeneficiary(@javax.annotation.Nonnull Integer beneficiary) {
    this.beneficiary = beneficiary;
  }


  public PostScheduledPaymentRequest amount(@javax.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the Scheduled Payment.
   * @return amount
   */
  @javax.annotation.Nonnull
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nonnull BigDecimal amount) {
    this.amount = amount;
  }


  public PostScheduledPaymentRequest type(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of Scheduled Payment, which can be:  * &#x60;oneshot&#x60; – The payment will occur only once. * &#x60;periodic&#x60; – The payment will occur periodically over a defined timeframe. 
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(@javax.annotation.Nonnull TypeEnum type) {
    this.type = type;
  }


  public PostScheduledPaymentRequest execAt(@javax.annotation.Nullable String execAt) {
    this.execAt = execAt;
    return this;
  }

  /**
   * The date on which the a &#x60;oneshot&#x60; Scheduled Payment is to be executed. This date must be set at least one day in the future. Format: YYYY-MM-DD. 
   * @return execAt
   */
  @javax.annotation.Nullable
  public String getExecAt() {
    return execAt;
  }

  public void setExecAt(@javax.annotation.Nullable String execAt) {
    this.execAt = execAt;
  }


  public PostScheduledPaymentRequest startAt(@javax.annotation.Nullable String startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * The date from which a &#x60;periodic&#x60; Scheduled Payment execution starts. This date must be set at least one day in the future. Format: YYYY-MM-DD. 
   * @return startAt
   */
  @javax.annotation.Nullable
  public String getStartAt() {
    return startAt;
  }

  public void setStartAt(@javax.annotation.Nullable String startAt) {
    this.startAt = startAt;
  }


  public PostScheduledPaymentRequest endAt(@javax.annotation.Nullable String endAt) {
    this.endAt = endAt;
    return this;
  }

  /**
   * The date on which a &#x60;periodic&#x60; Scheduled Payment ends. This date must be set after the &#x60;startAt&#x60; date. Format: YYYY-MM-DD. 
   * @return endAt
   */
  @javax.annotation.Nullable
  public String getEndAt() {
    return endAt;
  }

  public void setEndAt(@javax.annotation.Nullable String endAt) {
    this.endAt = endAt;
  }


  public PostScheduledPaymentRequest period(@javax.annotation.Nullable PeriodEnum period) {
    this.period = period;
    return this;
  }

  /**
   * The frequency at which a &#x60;periodic&#x60; Scheduled Payment is to occur. 
   * @return period
   */
  @javax.annotation.Nullable
  public PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(@javax.annotation.Nullable PeriodEnum period) {
    this.period = period;
  }


  public PostScheduledPaymentRequest beneficiaryLabel(@javax.annotation.Nullable String beneficiaryLabel) {
    this.beneficiaryLabel = beneficiaryLabel;
    return this;
  }

  /**
   * The label that will be displayed for the Scheduled Payments, regardless of the type. Max. 140 characters.
   * @return beneficiaryLabel
   */
  @javax.annotation.Nullable
  public String getBeneficiaryLabel() {
    return beneficiaryLabel;
  }

  public void setBeneficiaryLabel(@javax.annotation.Nullable String beneficiaryLabel) {
    this.beneficiaryLabel = beneficiaryLabel;
  }


  public PostScheduledPaymentRequest currency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency of the Scheduled Payments (ISO-4217). Can only be &#x60;EUR&#x60;. 
   * @return currency
   */
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nonnull String currency) {
    this.currency = currency;
  }


  public PostScheduledPaymentRequest endToEndId(@javax.annotation.Nullable String endToEndId) {
    this.endToEndId = endToEndId;
    return this;
  }

  /**
   * The end-to-end identifier, for Payouts only.  Max. 24 characters.
   * @return endToEndId
   */
  @javax.annotation.Nullable
  public String getEndToEndId() {
    return endToEndId;
  }

  public void setEndToEndId(@javax.annotation.Nullable String endToEndId) {
    this.endToEndId = endToEndId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostScheduledPaymentRequest postScheduledPaymentRequest = (PostScheduledPaymentRequest) o;
    return Objects.equals(this.scheduledPaymentName, postScheduledPaymentRequest.scheduledPaymentName) &&
        Objects.equals(this.walletId, postScheduledPaymentRequest.walletId) &&
        Objects.equals(this.beneficiaryType, postScheduledPaymentRequest.beneficiaryType) &&
        Objects.equals(this.beneficiary, postScheduledPaymentRequest.beneficiary) &&
        Objects.equals(this.amount, postScheduledPaymentRequest.amount) &&
        Objects.equals(this.type, postScheduledPaymentRequest.type) &&
        Objects.equals(this.execAt, postScheduledPaymentRequest.execAt) &&
        Objects.equals(this.startAt, postScheduledPaymentRequest.startAt) &&
        Objects.equals(this.endAt, postScheduledPaymentRequest.endAt) &&
        Objects.equals(this.period, postScheduledPaymentRequest.period) &&
        Objects.equals(this.beneficiaryLabel, postScheduledPaymentRequest.beneficiaryLabel) &&
        Objects.equals(this.currency, postScheduledPaymentRequest.currency) &&
        Objects.equals(this.endToEndId, postScheduledPaymentRequest.endToEndId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledPaymentName, walletId, beneficiaryType, beneficiary, amount, type, execAt, startAt, endAt, period, beneficiaryLabel, currency, endToEndId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostScheduledPaymentRequest {\n");
    sb.append("    scheduledPaymentName: ").append(toIndentedString(scheduledPaymentName)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    beneficiaryType: ").append(toIndentedString(beneficiaryType)).append("\n");
    sb.append("    beneficiary: ").append(toIndentedString(beneficiary)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    execAt: ").append(toIndentedString(execAt)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    beneficiaryLabel: ").append(toIndentedString(beneficiaryLabel)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
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
    openapiFields.add("scheduledPaymentName");
    openapiFields.add("walletId");
    openapiFields.add("beneficiaryType");
    openapiFields.add("beneficiary");
    openapiFields.add("amount");
    openapiFields.add("type");
    openapiFields.add("execAt");
    openapiFields.add("startAt");
    openapiFields.add("endAt");
    openapiFields.add("period");
    openapiFields.add("beneficiaryLabel");
    openapiFields.add("currency");
    openapiFields.add("endToEndId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("walletId");
    openapiRequiredFields.add("beneficiaryType");
    openapiRequiredFields.add("beneficiary");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("currency");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PostScheduledPaymentRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PostScheduledPaymentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostScheduledPaymentRequest is not found in the empty JSON string", PostScheduledPaymentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PostScheduledPaymentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostScheduledPaymentRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PostScheduledPaymentRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("scheduledPaymentName") != null && !jsonObj.get("scheduledPaymentName").isJsonNull()) && !jsonObj.get("scheduledPaymentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scheduledPaymentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scheduledPaymentName").toString()));
      }
      if (!jsonObj.get("beneficiaryType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiaryType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiaryType").toString()));
      }
      // validate the required field `beneficiaryType`
      BeneficiaryTypeEnum.validateJsonElement(jsonObj.get("beneficiaryType"));
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if ((jsonObj.get("execAt") != null && !jsonObj.get("execAt").isJsonNull()) && !jsonObj.get("execAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `execAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("execAt").toString()));
      }
      if ((jsonObj.get("startAt") != null && !jsonObj.get("startAt").isJsonNull()) && !jsonObj.get("startAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startAt").toString()));
      }
      if ((jsonObj.get("endAt") != null && !jsonObj.get("endAt").isJsonNull()) && !jsonObj.get("endAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endAt").toString()));
      }
      if ((jsonObj.get("period") != null && !jsonObj.get("period").isJsonNull()) && !jsonObj.get("period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("period").toString()));
      }
      // validate the optional field `period`
      if (jsonObj.get("period") != null && !jsonObj.get("period").isJsonNull()) {
        PeriodEnum.validateJsonElement(jsonObj.get("period"));
      }
      if ((jsonObj.get("beneficiaryLabel") != null && !jsonObj.get("beneficiaryLabel").isJsonNull()) && !jsonObj.get("beneficiaryLabel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiaryLabel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiaryLabel").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("endToEndId") != null && !jsonObj.get("endToEndId").isJsonNull()) && !jsonObj.get("endToEndId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endToEndId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endToEndId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostScheduledPaymentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostScheduledPaymentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostScheduledPaymentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostScheduledPaymentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PostScheduledPaymentRequest>() {
           @Override
           public void write(JsonWriter out, PostScheduledPaymentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostScheduledPaymentRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PostScheduledPaymentRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PostScheduledPaymentRequest
   * @throws IOException if the JSON string is invalid with respect to PostScheduledPaymentRequest
   */
  public static PostScheduledPaymentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostScheduledPaymentRequest.class);
  }

  /**
   * Convert an instance of PostScheduledPaymentRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

