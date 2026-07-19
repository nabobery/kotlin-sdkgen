package com.nabobery.sdkgen.generated

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
import com.nabobery.sdkgen.runtime.SdkResponseAlternativeDecoder
import com.nabobery.sdkgen.runtime.SdkResponseDecodeResult
import com.nabobery.sdkgen.runtime.SdkResponseMode
import com.nabobery.sdkgen.runtime.SdkResponseResult
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.serializer

public object ResponseShapeCodecs {
  private val jsonFirstResponseCodecAlternative0Codec: MediaTypeCodec<String> =
      KotlinxSerializationCodec("jsonFirst.response.alternative0", String.serializer(), SdkJson)

  public val jsonFirstResponseCodecAlternative0Registry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(jsonFirstResponseCodecAlternative0Codec)

  public val jsonFirstRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  private val binaryFirstResponseCodecAlternative1Codec: MediaTypeCodec<String> =
      KotlinxSerializationCodec("binaryFirst.response.alternative1", String.serializer(), SdkJson)

  public val binaryFirstResponseCodecAlternative1Registry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(binaryFirstResponseCodecAlternative1Codec)

  public val binaryFirstRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public const val COMPATIBLEMEDIA_RESPONSE_CODEC_ID: String = "compatibleMedia.response"

  private val compatibleMediaResponseCodec: MediaTypeCodec<String> =
      KotlinxSerializationCodec(COMPATIBLEMEDIA_RESPONSE_CODEC_ID, String.serializer(), SdkJson)

  private val compatibleMediaResponseCodecAlternative0Codec: MediaTypeCodec<String> =
      KotlinxSerializationCodec("compatibleMedia.response.alternative0", String.serializer(), SdkJson)

  public val compatibleMediaResponseCodecAlternative0Registry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(compatibleMediaResponseCodecAlternative0Codec)

  private val compatibleMediaResponseCodecAlternative1Codec: MediaTypeCodec<String> =
      KotlinxSerializationCodec("compatibleMedia.response.alternative1", String.serializer(), SdkJson)

  public val compatibleMediaResponseCodecAlternative1Registry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(compatibleMediaResponseCodecAlternative1Codec)

  public val compatibleMediaRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val compatibleMediaResponseCodecRegistry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(compatibleMediaResponseCodec)
}

/**
 * Golden client for compatible and incompatible successful response shapes.
 */
