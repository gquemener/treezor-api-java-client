

# UserObjectUsersInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **Integer** | The unique identifier of the User. |  [optional] |
|**userStatus** | [**UserStatusEnum**](#UserStatusEnum) |  |  [optional] |
|**userTag** | **String** |  |  [optional] |
|**parentUserId** | **Integer** |  |  [optional] |
|**parentType** | [**ParentTypeEnum**](#ParentTypeEnum) |  |  [optional] |
|**controllingPersonType** | **Integer** |  |  [optional] |
|**employeeType** | **Integer** |  |  [optional] |
|**specifiedUSPerson** | **Integer** |  |  [optional] |
|**title** | [**TitleEnum**](#TitleEnum) |  |  [optional] |
|**firstname** | **String** |  |  [optional] |
|**lastname** | **String** |  |  [optional] |
|**middleNames** | **String** |  |  [optional] |
|**birthday** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**address1** | **String** |  |  [optional] |
|**address2** | **String** |  |  [optional] |
|**address3** | **String** |  |  [optional] |
|**postcode** | **String** |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**state** | **String** |  |  [optional] |
|**country** | **String** |  |  [optional] |
|**countryName** | **String** |  |  [optional] |
|**distributionCountry** | [**DistributionCountryEnum**](#DistributionCountryEnum) | The country in which the end user is using your services.  |  [optional] |
|**secondaryAddress1** | **String** |  |  [optional] |
|**secondaryAddress2** | **String** |  |  [optional] |
|**secondaryAddress3** | **String** |  |  [optional] |
|**secondaryPostcode** | **String** |  |  [optional] |
|**secondaryCity** | **String** |  |  [optional] |
|**secondaryState** | **String** |  |  [optional] |
|**secondaryCountry** | **String** | Format ISO 3166-1 alpha-2 |  [optional] |
|**phone** | **String** |  |  [optional] |
|**mobile** | **String** |  |  [optional] |
|**nationality** | **String** | Format ISO 3166-1 alpha-2 |  [optional] |
|**nationalityOther** | **String** | Format ISO 3166-1 alpha-2 |  [optional] |
|**placeOfBirth** | **String** |  |  [optional] |
|**birthCountry** | **String** | Format ISO 3166-1 alpha-2 |  [optional] |
|**occupation** | **String** | deprecated |  [optional] |
|**incomeRange** | **String** |  |  [optional] |
|**legalName** | **String** |  |  [optional] |
|**legalNameEmbossed** | **String** |  |  [optional] |
|**legalRegistrationNumber** | **String** |  |  [optional] |
|**legalTvaNumber** | **String** |  |  [optional] |
|**legalRegistrationDate** | **String** | Date YYYY-MM-DD |  [optional] |
|**legalForm** | **String** |  |  [optional] |
|**legalShareCapital** | **Integer** |  |  [optional] |
|**legalSector** | **String** |  |  [optional] |
|**legalAnnualTurnOver** | **String** |  |  [optional] |
|**legalNetIncomeRange** | **String** |  |  [optional] |
|**legalNumberOfEmployeeRange** | **String** |  |  [optional] |
|**effectiveBeneficiary** | **Integer** |  |  [optional] |
|**kycLevel** | [**KycLevelEnum**](#KycLevelEnum) | * &#x60;0&#x60; – NONE * &#x60;1&#x60; – LIGHT * &#x60;2&#x60; – REGULAR * &#x60;3&#x60; – STRONG * &#x60;4&#x60; – REFUSED * &#x60;5&#x60; – PREVALIDATED * &#x60;6&#x60; – ENHANCED  |  [optional] |
|**kycReview** | [**KycReviewEnum**](#KycReviewEnum) | * &#x60;0&#x60; – NONE * &#x60;1&#x60; – PENDING * &#x60;2&#x60; – VALIDATED * &#x60;3&#x60; – REFUSED * &#x60;4&#x60; – INVESTIGATING (deprecated) * &#x60;5&#x60; – CLOSED (deprecated) * &#x60;6&#x60; – REVIEW_OPEN * &#x60;7&#x60; – REVIEW_PENDING  |  [optional] |
|**kycReviewComment** | **String** | A comment set by Treezor upon [KYC review](/guide/user-verification/introduction.html). It concatenates information for each KYC Review update, with the date, the &#x60;kycReview&#x60; and &#x60;kycLevel&#x60; values, and the comment from Treezor.  |  [optional] |
|**isFreezed** | **Integer** | deprecated |  [optional] |
|**isFrozen** | **Integer** |  |  [optional] |
|**language** | **String** |  |  [optional] |
|**optInMailing** | **Integer** |  |  [optional] |
|**sepaCreditorIdentifier** | **String** | The 13-character long [SEPA Creditor Identifier](/guide/overview/glossary.html#sepa-creditor-identifier-sci) of the User.  |  [optional] [readonly] |
|**taxNumber** | **String** |  |  [optional] |
|**taxResidence** | **String** |  |  [optional] |
|**position** | **String** |  |  [optional] |
|**personalAssets** | **String** |  |  [optional] |
|**activityOutsideEu** | **Integer** | Whether the entity and its business units, subsidiaries, and joint ventures have a commercial activity outside of the European Union. |  [optional] |
|**economicSanctions** | **Integer** | Whether the entity, its subsidiaries, entities, employees, directors, beneficial owners, or joint ventures are subject to Economic Sanctions. |  [optional] |
|**residentCountriesSanctions** | **Integer** | Whether the entity, its subsidiaries, or joint ventures, located within or operating from any countries or territories are subject to Comprehensive Sanctions. |  [optional] |
|**involvedSanctions** | **Integer** | Whether the entity, its subsidiaries, or joint ventures, are engaged in transactions, investments, business, or other dealings that directly or indirectly involve or benefit: * Any countries or territories subject to Comprehensive Sanctions, or * Any person or entity which is the target of any Sanctions (“Sanctioned Targets”).  |  [optional] |
|**entitySanctionsQuestionnaire** | [**EntitySanctionsQuestionnaireEnum**](#EntitySanctionsQuestionnaireEnum) | Defines the scope to which the &#x60;activityOutsideEu&#x60; field applies.  |  [optional] |
|**sanctionsQuestionnaireDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional] |
|**timezone** | **String** |  |  [optional] |
|**occupationType** | [**OccupationTypeEnum**](#OccupationTypeEnum) | Deprecated. Use &#x60;occupationCategory&#x60; instead. |  [optional] |
|**sourceOfFunds** | [**SourceOfFundsEnum**](#SourceOfFundsEnum) | The source of funds for opening an account for a company or self-employed person |  [optional] |
|**legalSectorType** | [**LegalSectorTypeEnum**](#LegalSectorTypeEnum) | Qualify the type of data in the &#x60;legalSector&#x60; field    * If it is set to NACE the legalSector needs to be in a NACE format (4 digits).    * If it is set to NAF (or not set at all) the legalSector needs to be in a NAF format (4 digits followed by a capital letter).  |  [optional] |
|**isOnStockExchange** | **Integer** | The user is a corporation and is quoted on an organized stock exchange.   * &#x60;0&#x60; – No   * &#x60;1&#x60; – Yes  |  [optional] |
|**codeStatus** | **String** |  |  [optional] |
|**informationStatus** | **String** |  |  [optional] |
|**createdDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional] |
|**modifiedDate** | **String** | Date YYYY-MM-DD HH:MM:SS |  [optional] |
|**walletCount** | **Integer** |  |  [optional] |
|**payinCount** | **Integer** |  |  [optional] |
|**totalRows** | **Integer** |  |  [optional] |
|**occupationCategory** | [**OccupationCategoryEnum**](#OccupationCategoryEnum) | Type of occupation of the user. See [Occupation Category](/guide/users/physical.html#occupation-category-occupationcategory) for the list of values.  |  [optional] |
|**personalAssetsRange** | [**PersonalAssetsRangeEnum**](#PersonalAssetsRangeEnum) | The personal assets range of the user. See [Personal Assets Range](/guide/users/physical.html#personal-assets-range-personalassetsrange) for the list of values.  |  [optional] |
|**monthlyIncomeRange** | [**MonthlyIncomeRangeEnum**](#MonthlyIncomeRangeEnum) | Net monthly income of the user. See [Monthly Income Range](/guide/users/physical.html#monthly-income-range-monthlyincomerange) for the list of values.  |  [optional] |



## Enum: UserStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| CANCELED | &quot;CANCELED&quot; |
| VALIDATED | &quot;VALIDATED&quot; |



## Enum: ParentTypeEnum

| Name | Value |
|---- | -----|
| SHAREHOLDER | &quot;shareholder&quot; |
| EMPLOYEE | &quot;employee&quot; |
| LEADER | &quot;leader&quot; |



## Enum: TitleEnum

| Name | Value |
|---- | -----|
| M | &quot;M&quot; |
| MME | &quot;MME&quot; |
| MLLE | &quot;MLLE&quot; |



## Enum: DistributionCountryEnum

| Name | Value |
|---- | -----|
| FR | &quot;FR&quot; |
| ES | &quot;ES&quot; |
| IT | &quot;IT&quot; |
| DE | &quot;DE&quot; |
| BE | &quot;BE&quot; |
| NL | &quot;NL&quot; |



## Enum: KycLevelEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |



## Enum: KycReviewEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |



## Enum: EntitySanctionsQuestionnaireEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



## Enum: OccupationTypeEnum

| Name | Value |
|---- | -----|
| SELF_EMPLOYED | &quot;self_employed&quot; |
| PUBLIC_SECTOR_EMPLOYEES | &quot;public_sector_employees&quot; |
| PRIVATE_SECTOR_EMPLOYEES | &quot;private_sector_employees&quot; |
| RETIRED_PEOPLE_AND_STUDENTS | &quot;retired_people_and_students&quot; |
| WITHOUT_ANY_PROFESSIONAL_ACTIVITY | &quot;without_any_professional_activity&quot; |



## Enum: SourceOfFundsEnum

| Name | Value |
|---- | -----|
| DONATION | &quot;donation&quot; |
| INHERITANCE | &quot;inheritance&quot; |
| LOAN | &quot;loan&quot; |
| LOTTERY | &quot;lottery&quot; |
| PENSION | &quot;pension&quot; |
| PROCEEDS_FROM_INVESTMENT | &quot;proceeds_from_investment&quot; |
| PROCEEDS_FROM_SALE | &quot;proceeds_from_sale&quot; |
| SALARY | &quot;salary&quot; |
| SAVINGS | &quot;savings&quot; |



## Enum: LegalSectorTypeEnum

| Name | Value |
|---- | -----|
| NAF | &quot;NAF&quot; |
| NACE | &quot;NACE&quot; |



## Enum: OccupationCategoryEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_13 | 13 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |



## Enum: PersonalAssetsRangeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |



## Enum: MonthlyIncomeRangeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |



