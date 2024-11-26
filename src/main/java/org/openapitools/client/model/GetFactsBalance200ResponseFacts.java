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
import org.openapitools.client.model.GetFactsBalance200ResponseFactsMonthTotalAmount;

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
 * GetFactsBalance200ResponseFacts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class GetFactsBalance200ResponseFacts {
  public static final String SERIALIZED_NAME_MONTH_TOTAL_AMOUNT = "month_total_amount";
  @SerializedName(SERIALIZED_NAME_MONTH_TOTAL_AMOUNT)
  @javax.annotation.Nullable
  private GetFactsBalance200ResponseFactsMonthTotalAmount monthTotalAmount;

  public GetFactsBalance200ResponseFacts() {
  }

  public GetFactsBalance200ResponseFacts monthTotalAmount(@javax.annotation.Nullable GetFactsBalance200ResponseFactsMonthTotalAmount monthTotalAmount) {
    this.monthTotalAmount = monthTotalAmount;
    return this;
  }

  /**
   * Get monthTotalAmount
   * @return monthTotalAmount
   */
  @javax.annotation.Nullable
  public GetFactsBalance200ResponseFactsMonthTotalAmount getMonthTotalAmount() {
    return monthTotalAmount;
  }

  public void setMonthTotalAmount(@javax.annotation.Nullable GetFactsBalance200ResponseFactsMonthTotalAmount monthTotalAmount) {
    this.monthTotalAmount = monthTotalAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFactsBalance200ResponseFacts getFactsBalance200ResponseFacts = (GetFactsBalance200ResponseFacts) o;
    return Objects.equals(this.monthTotalAmount, getFactsBalance200ResponseFacts.monthTotalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthTotalAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFactsBalance200ResponseFacts {\n");
    sb.append("    monthTotalAmount: ").append(toIndentedString(monthTotalAmount)).append("\n");
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
    openapiFields.add("month_total_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GetFactsBalance200ResponseFacts
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetFactsBalance200ResponseFacts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetFactsBalance200ResponseFacts is not found in the empty JSON string", GetFactsBalance200ResponseFacts.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GetFactsBalance200ResponseFacts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetFactsBalance200ResponseFacts` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `month_total_amount`
      if (jsonObj.get("month_total_amount") != null && !jsonObj.get("month_total_amount").isJsonNull()) {
        GetFactsBalance200ResponseFactsMonthTotalAmount.validateJsonElement(jsonObj.get("month_total_amount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetFactsBalance200ResponseFacts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetFactsBalance200ResponseFacts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetFactsBalance200ResponseFacts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetFactsBalance200ResponseFacts.class));

       return (TypeAdapter<T>) new TypeAdapter<GetFactsBalance200ResponseFacts>() {
           @Override
           public void write(JsonWriter out, GetFactsBalance200ResponseFacts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetFactsBalance200ResponseFacts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GetFactsBalance200ResponseFacts given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GetFactsBalance200ResponseFacts
   * @throws IOException if the JSON string is invalid with respect to GetFactsBalance200ResponseFacts
   */
  public static GetFactsBalance200ResponseFacts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetFactsBalance200ResponseFacts.class);
  }

  /**
   * Convert an instance of GetFactsBalance200ResponseFacts to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

