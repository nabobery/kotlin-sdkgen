package com.nabobery.sdkgen.generated.models

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.InlineModelsGetParameterX21879c75
import com.nabobery.sdkgen.generated.InlineModelsGetParameterX490d8ee9
import com.nabobery.sdkgen.generated.InlineModelsGetParameterX6456382f
import com.nabobery.sdkgen.generated.InlineModelsGetParameterXacca3485
import com.nabobery.sdkgen.generated.InlineModelsGetParameterXd2c28b08
import com.nabobery.sdkgen.generated.InternalServerResponse
import com.nabobery.sdkgen.generated.ModelResponse
import com.nabobery.sdkgen.generated.ModelsCountResponse
import com.nabobery.sdkgen.generated.ModelsListResponse
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
import kotlin.Double
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

internal object ModelsCodecs {
  internal const val GETMODEL_RESPONSE_CODEC_ID: String = "getModel.response"

  private val getModelResponseCodec: MediaTypeCodec<ModelResponse> =
      KotlinxSerializationCodec(GETMODEL_RESPONSE_CODEC_ID, ModelResponse.Serializer, SdkJson)

  private val getModelResponseCodecAlternative0Codec: MediaTypeCodec<ModelResponse> =
      KotlinxSerializationCodec("getModel.response.alternative0", ModelResponse.Serializer, SdkJson)

  internal val getModelResponseCodecAlternative0Registry: MediaTypeCodecRegistry<ModelResponse> =
      MediaTypeCodecRegistry.of(getModelResponseCodecAlternative0Codec)

  private val getModelResponseCodecAlternative1Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getModel.response.alternative1", NotFoundResponse.Serializer, SdkJson)

  internal val getModelResponseCodecAlternative1Registry: MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getModelResponseCodecAlternative1Codec)

  private val getModelResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getModel.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  internal val getModelResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getModelResponseCodecAlternative2Codec)

  internal val getModelRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getModelResponseCodecRegistry: MediaTypeCodecRegistry<ModelResponse> =
      MediaTypeCodecRegistry.of(getModelResponseCodec)

  internal const val GETMODELS_RESPONSE_CODEC_ID: String = "getModels.response"

  private val getModelsResponseCodec: MediaTypeCodec<ModelsListResponse> =
      KotlinxSerializationCodec(GETMODELS_RESPONSE_CODEC_ID, ModelsListResponse.Serializer, SdkJson)

  private val getModelsResponseCodecAlternative0Codec: MediaTypeCodec<ModelsListResponse> =
      KotlinxSerializationCodec("getModels.response.alternative0", ModelsListResponse.Serializer, SdkJson)

  internal val getModelsResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ModelsListResponse> =
      MediaTypeCodecRegistry.of(getModelsResponseCodecAlternative0Codec)

  private val getModelsResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("getModels.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val getModelsResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(getModelsResponseCodecAlternative1Codec)

  private val getModelsResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getModels.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  internal val getModelsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getModelsResponseCodecAlternative2Codec)

  internal val getModelsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val getModelsResponseCodecRegistry: MediaTypeCodecRegistry<ModelsListResponse> =
      MediaTypeCodecRegistry.of(getModelsResponseCodec)

  internal const val LISTMODELSCOUNT_RESPONSE_CODEC_ID: String = "listModelsCount.response"

  private val listModelsCountResponseCodec: MediaTypeCodec<ModelsCountResponse> =
      KotlinxSerializationCodec(LISTMODELSCOUNT_RESPONSE_CODEC_ID, ModelsCountResponse.Serializer, SdkJson)

  private val listModelsCountResponseCodecAlternative0Codec: MediaTypeCodec<ModelsCountResponse> =
      KotlinxSerializationCodec("listModelsCount.response.alternative0", ModelsCountResponse.Serializer, SdkJson)

  internal val listModelsCountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ModelsCountResponse> =
      MediaTypeCodecRegistry.of(listModelsCountResponseCodecAlternative0Codec)

  private val listModelsCountResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("listModelsCount.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  internal val listModelsCountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(listModelsCountResponseCodecAlternative1Codec)

  private val listModelsCountResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("listModelsCount.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  internal val listModelsCountResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listModelsCountResponseCodecAlternative2Codec)

  internal val listModelsCountRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listModelsCountResponseCodecRegistry: MediaTypeCodecRegistry<ModelsCountResponse> =
      MediaTypeCodecRegistry.of(listModelsCountResponseCodec)

  internal const val LISTMODELSUSER_RESPONSE_CODEC_ID: String = "listModelsUser.response"

  private val listModelsUserResponseCodec: MediaTypeCodec<ModelsListResponse> =
      KotlinxSerializationCodec(LISTMODELSUSER_RESPONSE_CODEC_ID, ModelsListResponse.Serializer, SdkJson)

  private val listModelsUserResponseCodecAlternative0Codec: MediaTypeCodec<ModelsListResponse> =
      KotlinxSerializationCodec("listModelsUser.response.alternative0", ModelsListResponse.Serializer, SdkJson)

  internal val listModelsUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ModelsListResponse> =
      MediaTypeCodecRegistry.of(listModelsUserResponseCodecAlternative0Codec)

  private val listModelsUserResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listModelsUser.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  internal val listModelsUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listModelsUserResponseCodecAlternative1Codec)

  private val listModelsUserResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listModelsUser.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  internal val listModelsUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listModelsUserResponseCodecAlternative2Codec)

  private val listModelsUserResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listModelsUser.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  internal val listModelsUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listModelsUserResponseCodecAlternative3Codec)

  internal val listModelsUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  internal val listModelsUserResponseCodecRegistry: MediaTypeCodecRegistry<ModelsListResponse> =
      MediaTypeCodecRegistry.of(listModelsUserResponseCodec)
}

