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
 * TaxResidenceObjectTaxResidencesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class TaxResidenceObjectTaxResidencesInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  @javax.annotation.Nullable
  private Integer id;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private Integer userId;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  @javax.annotation.Nullable
  private String country;

  public static final String SERIALIZED_NAME_TAX_PAYER_ID = "taxPayerId";
  @SerializedName(SERIALIZED_NAME_TAX_PAYER_ID)
  @javax.annotation.Nullable
  private String taxPayerId;

  public static final String SERIALIZED_NAME_LIABILITY_WAIVER = "liabilityWaiver";
  @SerializedName(SERIALIZED_NAME_LIABILITY_WAIVER)
  @javax.annotation.Nullable
  private Boolean liabilityWaiver;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  @javax.annotation.Nullable
  private String createdDate;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  @javax.annotation.Nullable
  private String lastUpdate;

  public static final String SERIALIZED_NAME_DELETED_DATE = "deletedDate";
  @SerializedName(SERIALIZED_NAME_DELETED_DATE)
  @javax.annotation.Nullable
  private String deletedDate;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  @javax.annotation.Nullable
  private Boolean isDeleted;

  public TaxResidenceObjectTaxResidencesInner() {
  }

  public TaxResidenceObjectTaxResidencesInner id(@javax.annotation.Nullable Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the Tax Residence.
   * @return id
   */
  @javax.annotation.Nullable
  public Integer getId() {
    return id;
  }

  public void setId(@javax.annotation.Nullable Integer id) {
    this.id = id;
  }


  public TaxResidenceObjectTaxResidencesInner userId(@javax.annotation.Nullable Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The unique identifier of the User.
   * @return userId
   */
  @javax.annotation.Nullable
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable Integer userId) {
    this.userId = userId;
  }


  public TaxResidenceObjectTaxResidencesInner country(@javax.annotation.Nullable String country) {
    this.country = country;
    return this;
  }

  /**
   * The country code for the country of Tax Residence.
   * @return country
   */
  @javax.annotation.Nullable
  public String getCountry() {
    return country;
  }

  public void setCountry(@javax.annotation.Nullable String country) {
    this.country = country;
  }


  public TaxResidenceObjectTaxResidencesInner taxPayerId(@javax.annotation.Nullable String taxPayerId) {
    this.taxPayerId = taxPayerId;
    return this;
  }

  /**
   * The Tax Identification Number (TIN).
   * @return taxPayerId
   */
  @javax.annotation.Nullable
  public String getTaxPayerId() {
    return taxPayerId;
  }

  public void setTaxPayerId(@javax.annotation.Nullable String taxPayerId) {
    this.taxPayerId = taxPayerId;
  }


  public TaxResidenceObjectTaxResidencesInner liabilityWaiver(@javax.annotation.Nullable Boolean liabilityWaiver) {
    this.liabilityWaiver = liabilityWaiver;
    return this;
  }

  /**
   * The waiver exempting Treezor from liability in case of a missing TIN.
   * @return liabilityWaiver
   */
  @javax.annotation.Nullable
  public Boolean getLiabilityWaiver() {
    return liabilityWaiver;
  }

  public void setLiabilityWaiver(@javax.annotation.Nullable Boolean liabilityWaiver) {
    this.liabilityWaiver = liabilityWaiver;
  }


  public TaxResidenceObjectTaxResidencesInner createdDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The date of creation of the Tax Residence object.
   * @return createdDate
   */
  @javax.annotation.Nullable
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
  }


  public TaxResidenceObjectTaxResidencesInner lastUpdate(@javax.annotation.Nullable String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * The date and time at which the Tax Residence has been updated.
   * @return lastUpdate
   */
  @javax.annotation.Nullable
  public String getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(@javax.annotation.Nullable String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public TaxResidenceObjectTaxResidencesInner deletedDate(@javax.annotation.Nullable String deletedDate) {
    this.deletedDate = deletedDate;
    return this;
  }

  /**
   * The date and time at which the Tax Residence has been deleted.
   * @return deletedDate
   */
  @javax.annotation.Nullable
  public String getDeletedDate() {
    return deletedDate;
  }

  public void setDeletedDate(@javax.annotation.Nullable String deletedDate) {
    this.deletedDate = deletedDate;
  }


  public TaxResidenceObjectTaxResidencesInner isDeleted(@javax.annotation.Nullable Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Whether or not the Tax Residence object was deleted.
   * @return isDeleted
   */
  @javax.annotation.Nullable
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(@javax.annotation.Nullable Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxResidenceObjectTaxResidencesInner taxResidenceObjectTaxResidencesInner = (TaxResidenceObjectTaxResidencesInner) o;
    return Objects.equals(this.id, taxResidenceObjectTaxResidencesInner.id) &&
        Objects.equals(this.userId, taxResidenceObjectTaxResidencesInner.userId) &&
        Objects.equals(this.country, taxResidenceObjectTaxResidencesInner.country) &&
        Objects.equals(this.taxPayerId, taxResidenceObjectTaxResidencesInner.taxPayerId) &&
        Objects.equals(this.liabilityWaiver, taxResidenceObjectTaxResidencesInner.liabilityWaiver) &&
        Objects.equals(this.createdDate, taxResidenceObjectTaxResidencesInner.createdDate) &&
        Objects.equals(this.lastUpdate, taxResidenceObjectTaxResidencesInner.lastUpdate) &&
        Objects.equals(this.deletedDate, taxResidenceObjectTaxResidencesInner.deletedDate) &&
        Objects.equals(this.isDeleted, taxResidenceObjectTaxResidencesInner.isDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, country, taxPayerId, liabilityWaiver, createdDate, lastUpdate, deletedDate, isDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxResidenceObjectTaxResidencesInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    taxPayerId: ").append(toIndentedString(taxPayerId)).append("\n");
    sb.append("    liabilityWaiver: ").append(toIndentedString(liabilityWaiver)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    deletedDate: ").append(toIndentedString(deletedDate)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("userId");
    openapiFields.add("country");
    openapiFields.add("taxPayerId");
    openapiFields.add("liabilityWaiver");
    openapiFields.add("createdDate");
    openapiFields.add("lastUpdate");
    openapiFields.add("deletedDate");
    openapiFields.add("isDeleted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TaxResidenceObjectTaxResidencesInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaxResidenceObjectTaxResidencesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxResidenceObjectTaxResidencesInner is not found in the empty JSON string", TaxResidenceObjectTaxResidencesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TaxResidenceObjectTaxResidencesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TaxResidenceObjectTaxResidencesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
      if ((jsonObj.get("taxPayerId") != null && !jsonObj.get("taxPayerId").isJsonNull()) && !jsonObj.get("taxPayerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxPayerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxPayerId").toString()));
      }
      if ((jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) && !jsonObj.get("createdDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdDate").toString()));
      }
      if ((jsonObj.get("lastUpdate") != null && !jsonObj.get("lastUpdate").isJsonNull()) && !jsonObj.get("lastUpdate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdate").toString()));
      }
      if ((jsonObj.get("deletedDate") != null && !jsonObj.get("deletedDate").isJsonNull()) && !jsonObj.get("deletedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deletedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deletedDate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxResidenceObjectTaxResidencesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxResidenceObjectTaxResidencesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxResidenceObjectTaxResidencesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxResidenceObjectTaxResidencesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxResidenceObjectTaxResidencesInner>() {
           @Override
           public void write(JsonWriter out, TaxResidenceObjectTaxResidencesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TaxResidenceObjectTaxResidencesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TaxResidenceObjectTaxResidencesInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TaxResidenceObjectTaxResidencesInner
   * @throws IOException if the JSON string is invalid with respect to TaxResidenceObjectTaxResidencesInner
   */
  public static TaxResidenceObjectTaxResidencesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxResidenceObjectTaxResidencesInner.class);
  }

  /**
   * Convert an instance of TaxResidenceObjectTaxResidencesInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

