package com.nabobery.sdkgen.generated.classifications

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.InlinePathsClassificationsTaskGetParameters0Schema
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.SdkJson
import com.nabobery.sdkgen.generated.TaskClassificationResponse
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

public object ClassificationsCodecs {
  public const val GETTASKCLASSIFICATIONS_RESPONSE_CODEC_ID: String =
      "getTaskClassifications.response"

  private val getTaskClassificationsResponseCodec: MediaTypeCodec<TaskClassificationResponse> =
      KotlinxSerializationCodec(GETTASKCLASSIFICATIONS_RESPONSE_CODEC_ID, TaskClassificationResponse.Serializer,
        SdkJson)

  private val getTaskClassificationsResponseCodecAlternative0Codec:
      MediaTypeCodec<TaskClassificationResponse> =
      KotlinxSerializationCodec("getTaskClassifications.response.alternative0", TaskClassificationResponse.Serializer,
        SdkJson)

  public val getTaskClassificationsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<TaskClassificationResponse> =
      MediaTypeCodecRegistry.of(getTaskClassificationsResponseCodecAlternative0Codec)

  private val getTaskClassificationsResponseCodecAlternative1Codec:
      MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("getTaskClassifications.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val getTaskClassificationsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(getTaskClassificationsResponseCodecAlternative1Codec)

  private val getTaskClassificationsResponseCodecAlternative2Codec:
      MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getTaskClassifications.response.alternative2", UnauthorizedResponse.Serializer,
        SdkJson)

  public val getTaskClassificationsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getTaskClassificationsResponseCodecAlternative2Codec)

  private val getTaskClassificationsResponseCodecAlternative3Codec:
      MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("getTaskClassifications.response.alternative3", TooManyRequestsResponse.Serializer,
        SdkJson)

  public val getTaskClassificationsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(getTaskClassificationsResponseCodecAlternative3Codec)

  private val getTaskClassificationsResponseCodecAlternative4Codec:
      MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getTaskClassifications.response.alternative4", InternalServerResponse.Serializer,
        SdkJson)

  public val getTaskClassificationsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getTaskClassificationsResponseCodecAlternative4Codec)

  public val getTaskClassificationsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getTaskClassificationsResponseCodecRegistry:
      MediaTypeCodecRegistry<TaskClassificationResponse> =
      MediaTypeCodecRegistry.of(getTaskClassificationsResponseCodec)
}

/**
 * Client for the 'Classifications' group of OpenRouter API.
 */
