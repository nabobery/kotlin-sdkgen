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
 * www-form-urlencoded/schema/properties/payment_method_data/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/klarna
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3(
  public val dob:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaDobX543be637? = null,
) {
  public class Builder {
    public var dob: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaDobX543be637?
        = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3(
      dob = dob,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3(
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaDobX543be637>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3(block: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3 = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataKlarnaX8d1d10d3.build(block)
