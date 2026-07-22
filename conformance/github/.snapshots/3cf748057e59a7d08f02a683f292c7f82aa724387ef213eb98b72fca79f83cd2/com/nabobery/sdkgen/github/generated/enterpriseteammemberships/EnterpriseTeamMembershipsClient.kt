package com.nabobery.sdkgen.github.generated.enterpriseteammemberships

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658
import com.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613
import com.nabobery.sdkgen.github.generated.SdkJson
import com.nabobery.sdkgen.github.generated.SimpleUser
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

public object EnterpriseTeamMembershipsCodecs {
  public const val ENTERPRISETEAMMEMBERSHIPSADD_RESPONSE_CODEC_ID: String =
      "enterprise-team-memberships/add.response"

  private val enterpriseTeamMembershipsAddResponseCodec: MediaTypeCodec<SimpleUser> =
      KotlinxSerializationCodec(ENTERPRISETEAMMEMBERSHIPSADD_RESPONSE_CODEC_ID, SimpleUser.Serializer, SdkJson)

  private val enterpriseTeamMembershipsAddResponseCodecAlternative0Codec: MediaTypeCodec<SimpleUser>
      =
      KotlinxSerializationCodec("enterprise-team-memberships/add.response.alternative0", SimpleUser.Serializer, SdkJson)

  public val enterpriseTeamMembershipsAddResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SimpleUser> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsAddResponseCodecAlternative0Codec)

  public val enterpriseTeamMembershipsAddRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val enterpriseTeamMembershipsAddResponseCodecRegistry: MediaTypeCodecRegistry<SimpleUser> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsAddResponseCodec)

  public const val ENTERPRISETEAMMEMBERSHIPSBULKADD_REQUEST_CODEC_ID: String =
      "enterprise-team-memberships/bulk-add.request"

  private val enterpriseTeamMembershipsBulkAddRequestCodec:
      MediaTypeCodec<InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658> =
      KotlinxSerializationCodec(ENTERPRISETEAMMEMBERSHIPSBULKADD_REQUEST_CODEC_ID, InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658.Serializer, SdkJson)

  public const val ENTERPRISETEAMMEMBERSHIPSBULKADD_RESPONSE_CODEC_ID: String =
      "enterprise-team-memberships/bulk-add.response"

  private val enterpriseTeamMembershipsBulkAddResponseCodec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec(ENTERPRISETEAMMEMBERSHIPSBULKADD_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val enterpriseTeamMembershipsBulkAddResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("enterprise-team-memberships/bulk-add.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  public val enterpriseTeamMembershipsBulkAddResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsBulkAddResponseCodecAlternative0Codec)

  public val enterpriseTeamMembershipsBulkAddRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsBulkAddRequestCodec)

  public val enterpriseTeamMembershipsBulkAddResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsBulkAddResponseCodec)

  public const val ENTERPRISETEAMMEMBERSHIPSBULKREMOVE_REQUEST_CODEC_ID: String =
      "enterprise-team-memberships/bulk-remove.request"

  private val enterpriseTeamMembershipsBulkRemoveRequestCodec:
      MediaTypeCodec<InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613> =
      KotlinxSerializationCodec(ENTERPRISETEAMMEMBERSHIPSBULKREMOVE_REQUEST_CODEC_ID, InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613.Serializer, SdkJson)

  public const val ENTERPRISETEAMMEMBERSHIPSBULKREMOVE_RESPONSE_CODEC_ID: String =
      "enterprise-team-memberships/bulk-remove.response"

  private val enterpriseTeamMembershipsBulkRemoveResponseCodec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec(ENTERPRISETEAMMEMBERSHIPSBULKREMOVE_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val enterpriseTeamMembershipsBulkRemoveResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("enterprise-team-memberships/bulk-remove.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  public val enterpriseTeamMembershipsBulkRemoveResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsBulkRemoveResponseCodecAlternative0Codec)

  public val enterpriseTeamMembershipsBulkRemoveRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsBulkRemoveRequestCodec)

  public val enterpriseTeamMembershipsBulkRemoveResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsBulkRemoveResponseCodec)

  public const val ENTERPRISETEAMMEMBERSHIPSGET_RESPONSE_CODEC_ID: String =
      "enterprise-team-memberships/get.response"

  private val enterpriseTeamMembershipsGetResponseCodec: MediaTypeCodec<SimpleUser> =
      KotlinxSerializationCodec(ENTERPRISETEAMMEMBERSHIPSGET_RESPONSE_CODEC_ID, SimpleUser.Serializer, SdkJson)

  private val enterpriseTeamMembershipsGetResponseCodecAlternative0Codec: MediaTypeCodec<SimpleUser>
      =
      KotlinxSerializationCodec("enterprise-team-memberships/get.response.alternative0", SimpleUser.Serializer, SdkJson)

  public val enterpriseTeamMembershipsGetResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SimpleUser> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsGetResponseCodecAlternative0Codec)

  public val enterpriseTeamMembershipsGetRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val enterpriseTeamMembershipsGetResponseCodecRegistry: MediaTypeCodecRegistry<SimpleUser> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsGetResponseCodec)

  public const val ENTERPRISETEAMMEMBERSHIPSLIST_RESPONSE_CODEC_ID: String =
      "enterprise-team-memberships/list.response"

  private val enterpriseTeamMembershipsListResponseCodec: MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec(ENTERPRISETEAMMEMBERSHIPSLIST_RESPONSE_CODEC_ID, ListSerializer(SimpleUser.Serializer), SdkJson)

  private val enterpriseTeamMembershipsListResponseCodecAlternative0Codec:
      MediaTypeCodec<List<SimpleUser>> =
      KotlinxSerializationCodec("enterprise-team-memberships/list.response.alternative0", ListSerializer(SimpleUser.Serializer), SdkJson)

  public val enterpriseTeamMembershipsListResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsListResponseCodecAlternative0Codec)

  public val enterpriseTeamMembershipsListRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val enterpriseTeamMembershipsListResponseCodecRegistry:
      MediaTypeCodecRegistry<List<SimpleUser>> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsListResponseCodec)

  private val enterpriseTeamMembershipsRemoveResponseCodecAlternative1Codec:
      MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("enterprise-team-memberships/remove.response.alternative1", BasicError.Serializer, SdkJson)

  public val enterpriseTeamMembershipsRemoveResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(enterpriseTeamMembershipsRemoveResponseCodecAlternative1Codec)

  public val enterpriseTeamMembershipsRemoveRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val enterpriseTeamMembershipsRemoveResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()
}

