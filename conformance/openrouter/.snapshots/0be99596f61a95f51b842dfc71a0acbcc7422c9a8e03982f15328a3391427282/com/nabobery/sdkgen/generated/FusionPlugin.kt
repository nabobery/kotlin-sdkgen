package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin
 */
@Serializable(with = FusionPlugin.Serializer::class)
public class FusionPlugin(
  public val id: InlineFusionPluginIdX75801025,
  analysisModels: List<String>? = null,
  /**
   * Set to false to disable the fusion plugin for this request. Defaults to true.
   */
  public val enabled: Boolean? = null,
  /**
   * Maximum number of tool-calling steps each panelist (analysis model) and the judge model may take during their
   * agentic web-research loop. Models with web_search/web_fetch enabled iterate until they produce a text response or
   * hit this ceiling. Defaults to 8. Capped at 16.
   */
  public val maxToolCalls: Int? = null,
  /**
   * Slug of the model that performs both the judge step (with web_search + web_fetch) and the final synthesis. When
   * omitted, defaults to the first model in the Quality preset.
   */
  public val model: String? = null,
  /**
   * A curated OpenRouter fusion preset (slugs follow `<task>-<tier>`, e.g. `general-high`). Expands server-side into
   * the preset's analysis_models panel and judge model, so callers never name individual models. Explicitly provided
   * `analysis_models` / `model` take precedence.
   */
  public val preset: InlineFusionPluginPresetXda905718? = null,
  tools: List<InlineFusionPluginToolsItemXb80691d1>? = null,
) {
  /**
   * Slugs of models to run in parallel as the "expert panel" the judge analyzes. Each model receives the same user
   * prompt with web_search + web_fetch enabled. Capped at 8 models to bound cost amplification. When omitted, defaults
   * to the Quality preset from the /labs/fusion UI (~anthropic/claude-opus-latest, ~openai/gpt-latest,
   * ~google/gemini-pro-latest).
   */
  public val analysisModels: List<String>? =
      analysisModels?.let { collection0 -> collection0.toList() }

  /**
   * Server tools available to panelist and judge inner calls. Each entry uses the same `{ type, parameters? }`
   * shorthand as the outer Chat Completions request. When omitted, defaults to `[{ type: "openrouter:web_search" }, {
   * type: "openrouter:web_fetch" }]`. Pass an empty array to disable tools entirely (panelists answer from parametric
   * knowledge only).
   */
  public val tools: List<InlineFusionPluginToolsItemXb80691d1>? =
      tools?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var idValue: InlineFusionPluginIdX75801025? = null

    public var id: InlineFusionPluginIdX75801025
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var analysisModelsValue: List<String>? = null

    /**
     * Slugs of models to run in parallel as the "expert panel" the judge analyzes. Each model receives the same user
     * prompt with web_search + web_fetch enabled. Capped at 8 models to bound cost amplification. When omitted,
     * defaults to the Quality preset from the /labs/fusion UI (~anthropic/claude-opus-latest, ~openai/gpt-latest,
     * ~google/gemini-pro-latest).
     */
    public var analysisModels: List<String>?
      get() = analysisModelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        analysisModelsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Set to false to disable the fusion plugin for this request. Defaults to true.
     */
    public var enabled: Boolean? = null

    /**
     * Maximum number of tool-calling steps each panelist (analysis model) and the judge model may take during their
     * agentic web-research loop. Models with web_search/web_fetch enabled iterate until they produce a text response or
     * hit this ceiling. Defaults to 8. Capped at 16.
     */
    public var maxToolCalls: Int? = null

    /**
     * Slug of the model that performs both the judge step (with web_search + web_fetch) and the final synthesis. When
     * omitted, defaults to the first model in the Quality preset.
     */
    public var model: String? = null

    /**
     * A curated OpenRouter fusion preset (slugs follow `<task>-<tier>`, e.g. `general-high`). Expands server-side into
     * the preset's analysis_models panel and judge model, so callers never name individual models. Explicitly provided
     * `analysis_models` / `model` take precedence.
     */
    public var preset: InlineFusionPluginPresetXda905718? = null

    private var toolsValue: List<InlineFusionPluginToolsItemXb80691d1>? = null

    /**
     * Server tools available to panelist and judge inner calls. Each entry uses the same `{ type, parameters? }`
     * shorthand as the outer Chat Completions request. When omitted, defaults to `[{ type: "openrouter:web_search" }, {
     * type: "openrouter:web_fetch" }]`. Pass an empty array to disable tools entirely (panelists answer from parametric
     * knowledge only).
     */
    public var tools: List<InlineFusionPluginToolsItemXb80691d1>?
      get() = toolsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        toolsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): FusionPlugin {
      check(idValue != null) { "id is required" }
      return FusionPlugin(
        id = id,
        analysisModels = analysisModels,
        enabled = enabled,
        maxToolCalls = maxToolCalls,
        model = model,
        preset = preset,
        tools = tools,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FusionPlugin = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FusionPlugin> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FusionPlugin {
      val jsonDecoder = decoder.requireJsonDecoder("FusionPlugin")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FusionPlugin must be a JSON object")
      val id = json.decodeRequired<InlineFusionPluginIdX75801025>(rawObject, "id")
      return FusionPlugin(
        id = id,
        analysisModels = rawObject["analysis_models"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        maxToolCalls = rawObject["max_tool_calls"]?.let { json.decodeFromJsonElement<Int>(it) },
        model = rawObject["model"]?.let { json.decodeFromJsonElement<String>(it) },
        preset = rawObject["preset"]?.let { json.decodeFromJsonElement<InlineFusionPluginPresetXda905718>(it) },
        tools = rawObject["tools"]?.let { json.decodeFromJsonElement<List<InlineFusionPluginToolsItemXb80691d1>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FusionPlugin) {
      val jsonEncoder = encoder.requireJsonEncoder("FusionPlugin")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.analysisModels?.let { put("analysis_models", json.encodeToJsonElement(it)) }
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.maxToolCalls?.let { put("max_tool_calls", json.encodeToJsonElement(it)) }
        value.model?.let { put("model", it) }
        value.preset?.let { put("preset", json.encodeToJsonElement(it)) }
        value.tools?.let { put("tools", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun fusionPlugin(block: FusionPlugin.Builder.() -> Unit): FusionPlugin = FusionPlugin.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("FusionPlugin is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
