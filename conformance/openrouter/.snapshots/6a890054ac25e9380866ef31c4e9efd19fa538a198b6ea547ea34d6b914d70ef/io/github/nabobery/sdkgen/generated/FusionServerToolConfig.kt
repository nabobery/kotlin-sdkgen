package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Configuration for the openrouter:fusion server tool.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionServerToolConfig
 */
@Serializable(with = FusionServerToolConfig.Serializer::class)
public class FusionServerToolConfig(
  analysisModels: List<String>? = null,
  public val cacheControl: AnthropicCacheControlDirective? = null,
  /**
   * Maximum number of output tokens (including reasoning tokens) each panelist and the judge model may produce per
   * inner call. Controls the total output budget so reasoning-heavy models like GPT-5.5 do not exhaust their token
   * allowance before producing visible text. When omitted, panelists default to 32000 and the judge to 50000.
   */
  public val maxCompletionTokens: Int? = null,
  /**
   * Maximum number of tool-calling steps each panelist (analysis model) and the judge model may take during their
   * agentic web-research loop. Models with web_search/web_fetch enabled iterate until they produce a text response or
   * hit this ceiling. Defaults to 8. Capped at 16.
   */
  public val maxToolCalls: Int? = null,
  /**
   * Slug of the judge model that produces the structured analysis JSON. Defaults to the model used in the outer API
   * request.
   */
  public val model: String? = null,
  /**
   * Reasoning configuration forwarded to panelist and judge inner calls. Use this to control reasoning effort and token
   * budget for models that support extended thinking.
   */
  public val reasoning: InlineFusionServerToolConfigReasoningX16033786? = null,
  /**
   * Temperature forwarded to panelist inner calls. The judge always runs at temperature 0 regardless of this value.
   * When omitted, the provider's default applies.
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val temperature: Double? = null,
  tools: List<InlineFusionServerToolConfigToolsItemX1d2da3f0>? = null,
) {
  /**
   * Slugs of models to run in parallel as the analysis panel. Each model receives the user prompt with
   * openrouter:web_search and openrouter:web_fetch enabled, then a judge model summarizes the collective output into
   * structured analysis JSON. Capped at 8 models to bound cost amplification. Defaults to the Quality preset from
   * /labs/fusion.
   */
  public val analysisModels: List<String>? =
      analysisModels?.let { collection0 -> collection0.toList() }

  /**
   * Server tools available to panelist and judge inner calls. Each entry uses the same `{ type, parameters? }`
   * shorthand as the outer Chat Completions request. When omitted, defaults to `[{ type: "openrouter:web_search" }, {
   * type: "openrouter:web_fetch" }]`. Pass an empty array to disable tools entirely (panelists answer from parametric
   * knowledge only).
   */
  public val tools: List<InlineFusionServerToolConfigToolsItemX1d2da3f0>? =
      tools?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var analysisModelsValue: List<String>? = null

    /**
     * Slugs of models to run in parallel as the analysis panel. Each model receives the user prompt with
     * openrouter:web_search and openrouter:web_fetch enabled, then a judge model summarizes the collective output into
     * structured analysis JSON. Capped at 8 models to bound cost amplification. Defaults to the Quality preset from
     * /labs/fusion.
     */
    public var analysisModels: List<String>?
      get() = analysisModelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        analysisModelsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var cacheControl: AnthropicCacheControlDirective? = null

    /**
     * Maximum number of output tokens (including reasoning tokens) each panelist and the judge model may produce per
     * inner call. Controls the total output budget so reasoning-heavy models like GPT-5.5 do not exhaust their token
     * allowance before producing visible text. When omitted, panelists default to 32000 and the judge to 50000.
     */
    public var maxCompletionTokens: Int? = null

    /**
     * Maximum number of tool-calling steps each panelist (analysis model) and the judge model may take during their
     * agentic web-research loop. Models with web_search/web_fetch enabled iterate until they produce a text response or
     * hit this ceiling. Defaults to 8. Capped at 16.
     */
    public var maxToolCalls: Int? = null

    /**
     * Slug of the judge model that produces the structured analysis JSON. Defaults to the model used in the outer API
     * request.
     */
    public var model: String? = null

    /**
     * Reasoning configuration forwarded to panelist and judge inner calls. Use this to control reasoning effort and
     * token budget for models that support extended thinking.
     */
    public var reasoning: InlineFusionServerToolConfigReasoningX16033786? = null

    /**
     * Temperature forwarded to panelist inner calls. The judge always runs at temperature 0 regardless of this value.
     * When omitted, the provider's default applies.
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var temperature: Double? = null

    private var toolsValue: List<InlineFusionServerToolConfigToolsItemX1d2da3f0>? = null

    /**
     * Server tools available to panelist and judge inner calls. Each entry uses the same `{ type, parameters? }`
     * shorthand as the outer Chat Completions request. When omitted, defaults to `[{ type: "openrouter:web_search" }, {
     * type: "openrouter:web_fetch" }]`. Pass an empty array to disable tools entirely (panelists answer from parametric
     * knowledge only).
     */
    public var tools: List<InlineFusionServerToolConfigToolsItemX1d2da3f0>?
      get() = toolsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        toolsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): FusionServerToolConfig = FusionServerToolConfig(
      analysisModels = analysisModels,
      cacheControl = cacheControl,
      maxCompletionTokens = maxCompletionTokens,
      maxToolCalls = maxToolCalls,
      model = model,
      reasoning = reasoning,
      temperature = temperature,
      tools = tools,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FusionServerToolConfig = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FusionServerToolConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FusionServerToolConfig {
      val jsonDecoder = decoder.requireJsonDecoder("FusionServerToolConfig")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FusionServerToolConfig must be a JSON object")
      return FusionServerToolConfig(
        analysisModels = rawObject["analysis_models"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        cacheControl = rawObject["cache_control"]?.let { json.decodeFromJsonElement<AnthropicCacheControlDirective>(it) },
        maxCompletionTokens = rawObject["max_completion_tokens"]?.let { json.decodeFromJsonElement<Int>(it) },
        maxToolCalls = rawObject["max_tool_calls"]?.let { json.decodeFromJsonElement<Int>(it) },
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        reasoning = rawObject["reasoning"]?.let { json.decodeFromJsonElement<InlineFusionServerToolConfigReasoningX16033786>(it) },
        temperature = rawObject["temperature"]?.let { json.decodeFromJsonElement<Double>(it) },
        tools = rawObject["tools"]?.let { json.decodeFromJsonElement<List<InlineFusionServerToolConfigToolsItemX1d2da3f0>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FusionServerToolConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("FusionServerToolConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.analysisModels?.let { put("analysis_models", json.encodeToJsonElement(it)) }
        value.cacheControl?.let { put("cache_control", json.encodeToJsonElement(it)) }
        value.maxCompletionTokens?.let { put("max_completion_tokens", json.encodeToJsonElement(it)) }
        value.maxToolCalls?.let { put("max_tool_calls", json.encodeToJsonElement(it)) }
        value.model?.let { put("model", it) }
        value.reasoning?.let { put("reasoning", json.encodeToJsonElement(it)) }
        value.temperature?.let { put("temperature", json.encodeToJsonElement(it)) }
        value.tools?.let { put("tools", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fusionServerToolConfig(block: FusionServerToolConfig.Builder.() -> Unit): FusionServerToolConfig = FusionServerToolConfig.build(block)
