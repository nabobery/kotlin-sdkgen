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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/radar_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/radar_options
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe(
  public val session: String? = null,
) {
  public class Builder {
    public var session: String? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe = InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe(
      session = session,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe(
        session = rawObject["session"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.session?.let { put("session", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe(block: InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe = InlineV1PaymentIntentsConfirmPostRequestFormRadarOptionsX9a7ca3fe.build(block)
