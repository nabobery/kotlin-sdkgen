package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generation data
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/GenerationResponse/properties/data
 */
@Serializable(with = InlineGenerationResponseDataX5ba38337.Serializer::class)
public class InlineGenerationResponseDataX5ba38337 internal constructor(
  /**
   * Type of API used for the generation
   */
  public val apiType: InlineGenerationResponseDataApiTypeX6ac55b17?,
  /**
   * ID of the app that made the request
   */
  public val appId: Int?,
  /**
   * Discount applied due to caching
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val cacheDiscount: Double?,
  /**
   * Whether the generation was cancelled
   */
  public val cancelled: Boolean?,
  /**
   * ISO 8601 timestamp of when the generation was created
   */
  public val createdAt: String,
  /**
   * The data region this generation was routed through. 'europe' for EU-routed requests, 'global' otherwise.
   */
  public val dataRegion: InlineGenerationResponseDataDataRegionX3d6fdb5c,
  /**
   * External user identifier
   */
  public val externalUser: String?,
  /**
   * Reason the generation finished
   */
  public val finishReason: String?,
  /**
   * Time taken for generation in milliseconds
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val generationTime: Double?,
  /**
   * Referer header from the request
   */
  public val httpReferer: String?,
  /**
   * Unique identifier for the generation
   */
  public val id: String,
  /**
   * Whether this used bring-your-own-key
   */
  public val isByok: Boolean,
  /**
   * Total latency in milliseconds
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val latency: Double?,
  /**
   * Model used for the generation
   */
  public val model: String,
  /**
   * Moderation latency in milliseconds
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val moderationLatency: Double?,
  /**
   * Native finish reason as reported by provider
   */
  public val nativeFinishReason: String?,
  /**
   * Native cached tokens as reported by provider
   */
  public val nativeTokensCached: Int?,
  /**
   * Native completion tokens as reported by provider
   */
  public val nativeTokensCompletion: Int?,
  /**
   * Native completion image tokens as reported by provider
   */
  public val nativeTokensCompletionImages: Int?,
  /**
   * Native prompt tokens as reported by provider
   */
  public val nativeTokensPrompt: Int?,
  /**
   * Native reasoning tokens as reported by provider
   */
  public val nativeTokensReasoning: Int?,
  /**
   * Number of web fetches performed
   */
  public val numFetches: Int?,
  /**
   * Number of audio inputs in the prompt
   */
  public val numInputAudioPrompt: Int?,
  /**
   * Number of media items in the completion
   */
  public val numMediaCompletion: Int?,
  /**
   * Number of media items in the prompt
   */
  public val numMediaPrompt: Int?,
  /**
   * Number of search results included
   */
  public val numSearchResults: Int?,
  /**
   * Origin URL of the request
   */
  public val origin: String,
  /**
   * ID of the preset used for this generation, null if no preset was used
   */
  public val presetId: String?,
  /**
   * Name of the provider that served the request
   */
  public val providerName: String?,
  providerResponses: List<ProviderResponse>?,
  /**
   * Router used for the request (e.g., openrouter/auto)
   */
  public val router: String?,
  /**
   * Service tier the upstream provider reported running this request on, or null if it did not report one.
   */
  public val serviceTier: String?,
  /**
   * Whether the response was streamed
   */
  public val streamed: Boolean?,
  /**
   * Number of tokens in the completion
   */
  public val tokensCompletion: Int?,
  /**
   * Number of tokens in the prompt
   */
  public val tokensPrompt: Int?,
  /**
   * Total cost of the generation in USD
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val totalCost: Double,
  /**
   * Upstream provider's identifier for this generation
   */
  public val upstreamId: String?,
  /**
   * Cost charged by the upstream provider
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val upstreamInferenceCost: Double?,
  /**
   * Usage amount in USD
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val usage: Double,
  /**
   * User-Agent header from the request
   */
  public val userAgent: String?,
  /**
   * The resolved web search engine used for this generation (e.g. exa, firecrawl, parallel)
   */
  public val webSearchEngine: String?,
  private val requestIdState: FieldState<String?>,
  private val responseCacheSourceIdState: FieldState<String?>,
  private val sessionIdState: FieldState<String?>,
) {
  /**
   * List of provider responses for this generation, including fallback attempts
   */
  public val providerResponses: List<ProviderResponse>? =
      providerResponses?.let { collection0 -> collection0.toList() }

  /**
   * Unique identifier grouping all generations from a single API request
   */
  public val requestId: String?
    get() = requestIdState.valueOrNull()

  /**
   * If this generation was served from response cache, contains the original generation ID. Null otherwise.
   */
  public val responseCacheSourceId: String?
    get() = responseCacheSourceIdState.valueOrNull()

  /**
   * Session identifier grouping multiple generations in the same session
   */
  public val sessionId: String?
    get() = sessionIdState.valueOrNull()

  public constructor(
    apiType: InlineGenerationResponseDataApiTypeX6ac55b17?,
    appId: Int?,
    cacheDiscount: Double?,
    cancelled: Boolean?,
    createdAt: String,
    dataRegion: InlineGenerationResponseDataDataRegionX3d6fdb5c,
    externalUser: String?,
    finishReason: String?,
    generationTime: Double?,
    httpReferer: String?,
    id: String,
    isByok: Boolean,
    latency: Double?,
    model: String,
    moderationLatency: Double?,
    nativeFinishReason: String?,
    nativeTokensCached: Int?,
    nativeTokensCompletion: Int?,
    nativeTokensCompletionImages: Int?,
    nativeTokensPrompt: Int?,
    nativeTokensReasoning: Int?,
    numFetches: Int?,
    numInputAudioPrompt: Int?,
    numMediaCompletion: Int?,
    numMediaPrompt: Int?,
    numSearchResults: Int?,
    origin: String,
    presetId: String?,
    providerName: String?,
    providerResponses: List<ProviderResponse>?,
    router: String?,
    serviceTier: String?,
    streamed: Boolean?,
    tokensCompletion: Int?,
    tokensPrompt: Int?,
    totalCost: Double,
    upstreamId: String?,
    upstreamInferenceCost: Double?,
    usage: Double,
    userAgent: String?,
    webSearchEngine: String?,
  ) : this(apiType = apiType,
  appId = appId,
  cacheDiscount = cacheDiscount,
  cancelled = cancelled,
  createdAt = createdAt,
  dataRegion = dataRegion,
  externalUser = externalUser,
  finishReason = finishReason,
  generationTime = generationTime,
  httpReferer = httpReferer,
  id = id,
  isByok = isByok,
  latency = latency,
  model = model,
  moderationLatency = moderationLatency,
  nativeFinishReason = nativeFinishReason,
  nativeTokensCached = nativeTokensCached,
  nativeTokensCompletion = nativeTokensCompletion,
  nativeTokensCompletionImages = nativeTokensCompletionImages,
  nativeTokensPrompt = nativeTokensPrompt,
  nativeTokensReasoning = nativeTokensReasoning,
  numFetches = numFetches,
  numInputAudioPrompt = numInputAudioPrompt,
  numMediaCompletion = numMediaCompletion,
  numMediaPrompt = numMediaPrompt,
  numSearchResults = numSearchResults,
  origin = origin,
  presetId = presetId,
  providerName = providerName,
  providerResponses = providerResponses,
  router = router,
  serviceTier = serviceTier,
  streamed = streamed,
  tokensCompletion = tokensCompletion,
  tokensPrompt = tokensPrompt,
  totalCost = totalCost,
  upstreamId = upstreamId,
  upstreamInferenceCost = upstreamInferenceCost,
  usage = usage,
  userAgent = userAgent,
  webSearchEngine = webSearchEngine,
  requestIdState = FieldState.Absent,
  responseCacheSourceIdState = FieldState.Absent,
  sessionIdState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `request_id`.
   */
  public fun requestIdPresence(): FieldPresence = requestIdState.presence

  /**
   * Returns the wire presence of `response_cache_source_id`.
   */
  public fun responseCacheSourceIdPresence(): FieldPresence = responseCacheSourceIdState.presence

  /**
   * Returns the wire presence of `session_id`.
   */
  public fun sessionIdPresence(): FieldPresence = sessionIdState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var dataRegionValue: InlineGenerationResponseDataDataRegionX3d6fdb5c? = null

    public var dataRegion: InlineGenerationResponseDataDataRegionX3d6fdb5c
      get() = requireNotNull(dataRegionValue) { "dataRegion is required" }
      set(`value`) {
        dataRegionValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var isByokValue: Boolean? = null

    public var isByok: Boolean
      get() = requireNotNull(isByokValue) { "isByok is required" }
      set(`value`) {
        isByokValue = value
      }

    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var originValue: String? = null

    public var origin: String
      get() = requireNotNull(originValue) { "origin is required" }
      set(`value`) {
        originValue = value
      }

    private var totalCostValue: Double? = null

    public var totalCost: Double
      get() = requireNotNull(totalCostValue) { "totalCost is required" }
      set(`value`) {
        totalCostValue = value
      }

    private var usageValue: Double? = null

    public var usage: Double
      get() = requireNotNull(usageValue) { "usage is required" }
      set(`value`) {
        usageValue = value
      }

    private var apiTypeState: FieldState<InlineGenerationResponseDataApiTypeX6ac55b17?> =
        FieldState.Absent

    /**
     * Type of API used for the generation
     * Required nullable field; assigning `null` records present-null.
     */
    public var apiType: InlineGenerationResponseDataApiTypeX6ac55b17?
      get() = apiTypeState.valueOrNull()
      set(`value`) {
        apiTypeState = value.toNullableFieldState()
      }

    private var appIdState: FieldState<Int?> = FieldState.Absent

    /**
     * ID of the app that made the request
     * Required nullable field; assigning `null` records present-null.
     */
    public var appId: Int?
      get() = appIdState.valueOrNull()
      set(`value`) {
        appIdState = value.toNullableFieldState()
      }

    private var cacheDiscountState: FieldState<Double?> = FieldState.Absent

    /**
     * Discount applied due to caching
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var cacheDiscount: Double?
      get() = cacheDiscountState.valueOrNull()
      set(`value`) {
        cacheDiscountState = value.toNullableFieldState()
      }

    private var cancelledState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether the generation was cancelled
     * Required nullable field; assigning `null` records present-null.
     */
    public var cancelled: Boolean?
      get() = cancelledState.valueOrNull()
      set(`value`) {
        cancelledState = value.toNullableFieldState()
      }

    private var externalUserState: FieldState<String?> = FieldState.Absent

    /**
     * External user identifier
     * Required nullable field; assigning `null` records present-null.
     */
    public var externalUser: String?
      get() = externalUserState.valueOrNull()
      set(`value`) {
        externalUserState = value.toNullableFieldState()
      }

    private var finishReasonState: FieldState<String?> = FieldState.Absent

    /**
     * Reason the generation finished
     * Required nullable field; assigning `null` records present-null.
     */
    public var finishReason: String?
      get() = finishReasonState.valueOrNull()
      set(`value`) {
        finishReasonState = value.toNullableFieldState()
      }

    private var generationTimeState: FieldState<Double?> = FieldState.Absent

    /**
     * Time taken for generation in milliseconds
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var generationTime: Double?
      get() = generationTimeState.valueOrNull()
      set(`value`) {
        generationTimeState = value.toNullableFieldState()
      }

    private var httpRefererState: FieldState<String?> = FieldState.Absent

    /**
     * Referer header from the request
     * Required nullable field; assigning `null` records present-null.
     */
    public var httpReferer: String?
      get() = httpRefererState.valueOrNull()
      set(`value`) {
        httpRefererState = value.toNullableFieldState()
      }

    private var latencyState: FieldState<Double?> = FieldState.Absent

    /**
     * Total latency in milliseconds
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var latency: Double?
      get() = latencyState.valueOrNull()
      set(`value`) {
        latencyState = value.toNullableFieldState()
      }

    private var moderationLatencyState: FieldState<Double?> = FieldState.Absent

    /**
     * Moderation latency in milliseconds
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var moderationLatency: Double?
      get() = moderationLatencyState.valueOrNull()
      set(`value`) {
        moderationLatencyState = value.toNullableFieldState()
      }

    private var nativeFinishReasonState: FieldState<String?> = FieldState.Absent

    /**
     * Native finish reason as reported by provider
     * Required nullable field; assigning `null` records present-null.
     */
    public var nativeFinishReason: String?
      get() = nativeFinishReasonState.valueOrNull()
      set(`value`) {
        nativeFinishReasonState = value.toNullableFieldState()
      }

    private var nativeTokensCachedState: FieldState<Int?> = FieldState.Absent

    /**
     * Native cached tokens as reported by provider
     * Required nullable field; assigning `null` records present-null.
     */
    public var nativeTokensCached: Int?
      get() = nativeTokensCachedState.valueOrNull()
      set(`value`) {
        nativeTokensCachedState = value.toNullableFieldState()
      }

    private var nativeTokensCompletionState: FieldState<Int?> = FieldState.Absent

    /**
     * Native completion tokens as reported by provider
     * Required nullable field; assigning `null` records present-null.
     */
    public var nativeTokensCompletion: Int?
      get() = nativeTokensCompletionState.valueOrNull()
      set(`value`) {
        nativeTokensCompletionState = value.toNullableFieldState()
      }

    private var nativeTokensCompletionImagesState: FieldState<Int?> = FieldState.Absent

    /**
     * Native completion image tokens as reported by provider
     * Required nullable field; assigning `null` records present-null.
     */
    public var nativeTokensCompletionImages: Int?
      get() = nativeTokensCompletionImagesState.valueOrNull()
      set(`value`) {
        nativeTokensCompletionImagesState = value.toNullableFieldState()
      }

    private var nativeTokensPromptState: FieldState<Int?> = FieldState.Absent

    /**
     * Native prompt tokens as reported by provider
     * Required nullable field; assigning `null` records present-null.
     */
    public var nativeTokensPrompt: Int?
      get() = nativeTokensPromptState.valueOrNull()
      set(`value`) {
        nativeTokensPromptState = value.toNullableFieldState()
      }

    private var nativeTokensReasoningState: FieldState<Int?> = FieldState.Absent

    /**
     * Native reasoning tokens as reported by provider
     * Required nullable field; assigning `null` records present-null.
     */
    public var nativeTokensReasoning: Int?
      get() = nativeTokensReasoningState.valueOrNull()
      set(`value`) {
        nativeTokensReasoningState = value.toNullableFieldState()
      }

    private var numFetchesState: FieldState<Int?> = FieldState.Absent

    /**
     * Number of web fetches performed
     * Required nullable field; assigning `null` records present-null.
     */
    public var numFetches: Int?
      get() = numFetchesState.valueOrNull()
      set(`value`) {
        numFetchesState = value.toNullableFieldState()
      }

    private var numInputAudioPromptState: FieldState<Int?> = FieldState.Absent

    /**
     * Number of audio inputs in the prompt
     * Required nullable field; assigning `null` records present-null.
     */
    public var numInputAudioPrompt: Int?
      get() = numInputAudioPromptState.valueOrNull()
      set(`value`) {
        numInputAudioPromptState = value.toNullableFieldState()
      }

    private var numMediaCompletionState: FieldState<Int?> = FieldState.Absent

    /**
     * Number of media items in the completion
     * Required nullable field; assigning `null` records present-null.
     */
    public var numMediaCompletion: Int?
      get() = numMediaCompletionState.valueOrNull()
      set(`value`) {
        numMediaCompletionState = value.toNullableFieldState()
      }

    private var numMediaPromptState: FieldState<Int?> = FieldState.Absent

    /**
     * Number of media items in the prompt
     * Required nullable field; assigning `null` records present-null.
     */
    public var numMediaPrompt: Int?
      get() = numMediaPromptState.valueOrNull()
      set(`value`) {
        numMediaPromptState = value.toNullableFieldState()
      }

    private var numSearchResultsState: FieldState<Int?> = FieldState.Absent

    /**
     * Number of search results included
     * Required nullable field; assigning `null` records present-null.
     */
    public var numSearchResults: Int?
      get() = numSearchResultsState.valueOrNull()
      set(`value`) {
        numSearchResultsState = value.toNullableFieldState()
      }

    private var presetIdState: FieldState<String?> = FieldState.Absent

    /**
     * ID of the preset used for this generation, null if no preset was used
     * Required nullable field; assigning `null` records present-null.
     */
    public var presetId: String?
      get() = presetIdState.valueOrNull()
      set(`value`) {
        presetIdState = value.toNullableFieldState()
      }

    private var providerNameState: FieldState<String?> = FieldState.Absent

    /**
     * Name of the provider that served the request
     * Required nullable field; assigning `null` records present-null.
     */
    public var providerName: String?
      get() = providerNameState.valueOrNull()
      set(`value`) {
        providerNameState = value.toNullableFieldState()
      }

    private var providerResponsesState: FieldState<List<ProviderResponse>?> = FieldState.Absent

    /**
     * List of provider responses for this generation, including fallback attempts
     * Required nullable field; assigning `null` records present-null.
     */
    public var providerResponses: List<ProviderResponse>?
      get() = providerResponsesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        providerResponsesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var routerState: FieldState<String?> = FieldState.Absent

    /**
     * Router used for the request (e.g., openrouter/auto)
     * Required nullable field; assigning `null` records present-null.
     */
    public var router: String?
      get() = routerState.valueOrNull()
      set(`value`) {
        routerState = value.toNullableFieldState()
      }

    private var serviceTierState: FieldState<String?> = FieldState.Absent

    /**
     * Service tier the upstream provider reported running this request on, or null if it did not report one.
     * Required nullable field; assigning `null` records present-null.
     */
    public var serviceTier: String?
      get() = serviceTierState.valueOrNull()
      set(`value`) {
        serviceTierState = value.toNullableFieldState()
      }

    private var streamedState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether the response was streamed
     * Required nullable field; assigning `null` records present-null.
     */
    public var streamed: Boolean?
      get() = streamedState.valueOrNull()
      set(`value`) {
        streamedState = value.toNullableFieldState()
      }

    private var tokensCompletionState: FieldState<Int?> = FieldState.Absent

    /**
     * Number of tokens in the completion
     * Required nullable field; assigning `null` records present-null.
     */
    public var tokensCompletion: Int?
      get() = tokensCompletionState.valueOrNull()
      set(`value`) {
        tokensCompletionState = value.toNullableFieldState()
      }

    private var tokensPromptState: FieldState<Int?> = FieldState.Absent

    /**
     * Number of tokens in the prompt
     * Required nullable field; assigning `null` records present-null.
     */
    public var tokensPrompt: Int?
      get() = tokensPromptState.valueOrNull()
      set(`value`) {
        tokensPromptState = value.toNullableFieldState()
      }

    private var upstreamIdState: FieldState<String?> = FieldState.Absent

    /**
     * Upstream provider's identifier for this generation
     * Required nullable field; assigning `null` records present-null.
     */
    public var upstreamId: String?
      get() = upstreamIdState.valueOrNull()
      set(`value`) {
        upstreamIdState = value.toNullableFieldState()
      }

    private var upstreamInferenceCostState: FieldState<Double?> = FieldState.Absent

    /**
     * Cost charged by the upstream provider
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     * Required nullable field; assigning `null` records present-null.
     */
    public var upstreamInferenceCost: Double?
      get() = upstreamInferenceCostState.valueOrNull()
      set(`value`) {
        upstreamInferenceCostState = value.toNullableFieldState()
      }

    private var userAgentState: FieldState<String?> = FieldState.Absent

    /**
     * User-Agent header from the request
     * Required nullable field; assigning `null` records present-null.
     */
    public var userAgent: String?
      get() = userAgentState.valueOrNull()
      set(`value`) {
        userAgentState = value.toNullableFieldState()
      }

    private var webSearchEngineState: FieldState<String?> = FieldState.Absent

    /**
     * The resolved web search engine used for this generation (e.g. exa, firecrawl, parallel)
     * Required nullable field; assigning `null` records present-null.
     */
    public var webSearchEngine: String?
      get() = webSearchEngineState.valueOrNull()
      set(`value`) {
        webSearchEngineState = value.toNullableFieldState()
      }

    private var requestIdState: FieldState<String?> = FieldState.Absent

    /**
     * Unique identifier grouping all generations from a single API request
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var requestId: String?
      get() = requestIdState.valueOrNull()
      set(`value`) {
        requestIdState = value.toNullableFieldState()
      }

    private var responseCacheSourceIdState: FieldState<String?> = FieldState.Absent

    /**
     * If this generation was served from response cache, contains the original generation ID. Null otherwise.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var responseCacheSourceId: String?
      get() = responseCacheSourceIdState.valueOrNull()
      set(`value`) {
        responseCacheSourceIdState = value.toNullableFieldState()
      }

    private var sessionIdState: FieldState<String?> = FieldState.Absent

    /**
     * Session identifier grouping multiple generations in the same session
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var sessionId: String?
      get() = sessionIdState.valueOrNull()
      set(`value`) {
        sessionIdState = value.toNullableFieldState()
      }

    /**
     * Omits `request_id` from serialized output.
     */
    public fun unsetRequestId() {
      requestIdState = FieldState.Absent
    }

    /**
     * Omits `response_cache_source_id` from serialized output.
     */
    public fun unsetResponseCacheSourceId() {
      responseCacheSourceIdState = FieldState.Absent
    }

    /**
     * Omits `session_id` from serialized output.
     */
    public fun unsetSessionId() {
      sessionIdState = FieldState.Absent
    }

    public fun build(): InlineGenerationResponseDataX5ba38337 {
      check(createdAtValue != null) { "createdAt is required" }
      check(dataRegionValue != null) { "dataRegion is required" }
      check(idValue != null) { "id is required" }
      check(isByokValue != null) { "isByok is required" }
      check(modelValue != null) { "model is required" }
      check(originValue != null) { "origin is required" }
      check(totalCostValue != null) { "totalCost is required" }
      check(usageValue != null) { "usage is required" }
      check(apiTypeState !== FieldState.Absent) { "apiType is required, even when null" }
      check(appIdState !== FieldState.Absent) { "appId is required, even when null" }
      check(cacheDiscountState !== FieldState.Absent) { "cacheDiscount is required, even when null" }
      check(cancelledState !== FieldState.Absent) { "cancelled is required, even when null" }
      check(externalUserState !== FieldState.Absent) { "externalUser is required, even when null" }
      check(finishReasonState !== FieldState.Absent) { "finishReason is required, even when null" }
      check(generationTimeState !== FieldState.Absent) { "generationTime is required, even when null" }
      check(httpRefererState !== FieldState.Absent) { "httpReferer is required, even when null" }
      check(latencyState !== FieldState.Absent) { "latency is required, even when null" }
      check(moderationLatencyState !== FieldState.Absent) { "moderationLatency is required, even when null" }
      check(nativeFinishReasonState !== FieldState.Absent) { "nativeFinishReason is required, even when null" }
      check(nativeTokensCachedState !== FieldState.Absent) { "nativeTokensCached is required, even when null" }
      check(nativeTokensCompletionState !== FieldState.Absent) { "nativeTokensCompletion is required, even when null" }
      check(nativeTokensCompletionImagesState !== FieldState.Absent) { "nativeTokensCompletionImages is required, even when null" }
      check(nativeTokensPromptState !== FieldState.Absent) { "nativeTokensPrompt is required, even when null" }
      check(nativeTokensReasoningState !== FieldState.Absent) { "nativeTokensReasoning is required, even when null" }
      check(numFetchesState !== FieldState.Absent) { "numFetches is required, even when null" }
      check(numInputAudioPromptState !== FieldState.Absent) { "numInputAudioPrompt is required, even when null" }
      check(numMediaCompletionState !== FieldState.Absent) { "numMediaCompletion is required, even when null" }
      check(numMediaPromptState !== FieldState.Absent) { "numMediaPrompt is required, even when null" }
      check(numSearchResultsState !== FieldState.Absent) { "numSearchResults is required, even when null" }
      check(presetIdState !== FieldState.Absent) { "presetId is required, even when null" }
      check(providerNameState !== FieldState.Absent) { "providerName is required, even when null" }
      check(providerResponsesState !== FieldState.Absent) { "providerResponses is required, even when null" }
      check(routerState !== FieldState.Absent) { "router is required, even when null" }
      check(serviceTierState !== FieldState.Absent) { "serviceTier is required, even when null" }
      check(streamedState !== FieldState.Absent) { "streamed is required, even when null" }
      check(tokensCompletionState !== FieldState.Absent) { "tokensCompletion is required, even when null" }
      check(tokensPromptState !== FieldState.Absent) { "tokensPrompt is required, even when null" }
      check(upstreamIdState !== FieldState.Absent) { "upstreamId is required, even when null" }
      check(upstreamInferenceCostState !== FieldState.Absent) { "upstreamInferenceCost is required, even when null" }
      check(userAgentState !== FieldState.Absent) { "userAgent is required, even when null" }
      check(webSearchEngineState !== FieldState.Absent) { "webSearchEngine is required, even when null" }
      return InlineGenerationResponseDataX5ba38337(
        apiType = apiTypeState.valueOrNull(),
        appId = appIdState.valueOrNull(),
        cacheDiscount = cacheDiscountState.valueOrNull(),
        cancelled = cancelledState.valueOrNull(),
        createdAt = createdAt,
        dataRegion = dataRegion,
        externalUser = externalUserState.valueOrNull(),
        finishReason = finishReasonState.valueOrNull(),
        generationTime = generationTimeState.valueOrNull(),
        httpReferer = httpRefererState.valueOrNull(),
        id = id,
        isByok = isByok,
        latency = latencyState.valueOrNull(),
        model = model,
        moderationLatency = moderationLatencyState.valueOrNull(),
        nativeFinishReason = nativeFinishReasonState.valueOrNull(),
        nativeTokensCached = nativeTokensCachedState.valueOrNull(),
        nativeTokensCompletion = nativeTokensCompletionState.valueOrNull(),
        nativeTokensCompletionImages = nativeTokensCompletionImagesState.valueOrNull(),
        nativeTokensPrompt = nativeTokensPromptState.valueOrNull(),
        nativeTokensReasoning = nativeTokensReasoningState.valueOrNull(),
        numFetches = numFetchesState.valueOrNull(),
        numInputAudioPrompt = numInputAudioPromptState.valueOrNull(),
        numMediaCompletion = numMediaCompletionState.valueOrNull(),
        numMediaPrompt = numMediaPromptState.valueOrNull(),
        numSearchResults = numSearchResultsState.valueOrNull(),
        origin = origin,
        presetId = presetIdState.valueOrNull(),
        providerName = providerNameState.valueOrNull(),
        providerResponses = providerResponsesState.valueOrNull(),
        router = routerState.valueOrNull(),
        serviceTier = serviceTierState.valueOrNull(),
        streamed = streamedState.valueOrNull(),
        tokensCompletion = tokensCompletionState.valueOrNull(),
        tokensPrompt = tokensPromptState.valueOrNull(),
        totalCost = totalCost,
        upstreamId = upstreamIdState.valueOrNull(),
        upstreamInferenceCost = upstreamInferenceCostState.valueOrNull(),
        usage = usage,
        userAgent = userAgentState.valueOrNull(),
        webSearchEngine = webSearchEngineState.valueOrNull(),
        requestIdState = requestIdState,
        responseCacheSourceIdState = responseCacheSourceIdState,
        sessionIdState = sessionIdState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGenerationResponseDataX5ba38337 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGenerationResponseDataX5ba38337> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGenerationResponseDataX5ba38337 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGenerationResponseDataX5ba38337")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGenerationResponseDataX5ba38337 must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val dataRegion = json.decodeRequired<InlineGenerationResponseDataDataRegionX3d6fdb5c>(rawObject, "data_region")
      val id = json.decodeRequired<String>(rawObject, "id")
      val isByok = json.decodeRequired<Boolean>(rawObject, "is_byok")
      val model = json.decodeRequired<String>(rawObject, "model")
      val origin = json.decodeRequired<String>(rawObject, "origin")
      val totalCost = json.decodeRequired<Double>(rawObject, "total_cost")
      val usage = json.decodeRequired<Double>(rawObject, "usage")
      if (!rawObject.containsKey("api_type")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'api_type'")
      }
      val apiType = rawObject["api_type"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGenerationResponseDataApiTypeX6ac55b17?>(requireNotNull(element)) }
      if (!rawObject.containsKey("app_id")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'app_id'")
      }
      val appId = rawObject["app_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cache_discount")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'cache_discount'")
      }
      val cacheDiscount = rawObject["cache_discount"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("cancelled")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'cancelled'")
      }
      val cancelled = rawObject["cancelled"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      if (!rawObject.containsKey("external_user")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'external_user'")
      }
      val externalUser = rawObject["external_user"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("finish_reason")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'finish_reason'")
      }
      val finishReason = rawObject["finish_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("generation_time")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'generation_time'")
      }
      val generationTime = rawObject["generation_time"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("http_referer")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'http_referer'")
      }
      val httpReferer = rawObject["http_referer"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("latency")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'latency'")
      }
      val latency = rawObject["latency"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("moderation_latency")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'moderation_latency'")
      }
      val moderationLatency = rawObject["moderation_latency"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("native_finish_reason")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'native_finish_reason'")
      }
      val nativeFinishReason = rawObject["native_finish_reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("native_tokens_cached")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'native_tokens_cached'")
      }
      val nativeTokensCached = rawObject["native_tokens_cached"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("native_tokens_completion")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'native_tokens_completion'")
      }
      val nativeTokensCompletion = rawObject["native_tokens_completion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("native_tokens_completion_images")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'native_tokens_completion_images'")
      }
      val nativeTokensCompletionImages = rawObject["native_tokens_completion_images"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("native_tokens_prompt")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'native_tokens_prompt'")
      }
      val nativeTokensPrompt = rawObject["native_tokens_prompt"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("native_tokens_reasoning")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'native_tokens_reasoning'")
      }
      val nativeTokensReasoning = rawObject["native_tokens_reasoning"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("num_fetches")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'num_fetches'")
      }
      val numFetches = rawObject["num_fetches"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("num_input_audio_prompt")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'num_input_audio_prompt'")
      }
      val numInputAudioPrompt = rawObject["num_input_audio_prompt"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("num_media_completion")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'num_media_completion'")
      }
      val numMediaCompletion = rawObject["num_media_completion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("num_media_prompt")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'num_media_prompt'")
      }
      val numMediaPrompt = rawObject["num_media_prompt"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("num_search_results")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'num_search_results'")
      }
      val numSearchResults = rawObject["num_search_results"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("preset_id")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'preset_id'")
      }
      val presetId = rawObject["preset_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("provider_name")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'provider_name'")
      }
      val providerName = rawObject["provider_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("provider_responses")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'provider_responses'")
      }
      val providerResponses = rawObject["provider_responses"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<ProviderResponse>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("router")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'router'")
      }
      val router = rawObject["router"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("service_tier")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'service_tier'")
      }
      val serviceTier = rawObject["service_tier"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("streamed")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'streamed'")
      }
      val streamed = rawObject["streamed"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      if (!rawObject.containsKey("tokens_completion")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'tokens_completion'")
      }
      val tokensCompletion = rawObject["tokens_completion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("tokens_prompt")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'tokens_prompt'")
      }
      val tokensPrompt = rawObject["tokens_prompt"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("upstream_id")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'upstream_id'")
      }
      val upstreamId = rawObject["upstream_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("upstream_inference_cost")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'upstream_inference_cost'")
      }
      val upstreamInferenceCost = rawObject["upstream_inference_cost"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(requireNotNull(element)) }
      if (!rawObject.containsKey("user_agent")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'user_agent'")
      }
      val userAgent = rawObject["user_agent"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("web_search_engine")) {
        throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property 'web_search_engine'")
      }
      val webSearchEngine = rawObject["web_search_engine"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineGenerationResponseDataX5ba38337(
        apiType = apiType,
        appId = appId,
        cacheDiscount = cacheDiscount,
        cancelled = cancelled,
        createdAt = createdAt,
        dataRegion = dataRegion,
        externalUser = externalUser,
        finishReason = finishReason,
        generationTime = generationTime,
        httpReferer = httpReferer,
        id = id,
        isByok = isByok,
        latency = latency,
        model = model,
        moderationLatency = moderationLatency,
        nativeFinishReason = nativeFinishReason,
        nativeTokensCached = nativeTokensCached,
        nativeTokensCompletion = nativeTokensCompletion,
        nativeTokensCompletionImages = nativeTokensCompletionImages,
        nativeTokensPrompt = nativeTokensPrompt,
        nativeTokensReasoning = nativeTokensReasoning,
        numFetches = numFetches,
        numInputAudioPrompt = numInputAudioPrompt,
        numMediaCompletion = numMediaCompletion,
        numMediaPrompt = numMediaPrompt,
        numSearchResults = numSearchResults,
        origin = origin,
        presetId = presetId,
        providerName = providerName,
        providerResponses = providerResponses,
        router = router,
        serviceTier = serviceTier,
        streamed = streamed,
        tokensCompletion = tokensCompletion,
        tokensPrompt = tokensPrompt,
        totalCost = totalCost,
        upstreamId = upstreamId,
        upstreamInferenceCost = upstreamInferenceCost,
        usage = usage,
        userAgent = userAgent,
        webSearchEngine = webSearchEngine,
        requestIdState = json.decodeOptional(rawObject, "request_id", nullable = true),
        responseCacheSourceIdState = json.decodeOptional(rawObject, "response_cache_source_id", nullable = true),
        sessionIdState = json.decodeOptional(rawObject, "session_id", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGenerationResponseDataX5ba38337) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGenerationResponseDataX5ba38337")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("api_type", value.apiType?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("app_id", value.appId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cache_discount", value.cacheDiscount?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("cancelled", value.cancelled?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("data_region", json.encodeToJsonElement(value.dataRegion))
        put("external_user", value.externalUser?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("finish_reason", value.finishReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("generation_time", value.generationTime?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("http_referer", value.httpReferer?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", value.id)
        put("is_byok", json.encodeToJsonElement(value.isByok))
        put("latency", value.latency?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("model", value.model)
        put("moderation_latency", value.moderationLatency?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("native_finish_reason", value.nativeFinishReason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("native_tokens_cached", value.nativeTokensCached?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("native_tokens_completion", value.nativeTokensCompletion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("native_tokens_completion_images", value.nativeTokensCompletionImages?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("native_tokens_prompt", value.nativeTokensPrompt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("native_tokens_reasoning", value.nativeTokensReasoning?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("num_fetches", value.numFetches?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("num_input_audio_prompt", value.numInputAudioPrompt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("num_media_completion", value.numMediaCompletion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("num_media_prompt", value.numMediaPrompt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("num_search_results", value.numSearchResults?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("origin", value.origin)
        put("preset_id", value.presetId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("provider_name", value.providerName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("provider_responses", value.providerResponses?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("router", value.router?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("service_tier", value.serviceTier?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("streamed", value.streamed?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("tokens_completion", value.tokensCompletion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("tokens_prompt", value.tokensPrompt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("total_cost", json.encodeToJsonElement(value.totalCost))
        put("upstream_id", value.upstreamId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("upstream_inference_cost", value.upstreamInferenceCost?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("usage", json.encodeToJsonElement(value.usage))
        put("user_agent", value.userAgent?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("web_search_engine", value.webSearchEngine?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("request_id", value.requestIdState, json::encodeToJsonElement)
        putState("response_cache_source_id", value.responseCacheSourceIdState, json::encodeToJsonElement)
        putState("session_id", value.sessionIdState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGenerationResponseDataX5ba38337(block: InlineGenerationResponseDataX5ba38337.Builder.() -> Unit): InlineGenerationResponseDataX5ba38337 = InlineGenerationResponseDataX5ba38337.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGenerationResponseDataX5ba38337 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineGenerationResponseDataX5ba38337 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
