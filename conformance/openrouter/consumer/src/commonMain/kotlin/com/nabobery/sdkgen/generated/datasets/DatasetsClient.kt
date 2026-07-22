package com.nabobery.sdkgen.generated.datasets

import com.nabobery.sdkgen.generated.AppRankingsResponse
import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.InlinePathsDatasetsAppRankingsGetParameters0Schema
import com.nabobery.sdkgen.generated.InlinePathsDatasetsAppRankingsGetParameters1Schema
import com.nabobery.sdkgen.generated.InlinePathsDatasetsAppRankingsGetParameters2Schema
import com.nabobery.sdkgen.generated.InlinePathsDatasetsRankingsDailyGetParameters2Schema
import com.nabobery.sdkgen.generated.InlinePathsDatasetsRankingsDailyGetParameters3Schema
import com.nabobery.sdkgen.generated.InlinePathsDatasetsRankingsDailyGetParameters4Schema
import com.nabobery.sdkgen.generated.InlinePathsDatasetsRankingsDailyGetParameters5Schema
import com.nabobery.sdkgen.generated.InlinePathsDatasetsRankingsDailyGetParameters6Schema
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.RankingsDailyResponse
import com.nabobery.sdkgen.generated.SdkJson
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

public object DatasetsCodecs {
  public const val GETAPPRANKINGS_RESPONSE_CODEC_ID: String = "getAppRankings.response"

  private val getAppRankingsResponseCodec: MediaTypeCodec<AppRankingsResponse> =
      KotlinxSerializationCodec(GETAPPRANKINGS_RESPONSE_CODEC_ID, AppRankingsResponse.Serializer, SdkJson)

  private val getAppRankingsResponseCodecAlternative0Codec: MediaTypeCodec<AppRankingsResponse> =
      KotlinxSerializationCodec("getAppRankings.response.alternative0", AppRankingsResponse.Serializer, SdkJson)

  public val getAppRankingsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<AppRankingsResponse> =
      MediaTypeCodecRegistry.of(getAppRankingsResponseCodecAlternative0Codec)

  private val getAppRankingsResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("getAppRankings.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val getAppRankingsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(getAppRankingsResponseCodecAlternative1Codec)

  private val getAppRankingsResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getAppRankings.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val getAppRankingsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getAppRankingsResponseCodecAlternative2Codec)

  private val getAppRankingsResponseCodecAlternative3Codec: MediaTypeCodec<TooManyRequestsResponse>
      =
      KotlinxSerializationCodec("getAppRankings.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  public val getAppRankingsResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(getAppRankingsResponseCodecAlternative3Codec)

  private val getAppRankingsResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getAppRankings.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val getAppRankingsResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getAppRankingsResponseCodecAlternative4Codec)

  public val getAppRankingsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getAppRankingsResponseCodecRegistry: MediaTypeCodecRegistry<AppRankingsResponse> =
      MediaTypeCodecRegistry.of(getAppRankingsResponseCodec)

  public const val GETRANKINGSDAILY_RESPONSE_CODEC_ID: String = "getRankingsDaily.response"

  private val getRankingsDailyResponseCodec: MediaTypeCodec<RankingsDailyResponse> =
      KotlinxSerializationCodec(GETRANKINGSDAILY_RESPONSE_CODEC_ID, RankingsDailyResponse.Serializer, SdkJson)

  private val getRankingsDailyResponseCodecAlternative0Codec: MediaTypeCodec<RankingsDailyResponse>
      =
      KotlinxSerializationCodec("getRankingsDaily.response.alternative0", RankingsDailyResponse.Serializer, SdkJson)

  public val getRankingsDailyResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<RankingsDailyResponse> =
      MediaTypeCodecRegistry.of(getRankingsDailyResponseCodecAlternative0Codec)

