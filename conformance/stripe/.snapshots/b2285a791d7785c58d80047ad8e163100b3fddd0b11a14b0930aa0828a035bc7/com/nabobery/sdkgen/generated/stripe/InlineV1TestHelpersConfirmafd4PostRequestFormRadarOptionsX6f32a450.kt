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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/radar_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/radar_options
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450(
  public val session: String? = null,
) {
  public class Builder {
    public var session: String? = null

    public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450 = InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450(
      session = session,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450 must be a JSON object")
      return InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450(
        session = rawObject["session"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.session?.let { put("session", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450(block: InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450.Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450 = InlineV1TestHelpersConfirmafd4PostRequestFormRadarOptionsX6f32a450.build(block)