public class ClassificationsClient(
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
      SdkExecutor(transport, authentication = this@ClassificationsClient.authentication)

  /**
   * Returns the market-share breakdown of OpenRouter traffic by task classification
   * (e.g. code generation, web search, summarization) over a trailing time window.
   *
   * Each classification reports its share of classified sampled requests (`usage_share`)
   * and classified sampled token volume (`token_share`) as fractions between 0 and 1.
   * The unclassified `other` bucket is excluded. Absolute volumes are not exposed
   * because the underlying data is sampled.
   *
   * Each classification also includes a `models` array listing the top models by
   * request volume within that classification, with their within-tag usage and token shares.
   *
   * Classifications are grouped into macro-categories (Code, Data, Agent, General)
   * with aggregate shares provided for each.
   *
   * Authenticate with any valid OpenRouter API key (same key used for inference).
   * Rate-limited to 30 requests/minute per key and 500 requests/day per account.
   *
   * When republishing or quoting this data, cite as:
   * "Source: OpenRouter (openrouter.ai/rankings), as of {as_of}."
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getTaskClassifications(
    window: InlinePathsClassificationsTaskGetParameters0Schema? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): TaskClassificationResponse = executor.execute<Unit,
    TaskClassificationResponse>(SdkExecutionRequest(getTaskClassificationsMetadata, baseUri, Unit, emptyList(),
      buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "window", values = window?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ClassificationsCodecs.GETTASKCLASSIFICATIONS_RESPONSE_CODEC_ID), ClassificationsCodecs
    .getTaskClassificationsRequestCodecRegistry, ClassificationsCodecs.getTaskClassificationsResponseCodecRegistry,
      options)

  /**
   * Returns the market-share breakdown of OpenRouter traffic by task classification
   * (e.g. code generation, web search, summarization) over a trailing time window.
   *
   * Each classification reports its share of classified sampled requests (`usage_share`)
   * and classified sampled token volume (`token_share`) as fractions between 0 and 1.
   * The unclassified `other` bucket is excluded. Absolute volumes are not exposed
   * because the underlying data is sampled.
   *
   * Each classification also includes a `models` array listing the top models by
   * request volume within that classification, with their within-tag usage and token shares.
   *
   * Classifications are grouped into macro-categories (Code, Data, Agent, General)
   * with aggregate shares provided for each.
   *
   * Authenticate with any valid OpenRouter API key (same key used for inference).
   * Rate-limited to 30 requests/minute per key and 500 requests/day per account.
   *
   * When republishing or quoting this data, cite as:
   * "Source: OpenRouter (openrouter.ai/rankings), as of {as_of}."
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getTaskClassificationsWithResponse(
    window: InlinePathsClassificationsTaskGetParameters0Schema? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetTaskClassificationsResponse> = executor.executeWithResponse<Unit,
    GetTaskClassificationsResponse>(SdkExecutionRequest(getTaskClassificationsMetadata, baseUri, Unit, emptyList(),
      buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "window", values = window?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ClassificationsCodecs.getTaskClassificationsRequestCodecRegistry, GetTaskClassificationsResponseDecoder, options)

  /**
   * Typed response alternatives for `getTaskClassifications`. Non-success alternatives are not converted into success
   * values.
   */
  public sealed interface GetTaskClassificationsResponse {
    public class SuccessJson(
      public val json: TaskClassificationResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaskClassificationsResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaskClassificationsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaskClassificationsResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaskClassificationsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaskClassificationsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetTaskClassificationsResponse
  }

  private object GetTaskClassificationsResponseDecoder : SdkResponseAlternativeDecoder<GetTaskClassificationsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetTaskClassificationsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetTaskClassificationsResponse> = when {
      alternative.id == "getTaskClassifications.response.alternative0" -> SdkResponseDecodeResult(
        value = GetTaskClassificationsResponse.SuccessJson(
          json = ClassificationsCodecs.getTaskClassificationsResponseCodecAlternative0Registry
            .select(listOf("getTaskClassifications.response.alternative0"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getTaskClassifications.response.alternative1" -> SdkResponseDecodeResult(
        value = GetTaskClassificationsResponse.Http400Json(
          json = ClassificationsCodecs.getTaskClassificationsResponseCodecAlternative1Registry
            .select(listOf("getTaskClassifications.response.alternative1"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getTaskClassifications.response.alternative2" -> SdkResponseDecodeResult(
        value = GetTaskClassificationsResponse.Http401Json(
          json = ClassificationsCodecs.getTaskClassificationsResponseCodecAlternative2Registry
            .select(listOf("getTaskClassifications.response.alternative2"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getTaskClassifications.response.alternative3" -> SdkResponseDecodeResult(
        value = GetTaskClassificationsResponse.Http429Json(
          json = ClassificationsCodecs.getTaskClassificationsResponseCodecAlternative3Registry
            .select(listOf("getTaskClassifications.response.alternative3"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getTaskClassifications.response.alternative4" -> SdkResponseDecodeResult(
        value = GetTaskClassificationsResponse.Http500Json(
          json = ClassificationsCodecs.getTaskClassificationsResponseCodecAlternative4Registry
            .select(listOf("getTaskClassifications.response.alternative4"), mediaType ?: "application/json")
              .decode(body, mediaType ?: "application/json"),
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
    ): GetTaskClassificationsResponse = GetTaskClassificationsResponse.Unknown(statusCode = statusCode, headers =
      headers)
  }

  public companion object {
    public val getTaskClassificationsMetadata: OperationMetadata = OperationMetadata(
          operationId = "getTaskClassifications",
          method = "GET",
          path = "/classifications/task",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "TaskClassificationResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getTaskClassifications.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getTaskClassifications.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getTaskClassifications.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getTaskClassifications.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getTaskClassifications.response.alternative4",
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
