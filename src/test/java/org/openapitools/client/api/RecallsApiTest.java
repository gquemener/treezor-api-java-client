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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.DefaultError;
import org.openapitools.client.model.GetRecallRs200Response;
import org.openapitools.client.model.GetRecallSctInst200Response;
import org.openapitools.client.model.GetRecallSctInst404Response;
import org.openapitools.client.model.PutRecallRRequest;
import org.openapitools.client.model.PutRecallSctInst201Response;
import org.openapitools.client.model.PutRecallSctInst409Response;
import org.openapitools.client.model.PutRecallSctInstRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecallsApi
 */
@Disabled
public class RecallsApiTest {

    private final RecallsApi api = new RecallsApi();

    /**
     * Get Recall or RRO
     *
     * Retrieve a given recall or RRO.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRecallRTest() throws ApiException {
        String recallId = null;
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        Integer pageCount = null;
        Integer pageNumber = null;
        GetRecallRs200Response response = api.getRecallR(recallId, accessSignature, accessTag, accessUserId, accessUserIp, pageCount, pageNumber);
        // TODO: test validations
    }

    /**
     * Get Recalls or RRO
     *
     * Retrieve recalls or RROs
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRecallRsTest() throws ApiException {
        String accessSignature = null;
        String accessTag = null;
        Integer accessUserId = null;
        String accessUserIp = null;
        Integer pageCount = null;
        Integer pageNumber = null;
        String filter = null;
        GetRecallRs200Response response = api.getRecallRs(accessSignature, accessTag, accessUserId, accessUserIp, pageCount, pageNumber, filter);
        // TODO: test validations
    }

    /**
     * Get SCT Inst Recall
     *
     * Retrieve an SCT Inst Recall.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRecallSctInstTest() throws ApiException {
        String sctInstId = null;
        String recallId = null;
        GetRecallSctInst200Response response = api.getRecallSctInst(sctInstId, recallId);
        // TODO: test validations
    }

    /**
     * Respond to Recall or RRO
     *
     * Respond to a Recall or a RRO.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putRecallRTest() throws ApiException {
        Long recallId = null;
        PutRecallRRequest putRecallRRequest = null;
        GetRecallRs200Response response = api.putRecallR(recallId, putRecallRRequest);
        // TODO: test validations
    }

    /**
     * Respond to SCT Inst Recall
     *
     * Provide your decision following an SCT Inst Recall.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putRecallSctInstTest() throws ApiException {
        String sctInstId = null;
        String recallId = null;
        PutRecallSctInstRequest putRecallSctInstRequest = null;
        PutRecallSctInst201Response response = api.putRecallSctInst(sctInstId, recallId, putRecallSctInstRequest);
        // TODO: test validations
    }

}
