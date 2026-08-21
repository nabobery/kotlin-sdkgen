package com.nabobery.sdkgen.github.generated.codesofconduct

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.CodeOfConduct
import com.nabobery.sdkgen.github.generated.SdkJson
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
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer

internal object CodesOfConductCodecs {
  internal const val CODESOFCONDUCTGETALLCODESOFCONDUCT_RESPONSE_CODEC_ID: String =
      "codes-of-conduct/get-all-codes-of-conduct.response"

  private val codesOfConductGetAllCodesOfConductResponseCodec: MediaTypeCodec<List<CodeOfConduct>> =
      KotlinxSerializationCodec(CODESOFCONDUCTGETALLCODESOFCONDUCT_RESPONSE_CODEC_ID, ListSerializer(CodeOfConduct.Serializer), SdkJson)

  private val codesOfConductGetAllCodesOfConductResponseCodecAlternative0Codec:
      MediaTypeCodec<List<CodeOfConduct>> =
      KotlinxSerializationCodec("codes-of-conduct/get-all-codes-of-conduct.response.alternative0", ListSerializer(CodeOfConduct.Serializer), SdkJson)

  internal val codesOfConductGetAllCodesOfConductResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<CodeOfConduct>> =
      MediaTypeCodecRegistry.of(codesOfConductGetAllCodesOfConductResponseCodecAlternative0Codec)

  internal val codesOfConductGetAllCodesOfConductRequestCodecRegistry: MediaTypeCodecRegistry<Unit>
      = MediaTypeCodecRegistry.of()

  internal val codesOfConductGetAllCodesOfConductResponseCodecRegistry:
      MediaTypeCodecRegistry<List<CodeOfConduct>> =
      MediaTypeCodecRegistry.of(codesOfConductGetAllCodesOfConductResponseCodec)

  internal const val CODESOFCONDUCTGETCONDUCTCODE_RESPONSE_CODEC_ID: String =
      "codes-of-conduct/get-conduct-code.response"

  private val codesOfConductGetConductCodeResponseCodec: MediaTypeCodec<CodeOfConduct> =
      KotlinxSerializationCodec(CODESOFCONDUCTGETCONDUCTCODE_RESPONSE_CODEC_ID, CodeOfConduct.Serializer, SdkJson)

  private val codesOfConductGetConductCodeResponseCodecAlternative0Codec:
      MediaTypeCodec<CodeOfConduct> =
      KotlinxSerializationCodec("codes-of-conduct/get-conduct-code.response.alternative0", CodeOfConduct.Serializer, SdkJson)

  internal val codesOfConductGetConductCodeResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<CodeOfConduct> =
      MediaTypeCodecRegistry.of(codesOfConductGetConductCodeResponseCodecAlternative0Codec)

  private val codesOfConductGetConductCodeResponseCodecAlternative2Codec: MediaTypeCodec<BasicError>
      =
      KotlinxSerializationCodec("codes-of-conduct/get-conduct-code.response.alternative2", BasicError.Serializer, SdkJson)

  internal val codesOfConductGetConductCodeResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(codesOfConductGetConductCodeResponseCodecAlternative2Codec)

  internal val codesOfConductGetConductCodeRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val codesOfConductGetConductCodeResponseCodecRegistry:
      MediaTypeCodecRegistry<CodeOfConduct> =
      MediaTypeCodecRegistry.of(codesOfConductGetConductCodeResponseCodec)
}

/**
 * Client for the 'codes-of-conduct' group of GitHub v3 REST API.
 */
