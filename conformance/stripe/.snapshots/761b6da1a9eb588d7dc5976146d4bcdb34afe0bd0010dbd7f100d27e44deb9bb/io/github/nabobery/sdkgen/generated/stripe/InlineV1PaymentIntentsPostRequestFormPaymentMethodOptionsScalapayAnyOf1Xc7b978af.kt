package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/scalapay/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/scalapay/anyOf/0
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af(
  public val captureMethod:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodX9f79a32c? = null,
) {
  public class Builder {
    public var captureMethod:
        InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodX9f79a32c? = null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af(
      captureMethod = captureMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsCaptureMethodX9f79a32c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsScalapayAnyOf1Xc7b978af.build(block)
