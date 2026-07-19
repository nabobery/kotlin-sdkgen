package com.nabobery.sdkgen.generated

import kotlin.Double
import kotlin.Unit
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

@Serializable
public data class PercentileLatencyCutoffsView(
  public val p50: Double? = null,
  public val p75: Double? = null,
  public val p90: Double? = null,
  public val p99: Double? = null,
)

/**
 * Percentile-based latency cutoffs. All specified cutoffs must be met for an endpoint to be preferred.
 */
@Serializable(with = PercentileLatencyCutoffs.Serializer::class)
public class PercentileLatencyCutoffs(
  /**
   * Maximum p50 latency (seconds)
   */
  public val p50: Double? = null,
  /**
   * Maximum p75 latency (seconds)
   */
  public val p75: Double? = null,
  /**
   * Maximum p90 latency (seconds)
   */
  public val p90: Double? = null,
  /**
   * Maximum p99 latency (seconds)
   */
  public val p99: Double? = null,
) {
  public class Builder {
    /**
     * Maximum p50 latency (seconds)
     */
    public var p50: Double? = null

    /**
     * Maximum p75 latency (seconds)
     */
    public var p75: Double? = null

    /**
     * Maximum p90 latency (seconds)
     */
    public var p90: Double? = null

    /**
     * Maximum p99 latency (seconds)
     */
    public var p99: Double? = null

    public fun build(): PercentileLatencyCutoffs = PercentileLatencyCutoffs(
      p50 = p50,
      p75 = p75,
      p90 = p90,
      p99 = p99,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PercentileLatencyCutoffs = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PercentileLatencyCutoffs> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PercentileLatencyCutoffs {
      val jsonDecoder = decoder.requireJsonDecoder("PercentileLatencyCutoffs")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("PercentileLatencyCutoffs must be a JSON object")
      return PercentileLatencyCutoffs(
        p50 = raw["p50"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        p75 = raw["p75"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        p90 = raw["p90"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
        p99 = raw["p99"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<Double?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PercentileLatencyCutoffs) {
      val jsonEncoder = encoder.requireJsonEncoder("PercentileLatencyCutoffs")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.p50?.let { put("p50", json.encodeToJsonElement(it)) }
        value.p75?.let { put("p75", json.encodeToJsonElement(it)) }
        value.p90?.let { put("p90", json.encodeToJsonElement(it)) }
        value.p99?.let { put("p99", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun percentileLatencyCutoffs(block: PercentileLatencyCutoffs.Builder.() -> Unit): PercentileLatencyCutoffs =
  PercentileLatencyCutoffs.build(block)
