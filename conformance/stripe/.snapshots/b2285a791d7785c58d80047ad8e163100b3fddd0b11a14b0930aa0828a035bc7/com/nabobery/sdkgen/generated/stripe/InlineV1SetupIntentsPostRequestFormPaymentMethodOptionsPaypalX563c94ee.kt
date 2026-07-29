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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/paypal.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/paypal
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee(
  public val billingAgreementId: String? = null,
) {
  public class Builder {
    public var billingAgreementId: String? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee(
      billingAgreementId = billingAgreementId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee(
        billingAgreementId = rawObject["billing_agreement_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.billingAgreementId?.let { put("billing_agreement_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaypalX563c94ee.build(block)
