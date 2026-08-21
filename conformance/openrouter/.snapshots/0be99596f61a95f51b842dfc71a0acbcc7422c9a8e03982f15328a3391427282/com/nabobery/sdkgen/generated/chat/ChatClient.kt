package com.nabobery.sdkgen.generated.chat

import com.nabobery.sdkgen.generated.BadGatewayResponse
import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.ChatRequest
import com.nabobery.sdkgen.generated.ChatResult
import com.nabobery.sdkgen.generated.ChatStreamingResponse
import com.nabobery.sdkgen.generated.EdgeNetworkTimeoutResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.MetadataLevel
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.PayloadTooLargeResponse
import com.nabobery.sdkgen.generated.PaymentRequiredResponse
import com.nabobery.sdkgen.generated.ProviderOverloadedResponse
import com.nabobery.sdkgen.generated.RequestTimeoutResponse
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

internal object ChatCodecs {
  internal const val SENDCHATCOMPLETIONREQUEST_REQUEST_CODEC_ID: String =
      "sendChatCompletionRequest.request"

  private val sendChatCompletionRequestRequestCodec: MediaTypeCodec<ChatRequest> =
      KotlinxSerializationCodec(SENDCHATCOMPLETIONREQUEST_REQUEST_CODEC_ID, ChatRequest.Serializer, SdkJson)

  internal const val SENDCHATCOMPLETIONREQUEST_RESPONSE_CODEC_ID: String =
      "sendChatCompletionRequest.response"

  private val sendChatCompletionRequestResponseCodec: MediaTypeCodec<ChatResult> =
      KotlinxSerializationCodec(SENDCHATCOMPLETIONREQUEST_RESPONSE_CODEC_ID, ChatResult.Serializer, SdkJson)

  private val sendChatCompletionRequestResponseCodecAlternative0Codec: MediaTypeCodec<ChatResult> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative0", ChatResult.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ChatResult> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative0Codec)

  private val sendChatCompletionRequestResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative1Codec)

  private val sendChatCompletionRequestResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative2Codec)

  private val sendChatCompletionRequestResponseCodecAlternative3Codec:
      MediaTypeCodec<PaymentRequiredResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative3", PaymentRequiredResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<PaymentRequiredResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative3Codec)

  private val sendChatCompletionRequestResponseCodecAlternative4Codec:
      MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative4", ForbiddenResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative4Codec)

  private val sendChatCompletionRequestResponseCodecAlternative5Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative5", NotFoundResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative5Codec)

  private val sendChatCompletionRequestResponseCodecAlternative6Codec:
      MediaTypeCodec<RequestTimeoutResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative6", RequestTimeoutResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<RequestTimeoutResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative6Codec)

  private val sendChatCompletionRequestResponseCodecAlternative7Codec:
      MediaTypeCodec<PayloadTooLargeResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative7", PayloadTooLargeResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<PayloadTooLargeResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative7Codec)

  private val sendChatCompletionRequestResponseCodecAlternative8Codec:
      MediaTypeCodec<UnprocessableEntityResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative8", UnprocessableEntityResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<UnprocessableEntityResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative8Codec)

  private val sendChatCompletionRequestResponseCodecAlternative9Codec:
      MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative9", TooManyRequestsResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative9Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative9Codec)

  private val sendChatCompletionRequestResponseCodecAlternative10Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative10", InternalServerResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative10Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative10Codec)

  private val sendChatCompletionRequestResponseCodecAlternative11Codec:
      MediaTypeCodec<BadGatewayResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative11", BadGatewayResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative11Registry:
      MediaTypeCodecRegistry<BadGatewayResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative11Codec)

  private val sendChatCompletionRequestResponseCodecAlternative12Codec:
      MediaTypeCodec<ServiceUnavailableResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative12", ServiceUnavailableResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative12Registry:
      MediaTypeCodecRegistry<ServiceUnavailableResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative12Codec)

  private val sendChatCompletionRequestResponseCodecAlternative13Codec:
      MediaTypeCodec<EdgeNetworkTimeoutResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative13", EdgeNetworkTimeoutResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative13Registry:
      MediaTypeCodecRegistry<EdgeNetworkTimeoutResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative13Codec)

  private val sendChatCompletionRequestResponseCodecAlternative14Codec:
      MediaTypeCodec<ProviderOverloadedResponse> =
      KotlinxSerializationCodec("sendChatCompletionRequest.response.alternative14", ProviderOverloadedResponse.Serializer, SdkJson)

  internal val sendChatCompletionRequestResponseCodecAlternative14Registry:
      MediaTypeCodecRegistry<ProviderOverloadedResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodecAlternative14Codec)

  internal val sendChatCompletionRequestRequestCodecRegistry: MediaTypeCodecRegistry<ChatRequest> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestRequestCodec)

  internal val sendChatCompletionRequestResponseCodecRegistry: MediaTypeCodecRegistry<ChatResult> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestResponseCodec)
}

/**
 * Client for the 'Chat' group of OpenRouter API.
 */
public class ChatClient(
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
      SdkExecutor(transport, authentication = this@ChatClient.authentication)

  /**
   * Sends a request for a model response for the given chat conversation. Supports both streaming and non-streaming
   * modes.
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
   * @throws SendChatCompletionRequestApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded SendChatCompletionRequestError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun sendChatCompletionRequest(
    request: ChatRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterMetadata: MetadataLevel? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ChatResult = executor.executeWithTypedErrors<ChatRequest, SendChatCompletionRequestResponse, ChatResult>(
    request = SdkExecutionRequest(sendChatCompletionRequestMetadata, baseUri, request, listOf(ChatCodecs.SENDCHATCOMPLETIONREQUEST_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Metadata", values = xOpenRouterMetadata?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ChatCodecs.sendChatCompletionRequestRequestCodecRegistry,
    responseDecoder = SendChatCompletionRequestResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SendChatCompletionRequestResponse.SuccessJson -> response.json
        is SendChatCompletionRequestResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http402Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http408Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http413Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http422Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http502Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http524Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Http529Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionRequestResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SendChatCompletionRequestResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SendChatCompletionRequestResponse.Http400Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http401Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http402Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http403Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http404Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http408Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http413Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http422Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http429Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http500Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http502Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http503Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http524Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Http529Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
        is SendChatCompletionRequestResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Sends a request for a model response for the given chat conversation. Supports both streaming and non-streaming
   * modes.
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
  public suspend fun sendChatCompletionRequestWithResponse(
    request: ChatRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterMetadata: MetadataLevel? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<SendChatCompletionRequestResponse> = executor.executeWithResponse<ChatRequest, SendChatCompletionRequestResponse>(SdkExecutionRequest(sendChatCompletionRequestMetadata, baseUri, request, listOf(ChatCodecs.SENDCHATCOMPLETIONREQUEST_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Metadata", values = xOpenRouterMetadata?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ChatCodecs.sendChatCompletionRequestRequestCodecRegistry, SendChatCompletionRequestResponseDecoder, options)

  /**
   * Sends a request for a model response for the given chat conversation. Supports both streaming and non-streaming
   * modes.
   *
   * Streaming counterpart of this operation's buffered
   * `sendChatCompletionRequest()`/`sendChatCompletionRequestWithResponse()` methods: the service can answer the same
   * request either as a single buffered JSON body (use those) or as a `text/event-stream` (use this method) — this
   * method always requests the streaming alternative.
   *
   * The returned `Flow` is cold: no request is sent, and the connection is not opened, until a collector actually
   * starts collecting. Each independent collection opens its own fresh connection; collections are never shared or
   * replayed. Cancelling the collecting coroutine promptly closes the underlying connection; ownership of the response
   * body transfers to the flow for its lifetime and is always released — on normal completion, on a declared terminal
   * sentinel, or on cancellation or failure — a caller never needs to close anything itself.
   *
   * Each event's `data` is decoded as `ChatStreamingResponse`; a declared terminal sentinel value ends the stream
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
  public fun sendChatCompletionRequestStream(
    request: ChatRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterMetadata: MetadataLevel? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<ChatStreamingResponse> = sseFlow(
    streamProvider = {
      executor.executeRawWithTypedErrors<ChatRequest, SendChatCompletionRequestResponse>(
        request = SdkExecutionRequest(sendChatCompletionRequestMetadataStream, baseUri, request, listOf(ChatCodecs.SENDCHATCOMPLETIONREQUEST_REQUEST_CODEC_ID), buildList {
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Metadata", values = xOpenRouterMetadata?.let { listOf(it.toString()) }.orEmpty()))
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
        }),
        requestCodecs = ChatCodecs.sendChatCompletionRequestRequestCodecRegistry,
        responseDecoder = SendChatCompletionRequestResponseDecoder,
        mapError = { response, statusCode, headers ->
          when (response) {
            is SendChatCompletionRequestResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
            is SendChatCompletionRequestResponse.Http400Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http401Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http402Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http403Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http404Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http408Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http413Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http422Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http429Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http500Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http502Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http503Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http524Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Http529Json -> SendChatCompletionRequestApiException(response, statusCode, headers)
            is SendChatCompletionRequestResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
          }
        },
        options = options,
      )
    },
    descriptor = requireNotNull(sendChatCompletionRequestMetadataStream.streaming as? StreamingDescriptor.ServerSentEvents),
  ).decodeData { data -> SdkJson.decodeFromString(ChatStreamingResponse.Serializer, data) }

  /**
   * Decoded non-success response alternatives that `sendChatCompletionRequest` may expose through its typed API
   * exception.
   */
  public sealed interface SendChatCompletionRequestError

  /**
   * Typed response alternatives for `sendChatCompletionRequest`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface SendChatCompletionRequestResponse {
    public class SuccessJson(
      public val json: ChatResult,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http402Json(
      public val json: PaymentRequiredResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http408Json(
      public val json: RequestTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http413Json(
      public val json: PayloadTooLargeResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http422Json(
      public val json: UnprocessableEntityResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http502Json(
      public val json: BadGatewayResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http503Json(
      public val json: ServiceUnavailableResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http524Json(
      public val json: EdgeNetworkTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Http529Json(
      public val json: ProviderOverloadedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse,
        SendChatCompletionRequestError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionRequestResponse
  }

  /**
   * Raised by `sendChatCompletionRequest` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class SendChatCompletionRequestApiException(
    public val error: SendChatCompletionRequestError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "sendChatCompletionRequest")

  private object SendChatCompletionRequestResponseDecoder : SdkResponseAlternativeDecoder<SendChatCompletionRequestResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SendChatCompletionRequestResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SendChatCompletionRequestResponse> = when {
      alternative.id == "sendChatCompletionRequest.response.alternative0" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.SuccessJson(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative0Registry.select(listOf("sendChatCompletionRequest.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative1" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http400Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative1Registry.select(listOf("sendChatCompletionRequest.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative2" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http401Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative2Registry.select(listOf("sendChatCompletionRequest.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative3" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http402Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative3Registry.select(listOf("sendChatCompletionRequest.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative4" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http403Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative4Registry.select(listOf("sendChatCompletionRequest.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative5" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http404Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative5Registry.select(listOf("sendChatCompletionRequest.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative6" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http408Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative6Registry.select(listOf("sendChatCompletionRequest.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative7" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http413Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative7Registry.select(listOf("sendChatCompletionRequest.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative8" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http422Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative8Registry.select(listOf("sendChatCompletionRequest.response.alternative8"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative9" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http429Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative9Registry.select(listOf("sendChatCompletionRequest.response.alternative9"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative10" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http500Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative10Registry.select(listOf("sendChatCompletionRequest.response.alternative10"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative11" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http502Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative11Registry.select(listOf("sendChatCompletionRequest.response.alternative11"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative12" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http503Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative12Registry.select(listOf("sendChatCompletionRequest.response.alternative12"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative13" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http524Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative13Registry.select(listOf("sendChatCompletionRequest.response.alternative13"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletionRequest.response.alternative14" -> SdkResponseDecodeResult(
        value = SendChatCompletionRequestResponse.Http529Json(
          json = ChatCodecs.sendChatCompletionRequestResponseCodecAlternative14Registry.select(listOf("sendChatCompletionRequest.response.alternative14"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SendChatCompletionRequestResponse = SendChatCompletionRequestResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val sendChatCompletionRequestMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "sendChatCompletionRequest",
          method = "POST",
          path = "/chat/completions",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ChatResult",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 408),
              mediaTypes = listOf("application/json"),
              typeTag = "RequestTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 413),
              mediaTypes = listOf("application/json"),
              typeTag = "PayloadTooLargeResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "UnprocessableEntityResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative8",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative9",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative10",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative11",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "ServiceUnavailableResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative12",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative13",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative14",
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

    internal val sendChatCompletionRequestMetadataStream: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "sendChatCompletionRequest",
          method = "POST",
          path = "/chat/completions",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.STREAMING,
          deadlines = SdkDeadlines(null, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ChatResult",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 408),
              mediaTypes = listOf("application/json"),
              typeTag = "RequestTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 413),
              mediaTypes = listOf("application/json"),
              typeTag = "PayloadTooLargeResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 422),
              mediaTypes = listOf("application/json"),
              typeTag = "UnprocessableEntityResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative8",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative9",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative10",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative11",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "ServiceUnavailableResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative12",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative13",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletionRequest.response.alternative14",
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