/**
 * Client for the 'Models' group of OpenRouter API.
 */
public class ModelsClient(
  transport: SdkTransport,
  private val baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  private val contractSecuritySchemes: Map<String, SecurityScheme> = mapOf(
        "apiKey" to SecurityScheme.HttpBearer(),
        "bearer" to SecurityScheme.HttpBearer(),
      )

  private val authentication: SdkAuthentication? = authentication ?: SecuritySchemeAuthentication(
        bindings =
          contractSecuritySchemes.mapNotNull { (schemeId, scheme) ->
            credentialProviders[schemeId]?.let { provider -> schemeId to SecuritySchemeBinding(scheme, provider) }
          }.toMap(),
        trustedHosts = trustedHosts ?: TrustedHosts.of(baseUri),
      )

  private val executor: SdkExecutor =
      SdkExecutor(transport, authentication = this@ModelsClient.authentication)

  /**
   * Returns full details for a single model identified by its author and slug (e.g. openai/gpt-4). Supports variant
   * suffixes (e.g. openai/gpt-4:free) and resolves known slug aliases.
   *
   * @param author The author/organization of the model
   * @param slug The model slug, optionally including a variant suffix (e.g. gpt-4 or gpt-4:free)
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
   * @throws GetModelApiException When the service returns a declared non-success response; its `error` property exposes
   * the decoded GetModelError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getModel(
    author: String,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ModelResponse = executor.executeWithTypedErrors<Unit, GetModelResponse, ModelResponse>(
    request = SdkExecutionRequest(getModelMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author", values = listOf(author.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ModelsCodecs.getModelRequestCodecRegistry,
    responseDecoder = GetModelResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetModelResponse.SuccessJson -> response.json
        is GetModelResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is GetModelResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetModelResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetModelResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetModelResponse.Http404Json -> GetModelApiException(response, statusCode, headers)
        is GetModelResponse.Http500Json -> GetModelApiException(response, statusCode, headers)
        is GetModelResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Returns full details for a single model identified by its author and slug (e.g. openai/gpt-4). Supports variant
   * suffixes (e.g. openai/gpt-4:free) and resolves known slug aliases.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param author The author/organization of the model
   * @param slug The model slug, optionally including a variant suffix (e.g. gpt-4 or gpt-4:free)
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
  public suspend fun getModelWithResponse(
    author: String,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetModelResponse> = executor.executeWithResponse<Unit, GetModelResponse>(SdkExecutionRequest(getModelMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author", values = listOf(author.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ModelsCodecs.getModelRequestCodecRegistry, GetModelResponseDecoder, options)

  /**
   * List all models and their properties
   *
   * @param arch Filter models by architecture/model family (e.g. GPT, Claude, Gemini, Llama).
   * @param category Filter models by use case category
   * @param context Minimum context length (tokens). Models with smaller context are excluded.
   * @param distillable Filter by distillation capability. "true" returns only distillable models, "false" excludes
   * them.
   * @param inputModalities Filter models by input modality. Comma-separated list of: text, image, audio, file.
   * @param limit Maximum number of records to return (max 1000). When both offset and limit are omitted, the full list
   * is returned
   * @param maxAgeDays Maximum model age in days since its creation date.
   * @param maxAgenticIndex Maximum Artificial Analysis agentic index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param maxCodingIndex Maximum Artificial Analysis coding index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param maxIntelligenceIndex Maximum Artificial Analysis intelligence index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param maxOutputPrice Maximum completion (output) price in $/M tokens.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param maxPrice Maximum prompt price in $/M tokens.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param maxToolSuccessRate Maximum tool-calling success rate, as a fraction in [0, 1].
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minAgeDays Minimum model age in days since its creation date.
   * @param minAgenticIndex Minimum Artificial Analysis agentic index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minCodingIndex Minimum Artificial Analysis coding index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minIntelligenceIndex Minimum Artificial Analysis intelligence index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minOutputPrice Minimum completion (output) price in $/M tokens.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minPrice Minimum prompt price in $/M tokens.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minToolSuccessRate Minimum tool-calling success rate, as a fraction in [0, 1] (e.g. 0.9 = 90% of requests
   * finishing with a tool_calls finish reason).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param modelAuthors Filter models by the organization that created the model. Comma-separated list of author slugs.
   * @param offset Number of records to skip for pagination. When both offset and limit are omitted, the full list is
   * returned
   * @param outputModalities Filter models by output modality. Accepts a comma-separated list of modalities (text,
   * image, audio, embeddings) or "all" to include all models. Defaults to "text".
   * @param providers Filter models by hosting provider. Comma-separated list of provider names.
   * @param q Free-text search by model name or slug.
   * @param region Filter to models with endpoints in the given data region. Currently only "eu" is supported.
   * @param sort Sort the returned models server-side. Prefer this over fetching the full list and sorting client-side.
   * Options: pricing-low-to-high, pricing-high-to-low (average prompt/completion price), context-high-to-low (context
   * length), throughput-high-to-low, latency-low-to-high (recent median performance), most-popular, top-weekly (tokens
   * processed in the last week), newest (creation date), intelligence-high-to-low, coding-high-to-low,
   * agentic-high-to-low (Artificial Analysis indices), design-arena-elo-high-to-low (best Design Arena ELO across
   * arenas). Models without a score for the chosen benchmark are placed last. When omitted, the existing default
   * ordering is preserved.
   * @param supportedParameters Filter models by supported parameter (comma-separated)
   * @param zdr When set to "true", return only models with zero data retention endpoints.
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
   * @throws GetModelsApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded GetModelsError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getModels(
    arch: String? = null,
    category: InlineModelsGetParameterX6456382f? = null,
    context: Int? = null,
    distillable: InlineModelsGetParameterX490d8ee9? = null,
    inputModalities: String? = null,
    limit: Int? = null,
    maxAgeDays: Int? = null,
    maxAgenticIndex: Double? = null,
    maxCodingIndex: Double? = null,
    maxIntelligenceIndex: Double? = null,
    maxOutputPrice: Double? = null,
    maxPrice: Double? = null,
    maxToolSuccessRate: Double? = null,
    minAgeDays: Int? = null,
    minAgenticIndex: Double? = null,
    minCodingIndex: Double? = null,
    minIntelligenceIndex: Double? = null,
    minOutputPrice: Double? = null,
    minPrice: Double? = null,
    minToolSuccessRate: Double? = null,
    modelAuthors: String? = null,
    offset: Int? = null,
    outputModalities: String? = null,
    providers: String? = null,
    q: String? = null,
    region: InlineModelsGetParameterXd2c28b08? = null,
    sort: InlineModelsGetParameterX21879c75? = null,
    supportedParameters: String? = null,
    zdr: InlineModelsGetParameterXacca3485? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ModelsListResponse = executor.executeWithTypedErrors<Unit, GetModelsResponse, ModelsListResponse>(
    request = SdkExecutionRequest(getModelsMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "arch", values = arch?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "category", values = category?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "context", values = context?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "distillable", values = distillable?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "input_modalities", values = inputModalities?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_age_days", values = maxAgeDays?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_agentic_index", values = maxAgenticIndex?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_coding_index", values = maxCodingIndex?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_intelligence_index", values = maxIntelligenceIndex?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_output_price", values = maxOutputPrice?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_price", values = maxPrice?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_tool_success_rate", values = maxToolSuccessRate?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_age_days", values = minAgeDays?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_agentic_index", values = minAgenticIndex?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_coding_index", values = minCodingIndex?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_intelligence_index", values = minIntelligenceIndex?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_output_price", values = minOutputPrice?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_price", values = minPrice?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_tool_success_rate", values = minToolSuccessRate?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model_authors", values = modelAuthors?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "output_modalities", values = outputModalities?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "providers", values = providers?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "region", values = region?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "supported_parameters", values = supportedParameters?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "zdr", values = zdr?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ModelsCodecs.getModelsRequestCodecRegistry,
    responseDecoder = GetModelsResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is GetModelsResponse.SuccessJson -> response.json
        is GetModelsResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is GetModelsResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is GetModelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is GetModelsResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is GetModelsResponse.Http400Json -> GetModelsApiException(response, statusCode, headers)
        is GetModelsResponse.Http500Json -> GetModelsApiException(response, statusCode, headers)
        is GetModelsResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List all models and their properties
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param arch Filter models by architecture/model family (e.g. GPT, Claude, Gemini, Llama).
   * @param category Filter models by use case category
   * @param context Minimum context length (tokens). Models with smaller context are excluded.
   * @param distillable Filter by distillation capability. "true" returns only distillable models, "false" excludes
   * them.
   * @param inputModalities Filter models by input modality. Comma-separated list of: text, image, audio, file.
   * @param limit Maximum number of records to return (max 1000). When both offset and limit are omitted, the full list
   * is returned
   * @param maxAgeDays Maximum model age in days since its creation date.
   * @param maxAgenticIndex Maximum Artificial Analysis agentic index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param maxCodingIndex Maximum Artificial Analysis coding index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param maxIntelligenceIndex Maximum Artificial Analysis intelligence index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param maxOutputPrice Maximum completion (output) price in $/M tokens.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param maxPrice Maximum prompt price in $/M tokens.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param maxToolSuccessRate Maximum tool-calling success rate, as a fraction in [0, 1].
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minAgeDays Minimum model age in days since its creation date.
   * @param minAgenticIndex Minimum Artificial Analysis agentic index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minCodingIndex Minimum Artificial Analysis coding index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minIntelligenceIndex Minimum Artificial Analysis intelligence index.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minOutputPrice Minimum completion (output) price in $/M tokens.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minPrice Minimum prompt price in $/M tokens.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param minToolSuccessRate Minimum tool-calling success rate, as a fraction in [0, 1] (e.g. 0.9 = 90% of requests
   * finishing with a tool_calls finish reason).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   * @param modelAuthors Filter models by the organization that created the model. Comma-separated list of author slugs.
   * @param offset Number of records to skip for pagination. When both offset and limit are omitted, the full list is
   * returned
   * @param outputModalities Filter models by output modality. Accepts a comma-separated list of modalities (text,
   * image, audio, embeddings) or "all" to include all models. Defaults to "text".
   * @param providers Filter models by hosting provider. Comma-separated list of provider names.
   * @param q Free-text search by model name or slug.
   * @param region Filter to models with endpoints in the given data region. Currently only "eu" is supported.
   * @param sort Sort the returned models server-side. Prefer this over fetching the full list and sorting client-side.
   * Options: pricing-low-to-high, pricing-high-to-low (average prompt/completion price), context-high-to-low (context
   * length), throughput-high-to-low, latency-low-to-high (recent median performance), most-popular, top-weekly (tokens
   * processed in the last week), newest (creation date), intelligence-high-to-low, coding-high-to-low,
   * agentic-high-to-low (Artificial Analysis indices), design-arena-elo-high-to-low (best Design Arena ELO across
   * arenas). Models without a score for the chosen benchmark are placed last. When omitted, the existing default
   * ordering is preserved.
   * @param supportedParameters Filter models by supported parameter (comma-separated)
   * @param zdr When set to "true", return only models with zero data retention endpoints.
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
  public suspend fun getModelsWithResponse(
    arch: String? = null,
    category: InlineModelsGetParameterX6456382f? = null,
    context: Int? = null,
    distillable: InlineModelsGetParameterX490d8ee9? = null,
    inputModalities: String? = null,
    limit: Int? = null,
    maxAgeDays: Int? = null,
    maxAgenticIndex: Double? = null,
    maxCodingIndex: Double? = null,
    maxIntelligenceIndex: Double? = null,
    maxOutputPrice: Double? = null,
    maxPrice: Double? = null,
    maxToolSuccessRate: Double? = null,
    minAgeDays: Int? = null,
    minAgenticIndex: Double? = null,
    minCodingIndex: Double? = null,
    minIntelligenceIndex: Double? = null,
    minOutputPrice: Double? = null,
    minPrice: Double? = null,
    minToolSuccessRate: Double? = null,
    modelAuthors: String? = null,
    offset: Int? = null,
    outputModalities: String? = null,
    providers: String? = null,
    q: String? = null,
    region: InlineModelsGetParameterXd2c28b08? = null,
    sort: InlineModelsGetParameterX21879c75? = null,
    supportedParameters: String? = null,
    zdr: InlineModelsGetParameterXacca3485? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetModelsResponse> = executor.executeWithResponse<Unit, GetModelsResponse>(SdkExecutionRequest(getModelsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "arch", values = arch?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "category", values = category?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "context", values = context?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "distillable", values = distillable?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "input_modalities", values = inputModalities?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_age_days", values = maxAgeDays?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_agentic_index", values = maxAgenticIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_coding_index", values = maxCodingIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_intelligence_index", values = maxIntelligenceIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_output_price", values = maxOutputPrice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_price", values = maxPrice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_tool_success_rate", values = maxToolSuccessRate?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_age_days", values = minAgeDays?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_agentic_index", values = minAgenticIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_coding_index", values = minCodingIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_intelligence_index", values = minIntelligenceIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_output_price", values = minOutputPrice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_price", values = minPrice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_tool_success_rate", values = minToolSuccessRate?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model_authors", values = modelAuthors?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "output_modalities", values = outputModalities?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "providers", values = providers?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "region", values = region?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "supported_parameters", values = supportedParameters?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "zdr", values = zdr?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ModelsCodecs.getModelsRequestCodecRegistry, GetModelsResponseDecoder, options)

  /**
   * Get total count of available models
   *
   * @param outputModalities Filter models by output modality. Accepts a comma-separated list of modalities (text,
   * image, audio, embeddings) or "all" to include all models. Defaults to "text".
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
   * @throws ListModelsCountApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded ListModelsCountError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listModelsCount(
    outputModalities: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ModelsCountResponse = executor.executeWithTypedErrors<Unit, ListModelsCountResponse, ModelsCountResponse>(
    request = SdkExecutionRequest(listModelsCountMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "output_modalities", values = outputModalities?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ModelsCodecs.listModelsCountRequestCodecRegistry,
    responseDecoder = ListModelsCountResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListModelsCountResponse.SuccessJson -> response.json
        is ListModelsCountResponse.Http400Json -> error("Runtime selected a non-success response for success mapping.")
        is ListModelsCountResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListModelsCountResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListModelsCountResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListModelsCountResponse.Http400Json -> ListModelsCountApiException(response, statusCode, headers)
        is ListModelsCountResponse.Http500Json -> ListModelsCountApiException(response, statusCode, headers)
        is ListModelsCountResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * Get total count of available models
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param outputModalities Filter models by output modality. Accepts a comma-separated list of modalities (text,
   * image, audio, embeddings) or "all" to include all models. Defaults to "text".
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
  public suspend fun listModelsCountWithResponse(
    outputModalities: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListModelsCountResponse> = executor.executeWithResponse<Unit, ListModelsCountResponse>(SdkExecutionRequest(listModelsCountMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "output_modalities", values = outputModalities?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ModelsCodecs.listModelsCountRequestCodecRegistry, ListModelsCountResponseDecoder, options)

  /**
   * List models filtered by user provider preferences, [privacy
   * settings](https://openrouter.ai/docs/guides/privacy/provider-logging), and
   * [guardrails](https://openrouter.ai/docs/guides/features/guardrails). If requesting through
   * `eu.openrouter.ai/api/v1/...` the results will be filtered to models that satisfy [EU in-region
   * routing](https://openrouter.ai/docs/guides/privacy/provider-logging#enterprise-eu-in-region-routing).
   *
   * @param limit Maximum number of records to return (max 1000). When both offset and limit are omitted, the full list
   * is returned
   * @param offset Number of records to skip for pagination. When both offset and limit are omitted, the full list is
   * returned
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
   * @throws ListModelsUserApiException When the service returns a declared non-success response; its `error` property
   * exposes the decoded ListModelsUserError payload.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listModelsUser(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ModelsListResponse = executor.executeWithTypedErrors<Unit, ListModelsUserResponse, ModelsListResponse>(
    request = SdkExecutionRequest(listModelsUserMetadata, baseUri, Unit, emptyList(), buildList {
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
      add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
    }),
    requestCodecs = ModelsCodecs.listModelsUserRequestCodecRegistry,
    responseDecoder = ListModelsUserResponseDecoder,
    mapSuccess = { response ->
      when (response) {
        is ListModelsUserResponse.SuccessJson -> response.json
        is ListModelsUserResponse.Http401Json -> error("Runtime selected a non-success response for success mapping.")
        is ListModelsUserResponse.Http404Json -> error("Runtime selected a non-success response for success mapping.")
        is ListModelsUserResponse.Http500Json -> error("Runtime selected a non-success response for success mapping.")
        is ListModelsUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed success path.")
      }
    },
    mapError = { response, statusCode, headers ->
      when (response) {
        is ListModelsUserResponse.SuccessJson -> error("Runtime selected a success response for error mapping.")
        is ListModelsUserResponse.Http401Json -> ListModelsUserApiException(response, statusCode, headers)
        is ListModelsUserResponse.Http404Json -> ListModelsUserApiException(response, statusCode, headers)
        is ListModelsUserResponse.Http500Json -> ListModelsUserApiException(response, statusCode, headers)
        is ListModelsUserResponse.Unknown -> error("Runtime returned an unmatched response through the typed error path.")
      }
    },
    options = options,
  )

  /**
   * List models filtered by user provider preferences, [privacy
   * settings](https://openrouter.ai/docs/guides/privacy/provider-logging), and
   * [guardrails](https://openrouter.ai/docs/guides/features/guardrails). If requesting through
   * `eu.openrouter.ai/api/v1/...` the results will be filtered to models that satisfy [EU in-region
   * routing](https://openrouter.ai/docs/guides/privacy/provider-logging#enterprise-eu-in-region-routing).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   * @param limit Maximum number of records to return (max 1000). When both offset and limit are omitted, the full list
   * is returned
   * @param offset Number of records to skip for pagination. When both offset and limit are omitted, the full list is
   * returned
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
  public suspend fun listModelsUserWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListModelsUserResponse> = executor.executeWithResponse<Unit, ListModelsUserResponse>(SdkExecutionRequest(listModelsUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values = xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values = xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ModelsCodecs.listModelsUserRequestCodecRegistry, ListModelsUserResponseDecoder, options)

  /**
   * Decoded non-success response alternatives that `getModel` may expose through its typed API exception.
   */
  public sealed interface GetModelError

  /**
   * Typed response alternatives for `getModel`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetModelResponse {
    public class SuccessJson(
      public val json: ModelResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelResponse,
        GetModelError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelResponse,
        GetModelError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelResponse
  }

  /**
   * Raised by `getModel` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class GetModelApiException(
    public val error: GetModelError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getModel")

  private object GetModelResponseDecoder : SdkResponseAlternativeDecoder<GetModelResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetModelResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetModelResponse> = when {
      alternative.id == "getModel.response.alternative0" -> SdkResponseDecodeResult(
        value = GetModelResponse.SuccessJson(
          json = ModelsCodecs.getModelResponseCodecAlternative0Registry.select(listOf("getModel.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getModel.response.alternative1" -> SdkResponseDecodeResult(
        value = GetModelResponse.Http404Json(
          json = ModelsCodecs.getModelResponseCodecAlternative1Registry.select(listOf("getModel.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getModel.response.alternative2" -> SdkResponseDecodeResult(
        value = GetModelResponse.Http500Json(
          json = ModelsCodecs.getModelResponseCodecAlternative2Registry.select(listOf("getModel.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetModelResponse = GetModelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `getModels` may expose through its typed API exception.
   */
  public sealed interface GetModelsError

  /**
   * Typed response alternatives for `getModels`. Non-success alternatives are not converted into success values.
   */
  public sealed interface GetModelsResponse {
    public class SuccessJson(
      public val json: ModelsListResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelsResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelsResponse,
        GetModelsError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelsResponse,
        GetModelsError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelsResponse
  }

  /**
   * Raised by `getModels` after decoding a declared non-success response. [error] is typed and is not included in the
   * exception message or diagnostic rendering.
   */
  public class GetModelsApiException(
    public val error: GetModelsError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "getModels")

  private object GetModelsResponseDecoder : SdkResponseAlternativeDecoder<GetModelsResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): GetModelsResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<GetModelsResponse> = when {
      alternative.id == "getModels.response.alternative0" -> SdkResponseDecodeResult(
        value = GetModelsResponse.SuccessJson(
          json = ModelsCodecs.getModelsResponseCodecAlternative0Registry.select(listOf("getModels.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getModels.response.alternative1" -> SdkResponseDecodeResult(
        value = GetModelsResponse.Http400Json(
          json = ModelsCodecs.getModelsResponseCodecAlternative1Registry.select(listOf("getModels.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getModels.response.alternative2" -> SdkResponseDecodeResult(
        value = GetModelsResponse.Http500Json(
          json = ModelsCodecs.getModelsResponseCodecAlternative2Registry.select(listOf("getModels.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): GetModelsResponse = GetModelsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listModelsCount` may expose through its typed API exception.
   */
  public sealed interface ListModelsCountError

  /**
   * Typed response alternatives for `listModelsCount`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListModelsCountResponse {
    public class SuccessJson(
      public val json: ModelsCountResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsCountResponse

    public class Http400Json(
      public val json: BadRequestResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsCountResponse,
        ListModelsCountError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsCountResponse,
        ListModelsCountError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsCountResponse
  }

  /**
   * Raised by `listModelsCount` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class ListModelsCountApiException(
    public val error: ListModelsCountError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listModelsCount")

  private object ListModelsCountResponseDecoder : SdkResponseAlternativeDecoder<ListModelsCountResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListModelsCountResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListModelsCountResponse> = when {
      alternative.id == "listModelsCount.response.alternative0" -> SdkResponseDecodeResult(
        value = ListModelsCountResponse.SuccessJson(
          json = ModelsCodecs.listModelsCountResponseCodecAlternative0Registry.select(listOf("listModelsCount.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listModelsCount.response.alternative1" -> SdkResponseDecodeResult(
        value = ListModelsCountResponse.Http400Json(
          json = ModelsCodecs.listModelsCountResponseCodecAlternative1Registry.select(listOf("listModelsCount.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listModelsCount.response.alternative2" -> SdkResponseDecodeResult(
        value = ListModelsCountResponse.Http500Json(
          json = ModelsCodecs.listModelsCountResponseCodecAlternative2Registry.select(listOf("listModelsCount.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListModelsCountResponse = ListModelsCountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  /**
   * Decoded non-success response alternatives that `listModelsUser` may expose through its typed API exception.
   */
  public sealed interface ListModelsUserError

  /**
   * Typed response alternatives for `listModelsUser`. Non-success alternatives are not converted into success values.
   */
  public sealed interface ListModelsUserResponse {
    public class SuccessJson(
      public val json: ModelsListResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsUserResponse

    public class Http401Json(
      public val json: UnauthorizedResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsUserResponse,
        ListModelsUserError

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsUserResponse,
        ListModelsUserError

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsUserResponse,
        ListModelsUserError

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsUserResponse
  }

  /**
   * Raised by `listModelsUser` after decoding a declared non-success response. [error] is typed and is not included in
   * the exception message or diagnostic rendering.
   */
  public class ListModelsUserApiException(
    public val error: ListModelsUserError,
    statusCode: Int,
    headers: List<SdkHeader>,
  ) : SdkApiException(statusCode, headers, "listModelsUser")

  private object ListModelsUserResponseDecoder : SdkResponseAlternativeDecoder<ListModelsUserResponse> {
    public override suspend fun decode(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): ListModelsUserResponse = decodeWithBody(alternative, statusCode, headers, body, mediaType).value

    public override suspend fun decodeWithBody(
      alternative: ResponseAlternative,
      statusCode: Int,
      headers: List<SdkHeader>,
      body: SdkByteStream,
      mediaType: String?,
    ): SdkResponseDecodeResult<ListModelsUserResponse> = when {
      alternative.id == "listModelsUser.response.alternative0" -> SdkResponseDecodeResult(
        value = ListModelsUserResponse.SuccessJson(
          json = ModelsCodecs.listModelsUserResponseCodecAlternative0Registry.select(listOf("listModelsUser.response.alternative0"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listModelsUser.response.alternative1" -> SdkResponseDecodeResult(
        value = ListModelsUserResponse.Http401Json(
          json = ModelsCodecs.listModelsUserResponseCodecAlternative1Registry.select(listOf("listModelsUser.response.alternative1"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listModelsUser.response.alternative2" -> SdkResponseDecodeResult(
        value = ListModelsUserResponse.Http404Json(
          json = ModelsCodecs.listModelsUserResponseCodecAlternative2Registry.select(listOf("listModelsUser.response.alternative2"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listModelsUser.response.alternative3" -> SdkResponseDecodeResult(
        value = ListModelsUserResponse.Http500Json(
          json = ModelsCodecs.listModelsUserResponseCodecAlternative3Registry.select(listOf("listModelsUser.response.alternative3"), mediaType ?: "application/json").decode(body, mediaType ?: "application/json"),
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
    ): ListModelsUserResponse = ListModelsUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    internal val getModelMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "getModel",
          method = "GET",
          path = "/model/{author}/{slug}",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ModelResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getModel.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getModel.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getModel.response.alternative2",
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

    internal val getModelsMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "getModels",
          method = "GET",
          path = "/models",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ModelsListResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getModels.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getModels.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "getModels.response.alternative2",
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

    internal val listModelsCountMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listModelsCount",
          method = "GET",
          path = "/models/count",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ModelsCountResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listModelsCount.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 400),
              mediaTypes = listOf("application/json"),
              typeTag = "BadRequestResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listModelsCount.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listModelsCount.response.alternative2",
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

    internal val listModelsUserMetadata: OperationMetadata by
        lazy(LazyThreadSafetyMode.PUBLICATION) { OperationMetadata(
          operationId = "listModelsUser",
          method = "GET",
          path = "/models/user",
          requestMediaTypes = emptyList(),
          responseMediaTypes = listOf("application/json"),
          successStatusCodes = setOf(200),
          responseMode = SdkResponseMode.BUFFERED,
          deadlines = SdkDeadlines(60_000, 60_000, null),
          responseAlternatives = listOf(
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 200),
              mediaTypes = listOf("application/json"),
              typeTag = "ModelsListResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listModelsUser.response.alternative0",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 401),
              mediaTypes = listOf("application/json"),
              typeTag = "UnauthorizedResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listModelsUser.response.alternative1",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 404),
              mediaTypes = listOf("application/json"),
              typeTag = "NotFoundResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listModelsUser.response.alternative2",
            ),
            ResponseAlternative(
              selector = ResponseSelector.ExactStatus(code = 500),
              mediaTypes = listOf("application/json"),
              typeTag = "InternalServerResponse",
              mode = SdkResponseMode.BUFFERED,
              id = "listModelsUser.response.alternative3",
            ),
          ),
          security = listOf(
            SecurityRequirement(schemes = listOf(
              SecuritySchemeRef(schemeId = "bearer", scopes = emptyList()),
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
