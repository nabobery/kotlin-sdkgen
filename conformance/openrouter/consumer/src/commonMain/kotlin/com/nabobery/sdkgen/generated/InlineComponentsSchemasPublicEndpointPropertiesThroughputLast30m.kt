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
 */
@Serializable(with = InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m.Serializer::class)
public class InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m(
  /**
   * Median (50th percentile)
   */
  public val p50: Double,
  /**
   * 75th percentile
   */
  public val p75: Double,
  /**
   * 90th percentile
   */
  public val p90: Double,
  /**
   * 99th percentile
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

    public fun build(): InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m {
      check(p50Value != null) { "p50 is required" }
      check(p75Value != null) { "p75 is required" }
      check(p90Value != null) { "p90 is required" }
      check(p99Value != null) { "p99 is required" }
      return InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m(
        p50 = p50,
        p75 = p75,
        p90 = p90,
        p99 = p99,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m must be a JSON " +
          "object")
      val p50 = json.decodeRequired<Double>(raw, "p50")
      val p75 = json.decodeRequired<Double>(raw, "p75")
      val p90 = json.decodeRequired<Double>(raw, "p90")
      val p99 = json.decodeRequired<Double>(raw, "p99")
      return InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m(
        p50 = p50,
        p75 = p75,
        p90 = p90,
        p99 = p99,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m")
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

public fun inlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m(block: InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m.Builder.() -> Unit): InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m = InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasPublicEndpointPropertiesThroughputLast30m is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
