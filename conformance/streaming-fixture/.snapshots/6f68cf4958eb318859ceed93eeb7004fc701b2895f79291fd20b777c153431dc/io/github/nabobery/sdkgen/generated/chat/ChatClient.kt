package io.github.nabobery.sdkgen.generated.chat

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
import io.github.nabobery.sdkgen.generated.ChatDelta
import io.github.nabobery.sdkgen.generated.ChatRequest
import io.github.nabobery.sdkgen.generated.ChatResult
import io.github.nabobery.sdkgen.generated.ErrorResponse
import io.github.nabobery.sdkgen.generated.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.coroutines.flow.Flow

internal object ChatCodecs {
  internal const val SENDCHATCOMPLETION_REQUEST_CODEC_ID: String = "sendChatCompletion.request"

  private val sendChatCompletionRequestCodec: MediaTypeCodec<ChatRequest> =
      KotlinxSerializationCodec(SENDCHATCOMPLETION_REQUEST_CODEC_ID, ChatRequest.Serializer, SdkJson)

  internal const val SENDCHATCOMPLETION_RESPONSE_CODEC_ID: String = "sendChatCompletion.response"

  private val sendChatCompletionResponseCodec: MediaTypeCodec<ChatResult> =
      KotlinxSerializationCodec(SENDCHATCOMPLETION_RESPONSE_CODEC_ID, ChatResult.Serializer, SdkJson)

  private val sendChatCompletionResponseCodecAlternative0Codec: MediaTypeCodec<ChatResult> =
      KotlinxSerializationCodec("sendChatCompletion.response.alternative0", ChatResult.Serializer, SdkJson)

  internal val sendChatCompletionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ChatResult> =
      MediaTypeCodecRegistry.of(sendChatCompletionResponseCodecAlternative0Codec)

  private val sendChatCompletionResponseCodecAlternative1Codec: MediaTypeCodec<ErrorResponse> =
      KotlinxSerializationCodec("sendChatCompletion.response.alternative1", ErrorResponse.Serializer, SdkJson)

  internal val sendChatCompletionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ErrorResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionResponseCodecAlternative1Codec)

  private val sendChatCompletionResponseCodecAlternative2Codec: MediaTypeCodec<ErrorResponse> =
      KotlinxSerializationCodec("sendChatCompletion.response.alternative2", ErrorResponse.Serializer, SdkJson)

  internal val sendChatCompletionResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ErrorResponse> =
      MediaTypeCodecRegistry.of(sendChatCompletionResponseCodecAlternative2Codec)

  internal val sendChatCompletionRequestCodecRegistry: MediaTypeCodecRegistry<ChatRequest> =
      MediaTypeCodecRegistry.of(sendChatCompletionRequestCodec)

  internal val sendChatCompletionResponseCodecRegistry: MediaTypeCodecRegistry<ChatResult> =
      MediaTypeCodecRegistry.of(sendChatCompletionResponseCodec)
}

/**
 * Client for the 'chat' group of Streaming Fixture.
 */
