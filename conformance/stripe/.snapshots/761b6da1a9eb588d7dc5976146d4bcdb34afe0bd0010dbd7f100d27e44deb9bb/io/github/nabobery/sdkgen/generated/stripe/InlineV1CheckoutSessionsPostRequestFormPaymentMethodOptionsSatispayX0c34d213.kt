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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/satispay.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/satispay
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213(
  public val captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX7a8ca130? = null,
) {
  public class Builder {
    public var captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX7a8ca130? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213(
      captureMethod = captureMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCaptureMethodX7a8ca130>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsSatispayX0c34d213.build(block)
