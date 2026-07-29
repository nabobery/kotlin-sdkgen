package com.nabobery.sdkgen.github.generated.enterpriseteams

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.EnterpriseTeam
import com.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc
import com.nabobery.sdkgen.github.generated.InlineEnterprisesTeamsPostRequestJsonX7cfbf060
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
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer

public object EnterpriseTeamsCodecs {
  public const val ENTERPRISETEAMSCREATE_REQUEST_CODEC_ID: String =
      "enterprise-teams/create.request"

  private val enterpriseTeamsCreateRequestCodec:
      MediaTypeCodec<InlineEnterprisesTeamsPostRequestJsonX7cfbf060> =
      KotlinxSerializationCodec(ENTERPRISETEAMSCREATE_REQUEST_CODEC_ID, InlineEnterprisesTeamsPostRequestJsonX7cfbf060.Serializer, SdkJson)

  public const val ENTERPRISETEAMSCREATE_RESPONSE_CODEC_ID: String =
      "enterprise-teams/create.response"

  private val enterpriseTeamsCreateResponseCodec: MediaTypeCodec<EnterpriseTeam> =
      KotlinxSerializationCodec(ENTERPRISETEAMSCREATE_RESPONSE_CODEC_ID, EnterpriseTeam.Serializer, SdkJson)

  private val enterpriseTeamsCreateResponseCodecAlternative0Codec: MediaTypeCodec<EnterpriseTeam> =
      KotlinxSerializationCodec("enterprise-teams/create.response.alternative0", EnterpriseTeam.Serializer, SdkJson)

  public val enterpriseTeamsCreateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<EnterpriseTeam> =
      MediaTypeCodecRegistry.of(enterpriseTeamsCreateResponseCodecAlternative0Codec)

  public val enterpriseTeamsCreateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesTeamsPostRequestJsonX7cfbf060> =
      MediaTypeCodecRegistry.of(enterpriseTeamsCreateRequestCodec)

  public val enterpriseTeamsCreateResponseCodecRegistry: MediaTypeCodecRegistry<EnterpriseTeam> =
      MediaTypeCodecRegistry.of(enterpriseTeamsCreateResponseCodec)

  private val enterpriseTeamsDeleteResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("enterprise-teams/delete.response.alternative1", BasicError.Serializer, SdkJson)

  public val enterpriseTeamsDeleteResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(enterpriseTeamsDeleteResponseCodecAlternative1Codec)

  public val enterpriseTeamsDeleteRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val enterpriseTeamsDeleteResponseCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val ENTERPRISETEAMSGET_RESPONSE_CODEC_ID: String = "enterprise-teams/get.response"

  private val enterpriseTeamsGetResponseCodec: MediaTypeCodec<EnterpriseTeam> =
      KotlinxSerializationCodec(ENTERPRISETEAMSGET_RESPONSE_CODEC_ID, EnterpriseTeam.Serializer, SdkJson)

  private val enterpriseTeamsGetResponseCodecAlternative0Codec: MediaTypeCodec<EnterpriseTeam> =
      KotlinxSerializationCodec("enterprise-teams/get.response.alternative0", EnterpriseTeam.Serializer, SdkJson)

  public val enterpriseTeamsGetResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<EnterpriseTeam> =
      MediaTypeCodecRegistry.of(enterpriseTeamsGetResponseCodecAlternative0Codec)

  private val enterpriseTeamsGetResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("enterprise-teams/get.response.alternative1", BasicError.Serializer, SdkJson)

  public val enterpriseTeamsGetResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BasicError>
      = MediaTypeCodecRegistry.of(enterpriseTeamsGetResponseCodecAlternative1Codec)

  public val enterpriseTeamsGetRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val enterpriseTeamsGetResponseCodecRegistry: MediaTypeCodecRegistry<EnterpriseTeam> =
      MediaTypeCodecRegistry.of(enterpriseTeamsGetResponseCodec)

  public const val ENTERPRISETEAMSLIST_RESPONSE_CODEC_ID: String = "enterprise-teams/list.response"

