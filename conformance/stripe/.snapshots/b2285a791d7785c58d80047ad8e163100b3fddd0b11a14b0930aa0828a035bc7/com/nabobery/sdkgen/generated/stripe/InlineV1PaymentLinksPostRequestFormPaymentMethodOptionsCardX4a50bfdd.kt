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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd(
  public val restrictions:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04? = null,
) {
  public class Builder {
    public var restrictions:
        InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd(
      restrictions = restrictions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd(
        restrictions = rawObject["restrictions"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.restrictions?.let { put("restrictions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd(block: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardX4a50bfdd.build(block)
