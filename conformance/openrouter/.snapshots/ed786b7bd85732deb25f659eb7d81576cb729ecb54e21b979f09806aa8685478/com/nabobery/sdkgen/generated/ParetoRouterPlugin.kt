package com.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ParetoRouterPlugin.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ParetoRouterPlugin
 */
@Serializable(with = ParetoRouterPlugin.Serializer::class)
public class ParetoRouterPlugin(
  public val id: InlineParetoRouterPluginIdX5f41930c,
  /**
   * Set to false to disable the pareto-router plugin for this request. Defaults to true.
   */
  public val enabled: Boolean? = null,
  /**
   * Minimum coding quality score between 0 and 1. Maps to internal quality tiers: >= 0.66 → high (top coding models),
   * >= 0.33 → medium (strong modern flagships), < 0.33 → low (capable coders above the median). Omit to default to the
   * highest tier (equivalent to >= 0.66).
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val minCodingScore: Double? = null,
  /**
   * Price source for the Pareto frontier cost axis. "prompt" uses catalog list price (endpoint.pricing.prompt).
   * "weighted_avg" uses traffic-weighted effective input price from ClickHouse, falling back to prompt price for models
   * without traffic data. Defaults to "prompt".
   */
  public val priceSource: InlineParetoRouterPluginPriceSourceX1c066998? = null,
) {
  public class Builder {
    private var idValue: InlineParetoRouterPluginIdX5f41930c? = null

    public var id: InlineParetoRouterPluginIdX5f41930c
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    /**
     * Set to false to disable the pareto-router plugin for this request. Defaults to true.
     */
    public var enabled: Boolean? = null

    /**
     * Minimum coding quality score between 0 and 1. Maps to internal quality tiers: >= 0.66 → high (top coding models),
     * >= 0.33 → medium (strong modern flagships), < 0.33 → low (capable coders above the median). Omit to default to
     * the highest tier (equivalent to >= 0.66).
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var minCodingScore: Double? = null

    /**
     * Price source for the Pareto frontier cost axis. "prompt" uses catalog list price (endpoint.pricing.prompt).
     * "weighted_avg" uses traffic-weighted effective input price from ClickHouse, falling back to prompt price for
     * models without traffic data. Defaults to "prompt".
     */
    public var priceSource: InlineParetoRouterPluginPriceSourceX1c066998? = null

    public fun build(): ParetoRouterPlugin {
      check(idValue != null) { "id is required" }
      return ParetoRouterPlugin(
        id = id,
        enabled = enabled,
        minCodingScore = minCodingScore,
        priceSource = priceSource,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ParetoRouterPlugin = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ParetoRouterPlugin> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ParetoRouterPlugin {
      val jsonDecoder = decoder.requireJsonDecoder("ParetoRouterPlugin")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ParetoRouterPlugin must be a JSON object")
      val id = json.decodeRequired<InlineParetoRouterPluginIdX5f41930c>(rawObject, "id")
      return ParetoRouterPlugin(
        id = id,
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        minCodingScore = rawObject["min_coding_score"]?.let { json.decodeFromJsonElement<Double>(it) },
        priceSource = rawObject["price_source"]?.let { json.decodeFromJsonElement<InlineParetoRouterPluginPriceSourceX1c066998>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ParetoRouterPlugin) {
      val jsonEncoder = encoder.requireJsonEncoder("ParetoRouterPlugin")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
        value.minCodingScore?.let { put("min_coding_score", json.encodeToJsonElement(it)) }
        value.priceSource?.let { put("price_source", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paretoRouterPlugin(block: ParetoRouterPlugin.Builder.() -> Unit): ParetoRouterPlugin = ParetoRouterPlugin.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ParetoRouterPlugin is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
