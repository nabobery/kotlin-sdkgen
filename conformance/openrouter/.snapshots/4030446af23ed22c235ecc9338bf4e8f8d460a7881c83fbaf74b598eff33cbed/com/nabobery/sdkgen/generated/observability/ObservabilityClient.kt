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
import com.nabobery.sdkgen.runtime.SecurityRequirement
import com.nabobery.sdkgen.runtime.SecuritySchemeRef
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

internal object ObservabilityCodecs {
  internal const val CREATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID: String =
      "createObservabilityDestination.request"

  private val createObservabilityDestinationRequestCodec:
      MediaTypeCodec<CreateObservabilityDestinationRequest> =
      KotlinxSerializationCodec(CREATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID, CreateObservabilityDestinationRequest.Serializer, SdkJson)

  internal const val CREATEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID: String =
      "createObservabilityDestination.response"

  private val createObservabilityDestinationResponseCodec:
      MediaTypeCodec<CreateObservabilityDestinationResponse> =
      KotlinxSerializationCodec(CREATEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID, CreateObservabilityDestinationResponse.Serializer, SdkJson)

  private val createObservabilityDestinationResponseCodecAlternative0Codec:
      MediaTypeCodec<CreateObservabilityDestinationResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative0", CreateObservabilityDestinationResponse.Serializer, SdkJson)

