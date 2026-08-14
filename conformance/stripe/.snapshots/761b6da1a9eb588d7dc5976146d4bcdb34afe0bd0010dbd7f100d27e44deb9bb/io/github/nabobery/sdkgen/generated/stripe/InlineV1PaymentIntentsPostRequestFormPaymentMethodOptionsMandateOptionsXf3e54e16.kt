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
 * urlencoded/schema/properties/payment_method_options/properties/sepa_debit/anyOf/0/properties/mandate_options.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/sepa_debit/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16(
  public val referencePrefix: InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a? = null,
) {
  public class Builder {
    public var referencePrefix: InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a? =
        null

    public fun build(): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16 must be a JSON object")
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormReferencePrefixXce68483a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16(block: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16.Builder.() -> Unit): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16 = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsMandateOptionsXf3e54e16.build(block)
