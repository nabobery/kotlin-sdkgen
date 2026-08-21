package com.nabobery.sdkgen.github.generated.billing

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.BillingAiCreditUsageReportOrg
import com.nabobery.sdkgen.github.generated.BillingAiCreditUsageReportUser
import com.nabobery.sdkgen.github.generated.BillingPremiumRequestUsageReportOrg
import com.nabobery.sdkgen.github.generated.BillingPremiumRequestUsageReportUser
import com.nabobery.sdkgen.github.generated.BillingUsageReport
import com.nabobery.sdkgen.github.generated.BillingUsageReportUser
import com.nabobery.sdkgen.github.generated.BillingUsageSummaryReportOrg
import com.nabobery.sdkgen.github.generated.BillingUsageSummaryReportUser
import com.nabobery.sdkgen.github.generated.CreateBudget
import com.nabobery.sdkgen.github.generated.DeleteBudget
import com.nabobery.sdkgen.github.generated.GetAllBudgets
import com.nabobery.sdkgen.github.generated.GetBudget
import com.nabobery.sdkgen.github.generated.InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf
import com.nabobery.sdkgen.github.generated.InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440
import com.nabobery.sdkgen.github.generated.InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155
import com.nabobery.sdkgen.github.generated.InlineServiceUnavailableResponseJsonX4cf316d5
import com.nabobery.sdkgen.github.generated.ScimError
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.UpdateBudget
import com.nabobery.sdkgen.github.generated.ValidationError
import com.nabobery.sdkgen.runtime.BackoffHints
import com.nabobery.sdkgen.runtime.CallOptions
import com.nabobery.sdkgen.runtime.KotlinxSerializationCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodec
import com.nabobery.sdkgen.runtime.MediaTypeCodecRegistry
import com.nabobery.sdkgen.runtime.OperationMetadata
import com.nabobery.sdkgen.runtime.OperationSafety
import com.nabobery.sdkgen.runtime.ResponseAlternative
import com.nabobery.sdkgen.runtime.ResponseSelector
import com.nabobery.sdkgen.runtime.RetryDescriptor
import com.nabobery.sdkgen.runtime.SdkApiException
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkByteStream
import com.nabobery.sdkgen.runtime.SdkDeadlines
import com.nabobery.sdkgen.runtime.SdkExecutionRequest
import com.nabobery.sdkgen.runtime.SdkExecutor
import com.nabobery.sdkgen.runtime.SdkHeader
import com.nabobery.sdkgen.runtime.SdkParameterLocation
import com.nabobery.sdkgen.runtime.SdkRequestParameter
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.nullable

internal object BillingCodecs {
  internal const val BILLINGCREATEORGANIZATIONBUDGET_REQUEST_CODEC_ID: String =
      "billing/create-organization-budget.request"

  private val billingCreateOrganizationBudgetRequestCodec:
      MediaTypeCodec<InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155?> =
      KotlinxSerializationCodec(BILLINGCREATEORGANIZATIONBUDGET_REQUEST_CODEC_ID, InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155.Serializer.nullable, SdkJson)

  internal const val BILLINGCREATEORGANIZATIONBUDGET_RESPONSE_CODEC_ID: String =
      "billing/create-organization-budget.response"

  private val billingCreateOrganizationBudgetResponseCodec: MediaTypeCodec<CreateBudget> =
      KotlinxSerializationCodec(BILLINGCREATEORGANIZATIONBUDGET_RESPONSE_CODEC_ID, CreateBudget.Serializer, SdkJson)

  private val billingCreateOrganizationBudgetResponseCodecAlternative0Codec:
      MediaTypeCodec<CreateBudget> =
      KotlinxSerializationCodec("billing/create-organization-budget.response.alternative0", CreateBudget.Serializer, SdkJson)

  internal val billingCreateOrganizationBudgetResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreateBudget> =
      MediaTypeCodecRegistry.of(billingCreateOrganizationBudgetResponseCodecAlternative0Codec)

  private val billingCreateOrganizationBudgetResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/create-organization-budget.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingCreateOrganizationBudgetResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingCreateOrganizationBudgetResponseCodecAlternative1Codec)

  private val billingCreateOrganizationBudgetResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/create-organization-budget.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingCreateOrganizationBudgetResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingCreateOrganizationBudgetResponseCodecAlternative2Codec)

  private val billingCreateOrganizationBudgetResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/create-organization-budget.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingCreateOrganizationBudgetResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingCreateOrganizationBudgetResponseCodecAlternative3Codec)

  private val billingCreateOrganizationBudgetResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/create-organization-budget.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingCreateOrganizationBudgetResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingCreateOrganizationBudgetResponseCodecAlternative4Codec)

  private val billingCreateOrganizationBudgetResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/create-organization-budget.response.alternative5", BasicError.Serializer, SdkJson)

  internal val billingCreateOrganizationBudgetResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingCreateOrganizationBudgetResponseCodecAlternative5Codec)

  private val billingCreateOrganizationBudgetResponseCodecAlternative6Codec:
      MediaTypeCodec<ValidationError> =
      KotlinxSerializationCodec("billing/create-organization-budget.response.alternative6", ValidationError.Serializer, SdkJson)

  internal val billingCreateOrganizationBudgetResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(billingCreateOrganizationBudgetResponseCodecAlternative6Codec)

  private val billingCreateOrganizationBudgetResponseCodecAlternative7Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/create-organization-budget.response.alternative7", BasicError.Serializer, SdkJson)

  internal val billingCreateOrganizationBudgetResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingCreateOrganizationBudgetResponseCodecAlternative7Codec)

  internal val billingCreateOrganizationBudgetRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155?> =
      MediaTypeCodecRegistry.of(billingCreateOrganizationBudgetRequestCodec)

  internal val billingCreateOrganizationBudgetResponseCodecRegistry:
      MediaTypeCodecRegistry<CreateBudget> =
      MediaTypeCodecRegistry.of(billingCreateOrganizationBudgetResponseCodec)

  internal const val BILLINGDELETEBUDGETORG_RESPONSE_CODEC_ID: String =
      "billing/delete-budget-org.response"

  private val billingDeleteBudgetOrgResponseCodec: MediaTypeCodec<DeleteBudget> =
      KotlinxSerializationCodec(BILLINGDELETEBUDGETORG_RESPONSE_CODEC_ID, DeleteBudget.Serializer, SdkJson)

  private val billingDeleteBudgetOrgResponseCodecAlternative0Codec: MediaTypeCodec<DeleteBudget> =
      KotlinxSerializationCodec("billing/delete-budget-org.response.alternative0", DeleteBudget.Serializer, SdkJson)

  internal val billingDeleteBudgetOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeleteBudget> =
      MediaTypeCodecRegistry.of(billingDeleteBudgetOrgResponseCodecAlternative0Codec)

  private val billingDeleteBudgetOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/delete-budget-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingDeleteBudgetOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingDeleteBudgetOrgResponseCodecAlternative1Codec)

  private val billingDeleteBudgetOrgResponseCodecAlternative2Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/delete-budget-org.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingDeleteBudgetOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingDeleteBudgetOrgResponseCodecAlternative2Codec)

  private val billingDeleteBudgetOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/delete-budget-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingDeleteBudgetOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingDeleteBudgetOrgResponseCodecAlternative3Codec)

  private val billingDeleteBudgetOrgResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/delete-budget-org.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingDeleteBudgetOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingDeleteBudgetOrgResponseCodecAlternative4Codec)

  private val billingDeleteBudgetOrgResponseCodecAlternative5Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/delete-budget-org.response.alternative5", BasicError.Serializer, SdkJson)

  internal val billingDeleteBudgetOrgResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingDeleteBudgetOrgResponseCodecAlternative5Codec)

  private val billingDeleteBudgetOrgResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("billing/delete-budget-org.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val billingDeleteBudgetOrgResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(billingDeleteBudgetOrgResponseCodecAlternative6Codec)

  internal val billingDeleteBudgetOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val billingDeleteBudgetOrgResponseCodecRegistry: MediaTypeCodecRegistry<DeleteBudget> =
      MediaTypeCodecRegistry.of(billingDeleteBudgetOrgResponseCodec)

  internal const val BILLINGGETALLBUDGETSORG_RESPONSE_CODEC_ID: String =
      "billing/get-all-budgets-org.response"

  private val billingGetAllBudgetsOrgResponseCodec: MediaTypeCodec<GetAllBudgets> =
      KotlinxSerializationCodec(BILLINGGETALLBUDGETSORG_RESPONSE_CODEC_ID, GetAllBudgets.Serializer, SdkJson)

  private val billingGetAllBudgetsOrgResponseCodecAlternative0Codec: MediaTypeCodec<GetAllBudgets> =
      KotlinxSerializationCodec("billing/get-all-budgets-org.response.alternative0", GetAllBudgets.Serializer, SdkJson)

  internal val billingGetAllBudgetsOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GetAllBudgets> =
      MediaTypeCodecRegistry.of(billingGetAllBudgetsOrgResponseCodecAlternative0Codec)

  private val billingGetAllBudgetsOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-all-budgets-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingGetAllBudgetsOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetAllBudgetsOrgResponseCodecAlternative1Codec)

  private val billingGetAllBudgetsOrgResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-all-budgets-org.response.alternative2", BasicError.Serializer, SdkJson)

  internal val billingGetAllBudgetsOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetAllBudgetsOrgResponseCodecAlternative2Codec)

  private val billingGetAllBudgetsOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-all-budgets-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingGetAllBudgetsOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetAllBudgetsOrgResponseCodecAlternative3Codec)

  internal val billingGetAllBudgetsOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val billingGetAllBudgetsOrgResponseCodecRegistry: MediaTypeCodecRegistry<GetAllBudgets> =
      MediaTypeCodecRegistry.of(billingGetAllBudgetsOrgResponseCodec)

  internal const val BILLINGGETBUDGETORG_RESPONSE_CODEC_ID: String =
      "billing/get-budget-org.response"

  private val billingGetBudgetOrgResponseCodec: MediaTypeCodec<GetBudget> =
      KotlinxSerializationCodec(BILLINGGETBUDGETORG_RESPONSE_CODEC_ID, GetBudget.Serializer, SdkJson)

  private val billingGetBudgetOrgResponseCodecAlternative0Codec: MediaTypeCodec<GetBudget> =
      KotlinxSerializationCodec("billing/get-budget-org.response.alternative0", GetBudget.Serializer, SdkJson)

  internal val billingGetBudgetOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GetBudget> =
      MediaTypeCodecRegistry.of(billingGetBudgetOrgResponseCodecAlternative0Codec)

  private val billingGetBudgetOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-budget-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingGetBudgetOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetBudgetOrgResponseCodecAlternative1Codec)

  private val billingGetBudgetOrgResponseCodecAlternative2Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/get-budget-org.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingGetBudgetOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingGetBudgetOrgResponseCodecAlternative2Codec)

  private val billingGetBudgetOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-budget-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingGetBudgetOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetBudgetOrgResponseCodecAlternative3Codec)

  private val billingGetBudgetOrgResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-budget-org.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingGetBudgetOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetBudgetOrgResponseCodecAlternative4Codec)

  private val billingGetBudgetOrgResponseCodecAlternative5Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-budget-org.response.alternative5", BasicError.Serializer, SdkJson)

  internal val billingGetBudgetOrgResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetBudgetOrgResponseCodecAlternative5Codec)

  private val billingGetBudgetOrgResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("billing/get-budget-org.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val billingGetBudgetOrgResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(billingGetBudgetOrgResponseCodecAlternative6Codec)

  internal val billingGetBudgetOrgRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val billingGetBudgetOrgResponseCodecRegistry: MediaTypeCodecRegistry<GetBudget> =
      MediaTypeCodecRegistry.of(billingGetBudgetOrgResponseCodec)

  internal const val BILLINGGETGITHUBBILLINGAICREDITUSAGEREPORTORG_RESPONSE_CODEC_ID: String =
      "billing/get-github-billing-ai-credit-usage-report-org.response"

  private val billingGetGithubBillingAiCreditUsageReportOrgResponseCodec:
      MediaTypeCodec<BillingAiCreditUsageReportOrg> =
      KotlinxSerializationCodec(BILLINGGETGITHUBBILLINGAICREDITUSAGEREPORTORG_RESPONSE_CODEC_ID, BillingAiCreditUsageReportOrg.Serializer, SdkJson)

  private val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingAiCreditUsageReportOrg> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-org.response.alternative0", BillingAiCreditUsageReportOrg.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingAiCreditUsageReportOrg> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative0Codec)

  private val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative1Codec)

  private val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-org.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative2Codec)

  private val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative3Codec)

  private val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-org.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative4Codec)

  private val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-org.response.alternative5", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative5Codec)

  private val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-org.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative6Codec)

  internal val billingGetGithubBillingAiCreditUsageReportOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val billingGetGithubBillingAiCreditUsageReportOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<BillingAiCreditUsageReportOrg> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportOrgResponseCodec)

  internal const val BILLINGGETGITHUBBILLINGAICREDITUSAGEREPORTUSER_RESPONSE_CODEC_ID: String =
      "billing/get-github-billing-ai-credit-usage-report-user.response"

  private val billingGetGithubBillingAiCreditUsageReportUserResponseCodec:
      MediaTypeCodec<BillingAiCreditUsageReportUser> =
      KotlinxSerializationCodec(BILLINGGETGITHUBBILLINGAICREDITUSAGEREPORTUSER_RESPONSE_CODEC_ID, BillingAiCreditUsageReportUser.Serializer, SdkJson)

  private val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingAiCreditUsageReportUser> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-user.response.alternative0", BillingAiCreditUsageReportUser.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingAiCreditUsageReportUser> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative0Codec)

  private val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative1Codec)

  private val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-user.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative2Codec)

  private val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative3Codec)

  private val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-user.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative4Codec)

  private val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-user.response.alternative5", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative5Codec)

  private val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("billing/get-github-billing-ai-credit-usage-report-user.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative6Codec)

  internal val billingGetGithubBillingAiCreditUsageReportUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val billingGetGithubBillingAiCreditUsageReportUserResponseCodecRegistry:
      MediaTypeCodecRegistry<BillingAiCreditUsageReportUser> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingAiCreditUsageReportUserResponseCodec)

  internal const val BILLINGGETGITHUBBILLINGPREMIUMREQUESTUSAGEREPORTORG_RESPONSE_CODEC_ID: String =
      "billing/get-github-billing-premium-request-usage-report-org.response"

  private val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodec:
      MediaTypeCodec<BillingPremiumRequestUsageReportOrg> =
      KotlinxSerializationCodec(BILLINGGETGITHUBBILLINGPREMIUMREQUESTUSAGEREPORTORG_RESPONSE_CODEC_ID, BillingPremiumRequestUsageReportOrg.Serializer, SdkJson)

  private val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingPremiumRequestUsageReportOrg> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-org.response.alternative0", BillingPremiumRequestUsageReportOrg.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingPremiumRequestUsageReportOrg> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative0Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative1Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-org.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative2Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative3Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-org.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative4Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-org.response.alternative5", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative5Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-org.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative6Codec)

  internal val billingGetGithubBillingPremiumRequestUsageReportOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<BillingPremiumRequestUsageReportOrg> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodec)

  internal const val BILLINGGETGITHUBBILLINGPREMIUMREQUESTUSAGEREPORTUSER_RESPONSE_CODEC_ID: String
      = "billing/get-github-billing-premium-request-usage-report-user.response"

  private val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodec:
      MediaTypeCodec<BillingPremiumRequestUsageReportUser> =
      KotlinxSerializationCodec(BILLINGGETGITHUBBILLINGPREMIUMREQUESTUSAGEREPORTUSER_RESPONSE_CODEC_ID, BillingPremiumRequestUsageReportUser.Serializer, SdkJson)

  private val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingPremiumRequestUsageReportUser> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-user.response.alternative0", BillingPremiumRequestUsageReportUser.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingPremiumRequestUsageReportUser> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative0Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative1Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-user.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative2Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative3Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-user.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative4Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-user.response.alternative5", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative5Codec)

  private val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("billing/get-github-billing-premium-request-usage-report-user.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative6Codec)

  internal val billingGetGithubBillingPremiumRequestUsageReportUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecRegistry:
      MediaTypeCodecRegistry<BillingPremiumRequestUsageReportUser> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingPremiumRequestUsageReportUserResponseCodec)

  internal const val BILLINGGETGITHUBBILLINGUSAGEREPORTORG_RESPONSE_CODEC_ID: String =
      "billing/get-github-billing-usage-report-org.response"

  private val billingGetGithubBillingUsageReportOrgResponseCodec: MediaTypeCodec<BillingUsageReport>
      =
      KotlinxSerializationCodec(BILLINGGETGITHUBBILLINGUSAGEREPORTORG_RESPONSE_CODEC_ID, BillingUsageReport.Serializer, SdkJson)

  private val billingGetGithubBillingUsageReportOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingUsageReport> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-org.response.alternative0", BillingUsageReport.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingUsageReport> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportOrgResponseCodecAlternative0Codec)

  private val billingGetGithubBillingUsageReportOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportOrgResponseCodecAlternative1Codec)

  private val billingGetGithubBillingUsageReportOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-org.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportOrgResponseCodecAlternative2Codec)

  private val billingGetGithubBillingUsageReportOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportOrgResponseCodecAlternative3Codec)

  private val billingGetGithubBillingUsageReportOrgResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-org.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportOrgResponseCodecAlternative4Codec)

  private val billingGetGithubBillingUsageReportOrgResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-org.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportOrgResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportOrgResponseCodecAlternative5Codec)

  internal val billingGetGithubBillingUsageReportOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val billingGetGithubBillingUsageReportOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<BillingUsageReport> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportOrgResponseCodec)

  internal const val BILLINGGETGITHUBBILLINGUSAGEREPORTUSER_RESPONSE_CODEC_ID: String =
      "billing/get-github-billing-usage-report-user.response"

  private val billingGetGithubBillingUsageReportUserResponseCodec:
      MediaTypeCodec<BillingUsageReportUser> =
      KotlinxSerializationCodec(BILLINGGETGITHUBBILLINGUSAGEREPORTUSER_RESPONSE_CODEC_ID, BillingUsageReportUser.Serializer, SdkJson)

  private val billingGetGithubBillingUsageReportUserResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingUsageReportUser> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-user.response.alternative0", BillingUsageReportUser.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingUsageReportUser> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportUserResponseCodecAlternative0Codec)

  private val billingGetGithubBillingUsageReportUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportUserResponseCodecAlternative1Codec)

  private val billingGetGithubBillingUsageReportUserResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-user.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportUserResponseCodecAlternative2Codec)

  private val billingGetGithubBillingUsageReportUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportUserResponseCodecAlternative3Codec)

  private val billingGetGithubBillingUsageReportUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-user.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportUserResponseCodecAlternative4Codec)

  private val billingGetGithubBillingUsageReportUserResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-report-user.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageReportUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportUserResponseCodecAlternative5Codec)

  internal val billingGetGithubBillingUsageReportUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val billingGetGithubBillingUsageReportUserResponseCodecRegistry:
      MediaTypeCodecRegistry<BillingUsageReportUser> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageReportUserResponseCodec)

  internal const val BILLINGGETGITHUBBILLINGUSAGESUMMARYREPORTORG_RESPONSE_CODEC_ID: String =
      "billing/get-github-billing-usage-summary-report-org.response"

  private val billingGetGithubBillingUsageSummaryReportOrgResponseCodec:
      MediaTypeCodec<BillingUsageSummaryReportOrg> =
      KotlinxSerializationCodec(BILLINGGETGITHUBBILLINGUSAGESUMMARYREPORTORG_RESPONSE_CODEC_ID, BillingUsageSummaryReportOrg.Serializer, SdkJson)

  private val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingUsageSummaryReportOrg> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-org.response.alternative0", BillingUsageSummaryReportOrg.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingUsageSummaryReportOrg> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative0Codec)

  private val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative1Codec)

  private val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-org.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative2Codec)

  private val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative3Codec)

  private val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-org.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative4Codec)

  private val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative5Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-org.response.alternative5", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative5Codec)

  internal val billingGetGithubBillingUsageSummaryReportOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val billingGetGithubBillingUsageSummaryReportOrgResponseCodecRegistry:
      MediaTypeCodecRegistry<BillingUsageSummaryReportOrg> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportOrgResponseCodec)

  internal const val BILLINGGETGITHUBBILLINGUSAGESUMMARYREPORTUSER_RESPONSE_CODEC_ID: String =
      "billing/get-github-billing-usage-summary-report-user.response"

  private val billingGetGithubBillingUsageSummaryReportUserResponseCodec:
      MediaTypeCodec<BillingUsageSummaryReportUser> =
      KotlinxSerializationCodec(BILLINGGETGITHUBBILLINGUSAGESUMMARYREPORTUSER_RESPONSE_CODEC_ID, BillingUsageSummaryReportUser.Serializer, SdkJson)

  private val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative0Codec:
      MediaTypeCodec<BillingUsageSummaryReportUser> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-user.response.alternative0", BillingUsageSummaryReportUser.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<BillingUsageSummaryReportUser> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative0Codec)

  private val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-user.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative1Codec)

  private val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative2Codec:
      MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-user.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative2Codec)

  private val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative3Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-user.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative3Codec)

  private val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative4Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-user.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative4Codec)

  private val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative5Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-user.response.alternative5", BasicError.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative5Codec)

  private val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative6Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("billing/get-github-billing-usage-summary-report-user.response.alternative6", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  internal val billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative6Codec)

  internal val billingGetGithubBillingUsageSummaryReportUserRequestCodecRegistry:
      MediaTypeCodecRegistry<Unit> = MediaTypeCodecRegistry.of()

  internal val billingGetGithubBillingUsageSummaryReportUserResponseCodecRegistry:
      MediaTypeCodecRegistry<BillingUsageSummaryReportUser> =
      MediaTypeCodecRegistry.of(billingGetGithubBillingUsageSummaryReportUserResponseCodec)

  internal const val BILLINGUPDATEBUDGETORG_REQUEST_CODEC_ID: String =
      "billing/update-budget-org.request"

  private val billingUpdateBudgetOrgRequestCodec:
      MediaTypeCodec<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440> =
      KotlinxSerializationCodec(BILLINGUPDATEBUDGETORG_REQUEST_CODEC_ID, InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440.Serializer, SdkJson)

  internal const val BILLINGUPDATEBUDGETORG_RESPONSE_CODEC_ID: String =
      "billing/update-budget-org.response"

  private val billingUpdateBudgetOrgResponseCodec: MediaTypeCodec<UpdateBudget> =
      KotlinxSerializationCodec(BILLINGUPDATEBUDGETORG_RESPONSE_CODEC_ID, UpdateBudget.Serializer, SdkJson)

  private val billingUpdateBudgetOrgResponseCodecAlternative0Codec: MediaTypeCodec<UpdateBudget> =
      KotlinxSerializationCodec("billing/update-budget-org.response.alternative0", UpdateBudget.Serializer, SdkJson)

  internal val billingUpdateBudgetOrgResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<UpdateBudget> =
      MediaTypeCodecRegistry.of(billingUpdateBudgetOrgResponseCodecAlternative0Codec)

  private val billingUpdateBudgetOrgResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/update-budget-org.response.alternative1", BasicError.Serializer, SdkJson)

  internal val billingUpdateBudgetOrgResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingUpdateBudgetOrgResponseCodecAlternative1Codec)

  private val billingUpdateBudgetOrgResponseCodecAlternative2Codec: MediaTypeCodec<ScimError> =
      KotlinxSerializationCodec("billing/update-budget-org.response.alternative2", ScimError.Serializer, SdkJson)

  internal val billingUpdateBudgetOrgResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ScimError> =
      MediaTypeCodecRegistry.of(billingUpdateBudgetOrgResponseCodecAlternative2Codec)

  private val billingUpdateBudgetOrgResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/update-budget-org.response.alternative3", BasicError.Serializer, SdkJson)

  internal val billingUpdateBudgetOrgResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingUpdateBudgetOrgResponseCodecAlternative3Codec)

  private val billingUpdateBudgetOrgResponseCodecAlternative4Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/update-budget-org.response.alternative4", BasicError.Serializer, SdkJson)

  internal val billingUpdateBudgetOrgResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingUpdateBudgetOrgResponseCodecAlternative4Codec)

  private val billingUpdateBudgetOrgResponseCodecAlternative5Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/update-budget-org.response.alternative5", BasicError.Serializer, SdkJson)

  internal val billingUpdateBudgetOrgResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingUpdateBudgetOrgResponseCodecAlternative5Codec)

  private val billingUpdateBudgetOrgResponseCodecAlternative6Codec: MediaTypeCodec<ValidationError>
      =
      KotlinxSerializationCodec("billing/update-budget-org.response.alternative6", ValidationError.Serializer, SdkJson)

  internal val billingUpdateBudgetOrgResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<ValidationError> =
      MediaTypeCodecRegistry.of(billingUpdateBudgetOrgResponseCodecAlternative6Codec)

  private val billingUpdateBudgetOrgResponseCodecAlternative7Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("billing/update-budget-org.response.alternative7", BasicError.Serializer, SdkJson)

  internal val billingUpdateBudgetOrgResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(billingUpdateBudgetOrgResponseCodecAlternative7Codec)

  internal val billingUpdateBudgetOrgRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440> =
      MediaTypeCodecRegistry.of(billingUpdateBudgetOrgRequestCodec)

  internal val billingUpdateBudgetOrgResponseCodecRegistry: MediaTypeCodecRegistry<UpdateBudget> =
      MediaTypeCodecRegistry.of(billingUpdateBudgetOrgResponseCodec)
}

