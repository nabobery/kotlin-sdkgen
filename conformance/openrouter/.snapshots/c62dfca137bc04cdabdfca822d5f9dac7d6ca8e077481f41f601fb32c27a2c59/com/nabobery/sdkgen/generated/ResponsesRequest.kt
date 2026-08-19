package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Request schema for Responses endpoint
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ResponsesRequest
 */
@Serializable(with = ResponsesRequest.Serializer::class)
public class ResponsesRequest(
  public val background: Boolean? = null,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val debug: ChatDebugOptions? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val frequencyPenalty: Double? = null,
  imageConfig: Map<String, InlineImageConfigAdditionalValueXc674f569>? = null,
  include: List<ResponseIncludesEnum>? = null,
  public val instructions: String? = null,
  public val maxOutputTokens: Int? = null,
  public val maxToolCalls: Int? = null,
  metadata: Map<String, String>? = null,
  modalities: List<OutputModalityEnum>? = null,
  public val model: String? = null,
  models: List<String>? = null,
  public val parallelToolCalls: Boolean? = null,
  plugins: List<InlineResponsesRequestPluginsItemX0152a27c>? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val presencePenalty: Double? = null,
  public val previousResponseId: String? = null,
  public val prompt: StoredPromptTemplate? = null,
  public val promptCacheKey: String? = null,
  public val promptCacheOptions: PromptCacheOptions? = null,
  public val provider: ProviderPreferences? = null,
  public val reasoning: ReasoningConfig? = null,
  public val route: DeprecatedRoute? = null,
  public val safetyIdentifier: String? = null,
  public val serviceTier: InlineResponsesRequestServiceTierXb8f56617? = null,
  /**
   * A unique identifier for grouping related requests (e.g., a conversation or agent workflow). When provided,
   * OpenRouter uses it as the sticky routing key, routing all requests in the session to the same provider to maximize
   * prompt cache hits. Also used for observability grouping. If provided in both the request body and the x-session-id
   * header, the body value takes precedence. Maximum of 256 characters.
   */
  public val sessionId: String? = null,
  stopServerToolsWhen: List<StopServerToolsWhenCondition>? = null,
  public val store: Boolean? = null,
  public val stream: Boolean? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val temperature: Double? = null,
  public val toolChoice: OpenAiResponsesToolChoice? = null,
  tools: List<InlineResponsesRequestToolsItemXf7c3ac6c>? = null,
  public val topK: Int? = null,
  public val topLogprobs: Int? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val topP: Double? = null,
  public val trace: TraceConfig? = null,
  public val truncation: OpenAiResponsesTruncation? = null,
  /**
   * A unique identifier representing your end-user, which helps distinguish between different users of your app. This
   * allows your app to identify specific users in case of abuse reports, preventing your entire app from being affected
   * by the actions of individual users. Maximum of 256 characters.
   */
  public val user: String? = null,
) {
  public val imageConfig: Map<String, InlineImageConfigAdditionalValueXc674f569>? =
      imageConfig?.let { collection0 -> collection0.toMap() }

  public val include: List<ResponseIncludesEnum>? =
      include?.let { collection0 -> collection0.toList() }

  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * Output modalities for the response. Supported values are "text" and "image".
   */
  public val modalities: List<OutputModalityEnum>? =
      modalities?.let { collection0 -> collection0.toList() }

  public val models: List<String>? = models?.let { collection0 -> collection0.toList() }

  /**
   * Plugins you want to enable for this request, including their settings.
   */
  public val plugins: List<InlineResponsesRequestPluginsItemX0152a27c>? =
      plugins?.let { collection0 -> collection0.toList() }

  public val stopServerToolsWhen: List<StopServerToolsWhenCondition>? =
      stopServerToolsWhen?.let { collection0 -> collection0.toList() }

  public val tools: List<InlineResponsesRequestToolsItemXf7c3ac6c>? =
      tools?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var background: Boolean? = null

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var debug: ChatDebugOptions? = null

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var frequencyPenalty: Double? = null

    private var imageConfigValue: Map<String, InlineImageConfigAdditionalValueXc674f569>? = null

    public var imageConfig: Map<String, InlineImageConfigAdditionalValueXc674f569>?
      get() = imageConfigValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        imageConfigValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var includeValue: List<ResponseIncludesEnum>? = null

    public var include: List<ResponseIncludesEnum>?
      get() = includeValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        includeValue = value?.let { collection0 -> collection0.toList() }
      }

    public var instructions: String? = null

    public var maxOutputTokens: Int? = null

    public var maxToolCalls: Int? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var modalitiesValue: List<OutputModalityEnum>? = null

    /**
     * Output modalities for the response. Supported values are "text" and "image".
     */
    public var modalities: List<OutputModalityEnum>?
      get() = modalitiesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        modalitiesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var model: String? = null

    private var modelsValue: List<String>? = null

    public var models: List<String>?
      get() = modelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        modelsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var parallelToolCalls: Boolean? = null

    private var pluginsValue: List<InlineResponsesRequestPluginsItemX0152a27c>? = null

    /**
     * Plugins you want to enable for this request, including their settings.
     */
    public var plugins: List<InlineResponsesRequestPluginsItemX0152a27c>?
      get() = pluginsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pluginsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var presencePenalty: Double? = null

    public var previousResponseId: String? = null

    public var prompt: StoredPromptTemplate? = null

    public var promptCacheKey: String? = null

    public var promptCacheOptions: PromptCacheOptions? = null

    public var provider: ProviderPreferences? = null

    public var reasoning: ReasoningConfig? = null

    public var route: DeprecatedRoute? = null

    public var safetyIdentifier: String? = null

    public var serviceTier: InlineResponsesRequestServiceTierXb8f56617? = null

    /**
     * A unique identifier for grouping related requests (e.g., a conversation or agent workflow). When provided,
     * OpenRouter uses it as the sticky routing key, routing all requests in the session to the same provider to
     * maximize prompt cache hits. Also used for observability grouping. If provided in both the request body and the
     * x-session-id header, the body value takes precedence. Maximum of 256 characters.
     */
    public var sessionId: String? = null

    private var stopServerToolsWhenValue: List<StopServerToolsWhenCondition>? = null

    public var stopServerToolsWhen: List<StopServerToolsWhenCondition>?
      get() = stopServerToolsWhenValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        stopServerToolsWhenValue = value?.let { collection0 -> collection0.toList() }
      }

    public var store: Boolean? = null

    public var stream: Boolean? = null

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var temperature: Double? = null

    public var toolChoice: OpenAiResponsesToolChoice? = null

    private var toolsValue: List<InlineResponsesRequestToolsItemXf7c3ac6c>? = null

    public var tools: List<InlineResponsesRequestToolsItemXf7c3ac6c>?
      get() = toolsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        toolsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var topK: Int? = null

    public var topLogprobs: Int? = null

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var topP: Double? = null

    public var trace: TraceConfig? = null

    public var truncation: OpenAiResponsesTruncation? = null

    /**
     * A unique identifier representing your end-user, which helps distinguish between different users of your app. This
     * allows your app to identify specific users in case of abuse reports, preventing your entire app from being
     * affected by the actions of individual users. Maximum of 256 characters.
     */
    public var user: String? = null

    public fun build(): ResponsesRequest = ResponsesRequest(
      background = background,
      cacheControl = cacheControl,
      debug = debug,
      frequencyPenalty = frequencyPenalty,
      imageConfig = imageConfig,
      include = include,
      instructions = instructions,
      maxOutputTokens = maxOutputTokens,
      maxToolCalls = maxToolCalls,
      metadata = metadata,
      modalities = modalities,
      model = model,
      models = models,
      parallelToolCalls = parallelToolCalls,
      plugins = plugins,
      presencePenalty = presencePenalty,
      previousResponseId = previousResponseId,
      prompt = prompt,
      promptCacheKey = promptCacheKey,
      promptCacheOptions = promptCacheOptions,
      provider = provider,
      reasoning = reasoning,
      route = route,
      safetyIdentifier = safetyIdentifier,
      serviceTier = serviceTier,
      sessionId = sessionId,
      stopServerToolsWhen = stopServerToolsWhen,
      store = store,
      stream = stream,
      temperature = temperature,
      toolChoice = toolChoice,
      tools = tools,
      topK = topK,
      topLogprobs = topLogprobs,
      topP = topP,
      trace = trace,
      truncation = truncation,
      user = user,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ResponsesRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ResponsesRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ResponsesRequest {
      val jsonDecoder = decoder.requireJsonDecoder("ResponsesRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ResponsesRequest must be a JSON object")
      return ResponsesRequest(
        background = rawObject["background"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        debug = rawObject["debug"]?.let { json.decodeFromJsonElement<ChatDebugOptions>(it) },
        frequencyPenalty = rawObject["frequency_penalty"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        imageConfig = rawObject["image_config"]?.let { json.decodeFromJsonElement<Map<String, InlineImageConfigAdditionalValueXc674f569>>(it) },
        include = rawObject["include"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<ResponseIncludesEnum>?>(element) },
        instructions = rawObject["instructions"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        maxOutputTokens = rawObject["max_output_tokens"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        maxToolCalls = rawObject["max_tool_calls"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        metadata = rawObject["metadata"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, String>?>(element) },
        modalities = rawObject["modalities"]?.let { json.decodeFromJsonElement<List<OutputModalityEnum>>(it) },
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        models = rawObject["models"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        parallelToolCalls = rawObject["parallel_tool_calls"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        plugins = rawObject["plugins"]?.let { json.decodeFromJsonElement<List<InlineResponsesRequestPluginsItemX0152a27c>>(it) },
        presencePenalty = rawObject["presence_penalty"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        previousResponseId = rawObject["previous_response_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        prompt = rawObject["prompt"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<StoredPromptTemplate?>(element) },
        promptCacheKey = rawObject["prompt_cache_key"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        promptCacheOptions = rawObject["prompt_cache_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<PromptCacheOptions?>(element) },
        provider = rawObject["provider"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ProviderPreferences?>(element) },
        reasoning = rawObject["reasoning"]?.let { json.decodeFromJsonElement<ReasoningConfig>(it) },
        route = rawObject["route"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<DeprecatedRoute?>(element) },
        safetyIdentifier = rawObject["safety_identifier"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        serviceTier = rawObject["service_tier"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineResponsesRequestServiceTierXb8f56617?>(element) },
        sessionId = rawObject["session_id"]?.let { json.decodeFromJsonElement<String>(it) },
        stopServerToolsWhen = rawObject["stop_server_tools_when"]?.let { json.decodeFromJsonElement<List<StopServerToolsWhenCondition>>(it) },
        store = rawObject["store"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        stream = rawObject["stream"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        temperature = rawObject["temperature"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        toolChoice = rawObject["tool_choice"]?.let { json.decodeFromJsonElement<OpenAiResponsesToolChoice>(it) },
        tools = rawObject["tools"]?.let { json.decodeFromJsonElement<List<InlineResponsesRequestToolsItemXf7c3ac6c>>(it) },
        topK = rawObject["top_k"]?.let { json.decodeFromJsonElement<Int>(it) },
        topLogprobs = rawObject["top_logprobs"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        topP = rawObject["top_p"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        trace = rawObject["trace"]?.let { json.decodeFromJsonElement<TraceConfig>(it) },
        truncation = rawObject["truncation"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<OpenAiResponsesTruncation?>(element) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ResponsesRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("ResponsesRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.background?.let { put("background", json.encodeToJsonElement(it)) }
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.debug?.let { put("debug", json.encodeToJsonElement(it)) }
        value.frequencyPenalty?.let { put("frequency_penalty", json.encodeToJsonElement(it)) }
        value.imageConfig?.let { put("image_config", json.encodeToJsonElement(it)) }
        value.include?.let { put("include", json.encodeToJsonElement(it)) }
        value.instructions?.let { put("instructions", it) }
        value.maxOutputTokens?.let { put("max_output_tokens", json.encodeToJsonElement(it)) }
        value.maxToolCalls?.let { put("max_tool_calls", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.modalities?.let { put("modalities", json.encodeToJsonElement(it)) }
        value.model?.let { put("model", it) }
        value.models?.let { put("models", json.encodeToJsonElement(it)) }
        value.parallelToolCalls?.let { put("parallel_tool_calls", json.encodeToJsonElement(it)) }
        value.plugins?.let { put("plugins", json.encodeToJsonElement(it)) }
        value.presencePenalty?.let { put("presence_penalty", json.encodeToJsonElement(it)) }
        value.previousResponseId?.let { put("previous_response_id", it) }
        value.prompt?.let { put("prompt", json.encodeToJsonElement(it)) }
        value.promptCacheKey?.let { put("prompt_cache_key", it) }
        value.promptCacheOptions?.let { put("prompt_cache_options", json.encodeToJsonElement(it)) }
        value.provider?.let { put("provider", json.encodeToJsonElement(it)) }
        value.reasoning?.let { put("reasoning", json.encodeToJsonElement(it)) }
        value.route?.let { put("route", json.encodeToJsonElement(it)) }
        value.safetyIdentifier?.let { put("safety_identifier", it) }
        value.serviceTier?.let { put("service_tier", json.encodeToJsonElement(it)) }
        value.sessionId?.let { put("session_id", it) }
        value.stopServerToolsWhen?.let { put("stop_server_tools_when", json.encodeToJsonElement(it)) }
        value.store?.let { put("store", json.encodeToJsonElement(it)) }
        value.stream?.let { put("stream", json.encodeToJsonElement(it)) }
        value.temperature?.let { put("temperature", json.encodeToJsonElement(it)) }
        value.toolChoice?.let { put("tool_choice", json.encodeToJsonElement(it)) }
        value.tools?.let { put("tools", json.encodeToJsonElement(it)) }
        value.topK?.let { put("top_k", json.encodeToJsonElement(it)) }
        value.topLogprobs?.let { put("top_logprobs", json.encodeToJsonElement(it)) }
        value.topP?.let { put("top_p", json.encodeToJsonElement(it)) }
        value.trace?.let { put("trace", json.encodeToJsonElement(it)) }
        value.truncation?.let { put("truncation", json.encodeToJsonElement(it)) }
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun responsesRequest(block: ResponsesRequest.Builder.() -> Unit): ResponsesRequest = ResponsesRequest.build(block)
