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
 * GetTransactions200ResponseTransactionsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class GetTransactions200ResponseTransactionsInner {
  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  @javax.annotation.Nullable
  private Integer transactionId;

  public static final String SERIALIZED_NAME_WALLET_DEBIT_ID = "walletDebitId";
  @SerializedName(SERIALIZED_NAME_WALLET_DEBIT_ID)
  @javax.annotation.Nullable
  private Integer walletDebitId;

  public static final String SERIALIZED_NAME_WALLET_CREDIT_ID = "walletCreditId";
  @SerializedName(SERIALIZED_NAME_WALLET_CREDIT_ID)
  @javax.annotation.Nullable
  private Integer walletCreditId;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  @javax.annotation.Nullable
  private String transactionType;

  public static final String SERIALIZED_NAME_FOREIGN_ID = "foreignId";
  @SerializedName(SERIALIZED_NAME_FOREIGN_ID)
  @javax.annotation.Nullable
  private Integer foreignId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_VALUE_DATE = "valueDate";
  @SerializedName(SERIALIZED_NAME_VALUE_DATE)
  @javax.annotation.Nullable
  private String valueDate;

  public static final String SERIALIZED_NAME_EXECUTION_DATE = "executionDate";
  @SerializedName(SERIALIZED_NAME_EXECUTION_DATE)
  @javax.annotation.Nullable
  private String executionDate;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private String amount;

  public static final String SERIALIZED_NAME_WALLET_DEBIT_BALANCE = "walletDebitBalance";
  @SerializedName(SERIALIZED_NAME_WALLET_DEBIT_BALANCE)
  @javax.annotation.Nullable
  private String walletDebitBalance;

  public static final String SERIALIZED_NAME_WALLET_CREDIT_BALANCE = "walletCreditBalance";
  @SerializedName(SERIALIZED_NAME_WALLET_CREDIT_BALANCE)
  @javax.annotation.Nullable
  private String walletCreditBalance;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  @javax.annotation.Nullable
  private String createdDate;

  public static final String SERIALIZED_NAME_TOTAL_ROWS = "totalRows";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROWS)
  @javax.annotation.Nullable
  private Integer totalRows;

  public GetTransactions200ResponseTransactionsInner() {
  }

  public GetTransactions200ResponseTransactionsInner transactionId(@javax.annotation.Nullable Integer transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * Get transactionId
   * @return transactionId
   */
  @javax.annotation.Nullable
  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(@javax.annotation.Nullable Integer transactionId) {
    this.transactionId = transactionId;
  }


  public GetTransactions200ResponseTransactionsInner walletDebitId(@javax.annotation.Nullable Integer walletDebitId) {
    this.walletDebitId = walletDebitId;
    return this;
  }

  /**
   * Get walletDebitId
   * @return walletDebitId
   */
  @javax.annotation.Nullable
  public Integer getWalletDebitId() {
    return walletDebitId;
  }

  public void setWalletDebitId(@javax.annotation.Nullable Integer walletDebitId) {
    this.walletDebitId = walletDebitId;
  }


  public GetTransactions200ResponseTransactionsInner walletCreditId(@javax.annotation.Nullable Integer walletCreditId) {
    this.walletCreditId = walletCreditId;
    return this;
  }

  /**
   * Get walletCreditId
   * @return walletCreditId
   */
  @javax.annotation.Nullable
  public Integer getWalletCreditId() {
    return walletCreditId;
  }

  public void setWalletCreditId(@javax.annotation.Nullable Integer walletCreditId) {
    this.walletCreditId = walletCreditId;
  }


  public GetTransactions200ResponseTransactionsInner transactionType(@javax.annotation.Nullable String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Get transactionType
   * @return transactionType
   */
  @javax.annotation.Nullable
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(@javax.annotation.Nullable String transactionType) {
    this.transactionType = transactionType;
  }


  public GetTransactions200ResponseTransactionsInner foreignId(@javax.annotation.Nullable Integer foreignId) {
    this.foreignId = foreignId;
    return this;
  }

  /**
   * Get foreignId
   * @return foreignId
   */
  @javax.annotation.Nullable
  public Integer getForeignId() {
    return foreignId;
  }

  public void setForeignId(@javax.annotation.Nullable Integer foreignId) {
    this.foreignId = foreignId;
  }


  public GetTransactions200ResponseTransactionsInner name(@javax.annotation.Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public GetTransactions200ResponseTransactionsInner description(@javax.annotation.Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public GetTransactions200ResponseTransactionsInner valueDate(@javax.annotation.Nullable String valueDate) {
    this.valueDate = valueDate;
    return this;
  }

  /**
   * Date YYYY-MM-DD
   * @return valueDate
   */
  @javax.annotation.Nullable
  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(@javax.annotation.Nullable String valueDate) {
    this.valueDate = valueDate;
  }


  public GetTransactions200ResponseTransactionsInner executionDate(@javax.annotation.Nullable String executionDate) {
    this.executionDate = executionDate;
    return this;
  }

  /**
   * Date YYYY-MM-DD
   * @return executionDate
   */
  @javax.annotation.Nullable
  public String getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(@javax.annotation.Nullable String executionDate) {
    this.executionDate = executionDate;
  }


  public GetTransactions200ResponseTransactionsInner amount(@javax.annotation.Nullable String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   */
  @javax.annotation.Nullable
  public String getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable String amount) {
    this.amount = amount;
  }


  public GetTransactions200ResponseTransactionsInner walletDebitBalance(@javax.annotation.Nullable String walletDebitBalance) {
    this.walletDebitBalance = walletDebitBalance;
    return this;
  }

  /**
   * Get walletDebitBalance
   * @return walletDebitBalance
   */
  @javax.annotation.Nullable
  public String getWalletDebitBalance() {
    return walletDebitBalance;
  }

  public void setWalletDebitBalance(@javax.annotation.Nullable String walletDebitBalance) {
    this.walletDebitBalance = walletDebitBalance;
  }


  public GetTransactions200ResponseTransactionsInner walletCreditBalance(@javax.annotation.Nullable String walletCreditBalance) {
    this.walletCreditBalance = walletCreditBalance;
    return this;
  }

  /**
   * Get walletCreditBalance
   * @return walletCreditBalance
   */
  @javax.annotation.Nullable
  public String getWalletCreditBalance() {
    return walletCreditBalance;
  }

  public void setWalletCreditBalance(@javax.annotation.Nullable String walletCreditBalance) {
    this.walletCreditBalance = walletCreditBalance;
  }


  public GetTransactions200ResponseTransactionsInner currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public GetTransactions200ResponseTransactionsInner createdDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Date YYYY-MM-DD HH:MM:SS
   * @return createdDate
   */
  @javax.annotation.Nullable
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
  }


  public GetTransactions200ResponseTransactionsInner totalRows(@javax.annotation.Nullable Integer totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  /**
   * Get totalRows
   * @return totalRows
   */
  @javax.annotation.Nullable
  public Integer getTotalRows() {
    return totalRows;
  }

  public void setTotalRows(@javax.annotation.Nullable Integer totalRows) {
    this.totalRows = totalRows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransactions200ResponseTransactionsInner getTransactions200ResponseTransactionsInner = (GetTransactions200ResponseTransactionsInner) o;
    return Objects.equals(this.transactionId, getTransactions200ResponseTransactionsInner.transactionId) &&
        Objects.equals(this.walletDebitId, getTransactions200ResponseTransactionsInner.walletDebitId) &&
        Objects.equals(this.walletCreditId, getTransactions200ResponseTransactionsInner.walletCreditId) &&
        Objects.equals(this.transactionType, getTransactions200ResponseTransactionsInner.transactionType) &&
        Objects.equals(this.foreignId, getTransactions200ResponseTransactionsInner.foreignId) &&
        Objects.equals(this.name, getTransactions200ResponseTransactionsInner.name) &&
        Objects.equals(this.description, getTransactions200ResponseTransactionsInner.description) &&
        Objects.equals(this.valueDate, getTransactions200ResponseTransactionsInner.valueDate) &&
        Objects.equals(this.executionDate, getTransactions200ResponseTransactionsInner.executionDate) &&
        Objects.equals(this.amount, getTransactions200ResponseTransactionsInner.amount) &&
        Objects.equals(this.walletDebitBalance, getTransactions200ResponseTransactionsInner.walletDebitBalance) &&
        Objects.equals(this.walletCreditBalance, getTransactions200ResponseTransactionsInner.walletCreditBalance) &&
        Objects.equals(this.currency, getTransactions200ResponseTransactionsInner.currency) &&
        Objects.equals(this.createdDate, getTransactions200ResponseTransactionsInner.createdDate) &&
        Objects.equals(this.totalRows, getTransactions200ResponseTransactionsInner.totalRows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, walletDebitId, walletCreditId, transactionType, foreignId, name, description, valueDate, executionDate, amount, walletDebitBalance, walletCreditBalance, currency, createdDate, totalRows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactions200ResponseTransactionsInner {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    walletDebitId: ").append(toIndentedString(walletDebitId)).append("\n");
    sb.append("    walletCreditId: ").append(toIndentedString(walletCreditId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    foreignId: ").append(toIndentedString(foreignId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    walletDebitBalance: ").append(toIndentedString(walletDebitBalance)).append("\n");
    sb.append("    walletCreditBalance: ").append(toIndentedString(walletCreditBalance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
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
    openapiFields.add("transactionId");
    openapiFields.add("walletDebitId");
    openapiFields.add("walletCreditId");
    openapiFields.add("transactionType");
    openapiFields.add("foreignId");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("valueDate");
    openapiFields.add("executionDate");
    openapiFields.add("amount");
    openapiFields.add("walletDebitBalance");
    openapiFields.add("walletCreditBalance");
    openapiFields.add("currency");
    openapiFields.add("createdDate");
    openapiFields.add("totalRows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetTransactions200ResponseTransactionsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTransactions200ResponseTransactionsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTransactions200ResponseTransactionsInner is not found in the empty JSON string", GetTransactions200ResponseTransactionsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetTransactions200ResponseTransactionsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetTransactions200ResponseTransactionsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("transactionType") != null && !jsonObj.get("transactionType").isJsonNull()) && !jsonObj.get("transactionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transactionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transactionType").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("valueDate") != null && !jsonObj.get("valueDate").isJsonNull()) && !jsonObj.get("valueDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `valueDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("valueDate").toString()));
      }
      if ((jsonObj.get("executionDate") != null && !jsonObj.get("executionDate").isJsonNull()) && !jsonObj.get("executionDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `executionDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("executionDate").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("walletDebitBalance") != null && !jsonObj.get("walletDebitBalance").isJsonNull()) && !jsonObj.get("walletDebitBalance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletDebitBalance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletDebitBalance").toString()));
      }
      if ((jsonObj.get("walletCreditBalance") != null && !jsonObj.get("walletCreditBalance").isJsonNull()) && !jsonObj.get("walletCreditBalance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletCreditBalance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletCreditBalance").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) && !jsonObj.get("createdDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTransactions200ResponseTransactionsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTransactions200ResponseTransactionsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTransactions200ResponseTransactionsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTransactions200ResponseTransactionsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTransactions200ResponseTransactionsInner>() {
           @Override
           public void write(JsonWriter out, GetTransactions200ResponseTransactionsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetTransactions200ResponseTransactionsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetTransactions200ResponseTransactionsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetTransactions200ResponseTransactionsInner
   * @throws IOException if the JSON string is invalid with respect to GetTransactions200ResponseTransactionsInner
   */
  public static GetTransactions200ResponseTransactionsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTransactions200ResponseTransactionsInner.class);
  }

  /**
   * Convert an instance of GetTransactions200ResponseTransactionsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