  internal val createObservabilityDestinationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CreateObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative0Codec)

  private val createObservabilityDestinationResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createObservabilityDestinationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative1Codec)

  private val createObservabilityDestinationResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createObservabilityDestinationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative2Codec)

  private val createObservabilityDestinationResponseCodecAlternative3Codec:
      MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val createObservabilityDestinationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative3Codec)

  private val createObservabilityDestinationResponseCodecAlternative4Codec:
      MediaTypeCodec<ConflictResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative4", ConflictResponse.Serializer, SdkJson)

  internal val createObservabilityDestinationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative4Codec)

  private val createObservabilityDestinationResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createObservabilityDestination.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val createObservabilityDestinationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodecAlternative5Codec)

  internal val createObservabilityDestinationRequestCodecRegistry:
      MediaTypeCodecRegistry<CreateObservabilityDestinationRequest> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationRequestCodec)

  internal val createObservabilityDestinationResponseCodecRegistry:
      MediaTypeCodecRegistry<CreateObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(createObservabilityDestinationResponseCodec)

  internal const val DELETEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID: String =
      "deleteObservabilityDestination.response"

  private val deleteObservabilityDestinationResponseCodec:
      MediaTypeCodec<DeleteObservabilityDestinationResponse> =
      KotlinxSerializationCodec(DELETEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID, DeleteObservabilityDestinationResponse.Serializer, SdkJson)

  private val deleteObservabilityDestinationResponseCodecAlternative0Codec:
      MediaTypeCodec<DeleteObservabilityDestinationResponse> =
      KotlinxSerializationCodec("deleteObservabilityDestination.response.alternative0", DeleteObservabilityDestinationResponse.Serializer, SdkJson)

  internal val deleteObservabilityDestinationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<DeleteObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(deleteObservabilityDestinationResponseCodecAlternative0Codec)

  private val deleteObservabilityDestinationResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("deleteObservabilityDestination.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val deleteObservabilityDestinationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(deleteObservabilityDestinationResponseCodecAlternative1Codec)

  private val deleteObservabilityDestinationResponseCodecAlternative2Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("deleteObservabilityDestination.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val deleteObservabilityDestinationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(deleteObservabilityDestinationResponseCodecAlternative2Codec)

  private val deleteObservabilityDestinationResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("deleteObservabilityDestination.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val deleteObservabilityDestinationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(deleteObservabilityDestinationResponseCodecAlternative3Codec)

  internal val deleteObservabilityDestinationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val deleteObservabilityDestinationResponseCodecRegistry:
      MediaTypeCodecRegistry<DeleteObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(deleteObservabilityDestinationResponseCodec)

  internal const val GETOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID: String =
      "getObservabilityDestination.response"

  private val getObservabilityDestinationResponseCodec:
      MediaTypeCodec<GetObservabilityDestinationResponse> =
      KotlinxSerializationCodec(GETOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID, GetObservabilityDestinationResponse.Serializer, SdkJson)

  private val getObservabilityDestinationResponseCodecAlternative0Codec:
      MediaTypeCodec<GetObservabilityDestinationResponse> =
      KotlinxSerializationCodec("getObservabilityDestination.response.alternative0", GetObservabilityDestinationResponse.Serializer, SdkJson)

  internal val getObservabilityDestinationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GetObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(getObservabilityDestinationResponseCodecAlternative0Codec)

  private val getObservabilityDestinationResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getObservabilityDestination.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val getObservabilityDestinationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getObservabilityDestinationResponseCodecAlternative1Codec)

  private val getObservabilityDestinationResponseCodecAlternative2Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getObservabilityDestination.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val getObservabilityDestinationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getObservabilityDestinationResponseCodecAlternative2Codec)

  private val getObservabilityDestinationResponseCodecAlternative3Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getObservabilityDestination.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val getObservabilityDestinationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getObservabilityDestinationResponseCodecAlternative3Codec)

  internal val getObservabilityDestinationRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getObservabilityDestinationResponseCodecRegistry:
      MediaTypeCodecRegistry<GetObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(getObservabilityDestinationResponseCodec)

  internal const val LISTOBSERVABILITYDESTINATIONS_RESPONSE_CODEC_ID: String =
      "listObservabilityDestinations.response"

  private val listObservabilityDestinationsResponseCodec:
      MediaTypeCodec<ListObservabilityDestinationsResponse> =
      KotlinxSerializationCodec(LISTOBSERVABILITYDESTINATIONS_RESPONSE_CODEC_ID, ListObservabilityDestinationsResponse.Serializer, SdkJson)

  private val listObservabilityDestinationsResponseCodecAlternative0Codec:
      MediaTypeCodec<ListObservabilityDestinationsResponse> =
      KotlinxSerializationCodec("listObservabilityDestinations.response.alternative0", ListObservabilityDestinationsResponse.Serializer, SdkJson)

  internal val listObservabilityDestinationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ListObservabilityDestinationsResponse> =
      MediaTypeCodecRegistry.of(listObservabilityDestinationsResponseCodecAlternative0Codec)

  private val listObservabilityDestinationsResponseCodecAlternative1Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listObservabilityDestinations.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listObservabilityDestinationsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listObservabilityDestinationsResponseCodecAlternative1Codec)

  private val listObservabilityDestinationsResponseCodecAlternative2Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listObservabilityDestinations.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  internal val listObservabilityDestinationsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listObservabilityDestinationsResponseCodecAlternative2Codec)

  internal val listObservabilityDestinationsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listObservabilityDestinationsResponseCodecRegistry:
      MediaTypeCodecRegistry<ListObservabilityDestinationsResponse> =
      MediaTypeCodecRegistry.of(listObservabilityDestinationsResponseCodec)

  internal const val UPDATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID: String =
      "updateObservabilityDestination.request"

  private val updateObservabilityDestinationRequestCodec:
      MediaTypeCodec<UpdateObservabilityDestinationRequest> =
      KotlinxSerializationCodec(UPDATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID, UpdateObservabilityDestinationRequest.Serializer, SdkJson)

  internal const val UPDATEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID: String =
      "updateObservabilityDestination.response"

  private val updateObservabilityDestinationResponseCodec:
      MediaTypeCodec<UpdateObservabilityDestinationResponse> =
      KotlinxSerializationCodec(UPDATEOBSERVABILITYDESTINATION_RESPONSE_CODEC_ID, UpdateObservabilityDestinationResponse.Serializer, SdkJson)

  private val updateObservabilityDestinationResponseCodecAlternative0Codec:
      MediaTypeCodec<UpdateObservabilityDestinationResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative0", UpdateObservabilityDestinationResponse.Serializer, SdkJson)

  internal val updateObservabilityDestinationResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<UpdateObservabilityDestinationResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative0Codec)

  private val updateObservabilityDestinationResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val updateObservabilityDestinationResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative1Codec)

  private val updateObservabilityDestinationResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val updateObservabilityDestinationResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative2Codec)

  private val updateObservabilityDestinationResponseCodecAlternative3Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative3", NotFoundResponse.Serializer, SdkJson)

  internal val updateObservabilityDestinationResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative3Codec)

  private val updateObservabilityDestinationResponseCodecAlternative4Codec:
      MediaTypeCodec<ConflictResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative4", ConflictResponse.Serializer, SdkJson)

  internal val updateObservabilityDestinationResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ConflictResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative4Codec)

  private val updateObservabilityDestinationResponseCodecAlternative5Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("updateObservabilityDestination.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val updateObservabilityDestinationResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationResponseCodecAlternative5Codec)

  internal val updateObservabilityDestinationRequestCodecRegistry:
      MediaTypeCodecRegistry<UpdateObservabilityDestinationRequest> =
      MediaTypeCodecRegistry.of(updateObservabilityDestinationRequestCodec)

  internal val updateObservabilityDestinationResponseCodecRegistry:
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
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CreateObservabilityDestinationApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CreateObservabilityDestinationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createObservabilityDestination(
    request: CreateObservabilityDestinationRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.CreateObservabilityDestinationResponse = executor.executeWithTypedErrors<CreateObservabilityDestinationRequest, CreateObservabilityDestinationResponse, com.nabobery.sdkgen.generated.CreateObservabilityDestinationResponse>(
    request = SdkExecutionRequest(createObservabilityDestinationMetadata, baseUri, request, listOf(ObservabilityCodecs.CREATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ObservabilityCodecs.createObservabilityDestinationRequestCodecRegistry,
    responseDecoder = CreateObservabilityDestinationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateObservabilityDestinationResponse.SuccessJson -> response.json
        is CreateObservabilityDestinationResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateObservabilityDestinationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateObservabilityDestinationResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateObservabilityDestinationResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateObservabilityDestinationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateObservabilityDestinationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateObservabilityDestinationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateObservabilityDestinationResponse.Http400Json -> CreateObservabilityDestinationApiException(response, statusCode, headers)
        is CreateObservabilityDestinationResponse.Http401Json -> CreateObservabilityDestinationApiException(response, statusCode, headers)
        is CreateObservabilityDestinationResponse.Http403Json -> CreateObservabilityDestinationApiException(response, statusCode, headers)
        is CreateObservabilityDestinationResponse.Http409Json -> CreateObservabilityDestinationApiException(response, statusCode, headers)
        is CreateObservabilityDestinationResponse.Http500Json -> CreateObservabilityDestinationApiException(response, statusCode, headers)
        is CreateObservabilityDestinationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Create a new observability destination. A maximum of 5 destinations per type is allowed. Defaults to the
   * authenticated entity's default workspace; use the `workspace_id` body field to scope to a different workspace.
   * [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun createObservabilityDestinationWithResponse(
    request: CreateObservabilityDestinationRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateObservabilityDestinationResponse> = executor.executeWithResponse<CreateObservabilityDestinationRequest, CreateObservabilityDestinationResponse>(SdkExecutionRequest(createObservabilityDestinationMetadata, baseUri, request, listOf(ObservabilityCodecs.CREATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ObservabilityCodecs.createObservabilityDestinationRequestCodecRegistry, CreateObservabilityDestinationResponseDecoder, options)

  /**
   * Delete an existing observability destination. This performs a soft delete. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param id The destination ID (UUID).
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws DeleteObservabilityDestinationApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded DeleteObservabilityDestinationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun deleteObservabilityDestination(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.DeleteObservabilityDestinationResponse = executor.executeWithTypedErrors<Unit, DeleteObservabilityDestinationResponse, com.nabobery.sdkgen.generated.DeleteObservabilityDestinationResponse>(
    request = SdkExecutionRequest(deleteObservabilityDestinationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ObservabilityCodecs.deleteObservabilityDestinationRequestCodecRegistry,
    responseDecoder = DeleteObservabilityDestinationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is DeleteObservabilityDestinationResponse.SuccessJson -> response.json
        is DeleteObservabilityDestinationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteObservabilityDestinationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteObservabilityDestinationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is DeleteObservabilityDestinationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is DeleteObservabilityDestinationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is DeleteObservabilityDestinationResponse.Http401Json -> DeleteObservabilityDestinationApiException(response, statusCode, headers)
        is DeleteObservabilityDestinationResponse.Http404Json -> DeleteObservabilityDestinationApiException(response, statusCode, headers)
        is DeleteObservabilityDestinationResponse.Http500Json -> DeleteObservabilityDestinationApiException(response, statusCode, headers)
        is DeleteObservabilityDestinationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Delete an existing observability destination. This performs a soft delete. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The destination ID (UUID).
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun deleteObservabilityDestinationWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<DeleteObservabilityDestinationResponse> = executor.executeWithResponse<Unit, DeleteObservabilityDestinationResponse>(SdkExecutionRequest(deleteObservabilityDestinationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ObservabilityCodecs.deleteObservabilityDestinationRequestCodecRegistry, DeleteObservabilityDestinationResponseDecoder, options)

  /**
   * Fetch a single observability destination by its UUID. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param id The destination ID (UUID).
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GetObservabilityDestinationApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded GetObservabilityDestinationError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getObservabilityDestination(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): com.nabobery.sdkgen.generated.GetObservabilityDestinationResponse = executor.executeWithTypedErrors<Unit, GetObservabilityDestinationResponse, com.nabobery.sdkgen.generated.GetObservabilityDestinationResponse>(
    request = SdkExecutionRequest(getObservabilityDestinationMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ObservabilityCodecs.getObservabilityDestinationRequestCodecRegistry,
    responseDecoder = GetObservabilityDestinationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetObservabilityDestinationResponse.SuccessJson -> response.json
        is GetObservabilityDestinationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetObservabilityDestinationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GetObservabilityDestinationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetObservabilityDestinationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetObservabilityDestinationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetObservabilityDestinationResponse.Http401Json -> GetObservabilityDestinationApiException(response, statusCode, headers)
        is GetObservabilityDestinationResponse.Http404Json -> GetObservabilityDestinationApiException(response, statusCode, headers)
        is GetObservabilityDestinationResponse.Http500Json -> GetObservabilityDestinationApiException(response, statusCode, headers)
        is GetObservabilityDestinationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Fetch a single observability destination by its UUID. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param id The destination ID (UUID).
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun getObservabilityDestinationWithResponse(
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetObservabilityDestinationResponse> = executor.executeWithResponse<Unit, GetObservabilityDestinationResponse>(SdkExecutionRequest(getObservabilityDestinationMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ObservabilityCodecs.getObservabilityDestinationRequestCodecRegistry, GetObservabilityDestinationResponseDecoder, options)

  /**
   * List the observability destinations configured for the authenticated entity's default workspace. Use the
   * `workspace_id` query parameter to scope the result to a different workspace. Only destinations with stable release
   * status are surfaced — destinations of other types are excluded. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
   * @param workspaceId Optional workspace ID to filter by. Defaults to the authenticated entity's default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws ListObservabilityDestinationsApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded ListObservabilityDestinationsError payload.
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
  ): com.nabobery.sdkgen.generated.ListObservabilityDestinationsResponse = executor.executeWithTypedErrors<Unit, ListObservabilityDestinationsResponse, com.nabobery.sdkgen.generated.ListObservabilityDestinationsResponse>(
    request = SdkExecutionRequest(listObservabilityDestinationsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ObservabilityCodecs.listObservabilityDestinationsRequestCodecRegistry,
    responseDecoder = ListObservabilityDestinationsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListObservabilityDestinationsResponse.SuccessJson -> response.json
        is ListObservabilityDestinationsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ListObservabilityDestinationsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListObservabilityDestinationsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListObservabilityDestinationsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListObservabilityDestinationsResponse.Http401Json -> ListObservabilityDestinationsApiException(response, statusCode, headers)
        is ListObservabilityDestinationsResponse.Http500Json -> ListObservabilityDestinationsApiException(response, statusCode, headers)
        is ListObservabilityDestinationsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List the observability destinations configured for the authenticated entity's default workspace. Use the
   * `workspace_id` query parameter to scope the result to a different workspace. Only destinations with stable release
   * status are surfaced — destinations of other types are excluded. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param limit Maximum number of records to return (max 100)
   * @param offset Number of records to skip for pagination
   * @param workspaceId Optional workspace ID to filter by. Defaults to the authenticated entity's default workspace.
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun listObservabilityDestinationsWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    workspaceId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListObservabilityDestinationsResponse> = executor.executeWithResponse<Unit, ListObservabilityDestinationsResponse>(SdkExecutionRequest(listObservabilityDestinationsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "workspace_id", values = workspaceId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ObservabilityCodecs.listObservabilityDestinationsRequestCodecRegistry, ListObservabilityDestinationsResponseDecoder, options)

  /**
   * Update an existing observability destination. Only the fields provided in the request body are updated. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
   * @param id The destination ID (UUID).
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws UpdateObservabilityDestinationApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded UpdateObservabilityDestinationError payload.
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
  ): com.nabobery.sdkgen.generated.UpdateObservabilityDestinationResponse = executor.executeWithTypedErrors<UpdateObservabilityDestinationRequest, UpdateObservabilityDestinationResponse, com.nabobery.sdkgen.generated.UpdateObservabilityDestinationResponse>(
    request = SdkExecutionRequest(updateObservabilityDestinationMetadata, baseUri, request, listOf(ObservabilityCodecs.UPDATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ObservabilityCodecs.updateObservabilityDestinationRequestCodecRegistry,
    responseDecoder = UpdateObservabilityDestinationResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is UpdateObservabilityDestinationResponse.SuccessJson -> response.json
        is UpdateObservabilityDestinationResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateObservabilityDestinationResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateObservabilityDestinationResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateObservabilityDestinationResponse.Http409Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateObservabilityDestinationResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is UpdateObservabilityDestinationResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is UpdateObservabilityDestinationResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is UpdateObservabilityDestinationResponse.Http400Json -> UpdateObservabilityDestinationApiException(response, statusCode, headers)
        is UpdateObservabilityDestinationResponse.Http401Json -> UpdateObservabilityDestinationApiException(response, statusCode, headers)
        is UpdateObservabilityDestinationResponse.Http404Json -> UpdateObservabilityDestinationApiException(response, statusCode, headers)
        is UpdateObservabilityDestinationResponse.Http409Json -> UpdateObservabilityDestinationApiException(response, statusCode, headers)
        is UpdateObservabilityDestinationResponse.Http500Json -> UpdateObservabilityDestinationApiException(response, statusCode, headers)
        is UpdateObservabilityDestinationResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Update an existing observability destination. Only the fields provided in the request body are updated. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param id The destination ID (UUID).
   *
   * Wire format: `uuid`. Represented as `String` in this release; SDKGen does not validate this format.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun updateObservabilityDestinationWithResponse(
    request: UpdateObservabilityDestinationRequest,
    id: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<UpdateObservabilityDestinationResponse> = executor.executeWithResponse<UpdateObservabilityDestinationRequest, UpdateObservabilityDestinationResponse>(SdkExecutionRequest(updateObservabilityDestinationMetadata, baseUri, request, listOf(ObservabilityCodecs.UPDATEOBSERVABILITYDESTINATION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "id", values = listOf(id.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ObservabilityCodecs.updateObservabilityDestinationRequestCodecRegistry, UpdateObservabilityDestinationResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `createObservabilityDestination` may expose through its typed API
   * exception.
   */
  public sealed interface CreateObservabilityDestinationError

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
    ) : CreateObservabilityDestinationResponse,
        CreateObservabilityDestinationError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse,
        CreateObservabilityDestinationError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse,
        CreateObservabilityDestinationError

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse,
        CreateObservabilityDestinationError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse,
        CreateObservabilityDestinationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateObservabilityDestinationResponse
  }

  /**
   * Raised by `createObservabilityDestination` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class CreateObservabilityDestinationApiException(
    public val error: CreateObservabilityDestinationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createObservabilityDestination")

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
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative0Registry.select(listOf("createObservabilityDestination.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createObservabilityDestination.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateObservabilityDestinationResponse.Http400Json(
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative1Registry.select(listOf("createObservabilityDestination.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createObservabilityDestination.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateObservabilityDestinationResponse.Http401Json(
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative2Registry.select(listOf("createObservabilityDestination.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createObservabilityDestination.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateObservabilityDestinationResponse.Http403Json(
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative3Registry.select(listOf("createObservabilityDestination.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createObservabilityDestination.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateObservabilityDestinationResponse.Http409Json(
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative4Registry.select(listOf("createObservabilityDestination.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createObservabilityDestination.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateObservabilityDestinationResponse.Http500Json(
          json = ObservabilityCodecs.createObservabilityDestinationResponseCodecAlternative5Registry.select(listOf("createObservabilityDestination.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CreateObservabilityDestinationResponse = CreateObservabilityDestinationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `deleteObservabilityDestination` may expose through its typed API
   * exception.
   */
  public sealed interface DeleteObservabilityDestinationError

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
    ) : DeleteObservabilityDestinationResponse,
        DeleteObservabilityDestinationError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteObservabilityDestinationResponse,
        DeleteObservabilityDestinationError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteObservabilityDestinationResponse,
        DeleteObservabilityDestinationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : DeleteObservabilityDestinationResponse
  }

  /**
   * Raised by `deleteObservabilityDestination` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class DeleteObservabilityDestinationApiException(
    public val error: DeleteObservabilityDestinationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "deleteObservabilityDestination")

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
          json = ObservabilityCodecs.deleteObservabilityDestinationResponseCodecAlternative0Registry.select(listOf("deleteObservabilityDestination.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteObservabilityDestination.response.alternative1" -> SdkResponseDecodeResult(
        value = DeleteObservabilityDestinationResponse.Http401Json(
          json = ObservabilityCodecs.deleteObservabilityDestinationResponseCodecAlternative1Registry.select(listOf("deleteObservabilityDestination.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteObservabilityDestination.response.alternative2" -> SdkResponseDecodeResult(
        value = DeleteObservabilityDestinationResponse.Http404Json(
          json = ObservabilityCodecs.deleteObservabilityDestinationResponseCodecAlternative2Registry.select(listOf("deleteObservabilityDestination.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "deleteObservabilityDestination.response.alternative3" -> SdkResponseDecodeResult(
        value = DeleteObservabilityDestinationResponse.Http500Json(
          json = ObservabilityCodecs.deleteObservabilityDestinationResponseCodecAlternative3Registry.select(listOf("deleteObservabilityDestination.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): DeleteObservabilityDestinationResponse = DeleteObservabilityDestinationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `getObservabilityDestination` may expose through its typed API
   * exception.
   */
  public sealed interface GetObservabilityDestinationError

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
    ) : GetObservabilityDestinationResponse,
        GetObservabilityDestinationError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetObservabilityDestinationResponse,
        GetObservabilityDestinationError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetObservabilityDestinationResponse,
        GetObservabilityDestinationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetObservabilityDestinationResponse
  }

  /**
   * Raised by `getObservabilityDestination` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class GetObservabilityDestinationApiException(
    public val error: GetObservabilityDestinationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getObservabilityDestination")

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
          json = ObservabilityCodecs.getObservabilityDestinationResponseCodecAlternative0Registry.select(listOf("getObservabilityDestination.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getObservabilityDestination.response.alternative1" -> SdkResponseDecodeResult(
        value = GetObservabilityDestinationResponse.Http401Json(
          json = ObservabilityCodecs.getObservabilityDestinationResponseCodecAlternative1Registry.select(listOf("getObservabilityDestination.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getObservabilityDestination.response.alternative2" -> SdkResponseDecodeResult(
        value = GetObservabilityDestinationResponse.Http404Json(
          json = ObservabilityCodecs.getObservabilityDestinationResponseCodecAlternative2Registry.select(listOf("getObservabilityDestination.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getObservabilityDestination.response.alternative3" -> SdkResponseDecodeResult(
        value = GetObservabilityDestinationResponse.Http500Json(
          json = ObservabilityCodecs.getObservabilityDestinationResponseCodecAlternative3Registry.select(listOf("getObservabilityDestination.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetObservabilityDestinationResponse = GetObservabilityDestinationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listObservabilityDestinations` may expose through its typed API
   * exception.
   */
  public sealed interface ListObservabilityDestinationsError

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
    ) : ListObservabilityDestinationsResponse,
        ListObservabilityDestinationsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListObservabilityDestinationsResponse,
        ListObservabilityDestinationsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListObservabilityDestinationsResponse
  }

  /**
   * Raised by `listObservabilityDestinations` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class ListObservabilityDestinationsApiException(
    public val error: ListObservabilityDestinationsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listObservabilityDestinations")

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
          json = ObservabilityCodecs.listObservabilityDestinationsResponseCodecAlternative0Registry.select(listOf("listObservabilityDestinations.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listObservabilityDestinations.response.alternative1" -> SdkResponseDecodeResult(
        value = ListObservabilityDestinationsResponse.Http401Json(
          json = ObservabilityCodecs.listObservabilityDestinationsResponseCodecAlternative1Registry.select(listOf("listObservabilityDestinations.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listObservabilityDestinations.response.alternative2" -> SdkResponseDecodeResult(
        value = ListObservabilityDestinationsResponse.Http500Json(
          json = ObservabilityCodecs.listObservabilityDestinationsResponseCodecAlternative2Registry.select(listOf("listObservabilityDestinations.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListObservabilityDestinationsResponse = ListObservabilityDestinationsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `updateObservabilityDestination` may expose through its typed API
   * exception.
   */
  public sealed interface UpdateObservabilityDestinationError

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
    ) : UpdateObservabilityDestinationResponse,
        UpdateObservabilityDestinationError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse,
        UpdateObservabilityDestinationError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse,
        UpdateObservabilityDestinationError

    public class Http409Json(
      public val json: ConflictResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse,
        UpdateObservabilityDestinationError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse,
        UpdateObservabilityDestinationError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : UpdateObservabilityDestinationResponse
  }

  /**
   * Raised by `updateObservabilityDestination` after decoding a declared non-success response. [error] is typed and is
   * not included in the exception message or diagnostic rendering.
   */
  public class UpdateObservabilityDestinationApiException(
    public val error: UpdateObservabilityDestinationError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "updateObservabilityDestination")

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
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative0Registry.select(listOf("updateObservabilityDestination.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateObservabilityDestination.response.alternative1" -> SdkResponseDecodeResult(
        value = UpdateObservabilityDestinationResponse.Http400Json(
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative1Registry.select(listOf("updateObservabilityDestination.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateObservabilityDestination.response.alternative2" -> SdkResponseDecodeResult(
        value = UpdateObservabilityDestinationResponse.Http401Json(
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative2Registry.select(listOf("updateObservabilityDestination.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateObservabilityDestination.response.alternative3" -> SdkResponseDecodeResult(
        value = UpdateObservabilityDestinationResponse.Http404Json(
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative3Registry.select(listOf("updateObservabilityDestination.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateObservabilityDestination.response.alternative4" -> SdkResponseDecodeResult(
        value = UpdateObservabilityDestinationResponse.Http409Json(
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative4Registry.select(listOf("updateObservabilityDestination.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "updateObservabilityDestination.response.alternative5" -> SdkResponseDecodeResult(
        value = UpdateObservabilityDestinationResponse.Http500Json(
          json = ObservabilityCodecs.updateObservabilityDestinationResponseCodecAlternative5Registry.select(listOf("updateObservabilityDestination.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): UpdateObservabilityDestinationResponse = UpdateObservabilityDestinationResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val createObservabilityDestinationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val deleteObservabilityDestinationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val getObservabilityDestinationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val listObservabilityDestinationsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }

    internal val updateObservabilityDestinationMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
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
        ) }
  }
}
