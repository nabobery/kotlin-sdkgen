package com.nabobery.sdkgen.github.generated.markdown

import com.nabobery.sdkgen.github.generated.InlineMarkdownPostRequestJsonXb17226e1
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
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.builtins.serializer

internal object MarkdownCodecs {
  internal const val MARKDOWNRENDER_REQUEST_CODEC_ID: String = "markdown/render.request"

  private val markdownRenderRequestCodec: MediaTypeCodec<InlineMarkdownPostRequestJsonXb17226e1> =
      KotlinxSerializationCodec(MARKDOWNRENDER_REQUEST_CODEC_ID, InlineMarkdownPostRequestJsonXb17226e1.Serializer, SdkJson)

  internal const val MARKDOWNRENDER_RESPONSE_CODEC_ID: String = "markdown/render.response"

  private val markdownRenderResponseCodec: MediaTypeCodec<String> =
      KotlinxSerializationCodec(MARKDOWNRENDER_RESPONSE_CODEC_ID, String.serializer(), SdkJson)

  private val markdownRenderResponseCodecAlternative0Codec: MediaTypeCodec<String> =
      KotlinxSerializationCodec("markdown/render.response.alternative0", String.serializer(), SdkJson)

  internal val markdownRenderResponseCodecAlternative0Registry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(markdownRenderResponseCodecAlternative0Codec)

  internal val markdownRenderRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineMarkdownPostRequestJsonXb17226e1> =
      MediaTypeCodecRegistry.of(markdownRenderRequestCodec)

  internal val markdownRenderResponseCodecRegistry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(markdownRenderResponseCodec)

  internal const val MARKDOWNRENDERRAW_REQUEST_CODEC_ID: String = "markdown/render-raw.request"

  private val markdownRenderRawRequestCodec: MediaTypeCodec<String?> =
      KotlinxSerializationCodec(MARKDOWNRENDERRAW_REQUEST_CODEC_ID, String.serializer().nullable, SdkJson)

  internal const val MARKDOWNRENDERRAW_RESPONSE_CODEC_ID: String = "markdown/render-raw.response"

  private val markdownRenderRawResponseCodec: MediaTypeCodec<String> =
      KotlinxSerializationCodec(MARKDOWNRENDERRAW_RESPONSE_CODEC_ID, String.serializer(), SdkJson)

  private val markdownRenderRawResponseCodecAlternative0Codec: MediaTypeCodec<String> =
      KotlinxSerializationCodec("markdown/render-raw.response.alternative0", String.serializer(), SdkJson)

  internal val markdownRenderRawResponseCodecAlternative0Registry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(markdownRenderRawResponseCodecAlternative0Codec)

  internal val markdownRenderRawRequestCodecRegistry: MediaTypeCodecRegistry<String?> =
      MediaTypeCodecRegistry.of(markdownRenderRawRequestCodec)

  internal val markdownRenderRawResponseCodecRegistry: MediaTypeCodecRegistry<String> =
      MediaTypeCodecRegistry.of(markdownRenderRawResponseCodec)
}

/**
 * Client for the 'markdown' group of GitHub v3 REST API.
 */
