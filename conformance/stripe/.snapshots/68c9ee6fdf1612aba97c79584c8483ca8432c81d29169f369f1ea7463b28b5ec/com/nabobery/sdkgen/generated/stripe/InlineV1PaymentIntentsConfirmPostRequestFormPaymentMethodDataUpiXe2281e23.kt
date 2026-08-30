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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/upi.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/upi
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23(
  public val mandateOptions:
      InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX929069d0? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX929069d0?
        = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX929069d0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataUpiXe2281e23.build(block)