  private val enterpriseTeamsListResponseCodec: MediaTypeCodec<List<EnterpriseTeam>> =
      KotlinxSerializationCodec(ENTERPRISETEAMSLIST_RESPONSE_CODEC_ID, ListSerializer(EnterpriseTeam.Serializer), SdkJson)

  private val enterpriseTeamsListResponseCodecAlternative0Codec:
      MediaTypeCodec<List<EnterpriseTeam>> =
      KotlinxSerializationCodec("enterprise-teams/list.response.alternative0", ListSerializer(EnterpriseTeam.Serializer), SdkJson)

  public val enterpriseTeamsListResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<EnterpriseTeam>> =
      MediaTypeCodecRegistry.of(enterpriseTeamsListResponseCodecAlternative0Codec)

  private val enterpriseTeamsListResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("enterprise-teams/list.response.alternative1", BasicError.Serializer, SdkJson)

  public val enterpriseTeamsListResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(enterpriseTeamsListResponseCodecAlternative1Codec)

  public val enterpriseTeamsListRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val enterpriseTeamsListResponseCodecRegistry: MediaTypeCodecRegistry<List<EnterpriseTeam>>
      = MediaTypeCodecRegistry.of(enterpriseTeamsListResponseCodec)

  public const val ENTERPRISETEAMSUPDATE_REQUEST_CODEC_ID: String =
      "enterprise-teams/update.request"

  private val enterpriseTeamsUpdateRequestCodec:
      MediaTypeCodec<InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc> =
      KotlinxSerializationCodec(ENTERPRISETEAMSUPDATE_REQUEST_CODEC_ID, InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc.Serializer, SdkJson)

  public const val ENTERPRISETEAMSUPDATE_RESPONSE_CODEC_ID: String =
      "enterprise-teams/update.response"

  private val enterpriseTeamsUpdateResponseCodec: MediaTypeCodec<EnterpriseTeam> =
      KotlinxSerializationCodec(ENTERPRISETEAMSUPDATE_RESPONSE_CODEC_ID, EnterpriseTeam.Serializer, SdkJson)

  private val enterpriseTeamsUpdateResponseCodecAlternative0Codec: MediaTypeCodec<EnterpriseTeam> =
      KotlinxSerializationCodec("enterprise-teams/update.response.alternative0", EnterpriseTeam.Serializer, SdkJson)

  public val enterpriseTeamsUpdateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<EnterpriseTeam> =
      MediaTypeCodecRegistry.of(enterpriseTeamsUpdateResponseCodecAlternative0Codec)

  private val enterpriseTeamsUpdateResponseCodecAlternative1Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("enterprise-teams/update.response.alternative1", BasicError.Serializer, SdkJson)

  public val enterpriseTeamsUpdateResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(enterpriseTeamsUpdateResponseCodecAlternative1Codec)

  public val enterpriseTeamsUpdateRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc> =
      MediaTypeCodecRegistry.of(enterpriseTeamsUpdateRequestCodec)

  public val enterpriseTeamsUpdateResponseCodecRegistry: MediaTypeCodecRegistry<EnterpriseTeam> =
      MediaTypeCodecRegistry.of(enterpriseTeamsUpdateResponseCodec)
}

/**
 * Client for the 'enterprise-teams' group of GitHub v3 REST API.
 */