public class ResponseShapeClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ResponseShapeClient.authentication)

  /**
   * Golden response-shape regression for 'jsonFirst'.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun jsonFirstWithResponse(options: CallOptions =
    CallOptions()): SdkResponseResult<JsonFirstResponse> = executor.executeWithResponse<Unit,
      JsonFirstResponse>(SdkExecutionRequest(jsonFirstMetadata, baseUri, Unit, emptyList(), emptyList()),
        ResponseShapeCodecs.jsonFirstRequestCodecRegistry, JsonFirstResponseDecoder, options)

  /**
   * Golden response-shape regression for 'binaryFirst'.
   *
   * No unified convenience method is generated because response alternatives decode to different Kotlin types; use this
   * typed result instead.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun binaryFirstWithResponse(options: CallOptions =
    CallOptions()): SdkResponseResult<BinaryFirstResponse> = executor.executeWithResponse<Unit,
      BinaryFirstResponse>(SdkExecutionRequest(binaryFirstMetadata, baseUri, Unit, emptyList(), emptyList()),
        ResponseShapeCodecs.binaryFirstRequestCodecRegistry, BinaryFirstResponseDecoder, options)

  /**
   * Golden response-shape regression for 'compatibleMedia'.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun compatibleMedia(options: CallOptions = CallOptions()): String = executor.execute<Unit,
    String>(SdkExecutionRequest(compatibleMediaMetadata, baseUri, Unit, emptyList(), emptyList()),
      listOf(ResponseShapeCodecs.COMPATIBLEMEDIA_RESPONSE_CODEC_ID), ResponseShapeCodecs
        .compatibleMediaRequestCodecRegistry, ResponseShapeCodecs.compatibleMediaResponseCodecRegistry, options)

  /**
   * Golden response-shape regression for 'compatibleMedia'.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun compatibleMediaWithResponse(options: CallOptions =
    CallOptions()): SdkResponseResult<CompatibleMediaResponse> = executor.executeWithResponse<Unit,
      CompatibleMediaResponse>(SdkExecutionRequest(compatibleMediaMetadata, baseUri, Unit, emptyList(), emptyList()),
        ResponseShapeCodecs.compatibleMediaRequestCodecRegistry, CompatibleMediaResponseDecoder, options)

  /**
   * Typed response alternatives for `jsonFirst`. Non-success alternatives are not converted into success values.
   */
  public sealed interface JsonFirstResponse {
    public class SuccessJson(
      public val json: String,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : JsonFirstResponse

    public class SuccessOctetStream(
      public val bytes: SdkByteStream,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : JsonFirstResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : JsonFirstResponse
  }

  private object JsonFirstResponseDecoder : SdkResponseAlternativeDecoder<JsonFirstResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): JsonFirstResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<JsonFirstResponse> = when {
      alternative.id == "jsonFirst.response.alternative0" -> SdkResponseDecodeResult(
        value = JsonFirstResponse.SuccessJson(
          json = ResponseShapeCodecs.jsonFirstResponseCodecAlternative0Registry
            .select(listOf("jsonFirst.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "jsonFirst.response.alternative1" -> SdkResponseDecodeResult(
        value = JsonFirstResponse.SuccessOctetStream(
          bytes = body,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = true,
      )
      else -> error("No generated response decoder matched the selected response alternative.")
    }

    public override suspend fun decodeUnknown(
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
    ): JsonFirstResponse = JsonFirstResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `binaryFirst`. Non-success alternatives are not converted into success values.
   */
  public sealed interface BinaryFirstResponse {
    public class SuccessOctetStream(
      public val bytes: SdkByteStream,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BinaryFirstResponse

    public class SuccessJson(
      public val json: String,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BinaryFirstResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : BinaryFirstResponse
  }

  private object BinaryFirstResponseDecoder : SdkResponseAlternativeDecoder<BinaryFirstResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): BinaryFirstResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<BinaryFirstResponse> = when {
      alternative.id == "binaryFirst.response.alternative0" -> SdkResponseDecodeResult(
        value = BinaryFirstResponse.SuccessOctetStream(
          bytes = body,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = true,
      )
      alternative.id == "binaryFirst.response.alternative1" -> SdkResponseDecodeResult(
        value = BinaryFirstResponse.SuccessJson(
          json = ResponseShapeCodecs.binaryFirstResponseCodecAlternative1Registry
            .select(listOf("binaryFirst.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
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
    ): BinaryFirstResponse = BinaryFirstResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `compatibleMedia`. Non-success alternatives are not converted into success values.
   */
  public sealed interface CompatibleMediaResponse {
    public class SuccessJson(
      public val json: String,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CompatibleMediaResponse

    public class SuccessVndValueJson(
      public val json: String,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CompatibleMediaResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CompatibleMediaResponse
  }

  private object CompatibleMediaResponseDecoder : SdkResponseAlternativeDecoder<CompatibleMediaResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CompatibleMediaResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CompatibleMediaResponse> = when {
      alternative.id == "compatibleMedia.response.alternative0" -> SdkResponseDecodeResult(
        value = CompatibleMediaResponse.SuccessJson(
          json = ResponseShapeCodecs.compatibleMediaResponseCodecAlternative0Registry
            .select(listOf("compatibleMedia.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "compatibleMedia.response.alternative1" -> SdkResponseDecodeResult(
        value = CompatibleMediaResponse.SuccessVndValueJson(
          json = ResponseShapeCodecs.compatibleMediaResponseCodecAlternative1Registry
            .select(listOf("compatibleMedia.response.alternative1"), mediaType ?: "application/vnd.value+json")
              .decode(body, mediaType ?: "application/vnd.value+json"),
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
    ): CompatibleMediaResponse = CompatibleMediaResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val jsonFirstMetadata: OperationMetadata = OperationMetadata(
          operationId = "jsonFirst",
          method = "GET",
          path = "/jsonFirst",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json", "application/octet-stream"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(null, null, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "String",
              mode = SdkResponseMode.BUFFERED,
              id = "jsonFirst.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/octet-stream"),
              typeTag = "SdkByteStream",
              mode = SdkResponseMode.BUFFERED,
              id = "jsonFirst.response.alternative1",
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
        )

    public val binaryFirstMetadata: OperationMetadata = OperationMetadata(
          operationId = "binaryFirst",
          method = "GET",
          path = "/binaryFirst",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/octet-stream", "application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(null, null, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/octet-stream"),
              typeTag = "SdkByteStream",
              mode = SdkResponseMode.BUFFERED,
              id = "binaryFirst.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "String",
              mode = SdkResponseMode.BUFFERED,
              id = "binaryFirst.response.alternative1",
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
        )

    public val compatibleMediaMetadata: OperationMetadata = OperationMetadata(
          operationId = "compatibleMedia",
          method = "GET",
          path = "/compatibleMedia",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json", "application/vnd.value+json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(null, null, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "String",
              mode = SdkResponseMode.BUFFERED,
              id = "compatibleMedia.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/vnd.value+json"),
              typeTag = "String",
              mode = SdkResponseMode.BUFFERED,
              id = "compatibleMedia.response.alternative1",
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
        )
  }
}
