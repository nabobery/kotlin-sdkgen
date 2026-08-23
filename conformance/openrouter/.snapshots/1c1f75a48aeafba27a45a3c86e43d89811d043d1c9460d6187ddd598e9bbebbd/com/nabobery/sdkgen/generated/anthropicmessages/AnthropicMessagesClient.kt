package com.nabobery.sdkgen.generated.anthropicmessages

import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.MessagesErrorResponse
import com.nabobery.sdkgen.generated.MessagesRequest
import com.nabobery.sdkgen.generated.MessagesResult
import com.nabobery.sdkgen.generated.MessagesStreamingResponse
import com.nabobery.sdkgen.generated.MetadataLevel
import com.nabobery.sdkgen.generated.SdkJson
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

internal object AnthropicMessagesCodecs {
  internal const val CREATEMESSAGES_REQUEST_CODEC_ID: String = "createMessages.request"

  private val createMessagesRequestCodec: MediaTypeCodec<MessagesRequest> =
      KotlinxSerializationCodec(CREATEMESSAGES_REQUEST_CODEC_ID, MessagesRequest.Serializer, SdkJson)

  internal const val CREATEMESSAGES_RESPONSE_CODEC_ID: String = "createMessages.response"

  private val createMessagesResponseCodec: MediaTypeCodec<MessagesResult> =
      KotlinxSerializationCodec(CREATEMESSAGES_RESPONSE_CODEC_ID, MessagesResult.Serializer, SdkJson)

  private val createMessagesResponseCodecAlternative0Codec: MediaTypeCodec<MessagesResult> =
      KotlinxSerializationCodec("createMessages.response.alternative0", MessagesResult.Serializer, SdkJson)

  internal val createMessagesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<MessagesResult> =
      MediaTypeCodecRegistry.of(createMessagesResponseCodecAlternative0Codec)

  private val createMessagesResponseCodecAlternative1Codec: MediaTypeCodec<MessagesErrorResponse> =
      KotlinxSerializationCodec("createMessages.response.alternative1", MessagesErrorResponse.Serializer, SdkJson)

  internal val createMessagesResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<MessagesErrorResponse> =
      MediaTypeCodecRegistry.of(createMessagesResponseCodecAlternative1Codec)

  private val createMessagesResponseCodecAlternative2Codec: MediaTypeCodec<MessagesErrorResponse> =
      KotlinxSerializationCodec("createMessages.response.alternative2", MessagesErrorResponse.Serializer, SdkJson)

  internal val createMessagesResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<MessagesErrorResponse> =
      MediaTypeCodecRegistry.of(createMessagesResponseCodecAlternative2Codec)

