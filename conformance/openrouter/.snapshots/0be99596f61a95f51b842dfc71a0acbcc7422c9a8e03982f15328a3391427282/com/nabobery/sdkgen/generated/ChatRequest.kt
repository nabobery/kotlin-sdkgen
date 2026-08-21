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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Chat completion request parameters
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatRequest
 */
@Serializable(with = ChatRequest.Serializer::class)
public class ChatRequest(
  messages: List<ChatMessages>,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val debug: ChatDebugOptions? = null,
  /**
   * Frequency penalty (-2.0 to 2.0)
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val frequencyPenalty: Double? = null,
  imageConfig: Map<String, InlineImageConfigAdditionalValueXc674f569>? = null,
  logitBias: Map<String, Double>? = null,
  /**
   * Return log probabilities
   */
  public val logprobs: Boolean? = null,
  /**
   * Maximum tokens in completion
   */
  public val maxCompletionTokens: Int? = null,
  /**
   * Maximum tokens (deprecated, use max_completion_tokens). Note: some providers enforce a minimum of 16.
   */
  public val maxTokens: Int? = null,
  metadata: Map<String, String>? = null,
  /**
   * Minimum probability threshold relative to the most likely token. Tokens with probability below min_p * (probability
   * of top token) are filtered out. Not all providers support this parameter.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val minP: Double? = null,
  modalities: List<InlineChatRequestModalitiesItemX192148cc>? = null,
  public val model: String? = null,
  models: List<String>? = null,
  /**
   * Whether to enable parallel function calling during tool use. When true, the model may generate multiple tool calls
   * in a single response.
   */
  public val parallelToolCalls: Boolean? = null,
  plugins: List<InlineChatRequestPluginsItemXe8ef30ab>? = null,
  public val prediction: Prediction? = null,
  /**
   * Presence penalty (-2.0 to 2.0)
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val presencePenalty: Double? = null,
  public val promptCacheKey: String? = null,
  public val promptCacheOptions: PromptCacheOptions? = null,
  public val provider: ProviderPreferences? = null,
  /**
   * Configuration options for reasoning models
   */
  public val reasoning: InlineChatRequestReasoningX1ef1b361? = null,
  /**
   * Shorthand for setting reasoning effort. Equivalent to setting reasoning.effort. Cannot be used simultaneously with
   * reasoning.effort if they differ.
   */
  public val reasoningEffort: InlineChatRequestReasoningEffortXe2ef18af? = null,
  /**
   * Penalizes tokens based on how much they have already appeared in the text. A value of 1.0 means no penalty. Values
   * above 1.0 penalize repeated tokens more strongly. Not all providers support this parameter.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val repetitionPenalty: Double? = null,
  /**
   * Response format configuration
   */
  public val responseFormat: InlineChatRequestResponseFormatXf7da3e40? = null,
  public val route: DeprecatedRoute? = null,
  /**
   * Random seed for deterministic outputs
   */
  public val seed: Int? = null,
  /**
   * The service tier to use for processing this request.
   */
  public val serviceTier: InlineChatRequestServiceTierX35937cb5? = null,
  /**
   * A unique identifier for grouping related requests (e.g., a conversation or agent workflow). When provided,
   * OpenRouter uses it as the sticky routing key, routing all requests in the session to the same provider to maximize
   * prompt cache hits. Also used for observability grouping. If provided in both the request body and the x-session-id
   * header, the body value takes precedence. Maximum of 256 characters.
   */
  public val sessionId: String? = null,
  /**
   * Stop sequences (up to 4)
   */
  public val stop: InlineChatRequestStopX9225cac3? = null,
  stopServerToolsWhen: List<StopServerToolsWhenCondition>? = null,
  /**
   * Enable streaming response
   */
  public val stream: Boolean? = null,
  public val streamOptions: ChatStreamOptions? = null,
  /**
   * Sampling temperature (0-2)
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val temperature: Double? = null,
  public val toolChoice: ChatToolChoice? = null,
  tools: List<ChatFunctionTool>? = null,
  /**
   * Consider only tokens with "sufficiently high" probabilities based on the probability of the most likely token. Not
   * all providers support this parameter.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val topA: Double? = null,
  /**
   * Limits the model to choose from the top K most likely tokens at each step. A value of 1 means the model will always
   * pick the most likely next token. Not all providers support this parameter.
   */
  public val topK: Int? = null,
  /**
   * Number of top log probabilities to return (0-20)
   */
  public val topLogprobs: Int? = null,
  /**
   * Nucleus sampling parameter (0-1)
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val topP: Double? = null,
  public val trace: TraceConfig? = null,
  /**
   * Unique user identifier
   */
  public val user: String? = null,
) {
  /**
   * List of messages for the conversation
   */
  public val messages: List<ChatMessages> = messages.toList()

  public val imageConfig: Map<String, InlineImageConfigAdditionalValueXc674f569>? =
      imageConfig?.let { collection0 -> collection0.toMap() }

  /**
   * Token logit bias adjustments
   */
  public val logitBias: Map<String, Double>? = logitBias?.let { collection0 -> collection0.toMap() }

  /**
   * Key-value pairs for additional object information (max 16 pairs, 64 char keys, 512 char values)
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  /**
   * Output modalities for the response. Supported values are "text", "image", and "audio".
   */
  public val modalities: List<InlineChatRequestModalitiesItemX192148cc>? =
      modalities?.let { collection0 -> collection0.toList() }

  public val models: List<String>? = models?.let { collection0 -> collection0.toList() }

  /**
   * Plugins you want to enable for this request, including their settings.
   */
  public val plugins: List<InlineChatRequestPluginsItemXe8ef30ab>? =
      plugins?.let { collection0 -> collection0.toList() }

  public val stopServerToolsWhen: List<StopServerToolsWhenCondition>? =
      stopServerToolsWhen?.let { collection0 -> collection0.toList() }

  /**
   * Available tools for function calling
   */
  public val tools: List<ChatFunctionTool>? = tools?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var messagesValue: List<ChatMessages>? = null

    public var messages: List<ChatMessages>
      get() = requireNotNull(messagesValue) { "messages is required" }.toList()
      set(`value`) {
        messagesValue = value.toList()
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var debug: ChatDebugOptions? = null

    /**
     * Frequency penalty (-2.0 to 2.0)
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var frequencyPenalty: Double? = null

    private var imageConfigValue: Map<String, InlineImageConfigAdditionalValueXc674f569>? = null

    public var imageConfig: Map<String, InlineImageConfigAdditionalValueXc674f569>?
      get() = imageConfigValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        imageConfigValue = value?.let { collection0 -> collection0.toMap() }
      }

    private var logitBiasValue: Map<String, Double>? = null

    /**
     * Token logit bias adjustments
     */
    public var logitBias: Map<String, Double>?
      get() = logitBiasValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        logitBiasValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Return log probabilities
     */
    public var logprobs: Boolean? = null

    /**
     * Maximum tokens in completion
     */
    public var maxCompletionTokens: Int? = null

    /**
     * Maximum tokens (deprecated, use max_completion_tokens). Note: some providers enforce a minimum of 16.
     */
    public var maxTokens: Int? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Key-value pairs for additional object information (max 16 pairs, 64 char keys, 512 char values)
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Minimum probability threshold relative to the most likely token. Tokens with probability below min_p *
     * (probability of top token) are filtered out. Not all providers support this parameter.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var minP: Double? = null

    private var modalitiesValue: List<InlineChatRequestModalitiesItemX192148cc>? = null

    /**
     * Output modalities for the response. Supported values are "text", "image", and "audio".
     */
    public var modalities: List<InlineChatRequestModalitiesItemX192148cc>?
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

    /**
     * Whether to enable parallel function calling during tool use. When true, the model may generate multiple tool
     * calls in a single response.
     */
    public var parallelToolCalls: Boolean? = null

    private var pluginsValue: List<InlineChatRequestPluginsItemXe8ef30ab>? = null

    /**
     * Plugins you want to enable for this request, including their settings.
     */
    public var plugins: List<InlineChatRequestPluginsItemXe8ef30ab>?
      get() = pluginsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pluginsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var prediction: Prediction? = null

    /**
     * Presence penalty (-2.0 to 2.0)
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var presencePenalty: Double? = null

    public var promptCacheKey: String? = null

    public var promptCacheOptions: PromptCacheOptions? = null

    public var provider: ProviderPreferences? = null

    /**
     * Configuration options for reasoning models
     */
    public var reasoning: InlineChatRequestReasoningX1ef1b361? = null

    /**
     * Shorthand for setting reasoning effort. Equivalent to setting reasoning.effort. Cannot be used simultaneously
     * with reasoning.effort if they differ.
     */
    public var reasoningEffort: InlineChatRequestReasoningEffortXe2ef18af? = null

    /**
     * Penalizes tokens based on how much they have already appeared in the text. A value of 1.0 means no penalty.
     * Values above 1.0 penalize repeated tokens more strongly. Not all providers support this parameter.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var repetitionPenalty: Double? = null

    /**
     * Response format configuration
     */
    public var responseFormat: InlineChatRequestResponseFormatXf7da3e40? = null

    public var route: DeprecatedRoute? = null

    /**
     * Random seed for deterministic outputs
     */
    public var seed: Int? = null

    /**
     * The service tier to use for processing this request.
     */
    public var serviceTier: InlineChatRequestServiceTierX35937cb5? = null

    /**
     * A unique identifier for grouping related requests (e.g., a conversation or agent workflow). When provided,
     * OpenRouter uses it as the sticky routing key, routing all requests in the session to the same provider to
     * maximize prompt cache hits. Also used for observability grouping. If provided in both the request body and the
     * x-session-id header, the body value takes precedence. Maximum of 256 characters.
     */
    public var sessionId: String? = null

    /**
     * Stop sequences (up to 4)
     */
    public var stop: InlineChatRequestStopX9225cac3? = null

    private var stopServerToolsWhenValue: List<StopServerToolsWhenCondition>? = null

    public var stopServerToolsWhen: List<StopServerToolsWhenCondition>?
      get() = stopServerToolsWhenValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        stopServerToolsWhenValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Enable streaming response
     */
    public var stream: Boolean? = null

    public var streamOptions: ChatStreamOptions? = null

    /**
     * Sampling temperature (0-2)
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var temperature: Double? = null

    public var toolChoice: ChatToolChoice? = null

    private var toolsValue: List<ChatFunctionTool>? = null

    /**
     * Available tools for function calling
     */
    public var tools: List<ChatFunctionTool>?
      get() = toolsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        toolsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Consider only tokens with "sufficiently high" probabilities based on the probability of the most likely token.
     * Not all providers support this parameter.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var topA: Double? = null

    /**
     * Limits the model to choose from the top K most likely tokens at each step. A value of 1 means the model will
     * always pick the most likely next token. Not all providers support this parameter.
     */
    public var topK: Int? = null

    /**
     * Number of top log probabilities to return (0-20)
     */
    public var topLogprobs: Int? = null

    /**
     * Nucleus sampling parameter (0-1)
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var topP: Double? = null

    public var trace: TraceConfig? = null

    /**
     * Unique user identifier
     */
    public var user: String? = null

    public fun build(): ChatRequest {
      check(messagesValue != null) { "messages is required" }
      return ChatRequest(
        messages = messages,
        cacheControl = cacheControl,
        debug = debug,
        frequencyPenalty = frequencyPenalty,
        imageConfig = imageConfig,
        logitBias = logitBias,
        logprobs = logprobs,
        maxCompletionTokens = maxCompletionTokens,
        maxTokens = maxTokens,
        metadata = metadata,
        minP = minP,
        modalities = modalities,
        model = model,
        models = models,
        parallelToolCalls = parallelToolCalls,
        plugins = plugins,
        prediction = prediction,
        presencePenalty = presencePenalty,
        promptCacheKey = promptCacheKey,
        promptCacheOptions = promptCacheOptions,
        provider = provider,
        reasoning = reasoning,
        reasoningEffort = reasoningEffort,
        repetitionPenalty = repetitionPenalty,
        responseFormat = responseFormat,
        route = route,
        seed = seed,
        serviceTier = serviceTier,
        sessionId = sessionId,
        stop = stop,
        stopServerToolsWhen = stopServerToolsWhen,
        stream = stream,
        streamOptions = streamOptions,
        temperature = temperature,
        toolChoice = toolChoice,
        tools = tools,
        topA = topA,
        topK = topK,
        topLogprobs = topLogprobs,
        topP = topP,
        trace = trace,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatRequest {
      val jsonDecoder = decoder.requireJsonDecoder("ChatRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatRequest must be a JSON object")
      val messages = json.decodeRequired<List<ChatMessages>>(rawObject, "messages")
      return ChatRequest(
        messages = messages,
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        debug = rawObject["debug"]?.let { json.decodeFromJsonElement<ChatDebugOptions>(it) },
        frequencyPenalty = rawObject["frequency_penalty"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        imageConfig = rawObject["image_config"]?.let { json.decodeFromJsonElement<Map<String, InlineImageConfigAdditionalValueXc674f569>>(it) },
        logitBias = rawObject["logit_bias"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, Double>?>(element) },
        logprobs = rawObject["logprobs"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        maxCompletionTokens = rawObject["max_completion_tokens"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        maxTokens = rawObject["max_tokens"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        minP = rawObject["min_p"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        modalities = rawObject["modalities"]?.let { json.decodeFromJsonElement<List<InlineChatRequestModalitiesItemX192148cc>>(it) },
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        models = rawObject["models"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        parallelToolCalls = rawObject["parallel_tool_calls"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        plugins = rawObject["plugins"]?.let { json.decodeFromJsonElement<List<InlineChatRequestPluginsItemXe8ef30ab>>(it) },
        prediction = rawObject["prediction"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Prediction?>(element) },
        presencePenalty = rawObject["presence_penalty"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        promptCacheKey = rawObject["prompt_cache_key"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        promptCacheOptions = rawObject["prompt_cache_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<PromptCacheOptions?>(element) },
        provider = rawObject["provider"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ProviderPreferences?>(element) },
        reasoning = rawObject["reasoning"]?.let { json.decodeFromJsonElement<InlineChatRequestReasoningX1ef1b361>(it) },
        reasoningEffort = rawObject["reasoning_effort"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChatRequestReasoningEffortXe2ef18af?>(element) },
        repetitionPenalty = rawObject["repetition_penalty"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        responseFormat = rawObject["response_format"]?.let { json.decodeFromJsonElement<InlineChatRequestResponseFormatXf7da3e40>(it) },
        route = rawObject["route"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<DeprecatedRoute?>(element) },
        seed = rawObject["seed"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        serviceTier = rawObject["service_tier"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChatRequestServiceTierX35937cb5?>(element) },
        sessionId = rawObject["session_id"]?.let { json.decodeFromJsonElement<String>(it) },
        stop = rawObject["stop"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineChatRequestStopX9225cac3?>(element) },
        stopServerToolsWhen = rawObject["stop_server_tools_when"]?.let { json.decodeFromJsonElement<List<StopServerToolsWhenCondition>>(it) },
        stream = rawObject["stream"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        streamOptions = rawObject["stream_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ChatStreamOptions?>(element) },
        temperature = rawObject["temperature"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        toolChoice = rawObject["tool_choice"]?.let { json.decodeFromJsonElement<ChatToolChoice>(it) },
        tools = rawObject["tools"]?.let { json.decodeFromJsonElement<List<ChatFunctionTool>>(it) },
        topA = rawObject["top_a"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        topK = rawObject["top_k"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        topLogprobs = rawObject["top_logprobs"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        topP = rawObject["top_p"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        trace = rawObject["trace"]?.let { json.decodeFromJsonElement<TraceConfig>(it) },
        user = rawObject["user"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("messages", json.encodeToJsonElement(value.messages))
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.debug?.let { put("debug", json.encodeToJsonElement(it)) }
        value.frequencyPenalty?.let { put("frequency_penalty", json.encodeToJsonElement(it)) }
        value.imageConfig?.let { put("image_config", json.encodeToJsonElement(it)) }
        value.logitBias?.let { put("logit_bias", json.encodeToJsonElement(it)) }
        value.logprobs?.let { put("logprobs", json.encodeToJsonElement(it)) }
        value.maxCompletionTokens?.let { put("max_completion_tokens", json.encodeToJsonElement(it)) }
        value.maxTokens?.let { put("max_tokens", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.minP?.let { put("min_p", json.encodeToJsonElement(it)) }
        value.modalities?.let { put("modalities", json.encodeToJsonElement(it)) }
        value.model?.let { put("model", it) }
        value.models?.let { put("models", json.encodeToJsonElement(it)) }
        value.parallelToolCalls?.let { put("parallel_tool_calls", json.encodeToJsonElement(it)) }
        value.plugins?.let { put("plugins", json.encodeToJsonElement(it)) }
        value.prediction?.let { put("prediction", json.encodeToJsonElement(it)) }
        value.presencePenalty?.let { put("presence_penalty", json.encodeToJsonElement(it)) }
        value.promptCacheKey?.let { put("prompt_cache_key", it) }
        value.promptCacheOptions?.let { put("prompt_cache_options", json.encodeToJsonElement(it)) }
        value.provider?.let { put("provider", json.encodeToJsonElement(it)) }
        value.reasoning?.let { put("reasoning", json.encodeToJsonElement(it)) }
        value.reasoningEffort?.let { put("reasoning_effort", json.encodeToJsonElement(it)) }
        value.repetitionPenalty?.let { put("repetition_penalty", json.encodeToJsonElement(it)) }
        value.responseFormat?.let { put("response_format", json.encodeToJsonElement(it)) }
        value.route?.let { put("route", json.encodeToJsonElement(it)) }
        value.seed?.let { put("seed", json.encodeToJsonElement(it)) }
        value.serviceTier?.let { put("service_tier", json.encodeToJsonElement(it)) }
        value.sessionId?.let { put("session_id", it) }
        value.stop?.let { put("stop", json.encodeToJsonElement(it)) }
        value.stopServerToolsWhen?.let { put("stop_server_tools_when", json.encodeToJsonElement(it)) }
        value.stream?.let { put("stream", json.encodeToJsonElement(it)) }
        value.streamOptions?.let { put("stream_options", json.encodeToJsonElement(it)) }
        value.temperature?.let { put("temperature", json.encodeToJsonElement(it)) }
        value.toolChoice?.let { put("tool_choice", json.encodeToJsonElement(it)) }
        value.tools?.let { put("tools", json.encodeToJsonElement(it)) }
        value.topA?.let { put("top_a", json.encodeToJsonElement(it)) }
        value.topK?.let { put("top_k", json.encodeToJsonElement(it)) }
        value.topLogprobs?.let { put("top_logprobs", json.encodeToJsonElement(it)) }
        value.topP?.let { put("top_p", json.encodeToJsonElement(it)) }
        value.trace?.let { put("trace", json.encodeToJsonElement(it)) }
        value.user?.let { put("user", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatRequest(block: ChatRequest.Builder.() -> Unit): ChatRequest = ChatRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ChatRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
