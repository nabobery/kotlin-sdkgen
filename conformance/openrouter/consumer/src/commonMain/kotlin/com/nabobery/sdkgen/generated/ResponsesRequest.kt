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
 */
@Serializable(with = ResponsesRequest.Serializer::class)
public class ResponsesRequest(
  public val background: Boolean? = null,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  public val debug: ChatDebugOptions? = null,
  public val frequencyPenalty: Double? = null,
  public val imageConfig:
      Map<String, InlineComponentsSchemasImageConfigAdditionalProperties>? = null,
  public val include: List<ResponseIncludesEnum>? = null,
  public val instructions: String? = null,
  public val maxOutputTokens: Int? = null,
  public val maxToolCalls: Int? = null,
  public val metadata: Map<String, String>? = null,
  /**
   * Output modalities for the response. Supported values are "text" and "image".
   */
  public val modalities: List<OutputModalityEnum>? = null,
  public val model: String? = null,
  public val models: List<String>? = null,
  public val parallelToolCalls: Boolean? = null,
  /**
   * Plugins you want to enable for this request, including their settings.
   */
  public val plugins: List<InlineComponentsSchemasResponsesRequestPropertiesPluginsItems>? = null,
  public val presencePenalty: Double? = null,
  public val previousResponseId: String? = null,
  public val prompt: StoredPromptTemplate? = null,
  public val promptCacheKey: String? = null,
  public val promptCacheOptions: PromptCacheOptions? = null,
  public val provider: ProviderPreferences? = null,
  public val reasoning: ReasoningConfig? = null,
  public val route: DeprecatedRoute? = null,
  public val safetyIdentifier: String? = null,
  public val serviceTier: InlineComponentsSchemasResponsesRequestPropertiesServiceTier? = null,
  /**
   * A unique identifier for grouping related requests (e.g., a conversation or agent workflow). When provided,
   * OpenRouter uses it as the sticky routing key, routing all requests in the session to the same provider to maximize
   * prompt cache hits. Also used for observability grouping. If provided in both the request body and the x-session-id
   * header, the body value takes precedence. Maximum of 256 characters.
   */
  public val sessionId: String? = null,
  public val stopServerToolsWhen: List<StopServerToolsWhenCondition>? = null,
  public val store: Boolean? = null,
  public val stream: Boolean? = null,
  public val temperature: Double? = null,
  public val toolChoice: OpenAiResponsesToolChoice? = null,
  public val tools: List<InlineComponentsSchemasResponsesRequestPropertiesToolsItems>? = null,
  public val topK: Int? = null,
  public val topLogprobs: Int? = null,
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
  public class Builder {
    public var background: Boolean? = null

    public var cacheControl: AnthropicCacheControlDirective? = null

    public var debug: ChatDebugOptions? = null

    public var frequencyPenalty: Double? = null

    public var imageConfig: Map<String, InlineComponentsSchemasImageConfigAdditionalProperties>? =
        null

    public var include: List<ResponseIncludesEnum>? = null

    public var instructions: String? = null

    public var maxOutputTokens: Int? = null

    public var maxToolCalls: Int? = null

    public var metadata: Map<String, String>? = null

    /**
     * Output modalities for the response. Supported values are "text" and "image".
     */
    public var modalities: List<OutputModalityEnum>? = null

    public var model: String? = null

    public var models: List<String>? = null

    public var parallelToolCalls: Boolean? = null

    /**
     * Plugins you want to enable for this request, including their settings.
     */
    public var plugins: List<InlineComponentsSchemasResponsesRequestPropertiesPluginsItems>? = null

    public var presencePenalty: Double? = null

    public var previousResponseId: String? = null

    public var prompt: StoredPromptTemplate? = null

    public var promptCacheKey: String? = null

    public var promptCacheOptions: PromptCacheOptions? = null

    public var provider: ProviderPreferences? = null

    public var reasoning: ReasoningConfig? = null

    public var route: DeprecatedRoute? = null

    public var safetyIdentifier: String? = null

    public var serviceTier: InlineComponentsSchemasResponsesRequestPropertiesServiceTier? = null

    /**
     * A unique identifier for grouping related requests (e.g., a conversation or agent workflow). When provided,
     * OpenRouter uses it as the sticky routing key, routing all requests in the session to the same provider to
     * maximize prompt cache hits. Also used for observability grouping. If provided in both the request body and the
     * x-session-id header, the body value takes precedence. Maximum of 256 characters.
     */
    public var sessionId: String? = null

    public var stopServerToolsWhen: List<StopServerToolsWhenCondition>? = null

    public var store: Boolean? = null

    public var stream: Boolean? = null

    public var temperature: Double? = null

    public var toolChoice: OpenAiResponsesToolChoice? = null

    public var tools: List<InlineComponentsSchemasResponsesRequestPropertiesToolsItems>? = null

    public var topK: Int? = null

    public var topLogprobs: Int? = null

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

  public object Serializer : KSerializer<ResponsesRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ResponsesRequest {
      val jsonDecoder = decoder.requireJsonDecoder("ResponsesRequest")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ResponsesRequest must be a JSON object")
      return ResponsesRequest(
        background = raw["background"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        cacheControl = raw["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        debug = raw["debug"]?.let { json.decodeFromJsonElement<ChatDebugOptions>(it) },
        frequencyPenalty = raw["frequency_penalty"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        imageConfig = raw["image_config"]?.let { json.decodeFromJsonElement<Map<String,
          InlineComponentsSchemasImageConfigAdditionalProperties>>(it) },
        include = raw["include"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<List<ResponseIncludesEnum>?>(element) },
        instructions = raw["instructions"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        maxOutputTokens = raw["max_output_tokens"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        maxToolCalls = raw["max_tool_calls"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        metadata = raw["metadata"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Map<String, String>?>(element) },
        modalities = raw["modalities"]?.let { json.decodeFromJsonElement<List<OutputModalityEnum>>(it) },
        model = raw["model"]?.let { json.decodeFromJsonElement<String>(it) },
        models = raw["models"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        parallelToolCalls = raw["parallel_tool_calls"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Boolean?>(element) },
        plugins = raw["plugins"]?.let { json
          .decodeFromJsonElement<List<InlineComponentsSchemasResponsesRequestPropertiesPluginsItems>>(it) },
        presencePenalty = raw["presence_penalty"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        previousResponseId = raw["previous_response_id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        prompt = raw["prompt"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<StoredPromptTemplate?>(element) },
        promptCacheKey = raw["prompt_cache_key"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        promptCacheOptions = raw["prompt_cache_options"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<PromptCacheOptions?>(element) },
        provider = raw["provider"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<ProviderPreferences?>(element) },
        reasoning = raw["reasoning"]?.let { json.decodeFromJsonElement<ReasoningConfig>(it) },
        route = raw["route"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<DeprecatedRoute?>(element) },
        safetyIdentifier = raw["safety_identifier"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
        serviceTier = raw["service_tier"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<InlineComponentsSchemasResponsesRequestPropertiesServiceTier?>(element) },
        sessionId = raw["session_id"]?.let { json.decodeFromJsonElement<String>(it) },
        stopServerToolsWhen = raw["stop_server_tools_when"]?.let { json
          .decodeFromJsonElement<List<StopServerToolsWhenCondition>>(it) },
        store = raw["store"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        stream = raw["stream"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        temperature = raw["temperature"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        toolChoice = raw["tool_choice"]?.let { json.decodeFromJsonElement<OpenAiResponsesToolChoice>(it) },
        tools = raw["tools"]?.let { json
          .decodeFromJsonElement<List<InlineComponentsSchemasResponsesRequestPropertiesToolsItems>>(it) },
        topK = raw["top_k"]?.let { json.decodeFromJsonElement<Int>(it) },
        topLogprobs = raw["top_logprobs"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Int?>(element) },
        topP = raw["top_p"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        trace = raw["trace"]?.let { json.decodeFromJsonElement<TraceConfig>(it) },
        truncation = raw["truncation"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<OpenAiResponsesTruncation?>(element) },
        user = raw["user"]?.let { json.decodeFromJsonElement<String>(it) },
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

public fun responsesRequest(block: ResponsesRequest.Builder.() -> Unit): ResponsesRequest = ResponsesRequest
  .build(block)
