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
import org.openapitools.client.model.CardRuleset;
import org.openapitools.client.model.CreateRuleset201Response;
import org.openapitools.client.model.CreateRulesetRequest;
import org.openapitools.client.model.DefaultError;
import org.openapitools.client.model.FullRuleset;
import org.openapitools.client.model.GetFactsBalance200Response;
import org.openapitools.client.model.GetRulesetFromCard200ResponseInner;
import org.openapitools.client.model.GetRulesets200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CardRulesetsMdcApi
 */
@Disabled
public class CardRulesetsMdcApiTest {

    private final CardRulesetsMdcApi api = new CardRulesetsMdcApi();

    /**
     * Assign Ruleset
     *
     * Assign rulesets to a given card.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void attachRulesetToCardTest() throws ApiException {
        Object cardId = null;
        List<CardRuleset> cardRuleset = null;
        api.attachRulesetToCard(cardId, cardRuleset);
        // TODO: test validations
    }

    /**
     * Create Ruleset
     *
     * Create a Ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createRulesetTest() throws ApiException {
        CreateRulesetRequest createRulesetRequest = null;
        CreateRuleset201Response response = api.createRuleset(createRulesetRequest);
        // TODO: test validations
    }

    /**
     * Disable Ruleset
     *
     * Disable a Ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableRulesetTest() throws ApiException {
        Object rulesetId = null;
        api.disableRuleset(rulesetId);
        // TODO: test validations
    }

    /**
     * Retrieve Ruleset virtual balance
     *
     * Retrieve a ruleset virtual balance.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFactsBalanceTest() throws ApiException {
        Object cardId = null;
        Object rulesetId = null;
        GetFactsBalance200Response response = api.getFactsBalance(cardId, rulesetId);
        // TODO: test validations
    }

    /**
     * Get Ruleset
     *
     * Retrieve a Ruleset with its &#x60;id&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRulesetTest() throws ApiException {
        Object rulesetId = null;
        FullRuleset response = api.getRuleset(rulesetId);
        // TODO: test validations
    }

    /**
     * Retrieve Card Rulesets
     *
     * Get all rulesets assigned to a given card.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRulesetFromCardTest() throws ApiException {
        Object cardId = null;
        List<GetRulesetFromCard200ResponseInner> response = api.getRulesetFromCard(cardId);
        // TODO: test validations
    }

    /**
     * Get Rulesets
     *
     * Retrieve all rulesets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRulesetsTest() throws ApiException {
        GetRulesets200Response response = api.getRulesets();
        // TODO: test validations
    }

    /**
     * Update Ruleset
     *
     * Modify a Ruleset.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putRulesetTest() throws ApiException {
        Object rulesetId = null;
        CreateRulesetRequest createRulesetRequest = null;
        api.putRuleset(rulesetId, createRulesetRequest);
        // TODO: test validations
    }

}
