package com.nabobery.sdkgen.github.generated.ratelimit

import com.nabobery.sdkgen.github.generated.BasicError
import com.nabobery.sdkgen.github.generated.RateLimitOverview
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

public object RateLimitCodecs {
  public const val RATELIMITGET_RESPONSE_CODEC_ID: String = "rate-limit/get.response"

  private val rateLimitGetResponseCodec: MediaTypeCodec<RateLimitOverview> =
      KotlinxSerializationCodec(RATELIMITGET_RESPONSE_CODEC_ID, RateLimitOverview.Serializer, SdkJson)

  private val rateLimitGetResponseCodecAlternative0Codec: MediaTypeCodec<RateLimitOverview> =
      KotlinxSerializationCodec("rate-limit/get.response.alternative0", RateLimitOverview.Serializer, SdkJson)

  public val rateLimitGetResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RateLimitOverview> =
      MediaTypeCodecRegistry.of(rateLimitGetResponseCodecAlternative0Codec)

  private val rateLimitGetResponseCodecAlternative2Codec: MediaTypeCodec<BasicError> =
      KotlinxSerializationCodec("rate-limit/get.response.alternative2", BasicError.Serializer, SdkJson)

  public val rateLimitGetResponseCodecAlternative2Registry: MediaTypeCodecRegistry<BasicError> =
      MediaTypeCodecRegistry.of(rateLimitGetResponseCodecAlternative2Codec)

  public val rateLimitGetRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val rateLimitGetResponseCodecRegistry: MediaTypeCodecRegistry<RateLimitOverview> =
      MediaTypeCodecRegistry.of(rateLimitGetResponseCodec)
}

/**
 * Client for the 'rate-limit' group of GitHub v3 REST API.
 */
