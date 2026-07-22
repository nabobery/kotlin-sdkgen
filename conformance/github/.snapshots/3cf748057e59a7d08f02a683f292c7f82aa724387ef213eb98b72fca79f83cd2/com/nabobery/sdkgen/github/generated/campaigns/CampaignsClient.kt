package com.nabobery.sdkgen.github.generated.campaigns

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.CampaignState
import com.nabobery.sdkgen.github.generated.CampaignSummary
import com.nabobery.sdkgen.github.generated.InlineDirectionParameterX3053723f
import com.nabobery.sdkgen.github.generated.InlineOrgsCampaignsGetParameterXff018eaf
import com.nabobery.sdkgen.github.generated.InlineOrgsCampaignsPatchRequestJsonXfff35dd6
import com.nabobery.sdkgen.github.generated.InlineServiceUnavailableResponseJsonX4cf316d5
import com.nabobery.sdkgen.github.generated.SdkJson
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer

public object CampaignsCodecs {
  private val campaignsDeleteCampaignResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("campaigns/delete-campaign.response.alternative1", BasicError.Serializer, SdkJson)

  public val campaignsDeleteCampaignResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(campaignsDeleteCampaignResponseCodecAlternative1Codec)

  private val campaignsDeleteCampaignResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("campaigns/delete-campaign.response.alternative2", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val campaignsDeleteCampaignResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(campaignsDeleteCampaignResponseCodecAlternative2Codec)

  public val campaignsDeleteCampaignRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val campaignsDeleteCampaignResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val CAMPAIGNSGETCAMPAIGNSUMMARY_RESPONSE_CODEC_ID: String =
      "campaigns/get-campaign-summary.response"

  private val campaignsGetCampaignSummaryResponseCodec: MediaTypeCodec<CampaignSummary> =
      KotlinxSerializationCodec(CAMPAIGNSGETCAMPAIGNSUMMARY_RESPONSE_CODEC_ID, CampaignSummary.Serializer, SdkJson)

  private val campaignsGetCampaignSummaryResponseCodecAlternative0Codec:
      MediaTypeCodec<CampaignSummary> =
      KotlinxSerializationCodec("campaigns/get-campaign-summary.response.alternative0", CampaignSummary.Serializer, SdkJson)

  public val campaignsGetCampaignSummaryResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CampaignSummary> =
      MediaTypeCodecRegistry.of(campaignsGetCampaignSummaryResponseCodecAlternative0Codec)

  private val campaignsGetCampaignSummaryResponseCodecAlternative1Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("campaigns/get-campaign-summary.response.alternative1", BasicError.Serializer, SdkJson)

  public val campaignsGetCampaignSummaryResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(campaignsGetCampaignSummaryResponseCodecAlternative1Codec)

  private val campaignsGetCampaignSummaryResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("campaigns/get-campaign-summary.response.alternative2", BasicError.Serializer, SdkJson)

  public val campaignsGetCampaignSummaryResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(campaignsGetCampaignSummaryResponseCodecAlternative2Codec)

  private val campaignsGetCampaignSummaryResponseCodecAlternative3Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("campaigns/get-campaign-summary.response.alternative3", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val campaignsGetCampaignSummaryResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(campaignsGetCampaignSummaryResponseCodecAlternative3Codec)

  public val campaignsGetCampaignSummaryRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val campaignsGetCampaignSummaryResponseCodecRegistry:
      MediaTypeCodecRegistry<CampaignSummary> =
      MediaTypeCodecRegistry.of(campaignsGetCampaignSummaryResponseCodec)

  public const val CAMPAIGNSLISTORGCAMPAIGNS_RESPONSE_CODEC_ID: String =
      "campaigns/list-org-campaigns.response"

  private val campaignsListOrgCampaignsResponseCodec: MediaTypeCodec<List<CampaignSummary>> =
      KotlinxSerializationCodec(CAMPAIGNSLISTORGCAMPAIGNS_RESPONSE_CODEC_ID, ListSerializer(CampaignSummary.Serializer), SdkJson)

  private val campaignsListOrgCampaignsResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CampaignSummary>> =
      KotlinxSerializationCodec("campaigns/list-org-campaigns.response.alternative0", ListSerializer(CampaignSummary.Serializer), SdkJson)

  public val campaignsListOrgCampaignsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CampaignSummary>> =
      MediaTypeCodecRegistry.of(campaignsListOrgCampaignsResponseCodecAlternative0Codec)

  private val campaignsListOrgCampaignsResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("campaigns/list-org-campaigns.response.alternative1", BasicError.Serializer, SdkJson)

  public val campaignsListOrgCampaignsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(campaignsListOrgCampaignsResponseCodecAlternative1Codec)

  private val campaignsListOrgCampaignsResponseCodecAlternative2Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("campaigns/list-org-campaigns.response.alternative2", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val campaignsListOrgCampaignsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(campaignsListOrgCampaignsResponseCodecAlternative2Codec)

  public val campaignsListOrgCampaignsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val campaignsListOrgCampaignsResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CampaignSummary>> =
      MediaTypeCodecRegistry.of(campaignsListOrgCampaignsResponseCodec)

  public const val CAMPAIGNSUPDATECAMPAIGN_REQUEST_CODEC_ID: String =
      "campaigns/update-campaign.request"

  private val campaignsUpdateCampaignRequestCodec:
      MediaTypeCodec<InlineOrgsCampaignsPatchRequestJsonXfff35dd6> =
      KotlinxSerializationCodec(CAMPAIGNSUPDATECAMPAIGN_REQUEST_CODEC_ID, InlineOrgsCampaignsPatchRequestJsonXfff35dd6.Serializer, SdkJson)

  public const val CAMPAIGNSUPDATECAMPAIGN_RESPONSE_CODEC_ID: String =
      "campaigns/update-campaign.response"

  private val campaignsUpdateCampaignResponseCodec: MediaTypeCodec<CampaignSummary> =
      KotlinxSerializationCodec(CAMPAIGNSUPDATECAMPAIGN_RESPONSE_CODEC_ID, CampaignSummary.Serializer, SdkJson)

  private val campaignsUpdateCampaignResponseCodecAlternative0Codec: MediaTypeCodec<CampaignSummary>
      =
      KotlinxSerializationCodec("campaigns/update-campaign.response.alternative0", CampaignSummary.Serializer, SdkJson)

  public val campaignsUpdateCampaignResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CampaignSummary> =
      MediaTypeCodecRegistry.of(campaignsUpdateCampaignResponseCodecAlternative0Codec)

  private val campaignsUpdateCampaignResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("campaigns/update-campaign.response.alternative1", BasicError.Serializer, SdkJson)

  public val campaignsUpdateCampaignResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(campaignsUpdateCampaignResponseCodecAlternative1Codec)

  private val campaignsUpdateCampaignResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("campaigns/update-campaign.response.alternative2", BasicError.Serializer, SdkJson)

  public val campaignsUpdateCampaignResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(campaignsUpdateCampaignResponseCodecAlternative2Codec)

  private val campaignsUpdateCampaignResponseCodecAlternative3Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("campaigns/update-campaign.response.alternative3", BasicError.Serializer, SdkJson)

  public val campaignsUpdateCampaignResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(campaignsUpdateCampaignResponseCodecAlternative3Codec)

  private val campaignsUpdateCampaignResponseCodecAlternative4Codec:
      MediaTypeCodec<InlineServiceUnavailableResponseJsonX4cf316d5> =
      KotlinxSerializationCodec("campaigns/update-campaign.response.alternative4", InlineServiceUnavailableResponseJsonX4cf316d5.Serializer, SdkJson)

  public val campaignsUpdateCampaignResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InlineServiceUnavailableResponseJsonX4cf316d5> =
      MediaTypeCodecRegistry.of(campaignsUpdateCampaignResponseCodecAlternative4Codec)

  public val campaignsUpdateCampaignRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineOrgsCampaignsPatchRequestJsonXfff35dd6> =
      MediaTypeCodecRegistry.of(campaignsUpdateCampaignRequestCodec)

  public val campaignsUpdateCampaignResponseCodecRegistry: MediaTypeCodecRegistry<CampaignSummary> =
      MediaTypeCodecRegistry.of(campaignsUpdateCampaignResponseCodec)
}

/**
 * Client for the 'campaigns' group of GitHub v3 REST API.
 */
public class CampaignsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@CampaignsClient.authentication)

  /**
   * Deletes a campaign in an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws CampaignsDeleteCampaignApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CampaignsDeleteCampaignError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun campaignsDeleteCampaign(
    campaignNumber: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, CampaignsDeleteCampaignResponse, Unit>(
    request = SdkExecutionRequest(campaignsDeleteCampaignMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "campaign_number", values = listOf(campaignNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CampaignsCodecs.campaignsDeleteCampaignRequestCodecRegistry,
    responseDecoder = CampaignsDeleteCampaignResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CampaignsDeleteCampaignResponse.SuccessNoContent -> response.unit
        is CampaignsDeleteCampaignResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CampaignsDeleteCampaignResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CampaignsDeleteCampaignResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CampaignsDeleteCampaignResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is CampaignsDeleteCampaignResponse.Http404Json -> CampaignsDeleteCampaignApiException(response, statusCode, headers)
        is CampaignsDeleteCampaignResponse.Http503Json -> CampaignsDeleteCampaignApiException(response, statusCode, headers)
        is CampaignsDeleteCampaignResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Deletes a campaign in an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun campaignsDeleteCampaignWithResponse(
    campaignNumber: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CampaignsDeleteCampaignResponse> = executor.executeWithResponse<Unit, CampaignsDeleteCampaignResponse>(SdkExecutionRequest(campaignsDeleteCampaignMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "campaign_number", values = listOf(campaignNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CampaignsCodecs.campaignsDeleteCampaignRequestCodecRegistry, CampaignsDeleteCampaignResponseDecoder, options)

  /**
   * Gets a campaign for an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CampaignsGetCampaignSummaryApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CampaignsGetCampaignSummaryError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun campaignsGetCampaignSummary(
    campaignNumber: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): CampaignSummary = executor.executeWithTypedErrors<Unit, CampaignsGetCampaignSummaryResponse, CampaignSummary>(
    request = SdkExecutionRequest(campaignsGetCampaignSummaryMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "campaign_number", values = listOf(campaignNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CampaignsCodecs.campaignsGetCampaignSummaryRequestCodecRegistry,
    responseDecoder = CampaignsGetCampaignSummaryResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CampaignsGetCampaignSummaryResponse.SuccessJson -> response.json
        is CampaignsGetCampaignSummaryResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CampaignsGetCampaignSummaryResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CampaignsGetCampaignSummaryResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CampaignsGetCampaignSummaryResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CampaignsGetCampaignSummaryResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CampaignsGetCampaignSummaryResponse.Http404Json -> CampaignsGetCampaignSummaryApiException(response, statusCode, headers)
        is CampaignsGetCampaignSummaryResponse.Http422Json -> CampaignsGetCampaignSummaryApiException(response, statusCode, headers)
        is CampaignsGetCampaignSummaryResponse.Http503Json -> CampaignsGetCampaignSummaryApiException(response, statusCode, headers)
        is CampaignsGetCampaignSummaryResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a campaign for an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun campaignsGetCampaignSummaryWithResponse(
    campaignNumber: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CampaignsGetCampaignSummaryResponse> = executor.executeWithResponse<Unit, CampaignsGetCampaignSummaryResponse>(SdkExecutionRequest(campaignsGetCampaignSummaryMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "campaign_number", values = listOf(campaignNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CampaignsCodecs.campaignsGetCampaignSummaryRequestCodecRegistry, CampaignsGetCampaignSummaryResponseDecoder, options)

  /**
   * Lists campaigns in an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CampaignsListOrgCampaignsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CampaignsListOrgCampaignsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun campaignsListOrgCampaigns(
    org: String,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineOrgsCampaignsGetParameterXff018eaf? = null,
    state: CampaignState? = null,
    options: CallOptions = CallOptions(),
  ): List<CampaignSummary> = executor.executeWithTypedErrors<Unit, CampaignsListOrgCampaignsResponse, List<CampaignSummary>>(
    request = SdkExecutionRequest(campaignsListOrgCampaignsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = CampaignsCodecs.campaignsListOrgCampaignsRequestCodecRegistry,
    responseDecoder = CampaignsListOrgCampaignsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CampaignsListOrgCampaignsResponse.SuccessJson -> response.json
        is CampaignsListOrgCampaignsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CampaignsListOrgCampaignsResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CampaignsListOrgCampaignsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CampaignsListOrgCampaignsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CampaignsListOrgCampaignsResponse.Http404Json -> CampaignsListOrgCampaignsApiException(response, statusCode, headers)
        is CampaignsListOrgCampaignsResponse.Http503Json -> CampaignsListOrgCampaignsApiException(response, statusCode, headers)
        is CampaignsListOrgCampaignsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists campaigns in an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun campaignsListOrgCampaignsWithResponse(
    org: String,
    direction: InlineDirectionParameterX3053723f? = null,
    page: Int? = null,
    perPage: Int? = null,
    sort: InlineOrgsCampaignsGetParameterXff018eaf? = null,
    state: CampaignState? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CampaignsListOrgCampaignsResponse> = executor.executeWithResponse<Unit, CampaignsListOrgCampaignsResponse>(SdkExecutionRequest(campaignsListOrgCampaignsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "direction", values = direction?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "state", values = state?.let { listOf(it.toString()) }.orEmpty()))
  }), CampaignsCodecs.campaignsListOrgCampaignsRequestCodecRegistry, CampaignsListOrgCampaignsResponseDecoder, options)

  /**
   * Updates a campaign in an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CampaignsUpdateCampaignApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CampaignsUpdateCampaignError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun campaignsUpdateCampaign(
    request: InlineOrgsCampaignsPatchRequestJsonXfff35dd6,
    campaignNumber: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): CampaignSummary = executor.executeWithTypedErrors<InlineOrgsCampaignsPatchRequestJsonXfff35dd6, CampaignsUpdateCampaignResponse, CampaignSummary>(
    request = SdkExecutionRequest(campaignsUpdateCampaignMetadata, baseUri, request, listOf(CampaignsCodecs.CAMPAIGNSUPDATECAMPAIGN_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "campaign_number", values = listOf(campaignNumber.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
    }),
    requestCodecs = CampaignsCodecs.campaignsUpdateCampaignRequestCodecRegistry,
    responseDecoder = CampaignsUpdateCampaignResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CampaignsUpdateCampaignResponse.SuccessJson -> response.json
        is CampaignsUpdateCampaignResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CampaignsUpdateCampaignResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CampaignsUpdateCampaignResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CampaignsUpdateCampaignResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CampaignsUpdateCampaignResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CampaignsUpdateCampaignResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CampaignsUpdateCampaignResponse.Http400Json -> CampaignsUpdateCampaignApiException(response, statusCode, headers)
        is CampaignsUpdateCampaignResponse.Http404Json -> CampaignsUpdateCampaignApiException(response, statusCode, headers)
        is CampaignsUpdateCampaignResponse.Http422Json -> CampaignsUpdateCampaignApiException(response, statusCode, headers)
        is CampaignsUpdateCampaignResponse.Http503Json -> CampaignsUpdateCampaignApiException(response, statusCode, headers)
        is CampaignsUpdateCampaignResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Updates a campaign in an organization.
   *
   * The authenticated user must be an owner or security manager for the organization to use this endpoint.
   *
   * OAuth app tokens and personal access tokens (classic) need the `security_events` scope to use this endpoint.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun campaignsUpdateCampaignWithResponse(
    request: InlineOrgsCampaignsPatchRequestJsonXfff35dd6,
    campaignNumber: Int,
    org: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CampaignsUpdateCampaignResponse> = executor.executeWithResponse<InlineOrgsCampaignsPatchRequestJsonXfff35dd6, CampaignsUpdateCampaignResponse>(SdkExecutionRequest(campaignsUpdateCampaignMetadata, baseUri, request, listOf(CampaignsCodecs.CAMPAIGNSUPDATECAMPAIGN_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "campaign_number", values = listOf(campaignNumber.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "org", values = listOf(org.toString())))
  }), CampaignsCodecs.campaignsUpdateCampaignRequestCodecRegistry, CampaignsUpdateCampaignResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `campaigns/delete-campaign` may expose through its typed API
   * exception.
   */
  public sealed interface CampaignsDeleteCampaignError

  /**
   * Typed response alternatives for `campaigns/delete-campaign`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CampaignsDeleteCampaignResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsDeleteCampaignResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsDeleteCampaignResponse,
        CampaignsDeleteCampaignError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsDeleteCampaignResponse,
        CampaignsDeleteCampaignError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsDeleteCampaignResponse
  }

  /**
   * Raised by `campaigns/delete-campaign` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CampaignsDeleteCampaignApiException(
    public val error: CampaignsDeleteCampaignError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "campaigns/delete-campaign")

  private object CampaignsDeleteCampaignResponseDecoder : SdkResponseAlternativeDecoder<CampaignsDeleteCampaignResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CampaignsDeleteCampaignResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CampaignsDeleteCampaignResponse> = when {
      alternative.id == "campaigns/delete-campaign.response.alternative0" -> SdkResponseDecodeResult(
        value = CampaignsDeleteCampaignResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "campaigns/delete-campaign.response.alternative1" -> SdkResponseDecodeResult(
        value = CampaignsDeleteCampaignResponse.Http404Json(
          json = CampaignsCodecs.campaignsDeleteCampaignResponseCodecAlternative1Registry.select(listOf("campaigns/delete-campaign.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "campaigns/delete-campaign.response.alternative2" -> SdkResponseDecodeResult(
        value = CampaignsDeleteCampaignResponse.Http503Json(
          json = CampaignsCodecs.campaignsDeleteCampaignResponseCodecAlternative2Registry.select(listOf("campaigns/delete-campaign.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CampaignsDeleteCampaignResponse = CampaignsDeleteCampaignResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `campaigns/get-campaign-summary` may expose through its typed API
   * exception.
   */
  public sealed interface CampaignsGetCampaignSummaryError

  /**
   * Typed response alternatives for `campaigns/get-campaign-summary`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CampaignsGetCampaignSummaryResponse {
    public class SuccessJson(
      public val json: CampaignSummary,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsGetCampaignSummaryResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsGetCampaignSummaryResponse,
        CampaignsGetCampaignSummaryError

    public class Http422Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsGetCampaignSummaryResponse,
        CampaignsGetCampaignSummaryError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsGetCampaignSummaryResponse,
        CampaignsGetCampaignSummaryError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsGetCampaignSummaryResponse
  }

  /**
   * Raised by `campaigns/get-campaign-summary` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CampaignsGetCampaignSummaryApiException(
    public val error: CampaignsGetCampaignSummaryError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "campaigns/get-campaign-summary")

  private object CampaignsGetCampaignSummaryResponseDecoder : SdkResponseAlternativeDecoder<CampaignsGetCampaignSummaryResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CampaignsGetCampaignSummaryResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CampaignsGetCampaignSummaryResponse> = when {
      alternative.id == "campaigns/get-campaign-summary.response.alternative0" -> SdkResponseDecodeResult(
        value = CampaignsGetCampaignSummaryResponse.SuccessJson(
          json = CampaignsCodecs.campaignsGetCampaignSummaryResponseCodecAlternative0Registry.select(listOf("campaigns/get-campaign-summary.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "campaigns/get-campaign-summary.response.alternative1" -> SdkResponseDecodeResult(
        value = CampaignsGetCampaignSummaryResponse.Http404Json(
          json = CampaignsCodecs.campaignsGetCampaignSummaryResponseCodecAlternative1Registry.select(listOf("campaigns/get-campaign-summary.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "campaigns/get-campaign-summary.response.alternative2" -> SdkResponseDecodeResult(
        value = CampaignsGetCampaignSummaryResponse.Http422Json(
          json = CampaignsCodecs.campaignsGetCampaignSummaryResponseCodecAlternative2Registry.select(listOf("campaigns/get-campaign-summary.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "campaigns/get-campaign-summary.response.alternative3" -> SdkResponseDecodeResult(
        value = CampaignsGetCampaignSummaryResponse.Http503Json(
          json = CampaignsCodecs.campaignsGetCampaignSummaryResponseCodecAlternative3Registry.select(listOf("campaigns/get-campaign-summary.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CampaignsGetCampaignSummaryResponse = CampaignsGetCampaignSummaryResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `campaigns/list-org-campaigns` may expose through its typed API
   * exception.
   */
  public sealed interface CampaignsListOrgCampaignsError

  /**
   * Typed response alternatives for `campaigns/list-org-campaigns`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CampaignsListOrgCampaignsResponse {
    public class SuccessJson(
      public val json: List<CampaignSummary>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsListOrgCampaignsResponse

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsListOrgCampaignsResponse,
        CampaignsListOrgCampaignsError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsListOrgCampaignsResponse,
        CampaignsListOrgCampaignsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsListOrgCampaignsResponse
  }

  /**
   * Raised by `campaigns/list-org-campaigns` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CampaignsListOrgCampaignsApiException(
    public val error: CampaignsListOrgCampaignsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "campaigns/list-org-campaigns")

  private object CampaignsListOrgCampaignsResponseDecoder : SdkResponseAlternativeDecoder<CampaignsListOrgCampaignsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CampaignsListOrgCampaignsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CampaignsListOrgCampaignsResponse> = when {
      alternative.id == "campaigns/list-org-campaigns.response.alternative0" -> SdkResponseDecodeResult(
        value = CampaignsListOrgCampaignsResponse.SuccessJson(
          json = CampaignsCodecs.campaignsListOrgCampaignsResponseCodecAlternative0Registry.select(listOf("campaigns/list-org-campaigns.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "campaigns/list-org-campaigns.response.alternative1" -> SdkResponseDecodeResult(
        value = CampaignsListOrgCampaignsResponse.Http404Json(
          json = CampaignsCodecs.campaignsListOrgCampaignsResponseCodecAlternative1Registry.select(listOf("campaigns/list-org-campaigns.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "campaigns/list-org-campaigns.response.alternative2" -> SdkResponseDecodeResult(
        value = CampaignsListOrgCampaignsResponse.Http503Json(
          json = CampaignsCodecs.campaignsListOrgCampaignsResponseCodecAlternative2Registry.select(listOf("campaigns/list-org-campaigns.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CampaignsListOrgCampaignsResponse = CampaignsListOrgCampaignsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `campaigns/update-campaign` may expose through its typed API
   * exception.
   */
  public sealed interface CampaignsUpdateCampaignError

  /**
   * Typed response alternatives for `campaigns/update-campaign`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CampaignsUpdateCampaignResponse {
    public class SuccessJson(
      public val json: CampaignSummary,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsUpdateCampaignResponse

    public class Http400Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsUpdateCampaignResponse,
        CampaignsUpdateCampaignError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsUpdateCampaignResponse,
        CampaignsUpdateCampaignError

    public class Http422Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsUpdateCampaignResponse,
        CampaignsUpdateCampaignError

    public class Http503Json(
      public val json: InlineServiceUnavailableResponseJsonX4cf316d5,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsUpdateCampaignResponse,
        CampaignsUpdateCampaignError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CampaignsUpdateCampaignResponse
  }

  /**
   * Raised by `campaigns/update-campaign` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CampaignsUpdateCampaignApiException(
    public val error: CampaignsUpdateCampaignError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "campaigns/update-campaign")

  private object CampaignsUpdateCampaignResponseDecoder : SdkResponseAlternativeDecoder<CampaignsUpdateCampaignResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CampaignsUpdateCampaignResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CampaignsUpdateCampaignResponse> = when {
      alternative.id == "campaigns/update-campaign.response.alternative0" -> SdkResponseDecodeResult(
        value = CampaignsUpdateCampaignResponse.SuccessJson(
          json = CampaignsCodecs.campaignsUpdateCampaignResponseCodecAlternative0Registry.select(listOf("campaigns/update-campaign.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "campaigns/update-campaign.response.alternative1" -> SdkResponseDecodeResult(
        value = CampaignsUpdateCampaignResponse.Http400Json(
          json = CampaignsCodecs.campaignsUpdateCampaignResponseCodecAlternative1Registry.select(listOf("campaigns/update-campaign.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "campaigns/update-campaign.response.alternative2" -> SdkResponseDecodeResult(
        value = CampaignsUpdateCampaignResponse.Http404Json(
          json = CampaignsCodecs.campaignsUpdateCampaignResponseCodecAlternative2Registry.select(listOf("campaigns/update-campaign.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "campaigns/update-campaign.response.alternative3" -> SdkResponseDecodeResult(
        value = CampaignsUpdateCampaignResponse.Http422Json(
          json = CampaignsCodecs.campaignsUpdateCampaignResponseCodecAlternative3Registry.select(listOf("campaigns/update-campaign.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "campaigns/update-campaign.response.alternative4" -> SdkResponseDecodeResult(
        value = CampaignsUpdateCampaignResponse.Http503Json(
          json = CampaignsCodecs.campaignsUpdateCampaignResponseCodecAlternative4Registry.select(listOf("campaigns/update-campaign.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CampaignsUpdateCampaignResponse = CampaignsUpdateCampaignResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val campaignsDeleteCampaignMetadata: OperationMetadata = OperationMetadata(
          operationId = "campaigns/delete-campaign",
          method = "DELETE",
          path = "/orgs/{org}/campaigns/{campaign_number}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = emptyList(),
          successStatusCodes = setOf(204),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 204),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/delete-campaign.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/delete-campaign.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/delete-campaign.response.alternative2",
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
        )

    public val campaignsGetCampaignSummaryMetadata: OperationMetadata = OperationMetadata(
          operationId = "campaigns/get-campaign-summary",
          method = "GET",
          path = "/orgs/{org}/campaigns/{campaign_number}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CampaignSummary",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/get-campaign-summary.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/get-campaign-summary.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/get-campaign-summary.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/get-campaign-summary.response.alternative3",
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
        )

    public val campaignsListOrgCampaignsMetadata: OperationMetadata = OperationMetadata(
          operationId = "campaigns/list-org-campaigns",
          method = "GET",
          path = "/orgs/{org}/campaigns",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/list-org-campaigns.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/list-org-campaigns.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/list-org-campaigns.response.alternative2",
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
        )

    public val campaignsUpdateCampaignMetadata: OperationMetadata = OperationMetadata(
          operationId = "campaigns/update-campaign",
          method = "PATCH",
          path = "/orgs/{org}/campaigns/{campaign_number}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CampaignSummary",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/update-campaign.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/update-campaign.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/update-campaign.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/update-campaign.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineServiceUnavailableResponseJsonX4cf316d5",
              mode = SdkResponseMode.BUFFERED,
              id = "campaigns/update-campaign.response.alternative4",
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
        )
  }
}