  private val getRankingsDailyResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("getRankingsDaily.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val getRankingsDailyResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(getRankingsDailyResponseCodecAlternative1Codec)

  private val getRankingsDailyResponseCodecAlternative2Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("getRankingsDaily.response.alternative2", UnauthorizedResponse.Serializer, SdkJson)

  public val getRankingsDailyResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(getRankingsDailyResponseCodecAlternative2Codec)

  private val getRankingsDailyResponseCodecAlternative3Codec:
      MediaTypeCodec<TooManyRequestsResponse> =
      KotlinxSerializationCodec("getRankingsDaily.response.alternative3", TooManyRequestsResponse.Serializer, SdkJson)

  public val getRankingsDailyResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<TooManyRequestsResponse> =
      MediaTypeCodecRegistry.of(getRankingsDailyResponseCodecAlternative3Codec)

  private val getRankingsDailyResponseCodecAlternative4Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("getRankingsDaily.response.alternative4", InternalServerResponse.Serializer, SdkJson)

  public val getRankingsDailyResponseCodecAlternative4Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getRankingsDailyResponseCodecAlternative4Codec)

  public val getRankingsDailyRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getRankingsDailyResponseCodecRegistry: MediaTypeCodecRegistry<RankingsDailyResponse> =
      MediaTypeCodecRegistry.of(getRankingsDailyResponseCodec)
}

/**
 * Client for the 'Datasets' group of OpenRouter API.
 */