  private val createMessagesResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("createMessages.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val createMessagesResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(createMessagesResponseCodecAlternative3Codec)

  private val createMessagesResponseCodecAlternative4Codec: MediaTypeCodec<MessagesErrorResponse> =
      KotlinxSerializationCodec("createMessages.response.alternative4", MessagesErrorResponse.Serializer, SdkJson)

  internal val createMessagesResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<MessagesErrorResponse> =
      MediaTypeCodecRegistry.of(createMessagesResponseCodecAlternative4Codec)

  private val createMessagesResponseCodecAlternative5Codec: MediaTypeCodec<MessagesErrorResponse> =
      KotlinxSerializationCodec("createMessages.response.alternative5", MessagesErrorResponse.Serializer, SdkJson)

  internal val createMessagesResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<MessagesErrorResponse> =
      MediaTypeCodecRegistry.of(createMessagesResponseCodecAlternative5Codec)

  private val createMessagesResponseCodecAlternative6Codec: MediaTypeCodec<MessagesErrorResponse> =
      KotlinxSerializationCodec("createMessages.response.alternative6", MessagesErrorResponse.Serializer, SdkJson)

  internal val createMessagesResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<MessagesErrorResponse> =
      MediaTypeCodecRegistry.of(createMessagesResponseCodecAlternative6Codec)

  private val createMessagesResponseCodecAlternative7Codec: MediaTypeCodec<MessagesErrorResponse> =
      KotlinxSerializationCodec("createMessages.response.alternative7", MessagesErrorResponse.Serializer, SdkJson)

  internal val createMessagesResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<MessagesErrorResponse> =
      MediaTypeCodecRegistry.of(createMessagesResponseCodecAlternative7Codec)

  private val createMessagesResponseCodecAlternative8Codec: MediaTypeCodec<MessagesErrorResponse> =
      KotlinxSerializationCodec("createMessages.response.alternative8", MessagesErrorResponse.Serializer, SdkJson)

  internal val createMessagesResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<MessagesErrorResponse> =
      MediaTypeCodecRegistry.of(createMessagesResponseCodecAlternative8Codec)

  internal val createMessagesRequestCodecRegistry: MediaTypeCodecRegistry<MessagesRequest> =
      MediaTypeCodecRegistry.of(createMessagesRequestCodec)

  internal val createMessagesResponseCodecRegistry: MediaTypeCodecRegistry<MessagesResult> =
      MediaTypeCodecRegistry.of(createMessagesResponseCodec)
}

/**
 * Client for the 'Anthropic Messages' group of OpenRouter API.
 */
public class AnthropicMessagesClient(
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
      SdkExecutor(transport, authentication = this@AnthropicMessagesClient.authentication)

  /**
   * Creates a message using the Anthropic Messages API format. Supports text, images, PDFs, tools, and extended
   * thinking.
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
   * @throws CreateMessagesApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded CreateMessagesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createMessages(
    request: MessagesRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterMetadata: MetadataLevel? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): MessagesResult = executor.executeWithTypedErrors<MessagesRequest, CreateMessagesResponse, MessagesResult>(
    request = SdkExecutionRequest(createMessagesMetadata, baseUri, request, listOf(AnthropicMessagesCodecs.CREATEMESSAGES_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Metadata", values = xOpenRouterMetadata?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AnthropicMessagesCodecs.createMessagesRequestCodecRegistry,
    responseDecoder = CreateMessagesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateMessagesResponse.SuccessJson -> response.json
        is CreateMessagesResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateMessagesResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateMessagesResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateMessagesResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateMessagesResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateMessagesResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateMessagesResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateMessagesResponse.Http529Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateMessagesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateMessagesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateMessagesResponse.Http400Json -> CreateMessagesApiException(response, statusCode, headers)
        is CreateMessagesResponse.Http401Json -> CreateMessagesApiException(response, statusCode, headers)
        is CreateMessagesResponse.Http403Json -> CreateMessagesApiException(response, statusCode, headers)
        is CreateMessagesResponse.Http404Json -> CreateMessagesApiException(response, statusCode, headers)
        is CreateMessagesResponse.Http429Json -> CreateMessagesApiException(response, statusCode, headers)
        is CreateMessagesResponse.Http500Json -> CreateMessagesApiException(response, statusCode, headers)
        is CreateMessagesResponse.Http503Json -> CreateMessagesApiException(response, statusCode, headers)
        is CreateMessagesResponse.Http529Json -> CreateMessagesApiException(response, statusCode, headers)
        is CreateMessagesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Creates a message using the Anthropic Messages API format. Supports text, images, PDFs, tools, and extended
   * thinking.
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
  public suspend fun createMessagesWithResponse(
    request: MessagesRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterMetadata: MetadataLevel? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateMessagesResponse> = executor.executeWithResponse<MessagesRequest, CreateMessagesResponse>(SdkExecutionRequest(createMessagesMetadata, baseUri, request, listOf(AnthropicMessagesCodecs.CREATEMESSAGES_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Metadata", values = xOpenRouterMetadata?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), AnthropicMessagesCodecs.createMessagesRequestCodecRegistry, CreateMessagesResponseDecoder, options)

  /**
   * Creates a message using the Anthropic Messages API format. Supports text, images, PDFs, tools, and extended
   * thinking.
   *
   * Streaming counterpart of this operation's buffered `createMessages()`/`createMessagesWithResponse()` methods: the
   * service can answer the same request either as a single buffered JSON body (use those) or as a `text/event-stream`
   * (use this method) — this method always requests the streaming alternative.
   *
   * The returned `Flow` is cold: no request is sent, and the connection is not opened, until a collector actually
   * starts collecting. Each independent collection opens its own fresh connection; collections are never shared or
   * replayed. Cancelling the collecting coroutine promptly closes the underlying connection; ownership of the response
   * body transfers to the flow for its lifetime and is always released — on normal completion, on a declared terminal
   * sentinel, or on cancellation or failure — a caller never needs to close anything itself.
   *
   * Each event's `data` is decoded as `MessagesStreamingResponse`; a declared terminal sentinel value ends the stream
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
  public fun createMessagesStream(
    request: MessagesRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterMetadata: MetadataLevel? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): Flow<MessagesStreamingResponse> = sseFlow(
    streamProvider = {
      executor.executeRawWithTypedErrors<MessagesRequest, CreateMessagesResponse>(
        request = SdkExecutionRequest(createMessagesMetadataStream, baseUri, request, listOf(AnthropicMessagesCodecs.CREATEMESSAGES_REQUEST_CODEC_ID), buildList {
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Metadata", values = xOpenRouterMetadata?.let { listOf(it.toString()) }.orEmpty()))
          add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
        }),
        requestCodecs = AnthropicMessagesCodecs.createMessagesRequestCodecRegistry,
        responseDecoder = CreateMessagesResponseDecoder,
        mapError = { response, statusCode, headers ->
          when (response) {
            is CreateMessagesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
            is CreateMessagesResponse.Http400Json -> CreateMessagesApiException(response, statusCode, headers)
            is CreateMessagesResponse.Http401Json -> CreateMessagesApiException(response, statusCode, headers)
            is CreateMessagesResponse.Http403Json -> CreateMessagesApiException(response, statusCode, headers)
            is CreateMessagesResponse.Http404Json -> CreateMessagesApiException(response, statusCode, headers)
            is CreateMessagesResponse.Http429Json -> CreateMessagesApiException(response, statusCode, headers)
            is CreateMessagesResponse.Http500Json -> CreateMessagesApiException(response, statusCode, headers)
            is CreateMessagesResponse.Http503Json -> CreateMessagesApiException(response, statusCode, headers)
            is CreateMessagesResponse.Http529Json -> CreateMessagesApiException(response, statusCode, headers)
            is CreateMessagesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
          }
        },
        options = options,
      )
    },
    descriptor = requireNotNull(createMessagesMetadataStream.streaming as? StreamingDescriptor.ServerSentEvents),
  ).decodeData { data -> SdkJson.decodeFromString(MessagesStreamingResponse.Serializer, data) }

  /**
   * Decoded non-success response alternatives that `createMessages` may expose through its typed API exception.
   */
  public sealed interface CreateMessagesError

  /**
   * Typed response alternatives for `createMessages`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CreateMessagesResponse {
    public class SuccessJson(
      public val json: MessagesResult,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateMessagesResponse

    public class Http400Json(
      public val json: MessagesErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateMessagesResponse,
        CreateMessagesError

    public class Http401Json(
      public val json: MessagesErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateMessagesResponse,
        CreateMessagesError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateMessagesResponse,
        CreateMessagesError

    public class Http404Json(
      public val json: MessagesErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateMessagesResponse,
        CreateMessagesError

    public class Http429Json(
      public val json: MessagesErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateMessagesResponse,
        CreateMessagesError

    public class Http500Json(
      public val json: MessagesErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateMessagesResponse,
        CreateMessagesError

    public class Http503Json(
      public val json: MessagesErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateMessagesResponse,
        CreateMessagesError

    public class Http529Json(
      public val json: MessagesErrorResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateMessagesResponse,
        CreateMessagesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateMessagesResponse
  }

  /**
   * Raised by `createMessages` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class CreateMessagesApiException(
    public val error: CreateMessagesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createMessages")

  private object CreateMessagesResponseDecoder : SdkResponseAlternativeDecoder<CreateMessagesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateMessagesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateMessagesResponse> = when {
      alternative.id == "createMessages.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateMessagesResponse.SuccessJson(
          json = AnthropicMessagesCodecs.createMessagesResponseCodecAlternative0Registry.select(listOf("createMessages.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createMessages.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateMessagesResponse.Http400Json(
          json = AnthropicMessagesCodecs.createMessagesResponseCodecAlternative1Registry.select(listOf("createMessages.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createMessages.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateMessagesResponse.Http401Json(
          json = AnthropicMessagesCodecs.createMessagesResponseCodecAlternative2Registry.select(listOf("createMessages.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createMessages.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateMessagesResponse.Http403Json(
          json = AnthropicMessagesCodecs.createMessagesResponseCodecAlternative3Registry.select(listOf("createMessages.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createMessages.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateMessagesResponse.Http404Json(
          json = AnthropicMessagesCodecs.createMessagesResponseCodecAlternative4Registry.select(listOf("createMessages.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createMessages.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateMessagesResponse.Http429Json(
          json = AnthropicMessagesCodecs.createMessagesResponseCodecAlternative5Registry.select(listOf("createMessages.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createMessages.response.alternative6" -> SdkResponseDecodeResult(
        value = CreateMessagesResponse.Http500Json(
          json = AnthropicMessagesCodecs.createMessagesResponseCodecAlternative6Registry.select(listOf("createMessages.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createMessages.response.alternative7" -> SdkResponseDecodeResult(
        value = CreateMessagesResponse.Http503Json(
          json = AnthropicMessagesCodecs.createMessagesResponseCodecAlternative7Registry.select(listOf("createMessages.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createMessages.response.alternative8" -> SdkResponseDecodeResult(
        value = CreateMessagesResponse.Http529Json(
          json = AnthropicMessagesCodecs.createMessagesResponseCodecAlternative8Registry.select(listOf("createMessages.response.alternative8"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CreateMessagesResponse = CreateMessagesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val createMessagesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createMessages",
          method = "POST",
          path = "/messages",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesResult",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative8",
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

    internal val createMessagesMetadataStream: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createMessages",
          method = "POST",
          path = "/messages",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.STREAMING,
          deadlines = SdkDeadlines(null, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesResult",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "MessagesErrorResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createMessages.response.alternative8",
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
