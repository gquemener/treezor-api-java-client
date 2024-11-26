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
 * SimulateOperationsRequestOperations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class SimulateOperationsRequestOperations {
  public static final String SERIALIZED_NAME_PAYIN = "payin";
  @SerializedName(SERIALIZED_NAME_PAYIN)
  @javax.annotation.Nullable
  private Integer payin;

  public static final String SERIALIZED_NAME_PAYINREFUND = "payinrefund";
  @SerializedName(SERIALIZED_NAME_PAYINREFUND)
  @javax.annotation.Nullable
  private Integer payinrefund;

  public static final String SERIALIZED_NAME_PAYOUT = "payout";
  @SerializedName(SERIALIZED_NAME_PAYOUT)
  @javax.annotation.Nullable
  private Integer payout;

  public static final String SERIALIZED_NAME_PAYOUTREFUND = "payoutrefund";
  @SerializedName(SERIALIZED_NAME_PAYOUTREFUND)
  @javax.annotation.Nullable
  private Integer payoutrefund;

  public static final String SERIALIZED_NAME_TRANSFER = "transfer";
  @SerializedName(SERIALIZED_NAME_TRANSFER)
  @javax.annotation.Nullable
  private Integer transfer;

  public static final String SERIALIZED_NAME_TRANSFERREFUND = "transferrefund";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_TRANSFERREFUND)
  @javax.annotation.Nullable
  private Integer transferrefund;

  public static final String SERIALIZED_NAME_CARDTRANSACTION = "cardtransaction";
  @SerializedName(SERIALIZED_NAME_CARDTRANSACTION)
  @javax.annotation.Nullable
  private Integer cardtransaction;

  public SimulateOperationsRequestOperations() {
  }

  public SimulateOperationsRequestOperations payin(@javax.annotation.Nullable Integer payin) {
    this.payin = payin;
    return this;
  }

  /**
   * Get payin
   * @return payin
   */
  @javax.annotation.Nullable
  public Integer getPayin() {
    return payin;
  }

  public void setPayin(@javax.annotation.Nullable Integer payin) {
    this.payin = payin;
  }


  public SimulateOperationsRequestOperations payinrefund(@javax.annotation.Nullable Integer payinrefund) {
    this.payinrefund = payinrefund;
    return this;
  }

  /**
   * must be smaller or equal than payin
   * @return payinrefund
   */
  @javax.annotation.Nullable
  public Integer getPayinrefund() {
    return payinrefund;
  }

  public void setPayinrefund(@javax.annotation.Nullable Integer payinrefund) {
    this.payinrefund = payinrefund;
  }


  public SimulateOperationsRequestOperations payout(@javax.annotation.Nullable Integer payout) {
    this.payout = payout;
    return this;
  }

  /**
   * Get payout
   * @return payout
   */
  @javax.annotation.Nullable
  public Integer getPayout() {
    return payout;
  }

  public void setPayout(@javax.annotation.Nullable Integer payout) {
    this.payout = payout;
  }


  public SimulateOperationsRequestOperations payoutrefund(@javax.annotation.Nullable Integer payoutrefund) {
    this.payoutrefund = payoutrefund;
    return this;
  }

  /**
   * must be smaller or equal than payout
   * @return payoutrefund
   */
  @javax.annotation.Nullable
  public Integer getPayoutrefund() {
    return payoutrefund;
  }

  public void setPayoutrefund(@javax.annotation.Nullable Integer payoutrefund) {
    this.payoutrefund = payoutrefund;
  }


  public SimulateOperationsRequestOperations transfer(@javax.annotation.Nullable Integer transfer) {
    this.transfer = transfer;
    return this;
  }

  /**
   * Get transfer
   * @return transfer
   */
  @javax.annotation.Nullable
  public Integer getTransfer() {
    return transfer;
  }

  public void setTransfer(@javax.annotation.Nullable Integer transfer) {
    this.transfer = transfer;
  }


  @Deprecated
  public SimulateOperationsRequestOperations transferrefund(@javax.annotation.Nullable Integer transferrefund) {
    this.transferrefund = transferrefund;
    return this;
  }

  /**
   * must be smaller or equal than transfer
   * @return transferrefund
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public Integer getTransferrefund() {
    return transferrefund;
  }

  @Deprecated
  public void setTransferrefund(@javax.annotation.Nullable Integer transferrefund) {
    this.transferrefund = transferrefund;
  }


  public SimulateOperationsRequestOperations cardtransaction(@javax.annotation.Nullable Integer cardtransaction) {
    this.cardtransaction = cardtransaction;
    return this;
  }

  /**
   * Get cardtransaction
   * @return cardtransaction
   */
  @javax.annotation.Nullable
  public Integer getCardtransaction() {
    return cardtransaction;
  }

  public void setCardtransaction(@javax.annotation.Nullable Integer cardtransaction) {
    this.cardtransaction = cardtransaction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulateOperationsRequestOperations simulateOperationsRequestOperations = (SimulateOperationsRequestOperations) o;
    return Objects.equals(this.payin, simulateOperationsRequestOperations.payin) &&
        Objects.equals(this.payinrefund, simulateOperationsRequestOperations.payinrefund) &&
        Objects.equals(this.payout, simulateOperationsRequestOperations.payout) &&
        Objects.equals(this.payoutrefund, simulateOperationsRequestOperations.payoutrefund) &&
        Objects.equals(this.transfer, simulateOperationsRequestOperations.transfer) &&
        Objects.equals(this.transferrefund, simulateOperationsRequestOperations.transferrefund) &&
        Objects.equals(this.cardtransaction, simulateOperationsRequestOperations.cardtransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payin, payinrefund, payout, payoutrefund, transfer, transferrefund, cardtransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulateOperationsRequestOperations {\n");
    sb.append("    payin: ").append(toIndentedString(payin)).append("\n");
    sb.append("    payinrefund: ").append(toIndentedString(payinrefund)).append("\n");
    sb.append("    payout: ").append(toIndentedString(payout)).append("\n");
    sb.append("    payoutrefund: ").append(toIndentedString(payoutrefund)).append("\n");
    sb.append("    transfer: ").append(toIndentedString(transfer)).append("\n");
    sb.append("    transferrefund: ").append(toIndentedString(transferrefund)).append("\n");
    sb.append("    cardtransaction: ").append(toIndentedString(cardtransaction)).append("\n");
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
    openapiFields.add("payin");
    openapiFields.add("payinrefund");
    openapiFields.add("payout");
    openapiFields.add("payoutrefund");
    openapiFields.add("transfer");
    openapiFields.add("transferrefund");
    openapiFields.add("cardtransaction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SimulateOperationsRequestOperations
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimulateOperationsRequestOperations.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimulateOperationsRequestOperations is not found in the empty JSON string", SimulateOperationsRequestOperations.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SimulateOperationsRequestOperations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimulateOperationsRequestOperations` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimulateOperationsRequestOperations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimulateOperationsRequestOperations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimulateOperationsRequestOperations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimulateOperationsRequestOperations.class));

       return (TypeAdapter<T>) new TypeAdapter<SimulateOperationsRequestOperations>() {
           @Override
           public void write(JsonWriter out, SimulateOperationsRequestOperations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimulateOperationsRequestOperations read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SimulateOperationsRequestOperations given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SimulateOperationsRequestOperations
   * @throws IOException if the JSON string is invalid with respect to SimulateOperationsRequestOperations
   */
  public static SimulateOperationsRequestOperations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimulateOperationsRequestOperations.class);
  }

  /**
   * Convert an instance of SimulateOperationsRequestOperations to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

