package io.github.nabobery.sdkgen.generated.stripe

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
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/radar_options
 */
@Serializable(with = InlineV1ChargesPostRequestFormRadarOptionsX5235d18d.Serializer::class)
public class InlineV1ChargesPostRequestFormRadarOptionsX5235d18d(
  public val session: String? = null,
) {
  public class Builder {
    public var session: String? = null

    public fun build(): InlineV1ChargesPostRequestFormRadarOptionsX5235d18d = InlineV1ChargesPostRequestFormRadarOptionsX5235d18d(
      session = session,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesPostRequestFormRadarOptionsX5235d18d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesPostRequestFormRadarOptionsX5235d18d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormRadarOptionsX5235d18d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormRadarOptionsX5235d18d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesPostRequestFormRadarOptionsX5235d18d must be a JSON object")
      return InlineV1ChargesPostRequestFormRadarOptionsX5235d18d(
        session = rawObject["session"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesPostRequestFormRadarOptionsX5235d18d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormRadarOptionsX5235d18d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.session?.let { put("session", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesPostRequestFormRadarOptionsX5235d18d(block: InlineV1ChargesPostRequestFormRadarOptionsX5235d18d.Builder.() -> Unit): InlineV1ChargesPostRequestFormRadarOptionsX5235d18d = InlineV1ChargesPostRequestFormRadarOptionsX5235d18d.build(block)
