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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/sepa_debit/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/sepa_debit/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7(
  public val referencePrefix: InlineV1PaymentIntentsPostRequestFormReferencePrefixXa510bc09? = null,
) {
  public class Builder {
    public var referencePrefix: InlineV1PaymentIntentsPostRequestFormReferencePrefixXa510bc09? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormReferencePrefixXa510bc09>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX94b792b7.build(block)
