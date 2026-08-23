package com.nabobery.sdkgen.generated.betaresponses

import com.nabobery.sdkgen.generated.BadGatewayResponse
import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.EdgeNetworkTimeoutResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.MetadataLevel
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.OpenResponsesResult
import com.nabobery.sdkgen.generated.PayloadTooLargeResponse
import com.nabobery.sdkgen.generated.PaymentRequiredResponse
import com.nabobery.sdkgen.generated.ProviderOverloadedResponse
import com.nabobery.sdkgen.generated.RequestTimeoutResponse
import com.nabobery.sdkgen.generated.ResponsesRequest
import com.nabobery.sdkgen.generated.ResponsesStreamingResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.ServiceUnavailableResponse
import com.nabobery.sdkgen.generated.TooManyRequestsResponse
import com.nabobery.sdkgen.generated.UnauthorizedResponse
import com.nabobery.sdkgen.generated.UnprocessableEntityResponse
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
import com.nabobery.sdkgen.runtime.StreamingDescriptor
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.SecurityScheme
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeAuthentication
import com.nabobery.sdkgen.runtime.auth.SecuritySchemeBinding
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.streaming.decodeData
import com.nabobery.sdkgen.runtime.streaming.sseFlow
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.coroutines.flow.Flow

internal object BetaResponsesCodecs {
  internal const val CREATERESPONSES_REQUEST_CODEC_ID: String = "createResponses.request"

  private val createResponsesRequestCodec: MediaTypeCodec<ResponsesRequest> =
      KotlinxSerializationCodec(CREATERESPONSES_REQUEST_CODEC_ID, ResponsesRequest.Serializer, SdkJson)

  internal const val CREATERESPONSES_RESPONSE_CODEC_ID: String = "createResponses.response"

  private val createResponsesResponseCodec: MediaTypeCodec<OpenResponsesResult> =
      KotlinxSerializationCodec(CREATERESPONSES_RESPONSE_CODEC_ID, OpenResponsesResult.Serializer, SdkJson)

  private val createResponsesResponseCodecAlternative0Codec: MediaTypeCodec<OpenResponsesResult> =
      KotlinxSerializationCodec("createResponses.response.alternative0", OpenResponsesResult.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<OpenResponsesResult> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative0Codec)

  private val createResponsesResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createResponses.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative1Codec)

  private val createResponsesResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createResponses.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative2Codec)

  private val createResponsesResponseCodecAlternative3Codec: MediaTypeCodec<PaymentRequiredResponse>
      =
      KotlinxSerializationCodec("createResponses.response.alternative3", PaymentRequiredResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<PaymentRequiredResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative3Codec)

  private val createResponsesResponseCodecAlternative4Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createResponses.response.alternative4", ForbiddenResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative4Codec)

  private val createResponsesResponseCodecAlternative5Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("createResponses.response.alternative5", NotFoundResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative5Codec)

  private val createResponsesResponseCodecAlternative6Codec: MediaTypeCodec<RequestTimeoutResponse>
      =
      KotlinxSerializationCodec("createResponses.response.alternative6", RequestTimeoutResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<RequestTimeoutResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative6Codec)

  private val createResponsesResponseCodecAlternative7Codec: MediaTypeCodec<PayloadTooLargeResponse>
      =
      KotlinxSerializationCodec("createResponses.response.alternative7", PayloadTooLargeResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<PayloadTooLargeResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative7Codec)

  private val createResponsesResponseCodecAlternative8Codec:
      MediaTypeCodec<UnprocessableEntityResponse> =
      KotlinxSerializationCodec("createResponses.response.alternative8", UnprocessableEntityResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<UnprocessableEntityResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative8Codec)

  private val createResponsesResponseCodecAlternative9Codec: MediaTypeCodec<TooManyRequestsResponse>
      =
      KotlinxSerializationCodec("createResponses.response.alternative9", TooManyRequestsResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative9Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative9Codec)

  private val createResponsesResponseCodecAlternative10Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("createResponses.response.alternative10", InternalServerResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative10Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative10Codec)

  private val createResponsesResponseCodecAlternative11Codec: MediaTypeCodec<BadGatewayResponse> =
      KotlinxSerializationCodec("createResponses.response.alternative11", BadGatewayResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative11Registry:
      MediaTypeCodecRegistry<BadGatewayResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative11Codec)

  private val createResponsesResponseCodecAlternative12Codec:
      MediaTypeCodec<ServiceUnavailableResponse> =
      KotlinxSerializationCodec("createResponses.response.alternative12", ServiceUnavailableResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative12Registry:
      MediaTypeCodecRegistry<ServiceUnavailableResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative12Codec)

  private val createResponsesResponseCodecAlternative13Codec:
      MediaTypeCodec<EdgeNetworkTimeoutResponse> =
      KotlinxSerializationCodec("createResponses.response.alternative13", EdgeNetworkTimeoutResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative13Registry:
      MediaTypeCodecRegistry<EdgeNetworkTimeoutResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative13Codec)

  private val createResponsesResponseCodecAlternative14Codec:
      MediaTypeCodec<ProviderOverloadedResponse> =
      KotlinxSerializationCodec("createResponses.response.alternative14", ProviderOverloadedResponse.Serializer, SdkJson)

  internal val createResponsesResponseCodecAlternative14Registry:
      MediaTypeCodecRegistry<ProviderOverloadedResponse> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodecAlternative14Codec)

  internal val createResponsesRequestCodecRegistry: MediaTypeCodecRegistry<ResponsesRequest> =
      MediaTypeCodecRegistry.of(createResponsesRequestCodec)

  internal val createResponsesResponseCodecRegistry: MediaTypeCodecRegistry<OpenResponsesResult> =
      MediaTypeCodecRegistry.of(createResponsesResponseCodec)
}

/**
 * Client for the 'beta.responses' group of OpenRouter API.
 */
public class BetaResponsesClient(
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
      SdkExecutor(transport, authentication = this@BetaResponsesClient.authentication)

  /**
   * Creates a streaming or non-streaming response using OpenResponses API format
   *
   * @param request Request body sent to the operation.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterMetadata Opt-in to surface routing metadata on the response under `openrouter_metadata`. Defaults
   * to `disabled`. The legacy header `X-OpenRouter-Experimental-Metadata` is also accepted for backward compatibility.
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CreateResponsesApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded CreateResponsesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createResponses(
    request: ResponsesRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterMetadata: MetadataLevel? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): OpenResponsesResult = executor.executeWithTypedErrors<ResponsesRequest, CreateResponsesResponse, OpenResponsesResult>(
    request = SdkExecutionRequest(createResponsesMetadata, baseUri, request, listOf(BetaResponsesCodecs.CREATERESPONSES_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Metadata", values = xOpenRouterMetadata?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BetaResponsesCodecs.createResponsesRequestCodecRegistry,
    responseDecoder = CreateResponsesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateResponsesResponse.SuccessJson -> response.json
        is CreateResponsesResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http402Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http408Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http413Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http502Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http524Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Http529Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateResponsesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateResponsesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateResponsesResponse.Http400Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http401Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http402Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http403Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http404Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http408Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http413Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http422Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http429Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http500Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http502Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http503Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http524Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Http529Json -> CreateResponsesApiException(response, statusCode, headers)
        is CreateResponsesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a streaming or non-streaming response using OpenResponses API format
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
   * @param xOpenRouterMetadata Opt-in to surface routing metadata on the response under `openrouter_metadata`. Defaults
   * to `disabled`. The legacy header `X-OpenRouter-Experimental-Metadata` is also accepted for backward compatibility.
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   */
  public suspend fun createResponsesWithResponse(
    request: ResponsesRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterMetadata: MetadataLevel? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateResponsesResponse> = executor.executeWithResponse<ResponsesRequest, CreateResponsesResponse>(SdkExecutionRequest(createResponsesMetadata, baseUri, request, listOf(BetaResponsesCodecs.CREATERESPONSES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Metadata", values = xOpenRouterMetadata?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), BetaResponsesCodecs.createResponsesRequestCodecRegistry, CreateResponsesResponseDecoder, options)

  /**
   * Creates a streaming or non-streaming response using OpenResponses API format
   *
   * Streaming counterpart of this operation's buffered `createResponses()`/`createResponsesWithResponse()` methods: the
   * service can answer the same request either as a single buffered JSON body (use those) or as a `text/event-stream`
   * (use this method) — this method always requests the streaming alternative.
   *
   * The returned `Flow` is cold: no request is sent, and the connection is not opened, until a collector actually
   * starts collecting. Each independent collection opens its own fresh connection; collections are never shared or
   * replayed. Cancelling the collecting coroutine promptly closes the underlying connection; ownership of the response
   * body transfers to the flow for its lifetime and is always released — on normal completion, on a declared terminal
   * sentinel, or on cancellation or failure — a caller never needs to close anything itself.
   *
   * Each event's `data` is decoded as `ResponsesStreamingResponse`; a declared terminal sentinel value ends the stream
   * without being emitted, and a declared in-band error event fails the flow with SdkStreamingException instead of
   * being emitted as a value.
   *
   * @param request Request body sent to the operation.
   * @param httpReferer The app identifier should be your app's URL and is used as the primary identifier for rankings.
   * This is used to track API usage per application.
   *
   * @param xOpenRouterCategories Comma-separated list of app categories (e.g. "cli-agent,cloud-agent"). Used for
   * marketplace rankings.
   *
   * @param xOpenRouterMetadata Opt-in to surface routing metadata on the response under `openrouter_metadata`. Defaults
   * to `disabled`. The legacy header `X-OpenRouter-Experimental-Metadata` is also accepted for backward compatibility.
   * @param xOpenRouterTitle The app display name allows you to customize how your app appears in OpenRouter's
   * dashboard.
   *
   * @param options Execution options.
   * @return A cold flow of decoded streaming events; never resolves to a single response value.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or stream item cannot be decoded.
   * @throws SdkStreamingException When the stream framing or declared in-band error fails.
   */
  public fun createResponsesStream(
    request: ResponsesRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterMetadata: MetadataLevel? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<ResponsesStreamingResponse> = sseFlow(
    streamProvider = {
      executor.executeRawWithTypedErrors<ResponsesRequest, CreateResponsesResponse>(
        request = SdkExecutionRequest(createResponsesMetadataStream, baseUri, request, listOf(BetaResponsesCodecs.CREATERESPONSES_REQUEST_CODEC_ID), buildList {
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Metadata", values = xOpenRouterMetadata?.let { listOf(it.toString()) }.orEmpty()))
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
        }),
        requestCodecs = BetaResponsesCodecs.createResponsesRequestCodecRegistry,
        responseDecoder = CreateResponsesResponseDecoder,
        mapError = { response, statusCode, headers ->
          when (response) {
            is CreateResponsesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
            is CreateResponsesResponse.Http400Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http401Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http402Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http403Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http404Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http408Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http413Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http422Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http429Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http500Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http502Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http503Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http524Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Http529Json -> CreateResponsesApiException(response, statusCode, headers)
            is CreateResponsesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
          }
        },
        options = options,
      )
    },
    descriptor = requireNotNull(createResponsesMetadataStream.streaming as? StreamingDescriptor.ServerSentEvents),
  ).decodeData { data -> SdkJson.decodeFromString(ResponsesStreamingResponse.Serializer, data) }

  /**
   * Decoded non-success response alternatives that `createResponses` may expose through its typed API exception.
   */
  public sealed interface CreateResponsesError

  /**
   * Typed response alternatives for `createResponses`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CreateResponsesResponse {
    public class SuccessJson(
      public val json: OpenResponsesResult,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http402Json(
      public val json: PaymentRequiredResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http408Json(
      public val json: RequestTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http413Json(
      public val json: PayloadTooLargeResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http422Json(
      public val json: UnprocessableEntityResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http502Json(
      public val json: BadGatewayResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http503Json(
      public val json: ServiceUnavailableResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http524Json(
      public val json: EdgeNetworkTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Http529Json(
      public val json: ProviderOverloadedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse,
        CreateResponsesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateResponsesResponse
  }

  /**
   * Raised by `createResponses` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class CreateResponsesApiException(
    public val error: CreateResponsesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createResponses")

  private object CreateResponsesResponseDecoder : SdkResponseAlternativeDecoder<CreateResponsesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateResponsesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateResponsesResponse> = when {
      alternative.id == "createResponses.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.SuccessJson(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative0Registry.select(listOf("createResponses.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http400Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative1Registry.select(listOf("createResponses.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http401Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative2Registry.select(listOf("createResponses.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http402Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative3Registry.select(listOf("createResponses.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http403Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative4Registry.select(listOf("createResponses.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http404Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative5Registry.select(listOf("createResponses.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative6" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http408Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative6Registry.select(listOf("createResponses.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative7" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http413Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative7Registry.select(listOf("createResponses.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative8" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http422Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative8Registry.select(listOf("createResponses.response.alternative8"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative9" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http429Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative9Registry.select(listOf("createResponses.response.alternative9"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative10" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http500Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative10Registry.select(listOf("createResponses.response.alternative10"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative11" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http502Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative11Registry.select(listOf("createResponses.response.alternative11"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative12" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http503Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative12Registry.select(listOf("createResponses.response.alternative12"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative13" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http524Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative13Registry.select(listOf("createResponses.response.alternative13"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createResponses.response.alternative14" -> SdkResponseDecodeResult(
        value = CreateResponsesResponse.Http529Json(
          json = BetaResponsesCodecs.createResponsesResponseCodecAlternative14Registry.select(listOf("createResponses.response.alternative14"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CreateResponsesResponse = CreateResponsesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val createResponsesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createResponses",
          method = "POST",
          path = "/responses",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "OpenResponsesResult",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 408),
              mediaTypes = listOf("application/json"),
              typeTag = "RequestTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 413),
              mediaTypes = listOf("application/json"),
              typeTag = "PayloadTooLargeResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "UnprocessableEntityResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative8",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative9",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative10",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative11",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "ServiceUnavailableResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative12",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative13",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative14",
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
          streaming = StreamingDescriptor.ServerSentEvents(terminalSentinel = "[DONE]", inBandError = null, requestFlag = "stream", responseContentType = "text/event-stream"),
        ) }

    internal val createResponsesMetadataStream: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createResponses",
          method = "POST",
          path = "/responses",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.STREAMING,
          deadlines = SdkDeadlines(null, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "OpenResponsesResult",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 408),
              mediaTypes = listOf("application/json"),
              typeTag = "RequestTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 413),
              mediaTypes = listOf("application/json"),
              typeTag = "PayloadTooLargeResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "UnprocessableEntityResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative8",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative9",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative10",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative11",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "ServiceUnavailableResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative12",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative13",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createResponses.response.alternative14",
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
          streaming = StreamingDescriptor.ServerSentEvents(terminalSentinel = "[DONE]", inBandError = null, requestFlag = "stream", responseContentType = "text/event-stream"),
        ) }
  }
}