public class DatasetsClient(
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
      SdkExecutor(transport, authentication = this@DatasetsClient.authentication)

  /**
   * Returns the top public apps on OpenRouter ranked by token usage inside the requested
   * date window, matching the public apps marketplace on openrouter.ai/apps. Token totals
   * are `prompt_tokens + completion_tokens`; hidden and private apps are excluded and
   * traffic from related app aliases is merged into the canonical visible app.
   *
   * `sort=popular` (default) ranks by total token volume inside the window.
   * `sort=trending` ranks by absolute excess token growth: window volume minus the average
   * volume of the three equal-length periods immediately preceding the window. Apps with
   * no excess growth are omitted, so `trending` may return fewer than `limit` rows.
   *
   * Filter with `category` (marketplace category group, e.g. `coding`) or `subcategory`
   * (e.g. `cli-agent`). Ranks are re-numbered 1..N after filtering. Page with `offset` —
   * `rank` stays absolute, so the first row of `offset=50` is `rank: 51`.
   *
   * Authenticate with any valid OpenRouter API key (same key used for inference).
   * Rate-limited to 30 requests/minute per key and 500 requests/day per account.
   *
   * When republishing or quoting this dataset, OpenRouter must be cited as:
   * "Source: OpenRouter (openrouter.ai/apps), as of {as_of}."
   *
   * Token counts come from each upstream provider's own tokenizer, so a token attributed
   * to one app is not directly comparable to a token attributed to another app whose
   * traffic flows through a different provider.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getAppRankings(
    category: InlinePathsDatasetsAppRankingsGetParameters0Schema? = null,
    endDate: String? = null,
    limit: Int? = null,
    offset: Int? = null,
    sort: InlinePathsDatasetsAppRankingsGetParameters2Schema? = null,
    startDate: String? = null,
    subcategory: InlinePathsDatasetsAppRankingsGetParameters1Schema? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): AppRankingsResponse = executor.execute<Unit, AppRankingsResponse>(SdkExecutionRequest(getAppRankingsMetadata,
    baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "category", values = category?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "end_date", values = endDate?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "start_date", values = startDate?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "subcategory", values = subcategory?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(DatasetsCodecs.GETAPPRANKINGS_RESPONSE_CODEC_ID), DatasetsCodecs.getAppRankingsRequestCodecRegistry,
    DatasetsCodecs.getAppRankingsResponseCodecRegistry, options)

  /**
   * Returns the top public apps on OpenRouter ranked by token usage inside the requested
   * date window, matching the public apps marketplace on openrouter.ai/apps. Token totals
   * are `prompt_tokens + completion_tokens`; hidden and private apps are excluded and
   * traffic from related app aliases is merged into the canonical visible app.
   *
   * `sort=popular` (default) ranks by total token volume inside the window.
   * `sort=trending` ranks by absolute excess token growth: window volume minus the average
   * volume of the three equal-length periods immediately preceding the window. Apps with
   * no excess growth are omitted, so `trending` may return fewer than `limit` rows.
   *
   * Filter with `category` (marketplace category group, e.g. `coding`) or `subcategory`
   * (e.g. `cli-agent`). Ranks are re-numbered 1..N after filtering. Page with `offset` —
   * `rank` stays absolute, so the first row of `offset=50` is `rank: 51`.
   *
   * Authenticate with any valid OpenRouter API key (same key used for inference).
   * Rate-limited to 30 requests/minute per key and 500 requests/day per account.
   *
   * When republishing or quoting this dataset, OpenRouter must be cited as:
   * "Source: OpenRouter (openrouter.ai/apps), as of {as_of}."
   *
   * Token counts come from each upstream provider's own tokenizer, so a token attributed
   * to one app is not directly comparable to a token attributed to another app whose
   * traffic flows through a different provider.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getAppRankingsWithResponse(
    category: InlinePathsDatasetsAppRankingsGetParameters0Schema? = null,
    endDate: String? = null,
    limit: Int? = null,
    offset: Int? = null,
    sort: InlinePathsDatasetsAppRankingsGetParameters2Schema? = null,
    startDate: String? = null,
    subcategory: InlinePathsDatasetsAppRankingsGetParameters1Schema? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetAppRankingsResponse> = executor.executeWithResponse<Unit,
    GetAppRankingsResponse>(SdkExecutionRequest(getAppRankingsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "category", values = category?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "end_date", values = endDate?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "start_date", values = startDate?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "subcategory", values = subcategory?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), DatasetsCodecs.getAppRankingsRequestCodecRegistry, GetAppRankingsResponseDecoder, options)

  /**
   * Returns the top 50 public models per day by total token usage on OpenRouter, plus a
   * single aggregated `other` row per day that sums every model outside that top 50.
   * Token totals are `prompt_tokens + completion_tokens`, matching the public rankings
   * chart on openrouter.ai/rankings.
   *
   * Each row is a distinct `(date, model_permaslug)` pair. The `other` row uses the
   * reserved permaslug `other` and is always returned last within its date, so callers
   * can compute `top-50 traffic / total daily traffic` without a second request.
   *
   * Optional filters slice the dataset. `period` (`day`/`week`/`month`) sets the time
   * grain. `modality` and `context_bucket` narrow the exact dataset by output/input
   * modality (or tool-calling activity) and request context length. `category` and
   * `language_type` instead read a sampled, upsampled dataset whose `total_tokens` are
   * weekly-grain estimates — they cannot be combined with each other or with the exact
   * filters, and reject `period=day` with a 400.
   *
   * Authenticate with any valid OpenRouter API key (same key used for inference).
   * Rate-limited to 30 requests/minute per key and 500 requests/day per account.
   *
   * When republishing or quoting this dataset, OpenRouter must be cited as:
   * "Source: OpenRouter (openrouter.ai/rankings), as of {as_of}."
   *
   * Token counts come from each upstream provider's own tokenizer (Anthropic counts
   * are as reported by Anthropic, OpenAI counts are as reported by OpenAI, etc.), so
   * a token in one row is not directly comparable to a token in another row from a
   * different provider.
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getRankingsDaily(
    category: InlinePathsDatasetsRankingsDailyGetParameters5Schema? = null,
    contextBucket: InlinePathsDatasetsRankingsDailyGetParameters4Schema? = null,
    endDate: String? = null,
    languageType: InlinePathsDatasetsRankingsDailyGetParameters6Schema? = null,
    modality: InlinePathsDatasetsRankingsDailyGetParameters3Schema? = null,
    period: InlinePathsDatasetsRankingsDailyGetParameters2Schema? = null,
    startDate: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): RankingsDailyResponse = executor.execute<Unit,
    RankingsDailyResponse>(SdkExecutionRequest(getRankingsDailyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "category", values = category?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "context_bucket", values =
      contextBucket?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "end_date", values = endDate?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "language_type", values = languageType?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "modality", values = modality?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "period", values = period?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "start_date", values = startDate?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(DatasetsCodecs.GETRANKINGSDAILY_RESPONSE_CODEC_ID), DatasetsCodecs.getRankingsDailyRequestCodecRegistry,
    DatasetsCodecs.getRankingsDailyResponseCodecRegistry, options)

  /**
   * Returns the top 50 public models per day by total token usage on OpenRouter, plus a
   * single aggregated `other` row per day that sums every model outside that top 50.
   * Token totals are `prompt_tokens + completion_tokens`, matching the public rankings
   * chart on openrouter.ai/rankings.
   *
   * Each row is a distinct `(date, model_permaslug)` pair. The `other` row uses the
   * reserved permaslug `other` and is always returned last within its date, so callers
   * can compute `top-50 traffic / total daily traffic` without a second request.
   *
   * Optional filters slice the dataset. `period` (`day`/`week`/`month`) sets the time
   * grain. `modality` and `context_bucket` narrow the exact dataset by output/input
   * modality (or tool-calling activity) and request context length. `category` and
   * `language_type` instead read a sampled, upsampled dataset whose `total_tokens` are
   * weekly-grain estimates — they cannot be combined with each other or with the exact
   * filters, and reject `period=day` with a 400.
   *
   * Authenticate with any valid OpenRouter API key (same key used for inference).
   * Rate-limited to 30 requests/minute per key and 500 requests/day per account.
   *
   * When republishing or quoting this dataset, OpenRouter must be cited as:
   * "Source: OpenRouter (openrouter.ai/rankings), as of {as_of}."
   *
   * Token counts come from each upstream provider's own tokenizer (Anthropic counts
   * are as reported by Anthropic, OpenAI counts are as reported by OpenAI, etc.), so
   * a token in one row is not directly comparable to a token in another row from a
   * different provider.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getRankingsDailyWithResponse(
    category: InlinePathsDatasetsRankingsDailyGetParameters5Schema? = null,
    contextBucket: InlinePathsDatasetsRankingsDailyGetParameters4Schema? = null,
    endDate: String? = null,
    languageType: InlinePathsDatasetsRankingsDailyGetParameters6Schema? = null,
    modality: InlinePathsDatasetsRankingsDailyGetParameters3Schema? = null,
    period: InlinePathsDatasetsRankingsDailyGetParameters2Schema? = null,
    startDate: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetRankingsDailyResponse> = executor.executeWithResponse<Unit,
    GetRankingsDailyResponse>(SdkExecutionRequest(getRankingsDailyMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "category", values = category?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "context_bucket", values =
      contextBucket?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "end_date", values = endDate?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "language_type", values = languageType?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "modality", values = modality?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "period", values = period?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "start_date", values = startDate?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), DatasetsCodecs.getRankingsDailyRequestCodecRegistry, GetRankingsDailyResponseDecoder, options)

  /**
   * Typed response alternatives for `getAppRankings`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetAppRankingsResponse {
    public class SuccessJson(
      public val json: AppRankingsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppRankingsResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppRankingsResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppRankingsResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppRankingsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppRankingsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetAppRankingsResponse
  }

  private object GetAppRankingsResponseDecoder : SdkResponseAlternativeDecoder<GetAppRankingsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetAppRankingsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetAppRankingsResponse> = when {
      alternative.id == "getAppRankings.response.alternative0" -> SdkResponseDecodeResult(
        value = GetAppRankingsResponse.SuccessJson(
          json = DatasetsCodecs.getAppRankingsResponseCodecAlternative0Registry
            .select(listOf("getAppRankings.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getAppRankings.response.alternative1" -> SdkResponseDecodeResult(
        value = GetAppRankingsResponse.Http400Json(
          json = DatasetsCodecs.getAppRankingsResponseCodecAlternative1Registry
            .select(listOf("getAppRankings.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getAppRankings.response.alternative2" -> SdkResponseDecodeResult(
        value = GetAppRankingsResponse.Http401Json(
          json = DatasetsCodecs.getAppRankingsResponseCodecAlternative2Registry
            .select(listOf("getAppRankings.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getAppRankings.response.alternative3" -> SdkResponseDecodeResult(
        value = GetAppRankingsResponse.Http429Json(
          json = DatasetsCodecs.getAppRankingsResponseCodecAlternative3Registry
            .select(listOf("getAppRankings.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getAppRankings.response.alternative4" -> SdkResponseDecodeResult(
        value = GetAppRankingsResponse.Http500Json(
          json = DatasetsCodecs.getAppRankingsResponseCodecAlternative4Registry
            .select(listOf("getAppRankings.response.alternative4"), mediaType ?: "application/json").decode(body,
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
    ): GetAppRankingsResponse = GetAppRankingsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Typed response alternatives for `getRankingsDaily`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetRankingsDailyResponse {
    public class SuccessJson(
      public val json: RankingsDailyResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRankingsDailyResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRankingsDailyResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRankingsDailyResponse

    public class Http429Json(
      public val json: TooManyRequestsResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRankingsDailyResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRankingsDailyResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetRankingsDailyResponse
  }

  private object GetRankingsDailyResponseDecoder : SdkResponseAlternativeDecoder<GetRankingsDailyResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetRankingsDailyResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetRankingsDailyResponse> = when {
      alternative.id == "getRankingsDaily.response.alternative0" -> SdkResponseDecodeResult(
        value = GetRankingsDailyResponse.SuccessJson(
          json = DatasetsCodecs.getRankingsDailyResponseCodecAlternative0Registry
            .select(listOf("getRankingsDaily.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getRankingsDaily.response.alternative1" -> SdkResponseDecodeResult(
        value = GetRankingsDailyResponse.Http400Json(
          json = DatasetsCodecs.getRankingsDailyResponseCodecAlternative1Registry
            .select(listOf("getRankingsDaily.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getRankingsDaily.response.alternative2" -> SdkResponseDecodeResult(
        value = GetRankingsDailyResponse.Http401Json(
          json = DatasetsCodecs.getRankingsDailyResponseCodecAlternative2Registry
            .select(listOf("getRankingsDaily.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getRankingsDaily.response.alternative3" -> SdkResponseDecodeResult(
        value = GetRankingsDailyResponse.Http429Json(
          json = DatasetsCodecs.getRankingsDailyResponseCodecAlternative3Registry
            .select(listOf("getRankingsDaily.response.alternative3"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getRankingsDaily.response.alternative4" -> SdkResponseDecodeResult(
        value = GetRankingsDailyResponse.Http500Json(
          json = DatasetsCodecs.getRankingsDailyResponseCodecAlternative4Registry
            .select(listOf("getRankingsDaily.response.alternative4"), mediaType ?: "application/json").decode(body,
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
    ): GetRankingsDailyResponse = GetRankingsDailyResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getAppRankingsMetadata: OperationMetadata = OperationMetadata(
          operationId = "getAppRankings",
          method = "GET",
          path = "/datasets/app-rankings",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "AppRankingsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getAppRankings.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getAppRankings.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getAppRankings.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getAppRankings.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getAppRankings.response.alternative4",
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

    public val getRankingsDailyMetadata: OperationMetadata = OperationMetadata(
          operationId = "getRankingsDaily",
          method = "GET",
          path = "/datasets/rankings-daily",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "RankingsDailyResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getRankingsDaily.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getRankingsDaily.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getRankingsDaily.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 429),
              mediaTypes = listOf("application/json"),
              typeTag = "TooManyRequestsResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getRankingsDaily.response.alternative3",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getRankingsDaily.response.alternative4",
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