public class ChatClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "apiKey" to SecurityScheme.ApiKey(location = SecurityScheme.ApiKeyLocation.HEADER, parameterName = "Authorization"),
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
   * Sends a chat completion request, buffered or streamed.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SendChatCompletionApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded SendChatCompletionError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun sendChatCompletion(request: ChatRequest, options: CallOptions = CallOptions()): ChatResult = executor.executeWithTypedErrors<ChatRequest, SendChatCompletionResponse, ChatResult>(
    request = SdkExecutionRequest(sendChatCompletionMetadata, baseUri, request, listOf(ChatCodecs.SENDCHATCOMPLETION_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = ChatCodecs.sendChatCompletionRequestCodecRegistry,
    responseDecoder = SendChatCompletionResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is SendChatCompletionResponse.SuccessJson -> response.json
        is SendChatCompletionResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is SendChatCompletionResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is SendChatCompletionResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is SendChatCompletionResponse.Http401Json -> SendChatCompletionApiException(response, statusCode, headers)
        is SendChatCompletionResponse.Http500Json -> SendChatCompletionApiException(response, statusCode, headers)
        is SendChatCompletionResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Sends a chat completion request, buffered or streamed.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun sendChatCompletionWithResponse(request: ChatRequest, options: CallOptions = CallOptions()): SdkResponseResult<SendChatCompletionResponse> = executor.executeWithResponse<ChatRequest, SendChatCompletionResponse>(SdkExecutionRequest(sendChatCompletionMetadata, baseUri, request, listOf(ChatCodecs.SENDCHATCOMPLETION_REQUEST_CODEC_ID), emptyList()), ChatCodecs.sendChatCompletionRequestCodecRegistry, SendChatCompletionResponseDecoder, options)

  /**
   * Sends a chat completion request, buffered or streamed.
   *
   * Streaming counterpart of this operation's buffered `sendChatCompletion()`/`sendChatCompletionWithResponse()`
   * methods: the service can answer the same request either as a single buffered JSON body (use those) or as a
   * `text/event-stream` (use this method) — this method always requests the streaming alternative.
   *
   * The returned `Flow` is cold: no request is sent, and the connection is not opened, until a collector actually
   * starts collecting. Each independent collection opens its own fresh connection; collections are never shared or
   * replayed. Cancelling the collecting coroutine promptly closes the underlying connection; ownership of the response
   * body transfers to the flow for its lifetime and is always released — on normal completion, on a declared terminal
   * sentinel, or on cancellation or failure — a caller never needs to close anything itself.
   *
   * Each event's `data` is decoded as `ChatDelta`; a declared terminal sentinel value ends the stream without being
   * emitted, and a declared in-band error event fails the flow with SdkStreamingException instead of being emitted as a
   * value.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return A cold flow of decoded streaming events; never resolves to a single response value.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or stream item cannot be decoded.
   * @throws SdkStreamingException When the stream framing or declared in-band error fails.
   */
  public fun sendChatCompletionStream(request: ChatRequest, options: CallOptions = CallOptions()): Flow<ChatDelta> = sseFlow(
    streamProvider = {
      executor.executeRawWithTypedErrors<ChatRequest, SendChatCompletionResponse>(
        request = SdkExecutionRequest(sendChatCompletionMetadataStream, baseUri, request, listOf(ChatCodecs.SENDCHATCOMPLETION_REQUEST_CODEC_ID), emptyList()),
        requestCodecs = ChatCodecs.sendChatCompletionRequestCodecRegistry,
        responseDecoder = SendChatCompletionResponseDecoder,
        mapError = { response, statusCode, headers ->
          when (response) {
            is SendChatCompletionResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
            is SendChatCompletionResponse.Http401Json -> SendChatCompletionApiException(response, statusCode, headers)
            is SendChatCompletionResponse.Http500Json -> SendChatCompletionApiException(response, statusCode, headers)
            is SendChatCompletionResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
          }
        },
        options = options,
      )
    },
    descriptor = requireNotNull(sendChatCompletionMetadataStream.streaming as? StreamingDescriptor.ServerSentEvents),
  ).decodeData { data -> SdkJson.decodeFromString(ChatDelta.Serializer, data) }

  /**
   * Decoded non-success response alternatives that `sendChatCompletion` may expose through its typed API exception.
   */
  public sealed interface SendChatCompletionError

  /**
   * Typed response alternatives for `sendChatCompletion`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface SendChatCompletionResponse {
    public class SuccessJson(
      public val json: ChatResult,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionResponse

    public class Http401Json(
      public val json: ErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionResponse,
        SendChatCompletionError

    public class Http500Json(
      public val json: ErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionResponse,
        SendChatCompletionError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : SendChatCompletionResponse
  }

  /**
   * Raised by `sendChatCompletion` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class SendChatCompletionApiException(
    public val error: SendChatCompletionError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "sendChatCompletion")

  private object SendChatCompletionResponseDecoder : SdkResponseAlternativeDecoder<SendChatCompletionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SendChatCompletionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<SendChatCompletionResponse> = when {
      alternative.id == "sendChatCompletion.response.alternative0" -> SdkResponseDecodeResult(
        value = SendChatCompletionResponse.SuccessJson(
          json = ChatCodecs.sendChatCompletionResponseCodecAlternative0Registry.select(listOf("sendChatCompletion.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletion.response.alternative1" -> SdkResponseDecodeResult(
        value = SendChatCompletionResponse.Http401Json(
          json = ChatCodecs.sendChatCompletionResponseCodecAlternative1Registry.select(listOf("sendChatCompletion.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "sendChatCompletion.response.alternative2" -> SdkResponseDecodeResult(
        value = SendChatCompletionResponse.Http500Json(
          json = ChatCodecs.sendChatCompletionResponseCodecAlternative2Registry.select(listOf("sendChatCompletion.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): SendChatCompletionResponse = SendChatCompletionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val sendChatCompletionMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "sendChatCompletion",
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
              id = "sendChatCompletion.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "ErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletion.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "ErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletion.response.alternative2",
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
            maxAttempts = 3,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = StreamingDescriptor.ServerSentEvents(terminalSentinel = "[DONE]", inBandError = null, requestFlag = null, responseContentType = "text/event-stream"),
        ) }

    internal val sendChatCompletionMetadataStream: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "sendChatCompletion",
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
              id = "sendChatCompletion.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "ErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletion.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "ErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "sendChatCompletion.response.alternative2",
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
            maxAttempts = 3,
            backoff = BackoffHints(baseDelayMillis = 250, multiplier = 2.0, maxDelayMillis = 5_000),
          ),
          pagination = null,
          streaming = StreamingDescriptor.ServerSentEvents(terminalSentinel = "[DONE]", inBandError = null, requestFlag = null, responseContentType = "text/event-stream"),
        ) }
  }
}
