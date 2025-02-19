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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Payout
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class Payout {
  public static final String SERIALIZED_NAME_PAYOUT_TAG = "payoutTag";
  @SerializedName(SERIALIZED_NAME_PAYOUT_TAG)
  @javax.annotation.Nullable
  private String payoutTag;

  public static final String SERIALIZED_NAME_BENEFICIARY_ID = "beneficiaryId";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_ID)
  @javax.annotation.Nullable
  private String beneficiaryId;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_CODE_STATUS = "codeStatus";
  @SerializedName(SERIALIZED_NAME_CODE_STATUS)
  @javax.annotation.Nullable
  private String codeStatus;

  public static final String SERIALIZED_NAME_INFORMATION_STATUS = "informationStatus";
  @SerializedName(SERIALIZED_NAME_INFORMATION_STATUS)
  @javax.annotation.Nullable
  private String informationStatus;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  @javax.annotation.Nullable
  private String description;

  public static final String SERIALIZED_NAME_PAYOUT_TYPE_ID = "payoutTypeId";
  @SerializedName(SERIALIZED_NAME_PAYOUT_TYPE_ID)
  @javax.annotation.Nullable
  private String payoutTypeId;

  public static final String SERIALIZED_NAME_UNIQUE_MANDATE_REFERENCE = "uniqueMandateReference";
  @SerializedName(SERIALIZED_NAME_UNIQUE_MANDATE_REFERENCE)
  @javax.annotation.Nullable
  private String uniqueMandateReference;

  public static final String SERIALIZED_NAME_SUPPORTING_FILE_LINK = "supportingFileLink";
  @SerializedName(SERIALIZED_NAME_SUPPORTING_FILE_LINK)
  @javax.annotation.Nullable
  private String supportingFileLink;

  public static final String SERIALIZED_NAME_END_TO_END_ID = "endToEndId";
  @SerializedName(SERIALIZED_NAME_END_TO_END_ID)
  @javax.annotation.Nullable
  private String endToEndId;

  public static final String SERIALIZED_NAME_REASON_CODE = "reasonCode";
  @SerializedName(SERIALIZED_NAME_REASON_CODE)
  @javax.annotation.Nullable
  private String reasonCode;

  public static final String SERIALIZED_NAME_REASON_DESCRIPTION = "reasonDescription";
  @SerializedName(SERIALIZED_NAME_REASON_DESCRIPTION)
  @javax.annotation.Nullable
  private String reasonDescription;

  public static final String SERIALIZED_NAME_BENEFICIARY_NAME = "beneficiaryName";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_NAME)
  @javax.annotation.Nullable
  private String beneficiaryName;

  public Payout() {
  }

  public Payout payoutTag(@javax.annotation.Nullable String payoutTag) {
    this.payoutTag = payoutTag;
    return this;
  }

  /**
   * Get payoutTag
   * @return payoutTag
   */
  @javax.annotation.Nullable
  public String getPayoutTag() {
    return payoutTag;
  }

  public void setPayoutTag(@javax.annotation.Nullable String payoutTag) {
    this.payoutTag = payoutTag;
  }


  public Payout beneficiaryId(@javax.annotation.Nullable String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
    return this;
  }

  /**
   * Get beneficiaryId
   * @return beneficiaryId
   */
  @javax.annotation.Nullable
  public String getBeneficiaryId() {
    return beneficiaryId;
  }

  public void setBeneficiaryId(@javax.annotation.Nullable String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }


  public Payout label(@javax.annotation.Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
   */
  @javax.annotation.Nullable
  public String getLabel() {
    return label;
  }

  public void setLabel(@javax.annotation.Nullable String label) {
    this.label = label;
  }


  public Payout codeStatus(@javax.annotation.Nullable String codeStatus) {
    this.codeStatus = codeStatus;
    return this;
  }

  /**
   * Get codeStatus
   * @return codeStatus
   */
  @javax.annotation.Nullable
  public String getCodeStatus() {
    return codeStatus;
  }

  public void setCodeStatus(@javax.annotation.Nullable String codeStatus) {
    this.codeStatus = codeStatus;
  }


  public Payout informationStatus(@javax.annotation.Nullable String informationStatus) {
    this.informationStatus = informationStatus;
    return this;
  }

  /**
   * Get informationStatus
   * @return informationStatus
   */
  @javax.annotation.Nullable
  public String getInformationStatus() {
    return informationStatus;
  }

  public void setInformationStatus(@javax.annotation.Nullable String informationStatus) {
    this.informationStatus = informationStatus;
  }


  public Payout description(@javax.annotation.Nullable String description) {
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


  public Payout payoutTypeId(@javax.annotation.Nullable String payoutTypeId) {
    this.payoutTypeId = payoutTypeId;
    return this;
  }

  /**
   * Get payoutTypeId
   * @return payoutTypeId
   */
  @javax.annotation.Nullable
  public String getPayoutTypeId() {
    return payoutTypeId;
  }

  public void setPayoutTypeId(@javax.annotation.Nullable String payoutTypeId) {
    this.payoutTypeId = payoutTypeId;
  }


  public Payout uniqueMandateReference(@javax.annotation.Nullable String uniqueMandateReference) {
    this.uniqueMandateReference = uniqueMandateReference;
    return this;
  }

  /**
   * Get uniqueMandateReference
   * @return uniqueMandateReference
   */
  @javax.annotation.Nullable
  public String getUniqueMandateReference() {
    return uniqueMandateReference;
  }

  public void setUniqueMandateReference(@javax.annotation.Nullable String uniqueMandateReference) {
    this.uniqueMandateReference = uniqueMandateReference;
  }


  public Payout supportingFileLink(@javax.annotation.Nullable String supportingFileLink) {
    this.supportingFileLink = supportingFileLink;
    return this;
  }

  /**
   * Get supportingFileLink
   * @return supportingFileLink
   */
  @javax.annotation.Nullable
  public String getSupportingFileLink() {
    return supportingFileLink;
  }

  public void setSupportingFileLink(@javax.annotation.Nullable String supportingFileLink) {
    this.supportingFileLink = supportingFileLink;
  }


  public Payout endToEndId(@javax.annotation.Nullable String endToEndId) {
    this.endToEndId = endToEndId;
    return this;
  }

  /**
   * Get endToEndId
   * @return endToEndId
   */
  @javax.annotation.Nullable
  public String getEndToEndId() {
    return endToEndId;
  }

  public void setEndToEndId(@javax.annotation.Nullable String endToEndId) {
    this.endToEndId = endToEndId;
  }


  public Payout reasonCode(@javax.annotation.Nullable String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

  /**
   * Get reasonCode
   * @return reasonCode
   */
  @javax.annotation.Nullable
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(@javax.annotation.Nullable String reasonCode) {
    this.reasonCode = reasonCode;
  }


  public Payout reasonDescription(@javax.annotation.Nullable String reasonDescription) {
    this.reasonDescription = reasonDescription;
    return this;
  }

  /**
   * Get reasonDescription
   * @return reasonDescription
   */
  @javax.annotation.Nullable
  public String getReasonDescription() {
    return reasonDescription;
  }

  public void setReasonDescription(@javax.annotation.Nullable String reasonDescription) {
    this.reasonDescription = reasonDescription;
  }


  public Payout beneficiaryName(@javax.annotation.Nullable String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

  /**
   * Get beneficiaryName
   * @return beneficiaryName
   */
  @javax.annotation.Nullable
  public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(@javax.annotation.Nullable String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payout payout = (Payout) o;
    return Objects.equals(this.payoutTag, payout.payoutTag) &&
        Objects.equals(this.beneficiaryId, payout.beneficiaryId) &&
        Objects.equals(this.label, payout.label) &&
        Objects.equals(this.codeStatus, payout.codeStatus) &&
        Objects.equals(this.informationStatus, payout.informationStatus) &&
        Objects.equals(this.description, payout.description) &&
        Objects.equals(this.payoutTypeId, payout.payoutTypeId) &&
        Objects.equals(this.uniqueMandateReference, payout.uniqueMandateReference) &&
        Objects.equals(this.supportingFileLink, payout.supportingFileLink) &&
        Objects.equals(this.endToEndId, payout.endToEndId) &&
        Objects.equals(this.reasonCode, payout.reasonCode) &&
        Objects.equals(this.reasonDescription, payout.reasonDescription) &&
        Objects.equals(this.beneficiaryName, payout.beneficiaryName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(payoutTag, beneficiaryId, label, codeStatus, informationStatus, description, payoutTypeId, uniqueMandateReference, supportingFileLink, endToEndId, reasonCode, reasonDescription, beneficiaryName);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Payout {\n");
    sb.append("    payoutTag: ").append(toIndentedString(payoutTag)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    codeStatus: ").append(toIndentedString(codeStatus)).append("\n");
    sb.append("    informationStatus: ").append(toIndentedString(informationStatus)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    payoutTypeId: ").append(toIndentedString(payoutTypeId)).append("\n");
    sb.append("    uniqueMandateReference: ").append(toIndentedString(uniqueMandateReference)).append("\n");
    sb.append("    supportingFileLink: ").append(toIndentedString(supportingFileLink)).append("\n");
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonDescription: ").append(toIndentedString(reasonDescription)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
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
    openapiFields.add("payoutTag");
    openapiFields.add("beneficiaryId");
    openapiFields.add("label");
    openapiFields.add("codeStatus");
    openapiFields.add("informationStatus");
    openapiFields.add("description");
    openapiFields.add("payoutTypeId");
    openapiFields.add("uniqueMandateReference");
    openapiFields.add("supportingFileLink");
    openapiFields.add("endToEndId");
    openapiFields.add("reasonCode");
    openapiFields.add("reasonDescription");
    openapiFields.add("beneficiaryName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Payout
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Payout.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Payout is not found in the empty JSON string", Payout.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Payout.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Payout` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("payoutTag") != null && !jsonObj.get("payoutTag").isJsonNull()) && !jsonObj.get("payoutTag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payoutTag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payoutTag").toString()));
      }
      if ((jsonObj.get("beneficiaryId") != null && !jsonObj.get("beneficiaryId").isJsonNull()) && !jsonObj.get("beneficiaryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiaryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiaryId").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("codeStatus") != null && !jsonObj.get("codeStatus").isJsonNull()) && !jsonObj.get("codeStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codeStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codeStatus").toString()));
      }
      if ((jsonObj.get("informationStatus") != null && !jsonObj.get("informationStatus").isJsonNull()) && !jsonObj.get("informationStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `informationStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("informationStatus").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("payoutTypeId") != null && !jsonObj.get("payoutTypeId").isJsonNull()) && !jsonObj.get("payoutTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payoutTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payoutTypeId").toString()));
      }
      if ((jsonObj.get("uniqueMandateReference") != null && !jsonObj.get("uniqueMandateReference").isJsonNull()) && !jsonObj.get("uniqueMandateReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uniqueMandateReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uniqueMandateReference").toString()));
      }
      if ((jsonObj.get("supportingFileLink") != null && !jsonObj.get("supportingFileLink").isJsonNull()) && !jsonObj.get("supportingFileLink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `supportingFileLink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("supportingFileLink").toString()));
      }
      if ((jsonObj.get("endToEndId") != null && !jsonObj.get("endToEndId").isJsonNull()) && !jsonObj.get("endToEndId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endToEndId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endToEndId").toString()));
      }
      if ((jsonObj.get("reasonCode") != null && !jsonObj.get("reasonCode").isJsonNull()) && !jsonObj.get("reasonCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reasonCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reasonCode").toString()));
      }
      if ((jsonObj.get("reasonDescription") != null && !jsonObj.get("reasonDescription").isJsonNull()) && !jsonObj.get("reasonDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reasonDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reasonDescription").toString()));
      }
      if ((jsonObj.get("beneficiaryName") != null && !jsonObj.get("beneficiaryName").isJsonNull()) && !jsonObj.get("beneficiaryName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiaryName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiaryName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Payout.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Payout' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Payout> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Payout.class));

       return (TypeAdapter<T>) new TypeAdapter<Payout>() {
           @Override
           public void write(JsonWriter out, Payout value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Payout read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Payout given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Payout
   * @throws IOException if the JSON string is invalid with respect to Payout
   */
  public static Payout fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Payout.class);
  }

  /**
   * Convert an instance of Payout to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

