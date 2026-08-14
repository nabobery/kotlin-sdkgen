package io.github.nabobery.sdkgen.github.generated.emojis

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
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import io.github.nabobery.sdkgen.github.generated.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer

internal object EmojisCodecs {
  internal const val EMOJISGET_RESPONSE_CODEC_ID: String = "emojis/get.response"

  private val emojisGetResponseCodec: MediaTypeCodec<Map<String, String>> =
      KotlinxSerializationCodec(EMOJISGET_RESPONSE_CODEC_ID, MapSerializer(String.serializer(), String.serializer()), SdkJson)

  private val emojisGetResponseCodecAlternative0Codec: MediaTypeCodec<Map<String, String>> =
      KotlinxSerializationCodec("emojis/get.response.alternative0", MapSerializer(String.serializer(), String.serializer()), SdkJson)

  internal val emojisGetResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<Map<String, String>> =
      MediaTypeCodecRegistry.of(emojisGetResponseCodecAlternative0Codec)

  internal val emojisGetRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val emojisGetResponseCodecRegistry: MediaTypeCodecRegistry<Map<String, String>> =
      MediaTypeCodecRegistry.of(emojisGetResponseCodec)
}

/**
 * Client for the 'emojis' group of GitHub v3 REST API.
 */
public class EmojisClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@EmojisClient.authentication)

  /**
   * Lists all the emojis available to use on GitHub.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws EmojisGetApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded EmojisGetError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun emojisGet(options: CallOptions = CallOptions()): Map<String, String> = executor.executeWithTypedErrors<Unit, EmojisGetResponse, Map<String, String>>(
    request = SdkExecutionRequest(emojisGetMetadata, baseUri, Unit, emptyList(), emptyList()),
    requestCodecs = EmojisCodecs.emojisGetRequestCodecRegistry,
    responseDecoder = EmojisGetResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is EmojisGetResponse.SuccessJson -> response.json
        is EmojisGetResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is EmojisGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is EmojisGetResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is EmojisGetResponse.Http304NoContent -> EmojisGetApiException(response, statusCode, headers)
        is EmojisGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Lists all the emojis available to use on GitHub.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun emojisGetWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<EmojisGetResponse> = executor.executeWithResponse<Unit, EmojisGetResponse>(SdkExecutionRequest(emojisGetMetadata, baseUri, Unit, emptyList(), emptyList()), EmojisCodecs.emojisGetRequestCodecRegistry, EmojisGetResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `emojis/get` may expose through its typed API exception.
   */
  public sealed interface EmojisGetError

  /**
   * Typed response alternatives for `emojis/get`. Non-success alternatives are not converted into success values.
   */
  public sealed interface EmojisGetResponse {
    public class SuccessJson(
      public val json: Map<String, String>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EmojisGetResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EmojisGetResponse,
        EmojisGetError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : EmojisGetResponse
  }

  /**
   * Raised by `emojis/get` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class EmojisGetApiException(
    public val error: EmojisGetError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "emojis/get")

  private object EmojisGetResponseDecoder : SdkResponseAlternativeDecoder<EmojisGetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): EmojisGetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<EmojisGetResponse> = when {
      alternative.id == "emojis/get.response.alternative0" -> SdkResponseDecodeResult(
        value = EmojisGetResponse.SuccessJson(
          json = EmojisCodecs.emojisGetResponseCodecAlternative0Registry.select(listOf("emojis/get.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "emojis/get.response.alternative1" -> SdkResponseDecodeResult(
        value = EmojisGetResponse.Http304NoContent(
          unit = Unit,
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
    ): EmojisGetResponse = EmojisGetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val emojisGetMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "emojis/get",
          method = "GET",
          path = "/emojis",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "Map",
              mode = SdkResponseMode.BUFFERED,
              id = "emojis/get.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "emojis/get.response.alternative1",
            ),
          ),
          security = emptyList(),
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
  }
}
