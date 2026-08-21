package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/PublicEndpoint/properties/throughput_last_30m.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PublicEndpoint/properties/throughput_last_30m
 */
@Serializable(with = InlinePublicEndpointThroughputLast30mX8bef817b.Serializer::class)
public class InlinePublicEndpointThroughputLast30mX8bef817b(
  /**
   * Median (50th percentile)
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val p50: Double,
  /**
   * 75th percentile
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val p75: Double,
  /**
   * 90th percentile
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val p90: Double,
  /**
   * 99th percentile
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val p99: Double,
) {
  public class Builder {
    private var p50Value: Double? = null

    public var p50: Double
      get() = requireNotNull(p50Value) { "p50 is required" }
      set(`value`) {
        p50Value = value
      }

    private var p75Value: Double? = null

    public var p75: Double
      get() = requireNotNull(p75Value) { "p75 is required" }
      set(`value`) {
        p75Value = value
      }

    private var p90Value: Double? = null

    public var p90: Double
      get() = requireNotNull(p90Value) { "p90 is required" }
      set(`value`) {
        p90Value = value
      }

    private var p99Value: Double? = null

    public var p99: Double
      get() = requireNotNull(p99Value) { "p99 is required" }
      set(`value`) {
        p99Value = value
      }

    public fun build(): InlinePublicEndpointThroughputLast30mX8bef817b {
      check(p50Value != null) { "p50 is required" }
      check(p75Value != null) { "p75 is required" }
      check(p90Value != null) { "p90 is required" }
      check(p99Value != null) { "p99 is required" }
      return InlinePublicEndpointThroughputLast30mX8bef817b(
        p50 = p50,
        p75 = p75,
        p90 = p90,
        p99 = p99,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlinePublicEndpointThroughputLast30mX8bef817b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlinePublicEndpointThroughputLast30mX8bef817b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePublicEndpointThroughputLast30mX8bef817b {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePublicEndpointThroughputLast30mX8bef817b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlinePublicEndpointThroughputLast30mX8bef817b must be a JSON object")
      val p50 = json.decodeRequired<Double>(rawObject, "p50")
      val p75 = json.decodeRequired<Double>(rawObject, "p75")
      val p90 = json.decodeRequired<Double>(rawObject, "p90")
      val p99 = json.decodeRequired<Double>(rawObject, "p99")
      return InlinePublicEndpointThroughputLast30mX8bef817b(
        p50 = p50,
        p75 = p75,
        p90 = p90,
        p99 = p99,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlinePublicEndpointThroughputLast30mX8bef817b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlinePublicEndpointThroughputLast30mX8bef817b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("p50", json.encodeToJsonElement(value.p50))
        put("p75", json.encodeToJsonElement(value.p75))
        put("p90", json.encodeToJsonElement(value.p90))
        put("p99", json.encodeToJsonElement(value.p99))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlinePublicEndpointThroughputLast30mX8bef817b(block: InlinePublicEndpointThroughputLast30mX8bef817b.Builder.() -> Unit): InlinePublicEndpointThroughputLast30mX8bef817b = InlinePublicEndpointThroughputLast30mX8bef817b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlinePublicEndpointThroughputLast30mX8bef817b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