public class RateLimitClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  private val authentication: SdkAuthentication? = null,
) {
  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@RateLimitClient.authentication)

  /**
   * > [!NOTE]
   * > Accessing this endpoint does not count against your REST API rate limit.
   *
   * Some categories of endpoints have custom rate limits that are separate from the rate limit governing the other REST
   * API endpoints. For this reason, the API response categorizes your rate limit. Under `resources`, you'll see objects
   * relating to different categories:
   * * The `core` object provides your rate limit status for all non-search-related resources in the REST API.
   * * The `search` object provides your rate limit status for the REST API for searching (excluding code searches). For
   * more information, see "[Search](https://docs.github.com/rest/search/search)."
   * * The `code_search` object provides your rate limit status for the REST API for searching code. For more
   * information, see "[Search code](https://docs.github.com/rest/search/search#search-code)."
   * * The `graphql` object provides your rate limit status for the GraphQL API. For more information, see "[Resource
   * limitations](https://docs.github.com/graphql/overview/resource-limitations#rate-limit)."
   * * The `integration_manifest` object provides your rate limit status for the `POST
   * /app-manifests/{code}/conversions` operation. For more information, see "[Creating a GitHub App from a
   * manifest](https://docs.github.com/apps/creating-github-apps/setting-up-a-github-app/creating-a-github-app-from-a-ma
   * nifest#3-you-exchange-the-temporary-code-to-retrieve-the-app-configuration)."
   * * The `dependency_snapshots` object provides your rate limit status for submitting snapshots to the dependency
   * graph. For more information, see "[Dependency graph](https://docs.github.com/rest/dependency-graph)."
   * * The `dependency_sbom` object provides your rate limit status for requesting SBOMs from the dependency graph. For
   * more information, see "[Dependency graph](https://docs.github.com/rest/dependency-graph)."
   * * The `actions_runner_registration` object provides your rate limit status for registering self-hosted runners in
   * GitHub Actions. For more information, see "[Self-hosted
   * runners](https://docs.github.com/rest/actions/self-hosted-runners)."
   * * The `source_import` object is no longer in use for any API endpoints, and it will be removed in the next API
   * version. For more information about API versions, see "[API
   * Versions](https://docs.github.com/rest/about-the-rest-api/api-versions)."
   *
   * > [!NOTE]
   * > The `rate` object is closing down. If you're writing new API client code or updating existing code, you should
   * use the `core` object instead of the `rate` object. The `core` object contains the same information that is present
   * in the `rate` object.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws RateLimitGetApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded RateLimitGetError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun rateLimitGet(options: CallOptions = CallOptions()): RateLimitOverview = executor.executeWithTypedErrors<Unit, RateLimitGetResponse, RateLimitOverview>(
    request = SdkExecutionRequest(rateLimitGetMetadata, baseUri, Unit, emptyList(), emptyList()),
    requestCodecs = RateLimitCodecs.rateLimitGetRequestCodecRegistry,
    responseDecoder = RateLimitGetResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is RateLimitGetResponse.SuccessJson -> response.json
        is RateLimitGetResponse.Http304NoContent -> error("Runtime selected a non-success response for success mapping.")
        is RateLimitGetResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is RateLimitGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is RateLimitGetResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is RateLimitGetResponse.Http304NoContent -> RateLimitGetApiException(response, statusCode, headers)
        is RateLimitGetResponse.Http404Json -> RateLimitGetApiException(response, statusCode, headers)
        is RateLimitGetResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * > [!NOTE]
   * > Accessing this endpoint does not count against your REST API rate limit.
   *
   * Some categories of endpoints have custom rate limits that are separate from the rate limit governing the other REST
   * API endpoints. For this reason, the API response categorizes your rate limit. Under `resources`, you'll see objects
   * relating to different categories:
   * * The `core` object provides your rate limit status for all non-search-related resources in the REST API.
   * * The `search` object provides your rate limit status for the REST API for searching (excluding code searches). For
   * more information, see "[Search](https://docs.github.com/rest/search/search)."
   * * The `code_search` object provides your rate limit status for the REST API for searching code. For more
   * information, see "[Search code](https://docs.github.com/rest/search/search#search-code)."
   * * The `graphql` object provides your rate limit status for the GraphQL API. For more information, see "[Resource
   * limitations](https://docs.github.com/graphql/overview/resource-limitations#rate-limit)."
   * * The `integration_manifest` object provides your rate limit status for the `POST
   * /app-manifests/{code}/conversions` operation. For more information, see "[Creating a GitHub App from a
   * manifest](https://docs.github.com/apps/creating-github-apps/setting-up-a-github-app/creating-a-github-app-from-a-ma
   * nifest#3-you-exchange-the-temporary-code-to-retrieve-the-app-configuration)."
   * * The `dependency_snapshots` object provides your rate limit status for submitting snapshots to the dependency
   * graph. For more information, see "[Dependency graph](https://docs.github.com/rest/dependency-graph)."
   * * The `dependency_sbom` object provides your rate limit status for requesting SBOMs from the dependency graph. For
   * more information, see "[Dependency graph](https://docs.github.com/rest/dependency-graph)."
   * * The `actions_runner_registration` object provides your rate limit status for registering self-hosted runners in
   * GitHub Actions. For more information, see "[Self-hosted
   * runners](https://docs.github.com/rest/actions/self-hosted-runners)."
   * * The `source_import` object is no longer in use for any API endpoints, and it will be removed in the next API
   * version. For more information about API versions, see "[API
   * Versions](https://docs.github.com/rest/about-the-rest-api/api-versions)."
   *
   * > [!NOTE]
   * > The `rate` object is closing down. If you're writing new API client code or updating existing code, you should
   * use the `core` object instead of the `rate` object. The `core` object contains the same information that is present
   * in the `rate` object.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param options Execution options.
   */
  public suspend fun rateLimitGetWithResponse(options: CallOptions = CallOptions()): SdkResponseResult<RateLimitGetResponse> = executor.executeWithResponse<Unit, RateLimitGetResponse>(SdkExecutionRequest(rateLimitGetMetadata, baseUri, Unit, emptyList(), emptyList()), RateLimitCodecs.rateLimitGetRequestCodecRegistry, RateLimitGetResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `rate-limit/get` may expose through its typed API exception.
   */
  public sealed interface RateLimitGetError

  /**
   * Typed response alternatives for `rate-limit/get`. Non-success alternatives are not converted into success values.
   */
  public sealed interface RateLimitGetResponse {
    public class SuccessJson(
      public val json: RateLimitOverview,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : RateLimitGetResponse

    public class Http304NoContent(
      public val unit: Unit,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : RateLimitGetResponse,
        RateLimitGetError

    public class Http404Json(
      public val json: BasicError,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : RateLimitGetResponse,
        RateLimitGetError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : RateLimitGetResponse
  }

  /**
   * Raised by `rate-limit/get` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class RateLimitGetApiException(
    public val error: RateLimitGetError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "rate-limit/get")

  private object RateLimitGetResponseDecoder : SdkResponseAlternativeDecoder<RateLimitGetResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): RateLimitGetResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<RateLimitGetResponse> = when {
      alternative.id == "rate-limit/get.response.alternative0" -> SdkResponseDecodeResult(
        value = RateLimitGetResponse.SuccessJson(
          json = RateLimitCodecs.rateLimitGetResponseCodecAlternative0Registry.select(listOf("rate-limit/get.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "rate-limit/get.response.alternative1" -> SdkResponseDecodeResult(
        value = RateLimitGetResponse.Http304NoContent(
          unit = Unit,
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "rate-limit/get.response.alternative2" -> SdkResponseDecodeResult(
        value = RateLimitGetResponse.Http404Json(
          json = RateLimitCodecs.rateLimitGetResponseCodecAlternative2Registry.select(listOf("rate-limit/get.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): RateLimitGetResponse = RateLimitGetResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val rateLimitGetMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "rate-limit/get",
          method = "GET",
          path = "/rate_limit",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RateLimitOverview",
              mode = SdkResponseMode.BUFFERED,
              id = "rate-limit/get.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 304),
              mediaTypes = emptyList(),
              typeTag = "Unit",
              mode = SdkResponseMode.BUFFERED,
              id = "rate-limit/get.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "BasicError",
              mode = SdkResponseMode.BUFFERED,
              id = "rate-limit/get.response.alternative2",
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