/**
 * Client for the 'enterprise-team-memberships' group of GitHub v3 REST API.
 */
public class EnterpriseTeamMembershipsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@EnterpriseTeamMembershipsClient.authentication)

  /**
   * Add a team member to an enterprise team.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamMembershipsAdd(
    enterprise: String,
    enterpriseTeam: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SimpleUser = executor.execute<Unit, SimpleUser>(SdkExecutionRequest(enterpriseTeamMembershipsAddMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), listOf(EnterpriseTeamMembershipsCodecs.ENTERPRISETEAMMEMBERSHIPSADD_RESPONSE_CODEC_ID), EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsAddRequestCodecRegistry, EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsAddResponseCodecRegistry, options)

  /**
   * Add a team member to an enterprise team.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamMembershipsAddWithResponse(
    enterprise: String,
    enterpriseTeam: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamMembershipsAddResponse> = executor.executeWithResponse<Unit, EnterpriseTeamMembershipsAddResponse>(SdkExecutionRequest(enterpriseTeamMembershipsAddMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsAddRequestCodecRegistry, EnterpriseTeamMembershipsAddResponseDecoder, options)

  /**
   * Add multiple team members to an enterprise team.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamMembershipsBulkAdd(
    request: InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658,
    enterprise: String,
    enterpriseTeam: String,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.execute<InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658, List<SimpleUser>>(SdkExecutionRequest(enterpriseTeamMembershipsBulkAddMetadata, baseUri, request, listOf(EnterpriseTeamMembershipsCodecs.ENTERPRISETEAMMEMBERSHIPSBULKADD_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
  }), listOf(EnterpriseTeamMembershipsCodecs.ENTERPRISETEAMMEMBERSHIPSBULKADD_RESPONSE_CODEC_ID), EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsBulkAddRequestCodecRegistry, EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsBulkAddResponseCodecRegistry, options)

  /**
   * Add multiple team members to an enterprise team.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamMembershipsBulkAddWithResponse(
    request: InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658,
    enterprise: String,
    enterpriseTeam: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamMembershipsBulkAddResponse> = executor.executeWithResponse<InlineEnterprisesTeamsMembershipsAddPostRequestJsonX42f7b658, EnterpriseTeamMembershipsBulkAddResponse>(SdkExecutionRequest(enterpriseTeamMembershipsBulkAddMetadata, baseUri, request, listOf(EnterpriseTeamMembershipsCodecs.ENTERPRISETEAMMEMBERSHIPSBULKADD_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
  }), EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsBulkAddRequestCodecRegistry, EnterpriseTeamMembershipsBulkAddResponseDecoder, options)

  /**
   * Remove multiple team members from an enterprise team.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamMembershipsBulkRemove(
    request: InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613,
    enterprise: String,
    enterpriseTeam: String,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.execute<InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613, List<SimpleUser>>(SdkExecutionRequest(enterpriseTeamMembershipsBulkRemoveMetadata, baseUri, request, listOf(EnterpriseTeamMembershipsCodecs.ENTERPRISETEAMMEMBERSHIPSBULKREMOVE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
  }), listOf(EnterpriseTeamMembershipsCodecs.ENTERPRISETEAMMEMBERSHIPSBULKREMOVE_RESPONSE_CODEC_ID), EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsBulkRemoveRequestCodecRegistry, EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsBulkRemoveResponseCodecRegistry, options)

  /**
   * Remove multiple team members from an enterprise team.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamMembershipsBulkRemoveWithResponse(
    request: InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613,
    enterprise: String,
    enterpriseTeam: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamMembershipsBulkRemoveResponse> = executor.executeWithResponse<InlineEnterprisesTeamsMembershipsRemovePostRequestJsonX738e2613, EnterpriseTeamMembershipsBulkRemoveResponse>(SdkExecutionRequest(enterpriseTeamMembershipsBulkRemoveMetadata, baseUri, request, listOf(EnterpriseTeamMembershipsCodecs.ENTERPRISETEAMMEMBERSHIPSBULKREMOVE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
  }), EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsBulkRemoveRequestCodecRegistry, EnterpriseTeamMembershipsBulkRemoveResponseDecoder, options)

  /**
   * Returns whether the user is a member of the enterprise team.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamMembershipsGet(
    enterprise: String,
    enterpriseTeam: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SimpleUser = executor.execute<Unit, SimpleUser>(SdkExecutionRequest(enterpriseTeamMembershipsGetMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), listOf(EnterpriseTeamMembershipsCodecs.ENTERPRISETEAMMEMBERSHIPSGET_RESPONSE_CODEC_ID), EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsGetRequestCodecRegistry, EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsGetResponseCodecRegistry, options)

  /**
   * Returns whether the user is a member of the enterprise team.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamMembershipsGetWithResponse(
    enterprise: String,
    enterpriseTeam: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamMembershipsGetResponse> = executor.executeWithResponse<Unit, EnterpriseTeamMembershipsGetResponse>(SdkExecutionRequest(enterpriseTeamMembershipsGetMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsGetRequestCodecRegistry, EnterpriseTeamMembershipsGetResponseDecoder, options)

  /**
   * Lists all team members in an enterprise team.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamMembershipsList(
    enterprise: String,
    enterpriseTeam: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<SimpleUser> = executor.execute<Unit, List<SimpleUser>>(SdkExecutionRequest(enterpriseTeamMembershipsListMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(EnterpriseTeamMembershipsCodecs.ENTERPRISETEAMMEMBERSHIPSLIST_RESPONSE_CODEC_ID), EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsListRequestCodecRegistry, EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsListResponseCodecRegistry, options)

  /**
   * Lists all team members in an enterprise team.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamMembershipsListWithResponse(
    enterprise: String,
    enterpriseTeam: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamMembershipsListResponse> = executor.executeWithResponse<Unit, EnterpriseTeamMembershipsListResponse>(SdkExecutionRequest(enterpriseTeamMembershipsListMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsListRequestCodecRegistry, EnterpriseTeamMembershipsListResponseDecoder, options)

  /**
   * Remove membership of a specific user from a particular team in an enterprise.
   *
   * @param options Execution options.
   * @return No response body.
   * @throws EnterpriseTeamMembershipsRemoveApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded EnterpriseTeamMembershipsRemoveError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamMembershipsRemove(
    enterprise: String,
    enterpriseTeam: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, EnterpriseTeamMembershipsRemoveResponse, Unit>(
    request = SdkExecutionRequest(enterpriseTeamMembershipsRemoveMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
    }),
    requestCodecs = EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsRemoveRequestCodecRegistry,
    responseDecoder = EnterpriseTeamMembershipsRemoveResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is EnterpriseTeamMembershipsRemoveResponse.SuccessNoContent -> response.unit
        is EnterpriseTeamMembershipsRemoveResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is EnterpriseTeamMembershipsRemoveResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is EnterpriseTeamMembershipsRemoveResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is EnterpriseTeamMembershipsRemoveResponse.Http403Json -> EnterpriseTeamMembershipsRemoveApiException(response, statusCode, headers)
        is EnterpriseTeamMembershipsRemoveResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Remove membership of a specific user from a particular team in an enterprise.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun enterpriseTeamMembershipsRemoveWithResponse(
    enterprise: String,
    enterpriseTeam: String,
    username: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamMembershipsRemoveResponse> = executor.executeWithResponse<Unit, EnterpriseTeamMembershipsRemoveResponse>(SdkExecutionRequest(enterpriseTeamMembershipsRemoveMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise-team", values = listOf(enterpriseTeam.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "username", values = listOf(username.toString())))
  }), EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsRemoveRequestCodecRegistry, EnterpriseTeamMembershipsRemoveResponseDecoder, options)

  /**
   * Typed response alternatives for `enterprise-team-memberships/add`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface EnterpriseTeamMembershipsAddResponse {
    public class SuccessJson(
      public val json: SimpleUser,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsAddResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsAddResponse
  }

  private object EnterpriseTeamMembershipsAddResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamMembershipsAddResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamMembershipsAddResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamMembershipsAddResponse> = when {
      alternative.id == "enterprise-team-memberships/add.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamMembershipsAddResponse.SuccessJson(
          json = EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsAddResponseCodecAlternative0Registry.select(listOf("enterprise-team-memberships/add.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamMembershipsAddResponse = EnterpriseTeamMembershipsAddResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `enterprise-team-memberships/bulk-add`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface EnterpriseTeamMembershipsBulkAddResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsBulkAddResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsBulkAddResponse
  }

  private object EnterpriseTeamMembershipsBulkAddResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamMembershipsBulkAddResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamMembershipsBulkAddResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamMembershipsBulkAddResponse> = when {
      alternative.id == "enterprise-team-memberships/bulk-add.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamMembershipsBulkAddResponse.SuccessJson(
          json = EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsBulkAddResponseCodecAlternative0Registry.select(listOf("enterprise-team-memberships/bulk-add.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamMembershipsBulkAddResponse = EnterpriseTeamMembershipsBulkAddResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `enterprise-team-memberships/bulk-remove`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface EnterpriseTeamMembershipsBulkRemoveResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsBulkRemoveResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsBulkRemoveResponse
  }

  private object EnterpriseTeamMembershipsBulkRemoveResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamMembershipsBulkRemoveResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamMembershipsBulkRemoveResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamMembershipsBulkRemoveResponse> = when {
      alternative.id == "enterprise-team-memberships/bulk-remove.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamMembershipsBulkRemoveResponse.SuccessJson(
          json = EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsBulkRemoveResponseCodecAlternative0Registry.select(listOf("enterprise-team-memberships/bulk-remove.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamMembershipsBulkRemoveResponse = EnterpriseTeamMembershipsBulkRemoveResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `enterprise-team-memberships/get`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface EnterpriseTeamMembershipsGetResponse {
    public class SuccessJson(
      public val json: SimpleUser,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsGetResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsGetResponse
  }

  private object EnterpriseTeamMembershipsGetResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamMembershipsGetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamMembershipsGetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamMembershipsGetResponse> = when {
      alternative.id == "enterprise-team-memberships/get.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamMembershipsGetResponse.SuccessJson(
          json = EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsGetResponseCodecAlternative0Registry.select(listOf("enterprise-team-memberships/get.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamMembershipsGetResponse = EnterpriseTeamMembershipsGetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `enterprise-team-memberships/list`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface EnterpriseTeamMembershipsListResponse {
    public class SuccessJson(
      public val json: List<SimpleUser>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsListResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsListResponse
  }

  private object EnterpriseTeamMembershipsListResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamMembershipsListResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamMembershipsListResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamMembershipsListResponse> = when {
      alternative.id == "enterprise-team-memberships/list.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamMembershipsListResponse.SuccessJson(
          json = EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsListResponseCodecAlternative0Registry.select(listOf("enterprise-team-memberships/list.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamMembershipsListResponse = EnterpriseTeamMembershipsListResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `enterprise-team-memberships/remove` may expose through its typed
   * API exception.
   */
  public sealed interface EnterpriseTeamMembershipsRemoveError

  /**
   * Typed response alternatives for `enterprise-team-memberships/remove`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface EnterpriseTeamMembershipsRemoveResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsRemoveResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsRemoveResponse,
        EnterpriseTeamMembershipsRemoveError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamMembershipsRemoveResponse
  }

  /**
   * Raised by `enterprise-team-memberships/remove` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class EnterpriseTeamMembershipsRemoveApiException(
    public val error: EnterpriseTeamMembershipsRemoveError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "enterprise-team-memberships/remove")

  private object EnterpriseTeamMembershipsRemoveResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamMembershipsRemoveResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamMembershipsRemoveResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamMembershipsRemoveResponse> = when {
      alternative.id == "enterprise-team-memberships/remove.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamMembershipsRemoveResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "enterprise-team-memberships/remove.response.alternative1" -> SdkResponseDecodeResult(
        value = EnterpriseTeamMembershipsRemoveResponse.Http403Json(
          json = EnterpriseTeamMembershipsCodecs.enterpriseTeamMembershipsRemoveResponseCodecAlternative1Registry.select(listOf("enterprise-team-memberships/remove.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamMembershipsRemoveResponse = EnterpriseTeamMembershipsRemoveResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val enterpriseTeamMembershipsAddMetadata: OperationMetadata = OperationMetadata(
          operationId = "enterprise-team-memberships/add",
          method = "PUT",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/memberships/{username}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "SimpleUser",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-team-memberships/add.response.alternative0",
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

    public val enterpriseTeamMembershipsBulkAddMetadata: OperationMetadata = OperationMetadata(
          operationId = "enterprise-team-memberships/bulk-add",
          method = "POST",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/memberships/add",
          requestMediaTypes = listOf("application/json"),
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
              id = "enterprise-team-memberships/bulk-add.response.alternative0",
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

    public val enterpriseTeamMembershipsBulkRemoveMetadata: OperationMetadata = OperationMetadata(
          operationId = "enterprise-team-memberships/bulk-remove",
          method = "POST",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/memberships/remove",
          requestMediaTypes = listOf("application/json"),
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
              id = "enterprise-team-memberships/bulk-remove.response.alternative0",
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

    public val enterpriseTeamMembershipsGetMetadata: OperationMetadata = OperationMetadata(
          operationId = "enterprise-team-memberships/get",
          method = "GET",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/memberships/{username}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SimpleUser",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-team-memberships/get.response.alternative0",
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

    public val enterpriseTeamMembershipsListMetadata: OperationMetadata = OperationMetadata(
          operationId = "enterprise-team-memberships/list",
          method = "GET",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/memberships",
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
              id = "enterprise-team-memberships/list.response.alternative0",
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

    public val enterpriseTeamMembershipsRemoveMetadata: OperationMetadata = OperationMetadata(
          operationId = "enterprise-team-memberships/remove",
          method = "DELETE",
          path = "/enterprises/{enterprise}/teams/{enterprise-team}/memberships/{username}",
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
              id = "enterprise-team-memberships/remove.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-team-memberships/remove.response.alternative1",
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
  }
}
