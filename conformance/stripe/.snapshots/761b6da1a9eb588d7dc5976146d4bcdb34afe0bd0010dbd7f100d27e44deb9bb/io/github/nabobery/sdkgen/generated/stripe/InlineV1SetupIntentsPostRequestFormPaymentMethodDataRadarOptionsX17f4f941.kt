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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/radar_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_data/properties/radar_options
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941(
  public val session: String? = null,
) {
  public class Builder {
    public var session: String? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941(
      session = session,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941 must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941(
        session = rawObject["session"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.session?.let { put("session", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941(block: InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941 = InlineV1SetupIntentsPostRequestFormPaymentMethodDataRadarOptionsX17f4f941.build(block)
