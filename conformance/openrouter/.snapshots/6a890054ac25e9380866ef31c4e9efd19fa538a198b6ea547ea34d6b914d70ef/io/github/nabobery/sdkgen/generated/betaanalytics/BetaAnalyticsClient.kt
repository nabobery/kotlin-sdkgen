package io.github.nabobery.sdkgen.generated.betaanalytics

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
import io.github.nabobery.sdkgen.generated.BadRequestResponse
import io.github.nabobery.sdkgen.generated.ForbiddenResponse
import io.github.nabobery.sdkgen.generated.InlineAnalyticsMetaGetResponse200JsonX5f96620f
import io.github.nabobery.sdkgen.generated.InlineAnalyticsQueryPostRequestJsonX9875bc1d
import io.github.nabobery.sdkgen.generated.InlineAnalyticsQueryPostResponse200JsonX4d61d88c
import io.github.nabobery.sdkgen.generated.InternalServerResponse
import io.github.nabobery.sdkgen.generated.RequestTimeoutResponse
import io.github.nabobery.sdkgen.generated.SdkJson
import io.github.nabobery.sdkgen.generated.UnauthorizedResponse
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

internal object BetaAnalyticsCodecs {
  internal const val GETANALYTICSMETA_RESPONSE_CODEC_ID: String = "getAnalyticsMeta.response"

  private val getAnalyticsMetaResponseCodec:
      MediaTypeCodec<InlineAnalyticsMetaGetResponse200JsonX5f96620f> =
      KotlinxSerializationCodec(GETANALYTICSMETA_RESPONSE_CODEC_ID, InlineAnalyticsMetaGetResponse200JsonX5f96620f.Serializer, SdkJson)

  private val getAnalyticsMetaResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineAnalyticsMetaGetResponse200JsonX5f96620f> =
      KotlinxSerializationCodec("getAnalyticsMeta.response.alternative0", InlineAnalyticsMetaGetResponse200JsonX5f96620f.Serializer, SdkJson)

  internal val getAnalyticsMetaResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineAnalyticsMetaGetResponse200JsonX5f96620f> =
      MediaTypeCodecRegistry.of(getAnalyticsMetaResponseCodecAlternative0Codec)

