package io.github.nabobery.sdkgen.github.generated.gitignore

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
import io.github.nabobery.sdkgen.github.generated.GitignoreTemplate
import io.github.nabobery.sdkgen.github.generated.SdkJson
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.builtins.serializer

internal object GitignoreCodecs {
  internal const val GITIGNOREGETALLTEMPLATES_RESPONSE_CODEC_ID: String =
      "gitignore/get-all-templates.response"

  private val gitignoreGetAllTemplatesResponseCodec: MediaTypeCodec<List<String>> =
      KotlinxSerializationCodec(GITIGNOREGETALLTEMPLATES_RESPONSE_CODEC_ID, ListSerializer(String.serializer()), SdkJson)

  private val gitignoreGetAllTemplatesResponseCodecAlternative0Codec: MediaTypeCodec<List<String>> =
      KotlinxSerializationCodec("gitignore/get-all-templates.response.alternative0", ListSerializer(String.serializer()), SdkJson)

  internal val gitignoreGetAllTemplatesResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<List<String>> =
      MediaTypeCodecRegistry.of(gitignoreGetAllTemplatesResponseCodecAlternative0Codec)

  internal val gitignoreGetAllTemplatesRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gitignoreGetAllTemplatesResponseCodecRegistry: MediaTypeCodecRegistry<List<String>> =
      MediaTypeCodecRegistry.of(gitignoreGetAllTemplatesResponseCodec)

  internal const val GITIGNOREGETTEMPLATE_RESPONSE_CODEC_ID: String =
      "gitignore/get-template.response"

  private val gitignoreGetTemplateResponseCodec: MediaTypeCodec<GitignoreTemplate> =
      KotlinxSerializationCodec(GITIGNOREGETTEMPLATE_RESPONSE_CODEC_ID, GitignoreTemplate.Serializer, SdkJson)

  private val gitignoreGetTemplateResponseCodecAlternative0Codec: MediaTypeCodec<GitignoreTemplate>
      =
      KotlinxSerializationCodec("gitignore/get-template.response.alternative0", GitignoreTemplate.Serializer, SdkJson)

  internal val gitignoreGetTemplateResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<GitignoreTemplate> =
      MediaTypeCodecRegistry.of(gitignoreGetTemplateResponseCodecAlternative0Codec)

  internal val gitignoreGetTemplateRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val gitignoreGetTemplateResponseCodecRegistry: MediaTypeCodecRegistry<GitignoreTemplate>
      = MediaTypeCodecRegistry.of(gitignoreGetTemplateResponseCodec)
}

/**
 * Client for the 'gitignore' group of GitHub v3 REST API.
 */
