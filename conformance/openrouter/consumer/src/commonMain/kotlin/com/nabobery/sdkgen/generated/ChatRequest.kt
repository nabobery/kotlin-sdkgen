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
 */
@Serializable(with = ChatRequest.Serializer::class)
public class ChatRequest(
  messages: List<ChatMessages>,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val debug: ChatDebugOptions? = null,
  /**
   * Frequency penalty (-2.0 to 2.0)
   */
  public val frequencyPenalty: Double? = null,
  public val imageConfig:
      Map<String, InlineComponentsSchemasImageConfigAdditionalProperties>? = null,
  /**
   * Token logit bias adjustments
   */
  public val logitBias: Map<String, Double>? = null,
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
  /**
   * Key-value pairs for additional object information (max 16 pairs, 64 char keys, 512 char values)
   */
  public val metadata: Map<String, String>? = null,
  /**
   * Minimum probability threshold relative to the most likely token. Tokens with probability below min_p * (probability
   * of top token) are filtered out. Not all providers support this parameter.
   */
  public val minP: Double? = null,
  /**
   * Output modalities for the response. Supported values are "text", "image", and "audio".
   */
  public val modalities: List<InlineComponentsSchemasChatRequestPropertiesModalitiesItems>? = null,
  public val model: String? = null,
  public val models: List<String>? = null,
  /**
   * Whether to enable parallel function calling during tool use. When true, the model may generate multiple tool calls
   * in a single response.
   */
  public val parallelToolCalls: Boolean? = null,
  /**
   * Plugins you want to enable for this request, including their settings.
   */
  public val plugins: List<InlineComponentsSchemasChatRequestPropertiesPluginsItems>? = null,
  public val prediction: Prediction? = null,
  /**
   * Presence penalty (-2.0 to 2.0)
   */
  public val presencePenalty: Double? = null,
  public val promptCacheKey: String? = null,
  public val promptCacheOptions: PromptCacheOptions? = null,
  public val provider: ProviderPreferences? = null,
  /**
   * Configuration options for reasoning models
   */
  public val reasoning: InlineComponentsSchemasChatRequestPropertiesReasoning? = null,
  /**
   * Shorthand for setting reasoning effort. Equivalent to setting reasoning.effort. Cannot be used simultaneously with
   * reasoning.effort if they differ.
   */
  public val reasoningEffort: InlineComponentsSchemasChatRequestPropertiesReasoningEffort? = null,
  /**
   * Penalizes tokens based on how much they have already appeared in the text. A value of 1.0 means no penalty. Values
   * above 1.0 penalize repeated tokens more strongly. Not all providers support this parameter.
   */
  public val repetitionPenalty: Double? = null,
  /**
   * Response format configuration
   */
  public val responseFormat: InlineComponentsSchemasChatRequestPropertiesResponseFormat? = null,
  public val route: DeprecatedRoute? = null,
  /**
   * Random seed for deterministic outputs
   */
  public val seed: Int? = null,
  /**
   * The service tier to use for processing this request.
   */
  public val serviceTier: InlineComponentsSchemasChatRequestPropertiesServiceTier? = null,
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
  public val stop: InlineComponentsSchemasChatRequestPropertiesStop? = null,
  public val stopServerToolsWhen: List<StopServerToolsWhenCondition>? = null,
  /**
   * Enable streaming response
   */
  public val stream: Boolean? = null,
  public val streamOptions: ChatStreamOptions? = null,
  /**
   * Sampling temperature (0-2)
   */
  public val temperature: Double? = null,
  public val toolChoice: ChatToolChoice? = null,
  /**
   * Available tools for function calling
   */
  public val tools: List<ChatFunctionTool>? = null,
  /**
   * Consider only tokens with "sufficiently high" probabilities based on the probability of the most likely token. Not
   * all providers support this parameter.
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

  public class Builder {
    private var messagesValue: List<ChatMessages>? = null

    public var messages: List<ChatMessages>
      get() = requireNotNull(messagesValue) { "messages is required" }
      set(`value`) {
        messagesValue = value
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var debug: ChatDebugOptions? = null

    /**
     * Frequency penalty (-2.0 to 2.0)
     */
    public var frequencyPenalty: Double? = null

    public var imageConfig: Map<String, InlineComponentsSchemasImageConfigAdditionalProperties>? =
        null

    /**
     * Token logit bias adjustments
     */
    public var logitBias: Map<String, Double>? = null

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

    /**
     * Key-value pairs for additional object information (max 16 pairs, 64 char keys, 512 char values)
     */
    public var metadata: Map<String, String>? = null

    /**
     * Minimum probability threshold relative to the most likely token. Tokens with probability below min_p *
     * (probability of top token) are filtered out. Not all providers support this parameter.
     */
    public var minP: Double? = null

    /**
     * Output modalities for the response. Supported values are "text", "image", and "audio".
     */
    public var modalities: List<InlineComponentsSchemasChatRequestPropertiesModalitiesItems>? = null

    public var model: String? = null

    public var models: List<String>? = null

    /**
     * Whether to enable parallel function calling during tool use. When true, the model may generate multiple tool
     * calls in a single response.
     */
    public var parallelToolCalls: Boolean? = null

    /**
     * Plugins you want to enable for this request, including their settings.
     */
    public var plugins: List<InlineComponentsSchemasChatRequestPropertiesPluginsItems>? = null

    public var prediction: Prediction? = null

    /**
     * Presence penalty (-2.0 to 2.0)
     */
    public var presencePenalty: Double? = null

    public var promptCacheKey: String? = null

    public var promptCacheOptions: PromptCacheOptions? = null

    public var provider: ProviderPreferences? = null

    /**
     * Configuration options for reasoning models
     */
    public var reasoning: InlineComponentsSchemasChatRequestPropertiesReasoning? = null

    /**
     * Shorthand for setting reasoning effort. Equivalent to setting reasoning.effort. Cannot be used simultaneously
     * with reasoning.effort if they differ.
     */
    public var reasoningEffort: InlineComponentsSchemasChatRequestPropertiesReasoningEffort? = null

    /**
     * Penalizes tokens based on how much they have already appeared in the text. A value of 1.0 means no penalty.
     * Values above 1.0 penalize repeated tokens more strongly. Not all providers support this parameter.
     */
    public var repetitionPenalty: Double? = null

    /**
     * Response format configuration
     */
    public var responseFormat: InlineComponentsSchemasChatRequestPropertiesResponseFormat? = null

    public var route: DeprecatedRoute? = null

    /**
     * Random seed for deterministic outputs
     */
    public var seed: Int? = null

    /**
     * The service tier to use for processing this request.
     */
    public var serviceTier: InlineComponentsSchemasChatRequestPropertiesServiceTier? = null

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
    public var stop: InlineComponentsSchemasChatRequestPropertiesStop? = null

    public var stopServerToolsWhen: List<StopServerToolsWhenCondition>? = null

    /**
     * Enable streaming response
     */
    public var stream: Boolean? = null

    public var streamOptions: ChatStreamOptions? = null

    /**
     * Sampling temperature (0-2)
     */
    public var temperature: Double? = null

    public var toolChoice: ChatToolChoice? = null

    /**
     * Available tools for function calling
     */
    public var tools: List<ChatFunctionTool>? = null

    /**
     * Consider only tokens with "sufficiently high" probabilities based on the probability of the most likely token.
     * Not all providers support this parameter.
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

  public object Serializer : KSerializer<ChatRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatRequest {
      val jsonDecoder = decoder.requireJsonDecoder("ChatRequest")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatRequest must be a JSON object")
      val messages = json.decodeRequired<List<ChatMessages>>(raw, "messages")
      return ChatRequest(
        messages = messages,
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        debug = raw["debug"]?.let { json.decodeFromJsonElement<ChatDebugOptions>(it) },
        frequencyPenalty = raw["frequency_penalty"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        imageConfig = raw["image_config"]?.let { json.decodeFromJsonElement<Map<String,
          InlineComponentsSchemasImageConfigAdditionalProperties>>(it) },
        logitBias = raw["logit_bias"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Map<String, Double>?>(element) },
        logprobs = raw["logprobs"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        maxCompletionTokens = raw["max_completion_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        maxTokens = raw["max_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        metadata = raw["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        minP = raw["min_p"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        modalities = raw["modalities"]?.let { json
          .decodeFromJsonElement<List<InlineComponentsSchemasChatRequestPropertiesModalitiesItems>>(it) },
        model = raw["model"]?.let { json.decodeFromJsonElement<String>(it) },
        models = raw["models"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        parallelToolCalls = raw["parallel_tool_calls"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        plugins = raw["plugins"]?.let { json
          .decodeFromJsonElement<List<InlineComponentsSchemasChatRequestPropertiesPluginsItems>>(it) },
        prediction = raw["prediction"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Prediction?>(element) },
        presencePenalty = raw["presence_penalty"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        promptCacheKey = raw["prompt_cache_key"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        promptCacheOptions = raw["prompt_cache_options"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<PromptCacheOptions?>(element) },
        provider = raw["provider"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ProviderPreferences?>(element) },
        reasoning = raw["reasoning"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasChatRequestPropertiesReasoning>(it) },
        reasoningEffort = raw["reasoning_effort"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasChatRequestPropertiesReasoningEffort?>(element) },
        repetitionPenalty = raw["repetition_penalty"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        responseFormat = raw["response_format"]?.let { json
          .decodeFromJsonElement<InlineComponentsSchemasChatRequestPropertiesResponseFormat>(it) },
        route = raw["route"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<DeprecatedRoute?>(element) },
        seed = raw["seed"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        serviceTier = raw["service_tier"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasChatRequestPropertiesServiceTier?>(element) },
        sessionId = raw["session_id"]?.let { json.decodeFromJsonElement<String>(it) },
        stop = raw["stop"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasChatRequestPropertiesStop?>(element) },
        stopServerToolsWhen = raw["stop_server_tools_when"]?.let { json
          .decodeFromJsonElement<List<StopServerToolsWhenCondition>>(it) },
        stream = raw["stream"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        streamOptions = raw["stream_options"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ChatStreamOptions?>(element) },
        temperature = raw["temperature"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        toolChoice = raw["tool_choice"]?.let { json.decodeFromJsonElement<ChatToolChoice>(it) },
        tools = raw["tools"]?.let { json.decodeFromJsonElement<List<ChatFunctionTool>>(it) },
        topA = raw["top_a"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        topK = raw["top_k"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        topLogprobs = raw["top_logprobs"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        topP = raw["top_p"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        trace = raw["trace"]?.let { json.decodeFromJsonElement<TraceConfig>(it) },
        user = raw["user"]?.let { json.decodeFromJsonElement<String>(it) },
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