public class EnterpriseTeamsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@EnterpriseTeamsClient.authentication)

  /**
   * To create an enterprise team, the authenticated user must be an owner of the enterprise.
   *
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamsCreate(
    request: InlineEnterprisesTeamsPostRequestJsonX7cfbf060,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): EnterpriseTeam = executor.execute<InlineEnterprisesTeamsPostRequestJsonX7cfbf060, EnterpriseTeam>(SdkExecutionRequest(enterpriseTeamsCreateMetadata, baseUri, request, listOf(EnterpriseTeamsCodecs.ENTERPRISETEAMSCREATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), listOf(EnterpriseTeamsCodecs.ENTERPRISETEAMSCREATE_RESPONSE_CODEC_ID), EnterpriseTeamsCodecs.enterpriseTeamsCreateRequestCodecRegistry, EnterpriseTeamsCodecs.enterpriseTeamsCreateResponseCodecRegistry, options)

  /**
   * To create an enterprise team, the authenticated user must be an owner of the enterprise.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param options Execution options.
   */
  public suspend fun enterpriseTeamsCreateWithResponse(
    request: InlineEnterprisesTeamsPostRequestJsonX7cfbf060,
    enterprise: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamsCreateResponse> = executor.executeWithResponse<InlineEnterprisesTeamsPostRequestJsonX7cfbf060, EnterpriseTeamsCreateResponse>(SdkExecutionRequest(enterpriseTeamsCreateMetadata, baseUri, request, listOf(EnterpriseTeamsCodecs.ENTERPRISETEAMSCREATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
  }), EnterpriseTeamsCodecs.enterpriseTeamsCreateRequestCodecRegistry, EnterpriseTeamsCreateResponseDecoder, options)

  /**
   * To delete an enterprise team, the authenticated user must be an enterprise owner.
   *
   * If you are an enterprise owner, deleting an enterprise team will delete all of its IdP mappings as well.
   *
   * @param enterprise The slug version of the enterprise name.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   * @return No response body.
   * @throws EnterpriseTeamsDeleteApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded EnterpriseTeamsDeleteError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamsDelete(
    enterprise: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): Unit = executor.executeWithTypedErrors<Unit, EnterpriseTeamsDeleteResponse, Unit>(
    request = SdkExecutionRequest(enterpriseTeamsDeleteMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    }),
    requestCodecs = EnterpriseTeamsCodecs.enterpriseTeamsDeleteRequestCodecRegistry,
    responseDecoder = EnterpriseTeamsDeleteResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is EnterpriseTeamsDeleteResponse.SuccessNoContent -> response.unit
        is EnterpriseTeamsDeleteResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is EnterpriseTeamsDeleteResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is EnterpriseTeamsDeleteResponse.SuccessNoContent -> error("Runtime selected a success response for error mapping.")
        is EnterpriseTeamsDeleteResponse.Http403Json -> EnterpriseTeamsDeleteApiException(response, statusCode, headers)
        is EnterpriseTeamsDeleteResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * To delete an enterprise team, the authenticated user must be an enterprise owner.
   *
   * If you are an enterprise owner, deleting an enterprise team will delete all of its IdP mappings as well.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param enterprise The slug version of the enterprise name.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   */
  public suspend fun enterpriseTeamsDeleteWithResponse(
    enterprise: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamsDeleteResponse> = executor.executeWithResponse<Unit, EnterpriseTeamsDeleteResponse>(SdkExecutionRequest(enterpriseTeamsDeleteMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
  }), EnterpriseTeamsCodecs.enterpriseTeamsDeleteRequestCodecRegistry, EnterpriseTeamsDeleteResponseDecoder, options)

  /**
   * Gets a team using the team's slug. To create the slug, GitHub replaces special characters in the name string,
   * changes all words to lowercase, and replaces spaces with a `-` separator and adds the "ent:" prefix. For example,
   * "My TEam Näme" would become `ent:my-team-name`.
   *
   * @param enterprise The slug version of the enterprise name.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws EnterpriseTeamsGetApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded EnterpriseTeamsGetError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamsGet(
    enterprise: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): EnterpriseTeam = executor.executeWithTypedErrors<Unit, EnterpriseTeamsGetResponse, EnterpriseTeam>(
    request = SdkExecutionRequest(enterpriseTeamsGetMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    }),
    requestCodecs = EnterpriseTeamsCodecs.enterpriseTeamsGetRequestCodecRegistry,
    responseDecoder = EnterpriseTeamsGetResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is EnterpriseTeamsGetResponse.SuccessJson -> response.json
        is EnterpriseTeamsGetResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is EnterpriseTeamsGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is EnterpriseTeamsGetResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is EnterpriseTeamsGetResponse.Http403Json -> EnterpriseTeamsGetApiException(response, statusCode, headers)
        is EnterpriseTeamsGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Gets a team using the team's slug. To create the slug, GitHub replaces special characters in the name string,
   * changes all words to lowercase, and replaces spaces with a `-` separator and adds the "ent:" prefix. For example,
   * "My TEam Näme" would become `ent:my-team-name`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param enterprise The slug version of the enterprise name.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   */
  public suspend fun enterpriseTeamsGetWithResponse(
    enterprise: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamsGetResponse> = executor.executeWithResponse<Unit, EnterpriseTeamsGetResponse>(SdkExecutionRequest(enterpriseTeamsGetMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
  }), EnterpriseTeamsCodecs.enterpriseTeamsGetRequestCodecRegistry, EnterpriseTeamsGetResponseDecoder, options)

  /**
   * List all teams in the enterprise for the authenticated user
   *
   * @param enterprise The slug version of the enterprise name.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   * @return Buffered response body.
   * @throws EnterpriseTeamsListApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded EnterpriseTeamsListError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamsList(
    enterprise: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): List<EnterpriseTeam> = executor.executeWithTypedErrors<Unit, EnterpriseTeamsListResponse, List<EnterpriseTeam>>(
    request = SdkExecutionRequest(enterpriseTeamsListMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = EnterpriseTeamsCodecs.enterpriseTeamsListRequestCodecRegistry,
    responseDecoder = EnterpriseTeamsListResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is EnterpriseTeamsListResponse.SuccessJson -> response.json
        is EnterpriseTeamsListResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is EnterpriseTeamsListResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is EnterpriseTeamsListResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is EnterpriseTeamsListResponse.Http403Json -> EnterpriseTeamsListApiException(response, statusCode, headers)
        is EnterpriseTeamsListResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all teams in the enterprise for the authenticated user
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param enterprise The slug version of the enterprise name.
   * @param page The page number of the results to fetch. For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param perPage The number of results per page (max 100). For more information, see "[Using pagination in the REST
   * API](https://docs.github.com/rest/using-the-rest-api/using-pagination-in-the-rest-api)."
   * @param options Execution options.
   */
  public suspend fun enterpriseTeamsListWithResponse(
    enterprise: String,
    page: Int? = null,
    perPage: Int? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamsListResponse> = executor.executeWithResponse<Unit, EnterpriseTeamsListResponse>(SdkExecutionRequest(enterpriseTeamsListMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "page", values = page?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "per_page", values = perPage?.let { listOf(it.toString()) }.orEmpty()))
  }), EnterpriseTeamsCodecs.enterpriseTeamsListRequestCodecRegistry, EnterpriseTeamsListResponseDecoder, options)

  /**
   * To edit a team, the authenticated user must be an enterprise owner.
   *
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws EnterpriseTeamsUpdateApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded EnterpriseTeamsUpdateError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun enterpriseTeamsUpdate(
    request: InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc,
    enterprise: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): EnterpriseTeam = executor.executeWithTypedErrors<InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc, EnterpriseTeamsUpdateResponse, EnterpriseTeam>(
    request = SdkExecutionRequest(enterpriseTeamsUpdateMetadata, baseUri, request, listOf(EnterpriseTeamsCodecs.ENTERPRISETEAMSUPDATE_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
    }),
    requestCodecs = EnterpriseTeamsCodecs.enterpriseTeamsUpdateRequestCodecRegistry,
    responseDecoder = EnterpriseTeamsUpdateResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is EnterpriseTeamsUpdateResponse.SuccessJson -> response.json
        is EnterpriseTeamsUpdateResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is EnterpriseTeamsUpdateResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is EnterpriseTeamsUpdateResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is EnterpriseTeamsUpdateResponse.Http403Json -> EnterpriseTeamsUpdateApiException(response, statusCode, headers)
        is EnterpriseTeamsUpdateResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * To edit a team, the authenticated user must be an enterprise owner.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param enterprise The slug version of the enterprise name.
   * @param teamSlug The slug of the team name.
   * @param options Execution options.
   */
  public suspend fun enterpriseTeamsUpdateWithResponse(
    request: InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc,
    enterprise: String,
    teamSlug: String,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<EnterpriseTeamsUpdateResponse> = executor.executeWithResponse<InlineEnterprisesTeamsPatchRequestJsonXe1ba10dc, EnterpriseTeamsUpdateResponse>(SdkExecutionRequest(enterpriseTeamsUpdateMetadata, baseUri, request, listOf(EnterpriseTeamsCodecs.ENTERPRISETEAMSUPDATE_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "enterprise", values = listOf(enterprise.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "team_slug", values = listOf(teamSlug.toString())))
  }), EnterpriseTeamsCodecs.enterpriseTeamsUpdateRequestCodecRegistry, EnterpriseTeamsUpdateResponseDecoder, options)

  /**
   * Typed response alternatives for `enterprise-teams/create`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface EnterpriseTeamsCreateResponse {
    public class SuccessJson(
      public val json: EnterpriseTeam,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsCreateResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsCreateResponse
  }

  private object EnterpriseTeamsCreateResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamsCreateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamsCreateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamsCreateResponse> = when {
      alternative.id == "enterprise-teams/create.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamsCreateResponse.SuccessJson(
          json = EnterpriseTeamsCodecs.enterpriseTeamsCreateResponseCodecAlternative0Registry.select(listOf("enterprise-teams/create.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamsCreateResponse = EnterpriseTeamsCreateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `enterprise-teams/delete` may expose through its typed API
   * exception.
   */
  public sealed interface EnterpriseTeamsDeleteError

  /**
   * Typed response alternatives for `enterprise-teams/delete`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface EnterpriseTeamsDeleteResponse {
    public class SuccessNoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsDeleteResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsDeleteResponse,
        EnterpriseTeamsDeleteError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsDeleteResponse
  }

  /**
   * Raised by `enterprise-teams/delete` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class EnterpriseTeamsDeleteApiException(
    public val error: EnterpriseTeamsDeleteError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "enterprise-teams/delete")

  private object EnterpriseTeamsDeleteResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamsDeleteResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamsDeleteResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamsDeleteResponse> = when {
      alternative.id == "enterprise-teams/delete.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamsDeleteResponse.SuccessNoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "enterprise-teams/delete.response.alternative1" -> SdkResponseDecodeResult(
        value = EnterpriseTeamsDeleteResponse.Http403Json(
          json = EnterpriseTeamsCodecs.enterpriseTeamsDeleteResponseCodecAlternative1Registry.select(listOf("enterprise-teams/delete.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamsDeleteResponse = EnterpriseTeamsDeleteResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `enterprise-teams/get` may expose through its typed API exception.
   */
  public sealed interface EnterpriseTeamsGetError

  /**
   * Typed response alternatives for `enterprise-teams/get`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface EnterpriseTeamsGetResponse {
    public class SuccessJson(
      public val json: EnterpriseTeam,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsGetResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsGetResponse,
        EnterpriseTeamsGetError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsGetResponse
  }

  /**
   * Raised by `enterprise-teams/get` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class EnterpriseTeamsGetApiException(
    public val error: EnterpriseTeamsGetError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "enterprise-teams/get")

  private object EnterpriseTeamsGetResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamsGetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamsGetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamsGetResponse> = when {
      alternative.id == "enterprise-teams/get.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamsGetResponse.SuccessJson(
          json = EnterpriseTeamsCodecs.enterpriseTeamsGetResponseCodecAlternative0Registry.select(listOf("enterprise-teams/get.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "enterprise-teams/get.response.alternative1" -> SdkResponseDecodeResult(
        value = EnterpriseTeamsGetResponse.Http403Json(
          json = EnterpriseTeamsCodecs.enterpriseTeamsGetResponseCodecAlternative1Registry.select(listOf("enterprise-teams/get.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamsGetResponse = EnterpriseTeamsGetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `enterprise-teams/list` may expose through its typed API exception.
   */
  public sealed interface EnterpriseTeamsListError

  /**
   * Typed response alternatives for `enterprise-teams/list`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface EnterpriseTeamsListResponse {
    public class SuccessJson(
      public val json: List<EnterpriseTeam>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsListResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsListResponse,
        EnterpriseTeamsListError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsListResponse
  }

  /**
   * Raised by `enterprise-teams/list` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class EnterpriseTeamsListApiException(
    public val error: EnterpriseTeamsListError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "enterprise-teams/list")

  private object EnterpriseTeamsListResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamsListResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamsListResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamsListResponse> = when {
      alternative.id == "enterprise-teams/list.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamsListResponse.SuccessJson(
          json = EnterpriseTeamsCodecs.enterpriseTeamsListResponseCodecAlternative0Registry.select(listOf("enterprise-teams/list.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "enterprise-teams/list.response.alternative1" -> SdkResponseDecodeResult(
        value = EnterpriseTeamsListResponse.Http403Json(
          json = EnterpriseTeamsCodecs.enterpriseTeamsListResponseCodecAlternative1Registry.select(listOf("enterprise-teams/list.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamsListResponse = EnterpriseTeamsListResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `enterprise-teams/update` may expose through its typed API
   * exception.
   */
  public sealed interface EnterpriseTeamsUpdateError

  /**
   * Typed response alternatives for `enterprise-teams/update`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface EnterpriseTeamsUpdateResponse {
    public class SuccessJson(
      public val json: EnterpriseTeam,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsUpdateResponse

    public class Http403Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsUpdateResponse,
        EnterpriseTeamsUpdateError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EnterpriseTeamsUpdateResponse
  }

  /**
   * Raised by `enterprise-teams/update` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class EnterpriseTeamsUpdateApiException(
    public val error: EnterpriseTeamsUpdateError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "enterprise-teams/update")

  private object EnterpriseTeamsUpdateResponseDecoder : SdkResponseAlternativeDecoder<EnterpriseTeamsUpdateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EnterpriseTeamsUpdateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EnterpriseTeamsUpdateResponse> = when {
      alternative.id == "enterprise-teams/update.response.alternative0" -> SdkResponseDecodeResult(
        value = EnterpriseTeamsUpdateResponse.SuccessJson(
          json = EnterpriseTeamsCodecs.enterpriseTeamsUpdateResponseCodecAlternative0Registry.select(listOf("enterprise-teams/update.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "enterprise-teams/update.response.alternative1" -> SdkResponseDecodeResult(
        value = EnterpriseTeamsUpdateResponse.Http403Json(
          json = EnterpriseTeamsCodecs.enterpriseTeamsUpdateResponseCodecAlternative1Registry.select(listOf("enterprise-teams/update.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): EnterpriseTeamsUpdateResponse = EnterpriseTeamsUpdateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val enterpriseTeamsCreateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "enterprise-teams/create",
          method = "POST",
          path = "/enterprises/{enterprise}/teams",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "EnterpriseTeam",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-teams/create.response.alternative0",
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

    public val enterpriseTeamsDeleteMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "enterprise-teams/delete",
          method = "DELETE",
          path = "/enterprises/{enterprise}/teams/{team_slug}",
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
              id = "enterprise-teams/delete.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-teams/delete.response.alternative1",
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

    public val enterpriseTeamsGetMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "enterprise-teams/get",
          method = "GET",
          path = "/enterprises/{enterprise}/teams/{team_slug}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "EnterpriseTeam",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-teams/get.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-teams/get.response.alternative1",
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

    public val enterpriseTeamsListMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "enterprise-teams/list",
          method = "GET",
          path = "/enterprises/{enterprise}/teams",
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
              id = "enterprise-teams/list.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-teams/list.response.alternative1",
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

    public val enterpriseTeamsUpdateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "enterprise-teams/update",
          method = "PATCH",
          path = "/enterprises/{enterprise}/teams/{team_slug}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "EnterpriseTeam",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-teams/update.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "enterprise-teams/update.response.alternative1",
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
