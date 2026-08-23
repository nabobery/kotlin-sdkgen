package com.nabobery.sdkgen.generated.stt

import com.nabobery.sdkgen.generated.BadGatewayResponse
import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.EdgeNetworkTimeoutResponse
import com.nabobery.sdkgen.generated.InlineAudioTranscriptionsPostRequestMultipartXc57fc157
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.PaymentRequiredResponse
import com.nabobery.sdkgen.generated.ProviderOverloadedResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.ServiceUnavailableResponse
import com.nabobery.sdkgen.generated.SttRequest
import com.nabobery.sdkgen.generated.SttResponse
import com.nabobery.sdkgen.generated.TooManyRequestsResponse
import com.nabobery.sdkgen.generated.UnauthorizedResponse
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
import com.nabobery.sdkgen.runtime.SdkRequestBody
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
import com.nabobery.sdkgen.runtime.bodies.MultipartBody
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set

internal object SttCodecs {
  internal const val CREATEAUDIOTRANSCRIPTIONS_REQUEST_CODEC_ID: String =
      "createAudioTranscriptions.request"

  private val createAudioTranscriptionsRequestCodec: MediaTypeCodec<SttRequest> =
      KotlinxSerializationCodec(CREATEAUDIOTRANSCRIPTIONS_REQUEST_CODEC_ID, SttRequest.Serializer, SdkJson)

  internal const val CREATEAUDIOTRANSCRIPTIONS_RESPONSE_CODEC_ID: String =
      "createAudioTranscriptions.response"

  private val createAudioTranscriptionsResponseCodec: MediaTypeCodec<SttResponse> =
      KotlinxSerializationCodec(CREATEAUDIOTRANSCRIPTIONS_RESPONSE_CODEC_ID, SttResponse.Serializer, SdkJson)

  private val createAudioTranscriptionsResponseCodecAlternative0Codec: MediaTypeCodec<SttResponse> =
      KotlinxSerializationCodec("createAudioTranscriptions.response.alternative0", SttResponse.Serializer, SdkJson)

