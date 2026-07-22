package com.nabobery.sdkgen.generated.observability

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.ConflictResponse
import com.nabobery.sdkgen.generated.CreateObservabilityDestinationRequest
import com.nabobery.sdkgen.generated.CreateObservabilityDestinationResponse
import com.nabobery.sdkgen.generated.DeleteObservabilityDestinationResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.GetObservabilityDestinationResponse
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.ListObservabilityDestinationsResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.UnauthorizedResponse
import com.nabobery.sdkgen.generated.UpdateObservabilityDestinationRequest
import com.nabobery.sdkgen.generated.UpdateObservabilityDestinationResponse
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
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public object ObservabilityCodecs {
  public const val CREATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID: String =
      "createObservabilityDestination.request"

  private val createObservabilityDestinationRequestCodec:
      MediaTypeCodec<CreateObservabilityDestinationRequest> =
      KotlinxSerializationCodec(CREATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID, CreateObservabilityDestinationRequest
        .Serializer, SdkJson)

  public const val CREATEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID: String =
      "createObservabilityDestination.response"

  private val createObservabilityDestinationResponseCodec:
      MediaTypeCodec<CreateObservabilityDestinationResponse> =
      KotlinxSerializationCodec(CREATEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID,
        CreateObservabilityDestinationResponse.Serializer, SdkJson)

  private val createObservabilityDestinationResponseCodecAlternative0Codec:
      MediaTypeCodec<CreateObservabilityDestinationResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative0",
        CreateObservabilityDestinationResponse.Serializer, SdkJson)

  public val createObservabilityDestinationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreateObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative0Codec)

  private val createObservabilityDestinationResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative1", BadRequestResponse.Serializer,
        SdkJson)

  public val createObservabilityDestinationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative1Codec)

  private val createObservabilityDestinationResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative2", UnauthorizedResponse
        .Serializer, SdkJson)

  public val createObservabilityDestinationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative2Codec)

  private val createObservabilityDestinationResponseCodecAlternative3Codec:
      MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative3", ForbiddenResponse.Serializer,
        SdkJson)

  public val createObservabilityDestinationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative3Codec)

  private val createObservabilityDestinationResponseCodecAlternative4Codec:
      MediaTypeCodec<ConflictResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative4", ConflictResponse.Serializer,
        SdkJson)

  public val createObservabilityDestinationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative4Codec)

  private val createObservabilityDestinationResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative5", InternalServerResponse
        .Serializer, SdkJson)

  public val createObservabilityDestinationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative5Codec)

  public val createObservabilityDestinationRequestCodecRegistry:
      MediaTypeCodecRegistry<CreateObservabilityDestinationRequest> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationRequestCodec)

  public val createObservabilityDestinationResponseCodecRegistry:
      MediaTypeCodecRegistry<CreateObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodec)

  public const val DELETEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID: String =
      "deleteObservabilityDestination.response"

  private val deleteObservabilityDestinationResponseCodec:
      MediaTypeCodec<DeleteObservabilityDestinationResponse> =
      KotlinxSerializationCodec(DELETEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID,
        DeleteObservabilityDestinationResponse.Serializer, SdkJson)

  private val deleteObservabilityDestinationResponseCodecAlternative0Codec:
      MediaTypeCodec<DeleteObservabilityDestinationResponse> =
      KotlinxSerializationCodec("deleteObservabilityDestination.response.alternative0",
        DeleteObservabilityDestinationResponse.Serializer, SdkJson)

  public val deleteObservabilityDestinationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeleteObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(deleteObservabilityDestinationResponseCodecAlternative0Codec)

  private val deleteObservabilityDestinationResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteObservabilityDestination.response.alternative1", UnauthorizedResponse
        .Serializer, SdkJson)

  public val deleteObservabilityDestinationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteObservabilityDestinationResponseCodecAlternative1Codec)

  private val deleteObservabilityDestinationResponseCodecAlternative2Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("deleteObservabilityDestination.response.alternative2", NotFoundResponse.Serializer,
        SdkJson)

  public val deleteObservabilityDestinationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(deleteObservabilityDestinationResponseCodecAlternative2Codec)

  private val deleteObservabilityDestinationResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("deleteObservabilityDestination.response.alternative3", InternalServerResponse
        .Serializer, SdkJson)

  public val deleteObservabilityDestinationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteObservabilityDestinationResponseCodecAlternative3Codec)

  public val deleteObservabilityDestinationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val deleteObservabilityDestinationResponseCodecRegistry:
      MediaTypeCodecRegistry<DeleteObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(deleteObservabilityDestinationResponseCodec)

  public const val GETOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID: String =
      "getObservabilityDestination.response"

  private val getObservabilityDestinationResponseCodec:
      MediaTypeCodec<GetObservabilityDestinationResponse> =
      KotlinxSerializationCodec(GETOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID, GetObservabilityDestinationResponse
        .Serializer, SdkJson)

  private val getObservabilityDestinationResponseCodecAlternative0Codec:
      MediaTypeCodec<GetObservabilityDestinationResponse> =
      KotlinxSerializationCodec("getObservabilityDestination.response.alternative0",
        GetObservabilityDestinationResponse.Serializer, SdkJson)

  public val getObservabilityDestinationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GetObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(getObservabilityDestinationResponseCodecAlternative0Codec)

  private val getObservabilityDestinationResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getObservabilityDestination.response.alternative1", UnauthorizedResponse.Serializer,
        SdkJson)

  public val getObservabilityDestinationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getObservabilityDestinationResponseCodecAlternative1Codec)

  private val getObservabilityDestinationResponseCodecAlternative2Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getObservabilityDestination.response.alternative2", NotFoundResponse.Serializer,
        SdkJson)

  public val getObservabilityDestinationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getObservabilityDestinationResponseCodecAlternative2Codec)

  private val getObservabilityDestinationResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getObservabilityDestination.response.alternative3", InternalServerResponse.Serializer,
        SdkJson)

  public val getObservabilityDestinationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getObservabilityDestinationResponseCodecAlternative3Codec)

  public val getObservabilityDestinationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getObservabilityDestinationResponseCodecRegistry:
      MediaTypeCodecRegistry<GetObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(getObservabilityDestinationResponseCodec)

  public const val LISTOBSERVABILITYDESTINATIONS_RESPONSE_CODEC_ID: String =
      "listObservabilityDestinations.response"

  private val listObservabilityDestinationsResponseCodec:
      MediaTypeCodec<ListObservabilityDestinationsResponse> =
      KotlinxSerializationCodec(LISTOBSERVABILITYDESTINATIONS_RESPONSE_CODEC_ID, ListObservabilityDestinationsResponse
        .Serializer, SdkJson)

  private val listObservabilityDestinationsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListObservabilityDestinationsResponse> =
      KotlinxSerializationCodec("listObservabilityDestinations.response.alternative0",
        ListObservabilityDestinationsResponse.Serializer, SdkJson)

  public val listObservabilityDestinationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListObservabilityDestinationsResponse> =
      MediaTypeCodecRegistry.of(listObservabilityDestinationsResponseCodecAlternative0Codec)

  private val listObservabilityDestinationsResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listObservabilityDestinations.response.alternative1", UnauthorizedResponse.Serializer,
        SdkJson)

  public val listObservabilityDestinationsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listObservabilityDestinationsResponseCodecAlternative1Codec)

  private val listObservabilityDestinationsResponseCodecAlternative2Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listObservabilityDestinations.response.alternative2", InternalServerResponse
        .Serializer, SdkJson)

  public val listObservabilityDestinationsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listObservabilityDestinationsResponseCodecAlternative2Codec)

  public val listObservabilityDestinationsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listObservabilityDestinationsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListObservabilityDestinationsResponse> =
      MediaTypeCodecRegistry.of(listObservabilityDestinationsResponseCodec)

  public const val UPDATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID: String =
      "updateObservabilityDestination.request"

  private val updateObservabilityDestinationRequestCodec:
      MediaTypeCodec<UpdateObservabilityDestinationRequest> =
      KotlinxSerializationCodec(UPDATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID, UpdateObservabilityDestinationRequest
        .Serializer, SdkJson)

  public const val UPDATEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID: String =
      "updateObservabilityDestination.response"

  private val updateObservabilityDestinationResponseCodec:
      MediaTypeCodec<UpdateObservabilityDestinationResponse> =
      KotlinxSerializationCodec(UPDATEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID,
        UpdateObservabilityDestinationResponse.Serializer, SdkJson)

  private val updateObservabilityDestinationResponseCodecAlternative0Codec:
      MediaTypeCodec<UpdateObservabilityDestinationResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative0",
        UpdateObservabilityDestinationResponse.Serializer, SdkJson)

  public val updateObservabilityDestinationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<UpdateObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative0Codec)

  private val updateObservabilityDestinationResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative1", BadRequestResponse.Serializer,
        SdkJson)

  public val updateObservabilityDestinationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative1Codec)

  private val updateObservabilityDestinationResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative2", UnauthorizedResponse
        .Serializer, SdkJson)

  public val updateObservabilityDestinationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative2Codec)

  private val updateObservabilityDestinationResponseCodecAlternative3Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative3", NotFoundResponse.Serializer,
        SdkJson)

  public val updateObservabilityDestinationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative3Codec)

  private val updateObservabilityDestinationResponseCodecAlternative4Codec:
      MediaTypeCodec<ConflictResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative4", ConflictResponse.Serializer,
        SdkJson)

  public val updateObservabilityDestinationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative4Codec)

  private val updateObservabilityDestinationResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative5", InternalServerResponse
        .Serializer, SdkJson)

  public val updateObservabilityDestinationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative5Codec)

  public val updateObservabilityDestinationRequestCodecRegistry:
      MediaTypeCodecRegistry<UpdateObservabilityDestinationRequest> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationRequestCodec)

  public val updateObservabilityDestinationResponseCodecRegistry:
      MediaTypeCodecRegistry<UpdateObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodec)
}

