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
 * urlencoded/schema/properties/payment_method_options/properties/bacs_debit/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/bacs_debit/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a(
  public val referencePrefix: InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2? = null,
) {
  public class Builder {
    public var referencePrefix: InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormReferencePrefixXfb449ab2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsX9940385a.build(block)
