package io.github.nabobery.sdkgen.generated.tts

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
import io.github.nabobery.sdkgen.generated.BadGatewayResponse
import io.github.nabobery.sdkgen.generated.BadRequestResponse
import io.github.nabobery.sdkgen.generated.EdgeNetworkTimeoutResponse
import io.github.nabobery.sdkgen.generated.InternalServerResponse
import io.github.nabobery.sdkgen.generated.NotFoundResponse
import io.github.nabobery.sdkgen.generated.PaymentRequiredResponse
import io.github.nabobery.sdkgen.generated.ProviderOverloadedResponse
import io.github.nabobery.sdkgen.generated.SdkJson
import io.github.nabobery.sdkgen.generated.ServiceUnavailableResponse
import io.github.nabobery.sdkgen.generated.SpeechRequest
import io.github.nabobery.sdkgen.generated.TooManyRequestsResponse
import io.github.nabobery.sdkgen.generated.UnauthorizedResponse
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

internal object TtsCodecs {
  internal const val CREATEAUDIOSPEECH_REQUEST_CODEC_ID: String = "createAudioSpeech.request"

  private val createAudioSpeechRequestCodec: MediaTypeCodec<SpeechRequest> =
      KotlinxSerializationCodec(CREATEAUDIOSPEECH_REQUEST_CODEC_ID, SpeechRequest.Serializer, SdkJson)

  private val createAudioSpeechResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createAudioSpeech.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createAudioSpeechResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createAudioSpeechResponseCodecAlternative1Codec)

  private val createAudioSpeechResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse>
      =
      KotlinxSerializationCodec("createAudioSpeech.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createAudioSpeechResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createAudioSpeechResponseCodecAlternative2Codec)

  private val createAudioSpeechResponseCodecAlternative3Codec:
      MediaTypeCodec<PaymentRequiredResponse> =
      KotlinxSerializationCodec("createAudioSpeech.response.alternative3", PaymentRequiredResponse.Serializer, SdkJson)

  internal val createAudioSpeechResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<PaymentRequiredResponse> =
      MediaTypeCodecRegistry.of(createAudioSpeechResponseCodecAlternative3Codec)

  private val createAudioSpeechResponseCodecAlternative4Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("createAudioSpeech.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  internal val createAudioSpeechResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(createAudioSpeechResponseCodecAlternative4Codec)

  private val createAudioSpeechResponseCodecAlternative5Codec:
      MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("createAudioSpeech.response.alternative5", TooManyRequestsResponse.Serializer, SdkJson)

  internal val createAudioSpeechResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(createAudioSpeechResponseCodecAlternative5Codec)

  private val createAudioSpeechResponseCodecAlternative6Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createAudioSpeech.response.alternative6", InternalServerResponse.Serializer, SdkJson)

  internal val createAudioSpeechResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createAudioSpeechResponseCodecAlternative6Codec)

  private val createAudioSpeechResponseCodecAlternative7Codec: MediaTypeCodec<BadGatewayResponse> =
      KotlinxSerializationCodec("createAudioSpeech.response.alternative7", BadGatewayResponse.Serializer, SdkJson)

  internal val createAudioSpeechResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<BadGatewayResponse> =
      MediaTypeCodecRegistry.of(createAudioSpeechResponseCodecAlternative7Codec)

  private val createAudioSpeechResponseCodecAlternative8Codec:
      MediaTypeCodec<ServiceUnavailableResponse> =
      KotlinxSerializationCodec("createAudioSpeech.response.alternative8", ServiceUnavailableResponse.Serializer, SdkJson)

  internal val createAudioSpeechResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<ServiceUnavailableResponse> =
      MediaTypeCodecRegistry.of(createAudioSpeechResponseCodecAlternative8Codec)

  private val createAudioSpeechResponseCodecAlternative9Codec:
      MediaTypeCodec<EdgeNetworkTimeoutResponse> =
      KotlinxSerializationCodec("createAudioSpeech.response.alternative9", EdgeNetworkTimeoutResponse.Serializer, SdkJson)

  internal val createAudioSpeechResponseCodecAlternative9Registry:
      MediaTypeCodecRegistry<EdgeNetworkTimeoutResponse> =
      MediaTypeCodecRegistry.of(createAudioSpeechResponseCodecAlternative9Codec)

  private val createAudioSpeechResponseCodecAlternative10Codec:
      MediaTypeCodec<ProviderOverloadedResponse> =
      KotlinxSerializationCodec("createAudioSpeech.response.alternative10", ProviderOverloadedResponse.Serializer, SdkJson)

  internal val createAudioSpeechResponseCodecAlternative10Registry:
      MediaTypeCodecRegistry<ProviderOverloadedResponse> =
      MediaTypeCodecRegistry.of(createAudioSpeechResponseCodecAlternative10Codec)

  internal val createAudioSpeechRequestCodecRegistry: MediaTypeCodecRegistry<SpeechRequest> =
      MediaTypeCodecRegistry.of(createAudioSpeechRequestCodec)

  internal val createAudioSpeechResponseCodecRegistry: MediaTypeCodecRegistry<SdkByteStream> =
      MediaTypeCodecRegistry.of()
}

