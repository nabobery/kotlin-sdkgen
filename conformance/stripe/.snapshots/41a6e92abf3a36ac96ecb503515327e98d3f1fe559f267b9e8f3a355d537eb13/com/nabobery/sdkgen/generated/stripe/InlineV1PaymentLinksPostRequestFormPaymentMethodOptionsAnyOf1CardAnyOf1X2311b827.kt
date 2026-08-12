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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions/anyOf
 * /0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/payment_method_options/anyOf/0/properties/card/anyOf/0/properties/restrictions/anyOf
 * /0
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827(
  public val brandsBlocked:
      InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08? = null,
) {
  public class Builder {
    public var brandsBlocked:
        InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827 = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827(
      brandsBlocked = brandsBlocked,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827(
        brandsBlocked = rawObject["brands_blocked"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsBrandsBlockedX7e4f2e08>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.brandsBlocked?.let { put("brands_blocked", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827(block: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827 = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsAnyOf1CardAnyOf1X2311b827.build(block)
