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
import org.openapitools.client.model.CardPayment;
import org.openapitools.client.model.CardPaymentAuthorisationResponseCode;
import org.openapitools.client.model.CardPaymentLocalAmount;
import org.openapitools.client.model.CardPaymentMcc;
import org.openapitools.client.model.CardPaymentMid;
import org.openapitools.client.model.Chargeback;
import org.openapitools.client.model.Payin;
import org.openapitools.client.model.PayinRefund;
import org.openapitools.client.model.PaymentLifeCycle;
import org.openapitools.client.model.Payout;
import org.openapitools.client.model.PayoutRefund;
import org.openapitools.client.model.Transfer;
import org.openapitools.jackson.nullable.JsonNullable;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-26T10:05:33.742486471+01:00[Europe/Paris]", comments = "Generator version: 7.10.0")
public class GetOperations200ResponseDataInnerMetadata extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(GetOperations200ResponseDataInnerMetadata.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetOperations200ResponseDataInnerMetadata.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetOperations200ResponseDataInnerMetadata' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CardPayment> adapterCardPayment = gson.getDelegateAdapter(this, TypeToken.get(CardPayment.class));
            final TypeAdapter<Chargeback> adapterChargeback = gson.getDelegateAdapter(this, TypeToken.get(Chargeback.class));
            final TypeAdapter<Payin> adapterPayin = gson.getDelegateAdapter(this, TypeToken.get(Payin.class));
            final TypeAdapter<PayinRefund> adapterPayinRefund = gson.getDelegateAdapter(this, TypeToken.get(PayinRefund.class));
            final TypeAdapter<Payout> adapterPayout = gson.getDelegateAdapter(this, TypeToken.get(Payout.class));
            final TypeAdapter<PayoutRefund> adapterPayoutRefund = gson.getDelegateAdapter(this, TypeToken.get(PayoutRefund.class));
            final TypeAdapter<Transfer> adapterTransfer = gson.getDelegateAdapter(this, TypeToken.get(Transfer.class));

            return (TypeAdapter<T>) new TypeAdapter<GetOperations200ResponseDataInnerMetadata>() {
                @Override
                public void write(JsonWriter out, GetOperations200ResponseDataInnerMetadata value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CardPayment`
                    if (value.getActualInstance() instanceof CardPayment) {
                        JsonElement element = adapterCardPayment.toJsonTree((CardPayment)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Chargeback`
                    if (value.getActualInstance() instanceof Chargeback) {
                        JsonElement element = adapterChargeback.toJsonTree((Chargeback)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Payin`
                    if (value.getActualInstance() instanceof Payin) {
                        JsonElement element = adapterPayin.toJsonTree((Payin)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `PayinRefund`
                    if (value.getActualInstance() instanceof PayinRefund) {
                        JsonElement element = adapterPayinRefund.toJsonTree((PayinRefund)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Payout`
                    if (value.getActualInstance() instanceof Payout) {
                        JsonElement element = adapterPayout.toJsonTree((Payout)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `PayoutRefund`
                    if (value.getActualInstance() instanceof PayoutRefund) {
                        JsonElement element = adapterPayoutRefund.toJsonTree((PayoutRefund)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `Transfer`
                    if (value.getActualInstance() instanceof Transfer) {
                        JsonElement element = adapterTransfer.toJsonTree((Transfer)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CardPayment, Chargeback, Payin, PayinRefund, Payout, PayoutRefund, Transfer");
                }

                @Override
                public GetOperations200ResponseDataInnerMetadata read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CardPayment
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CardPayment.validateJsonElement(jsonElement);
                        actualAdapter = adapterCardPayment;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CardPayment'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CardPayment failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CardPayment'", e);
                    }
                    // deserialize Chargeback
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Chargeback.validateJsonElement(jsonElement);
                        actualAdapter = adapterChargeback;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Chargeback'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Chargeback failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Chargeback'", e);
                    }
                    // deserialize Payin
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Payin.validateJsonElement(jsonElement);
                        actualAdapter = adapterPayin;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Payin'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Payin failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Payin'", e);
                    }
                    // deserialize PayinRefund
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PayinRefund.validateJsonElement(jsonElement);
                        actualAdapter = adapterPayinRefund;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PayinRefund'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PayinRefund failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PayinRefund'", e);
                    }
                    // deserialize Payout
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Payout.validateJsonElement(jsonElement);
                        actualAdapter = adapterPayout;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Payout'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Payout failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Payout'", e);
                    }
                    // deserialize PayoutRefund
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PayoutRefund.validateJsonElement(jsonElement);
                        actualAdapter = adapterPayoutRefund;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PayoutRefund'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PayoutRefund failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PayoutRefund'", e);
                    }
                    // deserialize Transfer
                    try {
                        // validate the JSON object to see if any exception is thrown
                        Transfer.validateJsonElement(jsonElement);
                        actualAdapter = adapterTransfer;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'Transfer'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for Transfer failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'Transfer'", e);
                    }

                    if (match == 1) {
                        GetOperations200ResponseDataInnerMetadata ret = new GetOperations200ResponseDataInnerMetadata();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for GetOperations200ResponseDataInnerMetadata: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public GetOperations200ResponseDataInnerMetadata() {
        super("oneOf", Boolean.FALSE);
    }

    public GetOperations200ResponseDataInnerMetadata(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CardPayment", CardPayment.class);
        schemas.put("Chargeback", Chargeback.class);
        schemas.put("Payin", Payin.class);
        schemas.put("PayinRefund", PayinRefund.class);
        schemas.put("Payout", Payout.class);
        schemas.put("PayoutRefund", PayoutRefund.class);
        schemas.put("Transfer", Transfer.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return GetOperations200ResponseDataInnerMetadata.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CardPayment, Chargeback, Payin, PayinRefund, Payout, PayoutRefund, Transfer
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CardPayment) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Chargeback) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Payin) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PayinRefund) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Payout) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PayoutRefund) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof Transfer) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CardPayment, Chargeback, Payin, PayinRefund, Payout, PayoutRefund, Transfer");
    }

    /**
     * Get the actual instance, which can be the following:
     * CardPayment, Chargeback, Payin, PayinRefund, Payout, PayoutRefund, Transfer
     *
     * @return The actual instance (CardPayment, Chargeback, Payin, PayinRefund, Payout, PayoutRefund, Transfer)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CardPayment`. If the actual instance is not `CardPayment`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CardPayment`
     * @throws ClassCastException if the instance is not `CardPayment`
     */
    public CardPayment getCardPayment() throws ClassCastException {
        return (CardPayment)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Chargeback`. If the actual instance is not `Chargeback`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Chargeback`
     * @throws ClassCastException if the instance is not `Chargeback`
     */
    public Chargeback getChargeback() throws ClassCastException {
        return (Chargeback)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Payin`. If the actual instance is not `Payin`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Payin`
     * @throws ClassCastException if the instance is not `Payin`
     */
    public Payin getPayin() throws ClassCastException {
        return (Payin)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PayinRefund`. If the actual instance is not `PayinRefund`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PayinRefund`
     * @throws ClassCastException if the instance is not `PayinRefund`
     */
    public PayinRefund getPayinRefund() throws ClassCastException {
        return (PayinRefund)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Payout`. If the actual instance is not `Payout`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Payout`
     * @throws ClassCastException if the instance is not `Payout`
     */
    public Payout getPayout() throws ClassCastException {
        return (Payout)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PayoutRefund`. If the actual instance is not `PayoutRefund`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PayoutRefund`
     * @throws ClassCastException if the instance is not `PayoutRefund`
     */
    public PayoutRefund getPayoutRefund() throws ClassCastException {
        return (PayoutRefund)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Transfer`. If the actual instance is not `Transfer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Transfer`
     * @throws ClassCastException if the instance is not `Transfer`
     */
    public Transfer getTransfer() throws ClassCastException {
        return (Transfer)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GetOperations200ResponseDataInnerMetadata
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CardPayment
        try {
            CardPayment.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CardPayment failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Chargeback
        try {
            Chargeback.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Chargeback failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Payin
        try {
            Payin.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Payin failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with PayinRefund
        try {
            PayinRefund.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PayinRefund failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Payout
        try {
            Payout.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Payout failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with PayoutRefund
        try {
            PayoutRefund.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PayoutRefund failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with Transfer
        try {
            Transfer.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for Transfer failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for GetOperations200ResponseDataInnerMetadata with oneOf schemas: CardPayment, Chargeback, Payin, PayinRefund, Payout, PayoutRefund, Transfer. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of GetOperations200ResponseDataInnerMetadata given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetOperations200ResponseDataInnerMetadata
     * @throws IOException if the JSON string is invalid with respect to GetOperations200ResponseDataInnerMetadata
     */
    public static GetOperations200ResponseDataInnerMetadata fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetOperations200ResponseDataInnerMetadata.class);
    }

    /**
     * Convert an instance of GetOperations200ResponseDataInnerMetadata to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

