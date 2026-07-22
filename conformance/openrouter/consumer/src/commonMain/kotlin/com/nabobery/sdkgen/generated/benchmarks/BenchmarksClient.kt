package com.nabobery.sdkgen.generated.benchmarks

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.InlinePathsBenchmarksGetParameters0Schema
import com.nabobery.sdkgen.generated.InlinePathsBenchmarksGetParameters1Schema
import com.nabobery.sdkgen.generated.InlinePathsBenchmarksGetParameters2Schema
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.TooManyRequestsResponse
import com.nabobery.sdkgen.generated.UnauthorizedResponse
import com.nabobery.sdkgen.generated.UnifiedBenchmarksResponse
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public object BenchmarksCodecs {
  public const val GETBENCHMARKS_RESPONSE_CODEC_ID: String = "getBenchmarks.response"

  private val getBenchmarksResponseCodec: MediaTypeCodec<UnifiedBenchmarksResponse> =
      KotlinxSerializationCodec(GETBENCHMARKS_RESPONSE_CODEC_ID, UnifiedBenchmarksResponse.Serializer, SdkJson)

  private val getBenchmarksResponseCodecAlternative0Codec: MediaTypeCodec<UnifiedBenchmarksResponse>
      =
      KotlinxSerializationCodec("getBenchmarks.response.alternative0", UnifiedBenchmarksResponse.Serializer, SdkJson)

  public val getBenchmarksResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<UnifiedBenchmarksResponse> =
      MediaTypeCodecRegistry.of(getBenchmarksResponseCodecAlternative0Codec)

  private val getBenchmarksResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("getBenchmarks.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val getBenchmarksResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(getBenchmarksResponseCodecAlternative1Codec)

  private val getBenchmarksResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getBenchmarks.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val getBenchmarksResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getBenchmarksResponseCodecAlternative2Codec)

  private val getBenchmarksResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("getBenchmarks.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  public val getBenchmarksResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(getBenchmarksResponseCodecAlternative3Codec)

  private val getBenchmarksResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getBenchmarks.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val getBenchmarksResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getBenchmarksResponseCodecAlternative4Codec)

  public val getBenchmarksRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getBenchmarksResponseCodecRegistry: MediaTypeCodecRegistry<UnifiedBenchmarksResponse> =
      MediaTypeCodecRegistry.of(getBenchmarksResponseCodec)
}

/**
 * Client for the 'Benchmarks' group of OpenRouter API.
 */
public class BenchmarksClient(
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
      SdkExecutor(transport, authentication = this@BenchmarksClient.authentication)

  /**
   * Unified benchmark endpoint that aggregates scores from multiple benchmark sources (Artificial Analysis, Design
   * Arena). Filter by source to reproduce the exact shapes from the legacy per-source endpoints, or use task_type to
   * find models suited for specific workloads. Authenticate with any valid OpenRouter API key. Rate-limited to 30
   * requests/minute per key and 500 requests/day per account.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getBenchmarks(
    arena: InlinePathsBenchmarksGetParameters2Schema? = null,
    category: String? = null,
    maxResults: Int? = null,
    source: InlinePathsBenchmarksGetParameters0Schema? = null,
    taskType: InlinePathsBenchmarksGetParameters1Schema? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): UnifiedBenchmarksResponse = executor.execute<Unit,
    UnifiedBenchmarksResponse>(SdkExecutionRequest(getBenchmarksMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "arena", values = arena?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "category", values = category?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_results", values = maxResults?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "source", values = source?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "task_type", values = taskType?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(BenchmarksCodecs.GETBENCHMARKS_RESPONSE_CODEC_ID), BenchmarksCodecs.getBenchmarksRequestCodecRegistry,
    BenchmarksCodecs.getBenchmarksResponseCodecRegistry, options)

  /**
   * Unified benchmark endpoint that aggregates scores from multiple benchmark sources (Artificial Analysis, Design
   * Arena). Filter by source to reproduce the exact shapes from the legacy per-source endpoints, or use task_type to
   * find models suited for specific workloads. Authenticate with any valid OpenRouter API key. Rate-limited to 30
   * requests/minute per key and 500 requests/day per account.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getBenchmarksWithResponse(
    arena: InlinePathsBenchmarksGetParameters2Schema? = null,
    category: String? = null,
    maxResults: Int? = null,
    source: InlinePathsBenchmarksGetParameters0Schema? = null,
    taskType: InlinePathsBenchmarksGetParameters1Schema? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetBenchmarksResponse> = executor.executeWithResponse<Unit,
    GetBenchmarksResponse>(SdkExecutionRequest(getBenchmarksMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "arena", values = arena?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "category", values = category?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_results", values = maxResults?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "source", values = source?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "task_type", values = taskType?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), BenchmarksCodecs.getBenchmarksRequestCodecRegistry, GetBenchmarksResponseDecoder, options)

  /**
   * Typed response alternatives for `getBenchmarks`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetBenchmarksResponse {
    public class SuccessJson(
      public val json: UnifiedBenchmarksResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBenchmarksResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBenchmarksResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBenchmarksResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBenchmarksResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBenchmarksResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetBenchmarksResponse
  }

  private object GetBenchmarksResponseDecoder : SdkResponseAlternativeDecoder<GetBenchmarksResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetBenchmarksResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetBenchmarksResponse> = when {
      alternative.id == "getBenchmarks.response.alternative0" -> SdkResponseDecodeResult(
        value = GetBenchmarksResponse.SuccessJson(
          json = BenchmarksCodecs.getBenchmarksResponseCodecAlternative0Registry
            .select(listOf("getBenchmarks.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getBenchmarks.response.alternative1" -> SdkResponseDecodeResult(
        value = GetBenchmarksResponse.Http400Json(
          json = BenchmarksCodecs.getBenchmarksResponseCodecAlternative1Registry
            .select(listOf("getBenchmarks.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getBenchmarks.response.alternative2" -> SdkResponseDecodeResult(
        value = GetBenchmarksResponse.Http401Json(
          json = BenchmarksCodecs.getBenchmarksResponseCodecAlternative2Registry
            .select(listOf("getBenchmarks.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getBenchmarks.response.alternative3" -> SdkResponseDecodeResult(
        value = GetBenchmarksResponse.Http429Json(
          json = BenchmarksCodecs.getBenchmarksResponseCodecAlternative3Registry
            .select(listOf("getBenchmarks.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getBenchmarks.response.alternative4" -> SdkResponseDecodeResult(
        value = GetBenchmarksResponse.Http500Json(
          json = BenchmarksCodecs.getBenchmarksResponseCodecAlternative4Registry
            .select(listOf("getBenchmarks.response.alternative4"), mediaType ?: "application/json").decode(body,
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
    ): GetBenchmarksResponse = GetBenchmarksResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getBenchmarksMetadata: OperationMetadata = OperationMetadata(
          operationId = "getBenchmarks",
          method = "GET",
          path = "/benchmarks",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "UnifiedBenchmarksResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getBenchmarks.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getBenchmarks.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getBenchmarks.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getBenchmarks.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getBenchmarks.response.alternative4",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
            )),
          ),
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
        )
  }
}
