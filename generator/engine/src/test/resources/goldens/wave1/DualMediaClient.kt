package com.example.generated

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
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import com.nabobery.sdkgen.runtime.bodies.MultipartBody
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set

internal object DualMediaCodecs {
  internal const val CREATE_TRANSCRIPTION_REQUEST_CODEC_ID: String = "createTranscription.request"

  private val createTranscriptionRequestCodec: MediaTypeCodec<TranscribeJsonRequest> =
      KotlinxSerializationCodec(CREATE_TRANSCRIPTION_REQUEST_CODEC_ID, TranscribeJsonRequest.Serializer, SdkJson)

  internal const val CREATE_TRANSCRIPTION_RESPONSE_CODEC_ID: String = "createTranscription.response"

  private val createTranscriptionResponseCodec: MediaTypeCodec<Transcription> =
      KotlinxSerializationCodec(CREATE_TRANSCRIPTION_RESPONSE_CODEC_ID, Transcription.Serializer, SdkJson)

  private val createTranscriptionResponseCodecAlternative0Codec: MediaTypeCodec<Transcription> =
      KotlinxSerializationCodec("createTranscription.response.alternative0", Transcription.Serializer, SdkJson)

  internal val createTranscriptionResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Transcription> =
      MediaTypeCodecRegistry.of(createTranscriptionResponseCodecAlternative0Codec)

  private val createTranscriptionResponseCodecAlternative1Codec: MediaTypeCodec<ApiError> =
      KotlinxSerializationCodec("createTranscription.response.alternative1", ApiError.Serializer, SdkJson)

  internal val createTranscriptionResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<ApiError> =
      MediaTypeCodecRegistry.of(createTranscriptionResponseCodecAlternative1Codec)

  internal val createTranscriptionRequestCodecRegistry:
      MediaTypeCodecRegistry<TranscribeJsonRequest> =
      MediaTypeCodecRegistry.of(createTranscriptionRequestCodec)

  internal val createTranscriptionResponseCodecRegistry: MediaTypeCodecRegistry<Transcription> =
      MediaTypeCodecRegistry.of(createTranscriptionResponseCodec)

  internal const val CREATE_TRANSCRIPTION_MULTIPART_REQUEST_CODEC_ID: String =
      "createTranscription.requestMultipart"

  private val createTranscriptionMultipartRequestCodec: MediaTypeCodec<TranscribeMultipartRequest> =
      CreateTranscriptionMultipartMultipartCodec

  internal val createTranscriptionMultipartRequestCodecRegistry:
      MediaTypeCodecRegistry<TranscribeMultipartRequest> =
      MediaTypeCodecRegistry.of(createTranscriptionMultipartRequestCodec)

  internal object CreateTranscriptionMultipartMultipartCodec : MediaTypeCodec<TranscribeMultipartRequest> {
    override val id: String = "createTranscription.requestMultipart"

    override val mediaTypes: Set<String> = setOf("multipart/form-data")

    override suspend fun encode(`value`: TranscribeMultipartRequest, mediaType: String): SdkRequestBody {
      val request = requireNotNull(value)
      val multipart = MultipartBody()
      multipart.binary(name = "file", stream = request.file, mediaType = "audio/wav", headers = listOf())
      request.caption?.let {
        multipart.text(name = "caption", value = it, mediaType = "text/plain", headers = listOf())
      }
      return multipart.build()
    }

    override suspend fun decode(body: SdkByteStream, mediaType: String?): TranscribeMultipartRequest {
      error("Multipart request codecs do not decode response bodies.")
    }
  }
}

/**
 * Client exposing one callable method per request-media variant.
 */
