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
 * This parameter is required in the case of &#x60;APPLE&#x60; tokenRequestor 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class TavRequestPOSTRequestAdditionnalData {
  public static final String SERIALIZED_NAME_CERTIFICATES = "certificates";
  @SerializedName(SERIALIZED_NAME_CERTIFICATES)
  @javax.annotation.Nullable
  private List<String> certificates = new ArrayList<>();

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  @javax.annotation.Nullable
  private String nonce;

  public static final String SERIALIZED_NAME_NONCE_SIGNATURE = "nonceSignature";
  @SerializedName(SERIALIZED_NAME_NONCE_SIGNATURE)
  @javax.annotation.Nullable
  private byte[] nonceSignature;

  public TavRequestPOSTRequestAdditionnalData() {
  }

  public TavRequestPOSTRequestAdditionnalData certificates(@javax.annotation.Nullable List<String> certificates) {
    this.certificates = certificates;
    return this;
  }

  public TavRequestPOSTRequestAdditionnalData addCertificatesItem(String certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

  /**
   * The certificate chain. Required when tokenRequestor is APPLE. The first element of array is the leaf certificate and the last should be the root certificate. There can be 0 or several sub certificates inbetween the first element of array and the last. All certificates are of type string (base64 encoded of DER format) 
   * @return certificates
   */
  @javax.annotation.Nullable
  public List<String> getCertificates() {
    return certificates;
  }

  public void setCertificates(@javax.annotation.Nullable List<String> certificates) {
    this.certificates = certificates;
  }


  public TavRequestPOSTRequestAdditionnalData nonce(@javax.annotation.Nullable String nonce) {
    this.nonce = nonce;
    return this;
  }

  /**
   * The nonce as provided by the Apple SDK. Required when tokenRequestor is &#x60;APPLE&#x60; 
   * @return nonce
   */
  @javax.annotation.Nullable
  public String getNonce() {
    return nonce;
  }

  public void setNonce(@javax.annotation.Nullable String nonce) {
    this.nonce = nonce;
  }


  public TavRequestPOSTRequestAdditionnalData nonceSignature(@javax.annotation.Nullable byte[] nonceSignature) {
    this.nonceSignature = nonceSignature;
    return this;
  }

  /**
   * The nonce signature as provided by the Apple SDK. Required when tokenRequestor is &#x60;APPLE&#x60; 
   * @return nonceSignature
   */
  @javax.annotation.Nullable
  public byte[] getNonceSignature() {
    return nonceSignature;
  }

  public void setNonceSignature(@javax.annotation.Nullable byte[] nonceSignature) {
    this.nonceSignature = nonceSignature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TavRequestPOSTRequestAdditionnalData tavRequestPOSTRequestAdditionnalData = (TavRequestPOSTRequestAdditionnalData) o;
    return Objects.equals(this.certificates, tavRequestPOSTRequestAdditionnalData.certificates) &&
        Objects.equals(this.nonce, tavRequestPOSTRequestAdditionnalData.nonce) &&
        Arrays.equals(this.nonceSignature, tavRequestPOSTRequestAdditionnalData.nonceSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates, nonce, Arrays.hashCode(nonceSignature));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TavRequestPOSTRequestAdditionnalData {\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    nonceSignature: ").append(toIndentedString(nonceSignature)).append("\n");
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
    openapiFields.add("certificates");
    openapiFields.add("nonce");
    openapiFields.add("nonceSignature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TavRequestPOSTRequestAdditionnalData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TavRequestPOSTRequestAdditionnalData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TavRequestPOSTRequestAdditionnalData is not found in the empty JSON string", TavRequestPOSTRequestAdditionnalData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TavRequestPOSTRequestAdditionnalData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TavRequestPOSTRequestAdditionnalData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("certificates") != null && !jsonObj.get("certificates").isJsonNull() && !jsonObj.get("certificates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificates` to be an array in the JSON string but got `%s`", jsonObj.get("certificates").toString()));
      }
      if ((jsonObj.get("nonce") != null && !jsonObj.get("nonce").isJsonNull()) && !jsonObj.get("nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonce").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TavRequestPOSTRequestAdditionnalData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TavRequestPOSTRequestAdditionnalData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TavRequestPOSTRequestAdditionnalData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TavRequestPOSTRequestAdditionnalData.class));

       return (TypeAdapter<T>) new TypeAdapter<TavRequestPOSTRequestAdditionnalData>() {
           @Override
           public void write(JsonWriter out, TavRequestPOSTRequestAdditionnalData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TavRequestPOSTRequestAdditionnalData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TavRequestPOSTRequestAdditionnalData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TavRequestPOSTRequestAdditionnalData
   * @throws IOException if the JSON string is invalid with respect to TavRequestPOSTRequestAdditionnalData
   */
  public static TavRequestPOSTRequestAdditionnalData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TavRequestPOSTRequestAdditionnalData.class);
  }

  /**
   * Convert an instance of TavRequestPOSTRequestAdditionnalData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