/**
 * Client for the 'billing' group of GitHub v3 REST API.
 */
public class BillingClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@BillingClient.authentication)

  /**
   * Creates a new budget for an organization. The authenticated user must be an
   * organization admin or billing manager.
   *
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingCreateOrganizationBudgetApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded BillingCreateOrganizationBudgetError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingCreateOrganizationBudget(
    request: InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155? = null,
    org: String,
    options: CallOptions = CallOptions(),
  ): CreateBudget = executor.executeWithTypedErrors<InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155?, BillingCreateOrganizationBudgetResponse, CreateBudget>(
    request = SdkExecutionRequest(billingCreateOrganizationBudgetMetadata, baseUri, request, listOf(BillingCodecs.BILLINGCREATEORGANIZATIONBUDGET_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = BillingCodecs.billingCreateOrganizationBudgetRequestCodecRegistry,
    responseDecoder = BillingCreateOrganizationBudgetResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingCreateOrganizationBudgetResponse.SuccessJson -> response.json
        is BillingCreateOrganizationBudgetResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingCreateOrganizationBudgetResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingCreateOrganizationBudgetResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingCreateOrganizationBudgetResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingCreateOrganizationBudgetResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingCreateOrganizationBudgetResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingCreateOrganizationBudgetResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingCreateOrganizationBudgetResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingCreateOrganizationBudgetResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingCreateOrganizationBudgetResponse.Http400Json -> BillingCreateOrganizationBudgetApiException(response, statusCode, headers)
        is BillingCreateOrganizationBudgetResponse.Http400ScimJson -> BillingCreateOrganizationBudgetApiException(response, statusCode, headers)
        is BillingCreateOrganizationBudgetResponse.Http401Json -> BillingCreateOrganizationBudgetApiException(response, statusCode, headers)
        is BillingCreateOrganizationBudgetResponse.Http403Json -> BillingCreateOrganizationBudgetApiException(response, statusCode, headers)
        is BillingCreateOrganizationBudgetResponse.Http404Json -> BillingCreateOrganizationBudgetApiException(response, statusCode, headers)
        is BillingCreateOrganizationBudgetResponse.Http422Json -> BillingCreateOrganizationBudgetApiException(response, statusCode, headers)
        is BillingCreateOrganizationBudgetResponse.Http500Json -> BillingCreateOrganizationBudgetApiException(response, statusCode, headers)
        is BillingCreateOrganizationBudgetResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a new budget for an organization. The authenticated user must be an
   * organization admin or billing manager.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun billingCreateOrganizationBudgetWithResponse(
    request: InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155? = null,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingCreateOrganizationBudgetResponse> = executor.executeWithResponse<InlineOrganizationsSettingsBillingBudgetsPostRequestJsonXd6761155?, BillingCreateOrganizationBudgetResponse>(SdkExecutionRequest(billingCreateOrganizationBudgetMetadata, baseUri, request, listOf(BillingCodecs.BILLINGCREATEORGANIZATIONBUDGET_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), BillingCodecs.billingCreateOrganizationBudgetRequestCodecRegistry, BillingCreateOrganizationBudgetResponseDecoder, options)

  /**
   * Deletes a budget by ID for an organization. The authenticated user must be an organization admin or billing
   * manager.
   *
   * @param budgetId The ID corresponding to the budget.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingDeleteBudgetOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded BillingDeleteBudgetOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingDeleteBudgetOrg(
    budgetId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): DeleteBudget = executor.executeWithTypedErrors<Unit, BillingDeleteBudgetOrgResponse, DeleteBudget>(
    request = SdkExecutionRequest(billingDeleteBudgetOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "budget_id", values = listOf(budgetId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = BillingCodecs.billingDeleteBudgetOrgRequestCodecRegistry,
    responseDecoder = BillingDeleteBudgetOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingDeleteBudgetOrgResponse.SuccessJson -> response.json
        is BillingDeleteBudgetOrgResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingDeleteBudgetOrgResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingDeleteBudgetOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingDeleteBudgetOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingDeleteBudgetOrgResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingDeleteBudgetOrgResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingDeleteBudgetOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingDeleteBudgetOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingDeleteBudgetOrgResponse.Http400Json -> BillingDeleteBudgetOrgApiException(response, statusCode, headers)
        is BillingDeleteBudgetOrgResponse.Http400ScimJson -> BillingDeleteBudgetOrgApiException(response, statusCode, headers)
        is BillingDeleteBudgetOrgResponse.Http403Json -> BillingDeleteBudgetOrgApiException(response, statusCode, headers)
        is BillingDeleteBudgetOrgResponse.Http404Json -> BillingDeleteBudgetOrgApiException(response, statusCode, headers)
        is BillingDeleteBudgetOrgResponse.Http500Json -> BillingDeleteBudgetOrgApiException(response, statusCode, headers)
        is BillingDeleteBudgetOrgResponse.Http503Json -> BillingDeleteBudgetOrgApiException(response, statusCode, headers)
        is BillingDeleteBudgetOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a budget by ID for an organization. The authenticated user must be an organization admin or billing
   * manager.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param budgetId The ID corresponding to the budget.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun billingDeleteBudgetOrgWithResponse(
    budgetId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingDeleteBudgetOrgResponse> = executor.executeWithResponse<Unit, BillingDeleteBudgetOrgResponse>(SdkExecutionRequest(billingDeleteBudgetOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "budget_id", values = listOf(budgetId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), BillingCodecs.billingDeleteBudgetOrgRequestCodecRegistry, BillingDeleteBudgetOrgResponseDecoder, options)

  /**
   * Gets all budgets for an organization. The authenticated user must be an organization admin or billing manager.
   * Each page returns up to 100 budgets.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of the results to fetch.
   * @param perPage The number of results per page (max 100).
   * @param scope Filter budgets by scope type.
   *
   * - `organization`: Budgets scoped to the organization.
   * - `repository`: Budgets scoped to a repository.
   * - `multi_user_customer`: Universal budgets that apply to all users in the organization.
   * - `user`: Budgets scoped to an individual user.
   * @param user Filter consumed amount details for budgets by the specified user login.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingGetAllBudgetsOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded BillingGetAllBudgetsOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingGetAllBudgetsOrg(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    scope: InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf? = null,
    user: String? = null,
    options: CallOptions = CallOptions(),
  ): GetAllBudgets = executor.executeWithTypedErrors<Unit, BillingGetAllBudgetsOrgResponse, GetAllBudgets>(
    request = SdkExecutionRequest(billingGetAllBudgetsOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope", values = scope?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "user", values = user?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BillingCodecs.billingGetAllBudgetsOrgRequestCodecRegistry,
    responseDecoder = BillingGetAllBudgetsOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingGetAllBudgetsOrgResponse.SuccessJson -> response.json
        is BillingGetAllBudgetsOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetAllBudgetsOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetAllBudgetsOrgResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetAllBudgetsOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingGetAllBudgetsOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingGetAllBudgetsOrgResponse.Http403Json -> BillingGetAllBudgetsOrgApiException(response, statusCode, headers)
        is BillingGetAllBudgetsOrgResponse.Http404Json -> BillingGetAllBudgetsOrgApiException(response, statusCode, headers)
        is BillingGetAllBudgetsOrgResponse.Http500Json -> BillingGetAllBudgetsOrgApiException(response, statusCode, headers)
        is BillingGetAllBudgetsOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets all budgets for an organization. The authenticated user must be an organization admin or billing manager.
   * Each page returns up to 100 budgets.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param page The page number of the results to fetch.
   * @param perPage The number of results per page (max 100).
   * @param scope Filter budgets by scope type.
   *
   * - `organization`: Budgets scoped to the organization.
   * - `repository`: Budgets scoped to a repository.
   * - `multi_user_customer`: Universal budgets that apply to all users in the organization.
   * - `user`: Budgets scoped to an individual user.
   * @param user Filter consumed amount details for budgets by the specified user login.
   * @param options Execution options.
   */
  public suspend fun billingGetAllBudgetsOrgWithResponse(
    org: String,
    page: Int? = null,
    perPage: Int? = null,
    scope: InlineOrganizationsSettingsBillingBudgetsGetParameterX9da430bf? = null,
    user: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingGetAllBudgetsOrgResponse> = executor.executeWithResponse<Unit, BillingGetAllBudgetsOrgResponse>(SdkExecutionRequest(billingGetAllBudgetsOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "scope", values = scope?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "user", values = user?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.billingGetAllBudgetsOrgRequestCodecRegistry, BillingGetAllBudgetsOrgResponseDecoder, options)

  /**
   * Gets a budget by ID. The authenticated user must be an organization admin or billing manager.
   *
   * @param budgetId The ID corresponding to the budget.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingGetBudgetOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded BillingGetBudgetOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingGetBudgetOrg(
    budgetId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): GetBudget = executor.executeWithTypedErrors<Unit, BillingGetBudgetOrgResponse, GetBudget>(
    request = SdkExecutionRequest(billingGetBudgetOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "budget_id", values = listOf(budgetId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = BillingCodecs.billingGetBudgetOrgRequestCodecRegistry,
    responseDecoder = BillingGetBudgetOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingGetBudgetOrgResponse.SuccessJson -> response.json
        is BillingGetBudgetOrgResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetBudgetOrgResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetBudgetOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetBudgetOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetBudgetOrgResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetBudgetOrgResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetBudgetOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingGetBudgetOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingGetBudgetOrgResponse.Http400Json -> BillingGetBudgetOrgApiException(response, statusCode, headers)
        is BillingGetBudgetOrgResponse.Http400ScimJson -> BillingGetBudgetOrgApiException(response, statusCode, headers)
        is BillingGetBudgetOrgResponse.Http403Json -> BillingGetBudgetOrgApiException(response, statusCode, headers)
        is BillingGetBudgetOrgResponse.Http404Json -> BillingGetBudgetOrgApiException(response, statusCode, headers)
        is BillingGetBudgetOrgResponse.Http500Json -> BillingGetBudgetOrgApiException(response, statusCode, headers)
        is BillingGetBudgetOrgResponse.Http503Json -> BillingGetBudgetOrgApiException(response, statusCode, headers)
        is BillingGetBudgetOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a budget by ID. The authenticated user must be an organization admin or billing manager.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param budgetId The ID corresponding to the budget.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun billingGetBudgetOrgWithResponse(
    budgetId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingGetBudgetOrgResponse> = executor.executeWithResponse<Unit, BillingGetBudgetOrgResponse>(SdkExecutionRequest(billingGetBudgetOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "budget_id", values = listOf(budgetId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), BillingCodecs.billingGetBudgetOrgRequestCodecRegistry, BillingGetBudgetOrgResponseDecoder, options)

  /**
   * Gets a report of AI credit usage for an organization. To use this endpoint, you must be an administrator of an
   * organization within an enterprise or an organization account.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param model The model name to query usage for. The name is not case sensitive.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param user The user name to query usage for. The name is not case sensitive.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingGetGithubBillingAiCreditUsageReportOrgApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded BillingGetGithubBillingAiCreditUsageReportOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingGetGithubBillingAiCreditUsageReportOrg(
    org: String,
    day: Int? = null,
    model: String? = null,
    month: Int? = null,
    product: String? = null,
    user: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): BillingAiCreditUsageReportOrg = executor.executeWithTypedErrors<Unit, BillingGetGithubBillingAiCreditUsageReportOrgResponse, BillingAiCreditUsageReportOrg>(
    request = SdkExecutionRequest(billingGetGithubBillingAiCreditUsageReportOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "user", values = user?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BillingCodecs.billingGetGithubBillingAiCreditUsageReportOrgRequestCodecRegistry,
    responseDecoder = BillingGetGithubBillingAiCreditUsageReportOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.SuccessJson -> response.json
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http400Json -> BillingGetGithubBillingAiCreditUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http400ScimJson -> BillingGetGithubBillingAiCreditUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http403Json -> BillingGetGithubBillingAiCreditUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http404Json -> BillingGetGithubBillingAiCreditUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http500Json -> BillingGetGithubBillingAiCreditUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http503Json -> BillingGetGithubBillingAiCreditUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a report of AI credit usage for an organization. To use this endpoint, you must be an administrator of an
   * organization within an enterprise or an organization account.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param model The model name to query usage for. The name is not case sensitive.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param user The user name to query usage for. The name is not case sensitive.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   */
  public suspend fun billingGetGithubBillingAiCreditUsageReportOrgWithResponse(
    org: String,
    day: Int? = null,
    model: String? = null,
    month: Int? = null,
    product: String? = null,
    user: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingGetGithubBillingAiCreditUsageReportOrgResponse> = executor.executeWithResponse<Unit, BillingGetGithubBillingAiCreditUsageReportOrgResponse>(SdkExecutionRequest(billingGetGithubBillingAiCreditUsageReportOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "user", values = user?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.billingGetGithubBillingAiCreditUsageReportOrgRequestCodecRegistry, BillingGetGithubBillingAiCreditUsageReportOrgResponseDecoder, options)

  /**
   * Gets a report of AI credit usage for a user.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * @param username The handle for the GitHub user account.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param model The model name to query usage for. The name is not case sensitive.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingGetGithubBillingAiCreditUsageReportUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded BillingGetGithubBillingAiCreditUsageReportUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingGetGithubBillingAiCreditUsageReportUser(
    username: String,
    day: Int? = null,
    model: String? = null,
    month: Int? = null,
    product: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): BillingAiCreditUsageReportUser = executor.executeWithTypedErrors<Unit, BillingGetGithubBillingAiCreditUsageReportUserResponse, BillingAiCreditUsageReportUser>(
    request = SdkExecutionRequest(billingGetGithubBillingAiCreditUsageReportUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BillingCodecs.billingGetGithubBillingAiCreditUsageReportUserRequestCodecRegistry,
    responseDecoder = BillingGetGithubBillingAiCreditUsageReportUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.SuccessJson -> response.json
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http400Json -> BillingGetGithubBillingAiCreditUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http400ScimJson -> BillingGetGithubBillingAiCreditUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http403Json -> BillingGetGithubBillingAiCreditUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http404Json -> BillingGetGithubBillingAiCreditUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http500Json -> BillingGetGithubBillingAiCreditUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Http503Json -> BillingGetGithubBillingAiCreditUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingAiCreditUsageReportUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a report of AI credit usage for a user.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param username The handle for the GitHub user account.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param model The model name to query usage for. The name is not case sensitive.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   */
  public suspend fun billingGetGithubBillingAiCreditUsageReportUserWithResponse(
    username: String,
    day: Int? = null,
    model: String? = null,
    month: Int? = null,
    product: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingGetGithubBillingAiCreditUsageReportUserResponse> = executor.executeWithResponse<Unit, BillingGetGithubBillingAiCreditUsageReportUserResponse>(SdkExecutionRequest(billingGetGithubBillingAiCreditUsageReportUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.billingGetGithubBillingAiCreditUsageReportUserRequestCodecRegistry, BillingGetGithubBillingAiCreditUsageReportUserResponseDecoder, options)

  /**
   * Gets a report of premium request usage for an organization. To use this endpoint, you must be an administrator of
   * an organization within an enterprise or an organization account.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param model The model name to query usage for. The name is not case sensitive.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param user The user name to query usage for. The name is not case sensitive.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingGetGithubBillingPremiumRequestUsageReportOrgApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * BillingGetGithubBillingPremiumRequestUsageReportOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingGetGithubBillingPremiumRequestUsageReportOrg(
    org: String,
    day: Int? = null,
    model: String? = null,
    month: Int? = null,
    product: String? = null,
    user: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): BillingPremiumRequestUsageReportOrg = executor.executeWithTypedErrors<Unit, BillingGetGithubBillingPremiumRequestUsageReportOrgResponse, BillingPremiumRequestUsageReportOrg>(
    request = SdkExecutionRequest(billingGetGithubBillingPremiumRequestUsageReportOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "user", values = user?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportOrgRequestCodecRegistry,
    responseDecoder = BillingGetGithubBillingPremiumRequestUsageReportOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.SuccessJson -> response.json
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http400Json -> BillingGetGithubBillingPremiumRequestUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http400ScimJson -> BillingGetGithubBillingPremiumRequestUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http403Json -> BillingGetGithubBillingPremiumRequestUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http404Json -> BillingGetGithubBillingPremiumRequestUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http500Json -> BillingGetGithubBillingPremiumRequestUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http503Json -> BillingGetGithubBillingPremiumRequestUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a report of premium request usage for an organization. To use this endpoint, you must be an administrator of
   * an organization within an enterprise or an organization account.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param model The model name to query usage for. The name is not case sensitive.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param user The user name to query usage for. The name is not case sensitive.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   */
  public suspend fun billingGetGithubBillingPremiumRequestUsageReportOrgWithResponse(
    org: String,
    day: Int? = null,
    model: String? = null,
    month: Int? = null,
    product: String? = null,
    user: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingGetGithubBillingPremiumRequestUsageReportOrgResponse> = executor.executeWithResponse<Unit, BillingGetGithubBillingPremiumRequestUsageReportOrgResponse>(SdkExecutionRequest(billingGetGithubBillingPremiumRequestUsageReportOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "user", values = user?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportOrgRequestCodecRegistry, BillingGetGithubBillingPremiumRequestUsageReportOrgResponseDecoder, options)

  /**
   * Gets a report of premium request usage for a user.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * @param username The handle for the GitHub user account.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param model The model name to query usage for. The name is not case sensitive.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingGetGithubBillingPremiumRequestUsageReportUserApiException When the service returns a declared
   * non-success response; its `error` property exposes the decoded
   * BillingGetGithubBillingPremiumRequestUsageReportUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingGetGithubBillingPremiumRequestUsageReportUser(
    username: String,
    day: Int? = null,
    model: String? = null,
    month: Int? = null,
    product: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): BillingPremiumRequestUsageReportUser = executor.executeWithTypedErrors<Unit, BillingGetGithubBillingPremiumRequestUsageReportUserResponse, BillingPremiumRequestUsageReportUser>(
    request = SdkExecutionRequest(billingGetGithubBillingPremiumRequestUsageReportUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportUserRequestCodecRegistry,
    responseDecoder = BillingGetGithubBillingPremiumRequestUsageReportUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.SuccessJson -> response.json
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http400Json -> BillingGetGithubBillingPremiumRequestUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http400ScimJson -> BillingGetGithubBillingPremiumRequestUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http403Json -> BillingGetGithubBillingPremiumRequestUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http404Json -> BillingGetGithubBillingPremiumRequestUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http500Json -> BillingGetGithubBillingPremiumRequestUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http503Json -> BillingGetGithubBillingPremiumRequestUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a report of premium request usage for a user.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param username The handle for the GitHub user account.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param model The model name to query usage for. The name is not case sensitive.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   */
  public suspend fun billingGetGithubBillingPremiumRequestUsageReportUserWithResponse(
    username: String,
    day: Int? = null,
    model: String? = null,
    month: Int? = null,
    product: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingGetGithubBillingPremiumRequestUsageReportUserResponse> = executor.executeWithResponse<Unit, BillingGetGithubBillingPremiumRequestUsageReportUserResponse>(SdkExecutionRequest(billingGetGithubBillingPremiumRequestUsageReportUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportUserRequestCodecRegistry, BillingGetGithubBillingPremiumRequestUsageReportUserResponseDecoder, options)

  /**
   * Gets a report of the total usage for an organization. To use this endpoint, you must be an administrator of an
   * organization within an enterprise or an organization account.
   *
   * **Note:** This endpoint is only available to organizations with access to the enhanced billing platform. For more
   * information, see "[About the enhanced billing
   * platform](https://docs.github.com/billing/using-the-new-billing-platform)."
   *
   * @param org The organization name. The name is not case sensitive.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. If no year is specified the default `year` is used.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingGetGithubBillingUsageReportOrgApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded BillingGetGithubBillingUsageReportOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingGetGithubBillingUsageReportOrg(
    org: String,
    day: Int? = null,
    month: Int? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): BillingUsageReport = executor.executeWithTypedErrors<Unit, BillingGetGithubBillingUsageReportOrgResponse, BillingUsageReport>(
    request = SdkExecutionRequest(billingGetGithubBillingUsageReportOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BillingCodecs.billingGetGithubBillingUsageReportOrgRequestCodecRegistry,
    responseDecoder = BillingGetGithubBillingUsageReportOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingGetGithubBillingUsageReportOrgResponse.SuccessJson -> response.json
        is BillingGetGithubBillingUsageReportOrgResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageReportOrgResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageReportOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageReportOrgResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageReportOrgResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageReportOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingGetGithubBillingUsageReportOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingGetGithubBillingUsageReportOrgResponse.Http400Json -> BillingGetGithubBillingUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageReportOrgResponse.Http400ScimJson -> BillingGetGithubBillingUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageReportOrgResponse.Http403Json -> BillingGetGithubBillingUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageReportOrgResponse.Http500Json -> BillingGetGithubBillingUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageReportOrgResponse.Http503Json -> BillingGetGithubBillingUsageReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageReportOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a report of the total usage for an organization. To use this endpoint, you must be an administrator of an
   * organization within an enterprise or an organization account.
   *
   * **Note:** This endpoint is only available to organizations with access to the enhanced billing platform. For more
   * information, see "[About the enhanced billing
   * platform](https://docs.github.com/billing/using-the-new-billing-platform)."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. If no year is specified the default `year` is used.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   */
  public suspend fun billingGetGithubBillingUsageReportOrgWithResponse(
    org: String,
    day: Int? = null,
    month: Int? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingGetGithubBillingUsageReportOrgResponse> = executor.executeWithResponse<Unit, BillingGetGithubBillingUsageReportOrgResponse>(SdkExecutionRequest(billingGetGithubBillingUsageReportOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.billingGetGithubBillingUsageReportOrgRequestCodecRegistry, BillingGetGithubBillingUsageReportOrgResponseDecoder, options)

  /**
   * Gets a report of the total usage for a user.
   *
   * **Note:** This endpoint is only available to users with access to the enhanced billing platform.
   *
   * @param username The handle for the GitHub user account.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. If no year is specified the default `year` is used.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingGetGithubBillingUsageReportUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded BillingGetGithubBillingUsageReportUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingGetGithubBillingUsageReportUser(
    username: String,
    day: Int? = null,
    month: Int? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): BillingUsageReportUser = executor.executeWithTypedErrors<Unit, BillingGetGithubBillingUsageReportUserResponse, BillingUsageReportUser>(
    request = SdkExecutionRequest(billingGetGithubBillingUsageReportUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BillingCodecs.billingGetGithubBillingUsageReportUserRequestCodecRegistry,
    responseDecoder = BillingGetGithubBillingUsageReportUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingGetGithubBillingUsageReportUserResponse.SuccessJson -> response.json
        is BillingGetGithubBillingUsageReportUserResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageReportUserResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageReportUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageReportUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageReportUserResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageReportUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingGetGithubBillingUsageReportUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingGetGithubBillingUsageReportUserResponse.Http400Json -> BillingGetGithubBillingUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageReportUserResponse.Http400ScimJson -> BillingGetGithubBillingUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageReportUserResponse.Http403Json -> BillingGetGithubBillingUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageReportUserResponse.Http500Json -> BillingGetGithubBillingUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageReportUserResponse.Http503Json -> BillingGetGithubBillingUsageReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageReportUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a report of the total usage for a user.
   *
   * **Note:** This endpoint is only available to users with access to the enhanced billing platform.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param username The handle for the GitHub user account.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. If no year is specified the default `year` is used.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   */
  public suspend fun billingGetGithubBillingUsageReportUserWithResponse(
    username: String,
    day: Int? = null,
    month: Int? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingGetGithubBillingUsageReportUserResponse> = executor.executeWithResponse<Unit, BillingGetGithubBillingUsageReportUserResponse>(SdkExecutionRequest(billingGetGithubBillingUsageReportUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.billingGetGithubBillingUsageReportUserRequestCodecRegistry, BillingGetGithubBillingUsageReportUserResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets a summary report of usage for an organization. To use this endpoint, you must be an administrator of an
   * organization within an enterprise or an organization account.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * @param org The organization name. The name is not case sensitive.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param repository The repository name to query for usage in the format owner/repository.
   * @param sku The SKU to query for usage.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingGetGithubBillingUsageSummaryReportOrgApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded BillingGetGithubBillingUsageSummaryReportOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingGetGithubBillingUsageSummaryReportOrg(
    org: String,
    day: Int? = null,
    month: Int? = null,
    product: String? = null,
    repository: String? = null,
    sku: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): BillingUsageSummaryReportOrg = executor.executeWithTypedErrors<Unit, BillingGetGithubBillingUsageSummaryReportOrgResponse, BillingUsageSummaryReportOrg>(
    request = SdkExecutionRequest(billingGetGithubBillingUsageSummaryReportOrgMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "repository", values = repository?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sku", values = sku?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BillingCodecs.billingGetGithubBillingUsageSummaryReportOrgRequestCodecRegistry,
    responseDecoder = BillingGetGithubBillingUsageSummaryReportOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.SuccessJson -> response.json
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Http400Json -> BillingGetGithubBillingUsageSummaryReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Http400ScimJson -> BillingGetGithubBillingUsageSummaryReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Http403Json -> BillingGetGithubBillingUsageSummaryReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Http500Json -> BillingGetGithubBillingUsageSummaryReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Http503Json -> BillingGetGithubBillingUsageSummaryReportOrgApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageSummaryReportOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets a summary report of usage for an organization. To use this endpoint, you must be an administrator of an
   * organization within an enterprise or an organization account.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param org The organization name. The name is not case sensitive.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param repository The repository name to query for usage in the format owner/repository.
   * @param sku The SKU to query for usage.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   */
  public suspend fun billingGetGithubBillingUsageSummaryReportOrgWithResponse(
    org: String,
    day: Int? = null,
    month: Int? = null,
    product: String? = null,
    repository: String? = null,
    sku: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingGetGithubBillingUsageSummaryReportOrgResponse> = executor.executeWithResponse<Unit, BillingGetGithubBillingUsageSummaryReportOrgResponse>(SdkExecutionRequest(billingGetGithubBillingUsageSummaryReportOrgMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "repository", values = repository?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sku", values = sku?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.billingGetGithubBillingUsageSummaryReportOrgRequestCodecRegistry, BillingGetGithubBillingUsageSummaryReportOrgResponseDecoder, options)

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets a summary report of usage for a user.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * @param username The handle for the GitHub user account.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param repository The repository name to query for usage in the format owner/repository.
   * @param sku The SKU to query for usage.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingGetGithubBillingUsageSummaryReportUserApiException When the service returns a declared non-success
   * response; its `error` property exposes the decoded BillingGetGithubBillingUsageSummaryReportUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingGetGithubBillingUsageSummaryReportUser(
    username: String,
    day: Int? = null,
    month: Int? = null,
    product: String? = null,
    repository: String? = null,
    sku: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): BillingUsageSummaryReportUser = executor.executeWithTypedErrors<Unit, BillingGetGithubBillingUsageSummaryReportUserResponse, BillingUsageSummaryReportUser>(
    request = SdkExecutionRequest(billingGetGithubBillingUsageSummaryReportUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "repository", values = repository?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sku", values = sku?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BillingCodecs.billingGetGithubBillingUsageSummaryReportUserRequestCodecRegistry,
    responseDecoder = BillingGetGithubBillingUsageSummaryReportUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingGetGithubBillingUsageSummaryReportUserResponse.SuccessJson -> response.json
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingGetGithubBillingUsageSummaryReportUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http400Json -> BillingGetGithubBillingUsageSummaryReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http400ScimJson -> BillingGetGithubBillingUsageSummaryReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http403Json -> BillingGetGithubBillingUsageSummaryReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http404Json -> BillingGetGithubBillingUsageSummaryReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http500Json -> BillingGetGithubBillingUsageSummaryReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Http503Json -> BillingGetGithubBillingUsageSummaryReportUserApiException(response, statusCode, headers)
        is BillingGetGithubBillingUsageSummaryReportUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > This endpoint is in public preview and is subject to change.
   *
   * Gets a summary report of usage for a user.
   *
   * **Note:** Only data from the past 24 months is accessible via this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param username The handle for the GitHub user account.
   * @param day If specified, only return results for a single day. The value of `day` is an integer between `1` and
   * `31`. If no `year` or `month` is specified, the default `year` and `month` are used.
   * @param month If specified, only return results for a single month. The value of `month` is an integer between `1`
   * and `12`. Default value is the current month. If no year is specified the default `year` is used.
   * @param product The product name to query usage for. The name is not case sensitive.
   * @param repository The repository name to query for usage in the format owner/repository.
   * @param sku The SKU to query for usage.
   * @param year If specified, only return results for a single year. The value of `year` is an integer with four digits
   * representing a year. For example, `2025`. Default value is the current year.
   * @param options Execution options.
   */
  public suspend fun billingGetGithubBillingUsageSummaryReportUserWithResponse(
    username: String,
    day: Int? = null,
    month: Int? = null,
    product: String? = null,
    repository: String? = null,
    sku: String? = null,
    year: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingGetGithubBillingUsageSummaryReportUserResponse> = executor.executeWithResponse<Unit, BillingGetGithubBillingUsageSummaryReportUserResponse>(SdkExecutionRequest(billingGetGithubBillingUsageSummaryReportUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "day", values = day?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "month", values = month?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "product", values = product?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "repository", values = repository?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sku", values = sku?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "year", values = year?.let { listOf(it.toString()) }.orEmpty()))
  }), BillingCodecs.billingGetGithubBillingUsageSummaryReportUserRequestCodecRegistry, BillingGetGithubBillingUsageSummaryReportUserResponseDecoder, options)

  /**
   * Updates an existing budget for an organization. The authenticated user must be an organization admin or billing
   * manager.
   *
   * @param request Request body sent to the operation.
   * @param budgetId The ID corresponding to the budget.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws BillingUpdateBudgetOrgApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded BillingUpdateBudgetOrgError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun billingUpdateBudgetOrg(
    request: InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440,
    budgetId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): UpdateBudget = executor.executeWithTypedErrors<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440, BillingUpdateBudgetOrgResponse, UpdateBudget>(
    request = SdkExecutionRequest(billingUpdateBudgetOrgMetadata, baseUri, request, listOf(BillingCodecs.BILLINGUPDATEBUDGETORG_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "budget_id", values = listOf(budgetId.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = BillingCodecs.billingUpdateBudgetOrgRequestCodecRegistry,
    responseDecoder = BillingUpdateBudgetOrgResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is BillingUpdateBudgetOrgResponse.SuccessJson -> response.json
        is BillingUpdateBudgetOrgResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingUpdateBudgetOrgResponse.Http400ScimJson -> error("Runtime selected a non-success response for success mapping.")
        is BillingUpdateBudgetOrgResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingUpdateBudgetOrgResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingUpdateBudgetOrgResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingUpdateBudgetOrgResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingUpdateBudgetOrgResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is BillingUpdateBudgetOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is BillingUpdateBudgetOrgResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is BillingUpdateBudgetOrgResponse.Http400Json -> BillingUpdateBudgetOrgApiException(response, statusCode, headers)
        is BillingUpdateBudgetOrgResponse.Http400ScimJson -> BillingUpdateBudgetOrgApiException(response, statusCode, headers)
        is BillingUpdateBudgetOrgResponse.Http401Json -> BillingUpdateBudgetOrgApiException(response, statusCode, headers)
        is BillingUpdateBudgetOrgResponse.Http403Json -> BillingUpdateBudgetOrgApiException(response, statusCode, headers)
        is BillingUpdateBudgetOrgResponse.Http404Json -> BillingUpdateBudgetOrgApiException(response, statusCode, headers)
        is BillingUpdateBudgetOrgResponse.Http422Json -> BillingUpdateBudgetOrgApiException(response, statusCode, headers)
        is BillingUpdateBudgetOrgResponse.Http500Json -> BillingUpdateBudgetOrgApiException(response, statusCode, headers)
        is BillingUpdateBudgetOrgResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates an existing budget for an organization. The authenticated user must be an organization admin or billing
   * manager.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param budgetId The ID corresponding to the budget.
   * @param org The organization name. The name is not case sensitive.
   * @param options Execution options.
   */
  public suspend fun billingUpdateBudgetOrgWithResponse(
    request: InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440,
    budgetId: String,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<BillingUpdateBudgetOrgResponse> = executor.executeWithResponse<InlineOrganizationsSettingsBillingBudgetsPatchRequestJsonX6e5e7440, BillingUpdateBudgetOrgResponse>(SdkExecutionRequest(billingUpdateBudgetOrgMetadata, baseUri, request, listOf(BillingCodecs.BILLINGUPDATEBUDGETORG_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "budget_id", values = listOf(budgetId.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), BillingCodecs.billingUpdateBudgetOrgRequestCodecRegistry, BillingUpdateBudgetOrgResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `billing/create-organization-budget` may expose through its typed
   * API exception.
   */
  public sealed interface BillingCreateOrganizationBudgetError

  /**
   * Typed response alternatives for `billing/create-organization-budget`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface BillingCreateOrganizationBudgetResponse {
    public class SuccessJson(
      public val json: CreateBudget,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingCreateOrganizationBudgetResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingCreateOrganizationBudgetResponse,
        BillingCreateOrganizationBudgetError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingCreateOrganizationBudgetResponse,
        BillingCreateOrganizationBudgetError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingCreateOrganizationBudgetResponse,
        BillingCreateOrganizationBudgetError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingCreateOrganizationBudgetResponse,
        BillingCreateOrganizationBudgetError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingCreateOrganizationBudgetResponse,
        BillingCreateOrganizationBudgetError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingCreateOrganizationBudgetResponse,
        BillingCreateOrganizationBudgetError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingCreateOrganizationBudgetResponse,
        BillingCreateOrganizationBudgetError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingCreateOrganizationBudgetResponse
  }

  /**
   * Raised by `billing/create-organization-budget` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class BillingCreateOrganizationBudgetApiException(
    public val error: BillingCreateOrganizationBudgetError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/create-organization-budget")

  private object BillingCreateOrganizationBudgetResponseDecoder : SdkResponseAlternativeDecoder<BillingCreateOrganizationBudgetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingCreateOrganizationBudgetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingCreateOrganizationBudgetResponse> = when {
      alternative.id == "billing/create-organization-budget.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingCreateOrganizationBudgetResponse.SuccessJson(
          json = BillingCodecs.billingCreateOrganizationBudgetResponseCodecAlternative0Registry.select(listOf("billing/create-organization-budget.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/create-organization-budget.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingCreateOrganizationBudgetResponse.Http400Json(
          json = BillingCodecs.billingCreateOrganizationBudgetResponseCodecAlternative1Registry.select(listOf("billing/create-organization-budget.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/create-organization-budget.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingCreateOrganizationBudgetResponse.Http400ScimJson(
          json = BillingCodecs.billingCreateOrganizationBudgetResponseCodecAlternative2Registry.select(listOf("billing/create-organization-budget.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/create-organization-budget.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingCreateOrganizationBudgetResponse.Http401Json(
          json = BillingCodecs.billingCreateOrganizationBudgetResponseCodecAlternative3Registry.select(listOf("billing/create-organization-budget.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/create-organization-budget.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingCreateOrganizationBudgetResponse.Http403Json(
          json = BillingCodecs.billingCreateOrganizationBudgetResponseCodecAlternative4Registry.select(listOf("billing/create-organization-budget.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/create-organization-budget.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingCreateOrganizationBudgetResponse.Http404Json(
          json = BillingCodecs.billingCreateOrganizationBudgetResponseCodecAlternative5Registry.select(listOf("billing/create-organization-budget.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/create-organization-budget.response.alternative6" -> SdkResponseDecodeResult(
        value = BillingCreateOrganizationBudgetResponse.Http422Json(
          json = BillingCodecs.billingCreateOrganizationBudgetResponseCodecAlternative6Registry.select(listOf("billing/create-organization-budget.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/create-organization-budget.response.alternative7" -> SdkResponseDecodeResult(
        value = BillingCreateOrganizationBudgetResponse.Http500Json(
          json = BillingCodecs.billingCreateOrganizationBudgetResponseCodecAlternative7Registry.select(listOf("billing/create-organization-budget.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingCreateOrganizationBudgetResponse = BillingCreateOrganizationBudgetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/delete-budget-org` may expose through its typed API
   * exception.
   */
  public sealed interface BillingDeleteBudgetOrgError

  /**
   * Typed response alternatives for `billing/delete-budget-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface BillingDeleteBudgetOrgResponse {
    public class SuccessJson(
      public val json: DeleteBudget,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingDeleteBudgetOrgResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingDeleteBudgetOrgResponse,
        BillingDeleteBudgetOrgError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingDeleteBudgetOrgResponse,
        BillingDeleteBudgetOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingDeleteBudgetOrgResponse,
        BillingDeleteBudgetOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingDeleteBudgetOrgResponse,
        BillingDeleteBudgetOrgError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingDeleteBudgetOrgResponse,
        BillingDeleteBudgetOrgError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingDeleteBudgetOrgResponse,
        BillingDeleteBudgetOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingDeleteBudgetOrgResponse
  }

  /**
   * Raised by `billing/delete-budget-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class BillingDeleteBudgetOrgApiException(
    public val error: BillingDeleteBudgetOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/delete-budget-org")

  private object BillingDeleteBudgetOrgResponseDecoder : SdkResponseAlternativeDecoder<BillingDeleteBudgetOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingDeleteBudgetOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingDeleteBudgetOrgResponse> = when {
      alternative.id == "billing/delete-budget-org.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingDeleteBudgetOrgResponse.SuccessJson(
          json = BillingCodecs.billingDeleteBudgetOrgResponseCodecAlternative0Registry.select(listOf("billing/delete-budget-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/delete-budget-org.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingDeleteBudgetOrgResponse.Http400Json(
          json = BillingCodecs.billingDeleteBudgetOrgResponseCodecAlternative1Registry.select(listOf("billing/delete-budget-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/delete-budget-org.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingDeleteBudgetOrgResponse.Http400ScimJson(
          json = BillingCodecs.billingDeleteBudgetOrgResponseCodecAlternative2Registry.select(listOf("billing/delete-budget-org.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/delete-budget-org.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingDeleteBudgetOrgResponse.Http403Json(
          json = BillingCodecs.billingDeleteBudgetOrgResponseCodecAlternative3Registry.select(listOf("billing/delete-budget-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/delete-budget-org.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingDeleteBudgetOrgResponse.Http404Json(
          json = BillingCodecs.billingDeleteBudgetOrgResponseCodecAlternative4Registry.select(listOf("billing/delete-budget-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/delete-budget-org.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingDeleteBudgetOrgResponse.Http500Json(
          json = BillingCodecs.billingDeleteBudgetOrgResponseCodecAlternative5Registry.select(listOf("billing/delete-budget-org.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/delete-budget-org.response.alternative6" -> SdkResponseDecodeResult(
        value = BillingDeleteBudgetOrgResponse.Http503Json(
          json = BillingCodecs.billingDeleteBudgetOrgResponseCodecAlternative6Registry.select(listOf("billing/delete-budget-org.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingDeleteBudgetOrgResponse = BillingDeleteBudgetOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/get-all-budgets-org` may expose through its typed API
   * exception.
   */
  public sealed interface BillingGetAllBudgetsOrgError

  /**
   * Typed response alternatives for `billing/get-all-budgets-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface BillingGetAllBudgetsOrgResponse {
    public class SuccessJson(
      public val json: GetAllBudgets,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetAllBudgetsOrgResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetAllBudgetsOrgResponse,
        BillingGetAllBudgetsOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetAllBudgetsOrgResponse,
        BillingGetAllBudgetsOrgError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetAllBudgetsOrgResponse,
        BillingGetAllBudgetsOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetAllBudgetsOrgResponse
  }

  /**
   * Raised by `billing/get-all-budgets-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class BillingGetAllBudgetsOrgApiException(
    public val error: BillingGetAllBudgetsOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/get-all-budgets-org")

  private object BillingGetAllBudgetsOrgResponseDecoder : SdkResponseAlternativeDecoder<BillingGetAllBudgetsOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingGetAllBudgetsOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingGetAllBudgetsOrgResponse> = when {
      alternative.id == "billing/get-all-budgets-org.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingGetAllBudgetsOrgResponse.SuccessJson(
          json = BillingCodecs.billingGetAllBudgetsOrgResponseCodecAlternative0Registry.select(listOf("billing/get-all-budgets-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-all-budgets-org.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingGetAllBudgetsOrgResponse.Http403Json(
          json = BillingCodecs.billingGetAllBudgetsOrgResponseCodecAlternative1Registry.select(listOf("billing/get-all-budgets-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-all-budgets-org.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingGetAllBudgetsOrgResponse.Http404Json(
          json = BillingCodecs.billingGetAllBudgetsOrgResponseCodecAlternative2Registry.select(listOf("billing/get-all-budgets-org.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-all-budgets-org.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingGetAllBudgetsOrgResponse.Http500Json(
          json = BillingCodecs.billingGetAllBudgetsOrgResponseCodecAlternative3Registry.select(listOf("billing/get-all-budgets-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingGetAllBudgetsOrgResponse = BillingGetAllBudgetsOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/get-budget-org` may expose through its typed API exception.
   */
  public sealed interface BillingGetBudgetOrgError

  /**
   * Typed response alternatives for `billing/get-budget-org`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface BillingGetBudgetOrgResponse {
    public class SuccessJson(
      public val json: GetBudget,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetBudgetOrgResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetBudgetOrgResponse,
        BillingGetBudgetOrgError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetBudgetOrgResponse,
        BillingGetBudgetOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetBudgetOrgResponse,
        BillingGetBudgetOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetBudgetOrgResponse,
        BillingGetBudgetOrgError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetBudgetOrgResponse,
        BillingGetBudgetOrgError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetBudgetOrgResponse,
        BillingGetBudgetOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetBudgetOrgResponse
  }

  /**
   * Raised by `billing/get-budget-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class BillingGetBudgetOrgApiException(
    public val error: BillingGetBudgetOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/get-budget-org")

  private object BillingGetBudgetOrgResponseDecoder : SdkResponseAlternativeDecoder<BillingGetBudgetOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingGetBudgetOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingGetBudgetOrgResponse> = when {
      alternative.id == "billing/get-budget-org.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingGetBudgetOrgResponse.SuccessJson(
          json = BillingCodecs.billingGetBudgetOrgResponseCodecAlternative0Registry.select(listOf("billing/get-budget-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-budget-org.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingGetBudgetOrgResponse.Http400Json(
          json = BillingCodecs.billingGetBudgetOrgResponseCodecAlternative1Registry.select(listOf("billing/get-budget-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-budget-org.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingGetBudgetOrgResponse.Http400ScimJson(
          json = BillingCodecs.billingGetBudgetOrgResponseCodecAlternative2Registry.select(listOf("billing/get-budget-org.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-budget-org.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingGetBudgetOrgResponse.Http403Json(
          json = BillingCodecs.billingGetBudgetOrgResponseCodecAlternative3Registry.select(listOf("billing/get-budget-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-budget-org.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingGetBudgetOrgResponse.Http404Json(
          json = BillingCodecs.billingGetBudgetOrgResponseCodecAlternative4Registry.select(listOf("billing/get-budget-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-budget-org.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingGetBudgetOrgResponse.Http500Json(
          json = BillingCodecs.billingGetBudgetOrgResponseCodecAlternative5Registry.select(listOf("billing/get-budget-org.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-budget-org.response.alternative6" -> SdkResponseDecodeResult(
        value = BillingGetBudgetOrgResponse.Http503Json(
          json = BillingCodecs.billingGetBudgetOrgResponseCodecAlternative6Registry.select(listOf("billing/get-budget-org.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingGetBudgetOrgResponse = BillingGetBudgetOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/get-github-billing-ai-credit-usage-report-org` may expose
   * through its typed API exception.
   */
  public sealed interface BillingGetGithubBillingAiCreditUsageReportOrgError

  /**
   * Typed response alternatives for `billing/get-github-billing-ai-credit-usage-report-org`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface BillingGetGithubBillingAiCreditUsageReportOrgResponse {
    public class SuccessJson(
      public val json: BillingAiCreditUsageReportOrg,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportOrgResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportOrgResponse,
        BillingGetGithubBillingAiCreditUsageReportOrgError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportOrgResponse,
        BillingGetGithubBillingAiCreditUsageReportOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportOrgResponse,
        BillingGetGithubBillingAiCreditUsageReportOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportOrgResponse,
        BillingGetGithubBillingAiCreditUsageReportOrgError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportOrgResponse,
        BillingGetGithubBillingAiCreditUsageReportOrgError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportOrgResponse,
        BillingGetGithubBillingAiCreditUsageReportOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportOrgResponse
  }

  /**
   * Raised by `billing/get-github-billing-ai-credit-usage-report-org` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class BillingGetGithubBillingAiCreditUsageReportOrgApiException(
    public val error: BillingGetGithubBillingAiCreditUsageReportOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/get-github-billing-ai-credit-usage-report-org")

  private object BillingGetGithubBillingAiCreditUsageReportOrgResponseDecoder : SdkResponseAlternativeDecoder<BillingGetGithubBillingAiCreditUsageReportOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingGetGithubBillingAiCreditUsageReportOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingGetGithubBillingAiCreditUsageReportOrgResponse> = when {
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-org.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportOrgResponse.SuccessJson(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative0Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-org.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http400Json(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative1Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-org.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http400ScimJson(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative2Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-org.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-org.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http403Json(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative3Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-org.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http404Json(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative4Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-org.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http500Json(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative5Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-org.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-org.response.alternative6" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportOrgResponse.Http503Json(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportOrgResponseCodecAlternative6Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-org.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingGetGithubBillingAiCreditUsageReportOrgResponse = BillingGetGithubBillingAiCreditUsageReportOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/get-github-billing-ai-credit-usage-report-user` may expose
   * through its typed API exception.
   */
  public sealed interface BillingGetGithubBillingAiCreditUsageReportUserError

  /**
   * Typed response alternatives for `billing/get-github-billing-ai-credit-usage-report-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface BillingGetGithubBillingAiCreditUsageReportUserResponse {
    public class SuccessJson(
      public val json: BillingAiCreditUsageReportUser,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportUserResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportUserResponse,
        BillingGetGithubBillingAiCreditUsageReportUserError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportUserResponse,
        BillingGetGithubBillingAiCreditUsageReportUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportUserResponse,
        BillingGetGithubBillingAiCreditUsageReportUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportUserResponse,
        BillingGetGithubBillingAiCreditUsageReportUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportUserResponse,
        BillingGetGithubBillingAiCreditUsageReportUserError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportUserResponse,
        BillingGetGithubBillingAiCreditUsageReportUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingAiCreditUsageReportUserResponse
  }

  /**
   * Raised by `billing/get-github-billing-ai-credit-usage-report-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class BillingGetGithubBillingAiCreditUsageReportUserApiException(
    public val error: BillingGetGithubBillingAiCreditUsageReportUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/get-github-billing-ai-credit-usage-report-user")

  private object BillingGetGithubBillingAiCreditUsageReportUserResponseDecoder : SdkResponseAlternativeDecoder<BillingGetGithubBillingAiCreditUsageReportUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingGetGithubBillingAiCreditUsageReportUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingGetGithubBillingAiCreditUsageReportUserResponse> = when {
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-user.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportUserResponse.SuccessJson(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative0Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-user.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportUserResponse.Http400Json(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative1Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-user.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportUserResponse.Http400ScimJson(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative2Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-user.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-user.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportUserResponse.Http403Json(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative3Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-user.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportUserResponse.Http404Json(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative4Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-user.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportUserResponse.Http500Json(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative5Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-ai-credit-usage-report-user.response.alternative6" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingAiCreditUsageReportUserResponse.Http503Json(
          json = BillingCodecs.billingGetGithubBillingAiCreditUsageReportUserResponseCodecAlternative6Registry.select(listOf("billing/get-github-billing-ai-credit-usage-report-user.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingGetGithubBillingAiCreditUsageReportUserResponse = BillingGetGithubBillingAiCreditUsageReportUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/get-github-billing-premium-request-usage-report-org` may
   * expose through its typed API exception.
   */
  public sealed interface BillingGetGithubBillingPremiumRequestUsageReportOrgError

  /**
   * Typed response alternatives for `billing/get-github-billing-premium-request-usage-report-org`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface BillingGetGithubBillingPremiumRequestUsageReportOrgResponse {
    public class SuccessJson(
      public val json: BillingPremiumRequestUsageReportOrg,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportOrgResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportOrgResponse,
        BillingGetGithubBillingPremiumRequestUsageReportOrgError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportOrgResponse,
        BillingGetGithubBillingPremiumRequestUsageReportOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportOrgResponse,
        BillingGetGithubBillingPremiumRequestUsageReportOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportOrgResponse,
        BillingGetGithubBillingPremiumRequestUsageReportOrgError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportOrgResponse,
        BillingGetGithubBillingPremiumRequestUsageReportOrgError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportOrgResponse,
        BillingGetGithubBillingPremiumRequestUsageReportOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportOrgResponse
  }

  /**
   * Raised by `billing/get-github-billing-premium-request-usage-report-org` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class BillingGetGithubBillingPremiumRequestUsageReportOrgApiException(
    public val error: BillingGetGithubBillingPremiumRequestUsageReportOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/get-github-billing-premium-request-usage-report-org")

  private object BillingGetGithubBillingPremiumRequestUsageReportOrgResponseDecoder : SdkResponseAlternativeDecoder<BillingGetGithubBillingPremiumRequestUsageReportOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingGetGithubBillingPremiumRequestUsageReportOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingGetGithubBillingPremiumRequestUsageReportOrgResponse> = when {
      alternative.id == "billing/get-github-billing-premium-request-usage-report-org.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.SuccessJson(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative0Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-org.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http400Json(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative1Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-org.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http400ScimJson(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative2Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-org.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-org.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http403Json(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative3Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-org.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http404Json(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative4Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-org.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http500Json(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative5Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-org.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-org.response.alternative6" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Http503Json(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportOrgResponseCodecAlternative6Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-org.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingGetGithubBillingPremiumRequestUsageReportOrgResponse = BillingGetGithubBillingPremiumRequestUsageReportOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/get-github-billing-premium-request-usage-report-user` may
   * expose through its typed API exception.
   */
  public sealed interface BillingGetGithubBillingPremiumRequestUsageReportUserError

  /**
   * Typed response alternatives for `billing/get-github-billing-premium-request-usage-report-user`. Non-success
   * alternatives are not converted into success values.
   */
  public sealed interface BillingGetGithubBillingPremiumRequestUsageReportUserResponse {
    public class SuccessJson(
      public val json: BillingPremiumRequestUsageReportUser,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportUserResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportUserResponse,
        BillingGetGithubBillingPremiumRequestUsageReportUserError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportUserResponse,
        BillingGetGithubBillingPremiumRequestUsageReportUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportUserResponse,
        BillingGetGithubBillingPremiumRequestUsageReportUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportUserResponse,
        BillingGetGithubBillingPremiumRequestUsageReportUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportUserResponse,
        BillingGetGithubBillingPremiumRequestUsageReportUserError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportUserResponse,
        BillingGetGithubBillingPremiumRequestUsageReportUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingPremiumRequestUsageReportUserResponse
  }

  /**
   * Raised by `billing/get-github-billing-premium-request-usage-report-user` after decoding a declared non-success
   * response. [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class BillingGetGithubBillingPremiumRequestUsageReportUserApiException(
    public val error: BillingGetGithubBillingPremiumRequestUsageReportUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/get-github-billing-premium-request-usage-report-user")

  private object BillingGetGithubBillingPremiumRequestUsageReportUserResponseDecoder : SdkResponseAlternativeDecoder<BillingGetGithubBillingPremiumRequestUsageReportUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingGetGithubBillingPremiumRequestUsageReportUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingGetGithubBillingPremiumRequestUsageReportUserResponse> = when {
      alternative.id == "billing/get-github-billing-premium-request-usage-report-user.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportUserResponse.SuccessJson(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative0Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-user.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http400Json(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative1Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-user.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http400ScimJson(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative2Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-user.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-user.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http403Json(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative3Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-user.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http404Json(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative4Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-user.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http500Json(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative5Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-premium-request-usage-report-user.response.alternative6" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Http503Json(
          json = BillingCodecs.billingGetGithubBillingPremiumRequestUsageReportUserResponseCodecAlternative6Registry.select(listOf("billing/get-github-billing-premium-request-usage-report-user.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingGetGithubBillingPremiumRequestUsageReportUserResponse = BillingGetGithubBillingPremiumRequestUsageReportUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/get-github-billing-usage-report-org` may expose through its
   * typed API exception.
   */
  public sealed interface BillingGetGithubBillingUsageReportOrgError

  /**
   * Typed response alternatives for `billing/get-github-billing-usage-report-org`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface BillingGetGithubBillingUsageReportOrgResponse {
    public class SuccessJson(
      public val json: BillingUsageReport,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportOrgResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportOrgResponse,
        BillingGetGithubBillingUsageReportOrgError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportOrgResponse,
        BillingGetGithubBillingUsageReportOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportOrgResponse,
        BillingGetGithubBillingUsageReportOrgError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportOrgResponse,
        BillingGetGithubBillingUsageReportOrgError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportOrgResponse,
        BillingGetGithubBillingUsageReportOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportOrgResponse
  }

  /**
   * Raised by `billing/get-github-billing-usage-report-org` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class BillingGetGithubBillingUsageReportOrgApiException(
    public val error: BillingGetGithubBillingUsageReportOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/get-github-billing-usage-report-org")

  private object BillingGetGithubBillingUsageReportOrgResponseDecoder : SdkResponseAlternativeDecoder<BillingGetGithubBillingUsageReportOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingGetGithubBillingUsageReportOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingGetGithubBillingUsageReportOrgResponse> = when {
      alternative.id == "billing/get-github-billing-usage-report-org.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportOrgResponse.SuccessJson(
          json = BillingCodecs.billingGetGithubBillingUsageReportOrgResponseCodecAlternative0Registry.select(listOf("billing/get-github-billing-usage-report-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-report-org.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportOrgResponse.Http400Json(
          json = BillingCodecs.billingGetGithubBillingUsageReportOrgResponseCodecAlternative1Registry.select(listOf("billing/get-github-billing-usage-report-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-report-org.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportOrgResponse.Http400ScimJson(
          json = BillingCodecs.billingGetGithubBillingUsageReportOrgResponseCodecAlternative2Registry.select(listOf("billing/get-github-billing-usage-report-org.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-report-org.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportOrgResponse.Http403Json(
          json = BillingCodecs.billingGetGithubBillingUsageReportOrgResponseCodecAlternative3Registry.select(listOf("billing/get-github-billing-usage-report-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-report-org.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportOrgResponse.Http500Json(
          json = BillingCodecs.billingGetGithubBillingUsageReportOrgResponseCodecAlternative4Registry.select(listOf("billing/get-github-billing-usage-report-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-report-org.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportOrgResponse.Http503Json(
          json = BillingCodecs.billingGetGithubBillingUsageReportOrgResponseCodecAlternative5Registry.select(listOf("billing/get-github-billing-usage-report-org.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingGetGithubBillingUsageReportOrgResponse = BillingGetGithubBillingUsageReportOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/get-github-billing-usage-report-user` may expose through
   * its typed API exception.
   */
  public sealed interface BillingGetGithubBillingUsageReportUserError

  /**
   * Typed response alternatives for `billing/get-github-billing-usage-report-user`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface BillingGetGithubBillingUsageReportUserResponse {
    public class SuccessJson(
      public val json: BillingUsageReportUser,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportUserResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportUserResponse,
        BillingGetGithubBillingUsageReportUserError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportUserResponse,
        BillingGetGithubBillingUsageReportUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportUserResponse,
        BillingGetGithubBillingUsageReportUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportUserResponse,
        BillingGetGithubBillingUsageReportUserError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportUserResponse,
        BillingGetGithubBillingUsageReportUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageReportUserResponse
  }

  /**
   * Raised by `billing/get-github-billing-usage-report-user` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class BillingGetGithubBillingUsageReportUserApiException(
    public val error: BillingGetGithubBillingUsageReportUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/get-github-billing-usage-report-user")

  private object BillingGetGithubBillingUsageReportUserResponseDecoder : SdkResponseAlternativeDecoder<BillingGetGithubBillingUsageReportUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingGetGithubBillingUsageReportUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingGetGithubBillingUsageReportUserResponse> = when {
      alternative.id == "billing/get-github-billing-usage-report-user.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportUserResponse.SuccessJson(
          json = BillingCodecs.billingGetGithubBillingUsageReportUserResponseCodecAlternative0Registry.select(listOf("billing/get-github-billing-usage-report-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-report-user.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportUserResponse.Http400Json(
          json = BillingCodecs.billingGetGithubBillingUsageReportUserResponseCodecAlternative1Registry.select(listOf("billing/get-github-billing-usage-report-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-report-user.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportUserResponse.Http400ScimJson(
          json = BillingCodecs.billingGetGithubBillingUsageReportUserResponseCodecAlternative2Registry.select(listOf("billing/get-github-billing-usage-report-user.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-report-user.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportUserResponse.Http403Json(
          json = BillingCodecs.billingGetGithubBillingUsageReportUserResponseCodecAlternative3Registry.select(listOf("billing/get-github-billing-usage-report-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-report-user.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportUserResponse.Http500Json(
          json = BillingCodecs.billingGetGithubBillingUsageReportUserResponseCodecAlternative4Registry.select(listOf("billing/get-github-billing-usage-report-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-report-user.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageReportUserResponse.Http503Json(
          json = BillingCodecs.billingGetGithubBillingUsageReportUserResponseCodecAlternative5Registry.select(listOf("billing/get-github-billing-usage-report-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingGetGithubBillingUsageReportUserResponse = BillingGetGithubBillingUsageReportUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/get-github-billing-usage-summary-report-org` may expose
   * through its typed API exception.
   */
  public sealed interface BillingGetGithubBillingUsageSummaryReportOrgError

  /**
   * Typed response alternatives for `billing/get-github-billing-usage-summary-report-org`. Non-success alternatives are
   * not converted into success values.
   */
  public sealed interface BillingGetGithubBillingUsageSummaryReportOrgResponse {
    public class SuccessJson(
      public val json: BillingUsageSummaryReportOrg,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportOrgResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportOrgResponse,
        BillingGetGithubBillingUsageSummaryReportOrgError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportOrgResponse,
        BillingGetGithubBillingUsageSummaryReportOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportOrgResponse,
        BillingGetGithubBillingUsageSummaryReportOrgError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportOrgResponse,
        BillingGetGithubBillingUsageSummaryReportOrgError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportOrgResponse,
        BillingGetGithubBillingUsageSummaryReportOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportOrgResponse
  }

  /**
   * Raised by `billing/get-github-billing-usage-summary-report-org` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class BillingGetGithubBillingUsageSummaryReportOrgApiException(
    public val error: BillingGetGithubBillingUsageSummaryReportOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/get-github-billing-usage-summary-report-org")

  private object BillingGetGithubBillingUsageSummaryReportOrgResponseDecoder : SdkResponseAlternativeDecoder<BillingGetGithubBillingUsageSummaryReportOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingGetGithubBillingUsageSummaryReportOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingGetGithubBillingUsageSummaryReportOrgResponse> = when {
      alternative.id == "billing/get-github-billing-usage-summary-report-org.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportOrgResponse.SuccessJson(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative0Registry.select(listOf("billing/get-github-billing-usage-summary-report-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-summary-report-org.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportOrgResponse.Http400Json(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative1Registry.select(listOf("billing/get-github-billing-usage-summary-report-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-summary-report-org.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportOrgResponse.Http400ScimJson(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative2Registry.select(listOf("billing/get-github-billing-usage-summary-report-org.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-summary-report-org.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportOrgResponse.Http403Json(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative3Registry.select(listOf("billing/get-github-billing-usage-summary-report-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-summary-report-org.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportOrgResponse.Http500Json(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative4Registry.select(listOf("billing/get-github-billing-usage-summary-report-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-summary-report-org.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportOrgResponse.Http503Json(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportOrgResponseCodecAlternative5Registry.select(listOf("billing/get-github-billing-usage-summary-report-org.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingGetGithubBillingUsageSummaryReportOrgResponse = BillingGetGithubBillingUsageSummaryReportOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/get-github-billing-usage-summary-report-user` may expose
   * through its typed API exception.
   */
  public sealed interface BillingGetGithubBillingUsageSummaryReportUserError

  /**
   * Typed response alternatives for `billing/get-github-billing-usage-summary-report-user`. Non-success alternatives
   * are not converted into success values.
   */
  public sealed interface BillingGetGithubBillingUsageSummaryReportUserResponse {
    public class SuccessJson(
      public val json: BillingUsageSummaryReportUser,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportUserResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportUserResponse,
        BillingGetGithubBillingUsageSummaryReportUserError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportUserResponse,
        BillingGetGithubBillingUsageSummaryReportUserError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportUserResponse,
        BillingGetGithubBillingUsageSummaryReportUserError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportUserResponse,
        BillingGetGithubBillingUsageSummaryReportUserError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportUserResponse,
        BillingGetGithubBillingUsageSummaryReportUserError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportUserResponse,
        BillingGetGithubBillingUsageSummaryReportUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingGetGithubBillingUsageSummaryReportUserResponse
  }

  /**
   * Raised by `billing/get-github-billing-usage-summary-report-user` after decoding a declared non-success response.
   * [error] is typed and is not included in the exception message or diagnostic rendering.
   */
  public class BillingGetGithubBillingUsageSummaryReportUserApiException(
    public val error: BillingGetGithubBillingUsageSummaryReportUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/get-github-billing-usage-summary-report-user")

  private object BillingGetGithubBillingUsageSummaryReportUserResponseDecoder : SdkResponseAlternativeDecoder<BillingGetGithubBillingUsageSummaryReportUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingGetGithubBillingUsageSummaryReportUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingGetGithubBillingUsageSummaryReportUserResponse> = when {
      alternative.id == "billing/get-github-billing-usage-summary-report-user.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportUserResponse.SuccessJson(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative0Registry.select(listOf("billing/get-github-billing-usage-summary-report-user.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-summary-report-user.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportUserResponse.Http400Json(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative1Registry.select(listOf("billing/get-github-billing-usage-summary-report-user.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-summary-report-user.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportUserResponse.Http400ScimJson(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative2Registry.select(listOf("billing/get-github-billing-usage-summary-report-user.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-summary-report-user.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportUserResponse.Http403Json(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative3Registry.select(listOf("billing/get-github-billing-usage-summary-report-user.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-summary-report-user.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportUserResponse.Http404Json(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative4Registry.select(listOf("billing/get-github-billing-usage-summary-report-user.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-summary-report-user.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportUserResponse.Http500Json(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative5Registry.select(listOf("billing/get-github-billing-usage-summary-report-user.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/get-github-billing-usage-summary-report-user.response.alternative6" -> SdkResponseDecodeResult(
        value = BillingGetGithubBillingUsageSummaryReportUserResponse.Http503Json(
          json = BillingCodecs.billingGetGithubBillingUsageSummaryReportUserResponseCodecAlternative6Registry.select(listOf("billing/get-github-billing-usage-summary-report-user.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingGetGithubBillingUsageSummaryReportUserResponse = BillingGetGithubBillingUsageSummaryReportUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `billing/update-budget-org` may expose through its typed API
   * exception.
   */
  public sealed interface BillingUpdateBudgetOrgError

  /**
   * Typed response alternatives for `billing/update-budget-org`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface BillingUpdateBudgetOrgResponse {
    public class SuccessJson(
      public val json: UpdateBudget,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingUpdateBudgetOrgResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingUpdateBudgetOrgResponse,
        BillingUpdateBudgetOrgError

    public class Http400ScimJson(
      public val json: ScimError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingUpdateBudgetOrgResponse,
        BillingUpdateBudgetOrgError

    public class Http401Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingUpdateBudgetOrgResponse,
        BillingUpdateBudgetOrgError

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingUpdateBudgetOrgResponse,
        BillingUpdateBudgetOrgError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingUpdateBudgetOrgResponse,
        BillingUpdateBudgetOrgError

    public class Http422Json(
      public val json: ValidationError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingUpdateBudgetOrgResponse,
        BillingUpdateBudgetOrgError

    public class Http500Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingUpdateBudgetOrgResponse,
        BillingUpdateBudgetOrgError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BillingUpdateBudgetOrgResponse
  }

  /**
   * Raised by `billing/update-budget-org` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class BillingUpdateBudgetOrgApiException(
    public val error: BillingUpdateBudgetOrgError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "billing/update-budget-org")

  private object BillingUpdateBudgetOrgResponseDecoder : SdkResponseAlternativeDecoder<BillingUpdateBudgetOrgResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BillingUpdateBudgetOrgResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BillingUpdateBudgetOrgResponse> = when {
      alternative.id == "billing/update-budget-org.response.alternative0" -> SdkResponseDecodeResult(
        value = BillingUpdateBudgetOrgResponse.SuccessJson(
          json = BillingCodecs.billingUpdateBudgetOrgResponseCodecAlternative0Registry.select(listOf("billing/update-budget-org.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/update-budget-org.response.alternative1" -> SdkResponseDecodeResult(
        value = BillingUpdateBudgetOrgResponse.Http400Json(
          json = BillingCodecs.billingUpdateBudgetOrgResponseCodecAlternative1Registry.select(listOf("billing/update-budget-org.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/update-budget-org.response.alternative2" -> SdkResponseDecodeResult(
        value = BillingUpdateBudgetOrgResponse.Http400ScimJson(
          json = BillingCodecs.billingUpdateBudgetOrgResponseCodecAlternative2Registry.select(listOf("billing/update-budget-org.response.alternative2"), mediaType ?: "application/scim+json").decode(body, mediaType ?: "application/scim+json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/update-budget-org.response.alternative3" -> SdkResponseDecodeResult(
        value = BillingUpdateBudgetOrgResponse.Http401Json(
          json = BillingCodecs.billingUpdateBudgetOrgResponseCodecAlternative3Registry.select(listOf("billing/update-budget-org.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/update-budget-org.response.alternative4" -> SdkResponseDecodeResult(
        value = BillingUpdateBudgetOrgResponse.Http403Json(
          json = BillingCodecs.billingUpdateBudgetOrgResponseCodecAlternative4Registry.select(listOf("billing/update-budget-org.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/update-budget-org.response.alternative5" -> SdkResponseDecodeResult(
        value = BillingUpdateBudgetOrgResponse.Http404Json(
          json = BillingCodecs.billingUpdateBudgetOrgResponseCodecAlternative5Registry.select(listOf("billing/update-budget-org.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/update-budget-org.response.alternative6" -> SdkResponseDecodeResult(
        value = BillingUpdateBudgetOrgResponse.Http422Json(
          json = BillingCodecs.billingUpdateBudgetOrgResponseCodecAlternative6Registry.select(listOf("billing/update-budget-org.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "billing/update-budget-org.response.alternative7" -> SdkResponseDecodeResult(
        value = BillingUpdateBudgetOrgResponse.Http500Json(
          json = BillingCodecs.billingUpdateBudgetOrgResponseCodecAlternative7Registry.select(listOf("billing/update-budget-org.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): BillingUpdateBudgetOrgResponse = BillingUpdateBudgetOrgResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val billingCreateOrganizationBudgetMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/create-organization-budget",
          method = "POST",
          path = "/organizations/{org}/settings/billing/budgets",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CreateBudget",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/create-organization-budget.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/create-organization-budget.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/create-organization-budget.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/create-organization-budget.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/create-organization-budget.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/create-organization-budget.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/create-organization-budget.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/create-organization-budget.response.alternative7",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingDeleteBudgetOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/delete-budget-org",
          method = "DELETE",
          path = "/organizations/{org}/settings/billing/budgets/{budget_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeleteBudget",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/delete-budget-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/delete-budget-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/delete-budget-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/delete-budget-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/delete-budget-org.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/delete-budget-org.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/delete-budget-org.response.alternative6",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingGetAllBudgetsOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/get-all-budgets-org",
          method = "GET",
          path = "/organizations/{org}/settings/billing/budgets",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GetAllBudgets",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-all-budgets-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-all-budgets-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-all-budgets-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-all-budgets-org.response.alternative3",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingGetBudgetOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/get-budget-org",
          method = "GET",
          path = "/organizations/{org}/settings/billing/budgets/{budget_id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GetBudget",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-budget-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-budget-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-budget-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-budget-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-budget-org.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-budget-org.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-budget-org.response.alternative6",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingGetGithubBillingAiCreditUsageReportOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/get-github-billing-ai-credit-usage-report-org",
          method = "GET",
          path = "/organizations/{org}/settings/billing/ai_credit/usage",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingAiCreditUsageReportOrg",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-org.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-org.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-org.response.alternative6",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingGetGithubBillingAiCreditUsageReportUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/get-github-billing-ai-credit-usage-report-user",
          method = "GET",
          path = "/users/{username}/settings/billing/ai_credit/usage",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingAiCreditUsageReportUser",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-user.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-ai-credit-usage-report-user.response.alternative6",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingGetGithubBillingPremiumRequestUsageReportOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/get-github-billing-premium-request-usage-report-org",
          method = "GET",
          path = "/organizations/{org}/settings/billing/premium_request/usage",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingPremiumRequestUsageReportOrg",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-org.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-org.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-org.response.alternative6",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingGetGithubBillingPremiumRequestUsageReportUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/get-github-billing-premium-request-usage-report-user",
          method = "GET",
          path = "/users/{username}/settings/billing/premium_request/usage",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingPremiumRequestUsageReportUser",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-user.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-premium-request-usage-report-user.response.alternative6",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingGetGithubBillingUsageReportOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/get-github-billing-usage-report-org",
          method = "GET",
          path = "/organizations/{org}/settings/billing/usage",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingUsageReport",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-org.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-org.response.alternative5",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingGetGithubBillingUsageReportUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/get-github-billing-usage-report-user",
          method = "GET",
          path = "/users/{username}/settings/billing/usage",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingUsageReportUser",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-report-user.response.alternative5",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingGetGithubBillingUsageSummaryReportOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/get-github-billing-usage-summary-report-org",
          method = "GET",
          path = "/organizations/{org}/settings/billing/usage/summary",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingUsageSummaryReportOrg",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-org.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-org.response.alternative5",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingGetGithubBillingUsageSummaryReportUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/get-github-billing-usage-summary-report-user",
          method = "GET",
          path = "/users/{username}/settings/billing/usage/summary",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "BillingUsageSummaryReportUser",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-user.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-user.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-user.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-user.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-user.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-user.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/get-github-billing-usage-summary-report-user.response.alternative6",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = true, idempotent = true),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = true,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val billingUpdateBudgetOrgMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "billing/update-budget-org",
          method = "PATCH",
          path = "/organizations/{org}/settings/billing/budgets/{budget_id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "UpdateBudget",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/update-budget-org.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/update-budget-org.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/scim+json"),
              typeTag = "ScimError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/update-budget-org.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/update-budget-org.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/update-budget-org.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/update-budget-org.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "ValidationError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/update-budget-org.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "billing/update-budget-org.response.alternative7",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = 1,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
