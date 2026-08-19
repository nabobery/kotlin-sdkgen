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
public data class PercentileThroughputCutoffsView(
  public val p50: Double? = null,
  public val p75: Double? = null,
  public val p90: Double? = null,
  public val p99: Double? = null,
)

/**
 * Percentile-based throughput cutoffs. All specified cutoffs must be met for an endpoint to be preferred.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/PercentileThroughputCutoffs
 */
@Serializable(with = PercentileThroughputCutoffs.Serializer::class)
public class PercentileThroughputCutoffs(
  /**
   * Minimum p50 throughput (tokens/sec)
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val p50: Double? = null,
  /**
   * Minimum p75 throughput (tokens/sec)
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val p75: Double? = null,
  /**
   * Minimum p90 throughput (tokens/sec)
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val p90: Double? = null,
  /**
   * Minimum p99 throughput (tokens/sec)
   *
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val p99: Double? = null,
) {
  public class Builder {
    /**
     * Minimum p50 throughput (tokens/sec)
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var p50: Double? = null

    /**
     * Minimum p75 throughput (tokens/sec)
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var p75: Double? = null

    /**
     * Minimum p90 throughput (tokens/sec)
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var p90: Double? = null

    /**
     * Minimum p99 throughput (tokens/sec)
     *
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var p99: Double? = null

    public fun build(): PercentileThroughputCutoffs = PercentileThroughputCutoffs(
      p50 = p50,
      p75 = p75,
      p90 = p90,
      p99 = p99,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PercentileThroughputCutoffs = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PercentileThroughputCutoffs> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PercentileThroughputCutoffs {
      val jsonDecoder = decoder.requireJsonDecoder("PercentileThroughputCutoffs")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PercentileThroughputCutoffs must be a JSON object")
      return PercentileThroughputCutoffs(
        p50 = rawObject["p50"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        p75 = rawObject["p75"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        p90 = rawObject["p90"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
        p99 = rawObject["p99"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Double?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PercentileThroughputCutoffs) {
      val jsonEncoder = encoder.requireJsonEncoder("PercentileThroughputCutoffs")
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

public fun percentileThroughputCutoffs(block: PercentileThroughputCutoffs.Builder.() -> Unit): PercentileThroughputCutoffs = PercentileThroughputCutoffs.build(block)