  private val getAnalyticsMetaResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getAnalyticsMeta.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val getAnalyticsMetaResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getAnalyticsMetaResponseCodecAlternative1Codec)

  private val getAnalyticsMetaResponseCodecAlternative2Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("getAnalyticsMeta.response.alternative2", ForbiddenResponse.Serializer, SdkJson)

  internal val getAnalyticsMetaResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(getAnalyticsMetaResponseCodecAlternative2Codec)

  private val getAnalyticsMetaResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("getAnalyticsMeta.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val getAnalyticsMetaResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getAnalyticsMetaResponseCodecAlternative3Codec)

  internal val getAnalyticsMetaRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getAnalyticsMetaResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineAnalyticsMetaGetResponse200JsonX5f96620f> =
      MediaTypeCodecRegistry.of(getAnalyticsMetaResponseCodec)

  internal const val QUERYANALYTICS_REQUEST_CODEC_ID: String = "queryAnalytics.request"

  private val queryAnalyticsRequestCodec:
      MediaTypeCodec<InlineAnalyticsQueryPostRequestJsonX9875bc1d> =
      KotlinxSerializationCodec(QUERYANALYTICS_REQUEST_CODEC_ID, InlineAnalyticsQueryPostRequestJsonX9875bc1d.Serializer, SdkJson)

  internal const val QUERYANALYTICS_RESPONSE_CODEC_ID: String = "queryAnalytics.response"

  private val queryAnalyticsResponseCodec:
      MediaTypeCodec<InlineAnalyticsQueryPostResponse200JsonX4d61d88c> =
      KotlinxSerializationCodec(QUERYANALYTICS_RESPONSE_CODEC_ID, InlineAnalyticsQueryPostResponse200JsonX4d61d88c.Serializer, SdkJson)

  private val queryAnalyticsResponseCodecAlternative0Codec:
      MediaTypeCodec<InlineAnalyticsQueryPostResponse200JsonX4d61d88c> =
      KotlinxSerializationCodec("queryAnalytics.response.alternative0", InlineAnalyticsQueryPostResponse200JsonX4d61d88c.Serializer, SdkJson)

  internal val queryAnalyticsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<InlineAnalyticsQueryPostResponse200JsonX4d61d88c> =
      MediaTypeCodecRegistry.of(queryAnalyticsResponseCodecAlternative0Codec)

  private val queryAnalyticsResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("queryAnalytics.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val queryAnalyticsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(queryAnalyticsResponseCodecAlternative1Codec)

  private val queryAnalyticsResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("queryAnalytics.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  internal val queryAnalyticsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(queryAnalyticsResponseCodecAlternative2Codec)

  private val queryAnalyticsResponseCodecAlternative3Codec: MediaTypeCodec<ForbiddenResponse> =
      KotlinxSerializationCodec("queryAnalytics.response.alternative3", ForbiddenResponse.Serializer, SdkJson)

  internal val queryAnalyticsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<ForbiddenResponse> =
      MediaTypeCodecRegistry.of(queryAnalyticsResponseCodecAlternative3Codec)

  private val queryAnalyticsResponseCodecAlternative4Codec: MediaTypeCodec<RequestTimeoutResponse> =
      KotlinxSerializationCodec("queryAnalytics.response.alternative4", RequestTimeoutResponse.Serializer, SdkJson)

  internal val queryAnalyticsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<RequestTimeoutResponse> =
      MediaTypeCodecRegistry.of(queryAnalyticsResponseCodecAlternative4Codec)

  private val queryAnalyticsResponseCodecAlternative5Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("queryAnalytics.response.alternative5", InternalServerResponse.Serializer, SdkJson)

  internal val queryAnalyticsResponseCodecAlternative5Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(queryAnalyticsResponseCodecAlternative5Codec)

  internal val queryAnalyticsRequestCodecRegistry:
      MediaTypeCodecRegistry<InlineAnalyticsQueryPostRequestJsonX9875bc1d> =
      MediaTypeCodecRegistry.of(queryAnalyticsRequestCodec)

  internal val queryAnalyticsResponseCodecRegistry:
      MediaTypeCodecRegistry<InlineAnalyticsQueryPostResponse200JsonX4d61d88c> =
      MediaTypeCodecRegistry.of(queryAnalyticsResponseCodec)
}

/**
 * Client for the 'beta.Analytics' group of OpenRouter API.
 */
public class BetaAnalyticsClient(
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
      SdkExecutor(transport, authentication = this@BetaAnalyticsClient.authentication)

  /**
   * Returns the available metrics, dimensions, filter operators, and granularities for the analytics query endpoint.
   * [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
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
   * @throws GetAnalyticsMetaApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GetAnalyticsMetaError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getAnalyticsMeta(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineAnalyticsMetaGetResponse200JsonX5f96620f = executor.executeWithTypedErrors<Unit, GetAnalyticsMetaResponse, InlineAnalyticsMetaGetResponse200JsonX5f96620f>(
    request = SdkExecutionRequest(getAnalyticsMetaMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BetaAnalyticsCodecs.getAnalyticsMetaRequestCodecRegistry,
    responseDecoder = GetAnalyticsMetaResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetAnalyticsMetaResponse.SuccessJson -> response.json
        is GetAnalyticsMetaResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is GetAnalyticsMetaResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is GetAnalyticsMetaResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetAnalyticsMetaResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetAnalyticsMetaResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetAnalyticsMetaResponse.Http401Json -> GetAnalyticsMetaApiException(response, statusCode, headers)
        is GetAnalyticsMetaResponse.Http403Json -> GetAnalyticsMetaApiException(response, statusCode, headers)
        is GetAnalyticsMetaResponse.Http500Json -> GetAnalyticsMetaApiException(response, statusCode, headers)
        is GetAnalyticsMetaResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns the available metrics, dimensions, filter operators, and granularities for the analytics query endpoint.
   * [Management key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
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
  public suspend fun getAnalyticsMetaWithResponse(
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAnalyticsMetaResponse> = executor.executeWithResponse<Unit, GetAnalyticsMetaResponse>(SdkExecutionRequest(getAnalyticsMetaMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), BetaAnalyticsCodecs.getAnalyticsMetaRequestCodecRegistry, GetAnalyticsMetaResponseDecoder, options)

  /**
   * Execute an analytics query with specified metrics, dimensions, filters, and time range. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * @param request Request body sent to the operation.
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
   * @throws QueryAnalyticsApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded QueryAnalyticsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun queryAnalytics(
    request: InlineAnalyticsQueryPostRequestJsonX9875bc1d,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): InlineAnalyticsQueryPostResponse200JsonX4d61d88c = executor.executeWithTypedErrors<InlineAnalyticsQueryPostRequestJsonX9875bc1d, QueryAnalyticsResponse, InlineAnalyticsQueryPostResponse200JsonX4d61d88c>(
    request = SdkExecutionRequest(queryAnalyticsMetadata, baseUri, request, listOf(BetaAnalyticsCodecs.QUERYANALYTICS_REQUEST_CODEC_ID), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = BetaAnalyticsCodecs.queryAnalyticsRequestCodecRegistry,
    responseDecoder = QueryAnalyticsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is QueryAnalyticsResponse.SuccessJson -> response.json
        is QueryAnalyticsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is QueryAnalyticsResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is QueryAnalyticsResponse.Http403Json -> error("Runtime selected a non-success response for success mapping.")
        is QueryAnalyticsResponse.Http408Json -> error("Runtime selected a non-success response for success mapping.")
        is QueryAnalyticsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is QueryAnalyticsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is QueryAnalyticsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is QueryAnalyticsResponse.Http400Json -> QueryAnalyticsApiException(response, statusCode, headers)
        is QueryAnalyticsResponse.Http401Json -> QueryAnalyticsApiException(response, statusCode, headers)
        is QueryAnalyticsResponse.Http403Json -> QueryAnalyticsApiException(response, statusCode, headers)
        is QueryAnalyticsResponse.Http408Json -> QueryAnalyticsApiException(response, statusCode, headers)
        is QueryAnalyticsResponse.Http500Json -> QueryAnalyticsApiException(response, statusCode, headers)
        is QueryAnalyticsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Execute an analytics query with specified metrics, dimensions, filters, and time range. [Management
   * key](/docs/guides/overview/auth/management-api-keys) required.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param request Request body sent to the operation.
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
  public suspend fun queryAnalyticsWithResponse(
    request: InlineAnalyticsQueryPostRequestJsonX9875bc1d,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<QueryAnalyticsResponse> = executor.executeWithResponse<InlineAnalyticsQueryPostRequestJsonX9875bc1d, QueryAnalyticsResponse>(SdkExecutionRequest(queryAnalyticsMetadata, baseUri, request, listOf(BetaAnalyticsCodecs.QUERYANALYTICS_REQUEST_CODEC_ID), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), BetaAnalyticsCodecs.queryAnalyticsRequestCodecRegistry, QueryAnalyticsResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `getAnalyticsMeta` may expose through its typed API exception.
   */
  public sealed interface GetAnalyticsMetaError

  /**
   * Typed response alternatives for `getAnalyticsMeta`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetAnalyticsMetaResponse {
    public class SuccessJson(
      public val json: InlineAnalyticsMetaGetResponse200JsonX5f96620f,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAnalyticsMetaResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAnalyticsMetaResponse,
        GetAnalyticsMetaError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAnalyticsMetaResponse,
        GetAnalyticsMetaError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAnalyticsMetaResponse,
        GetAnalyticsMetaError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAnalyticsMetaResponse
  }

  /**
   * Raised by `getAnalyticsMeta` after decoding a declared non-success response. [error] is typed and is not included
   * in the exception message or diagnostic rendering.
   */
  public class GetAnalyticsMetaApiException(
    public val error: GetAnalyticsMetaError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getAnalyticsMeta")

  private object GetAnalyticsMetaResponseDecoder : SdkResponseAlternativeDecoder<GetAnalyticsMetaResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAnalyticsMetaResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAnalyticsMetaResponse> = when {
      alternative.id == "getAnalyticsMeta.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAnalyticsMetaResponse.SuccessJson(
          json = BetaAnalyticsCodecs.getAnalyticsMetaResponseCodecAlternative0Registry.select(listOf("getAnalyticsMeta.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getAnalyticsMeta.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAnalyticsMetaResponse.Http401Json(
          json = BetaAnalyticsCodecs.getAnalyticsMetaResponseCodecAlternative1Registry.select(listOf("getAnalyticsMeta.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getAnalyticsMeta.response.alternative2" -> SdkResponseDecodeResult(
        value = GetAnalyticsMetaResponse.Http403Json(
          json = BetaAnalyticsCodecs.getAnalyticsMetaResponseCodecAlternative2Registry.select(listOf("getAnalyticsMeta.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getAnalyticsMeta.response.alternative3" -> SdkResponseDecodeResult(
        value = GetAnalyticsMetaResponse.Http500Json(
          json = BetaAnalyticsCodecs.getAnalyticsMetaResponseCodecAlternative3Registry.select(listOf("getAnalyticsMeta.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetAnalyticsMetaResponse = GetAnalyticsMetaResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `queryAnalytics` may expose through its typed API exception.
   */
  public sealed interface QueryAnalyticsError

  /**
   * Typed response alternatives for `queryAnalytics`. Non-success alternatives are not converted into success values.
   */
  public sealed interface QueryAnalyticsResponse {
    public class SuccessJson(
      public val json: InlineAnalyticsQueryPostResponse200JsonX4d61d88c,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : QueryAnalyticsResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : QueryAnalyticsResponse,
        QueryAnalyticsError

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : QueryAnalyticsResponse,
        QueryAnalyticsError

    public class Http403Json(
      public val json: ForbiddenResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : QueryAnalyticsResponse,
        QueryAnalyticsError

    public class Http408Json(
      public val json: RequestTimeoutResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : QueryAnalyticsResponse,
        QueryAnalyticsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : QueryAnalyticsResponse,
        QueryAnalyticsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : QueryAnalyticsResponse
  }

  /**
   * Raised by `queryAnalytics` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class QueryAnalyticsApiException(
    public val error: QueryAnalyticsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "queryAnalytics")

  private object QueryAnalyticsResponseDecoder : SdkResponseAlternativeDecoder<QueryAnalyticsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): QueryAnalyticsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<QueryAnalyticsResponse> = when {
      alternative.id == "queryAnalytics.response.alternative0" -> SdkResponseDecodeResult(
        value = QueryAnalyticsResponse.SuccessJson(
          json = BetaAnalyticsCodecs.queryAnalyticsResponseCodecAlternative0Registry.select(listOf("queryAnalytics.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "queryAnalytics.response.alternative1" -> SdkResponseDecodeResult(
        value = QueryAnalyticsResponse.Http400Json(
          json = BetaAnalyticsCodecs.queryAnalyticsResponseCodecAlternative1Registry.select(listOf("queryAnalytics.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "queryAnalytics.response.alternative2" -> SdkResponseDecodeResult(
        value = QueryAnalyticsResponse.Http401Json(
          json = BetaAnalyticsCodecs.queryAnalyticsResponseCodecAlternative2Registry.select(listOf("queryAnalytics.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "queryAnalytics.response.alternative3" -> SdkResponseDecodeResult(
        value = QueryAnalyticsResponse.Http403Json(
          json = BetaAnalyticsCodecs.queryAnalyticsResponseCodecAlternative3Registry.select(listOf("queryAnalytics.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "queryAnalytics.response.alternative4" -> SdkResponseDecodeResult(
        value = QueryAnalyticsResponse.Http408Json(
          json = BetaAnalyticsCodecs.queryAnalyticsResponseCodecAlternative4Registry.select(listOf("queryAnalytics.response.alternative4"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "queryAnalytics.response.alternative5" -> SdkResponseDecodeResult(
        value = QueryAnalyticsResponse.Http500Json(
          json = BetaAnalyticsCodecs.queryAnalyticsResponseCodecAlternative5Registry.select(listOf("queryAnalytics.response.alternative5"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): QueryAnalyticsResponse = QueryAnalyticsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getAnalyticsMetaMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "getAnalyticsMeta",
          method = "GET",
          path = "/analytics/meta",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAnalyticsMetaGetResponse200JsonX5f96620f",
              mode = SdkResponseMode.BUFFERED,
              id = "getAnalyticsMeta.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getAnalyticsMeta.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getAnalyticsMeta.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getAnalyticsMeta.response.alternative3",
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

    internal val queryAnalyticsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "queryAnalytics",
          method = "POST",
          path = "/analytics/query",
          requestMediaTypes = listOf("application/json"),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "InlineAnalyticsQueryPostResponse200JsonX4d61d88c",
              mode = SdkResponseMode.BUFFERED,
              id = "queryAnalytics.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "queryAnalytics.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "queryAnalytics.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 403),
              mediaTypes = listOf("application/json"),
              typeTag = "ForbiddenResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "queryAnalytics.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 408),
              mediaTypes = listOf("application/json"),
              typeTag = "RequestTimeoutResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "queryAnalytics.response.alternative4",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "queryAnalytics.response.alternative5",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "apiKey", scopes = emptyList()),
            )),
          ),
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