public class CodesOfConductClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@CodesOfConductClient.authentication)

  /**
   * Returns array of all GitHub's codes of conduct.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodesOfConductGetAllCodesOfConductApiException When the service returns a declared non-success response;
   * its `error` property exposes the decoded CodesOfConductGetAllCodesOfConductError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codesOfConductGetAllCodesOfConduct(options: CallOptions = CallOptions()): List<CodeOfConduct> = executor.executeWithTypedErrors<Unit, CodesOfConductGetAllCodesOfConductResponse, List<CodeOfConduct>>(
    request = SdkExecutionRequest(codesOfConductGetAllCodesOfConductMetadata, baseUri, Unit, emptyList(), emptyList()),
    requestCodecs = CodesOfConductCodecs.codesOfConductGetAllCodesOfConductRequestCodecRegistry,
    responseDecoder = CodesOfConductGetAllCodesOfConductResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodesOfConductGetAllCodesOfConductResponse.SuccessJson -> response.json
        is CodesOfConductGetAllCodesOfConductResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodesOfConductGetAllCodesOfConductResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodesOfConductGetAllCodesOfConductResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodesOfConductGetAllCodesOfConductResponse.Http304NoContent -> CodesOfConductGetAllCodesOfConductApiException(response, statusCode, headers)
        is CodesOfConductGetAllCodesOfConductResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns array of all GitHub's codes of conduct.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun codesOfConductGetAllCodesOfConductWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<CodesOfConductGetAllCodesOfConductResponse> = executor.executeWithResponse<Unit, CodesOfConductGetAllCodesOfConductResponse>(SdkExecutionRequest(codesOfConductGetAllCodesOfConductMetadata, baseUri, Unit, emptyList(), emptyList()), CodesOfConductCodecs.codesOfConductGetAllCodesOfConductRequestCodecRegistry, CodesOfConductGetAllCodesOfConductResponseDecoder, options)

  /**
   * Returns information about the specified GitHub code of conduct.
   *
   * @param key Wire parameter `key`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws CodesOfConductGetConductCodeApiException When the service returns a declared non-success response; its
   * `error` property exposes the decoded CodesOfConductGetConductCodeError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun codesOfConductGetConductCode(key: String, options: CallOptions = CallOptions()): CodeOfConduct = executor.executeWithTypedErrors<Unit, CodesOfConductGetConductCodeResponse, CodeOfConduct>(
    request = SdkExecutionRequest(codesOfConductGetConductCodeMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "key", values = listOf(key.toString())))
    }),
    requestCodecs = CodesOfConductCodecs.codesOfConductGetConductCodeRequestCodecRegistry,
    responseDecoder = CodesOfConductGetConductCodeResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is CodesOfConductGetConductCodeResponse.SuccessJson -> response.json
        is CodesOfConductGetConductCodeResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is CodesOfConductGetConductCodeResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is CodesOfConductGetConductCodeResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is CodesOfConductGetConductCodeResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is CodesOfConductGetConductCodeResponse.Http304NoContent -> CodesOfConductGetConductCodeApiException(response, statusCode, headers)
        is CodesOfConductGetConductCodeResponse.Http404Json -> CodesOfConductGetConductCodeApiException(response, statusCode, headers)
        is CodesOfConductGetConductCodeResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns information about the specified GitHub code of conduct.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param key Wire parameter `key`.
   * @param options Execution options.
   */
  public suspend fun codesOfConductGetConductCodeWithResponse(key: String, options: CallOptions = CallOptions()): SdkResponseResult<CodesOfConductGetConductCodeResponse> = executor.executeWithResponse<Unit, CodesOfConductGetConductCodeResponse>(SdkExecutionRequest(codesOfConductGetConductCodeMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "key", values = listOf(key.toString())))
  }), CodesOfConductCodecs.codesOfConductGetConductCodeRequestCodecRegistry, CodesOfConductGetConductCodeResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `codes-of-conduct/get-all-codes-of-conduct` may expose through its
   * typed API exception.
   */
  public sealed interface CodesOfConductGetAllCodesOfConductError

  /**
   * Typed response alternatives for `codes-of-conduct/get-all-codes-of-conduct`. Non-success alternatives are not
   * converted into success values.
   */
  public sealed interface CodesOfConductGetAllCodesOfConductResponse {
    public class SuccessJson(
      public val json: List<CodeOfConduct>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodesOfConductGetAllCodesOfConductResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodesOfConductGetAllCodesOfConductResponse,
        CodesOfConductGetAllCodesOfConductError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodesOfConductGetAllCodesOfConductResponse
  }

  /**
   * Raised by `codes-of-conduct/get-all-codes-of-conduct` after decoding a declared non-success response. [error] is
   * typed and is not included in the exception message or diagnostic rendering.
   */
  public class CodesOfConductGetAllCodesOfConductApiException(
    public val error: CodesOfConductGetAllCodesOfConductError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codes-of-conduct/get-all-codes-of-conduct")

  private object CodesOfConductGetAllCodesOfConductResponseDecoder : SdkResponseAlternativeDecoder<CodesOfConductGetAllCodesOfConductResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodesOfConductGetAllCodesOfConductResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodesOfConductGetAllCodesOfConductResponse> = when {
      alternative.id == "codes-of-conduct/get-all-codes-of-conduct.response.alternative0" -> SdkResponseDecodeResult(
        value = CodesOfConductGetAllCodesOfConductResponse.SuccessJson(
          json = CodesOfConductCodecs.codesOfConductGetAllCodesOfConductResponseCodecAlternative0Registry.select(listOf("codes-of-conduct/get-all-codes-of-conduct.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codes-of-conduct/get-all-codes-of-conduct.response.alternative1" -> SdkResponseDecodeResult(
        value = CodesOfConductGetAllCodesOfConductResponse.Http304NoContent(
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
    ): CodesOfConductGetAllCodesOfConductResponse = CodesOfConductGetAllCodesOfConductResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `codes-of-conduct/get-conduct-code` may expose through its typed API
   * exception.
   */
  public sealed interface CodesOfConductGetConductCodeError

  /**
   * Typed response alternatives for `codes-of-conduct/get-conduct-code`. Non-success alternatives are not converted
   * into success values.
   */
  public sealed interface CodesOfConductGetConductCodeResponse {
    public class SuccessJson(
      public val json: CodeOfConduct,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodesOfConductGetConductCodeResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodesOfConductGetConductCodeResponse,
        CodesOfConductGetConductCodeError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodesOfConductGetConductCodeResponse,
        CodesOfConductGetConductCodeError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : CodesOfConductGetConductCodeResponse
  }

  /**
   * Raised by `codes-of-conduct/get-conduct-code` after decoding a declared non-success response. [error] is typed and
   * is not included in the exception message or diagnostic rendering.
   */
  public class CodesOfConductGetConductCodeApiException(
    public val error: CodesOfConductGetConductCodeError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "codes-of-conduct/get-conduct-code")

  private object CodesOfConductGetConductCodeResponseDecoder : SdkResponseAlternativeDecoder<CodesOfConductGetConductCodeResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): CodesOfConductGetConductCodeResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<CodesOfConductGetConductCodeResponse> = when {
      alternative.id == "codes-of-conduct/get-conduct-code.response.alternative0" -> SdkResponseDecodeResult(
        value = CodesOfConductGetConductCodeResponse.SuccessJson(
          json = CodesOfConductCodecs.codesOfConductGetConductCodeResponseCodecAlternative0Registry.select(listOf("codes-of-conduct/get-conduct-code.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codes-of-conduct/get-conduct-code.response.alternative1" -> SdkResponseDecodeResult(
        value = CodesOfConductGetConductCodeResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "codes-of-conduct/get-conduct-code.response.alternative2" -> SdkResponseDecodeResult(
        value = CodesOfConductGetConductCodeResponse.Http404Json(
          json = CodesOfConductCodecs.codesOfConductGetConductCodeResponseCodecAlternative2Registry.select(listOf("codes-of-conduct/get-conduct-code.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): CodesOfConductGetConductCodeResponse = CodesOfConductGetConductCodeResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val codesOfConductGetAllCodesOfConductMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codes-of-conduct/get-all-codes-of-conduct",
          method = "GET",
          path = "/codes_of_conduct",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "List",
              mode = SdkResponseMode.BUFFERED,
              id = "codes-of-conduct/get-all-codes-of-conduct.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codes-of-conduct/get-all-codes-of-conduct.response.alternative1",
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

    internal val codesOfConductGetConductCodeMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "codes-of-conduct/get-conduct-code",
          method = "GET",
          path = "/codes_of_conduct/{key}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "CodeOfConduct",
              mode = SdkResponseMode.BUFFERED,
              id = "codes-of-conduct/get-conduct-code.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "codes-of-conduct/get-conduct-code.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "codes-of-conduct/get-conduct-code.response.alternative2",
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
