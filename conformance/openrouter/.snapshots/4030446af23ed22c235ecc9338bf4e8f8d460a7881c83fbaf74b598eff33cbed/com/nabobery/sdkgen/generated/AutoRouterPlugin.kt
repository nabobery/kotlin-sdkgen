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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/AutoRouterPlugin.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AutoRouterPlugin
 */
@Serializable(with = AutoRouterPlugin.Serializer::class)
public class AutoRouterPlugin(
  public val id: InlineAutoRouterPluginIdX2adccf1f,
  allowedModels: List<String>? = null,
  /**
   * Controls cost vs. quality routing tradeoff (0–10). 0 = pure quality (best model regardless of cost), 10 = maximize
   * for cost (cheapest model wins). Intermediate values blend quality and cost signals continuously. Defaults to 7.
   */
  public val costQualityTradeoff: Int? = null,
  /**
   * Set to false to disable the auto-router plugin for this request. Defaults to true.
   */
  public val enabled: Boolean? = null,
) {
  /**
   * List of model patterns to filter which models the auto-router can route between. Supports wildcards (e.g.,
   * "anthropic/&#42;" matches all Anthropic models). When not specified, uses the default supported models list.
   */
  public val allowedModels: List<String>? =
      allowedModels?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var idValue: InlineAutoRouterPluginIdX2adccf1f? = null

    public var id: InlineAutoRouterPluginIdX2adccf1f
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var allowedModelsValue: List<String>? = null

    /**
     * List of model patterns to filter which models the auto-router can route between. Supports wildcards (e.g.,
     * "anthropic/&#42;" matches all Anthropic models). When not specified, uses the default supported models list.
     */
    public var allowedModels: List<String>?
      get() = allowedModelsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedModelsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Controls cost vs. quality routing tradeoff (0–10). 0 = pure quality (best model regardless of cost), 10 =
     * maximize for cost (cheapest model wins). Intermediate values blend quality and cost signals continuously.
     * Defaults to 7.
     */
    public var costQualityTradeoff: Int? = null

    /**
     * Set to false to disable the auto-router plugin for this request. Defaults to true.
     */
    public var enabled: Boolean? = null

    public fun build(): AutoRouterPlugin {
      check(idValue != null) { "id is required" }
      return AutoRouterPlugin(
        id = id,
        allowedModels = allowedModels,
        costQualityTradeoff = costQualityTradeoff,
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AutoRouterPlugin = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AutoRouterPlugin> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AutoRouterPlugin {
      val jsonDecoder = decoder.requireJsonDecoder("AutoRouterPlugin")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AutoRouterPlugin must be a JSON object")
      val id = json.decodeRequired<InlineAutoRouterPluginIdX2adccf1f>(rawObject, "id")
      return AutoRouterPlugin(
        id = id,
        allowedModels = rawObject["allowed_models"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        costQualityTradeoff = rawObject["cost_quality_tradeoff"]?.let { json.decodeFromJsonElement<Int>(it) },
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: AutoRouterPlugin) {
      val jsonEncoder = encoder.requireJsonEncoder("AutoRouterPlugin")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.allowedModels?.let { put("allowed_models", json.encodeToJsonElement(it)) }
        value.costQualityTradeoff?.let { put("cost_quality_tradeoff", json.encodeToJsonElement(it)) }
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun autoRouterPlugin(block: AutoRouterPlugin.Builder.() -> Unit): AutoRouterPlugin = AutoRouterPlugin.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AutoRouterPlugin is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
