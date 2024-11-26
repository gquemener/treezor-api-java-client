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
 * TransferObjectTransfersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class TransferObjectTransfersInner {
  public static final String SERIALIZED_NAME_TRANSFER_ID = "transferId";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  @javax.annotation.Nullable
  private Integer transferId;

  /**
   * The status of the Transfer.
   */
  @JsonAdapter(TransferStatusEnum.Adapter.class)
  public enum TransferStatusEnum {
    PENDING("PENDING"),
    
    CANCELED("CANCELED"),
    
    VALIDATED("VALIDATED");

    private String value;

    TransferStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransferStatusEnum fromValue(String value) {
      for (TransferStatusEnum b : TransferStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransferStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransferStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransferStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransferStatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TransferStatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TRANSFER_STATUS = "transferStatus";
  @SerializedName(SERIALIZED_NAME_TRANSFER_STATUS)
  @javax.annotation.Nullable
  private TransferStatusEnum transferStatus;

  public static final String SERIALIZED_NAME_TRANSFER_TAG = "transferTag";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TAG)
  @javax.annotation.Nullable
  private String transferTag;

  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  @javax.annotation.Nullable
  private Integer walletId;

  public static final String SERIALIZED_NAME_WALLET_TYPE_ID = "walletTypeId";
  @SerializedName(SERIALIZED_NAME_WALLET_TYPE_ID)
  @javax.annotation.Nullable
  private Integer walletTypeId;

  public static final String SERIALIZED_NAME_BENEFICIARY_WALLET_ID = "beneficiaryWalletId";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_WALLET_ID)
  @javax.annotation.Nullable
  private Integer beneficiaryWalletId;

  /**
   * The type of Wallet. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
   */
  @JsonAdapter(BeneficiaryWalletTypeIdEnum.Adapter.class)
  public enum BeneficiaryWalletTypeIdEnum {
    NUMBER_9(9),
    
    NUMBER_10(10),
    
    NUMBER_14(14),
    
    NUMBER_15(15);

    private Integer value;

    BeneficiaryWalletTypeIdEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BeneficiaryWalletTypeIdEnum fromValue(Integer value) {
      for (BeneficiaryWalletTypeIdEnum b : BeneficiaryWalletTypeIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BeneficiaryWalletTypeIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BeneficiaryWalletTypeIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BeneficiaryWalletTypeIdEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return BeneficiaryWalletTypeIdEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      BeneficiaryWalletTypeIdEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_BENEFICIARY_WALLET_TYPE_ID = "beneficiaryWalletTypeId";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_WALLET_TYPE_ID)
  @javax.annotation.Nullable
  private BeneficiaryWalletTypeIdEnum beneficiaryWalletTypeId;

  public static final String SERIALIZED_NAME_TRANSFER_DATE = "transferDate";
  @SerializedName(SERIALIZED_NAME_TRANSFER_DATE)
  @javax.annotation.Nullable
  private String transferDate;

  public static final String SERIALIZED_NAME_WALLET_EVENT_NAME = "walletEventName";
  @SerializedName(SERIALIZED_NAME_WALLET_EVENT_NAME)
  @javax.annotation.Nullable
  private String walletEventName;

  public static final String SERIALIZED_NAME_WALLET_ALIAS = "walletAlias";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_WALLET_ALIAS)
  @javax.annotation.Nullable
  private String walletAlias;

  public static final String SERIALIZED_NAME_BENEFICIARY_WALLET_EVENT_NAME = "beneficiaryWalletEventName";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_WALLET_EVENT_NAME)
  @javax.annotation.Nullable
  private String beneficiaryWalletEventName;

  public static final String SERIALIZED_NAME_BENEFICIARY_WALLET_ALIAS = "beneficiaryWalletAlias";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_WALLET_ALIAS)
  @javax.annotation.Nullable
  private String beneficiaryWalletAlias;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  @javax.annotation.Nullable
  private String amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  @javax.annotation.Nullable
  private String currency;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  @javax.annotation.Nullable
  private String label;

  public static final String SERIALIZED_NAME_TRANSFER_TYPE_ID = "transferTypeId";
  @SerializedName(SERIALIZED_NAME_TRANSFER_TYPE_ID)
  @javax.annotation.Nullable
  private Integer transferTypeId;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  @javax.annotation.Nullable
  private String createdDate;

  public static final String SERIALIZED_NAME_MODIFIED_DATE = "modifiedDate";
  @SerializedName(SERIALIZED_NAME_MODIFIED_DATE)
  @javax.annotation.Nullable
  private String modifiedDate;

  public static final String SERIALIZED_NAME_TOTAL_ROWS = "totalRows";
  @SerializedName(SERIALIZED_NAME_TOTAL_ROWS)
  @javax.annotation.Nullable
  private Integer totalRows;

  public static final String SERIALIZED_NAME_FOREIGN_ID = "foreignId";
  @SerializedName(SERIALIZED_NAME_FOREIGN_ID)
  @javax.annotation.Nullable
  private String foreignId;

  public static final String SERIALIZED_NAME_PARTNER_FEE = "partnerFee";
  @SerializedName(SERIALIZED_NAME_PARTNER_FEE)
  @javax.annotation.Nullable
  private String partnerFee;

  public static final String SERIALIZED_NAME_CODE_STATUS = "codeStatus";
  @SerializedName(SERIALIZED_NAME_CODE_STATUS)
  @javax.annotation.Nullable
  private String codeStatus;

  public static final String SERIALIZED_NAME_INFORMATION_STATU = "informationStatu";
  @SerializedName(SERIALIZED_NAME_INFORMATION_STATU)
  @javax.annotation.Nullable
  private String informationStatu;

  public TransferObjectTransfersInner() {
  }

  public TransferObjectTransfersInner transferId(@javax.annotation.Nullable Integer transferId) {
    this.transferId = transferId;
    return this;
  }

  /**
   * The unique identifier of the Transfer.
   * @return transferId
   */
  @javax.annotation.Nullable
  public Integer getTransferId() {
    return transferId;
  }

  public void setTransferId(@javax.annotation.Nullable Integer transferId) {
    this.transferId = transferId;
  }


  public TransferObjectTransfersInner transferStatus(@javax.annotation.Nullable TransferStatusEnum transferStatus) {
    this.transferStatus = transferStatus;
    return this;
  }

  /**
   * The status of the Transfer.
   * @return transferStatus
   */
  @javax.annotation.Nullable
  public TransferStatusEnum getTransferStatus() {
    return transferStatus;
  }

  public void setTransferStatus(@javax.annotation.Nullable TransferStatusEnum transferStatus) {
    this.transferStatus = transferStatus;
  }


  public TransferObjectTransfersInner transferTag(@javax.annotation.Nullable String transferTag) {
    this.transferTag = transferTag;
    return this;
  }

  /**
   * Get transferTag
   * @return transferTag
   */
  @javax.annotation.Nullable
  public String getTransferTag() {
    return transferTag;
  }

  public void setTransferTag(@javax.annotation.Nullable String transferTag) {
    this.transferTag = transferTag;
  }


  public TransferObjectTransfersInner walletId(@javax.annotation.Nullable Integer walletId) {
    this.walletId = walletId;
    return this;
  }

  /**
   * The unique identifier of the debited Wallet.
   * @return walletId
   */
  @javax.annotation.Nullable
  public Integer getWalletId() {
    return walletId;
  }

  public void setWalletId(@javax.annotation.Nullable Integer walletId) {
    this.walletId = walletId;
  }


  public TransferObjectTransfersInner walletTypeId(@javax.annotation.Nullable Integer walletTypeId) {
    this.walletTypeId = walletTypeId;
    return this;
  }

  /**
   * The type of the debited Wallet:  * &#x60;9&#x60; – Electronic Money Wallet  * &#x60;10&#x60; – Payment Account Wallet * &#x60;13&#x60; – Mirror Wallet 
   * @return walletTypeId
   */
  @javax.annotation.Nullable
  public Integer getWalletTypeId() {
    return walletTypeId;
  }

  public void setWalletTypeId(@javax.annotation.Nullable Integer walletTypeId) {
    this.walletTypeId = walletTypeId;
  }


  public TransferObjectTransfersInner beneficiaryWalletId(@javax.annotation.Nullable Integer beneficiaryWalletId) {
    this.beneficiaryWalletId = beneficiaryWalletId;
    return this;
  }

  /**
   * The unique identifier of the credited Wallet.
   * @return beneficiaryWalletId
   */
  @javax.annotation.Nullable
  public Integer getBeneficiaryWalletId() {
    return beneficiaryWalletId;
  }

  public void setBeneficiaryWalletId(@javax.annotation.Nullable Integer beneficiaryWalletId) {
    this.beneficiaryWalletId = beneficiaryWalletId;
  }


  public TransferObjectTransfersInner beneficiaryWalletTypeId(@javax.annotation.Nullable BeneficiaryWalletTypeIdEnum beneficiaryWalletTypeId) {
    this.beneficiaryWalletTypeId = beneficiaryWalletTypeId;
    return this;
  }

  /**
   * The type of Wallet. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
   * @return beneficiaryWalletTypeId
   */
  @javax.annotation.Nullable
  public BeneficiaryWalletTypeIdEnum getBeneficiaryWalletTypeId() {
    return beneficiaryWalletTypeId;
  }

  public void setBeneficiaryWalletTypeId(@javax.annotation.Nullable BeneficiaryWalletTypeIdEnum beneficiaryWalletTypeId) {
    this.beneficiaryWalletTypeId = beneficiaryWalletTypeId;
  }


  public TransferObjectTransfersInner transferDate(@javax.annotation.Nullable String transferDate) {
    this.transferDate = transferDate;
    return this;
  }

  /**
   * The date of the Transfer. Format: YYYY-MM-DD 
   * @return transferDate
   */
  @javax.annotation.Nullable
  public String getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(@javax.annotation.Nullable String transferDate) {
    this.transferDate = transferDate;
  }


  public TransferObjectTransfersInner walletEventName(@javax.annotation.Nullable String walletEventName) {
    this.walletEventName = walletEventName;
    return this;
  }

  /**
   * The name of the debited Wallet.
   * @return walletEventName
   */
  @javax.annotation.Nullable
  public String getWalletEventName() {
    return walletEventName;
  }

  public void setWalletEventName(@javax.annotation.Nullable String walletEventName) {
    this.walletEventName = walletEventName;
  }


  @Deprecated
  public TransferObjectTransfersInner walletAlias(@javax.annotation.Nullable String walletAlias) {
    this.walletAlias = walletAlias;
    return this;
  }

  /**
   * Get walletAlias
   * @return walletAlias
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public String getWalletAlias() {
    return walletAlias;
  }

  @Deprecated
  public void setWalletAlias(@javax.annotation.Nullable String walletAlias) {
    this.walletAlias = walletAlias;
  }


  public TransferObjectTransfersInner beneficiaryWalletEventName(@javax.annotation.Nullable String beneficiaryWalletEventName) {
    this.beneficiaryWalletEventName = beneficiaryWalletEventName;
    return this;
  }

  /**
   * The name of the credited Wallet.
   * @return beneficiaryWalletEventName
   */
  @javax.annotation.Nullable
  public String getBeneficiaryWalletEventName() {
    return beneficiaryWalletEventName;
  }

  public void setBeneficiaryWalletEventName(@javax.annotation.Nullable String beneficiaryWalletEventName) {
    this.beneficiaryWalletEventName = beneficiaryWalletEventName;
  }


  @Deprecated
  public TransferObjectTransfersInner beneficiaryWalletAlias(@javax.annotation.Nullable String beneficiaryWalletAlias) {
    this.beneficiaryWalletAlias = beneficiaryWalletAlias;
    return this;
  }

  /**
   * Get beneficiaryWalletAlias
   * @return beneficiaryWalletAlias
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public String getBeneficiaryWalletAlias() {
    return beneficiaryWalletAlias;
  }

  @Deprecated
  public void setBeneficiaryWalletAlias(@javax.annotation.Nullable String beneficiaryWalletAlias) {
    this.beneficiaryWalletAlias = beneficiaryWalletAlias;
  }


  public TransferObjectTransfersInner amount(@javax.annotation.Nullable String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The amount of the transfer.
   * @return amount
   */
  @javax.annotation.Nullable
  public String getAmount() {
    return amount;
  }

  public void setAmount(@javax.annotation.Nullable String amount) {
    this.amount = amount;
  }


  public TransferObjectTransfersInner currency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency of the transfer.
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(@javax.annotation.Nullable String currency) {
    this.currency = currency;
  }


  public TransferObjectTransfersInner label(@javax.annotation.Nullable String label) {
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


  public TransferObjectTransfersInner transferTypeId(@javax.annotation.Nullable Integer transferTypeId) {
    this.transferTypeId = transferTypeId;
    return this;
  }

  /**
   * The type of transfer: * &#x60;1&#x60; – Wallet to wallet  * &#x60;2&#x60; – Card transaction * &#x60;3&#x60; – Client fees * &#x60;4&#x60; – Credit note 
   * @return transferTypeId
   */
  @javax.annotation.Nullable
  public Integer getTransferTypeId() {
    return transferTypeId;
  }

  public void setTransferTypeId(@javax.annotation.Nullable Integer transferTypeId) {
    this.transferTypeId = transferTypeId;
  }


  public TransferObjectTransfersInner createdDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * The date and time at which the transfer is created. Format: YYYY-MM-DD HH:MM:SS 
   * @return createdDate
   */
  @javax.annotation.Nullable
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(@javax.annotation.Nullable String createdDate) {
    this.createdDate = createdDate;
  }


  public TransferObjectTransfersInner modifiedDate(@javax.annotation.Nullable String modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * The date and time at which the transfer is updated. Format: YYYY-MM-DD HH:MM:SS 
   * @return modifiedDate
   */
  @javax.annotation.Nullable
  public String getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(@javax.annotation.Nullable String modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  public TransferObjectTransfersInner totalRows(@javax.annotation.Nullable Integer totalRows) {
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


  public TransferObjectTransfersInner foreignId(@javax.annotation.Nullable String foreignId) {
    this.foreignId = foreignId;
    return this;
  }

  /**
   * Get foreignId
   * @return foreignId
   */
  @javax.annotation.Nullable
  public String getForeignId() {
    return foreignId;
  }

  public void setForeignId(@javax.annotation.Nullable String foreignId) {
    this.foreignId = foreignId;
  }


  public TransferObjectTransfersInner partnerFee(@javax.annotation.Nullable String partnerFee) {
    this.partnerFee = partnerFee;
    return this;
  }

  /**
   * Get partnerFee
   * @return partnerFee
   */
  @javax.annotation.Nullable
  public String getPartnerFee() {
    return partnerFee;
  }

  public void setPartnerFee(@javax.annotation.Nullable String partnerFee) {
    this.partnerFee = partnerFee;
  }


  public TransferObjectTransfersInner codeStatus(@javax.annotation.Nullable String codeStatus) {
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


  public TransferObjectTransfersInner informationStatu(@javax.annotation.Nullable String informationStatu) {
    this.informationStatu = informationStatu;
    return this;
  }

  /**
   * Get informationStatu
   * @return informationStatu
   */
  @javax.annotation.Nullable
  public String getInformationStatu() {
    return informationStatu;
  }

  public void setInformationStatu(@javax.annotation.Nullable String informationStatu) {
    this.informationStatu = informationStatu;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferObjectTransfersInner transferObjectTransfersInner = (TransferObjectTransfersInner) o;
    return Objects.equals(this.transferId, transferObjectTransfersInner.transferId) &&
        Objects.equals(this.transferStatus, transferObjectTransfersInner.transferStatus) &&
        Objects.equals(this.transferTag, transferObjectTransfersInner.transferTag) &&
        Objects.equals(this.walletId, transferObjectTransfersInner.walletId) &&
        Objects.equals(this.walletTypeId, transferObjectTransfersInner.walletTypeId) &&
        Objects.equals(this.beneficiaryWalletId, transferObjectTransfersInner.beneficiaryWalletId) &&
        Objects.equals(this.beneficiaryWalletTypeId, transferObjectTransfersInner.beneficiaryWalletTypeId) &&
        Objects.equals(this.transferDate, transferObjectTransfersInner.transferDate) &&
        Objects.equals(this.walletEventName, transferObjectTransfersInner.walletEventName) &&
        Objects.equals(this.walletAlias, transferObjectTransfersInner.walletAlias) &&
        Objects.equals(this.beneficiaryWalletEventName, transferObjectTransfersInner.beneficiaryWalletEventName) &&
        Objects.equals(this.beneficiaryWalletAlias, transferObjectTransfersInner.beneficiaryWalletAlias) &&
        Objects.equals(this.amount, transferObjectTransfersInner.amount) &&
        Objects.equals(this.currency, transferObjectTransfersInner.currency) &&
        Objects.equals(this.label, transferObjectTransfersInner.label) &&
        Objects.equals(this.transferTypeId, transferObjectTransfersInner.transferTypeId) &&
        Objects.equals(this.createdDate, transferObjectTransfersInner.createdDate) &&
        Objects.equals(this.modifiedDate, transferObjectTransfersInner.modifiedDate) &&
        Objects.equals(this.totalRows, transferObjectTransfersInner.totalRows) &&
        Objects.equals(this.foreignId, transferObjectTransfersInner.foreignId) &&
        Objects.equals(this.partnerFee, transferObjectTransfersInner.partnerFee) &&
        Objects.equals(this.codeStatus, transferObjectTransfersInner.codeStatus) &&
        Objects.equals(this.informationStatu, transferObjectTransfersInner.informationStatu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferId, transferStatus, transferTag, walletId, walletTypeId, beneficiaryWalletId, beneficiaryWalletTypeId, transferDate, walletEventName, walletAlias, beneficiaryWalletEventName, beneficiaryWalletAlias, amount, currency, label, transferTypeId, createdDate, modifiedDate, totalRows, foreignId, partnerFee, codeStatus, informationStatu);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferObjectTransfersInner {\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
    sb.append("    transferTag: ").append(toIndentedString(transferTag)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    walletTypeId: ").append(toIndentedString(walletTypeId)).append("\n");
    sb.append("    beneficiaryWalletId: ").append(toIndentedString(beneficiaryWalletId)).append("\n");
    sb.append("    beneficiaryWalletTypeId: ").append(toIndentedString(beneficiaryWalletTypeId)).append("\n");
    sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
    sb.append("    walletEventName: ").append(toIndentedString(walletEventName)).append("\n");
    sb.append("    walletAlias: ").append(toIndentedString(walletAlias)).append("\n");
    sb.append("    beneficiaryWalletEventName: ").append(toIndentedString(beneficiaryWalletEventName)).append("\n");
    sb.append("    beneficiaryWalletAlias: ").append(toIndentedString(beneficiaryWalletAlias)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    transferTypeId: ").append(toIndentedString(transferTypeId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
    sb.append("    foreignId: ").append(toIndentedString(foreignId)).append("\n");
    sb.append("    partnerFee: ").append(toIndentedString(partnerFee)).append("\n");
    sb.append("    codeStatus: ").append(toIndentedString(codeStatus)).append("\n");
    sb.append("    informationStatu: ").append(toIndentedString(informationStatu)).append("\n");
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
    openapiFields.add("transferId");
    openapiFields.add("transferStatus");
    openapiFields.add("transferTag");
    openapiFields.add("walletId");
    openapiFields.add("walletTypeId");
    openapiFields.add("beneficiaryWalletId");
    openapiFields.add("beneficiaryWalletTypeId");
    openapiFields.add("transferDate");
    openapiFields.add("walletEventName");
    openapiFields.add("walletAlias");
    openapiFields.add("beneficiaryWalletEventName");
    openapiFields.add("beneficiaryWalletAlias");
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("label");
    openapiFields.add("transferTypeId");
    openapiFields.add("createdDate");
    openapiFields.add("modifiedDate");
    openapiFields.add("totalRows");
    openapiFields.add("foreignId");
    openapiFields.add("partnerFee");
    openapiFields.add("codeStatus");
    openapiFields.add("informationStatu");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TransferObjectTransfersInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TransferObjectTransfersInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransferObjectTransfersInner is not found in the empty JSON string", TransferObjectTransfersInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TransferObjectTransfersInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransferObjectTransfersInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("transferStatus") != null && !jsonObj.get("transferStatus").isJsonNull()) && !jsonObj.get("transferStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferStatus").toString()));
      }
      // validate the optional field `transferStatus`
      if (jsonObj.get("transferStatus") != null && !jsonObj.get("transferStatus").isJsonNull()) {
        TransferStatusEnum.validateJsonElement(jsonObj.get("transferStatus"));
      }
      if ((jsonObj.get("transferTag") != null && !jsonObj.get("transferTag").isJsonNull()) && !jsonObj.get("transferTag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferTag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferTag").toString()));
      }
      // validate the optional field `beneficiaryWalletTypeId`
      if (jsonObj.get("beneficiaryWalletTypeId") != null && !jsonObj.get("beneficiaryWalletTypeId").isJsonNull()) {
        BeneficiaryWalletTypeIdEnum.validateJsonElement(jsonObj.get("beneficiaryWalletTypeId"));
      }
      if ((jsonObj.get("transferDate") != null && !jsonObj.get("transferDate").isJsonNull()) && !jsonObj.get("transferDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transferDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transferDate").toString()));
      }
      if ((jsonObj.get("walletEventName") != null && !jsonObj.get("walletEventName").isJsonNull()) && !jsonObj.get("walletEventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletEventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletEventName").toString()));
      }
      if ((jsonObj.get("walletAlias") != null && !jsonObj.get("walletAlias").isJsonNull()) && !jsonObj.get("walletAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `walletAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("walletAlias").toString()));
      }
      if ((jsonObj.get("beneficiaryWalletEventName") != null && !jsonObj.get("beneficiaryWalletEventName").isJsonNull()) && !jsonObj.get("beneficiaryWalletEventName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiaryWalletEventName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiaryWalletEventName").toString()));
      }
      if ((jsonObj.get("beneficiaryWalletAlias") != null && !jsonObj.get("beneficiaryWalletAlias").isJsonNull()) && !jsonObj.get("beneficiaryWalletAlias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `beneficiaryWalletAlias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("beneficiaryWalletAlias").toString()));
      }
      if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
      if ((jsonObj.get("createdDate") != null && !jsonObj.get("createdDate").isJsonNull()) && !jsonObj.get("createdDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdDate").toString()));
      }
      if ((jsonObj.get("modifiedDate") != null && !jsonObj.get("modifiedDate").isJsonNull()) && !jsonObj.get("modifiedDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `modifiedDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("modifiedDate").toString()));
      }
      if ((jsonObj.get("foreignId") != null && !jsonObj.get("foreignId").isJsonNull()) && !jsonObj.get("foreignId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `foreignId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("foreignId").toString()));
      }
      if ((jsonObj.get("partnerFee") != null && !jsonObj.get("partnerFee").isJsonNull()) && !jsonObj.get("partnerFee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partnerFee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partnerFee").toString()));
      }
      if ((jsonObj.get("codeStatus") != null && !jsonObj.get("codeStatus").isJsonNull()) && !jsonObj.get("codeStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `codeStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("codeStatus").toString()));
      }
      if ((jsonObj.get("informationStatu") != null && !jsonObj.get("informationStatu").isJsonNull()) && !jsonObj.get("informationStatu").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `informationStatu` to be a primitive type in the JSON string but got `%s`", jsonObj.get("informationStatu").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransferObjectTransfersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransferObjectTransfersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransferObjectTransfersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransferObjectTransfersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TransferObjectTransfersInner>() {
           @Override
           public void write(JsonWriter out, TransferObjectTransfersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransferObjectTransfersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TransferObjectTransfersInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TransferObjectTransfersInner
   * @throws IOException if the JSON string is invalid with respect to TransferObjectTransfersInner
   */
  public static TransferObjectTransfersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransferObjectTransfersInner.class);
  }

  /**
   * Convert an instance of TransferObjectTransfersInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