public class MarkdownClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@MarkdownClient.authentication)

  /**
   * Depending on what is rendered in the Markdown, you may need to provide additional token scopes for labels, such as
   * `issues:read` or `pull_requests:read`.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MarkdownRenderApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded MarkdownRenderError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun markdownRender(request: InlineMarkdownPostRequestJsonXb17226e1, options: CallOptions = CallOptions()): String = executor.executeWithTypedErrors<InlineMarkdownPostRequestJsonXb17226e1, MarkdownRenderResponse, String>(
    request = SdkExecutionRequest(markdownRenderMetadata, baseUri, request, listOf(MarkdownCodecs.MARKDOWNRENDER_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = MarkdownCodecs.markdownRenderRequestCodecRegistry,
    responseDecoder = MarkdownRenderResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MarkdownRenderResponse.SuccessHtml -> response.text
        is MarkdownRenderResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is MarkdownRenderResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MarkdownRenderResponse.SuccessHtml -> error("Runtime selected a success response for error mapping.")
        is MarkdownRenderResponse.Http304NoContent -> MarkdownRenderApiException(response, statusCode, headers)
        is MarkdownRenderResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Depending on what is rendered in the Markdown, you may need to provide additional token scopes for labels, such as
   * `issues:read` or `pull_requests:read`.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun markdownRenderWithResponse(request: InlineMarkdownPostRequestJsonXb17226e1, options: CallOptions = CallOptions()): SdkResponseResult<MarkdownRenderResponse> = executor.executeWithResponse<InlineMarkdownPostRequestJsonXb17226e1, MarkdownRenderResponse>(SdkExecutionRequest(markdownRenderMetadata, baseUri, request, listOf(MarkdownCodecs.MARKDOWNRENDER_REQUEST_CODEC_ID), emptyList()), MarkdownCodecs.markdownRenderRequestCodecRegistry, MarkdownRenderResponseDecoder, options)

  /**
   * You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this
   * endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is
   * not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB
   * or less.
   *
   * @param request Request body sent to the operation.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws MarkdownRenderRawApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded MarkdownRenderRawError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun markdownRenderRaw(request: String? = null, options: CallOptions = CallOptions()): String = executor.executeWithTypedErrors<String?, MarkdownRenderRawResponse, String>(
    request = SdkExecutionRequest(markdownRenderRawMetadata, baseUri, request, listOf(MarkdownCodecs.MARKDOWNRENDERRAW_REQUEST_CODEC_ID), emptyList()),
    requestCodecs = MarkdownCodecs.markdownRenderRawRequestCodecRegistry,
    responseDecoder = MarkdownRenderRawResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is MarkdownRenderRawResponse.SuccessHtml -> response.text
        is MarkdownRenderRawResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is MarkdownRenderRawResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is MarkdownRenderRawResponse.SuccessHtml -> error("Runtime selected a success response for error mapping.")
        is MarkdownRenderRawResponse.Http304NoContent -> MarkdownRenderRawApiException(response, statusCode, headers)
        is MarkdownRenderRawResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * You must send Markdown as plain text (using a `Content-Type` header of `text/plain` or `text/x-markdown`) to this
   * endpoint, rather than using JSON format. In raw mode, [GitHub Flavored Markdown](https://github.github.com/gfm/) is
   * not supported and Markdown will be rendered in plain format like a README.md file. Markdown content must be 400 KB
   * or less.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
   * @param options Execution options.
   */
  public suspend fun markdownRenderRawWithResponse(request: String? = null, options: CallOptions = CallOptions()): SdkResponseResult<MarkdownRenderRawResponse> = executor.executeWithResponse<String?, MarkdownRenderRawResponse>(SdkExecutionRequest(markdownRenderRawMetadata, baseUri, request, listOf(MarkdownCodecs.MARKDOWNRENDERRAW_REQUEST_CODEC_ID), emptyList()), MarkdownCodecs.markdownRenderRawRequestCodecRegistry, MarkdownRenderRawResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `markdown/render` may expose through its typed API exception.
   */
  public sealed interface MarkdownRenderError

  /**
   * Typed response alternatives for `markdown/render`. Non-success alternatives are not converted into success values.
   */
  public sealed interface MarkdownRenderResponse {
    public class SuccessHtml(
      public val text: String,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MarkdownRenderResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MarkdownRenderResponse,
        MarkdownRenderError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MarkdownRenderResponse
  }

  /**
   * Raised by `markdown/render` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class MarkdownRenderApiException(
    public val error: MarkdownRenderError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "markdown/render")

  private object MarkdownRenderResponseDecoder : SdkResponseAlternativeDecoder<MarkdownRenderResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MarkdownRenderResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MarkdownRenderResponse> = when {
      alternative.id == "markdown/render.response.alternative0" -> SdkResponseDecodeResult(
        value = MarkdownRenderResponse.SuccessHtml(
          text = MarkdownCodecs.markdownRenderResponseCodecAlternative0Registry.select(listOf("markdown/render.response.alternative0"), mediaType ?: "text/html").decode(body, mediaType ?: "text/html"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "markdown/render.response.alternative1" -> SdkResponseDecodeResult(
        value = MarkdownRenderResponse.Http304NoContent(
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
    ): MarkdownRenderResponse = MarkdownRenderResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `markdown/render-raw` may expose through its typed API exception.
   */
  public sealed interface MarkdownRenderRawError

  /**
   * Typed response alternatives for `markdown/render-raw`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface MarkdownRenderRawResponse {
    public class SuccessHtml(
      public val text: String,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MarkdownRenderRawResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MarkdownRenderRawResponse,
        MarkdownRenderRawError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : MarkdownRenderRawResponse
  }

  /**
   * Raised by `markdown/render-raw` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class MarkdownRenderRawApiException(
    public val error: MarkdownRenderRawError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "markdown/render-raw")

  private object MarkdownRenderRawResponseDecoder : SdkResponseAlternativeDecoder<MarkdownRenderRawResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): MarkdownRenderRawResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<MarkdownRenderRawResponse> = when {
      alternative.id == "markdown/render-raw.response.alternative0" -> SdkResponseDecodeResult(
        value = MarkdownRenderRawResponse.SuccessHtml(
          text = MarkdownCodecs.markdownRenderRawResponseCodecAlternative0Registry.select(listOf("markdown/render-raw.response.alternative0"), mediaType ?: "text/html").decode(body, mediaType ?: "text/html"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "markdown/render-raw.response.alternative1" -> SdkResponseDecodeResult(
        value = MarkdownRenderRawResponse.Http304NoContent(
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
    ): MarkdownRenderRawResponse = MarkdownRenderRawResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val markdownRenderMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "markdown/render",
          method = "POST",
          path = "/markdown",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("text/html"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("text/html"),
              typeTag = "String",
              mode = SdkResponseMode.BUFFERED,
              id = "markdown/render.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "markdown/render.response.alternative1",
            ),
          ),
          security = emptyList(),
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

    internal val markdownRenderRawMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "markdown/render-raw",
          method = "POST",
          path = "/markdown/raw",
          requestMediaTypes = listOf("text/plain", "text/x-markdown"),
          responseMediaTypes = listOf("text/html"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("text/html"),
              typeTag = "String",
              mode = SdkResponseMode.BUFFERED,
              id = "markdown/render-raw.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "markdown/render-raw.response.alternative1",
            ),
          ),
          security = emptyList(),
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