  internal val createAudioTranscriptionsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<SttResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodecAlternative0Codec)

  private val createAudioTranscriptionsResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("createAudioTranscriptions.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val createAudioTranscriptionsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodecAlternative1Codec)

  private val createAudioTranscriptionsResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("createAudioTranscriptions.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val createAudioTranscriptionsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodecAlternative2Codec)

  private val createAudioTranscriptionsResponseCodecAlternative3Codec:
      MediaTypeCodec<PaymentRequiredResponse> =
      KotlinxSerializationCodec("createAudioTranscriptions.response.alternative3", PaymentRequiredResponse.Serializer, SdkJson)

  internal val createAudioTranscriptionsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<PaymentRequiredResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodecAlternative3Codec)

  private val createAudioTranscriptionsResponseCodecAlternative4Codec:
      MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("createAudioTranscriptions.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  internal val createAudioTranscriptionsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodecAlternative4Codec)

  private val createAudioTranscriptionsResponseCodecAlternative5Codec:
      MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("createAudioTranscriptions.response.alternative5", TooManyRequestsResponse.Serializer, SdkJson)

  internal val createAudioTranscriptionsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodecAlternative5Codec)

  private val createAudioTranscriptionsResponseCodecAlternative6Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("createAudioTranscriptions.response.alternative6", InternalServerResponse.Serializer, SdkJson)

  internal val createAudioTranscriptionsResponseCodecAlternative6Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodecAlternative6Codec)

  private val createAudioTranscriptionsResponseCodecAlternative7Codec:
      MediaTypeCodec<BadGatewayResponse> =
      KotlinxSerializationCodec("createAudioTranscriptions.response.alternative7", BadGatewayResponse.Serializer, SdkJson)

  internal val createAudioTranscriptionsResponseCodecAlternative7Registry:
      MediaTypeCodecRegistry<BadGatewayResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodecAlternative7Codec)

  private val createAudioTranscriptionsResponseCodecAlternative8Codec:
      MediaTypeCodec<ServiceUnavailableResponse> =
      KotlinxSerializationCodec("createAudioTranscriptions.response.alternative8", ServiceUnavailableResponse.Serializer, SdkJson)

  internal val createAudioTranscriptionsResponseCodecAlternative8Registry:
      MediaTypeCodecRegistry<ServiceUnavailableResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodecAlternative8Codec)

  private val createAudioTranscriptionsResponseCodecAlternative9Codec:
      MediaTypeCodec<EdgeNetworkTimeoutResponse> =
      KotlinxSerializationCodec("createAudioTranscriptions.response.alternative9", EdgeNetworkTimeoutResponse.Serializer, SdkJson)

  internal val createAudioTranscriptionsResponseCodecAlternative9Registry:
      MediaTypeCodecRegistry<EdgeNetworkTimeoutResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodecAlternative9Codec)

  private val createAudioTranscriptionsResponseCodecAlternative10Codec:
      MediaTypeCodec<ProviderOverloadedResponse> =
      KotlinxSerializationCodec("createAudioTranscriptions.response.alternative10", ProviderOverloadedResponse.Serializer, SdkJson)

  internal val createAudioTranscriptionsResponseCodecAlternative10Registry:
      MediaTypeCodecRegistry<ProviderOverloadedResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodecAlternative10Codec)

  internal val createAudioTranscriptionsRequestCodecRegistry: MediaTypeCodecRegistry<SttRequest> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsRequestCodec)

  internal val createAudioTranscriptionsResponseCodecRegistry: MediaTypeCodecRegistry<SttResponse> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsResponseCodec)

  internal const val CREATE_AUDIO_TRANSCRIPTIONS_MULTIPART_REQUEST_CODEC_ID: String =
      "createAudioTranscriptions.requestMultipart"

  private val createAudioTranscriptionsMultipartRequestCodec:
      MediaTypeCodec<InlineAudioTranscriptionsPostRequestMultipartXc57fc157> =
      CreateAudioTranscriptionsMultipartMultipartCodec

  internal val createAudioTranscriptionsMultipartRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineAudioTranscriptionsPostRequestMultipartXc57fc157> =
      MediaTypeCodecRegistry.of(createAudioTranscriptionsMultipartRequestCodec)

  internal object CreateAudioTranscriptionsMultipartMultipartCodec : MediaTypeCodec<InlineAudioTranscriptionsPostRequestMultipartXc57fc157> {
    override val id: String = "createAudioTranscriptions.requestMultipart"

    override val mediaTypes: Set<String> = setOf("multipart/form-data")

    override suspend fun encode(`value`: InlineAudioTranscriptionsPostRequestMultipartXc57fc157, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val multipart = MultipartBody()
      multipart.binary(name = "file", stream = request.file, mediaType = "application/octet-stream", headers = listOf())
      request.language?.let {
        multipart.text(name = "language", value = it, mediaType = "text/plain", headers = listOf())
      }
      multipart.text(name = "model", value = request.model, mediaType = "text/plain", headers = listOf())
      request.responseFormat?.let {
        multipart.text(name = "response_format", value = it.value, mediaType = "text/plain", headers = listOf())
      }
      request.temperature?.let {
        multipart.bytes(name = "temperature", value = SdkJson.encodeToString(it).encodeToByteArray(), mediaType = "application/json", headers = listOf())
      }
      request.timestampGranularities?.let {
        if (it.isEmpty()) {
          multipart.text(name = "timestamp_granularities[]", value = "", mediaType = "text/plain", headers = listOf())
        } else {
          it.forEachIndexed { index, element ->
            multipart.text(name = "timestamp_granularities[]", value = element.value, mediaType = "text/plain", headers = listOf())
          }
        }
      }
      return multipart.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): InlineAudioTranscriptionsPostRequestMultipartXc57fc157 {
      error("Multipart request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client for the 'STT' group of OpenRouter API.
 */
public class SttClient(
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
      SdkExecutor(transport, authentication = this@SttClient.authentication)

  /**
   * Transcribes audio into text. Accepts base64-encoded audio input as JSON or an OpenAI-style multipart/form-data file
   * upload, and returns the transcribed text.
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
   * @throws CreateAudioTranscriptionsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CreateAudioTranscriptionsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createAudioTranscriptions(
    request: SttRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SttResponse = executor.executeWithTypedErrors<SttRequest, CreateAudioTranscriptionsResponse, SttResponse>(
    request = SdkExecutionRequest(createAudioTranscriptionsMetadata, baseUri, request, listOf(SttCodecs.CREATEAUDIOTRANSCRIPTIONS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SttCodecs.createAudioTranscriptionsRequestCodecRegistry,
    responseDecoder = CreateAudioTranscriptionsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateAudioTranscriptionsResponse.SuccessJson -> response.json
        is CreateAudioTranscriptionsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http402Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http502Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http524Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http529Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateAudioTranscriptionsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateAudioTranscriptionsResponse.Http400Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http401Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http402Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http404Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http429Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http500Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http502Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http503Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http524Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http529Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Transcribes audio into text. Accepts base64-encoded audio input as JSON or an OpenAI-style multipart/form-data file
   * upload, and returns the transcribed text.
   *
   * Encodes the request body as multipart/form-data; this operation's other request media families are served by
   * sibling callable variants.
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
   * @throws CreateAudioTranscriptionsApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CreateAudioTranscriptionsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createAudioTranscriptionsMultipart(
    request: InlineAudioTranscriptionsPostRequestMultipartXc57fc157,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SttResponse = executor.executeWithTypedErrors<InlineAudioTranscriptionsPostRequestMultipartXc57fc157, CreateAudioTranscriptionsResponse, SttResponse>(
    request = SdkExecutionRequest(createAudioTranscriptionsMultipartMetadata, baseUri, request, listOf(SttCodecs.CREATE_AUDIO_TRANSCRIPTIONS_MULTIPART_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = SttCodecs.createAudioTranscriptionsMultipartRequestCodecRegistry,
    responseDecoder = CreateAudioTranscriptionsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateAudioTranscriptionsResponse.SuccessJson -> response.json
        is CreateAudioTranscriptionsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http402Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http429Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http502Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http503Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http524Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Http529Json -> error("Runtime selected a non-success response for success mapping.")
        is CreateAudioTranscriptionsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateAudioTranscriptionsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateAudioTranscriptionsResponse.Http400Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http401Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http402Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http404Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http429Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http500Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http502Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http503Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http524Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Http529Json -> CreateAudioTranscriptionsApiException(response, statusCode, headers)
        is CreateAudioTranscriptionsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Transcribes audio into text. Accepts base64-encoded audio input as JSON or an OpenAI-style multipart/form-data file
   * upload, and returns the transcribed text.
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
  public suspend fun createAudioTranscriptionsWithResponse(
    request: SttRequest,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateAudioTranscriptionsResponse> = executor.executeWithResponse<SttRequest, CreateAudioTranscriptionsResponse>(SdkExecutionRequest(createAudioTranscriptionsMetadata, baseUri, request, listOf(SttCodecs.CREATEAUDIOTRANSCRIPTIONS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), SttCodecs.createAudioTranscriptionsRequestCodecRegistry, CreateAudioTranscriptionsResponseDecoder, options)

  /**
   * Transcribes audio into text. Accepts base64-encoded audio input as JSON or an OpenAI-style multipart/form-data file
   * upload, and returns the transcribed text.
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
  public suspend fun createAudioTranscriptionsMultipartWithResponse(
    request: InlineAudioTranscriptionsPostRequestMultipartXc57fc157,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateAudioTranscriptionsResponse> = executor.executeWithResponse<InlineAudioTranscriptionsPostRequestMultipartXc57fc157, CreateAudioTranscriptionsResponse>(SdkExecutionRequest(createAudioTranscriptionsMultipartMetadata, baseUri, request, listOf(SttCodecs.CREATE_AUDIO_TRANSCRIPTIONS_MULTIPART_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), SttCodecs.createAudioTranscriptionsMultipartRequestCodecRegistry, CreateAudioTranscriptionsResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `createAudioTranscriptions` may expose through its typed API
   * exception.
   */
  public sealed interface CreateAudioTranscriptionsError

  /**
   * Typed response alternatives for `createAudioTranscriptions`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface CreateAudioTranscriptionsResponse {
    public class SuccessJson(
      public val json: SttResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse,
        CreateAudioTranscriptionsError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse,
        CreateAudioTranscriptionsError

    public class Http402Json(
      public val json: PaymentRequiredResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse,
        CreateAudioTranscriptionsError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse,
        CreateAudioTranscriptionsError

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse,
        CreateAudioTranscriptionsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse,
        CreateAudioTranscriptionsError

    public class Http502Json(
      public val json: BadGatewayResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse,
        CreateAudioTranscriptionsError

    public class Http503Json(
      public val json: ServiceUnavailableResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse,
        CreateAudioTranscriptionsError

    public class Http524Json(
      public val json: EdgeNetworkTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse,
        CreateAudioTranscriptionsError

    public class Http529Json(
      public val json: ProviderOverloadedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse,
        CreateAudioTranscriptionsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateAudioTranscriptionsResponse
  }

  /**
   * Raised by `createAudioTranscriptions` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CreateAudioTranscriptionsApiException(
    public val error: CreateAudioTranscriptionsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createAudioTranscriptions")

  private object CreateAudioTranscriptionsResponseDecoder : SdkResponseAlternativeDecoder<CreateAudioTranscriptionsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateAudioTranscriptionsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateAudioTranscriptionsResponse> = when {
      alternative.id == "createAudioTranscriptions.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateAudioTranscriptionsResponse.SuccessJson(
          json = SttCodecs.createAudioTranscriptionsResponseCodecAlternative0Registry.select(listOf("createAudioTranscriptions.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioTranscriptions.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateAudioTranscriptionsResponse.Http400Json(
          json = SttCodecs.createAudioTranscriptionsResponseCodecAlternative1Registry.select(listOf("createAudioTranscriptions.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioTranscriptions.response.alternative2" -> SdkResponseDecodeResult(
        value = CreateAudioTranscriptionsResponse.Http401Json(
          json = SttCodecs.createAudioTranscriptionsResponseCodecAlternative2Registry.select(listOf("createAudioTranscriptions.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioTranscriptions.response.alternative3" -> SdkResponseDecodeResult(
        value = CreateAudioTranscriptionsResponse.Http402Json(
          json = SttCodecs.createAudioTranscriptionsResponseCodecAlternative3Registry.select(listOf("createAudioTranscriptions.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioTranscriptions.response.alternative4" -> SdkResponseDecodeResult(
        value = CreateAudioTranscriptionsResponse.Http404Json(
          json = SttCodecs.createAudioTranscriptionsResponseCodecAlternative4Registry.select(listOf("createAudioTranscriptions.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioTranscriptions.response.alternative5" -> SdkResponseDecodeResult(
        value = CreateAudioTranscriptionsResponse.Http429Json(
          json = SttCodecs.createAudioTranscriptionsResponseCodecAlternative5Registry.select(listOf("createAudioTranscriptions.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioTranscriptions.response.alternative6" -> SdkResponseDecodeResult(
        value = CreateAudioTranscriptionsResponse.Http500Json(
          json = SttCodecs.createAudioTranscriptionsResponseCodecAlternative6Registry.select(listOf("createAudioTranscriptions.response.alternative6"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioTranscriptions.response.alternative7" -> SdkResponseDecodeResult(
        value = CreateAudioTranscriptionsResponse.Http502Json(
          json = SttCodecs.createAudioTranscriptionsResponseCodecAlternative7Registry.select(listOf("createAudioTranscriptions.response.alternative7"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioTranscriptions.response.alternative8" -> SdkResponseDecodeResult(
        value = CreateAudioTranscriptionsResponse.Http503Json(
          json = SttCodecs.createAudioTranscriptionsResponseCodecAlternative8Registry.select(listOf("createAudioTranscriptions.response.alternative8"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioTranscriptions.response.alternative9" -> SdkResponseDecodeResult(
        value = CreateAudioTranscriptionsResponse.Http524Json(
          json = SttCodecs.createAudioTranscriptionsResponseCodecAlternative9Registry.select(listOf("createAudioTranscriptions.response.alternative9"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createAudioTranscriptions.response.alternative10" -> SdkResponseDecodeResult(
        value = CreateAudioTranscriptionsResponse.Http529Json(
          json = SttCodecs.createAudioTranscriptionsResponseCodecAlternative10Registry.select(listOf("createAudioTranscriptions.response.alternative10"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CreateAudioTranscriptionsResponse = CreateAudioTranscriptionsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val createAudioTranscriptionsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createAudioTranscriptions",
          method = "POST",
          path = "/audio/transcriptions",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SttResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "ServiceUnavailableResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative8",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative9",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative10",
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

    internal val createAudioTranscriptionsMultipartMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createAudioTranscriptions",
          method = "POST",
          path = "/audio/transcriptions",
          requestMediaTypes = listOf("multipart/form-data"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "SttResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 402),
              mediaTypes = listOf("application/json"),
              typeTag = "PaymentRequiredResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative5",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative6",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 502),
              mediaTypes = listOf("application/json"),
              typeTag = "BadGatewayResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative7",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 503),
              mediaTypes = listOf("application/json"),
              typeTag = "ServiceUnavailableResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative8",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 524),
              mediaTypes = listOf("application/json"),
              typeTag = "EdgeNetworkTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative9",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 529),
              mediaTypes = listOf("application/json"),
              typeTag = "ProviderOverloadedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "createAudioTranscriptions.response.alternative10",
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
