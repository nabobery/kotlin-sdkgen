package com.nabobery.sdkgen.generated.analytics

import com.nabobery.sdkgen.generated.ActivityResponse
import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.ForbiddenResponse
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.NotFoundResponse
import com.nabobery.sdkgen.generated.SdkJson
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
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

internal object AnalyticsCodecs {
  internal const val GETUSERACTIVITY_RESPONSE_CODEC_ID: String = "getUserActivity.response"

  private val getUserActivityResponseCodec: MediaTypeCodec<ActivityResponse> =
      KotlinxSerializationCodec(GETUSERACTIVITY_RESPONSE_CODEC_ID, ActivityResponse.Serializer, SdkJson)

  private val getUserActivityResponseCodecAlternative0Codec: MediaTypeCodec<ActivityResponse> =
      KotlinxSerializationCodec("getUserActivity.response.alternative0", ActivityResponse.Serializer, SdkJson)

  internal val getUserActivityResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ActivityResponse> =
      MediaTypeCodecRegistry.of(getUserActivityResponseCodecAlternative0Codec)

  private val getUserActivityResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("getUserActivity.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val getUserActivityResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(getUserActivityResponseCodecAlternative1Codec)

  private val getUserActivityResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getUserActivity.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val getUserActivityResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getUserActivityResponseCodecAlternative2Codec)

  private val getUserActivityResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("getUserActivity.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val getUserActivityResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(getUserActivityResponseCodecAlternative3Codec)

  private val getUserActivityResponseCodecAlternative4Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getUserActivity.response.alternative4", NotFoundResponse.Serializer, SdkJson)

  internal val getUserActivityResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getUserActivityResponseCodecAlternative4Codec)

  private val getUserActivityResponseCodecAlternative5Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("getUserActivity.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val getUserActivityResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getUserActivityResponseCodecAlternative5Codec)

  internal val getUserActivityRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getUserActivityResponseCodecRegistry: MediaTypeCodecRegistry<ActivityResponse> =
      MediaTypeCodecRegistry.of(getUserActivityResponseCodec)
}

/**
 * Client for the 'Analytics' group of OpenRouter API.
 */
public class AnalyticsClient(
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
      SdkExecutor(transport, authentication = this@AnalyticsClient.authentication)

  /**
   * Returns user activity data grouped by endpoint for the last 30 (completed) UTC days. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param apiKeyHash Filter by API key hash (SHA-256 hex string, as returned by the keys API).
   * @param date Filter by a single UTC date in the last 30 days (YYYY-MM-DD format).
   * @param userId Filter by org member user ID. Only applicable for organization accounts.
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
   * @throws GetUserActivityApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GetUserActivityError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getUserActivity(
    apiKeyHash: String? = null,
    date: String? = null,
    userId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ActivityResponse = executor.executeWithTypedErrors<Unit, GetUserActivityResponse, ActivityResponse>(
    request = SdkExecutionRequest(getUserActivityMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "api_key_hash", values = apiKeyHash?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "date", values = date?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "user_id", values = userId?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = AnalyticsCodecs.getUserActivityRequestCodecRegistry,
    responseDecoder = GetUserActivityResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetUserActivityResponse.SuccessJson -> response.json
        is GetUserActivityResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is GetUserActivityResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetUserActivityResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GetUserActivityResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GetUserActivityResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetUserActivityResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetUserActivityResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetUserActivityResponse.Http400Json -> GetUserActivityApiException(response, statusCode, headers)
        is GetUserActivityResponse.Http401Json -> GetUserActivityApiException(response, statusCode, headers)
        is GetUserActivityResponse.Http403Json -> GetUserActivityApiException(response, statusCode, headers)
        is GetUserActivityResponse.Http404Json -> GetUserActivityApiException(response, statusCode, headers)
        is GetUserActivityResponse.Http500Json -> GetUserActivityApiException(response, statusCode, headers)
        is GetUserActivityResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns user activity data grouped by endpoint for the last 30 (completed) UTC days. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param apiKeyHash Filter by API key hash (SHA-256 hex string, as returned by the keys API).
   * @param date Filter by a single UTC date in the last 30 days (YYYY-MM-DD format).
   * @param userId Filter by org member user ID. Only applicable for organization accounts.
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
  public suspend fun getUserActivityWithResponse(
    apiKeyHash: String? = null,
    date: String? = null,
    userId: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetUserActivityResponse> = executor.executeWithResponse<Unit, GetUserActivityResponse>(SdkExecutionRequest(getUserActivityMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "api_key_hash", values = apiKeyHash?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "date", values = date?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "user_id", values = userId?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), AnalyticsCodecs.getUserActivityRequestCodecRegistry, GetUserActivityResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `getUserActivity` may expose through its typed API exception.
   */
  public sealed interface GetUserActivityError

  /**
   * Typed response alternatives for `getUserActivity`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetUserActivityResponse {
    public class SuccessJson(
      public val json: ActivityResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetUserActivityResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetUserActivityResponse,
        GetUserActivityError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetUserActivityResponse,
        GetUserActivityError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetUserActivityResponse,
        GetUserActivityError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetUserActivityResponse,
        GetUserActivityError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetUserActivityResponse,
        GetUserActivityError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetUserActivityResponse
  }

  /**
   * Raised by `getUserActivity` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class GetUserActivityApiException(
    public val error: GetUserActivityError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getUserActivity")

  private object GetUserActivityResponseDecoder : SdkResponseAlternativeDecoder<GetUserActivityResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetUserActivityResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetUserActivityResponse> = when {
      alternative.id == "getUserActivity.response.alternative0" -> SdkResponseDecodeResult(
        value = GetUserActivityResponse.SuccessJson(
          json = AnalyticsCodecs.getUserActivityResponseCodecAlternative0Registry.select(listOf("getUserActivity.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getUserActivity.response.alternative1" -> SdkResponseDecodeResult(
        value = GetUserActivityResponse.Http400Json(
          json = AnalyticsCodecs.getUserActivityResponseCodecAlternative1Registry.select(listOf("getUserActivity.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getUserActivity.response.alternative2" -> SdkResponseDecodeResult(
        value = GetUserActivityResponse.Http401Json(
          json = AnalyticsCodecs.getUserActivityResponseCodecAlternative2Registry.select(listOf("getUserActivity.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getUserActivity.response.alternative3" -> SdkResponseDecodeResult(
        value = GetUserActivityResponse.Http403Json(
          json = AnalyticsCodecs.getUserActivityResponseCodecAlternative3Registry.select(listOf("getUserActivity.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getUserActivity.response.alternative4" -> SdkResponseDecodeResult(
        value = GetUserActivityResponse.Http404Json(
          json = AnalyticsCodecs.getUserActivityResponseCodecAlternative4Registry.select(listOf("getUserActivity.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getUserActivity.response.alternative5" -> SdkResponseDecodeResult(
        value = GetUserActivityResponse.Http500Json(
          json = AnalyticsCodecs.getUserActivityResponseCodecAlternative5Registry.select(listOf("getUserActivity.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetUserActivityResponse = GetUserActivityResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getUserActivityMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "getUserActivity",
          method = "GET",
          path = "/activity",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ActivityResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getUserActivity.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getUserActivity.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getUserActivity.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getUserActivity.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getUserActivity.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getUserActivity.response.alternative5",
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
        ) }
  }
}