/**
 * Client for the 'Observability' group of OpenRouter API.
 */
public class ObservabilityClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "apiKey" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ObservabilityClient.authentication)

  /**
   * Create a new observability destination. A maximum of 5 destinations per type is allowed. Defaults to the
   * authenticated entity's default workspace; use the `workspace_id` body field to scope to a different workspace.
   * [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createObservabilityDestination(
    request: CreateObservabilityDestinationRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.CreateObservabilityDestinationResponse = executor
    .execute<CreateObservabilityDestinationRequest, com.nabobery.sdkgen.generated
      .CreateObservabilityDestinationResponse>(SdkExecutionRequest(createObservabilityDestinationMetadata, baseUri,
        request, listOf(ObservabilityCodecs.CREATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ObservabilityCodecs.CREATEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID), ObservabilityCodecs
    .createObservabilityDestinationRequestCodecRegistry, ObservabilityCodecs
      .createObservabilityDestinationResponseCodecRegistry, options)

  /**
   * Create a new observability destination. A maximum of 5 destinations per type is allowed. Defaults to the
   * authenticated entity's default workspace; use the `workspace_id` body field to scope to a different workspace.
   * [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun createObservabilityDestinationWithResponse(
    request: CreateObservabilityDestinationRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateObservabilityDestinationResponse> = executor
    .executeWithResponse<CreateObservabilityDestinationRequest,
      CreateObservabilityDestinationResponse>(SdkExecutionRequest(createObservabilityDestinationMetadata, baseUri,
        request, listOf(ObservabilityCodecs.CREATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ObservabilityCodecs.createObservabilityDestinationRequestCodecRegistry,
    CreateObservabilityDestinationResponseDecoder, options)

  /**
   * Delete an existing observability destination. This performs a soft delete. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun deleteObservabilityDestination(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.DeleteObservabilityDestinationResponse = executor.execute<Unit, com.nabobery.sdkgen
    .generated.DeleteObservabilityDestinationResponse>(SdkExecutionRequest(deleteObservabilityDestinationMetadata,
      baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ObservabilityCodecs.DELETEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID), ObservabilityCodecs
    .deleteObservabilityDestinationRequestCodecRegistry, ObservabilityCodecs
      .deleteObservabilityDestinationResponseCodecRegistry, options)

  /**
   * Delete an existing observability destination. This performs a soft delete. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun deleteObservabilityDestinationWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteObservabilityDestinationResponse> = executor.executeWithResponse<Unit,
    DeleteObservabilityDestinationResponse>(SdkExecutionRequest(deleteObservabilityDestinationMetadata, baseUri, Unit,
      emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ObservabilityCodecs.deleteObservabilityDestinationRequestCodecRegistry,
    DeleteObservabilityDestinationResponseDecoder, options)

  /**
   * Fetch a single observability destination by its UUID. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getObservabilityDestination(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.GetObservabilityDestinationResponse = executor.execute<Unit, com.nabobery.sdkgen
    .generated.GetObservabilityDestinationResponse>(SdkExecutionRequest(getObservabilityDestinationMetadata, baseUri,
      Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ObservabilityCodecs.GETOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID), ObservabilityCodecs
    .getObservabilityDestinationRequestCodecRegistry, ObservabilityCodecs
      .getObservabilityDestinationResponseCodecRegistry, options)

  /**
   * Fetch a single observability destination by its UUID. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getObservabilityDestinationWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetObservabilityDestinationResponse> = executor.executeWithResponse<Unit,
    GetObservabilityDestinationResponse>(SdkExecutionRequest(getObservabilityDestinationMetadata, baseUri, Unit,
      emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ObservabilityCodecs.getObservabilityDestinationRequestCodecRegistry, GetObservabilityDestinationResponseDecoder,
    options)

  /**
   * List the observability destinations configured for the authenticated entity's default workspace. Use the
   * `workspace_id` query parameter to scope the result to a different workspace. Only destinations with stable release
   * status are surfaced — destinations of other types are excluded. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listObservabilityDestinations(
    limit: Int? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.ListObservabilityDestinationsResponse = executor.execute<Unit, com.nabobery.sdkgen
    .generated.ListObservabilityDestinationsResponse>(SdkExecutionRequest(listObservabilityDestinationsMetadata,
      baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ObservabilityCodecs.LISTOBSERVABILITYDESTINATIONS_RESPONSE_CODEC_ID), ObservabilityCodecs
    .listObservabilityDestinationsRequestCodecRegistry, ObservabilityCodecs
      .listObservabilityDestinationsResponseCodecRegistry, options)

  /**
   * List the observability destinations configured for the authenticated entity's default workspace. Use the
   * `workspace_id` query parameter to scope the result to a different workspace. Only destinations with stable release
   * status are surfaced — destinations of other types are excluded. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listObservabilityDestinationsWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListObservabilityDestinationsResponse> = executor.executeWithResponse<Unit,
    ListObservabilityDestinationsResponse>(SdkExecutionRequest(listObservabilityDestinationsMetadata, baseUri, Unit,
      emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ObservabilityCodecs.listObservabilityDestinationsRequestCodecRegistry,
    ListObservabilityDestinationsResponseDecoder, options)

  /**
   * Update an existing observability destination. Only the fields provided in the request body are updated. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun updateObservabilityDestination(
    request: UpdateObservabilityDestinationRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.UpdateObservabilityDestinationResponse = executor
    .execute<UpdateObservabilityDestinationRequest, com.nabobery.sdkgen.generated
      .UpdateObservabilityDestinationResponse>(SdkExecutionRequest(updateObservabilityDestinationMetadata, baseUri,
        request, listOf(ObservabilityCodecs.UPDATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ObservabilityCodecs.UPDATEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID), ObservabilityCodecs
    .updateObservabilityDestinationRequestCodecRegistry, ObservabilityCodecs
      .updateObservabilityDestinationResponseCodecRegistry, options)

  /**
   * Update an existing observability destination. Only the fields provided in the request body are updated. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun updateObservabilityDestinationWithResponse(
    request: UpdateObservabilityDestinationRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UpdateObservabilityDestinationResponse> = executor
    .executeWithResponse<UpdateObservabilityDestinationRequest,
      UpdateObservabilityDestinationResponse>(SdkExecutionRequest(updateObservabilityDestinationMetadata, baseUri,
        request, listOf(ObservabilityCodecs.UPDATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ObservabilityCodecs.updateObservabilityDestinationRequestCodecRegistry,
    UpdateObservabilityDestinationResponseDecoder, options)

  /**
   * Typed response alternatives for `createObservabilityDestination`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CreateObservabilityDestinationResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.CreateObservabilityDestinationResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse
  }

  private object CreateObservabilityDestinationResponseDecoder : SdkResponseAlternativeDecoder<CreateObservabilityDestinationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateObservabilityDestinationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateObservabilityDestinationResponse> = when {
      alternative.id == "createObservabilityDestination.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateObservabilityDestinationResponse.SuccessJson(
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative0Registry
            .select(listOf("createObservabilityDestination.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createObservabilityDestination.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateObservabilityDestinationResponse.Http400Json(
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative1Registry
            .select(listOf("createObservabilityDestination.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createObservabilityDestination.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateObservabilityDestinationResponse.Http401Json(
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative2Registry
            .select(listOf("createObservabilityDestination.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createObservabilityDestination.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateObservabilityDestinationResponse.Http403Json(
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative3Registry
            .select(listOf("createObservabilityDestination.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createObservabilityDestination.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateObservabilityDestinationResponse.Http409Json(
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative4Registry
            .select(listOf("createObservabilityDestination.response.alternative4"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createObservabilityDestination.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateObservabilityDestinationResponse.Http500Json(
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative5Registry
            .select(listOf("createObservabilityDestination.response.alternative5"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): CreateObservabilityDestinationResponse = CreateObservabilityDestinationResponse.Unknown(statusCode = statusCode,
      headers = headers)
  }

  /**
   * Typed response alternatives for `deleteObservabilityDestination`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface DeleteObservabilityDestinationResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.DeleteObservabilityDestinationResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteObservabilityDestinationResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteObservabilityDestinationResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteObservabilityDestinationResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteObservabilityDestinationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteObservabilityDestinationResponse
  }

  private object DeleteObservabilityDestinationResponseDecoder : SdkResponseAlternativeDecoder<DeleteObservabilityDestinationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): DeleteObservabilityDestinationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<DeleteObservabilityDestinationResponse> = when {
      alternative.id == "deleteObservabilityDestination.response.alternative0" -> SdkResponseDecodeResult(
        value = DeleteObservabilityDestinationResponse.SuccessJson(
          json = ObservabilityCodecs.deleteObservabilityDestinationResponseCodecAlternative0Registry
            .select(listOf("deleteObservabilityDestination.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteObservabilityDestination.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteObservabilityDestinationResponse.Http401Json(
          json = ObservabilityCodecs.deleteObservabilityDestinationResponseCodecAlternative1Registry
            .select(listOf("deleteObservabilityDestination.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteObservabilityDestination.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteObservabilityDestinationResponse.Http404Json(
          json = ObservabilityCodecs.deleteObservabilityDestinationResponseCodecAlternative2Registry
            .select(listOf("deleteObservabilityDestination.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteObservabilityDestination.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteObservabilityDestinationResponse.Http500Json(
          json = ObservabilityCodecs.deleteObservabilityDestinationResponseCodecAlternative3Registry
            .select(listOf("deleteObservabilityDestination.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): DeleteObservabilityDestinationResponse = DeleteObservabilityDestinationResponse.Unknown(statusCode = statusCode,
      headers = headers)
  }

  /**
   * Typed response alternatives for `getObservabilityDestination`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GetObservabilityDestinationResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.GetObservabilityDestinationResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetObservabilityDestinationResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetObservabilityDestinationResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetObservabilityDestinationResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetObservabilityDestinationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetObservabilityDestinationResponse
  }

  private object GetObservabilityDestinationResponseDecoder : SdkResponseAlternativeDecoder<GetObservabilityDestinationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetObservabilityDestinationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetObservabilityDestinationResponse> = when {
      alternative.id == "getObservabilityDestination.response.alternative0" -> SdkResponseDecodeResult(
        value = GetObservabilityDestinationResponse.SuccessJson(
          json = ObservabilityCodecs.getObservabilityDestinationResponseCodecAlternative0Registry
            .select(listOf("getObservabilityDestination.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getObservabilityDestination.response.alternative1" -> SdkResponseDecodeResult(
        value = GetObservabilityDestinationResponse.Http401Json(
          json = ObservabilityCodecs.getObservabilityDestinationResponseCodecAlternative1Registry
            .select(listOf("getObservabilityDestination.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getObservabilityDestination.response.alternative2" -> SdkResponseDecodeResult(
        value = GetObservabilityDestinationResponse.Http404Json(
          json = ObservabilityCodecs.getObservabilityDestinationResponseCodecAlternative2Registry
            .select(listOf("getObservabilityDestination.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getObservabilityDestination.response.alternative3" -> SdkResponseDecodeResult(
        value = GetObservabilityDestinationResponse.Http500Json(
          json = ObservabilityCodecs.getObservabilityDestinationResponseCodecAlternative3Registry
            .select(listOf("getObservabilityDestination.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): GetObservabilityDestinationResponse = GetObservabilityDestinationResponse.Unknown(statusCode = statusCode,
      headers = headers)
  }

  /**
   * Typed response alternatives for `listObservabilityDestinations`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface ListObservabilityDestinationsResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.ListObservabilityDestinationsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListObservabilityDestinationsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListObservabilityDestinationsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListObservabilityDestinationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListObservabilityDestinationsResponse
  }

  private object ListObservabilityDestinationsResponseDecoder : SdkResponseAlternativeDecoder<ListObservabilityDestinationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListObservabilityDestinationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListObservabilityDestinationsResponse> = when {
      alternative.id == "listObservabilityDestinations.response.alternative0" -> SdkResponseDecodeResult(
        value = ListObservabilityDestinationsResponse.SuccessJson(
          json = ObservabilityCodecs.listObservabilityDestinationsResponseCodecAlternative0Registry
            .select(listOf("listObservabilityDestinations.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listObservabilityDestinations.response.alternative1" -> SdkResponseDecodeResult(
        value = ListObservabilityDestinationsResponse.Http401Json(
          json = ObservabilityCodecs.listObservabilityDestinationsResponseCodecAlternative1Registry
            .select(listOf("listObservabilityDestinations.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listObservabilityDestinations.response.alternative2" -> SdkResponseDecodeResult(
        value = ListObservabilityDestinationsResponse.Http500Json(
          json = ObservabilityCodecs.listObservabilityDestinationsResponseCodecAlternative2Registry
            .select(listOf("listObservabilityDestinations.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): ListObservabilityDestinationsResponse = ListObservabilityDestinationsResponse.Unknown(statusCode = statusCode,
      headers = headers)
  }

  /**
   * Typed response alternatives for `updateObservabilityDestination`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface UpdateObservabilityDestinationResponse {
    public class SuccessJson(
      public val json: com.nabobery.sdkgen.generated.UpdateObservabilityDestinationResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse
  }

  private object UpdateObservabilityDestinationResponseDecoder : SdkResponseAlternativeDecoder<UpdateObservabilityDestinationResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): UpdateObservabilityDestinationResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<UpdateObservabilityDestinationResponse> = when {
      alternative.id == "updateObservabilityDestination.response.alternative0" -> SdkResponseDecodeResult(
        value = UpdateObservabilityDestinationResponse.SuccessJson(
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative0Registry
            .select(listOf("updateObservabilityDestination.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateObservabilityDestination.response.alternative1" -> SdkResponseDecodeResult(
        value = UpdateObservabilityDestinationResponse.Http400Json(
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative1Registry
            .select(listOf("updateObservabilityDestination.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateObservabilityDestination.response.alternative2" -> SdkResponseDecodeResult(
        value = UpdateObservabilityDestinationResponse.Http401Json(
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative2Registry
            .select(listOf("updateObservabilityDestination.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateObservabilityDestination.response.alternative3" -> SdkResponseDecodeResult(
        value = UpdateObservabilityDestinationResponse.Http404Json(
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative3Registry
            .select(listOf("updateObservabilityDestination.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateObservabilityDestination.response.alternative4" -> SdkResponseDecodeResult(
        value = UpdateObservabilityDestinationResponse.Http409Json(
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative4Registry
            .select(listOf("updateObservabilityDestination.response.alternative4"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateObservabilityDestination.response.alternative5" -> SdkResponseDecodeResult(
        value = UpdateObservabilityDestinationResponse.Http500Json(
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative5Registry
            .select(listOf("updateObservabilityDestination.response.alternative5"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): UpdateObservabilityDestinationResponse = UpdateObservabilityDestinationResponse.Unknown(statusCode = statusCode,
      headers = headers)
  }

  public companion object {
    public val createObservabilityDestinationMetadata: OperationMetadata = OperationMetadata(
          operationId = "createObservabilityDestination",
          method = "POST",
          path = "/observability/destinations",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(201),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 201),
              mediaTypes = listOf("application/json"),
              typeTag = "CreateObservabilityDestinationResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createObservabilityDestination.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createObservabilityDestination.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createObservabilityDestination.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createObservabilityDestination.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "ConflictResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createObservabilityDestination.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createObservabilityDestination.response.alternative5",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
            )),
          ),
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

    public val deleteObservabilityDestinationMetadata: OperationMetadata = OperationMetadata(
          operationId = "deleteObservabilityDestination",
          method = "DELETE",
          path = "/observability/destinations/{id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "DeleteObservabilityDestinationResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteObservabilityDestination.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteObservabilityDestination.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteObservabilityDestination.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "deleteObservabilityDestination.response.alternative3",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
            )),
          ),
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

    public val getObservabilityDestinationMetadata: OperationMetadata = OperationMetadata(
          operationId = "getObservabilityDestination",
          method = "GET",
          path = "/observability/destinations/{id}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GetObservabilityDestinationResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getObservabilityDestination.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getObservabilityDestination.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getObservabilityDestination.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getObservabilityDestination.response.alternative3",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
            )),
          ),
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

    public val listObservabilityDestinationsMetadata: OperationMetadata = OperationMetadata(
          operationId = "listObservabilityDestinations",
          method = "GET",
          path = "/observability/destinations",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ListObservabilityDestinationsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listObservabilityDestinations.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listObservabilityDestinations.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listObservabilityDestinations.response.alternative2",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
            )),
          ),
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

    public val updateObservabilityDestinationMetadata: OperationMetadata = OperationMetadata(
          operationId = "updateObservabilityDestination",
          method = "PATCH",
          path = "/observability/destinations/{id}",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "UpdateObservabilityDestinationResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateObservabilityDestination.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateObservabilityDestination.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateObservabilityDestination.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateObservabilityDestination.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 409),
              mediaTypes = listOf("application/json"),
              typeTag = "ConflictResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateObservabilityDestination.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "updateObservabilityDestination.response.alternative5",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
            )),
          ),
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
