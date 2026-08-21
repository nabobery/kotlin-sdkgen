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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/card/properties/restrictions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/card/properties/restrictions
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548(
  brandsBlocked: List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardItemX3929be81>? = null,
) {
  public val brandsBlocked:
      List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardItemX3929be81>? =
      brandsBlocked?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var brandsBlockedValue:
        List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardItemX3929be81>? = null

    public var brandsBlocked:
        List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardItemX3929be81>?
      get() = brandsBlockedValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        brandsBlockedValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548(
      brandsBlocked = brandsBlocked,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548 must be a JSON object")
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548(
        brandsBlocked = rawObject["brands_blocked"]?.let { json.decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsCardItemX3929be81>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.brandsBlocked?.let { put("brands_blocked", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548(block: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548 = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsRestrictionsXa728c548.build(block)
