package com.nabobery.sdkgen.generated.models

import com.nabobery.sdkgen.generated.BadRequestResponse
import com.nabobery.sdkgen.generated.InlinePathsModelsGetParameters14Schema
import com.nabobery.sdkgen.generated.InlinePathsModelsGetParameters15Schema
import com.nabobery.sdkgen.generated.InlinePathsModelsGetParameters16Schema
import com.nabobery.sdkgen.generated.InlinePathsModelsGetParameters2Schema
import com.nabobery.sdkgen.generated.InlinePathsModelsGetParameters5Schema
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public object ModelsCodecs {
  public const val GETMODEL_RESPONSE_CODEC_ID: String = "getModel.response"

  private val getModelResponseCodec: MediaTypeCodec<ModelResponse> =
      KotlinxSerializationCodec(GETMODEL_RESPONSE_CODEC_ID, ModelResponse.Serializer, SdkJson)

  private val getModelResponseCodecAlternative0Codec: MediaTypeCodec<ModelResponse> =
      KotlinxSerializationCodec("getModel.response.alternative0", ModelResponse.Serializer, SdkJson)

  public val getModelResponseCodecAlternative0Registry: MediaTypeCodecRegistry<ModelResponse> =
      MediaTypeCodecRegistry.of(getModelResponseCodecAlternative0Codec)

  private val getModelResponseCodecAlternative1Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("getModel.response.alternative1", NotFoundResponse.Serializer, SdkJson)

  public val getModelResponseCodecAlternative1Registry: MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(getModelResponseCodecAlternative1Codec)

  private val getModelResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getModel.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  public val getModelResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getModelResponseCodecAlternative2Codec)

  public val getModelRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getModelResponseCodecRegistry: MediaTypeCodecRegistry<ModelResponse> =
      MediaTypeCodecRegistry.of(getModelResponseCodec)

  public const val GETMODELS_RESPONSE_CODEC_ID: String = "getModels.response"

  private val getModelsResponseCodec: MediaTypeCodec<ModelsListResponse> =
      KotlinxSerializationCodec(GETMODELS_RESPONSE_CODEC_ID, ModelsListResponse.Serializer, SdkJson)

  private val getModelsResponseCodecAlternative0Codec: MediaTypeCodec<ModelsListResponse> =
      KotlinxSerializationCodec("getModels.response.alternative0", ModelsListResponse.Serializer, SdkJson)

  public val getModelsResponseCodecAlternative0Registry: MediaTypeCodecRegistry<ModelsListResponse>
      = MediaTypeCodecRegistry.of(getModelsResponseCodecAlternative0Codec)

  private val getModelsResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("getModels.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val getModelsResponseCodecAlternative1Registry: MediaTypeCodecRegistry<BadRequestResponse>
      = MediaTypeCodecRegistry.of(getModelsResponseCodecAlternative1Codec)

  private val getModelsResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("getModels.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  public val getModelsResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(getModelsResponseCodecAlternative2Codec)

  public val getModelsRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val getModelsResponseCodecRegistry: MediaTypeCodecRegistry<ModelsListResponse> =
      MediaTypeCodecRegistry.of(getModelsResponseCodec)

  public const val LISTMODELSCOUNT_RESPONSE_CODEC_ID: String = "listModelsCount.response"

  private val listModelsCountResponseCodec: MediaTypeCodec<ModelsCountResponse> =
      KotlinxSerializationCodec(LISTMODELSCOUNT_RESPONSE_CODEC_ID, ModelsCountResponse.Serializer, SdkJson)

  private val listModelsCountResponseCodecAlternative0Codec: MediaTypeCodec<ModelsCountResponse> =
      KotlinxSerializationCodec("listModelsCount.response.alternative0", ModelsCountResponse.Serializer, SdkJson)

  public val listModelsCountResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ModelsCountResponse> =
      MediaTypeCodecRegistry.of(listModelsCountResponseCodecAlternative0Codec)

  private val listModelsCountResponseCodecAlternative1Codec: MediaTypeCodec<BadRequestResponse> =
      KotlinxSerializationCodec("listModelsCount.response.alternative1", BadRequestResponse.Serializer, SdkJson)

  public val listModelsCountResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<BadRequestResponse> =
      MediaTypeCodecRegistry.of(listModelsCountResponseCodecAlternative1Codec)

  private val listModelsCountResponseCodecAlternative2Codec: MediaTypeCodec<InternalServerResponse>
      =
      KotlinxSerializationCodec("listModelsCount.response.alternative2", InternalServerResponse.Serializer, SdkJson)

  public val listModelsCountResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listModelsCountResponseCodecAlternative2Codec)

  public val listModelsCountRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listModelsCountResponseCodecRegistry: MediaTypeCodecRegistry<ModelsCountResponse> =
      MediaTypeCodecRegistry.of(listModelsCountResponseCodec)

  public const val LISTMODELSUSER_RESPONSE_CODEC_ID: String = "listModelsUser.response"

  private val listModelsUserResponseCodec: MediaTypeCodec<ModelsListResponse> =
      KotlinxSerializationCodec(LISTMODELSUSER_RESPONSE_CODEC_ID, ModelsListResponse.Serializer, SdkJson)

  private val listModelsUserResponseCodecAlternative0Codec: MediaTypeCodec<ModelsListResponse> =
      KotlinxSerializationCodec("listModelsUser.response.alternative0", ModelsListResponse.Serializer, SdkJson)

  public val listModelsUserResponseCodecAlternative0Registry:
      MediaTypeCodecRegistry<ModelsListResponse> =
      MediaTypeCodecRegistry.of(listModelsUserResponseCodecAlternative0Codec)

  private val listModelsUserResponseCodecAlternative1Codec: MediaTypeCodec<UnauthorizedResponse> =
      KotlinxSerializationCodec("listModelsUser.response.alternative1", UnauthorizedResponse.Serializer, SdkJson)

  public val listModelsUserResponseCodecAlternative1Registry:
      MediaTypeCodecRegistry<UnauthorizedResponse> =
      MediaTypeCodecRegistry.of(listModelsUserResponseCodecAlternative1Codec)

  private val listModelsUserResponseCodecAlternative2Codec: MediaTypeCodec<NotFoundResponse> =
      KotlinxSerializationCodec("listModelsUser.response.alternative2", NotFoundResponse.Serializer, SdkJson)

  public val listModelsUserResponseCodecAlternative2Registry:
      MediaTypeCodecRegistry<NotFoundResponse> =
      MediaTypeCodecRegistry.of(listModelsUserResponseCodecAlternative2Codec)

  private val listModelsUserResponseCodecAlternative3Codec: MediaTypeCodec<InternalServerResponse> =
      KotlinxSerializationCodec("listModelsUser.response.alternative3", InternalServerResponse.Serializer, SdkJson)

  public val listModelsUserResponseCodecAlternative3Registry:
      MediaTypeCodecRegistry<InternalServerResponse> =
      MediaTypeCodecRegistry.of(listModelsUserResponseCodecAlternative3Codec)

  public val listModelsUserRequestCodecRegistry: MediaTypeCodecRegistry<Unit> =
      MediaTypeCodecRegistry.of()

  public val listModelsUserResponseCodecRegistry: MediaTypeCodecRegistry<ModelsListResponse> =
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
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
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
  ): ModelResponse = executor.execute<Unit, ModelResponse>(SdkExecutionRequest(getModelMetadata, baseUri, Unit,
    emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author", values = listOf(author.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ModelsCodecs.GETMODEL_RESPONSE_CODEC_ID), ModelsCodecs.getModelRequestCodecRegistry, ModelsCodecs
    .getModelResponseCodecRegistry, options)

  /**
   * Returns full details for a single model identified by its author and slug (e.g. openai/gpt-4). Supports variant
   * suffixes (e.g. openai/gpt-4:free) and resolves known slug aliases.
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getModelWithResponse(
    author: String,
    slug: String,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetModelResponse> = executor.executeWithResponse<Unit,
    GetModelResponse>(SdkExecutionRequest(getModelMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "author", values = listOf(author.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.PATH, name = "slug", values = listOf(slug.toString())))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ModelsCodecs.getModelRequestCodecRegistry, GetModelResponseDecoder, options)

  /**
   * List all models and their properties
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun getModels(
    arch: String? = null,
    category: InlinePathsModelsGetParameters2Schema? = null,
    context: Int? = null,
    distillable: InlinePathsModelsGetParameters14Schema? = null,
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
    region: InlinePathsModelsGetParameters16Schema? = null,
    sort: InlinePathsModelsGetParameters5Schema? = null,
    supportedParameters: String? = null,
    zdr: InlinePathsModelsGetParameters15Schema? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ModelsListResponse = executor.execute<Unit, ModelsListResponse>(SdkExecutionRequest(getModelsMetadata, baseUri,
    Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "arch", values = arch?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "category", values = category?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "context", values = context?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "distillable", values = distillable?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "input_modalities", values =
      inputModalities?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_age_days", values = maxAgeDays?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_agentic_index", values =
      maxAgenticIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_coding_index", values =
      maxCodingIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_intelligence_index", values =
      maxIntelligenceIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_output_price", values =
      maxOutputPrice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_price", values = maxPrice?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_tool_success_rate", values =
      maxToolSuccessRate?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_age_days", values = minAgeDays?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_agentic_index", values =
      minAgenticIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_coding_index", values =
      minCodingIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_intelligence_index", values =
      minIntelligenceIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_output_price", values =
      minOutputPrice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_price", values = minPrice?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_tool_success_rate", values =
      minToolSuccessRate?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model_authors", values = modelAuthors?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "output_modalities", values =
      outputModalities?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "providers", values = providers?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "region", values = region?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "supported_parameters", values =
      supportedParameters?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "zdr", values = zdr?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ModelsCodecs.GETMODELS_RESPONSE_CODEC_ID), ModelsCodecs.getModelsRequestCodecRegistry, ModelsCodecs
    .getModelsResponseCodecRegistry, options)

  /**
   * List all models and their properties
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun getModelsWithResponse(
    arch: String? = null,
    category: InlinePathsModelsGetParameters2Schema? = null,
    context: Int? = null,
    distillable: InlinePathsModelsGetParameters14Schema? = null,
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
    region: InlinePathsModelsGetParameters16Schema? = null,
    sort: InlinePathsModelsGetParameters5Schema? = null,
    supportedParameters: String? = null,
    zdr: InlinePathsModelsGetParameters15Schema? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<GetModelsResponse> = executor.executeWithResponse<Unit,
    GetModelsResponse>(SdkExecutionRequest(getModelsMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "arch", values = arch?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "category", values = category?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "context", values = context?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "distillable", values = distillable?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "input_modalities", values =
      inputModalities?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_age_days", values = maxAgeDays?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_agentic_index", values =
      maxAgenticIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_coding_index", values =
      maxCodingIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_intelligence_index", values =
      maxIntelligenceIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_output_price", values =
      maxOutputPrice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_price", values = maxPrice?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "max_tool_success_rate", values =
      maxToolSuccessRate?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_age_days", values = minAgeDays?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_agentic_index", values =
      minAgenticIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_coding_index", values =
      minCodingIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_intelligence_index", values =
      minIntelligenceIndex?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_output_price", values =
      minOutputPrice?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_price", values = minPrice?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "min_tool_success_rate", values =
      minToolSuccessRate?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "model_authors", values = modelAuthors?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "output_modalities", values =
      outputModalities?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "providers", values = providers?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "q", values = q?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "region", values = region?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "sort", values = sort?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "supported_parameters", values =
      supportedParameters?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "zdr", values = zdr?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ModelsCodecs.getModelsRequestCodecRegistry, GetModelsResponseDecoder, options)

  /**
   * Get total count of available models
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
   * @throws SdkSerializationException When a request or response cannot be serialized.
   * @throws SdkTransportException When transport execution fails.
   */
  public suspend fun listModelsCount(
    outputModalities: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): ModelsCountResponse = executor.execute<Unit, ModelsCountResponse>(SdkExecutionRequest(listModelsCountMetadata,
    baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "output_modalities", values =
      outputModalities?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ModelsCodecs.LISTMODELSCOUNT_RESPONSE_CODEC_ID), ModelsCodecs.listModelsCountRequestCodecRegistry,
    ModelsCodecs.listModelsCountResponseCodecRegistry, options)

  /**
   * Get total count of available models
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listModelsCountWithResponse(
    outputModalities: String? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListModelsCountResponse> = executor.executeWithResponse<Unit,
    ListModelsCountResponse>(SdkExecutionRequest(listModelsCountMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "output_modalities", values =
      outputModalities?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ModelsCodecs.listModelsCountRequestCodecRegistry, ListModelsCountResponseDecoder, options)

  /**
   * List models filtered by user provider preferences, [privacy
   * settings](https://openrouter.ai/docs/guides/privacy/provider-logging), and
   * [guardrails](https://openrouter.ai/docs/guides/features/guardrails). If requesting through
   * `eu.openrouter.ai/api/v1/...` the results will be filtered to models that satisfy [EU in-region
   * routing](https://openrouter.ai/docs/guides/privacy/provider-logging#enterprise-eu-in-region-routing).
   *
   * @param options Execution options.
   * @return Buffered response body.
   * @throws SdkApiException When the service returns a non-success response.
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
  ): ModelsListResponse = executor.execute<Unit, ModelsListResponse>(SdkExecutionRequest(listModelsUserMetadata,
    baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), listOf(ModelsCodecs.LISTMODELSUSER_RESPONSE_CODEC_ID), ModelsCodecs.listModelsUserRequestCodecRegistry,
    ModelsCodecs.listModelsUserResponseCodecRegistry, options)

  /**
   * List models filtered by user provider preferences, [privacy
   * settings](https://openrouter.ai/docs/guides/privacy/provider-logging), and
   * [guardrails](https://openrouter.ai/docs/guides/features/guardrails). If requesting through
   * `eu.openrouter.ai/api/v1/...` the results will be filtered to models that satisfy [EU in-region
   * routing](https://openrouter.ai/docs/guides/privacy/provider-logging#enterprise-eu-in-region-routing).
   *
   * Returns the selected exact, range, default, or unknown response alternative without converting non-success statuses
   * into success values.
   */
  public suspend fun listModelsUserWithResponse(
    limit: Int? = null,
    offset: Int? = null,
    httpReferer: String? = null,
    xOpenRouterCategories: String? = null,
    xOpenRouterTitle: String? = null,
    options: CallOptions = CallOptions(),
  ): SdkResponseResult<ListModelsUserResponse> = executor.executeWithResponse<Unit,
    ListModelsUserResponse>(SdkExecutionRequest(listModelsUserMetadata, baseUri, Unit, emptyList(), buildList {
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "limit", values = limit?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.QUERY, name = "offset", values = offset?.let { listOf(it
      .toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "HTTP-Referer", values = httpReferer?.let {
      listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Categories", values =
      xOpenRouterCategories?.let { listOf(it.toString()) }.orEmpty()))
    add(SdkRequestParameter(location = SdkParameterLocation.HEADER, name = "X-OpenRouter-Title", values =
      xOpenRouterTitle?.let { listOf(it.toString()) }.orEmpty()))
  }), ModelsCodecs.listModelsUserRequestCodecRegistry, ListModelsUserResponseDecoder, options)

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
    ) : GetModelResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelResponse
  }

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
          json = ModelsCodecs.getModelResponseCodecAlternative0Registry
            .select(listOf("getModel.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getModel.response.alternative1" -> SdkResponseDecodeResult(
        value = GetModelResponse.Http404Json(
          json = ModelsCodecs.getModelResponseCodecAlternative1Registry
            .select(listOf("getModel.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getModel.response.alternative2" -> SdkResponseDecodeResult(
        value = GetModelResponse.Http500Json(
          json = ModelsCodecs.getModelResponseCodecAlternative2Registry
            .select(listOf("getModel.response.alternative2"), mediaType ?: "application/json").decode(body,
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
    ): GetModelResponse = GetModelResponse.Unknown(statusCode = statusCode, headers = headers)
  }

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
    ) : GetModelsResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelsResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : GetModelsResponse
  }

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
          json = ModelsCodecs.getModelsResponseCodecAlternative0Registry
            .select(listOf("getModels.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getModels.response.alternative1" -> SdkResponseDecodeResult(
        value = GetModelsResponse.Http400Json(
          json = ModelsCodecs.getModelsResponseCodecAlternative1Registry
            .select(listOf("getModels.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "getModels.response.alternative2" -> SdkResponseDecodeResult(
        value = GetModelsResponse.Http500Json(
          json = ModelsCodecs.getModelsResponseCodecAlternative2Registry
            .select(listOf("getModels.response.alternative2"), mediaType ?: "application/json").decode(body,
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
    ): GetModelsResponse = GetModelsResponse.Unknown(statusCode = statusCode, headers = headers)
  }

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
    ) : ListModelsCountResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsCountResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsCountResponse
  }

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
          json = ModelsCodecs.listModelsCountResponseCodecAlternative0Registry
            .select(listOf("listModelsCount.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listModelsCount.response.alternative1" -> SdkResponseDecodeResult(
        value = ListModelsCountResponse.Http400Json(
          json = ModelsCodecs.listModelsCountResponseCodecAlternative1Registry
            .select(listOf("listModelsCount.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listModelsCount.response.alternative2" -> SdkResponseDecodeResult(
        value = ListModelsCountResponse.Http500Json(
          json = ModelsCodecs.listModelsCountResponseCodecAlternative2Registry
            .select(listOf("listModelsCount.response.alternative2"), mediaType ?: "application/json").decode(body,
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
    ): ListModelsCountResponse = ListModelsCountResponse.Unknown(statusCode = statusCode, headers = headers)
  }

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
    ) : ListModelsUserResponse

    public class Http404Json(
      public val json: NotFoundResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsUserResponse

    public class Http500Json(
      public val json: InternalServerResponse,
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsUserResponse

    public class Unknown(
      public val statusCode: Int,
      public val headers: List<SdkHeader>,
    ) : ListModelsUserResponse
  }

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
          json = ModelsCodecs.listModelsUserResponseCodecAlternative0Registry
            .select(listOf("listModelsUser.response.alternative0"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listModelsUser.response.alternative1" -> SdkResponseDecodeResult(
        value = ListModelsUserResponse.Http401Json(
          json = ModelsCodecs.listModelsUserResponseCodecAlternative1Registry
            .select(listOf("listModelsUser.response.alternative1"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listModelsUser.response.alternative2" -> SdkResponseDecodeResult(
        value = ListModelsUserResponse.Http404Json(
          json = ModelsCodecs.listModelsUserResponseCodecAlternative2Registry
            .select(listOf("listModelsUser.response.alternative2"), mediaType ?: "application/json").decode(body,
              mediaType ?: "application/json"),
          statusCode = statusCode,
          headers = headers,
        ),
        transferBody = false,
      )
      alternative.id == "listModelsUser.response.alternative3" -> SdkResponseDecodeResult(
        value = ListModelsUserResponse.Http500Json(
          json = ModelsCodecs.listModelsUserResponseCodecAlternative3Registry
            .select(listOf("listModelsUser.response.alternative3"), mediaType ?: "application/json").decode(body,
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
    ): ListModelsUserResponse = ListModelsUserResponse.Unknown(statusCode = statusCode, headers = headers)
  }

  public companion object {
    public val getModelMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val getModelsMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val listModelsCountMetadata: OperationMetadata = OperationMetadata(
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
        )

    public val listModelsUserMetadata: OperationMetadata = OperationMetadata(
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
        )
  }
}
