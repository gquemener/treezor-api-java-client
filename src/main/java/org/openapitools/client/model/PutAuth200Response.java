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
import org.openapitools.client.model.PutAuth200ResponseOneOf;
import org.openapitools.client.model.PutAuth200ResponseOneOf1;
import org.openapitools.client.model.PutAuth200ResponseOneOf2;



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
public class PutAuth200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PutAuth200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PutAuth200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PutAuth200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PutAuth200ResponseOneOf> adapterPutAuth200ResponseOneOf = gson.getDelegateAdapter(this, TypeToken.get(PutAuth200ResponseOneOf.class));
            final TypeAdapter<PutAuth200ResponseOneOf1> adapterPutAuth200ResponseOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(PutAuth200ResponseOneOf1.class));
            final TypeAdapter<PutAuth200ResponseOneOf2> adapterPutAuth200ResponseOneOf2 = gson.getDelegateAdapter(this, TypeToken.get(PutAuth200ResponseOneOf2.class));

            return (TypeAdapter<T>) new TypeAdapter<PutAuth200Response>() {
                @Override
                public void write(JsonWriter out, PutAuth200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PutAuth200ResponseOneOf`
                    if (value.getActualInstance() instanceof PutAuth200ResponseOneOf) {
                        JsonElement element = adapterPutAuth200ResponseOneOf.toJsonTree((PutAuth200ResponseOneOf)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `PutAuth200ResponseOneOf1`
                    if (value.getActualInstance() instanceof PutAuth200ResponseOneOf1) {
                        JsonElement element = adapterPutAuth200ResponseOneOf1.toJsonTree((PutAuth200ResponseOneOf1)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `PutAuth200ResponseOneOf2`
                    if (value.getActualInstance() instanceof PutAuth200ResponseOneOf2) {
                        JsonElement element = adapterPutAuth200ResponseOneOf2.toJsonTree((PutAuth200ResponseOneOf2)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: PutAuth200ResponseOneOf, PutAuth200ResponseOneOf1, PutAuth200ResponseOneOf2");
                }

                @Override
                public PutAuth200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize PutAuth200ResponseOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PutAuth200ResponseOneOf.validateJsonElement(jsonElement);
                        actualAdapter = adapterPutAuth200ResponseOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PutAuth200ResponseOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PutAuth200ResponseOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PutAuth200ResponseOneOf'", e);
                    }
                    // deserialize PutAuth200ResponseOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PutAuth200ResponseOneOf1.validateJsonElement(jsonElement);
                        actualAdapter = adapterPutAuth200ResponseOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PutAuth200ResponseOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PutAuth200ResponseOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PutAuth200ResponseOneOf1'", e);
                    }
                    // deserialize PutAuth200ResponseOneOf2
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PutAuth200ResponseOneOf2.validateJsonElement(jsonElement);
                        actualAdapter = adapterPutAuth200ResponseOneOf2;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PutAuth200ResponseOneOf2'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PutAuth200ResponseOneOf2 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PutAuth200ResponseOneOf2'", e);
                    }

                    if (match == 1) {
                        PutAuth200Response ret = new PutAuth200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for PutAuth200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public PutAuth200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public PutAuth200Response(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PutAuth200ResponseOneOf", PutAuth200ResponseOneOf.class);
        schemas.put("PutAuth200ResponseOneOf1", PutAuth200ResponseOneOf1.class);
        schemas.put("PutAuth200ResponseOneOf2", PutAuth200ResponseOneOf2.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return PutAuth200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PutAuth200ResponseOneOf, PutAuth200ResponseOneOf1, PutAuth200ResponseOneOf2
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PutAuth200ResponseOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PutAuth200ResponseOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PutAuth200ResponseOneOf2) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PutAuth200ResponseOneOf, PutAuth200ResponseOneOf1, PutAuth200ResponseOneOf2");
    }

    /**
     * Get the actual instance, which can be the following:
     * PutAuth200ResponseOneOf, PutAuth200ResponseOneOf1, PutAuth200ResponseOneOf2
     *
     * @return The actual instance (PutAuth200ResponseOneOf, PutAuth200ResponseOneOf1, PutAuth200ResponseOneOf2)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PutAuth200ResponseOneOf`. If the actual instance is not `PutAuth200ResponseOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PutAuth200ResponseOneOf`
     * @throws ClassCastException if the instance is not `PutAuth200ResponseOneOf`
     */
    public PutAuth200ResponseOneOf getPutAuth200ResponseOneOf() throws ClassCastException {
        return (PutAuth200ResponseOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PutAuth200ResponseOneOf1`. If the actual instance is not `PutAuth200ResponseOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PutAuth200ResponseOneOf1`
     * @throws ClassCastException if the instance is not `PutAuth200ResponseOneOf1`
     */
    public PutAuth200ResponseOneOf1 getPutAuth200ResponseOneOf1() throws ClassCastException {
        return (PutAuth200ResponseOneOf1)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PutAuth200ResponseOneOf2`. If the actual instance is not `PutAuth200ResponseOneOf2`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PutAuth200ResponseOneOf2`
     * @throws ClassCastException if the instance is not `PutAuth200ResponseOneOf2`
     */
    public PutAuth200ResponseOneOf2 getPutAuth200ResponseOneOf2() throws ClassCastException {
        return (PutAuth200ResponseOneOf2)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PutAuth200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with PutAuth200ResponseOneOf
        try {
            PutAuth200ResponseOneOf.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PutAuth200ResponseOneOf failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with PutAuth200ResponseOneOf1
        try {
            PutAuth200ResponseOneOf1.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PutAuth200ResponseOneOf1 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with PutAuth200ResponseOneOf2
        try {
            PutAuth200ResponseOneOf2.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for PutAuth200ResponseOneOf2 failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for PutAuth200Response with oneOf schemas: PutAuth200ResponseOneOf, PutAuth200ResponseOneOf1, PutAuth200ResponseOneOf2. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of PutAuth200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PutAuth200Response
     * @throws IOException if the JSON string is invalid with respect to PutAuth200Response
     */
    public static PutAuth200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PutAuth200Response.class);
    }

    /**
     * Convert an instance of PutAuth200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