public class GitignoreClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@GitignoreClient.authentication)

  /**
   * List all templates available to pass as an option when [creating a
   * repository](https://docs.github.com/rest/repos/repos#create-a-repository-for-the-authenticated-user).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitignoreGetAllTemplatesApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded GitignoreGetAllTemplatesError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitignoreGetAllTemplates(options: CallOptions = CallOptions()): List<String> = executor.executeWithTypedErrors<Unit, GitignoreGetAllTemplatesResponse, List<String>>(
    request = SdkExecutionRequest(gitignoreGetAllTemplatesMetadata, baseUri, Unit, emptyList(), emptyList()),
    requestCodecs = GitignoreCodecs.gitignoreGetAllTemplatesRequestCodecRegistry,
    responseDecoder = GitignoreGetAllTemplatesResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitignoreGetAllTemplatesResponse.SuccessJson -> response.json
        is GitignoreGetAllTemplatesResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GitignoreGetAllTemplatesResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitignoreGetAllTemplatesResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitignoreGetAllTemplatesResponse.Http304NoContent -> GitignoreGetAllTemplatesApiException(response, statusCode, headers)
        is GitignoreGetAllTemplatesResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all templates available to pass as an option when [creating a
   * repository](https://docs.github.com/rest/repos/repos#create-a-repository-for-the-authenticated-user).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun gitignoreGetAllTemplatesWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<GitignoreGetAllTemplatesResponse> = executor.executeWithResponse<Unit, GitignoreGetAllTemplatesResponse>(SdkExecutionRequest(gitignoreGetAllTemplatesMetadata, baseUri, Unit, emptyList(), emptyList()), GitignoreCodecs.gitignoreGetAllTemplatesRequestCodecRegistry, GitignoreGetAllTemplatesResponseDecoder, options)

  /**
   * Get the content of a gitignore template.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw .gitignore contents.
   *
   * @param name Wire parameter `name`.
   * @param options Execution options.
   * @return Buffered response body.
   * @throws GitignoreGetTemplateApiException When the service returns a declared non-success response; its `error`
   * property exposes the decoded GitignoreGetTemplateError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun gitignoreGetTemplate(name: String, options: CallOptions = CallOptions()): GitignoreTemplate = executor.executeWithTypedErrors<Unit, GitignoreGetTemplateResponse, GitignoreTemplate>(
    request = SdkExecutionRequest(gitignoreGetTemplateMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
    }),
    requestCodecs = GitignoreCodecs.gitignoreGetTemplateRequestCodecRegistry,
    responseDecoder = GitignoreGetTemplateResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GitignoreGetTemplateResponse.SuccessJson -> response.json
        is GitignoreGetTemplateResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is GitignoreGetTemplateResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GitignoreGetTemplateResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GitignoreGetTemplateResponse.Http304NoContent -> GitignoreGetTemplateApiException(response, statusCode, headers)
        is GitignoreGetTemplateResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get the content of a gitignore template.
   *
   * This endpoint supports the following custom media types. For more information, see "[Media
   * types](https://docs.github.com/rest/using-the-rest-api/getting-started-with-the-rest-api#media-types)."
   *
   * - **`application/vnd.github.raw+json`**: Returns the raw .gitignore contents.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param name Wire parameter `name`.
   * @param options Execution options.
   */
  public suspend fun gitignoreGetTemplateWithResponse(name: String, options: CallOptions = CallOptions()): SdkResponseResult<GitignoreGetTemplateResponse> = executor.executeWithResponse<Unit, GitignoreGetTemplateResponse>(SdkExecutionRequest(gitignoreGetTemplateMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "name", values = listOf(name.toString())))
  }), GitignoreCodecs.gitignoreGetTemplateRequestCodecRegistry, GitignoreGetTemplateResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `gitignore/get-all-templates` may expose through its typed API
   * exception.
   */
  public sealed interface GitignoreGetAllTemplatesError

  /**
   * Typed response alternatives for `gitignore/get-all-templates`. Non-success alternatives are not converted into
   * success values.
   */
  public sealed interface GitignoreGetAllTemplatesResponse {
    public class SuccessJson(
      public val json: List<String>,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitignoreGetAllTemplatesResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitignoreGetAllTemplatesResponse,
        GitignoreGetAllTemplatesError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitignoreGetAllTemplatesResponse
  }

  /**
   * Raised by `gitignore/get-all-templates` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class GitignoreGetAllTemplatesApiException(
    public val error: GitignoreGetAllTemplatesError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gitignore/get-all-templates")

  private object GitignoreGetAllTemplatesResponseDecoder : SdkResponseAlternativeDecoder<GitignoreGetAllTemplatesResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitignoreGetAllTemplatesResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitignoreGetAllTemplatesResponse> = when {
      alternative.id == "gitignore/get-all-templates.response.alternative0" -> SdkResponseDecodeResult(
        value = GitignoreGetAllTemplatesResponse.SuccessJson(
          json = GitignoreCodecs.gitignoreGetAllTemplatesResponseCodecAlternative0Registry.select(listOf("gitignore/get-all-templates.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gitignore/get-all-templates.response.alternative1" -> SdkResponseDecodeResult(
        value = GitignoreGetAllTemplatesResponse.Http304NoContent(
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
    ): GitignoreGetAllTemplatesResponse = GitignoreGetAllTemplatesResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `gitignore/get-template` may expose through its typed API exception.
   */
  public sealed interface GitignoreGetTemplateError

  /**
   * Typed response alternatives for `gitignore/get-template`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GitignoreGetTemplateResponse {
    public class SuccessJson(
      public val json: GitignoreTemplate,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitignoreGetTemplateResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitignoreGetTemplateResponse,
        GitignoreGetTemplateError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GitignoreGetTemplateResponse
  }

  /**
   * Raised by `gitignore/get-template` after decoding a declared non-success response. [error] is typed and is not
   * included in the exception message or diagnostic rendering.
   */
  public class GitignoreGetTemplateApiException(
    public val error: GitignoreGetTemplateError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "gitignore/get-template")

  private object GitignoreGetTemplateResponseDecoder : SdkResponseAlternativeDecoder<GitignoreGetTemplateResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GitignoreGetTemplateResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GitignoreGetTemplateResponse> = when {
      alternative.id == "gitignore/get-template.response.alternative0" -> SdkResponseDecodeResult(
        value = GitignoreGetTemplateResponse.SuccessJson(
          json = GitignoreCodecs.gitignoreGetTemplateResponseCodecAlternative0Registry.select(listOf("gitignore/get-template.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "gitignore/get-template.response.alternative1" -> SdkResponseDecodeResult(
        value = GitignoreGetTemplateResponse.Http304NoContent(
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
    ): GitignoreGetTemplateResponse = GitignoreGetTemplateResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val gitignoreGetAllTemplatesMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gitignore/get-all-templates",
          method = "GET",
          path = "/gitignore/templates",
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
              id = "gitignore/get-all-templates.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gitignore/get-all-templates.response.alternative1",
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

    internal val gitignoreGetTemplateMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "gitignore/get-template",
          method = "GET",
          path = "/gitignore/templates/{name}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "GitignoreTemplate",
              mode = SdkResponseMode.BUFFERED,
              id = "gitignore/get-template.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "gitignore/get-template.response.alternative1",
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
