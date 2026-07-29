package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
import kotlinx.serialization.json.put

/**
 * Options to configure Radar. See [Radar Session](https://docs.stripe.com/radar/radar-session) for more information.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar_radar_options
 */
@Serializable(with = RadarRadarOptions.Serializer::class)
public class RadarRadarOptions(
  /**
   * A [Radar Session](https://docs.stripe.com/radar/radar-session) is a snapshot of the browser metadata and device
   * details that help Radar make more accurate predictions on your payments.
   */
  public val session: String? = null,
) {
  public class Builder {
    /**
     * A [Radar Session](https://docs.stripe.com/radar/radar-session) is a snapshot of the browser metadata and device
     * details that help Radar make more accurate predictions on your payments.
     */
    public var session: String? = null

    public fun build(): RadarRadarOptions = RadarRadarOptions(
      session = session,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RadarRadarOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<RadarRadarOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RadarRadarOptions {
      val jsonDecoder = decoder.requireJsonDecoder("RadarRadarOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RadarRadarOptions must be a JSON object")
      return RadarRadarOptions(
        session = rawObject["session"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RadarRadarOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("RadarRadarOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.session?.let { put("session", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun radarRadarOptions(block: RadarRadarOptions.Builder.() -> Unit): RadarRadarOptions = RadarRadarOptions.build(block)
