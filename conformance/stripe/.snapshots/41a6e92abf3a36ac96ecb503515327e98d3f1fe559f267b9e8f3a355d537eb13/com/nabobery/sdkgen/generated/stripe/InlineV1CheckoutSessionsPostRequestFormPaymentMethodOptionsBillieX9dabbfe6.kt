package com.nabobery.sdkgen.generated.stripe

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
 * ded/schema/properties/payment_method_options/properties/billie.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/billie
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6(
  public val captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX0ab909fd? = null,
) {
  public class Builder {
    public var captureMethod: InlineV1CheckoutSessionsPostRequestFormCaptureMethodX0ab909fd? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6(
      captureMethod = captureMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6(
        captureMethod = rawObject["capture_method"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCaptureMethodX0ab909fd>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsBillieX9dabbfe6.build(block)
