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
 * DocumentObjectDocumentsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class DocumentObjectDocumentsInner {
  public static final String SERIALIZED_NAME_DOCUMENT_ID = "documentId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  @javax.annotation.Nullable
  private Integer documentId;

  public static final String SERIALIZED_NAME_DOCUMENT_TAG = "documentTag";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TAG)
  @javax.annotation.Nullable
  private String documentTag;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  @javax.annotation.Nullable
  private Integer userId;

  public static final String SERIALIZED_NAME_USER_FIRSTNAME = "userFirstname";
  @SerializedName(SERIALIZED_NAME_USER_FIRSTNAME)
  @javax.annotation.Nullable
  private String userFirstname;

  public static final String SERIALIZED_NAME_USER_LASTNAME = "userLastname";
  @SerializedName(SERIALIZED_NAME_USER_LASTNAME)
  @javax.annotation.Nullable
  private String userLastname;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  @javax.annotation.Nullable
  private String name;

  /**
   * Gets or Sets documentStatus
   */
  @JsonAdapter(DocumentStatusEnum.Adapter.class)
  public enum DocumentStatusEnum {
    PENDING("PENDING"),
    
    CANCELED("CANCELED"),
    
    VALIDATED("VALIDATED");

    private String value;

    DocumentStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentStatusEnum fromValue(String value) {
      for (DocumentStatusEnum b : DocumentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DocumentStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocumentStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DocumentStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DOCUMENT_STATUS = "documentStatus";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_STATUS)
  @javax.annotation.Nullable
  private DocumentStatusEnum documentStatus;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE_ID = "documentTypeId";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE_ID)
  @javax.annotation.Nullable
  private Integer documentTypeId;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "documentType";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  @javax.annotation.Nullable
  private String documentType;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  @javax.annotation.Nullable
  private String fileName;

  public static final String SERIALIZED_NAME_THUMBFILE_NAME = "thumbfileName";
  @SerializedName(SERIALIZED_NAME_THUMBFILE_NAME)
  @javax.annotation.Nullable
  private String thumbfileName;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  @javax.annotation.Nullable
  private String createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  @javax.annotation.Nullable
  private String modifiedDate;

  public static final String SERIALIZED_NAME_CODE_STATUS = "codeStatus";
  @SerializedName(SERIALIZED_NAME_CODE_STATUS)
  @javax.annotation.Nullable
  private String codeStatus;

  public static final String SERIALIZED_NAME_INFORMATION_STATUS = "informationStatus";
  @SerializedName(SERIALIZED_NAME_INFORMATION_STATUS)
  @javax.annotation.Nullable
  private String informationStatus;

  public static final String SERIALIZED_NAME_RESIDENCE_ID = "residenceId";
  @SerializedName(SERIALIZED_NAME_RESIDENCE_ID)
  @javax.annotation.Nullable
  private Integer residenceId;

  public static final String SERIALIZED_NAME_TEMPORARY_URL = "temporaryUrl";
  @SerializedName(SERIALIZED_NAME_TEMPORARY_URL)
  @javax.annotation.Nullable
  private String temporaryUrl;

  public static final String SERIALIZED_NAME_TEMPORARY_URL_THUMB = "temporaryUrlThumb";
  @SerializedName(SERIALIZED_NAME_TEMPORARY_URL_THUMB)
  @javax.annotation.Nullable
  private String temporaryUrlThumb;

  public DocumentObjectDocumentsInner() {
  }

  public DocumentObjectDocumentsInner documentId(@javax.annotation.Nullable Integer documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Get documentId
   * @return documentId
   */
  @javax.annotation.Nullable
  public Integer getDocumentId() {
    return documentId;
  }

  public void setDocumentId(@javax.annotation.Nullable Integer documentId) {
    this.documentId = documentId;
  }


  public DocumentObjectDocumentsInner documentTag(@javax.annotation.Nullable String documentTag) {
    this.documentTag = documentTag;
    return this;
  }

  /**
   * Get documentTag
   * @return documentTag
   */
  @javax.annotation.Nullable
  public String getDocumentTag() {
    return documentTag;
  }

  public void setDocumentTag(@javax.annotation.Nullable String documentTag) {
    this.documentTag = documentTag;
  }


  public DocumentObjectDocumentsInner userId(@javax.annotation.Nullable Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  @javax.annotation.Nullable
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(@javax.annotation.Nullable Integer userId) {
    this.userId = userId;
  }


  public DocumentObjectDocumentsInner userFirstname(@javax.annotation.Nullable String userFirstname) {
    this.userFirstname = userFirstname;
    return this;
  }

  /**
   * Get userFirstname
   * @return userFirstname
   */
  @javax.annotation.Nullable
  public String getUserFirstname() {
    return userFirstname;
  }

  public void setUserFirstname(@javax.annotation.Nullable String userFirstname) {
    this.userFirstname = userFirstname;
  }


  public DocumentObjectDocumentsInner userLastname(@javax.annotation.Nullable String userLastname) {
    this.userLastname = userLastname;
    return this;
  }

  /**
   * Get userLastname
   * @return userLastname
   */
  @javax.annotation.Nullable
  public String getUserLastname() {
    return userLastname;
  }

  public void setUserLastname(@javax.annotation.Nullable String userLastname) {
    this.userLastname = userLastname;
  }


  public DocumentObjectDocumentsInner name(@javax.annotation.Nullable String name) {
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


  public DocumentObjectDocumentsInner documentStatus(@javax.annotation.Nullable DocumentStatusEnum documentStatus) {
    this.documentStatus = documentStatus;
    return this;
  }

  /**
   * Get documentStatus
   * @return documentStatus
   */
  @javax.annotation.Nullable
  public DocumentStatusEnum getDocumentStatus() {
    return documentStatus;
  }

  public void setDocumentStatus(@javax.annotation.Nullable DocumentStatusEnum documentStatus) {
    this.documentStatus = documentStatus;
  }


  public DocumentObjectDocumentsInner documentTypeId(@javax.annotation.Nullable Integer documentTypeId) {
    this.documentTypeId = documentTypeId;
    return this;
  }

  /**
   * Get documentTypeId
   * @return documentTypeId
   */
  @javax.annotation.Nullable
  public Integer getDocumentTypeId() {
    return documentTypeId;
  }

  public void setDocumentTypeId(@javax.annotation.Nullable Integer documentTypeId) {
    this.documentTypeId = documentTypeId;
  }


  public DocumentObjectDocumentsInner documentType(@javax.annotation.Nullable String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
   */
  @javax.annotation.Nullable
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(@javax.annotation.Nullable String documentType) {
    this.documentType = documentType;
  }


  public DocumentObjectDocumentsInner fileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
   */
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }

  public void setFileName(@javax.annotation.Nullable String fileName) {
    this.fileName = fileName;
  }


  public DocumentObjectDocumentsInner thumbfileName(@javax.annotation.Nullable String thumbfileName) {
    this.thumbfileName = thumbfileName;
    return this;
  }

  /**
   * Get thumbfileName
   * @return thumbfileName
   */
  @javax.annotation.Nullable
  public String getThumbfileName() {
    return thumbfileName;
  }

  public void setThumbfileName(@javax.annotation.Nullable String thumbfileName) {
    this.thumbfileName = thumbfileName;
  }


  public DocumentObjectDocumentsInner createdDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * YYYY-MM-DD HH:MM:SS
   * @return createdDate
   */
  @javax.annotation.Nullable
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
  }


  public DocumentObjectDocumentsInner modifiedDate(@javax.annotation.Nullable String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * YYYY-MM-DD HH:MM:SS
   * @return modifiedDate
   */
  @javax.annotation.Nullable
  public String getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(@javax.annotation.Nullable String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public DocumentObjectDocumentsInner codeStatus(@javax.annotation.Nullable String codeStatus) {
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


  public DocumentObjectDocumentsInner informationStatus(@javax.annotation.Nullable String informationStatus) {
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


  public DocumentObjectDocumentsInner residenceId(@javax.annotation.Nullable Integer residenceId) {
    this.residenceId = residenceId;
    return this;
  }

  /**
   * Get residenceId
   * @return residenceId
   */
  @javax.annotation.Nullable
  public Integer getResidenceId() {
    return residenceId;
  }

  public void setResidenceId(@javax.annotation.Nullable Integer residenceId) {
    this.residenceId = residenceId;
  }


  public DocumentObjectDocumentsInner temporaryUrl(@javax.annotation.Nullable String temporaryUrl) {
    this.temporaryUrl = temporaryUrl;
    return this;
  }

  /**
   * Get temporaryUrl
   * @return temporaryUrl
   */
  @javax.annotation.Nullable
  public String getTemporaryUrl() {
    return temporaryUrl;
  }

  public void setTemporaryUrl(@javax.annotation.Nullable String temporaryUrl) {
    this.temporaryUrl = temporaryUrl;
  }


  public DocumentObjectDocumentsInner temporaryUrlThumb(@javax.annotation.Nullable String temporaryUrlThumb) {
    this.temporaryUrlThumb = temporaryUrlThumb;
    return this;
  }

  /**
   * Get temporaryUrlThumb
   * @return temporaryUrlThumb
   */
  @javax.annotation.Nullable
  public String getTemporaryUrlThumb() {
    return temporaryUrlThumb;
  }

  public void setTemporaryUrlThumb(@javax.annotation.Nullable String temporaryUrlThumb) {
    this.temporaryUrlThumb = temporaryUrlThumb;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentObjectDocumentsInner documentObjectDocumentsInner = (DocumentObjectDocumentsInner) o;
    return Objects.equals(this.documentId, documentObjectDocumentsInner.documentId) &&
        Objects.equals(this.documentTag, documentObjectDocumentsInner.documentTag) &&
        Objects.equals(this.userId, documentObjectDocumentsInner.userId) &&
        Objects.equals(this.userFirstname, documentObjectDocumentsInner.userFirstname) &&
        Objects.equals(this.userLastname, documentObjectDocumentsInner.userLastname) &&
        Objects.equals(this.name, documentObjectDocumentsInner.name) &&
        Objects.equals(this.documentStatus, documentObjectDocumentsInner.documentStatus) &&
        Objects.equals(this.documentTypeId, documentObjectDocumentsInner.documentTypeId) &&
        Objects.equals(this.documentType, documentObjectDocumentsInner.documentType) &&
        Objects.equals(this.fileName, documentObjectDocumentsInner.fileName) &&
        Objects.equals(this.thumbfileName, documentObjectDocumentsInner.thumbfileName) &&
        Objects.equals(this.createdDate, documentObjectDocumentsInner.createdDate) &&
        Objects.equals(this.modifiedDate, documentObjectDocumentsInner.modifiedDate) &&
        Objects.equals(this.codeStatus, documentObjectDocumentsInner.codeStatus) &&
        Objects.equals(this.informationStatus, documentObjectDocumentsInner.informationStatus) &&
        Objects.equals(this.residenceId, documentObjectDocumentsInner.residenceId) &&
        Objects.equals(this.temporaryUrl, documentObjectDocumentsInner.temporaryUrl) &&
        Objects.equals(this.temporaryUrlThumb, documentObjectDocumentsInner.temporaryUrlThumb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId, documentTag, userId, userFirstname, userLastname, name, documentStatus, documentTypeId, documentType, fileName, thumbfileName, createdDate, modifiedDate, codeStatus, informationStatus, residenceId, temporaryUrl, temporaryUrlThumb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentObjectDocumentsInner {\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentTag: ").append(toIndentedString(documentTag)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userFirstname: ").append(toIndentedString(userFirstname)).append("\n");
    sb.append("    userLastname: ").append(toIndentedString(userLastname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    documentStatus: ").append(toIndentedString(documentStatus)).append("\n");
    sb.append("    documentTypeId: ").append(toIndentedString(documentTypeId)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    thumbfileName: ").append(toIndentedString(thumbfileName)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    codeStatus: ").append(toIndentedString(codeStatus)).append("\n");
    sb.append("    informationStatus: ").append(toIndentedString(informationStatus)).append("\n");
    sb.append("    residenceId: ").append(toIndentedString(residenceId)).append("\n");
    sb.append("    temporaryUrl: ").append(toIndentedString(temporaryUrl)).append("\n");
    sb.append("    temporaryUrlThumb: ").append(toIndentedString(temporaryUrlThumb)).append("\n");
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
    openapiFields.add("documentId");
    openapiFields.add("documentTag");
    openapiFields.add("userId");
    openapiFields.add("userFirstname");
    openapiFields.add("userLastname");
    openapiFields.add("name");
    openapiFields.add("documentStatus");
    openapiFields.add("documentTypeId");
    openapiFields.add("documentType");
    openapiFields.add("fileName");
    openapiFields.add("thumbfileName");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("codeStatus");
    openapiFields.add("informationStatus");
    openapiFields.add("residenceId");
    openapiFields.add("temporaryUrl");
    openapiFields.add("temporaryUrlThumb");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DocumentObjectDocumentsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentObjectDocumentsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentObjectDocumentsInner is not found in the empty JSON string", DocumentObjectDocumentsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DocumentObjectDocumentsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentObjectDocumentsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("documentTag") != null && !jsonObj.get("documentTag").isJsonNull()) && !jsonObj.get("documentTag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentTag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentTag").toString()));
      }
      if ((jsonObj.get("userFirstname") != null && !jsonObj.get("userFirstname").isJsonNull()) && !jsonObj.get("userFirstname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userFirstname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userFirstname").toString()));
      }
      if ((jsonObj.get("userLastname") != null && !jsonObj.get("userLastname").isJsonNull()) && !jsonObj.get("userLastname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userLastname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userLastname").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("documentStatus") != null && !jsonObj.get("documentStatus").isJsonNull()) && !jsonObj.get("documentStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentStatus").toString()));
      }
      // validate the optional field `documentStatus`
      if (jsonObj.get("documentStatus") != null && !jsonObj.get("documentStatus").isJsonNull()) {
        DocumentStatusEnum.validateJsonElement(jsonObj.get("documentStatus"));
      }
      if ((jsonObj.get("documentType") != null && !jsonObj.get("documentType").isJsonNull()) && !jsonObj.get("documentType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentType").toString()));
      }
      if ((jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonNull()) && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if ((jsonObj.get("thumbfileName") != null && !jsonObj.get("thumbfileName").isJsonNull()) && !jsonObj.get("thumbfileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbfileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbfileName").toString()));
      }
      if ((jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) && !jsonObj.get("createdDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdDate").toString()));
      }
      if ((jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) && !jsonObj.get("modifiedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedDate").toString()));
      }
      if ((jsonObj.get("codeStatus") != null && !jsonObj.get("codeStatus").isJsonNull()) && !jsonObj.get("codeStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codeStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codeStatus").toString()));
      }
      if ((jsonObj.get("informationStatus") != null && !jsonObj.get("informationStatus").isJsonNull()) && !jsonObj.get("informationStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `informationStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("informationStatus").toString()));
      }
      if ((jsonObj.get("temporaryUrl") != null && !jsonObj.get("temporaryUrl").isJsonNull()) && !jsonObj.get("temporaryUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `temporaryUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("temporaryUrl").toString()));
      }
      if ((jsonObj.get("temporaryUrlThumb") != null && !jsonObj.get("temporaryUrlThumb").isJsonNull()) && !jsonObj.get("temporaryUrlThumb").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `temporaryUrlThumb` to be a primitive type in the JSON string but got `%s`", jsonObj.get("temporaryUrlThumb").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentObjectDocumentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentObjectDocumentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentObjectDocumentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentObjectDocumentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentObjectDocumentsInner>() {
           @Override
           public void write(JsonWriter out, DocumentObjectDocumentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentObjectDocumentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DocumentObjectDocumentsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DocumentObjectDocumentsInner
   * @throws IOException if the JSON string is invalid with respect to DocumentObjectDocumentsInner
   */
  public static DocumentObjectDocumentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentObjectDocumentsInner.class);
  }

  /**
   * Convert an instance of DocumentObjectDocumentsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

