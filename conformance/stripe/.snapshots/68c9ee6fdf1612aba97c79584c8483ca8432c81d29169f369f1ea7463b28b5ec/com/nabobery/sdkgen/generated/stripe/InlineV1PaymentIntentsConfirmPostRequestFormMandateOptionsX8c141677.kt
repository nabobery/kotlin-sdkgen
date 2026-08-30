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
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sepa_debit/anyOf/0/properties/mandate_options
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sepa_debit/anyOf/0/properties/mandate_options
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677(
  public val referencePrefix:
      InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31? = null,
) {
  public class Builder {
    public var referencePrefix:
        InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31? = null

    public fun build(): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677 = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677(
      referencePrefix = referencePrefix,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677 must be a JSON object")
      return InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677(
        referencePrefix = rawObject["reference_prefix"]?.let { json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.referencePrefix?.let { put("reference_prefix", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677(block: InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677.Builder.() -> Unit): InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677 = InlineV1PaymentIntentsConfirmPostRequestFormMandateOptionsX8c141677.build(block)
