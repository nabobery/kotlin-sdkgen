package io.github.nabobery.sdkgen.github.generated

import kotlin.Double
import kotlin.Unit
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
 * The EPSS scores as calculated by the [Exploit Prediction Scoring System](https://www.first.org/epss).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/security-advisory-epss
 */
@Serializable(with = SecurityAdvisoryEpss.Serializer::class)
public class SecurityAdvisoryEpss(
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val percentage: Double? = null,
  /**
   * Represented as IEEE-754 `Double`; values may lose decimal precision.
   */
  public val percentile: Double? = null,
) {
  public class Builder {
    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var percentage: Double? = null

    /**
     * Represented as IEEE-754 `Double`; values may lose decimal precision.
     */
    public var percentile: Double? = null

    public fun build(): SecurityAdvisoryEpss = SecurityAdvisoryEpss(
      percentage = percentage,
      percentile = percentile,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecurityAdvisoryEpss = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SecurityAdvisoryEpss> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecurityAdvisoryEpss {
      val jsonDecoder = decoder.requireJsonDecoder("SecurityAdvisoryEpss")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecurityAdvisoryEpss must be a JSON object")
      return SecurityAdvisoryEpss(
        percentage = rawObject["percentage"]?.let { json.decodeFromJsonElement<Double>(it) },
        percentile = rawObject["percentile"]?.let { json.decodeFromJsonElement<Double>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecurityAdvisoryEpss) {
      val jsonEncoder = encoder.requireJsonEncoder("SecurityAdvisoryEpss")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.percentage?.let { put("percentage", json.encodeToJsonElement(it)) }
        value.percentile?.let { put("percentile", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun securityAdvisoryEpss(block: SecurityAdvisoryEpss.Builder.() -> Unit): SecurityAdvisoryEpss = SecurityAdvisoryEpss.build(block)