public class DualMediaClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@DualMediaClient.authentication)

  /**
   * Transcribes audio from a JSON payload or a multipart upload.
   *
   * @param request Request body sent to the operation.
   * @param model Wire parameter `model`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CreateTranscriptionApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CreateTranscriptionError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createTranscription(
    request: TranscribeJsonRequest,
    model: String? = null,
    options: CallOptions = CallOptions(),
  ): Transcription = executor.executeWithTypedErrors<TranscribeJsonRequest, CreateTranscriptionResponse, Transcription>(
    request = SdkExecutionRequest(metadata, baseUri, request, listOf(DualMediaCodecs.CREATE_TRANSCRIPTION_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = DualMediaCodecs.createTranscriptionRequestCodecRegistry,
    responseDecoder = CreateTranscriptionResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateTranscriptionResponse.SuccessJson -> response.json
        is CreateTranscriptionResponse.Http400To499ProblemJson -> error("Runtime selected a non-success response for success mapping.")
        is CreateTranscriptionResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateTranscriptionResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateTranscriptionResponse.Http400To499ProblemJson -> CreateTranscriptionApiException(response, statusCode, headers)
        is CreateTranscriptionResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Transcribes audio from a JSON payload or a multipart upload.
   *
   * Encodes the request body as multipart/form-data; this operation's other request media families are served by
   * sibling callable variants.
   *
   * @param request Request body sent to the operation.
   * @param model Wire parameter `model`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CreateTranscriptionApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded CreateTranscriptionError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun createTranscriptionMultipart(
    request: TranscribeMultipartRequest,
    model: String? = null,
    options: CallOptions = CallOptions(),
  ): Transcription = executor.executeWithTypedErrors<TranscribeMultipartRequest, CreateTranscriptionResponse, Transcription>(
    request = SdkExecutionRequest(createTranscriptionMultipartMetadata, baseUri, request, listOf(DualMediaCodecs.CREATE_TRANSCRIPTION_MULTIPART_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = DualMediaCodecs.createTranscriptionMultipartRequestCodecRegistry,
    responseDecoder = CreateTranscriptionResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CreateTranscriptionResponse.SuccessJson -> response.json
        is CreateTranscriptionResponse.Http400To499ProblemJson -> error("Runtime selected a non-success response for success mapping.")
        is CreateTranscriptionResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CreateTranscriptionResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CreateTranscriptionResponse.Http400To499ProblemJson -> CreateTranscriptionApiException(response, statusCode, headers)
        is CreateTranscriptionResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Transcribes audio from a JSON payload or a multipart upload.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param model Wire parameter `model`.
   * @param options Execution options.
   */
  public suspend fun createTranscriptionWithResponse(
    request: TranscribeJsonRequest,
    model: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateTranscriptionResponse> = executor.executeWithResponse<TranscribeJsonRequest, CreateTranscriptionResponse>(SdkExecutionRequest(metadata, baseUri, request, listOf(DualMediaCodecs.CREATE_TRANSCRIPTION_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
  }), DualMediaCodecs.createTranscriptionRequestCodecRegistry, CreateTranscriptionResponseDecoder, options)

  /**
   * Transcribes audio from a JSON payload or a multipart upload.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param model Wire parameter `model`.
   * @param options Execution options.
   */
  public suspend fun createTranscriptionMultipartWithResponse(
    request: TranscribeMultipartRequest,
    model: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<CreateTranscriptionResponse> = executor.executeWithResponse<TranscribeMultipartRequest, CreateTranscriptionResponse>(SdkExecutionRequest(createTranscriptionMultipartMetadata, baseUri, request, listOf(DualMediaCodecs.CREATE_TRANSCRIPTION_MULTIPART_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model", values = model?.let { listOf(it.toString()) }.orEmpty()))
  }), DualMediaCodecs.createTranscriptionMultipartRequestCodecRegistry, CreateTranscriptionResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `createTranscription` may expose through its typed API exception.
   */
  public sealed interface CreateTranscriptionError

  /**
   * Typed response alternatives for `createTranscription`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface CreateTranscriptionResponse {
    public class SuccessJson(
      public val json: Transcription,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateTranscriptionResponse

    public class Http400To499ProblemJson(
      public val json: ApiError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateTranscriptionResponse,
        CreateTranscriptionError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CreateTranscriptionResponse
  }

  /**
   * Raised by `createTranscription` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class CreateTranscriptionApiException(
    public val error: CreateTranscriptionError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "createTranscription")

  private object CreateTranscriptionResponseDecoder : SdkResponseAlternativeDecoder<CreateTranscriptionResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CreateTranscriptionResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CreateTranscriptionResponse> = when {
      alternative.id == "createTranscription.response.alternative0" -> SdkResponseDecodeResult(
        value = CreateTranscriptionResponse.SuccessJson(
          json = DualMediaCodecs.createTranscriptionResponseCodecAlternative0Registry.select(listOf("createTranscription.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "createTranscription.response.alternative1" -> SdkResponseDecodeResult(
        value = CreateTranscriptionResponse.Http400To499ProblemJson(
          json = DualMediaCodecs.createTranscriptionResponseCodecAlternative1Registry.select(listOf("createTranscription.response.alternative1"), mediaType ?: "application/problem+json").decode(body, mediaType ?: "application/problem+json"),
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
    ): CreateTranscriptionResponse = CreateTranscriptionResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val metadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createTranscription",
          method = "POST",
          path = "/audio/transcriptions",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 30_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Transcription",
              mode = SdkResponseMode.BUFFERED,
              id = "createTranscription.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.StatusRange(firstInclusive = 400, lastInclusive = 499),
              mediaTypes = listOf("application/problem+json"),
              typeTag = "ApiError",
              mode = SdkResponseMode.BUFFERED,
              id = "createTranscription.response.alternative1",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = null,
            backoff = null,
          ),
          pagination = null,
          streaming = null,
        ) }

    internal val createTranscriptionMultipartMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "createTranscription",
          method = "POST",
          path = "/audio/transcriptions",
          requestMediaTypes = listOf("multipart/form-data"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 30_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Transcription",
              mode = SdkResponseMode.BUFFERED,
              id = "createTranscription.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.StatusRange(firstInclusive = 400, lastInclusive = 499),
              mediaTypes = listOf("application/problem+json"),
              typeTag = "ApiError",
              mode = SdkResponseMode.BUFFERED,
              id = "createTranscription.response.alternative1",
            ),
          ),
          security = emptyList(),
          safety = OperationSafety(safe = false, idempotent = false),
          idempotency = null,
          retry = RetryDescriptor(
            retryableStatusCodes = emptyList(),
            retryConnectionErrors = false,
            maxAttempts = null,
            backoff = null,
          ),
          pagination = null,
          streaming = null,
        ) }
  }
}