/**
 * Client for the 'TTS' group of OpenRouter API.
 */
public class TtsClient(
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
      SdkExecutor(transport, authentication = this@TtsClient.authentication)

  /**
   * Synthesizes audio from the input text. Returns a raw audio bytestream in the requested format (e.g. mp3, pcm, wav).
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
   * @return Response body stream.
   * @throws CreateAudioSpeechApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CreateAudioSpeechError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createAudioSpeech(
    request: SpeechRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkByteStream = executor.executeWithTypedErrors<SpeechRequest, CreateAudioSpeechResponse, SdkByteStream>(
    request = SdkExecutionRequest(createAudioSpeechMetadata, baseUri, request, listOf(TtsCodecs.CREATEAUDIOSPEECH_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = TtsCodecs.createAudioSpeechRequestCodecRegistry,
    responseDecoder = CreateAudioSpeechResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateAudioSpeechResponse.SuccessValue -> response.bytes
        is CreateAudioSpeechResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioSpeechResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioSpeechResponse.Http402Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioSpeechResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioSpeechResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioSpeechResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioSpeechResponse.Http502Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioSpeechResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioSpeechResponse.Http524Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioSpeechResponse.Http529Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioSpeechResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateAudioSpeechResponse.SuccessValue -> error("Runtime selected a success response for error mapping.")
        is CreateAudioSpeechResponse.Http400Json -> CreateAudioSpeechApiException(response, statusCode, headers)
        is CreateAudioSpeechResponse.Http401Json -> CreateAudioSpeechApiException(response, statusCode, headers)
        is CreateAudioSpeechResponse.Http402Json -> CreateAudioSpeechApiException(response, statusCode, headers)
        is CreateAudioSpeechResponse.Http404Json -> CreateAudioSpeechApiException(response, statusCode, headers)
        is CreateAudioSpeechResponse.Http429Json -> CreateAudioSpeechApiException(response, statusCode, headers)
        is CreateAudioSpeechResponse.Http500Json -> CreateAudioSpeechApiException(response, statusCode, headers)
        is CreateAudioSpeechResponse.Http502Json -> CreateAudioSpeechApiException(response, statusCode, headers)
        is CreateAudioSpeechResponse.Http503Json -> CreateAudioSpeechApiException(response, statusCode, headers)
        is CreateAudioSpeechResponse.Http524Json -> CreateAudioSpeechApiException(response, statusCode, headers)
        is CreateAudioSpeechResponse.Http529Json -> CreateAudioSpeechApiException(response, statusCode, headers)
        is CreateAudioSpeechResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Synthesizes audio from the input text. Returns a raw audio bytestream in the requested format (e.g. mp3, pcm, wav).
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
  public suspend fun createAudioSpeechWithResponse(
    request: SpeechRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateAudioSpeechResponse> = executor.executeWithResponse<SpeechRequest, CreateAudioSpeechResponse>(SdkExecutionRequest(createAudioSpeechMetadata, baseUri, request, listOf(TtsCodecs.CREATEAUDIOSPEECH_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), TtsCodecs.createAudioSpeechRequestCodecRegistry, CreateAudioSpeechResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `createAudioSpeech` may expose through its typed API exception.
   */
  public sealed interface CreateAudioSpeechError

  /**
   * Typed response alternatives for `createAudioSpeech`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CreateAudioSpeechResponse {
    public class SuccessValue(
      public val bytes: SdkByteStream,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse,
        CreateAudioSpeechError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse,
        CreateAudioSpeechError

    public class Http402Json(
      public val json: PaymentRequiredResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse,
        CreateAudioSpeechError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse,
        CreateAudioSpeechError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse,
        CreateAudioSpeechError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse,
        CreateAudioSpeechError

    public class Http502Json(
      public val json: BadGatewayResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse,
        CreateAudioSpeechError

    public class Http503Json(
      public val json: ServiceUnavailableResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse,
        CreateAudioSpeechError

    public class Http524Json(
      public val json: EdgeNetworkTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse,
        CreateAudioSpeechError

    public class Http529Json(
      public val json: ProviderOverloadedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse,
        CreateAudioSpeechError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioSpeechResponse
  }

  /**
   * Raised by `createAudioSpeech` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class CreateAudioSpeechApiException(
    public val error: CreateAudioSpeechError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createAudioSpeech")

  private object CreateAudioSpeechResponseDecoder : SdkResponseAlternativeDecoder<CreateAudioSpeechResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateAudioSpeechResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateAudioSpeechResponse> = when {
      alternative.id == "createAudioSpeech.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateAudioSpeechResponse.SuccessValue(
          bytes = body,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = true,
      )
      alternative.id == "createAudioSpeech.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateAudioSpeechResponse.Http400Json(
          json = TtsCodecs.createAudioSpeechResponseCodecAlternative1Registry.select(listOf("createAudioSpeech.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioSpeech.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateAudioSpeechResponse.Http401Json(
          json = TtsCodecs.createAudioSpeechResponseCodecAlternative2Registry.select(listOf("createAudioSpeech.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioSpeech.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateAudioSpeechResponse.Http402Json(
          json = TtsCodecs.createAudioSpeechResponseCodecAlternative3Registry.select(listOf("createAudioSpeech.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioSpeech.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateAudioSpeechResponse.Http404Json(
          json = TtsCodecs.createAudioSpeechResponseCodecAlternative4Registry.select(listOf("createAudioSpeech.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioSpeech.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateAudioSpeechResponse.Http429Json(
          json = TtsCodecs.createAudioSpeechResponseCodecAlternative5Registry.select(listOf("createAudioSpeech.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioSpeech.response.alternative6" -> SdkResponseDecodeResult(
        value = CreateAudioSpeechResponse.Http500Json(
          json = TtsCodecs.createAudioSpeechResponseCodecAlternative6Registry.select(listOf("createAudioSpeech.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioSpeech.response.alternative7" -> SdkResponseDecodeResult(
        value = CreateAudioSpeechResponse.Http502Json(
          json = TtsCodecs.createAudioSpeechResponseCodecAlternative7Registry.select(listOf("createAudioSpeech.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioSpeech.response.alternative8" -> SdkResponseDecodeResult(
        value = CreateAudioSpeechResponse.Http503Json(
          json = TtsCodecs.createAudioSpeechResponseCodecAlternative8Registry.select(listOf("createAudioSpeech.response.alternative8"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioSpeech.response.alternative9" -> SdkResponseDecodeResult(
        value = CreateAudioSpeechResponse.Http524Json(
          json = TtsCodecs.createAudioSpeechResponseCodecAlternative9Registry.select(listOf("createAudioSpeech.response.alternative9"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioSpeech.response.alternative10" -> SdkResponseDecodeResult(
        value = CreateAudioSpeechResponse.Http529Json(
          json = TtsCodecs.createAudioSpeechResponseCodecAlternative10Registry.select(listOf("createAudioSpeech.response.alternative10"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CreateAudioSpeechResponse = CreateAudioSpeechResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val createAudioSpeechMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createAudioSpeech",
          method = "POST",
          path = "/audio/speech",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("audio/*"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("audio/*"),
              typeTag = "SdkByteStream",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioSpeech.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioSpeech.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioSpeech.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioSpeech.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioSpeech.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioSpeech.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioSpeech.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioSpeech.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "ServiceUnavailableResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioSpeech.response.alternative8",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioSpeech.response.alternative9",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioSpeech.response.alternative10",
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
