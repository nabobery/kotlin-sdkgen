package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlin.collections.List
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
 * chema/properties/payment_method_options/properties/card/properties/restrictions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/card/properties/restrictions
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04(
  brandsBlocked: List<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3>? = null,
) {
  public val brandsBlocked:
      List<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3>? =
      brandsBlocked?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var brandsBlockedValue:
        List<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3>? = null

    public var brandsBlocked:
        List<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3>?
      get() = brandsBlockedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        brandsBlockedValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04 = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04(
      brandsBlocked = brandsBlocked,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04(
        brandsBlocked = rawObject["brands_blocked"]?.let { json.decodeFromJsonElement<List<InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardItemXf1350cc3>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.brandsBlocked?.let { put("brands_blocked", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04(block: InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04 = InlineV1PaymentLinksPostRequestFormPaymentMethodOptionsCardRestrictionsXee8b6d04.build(block)
