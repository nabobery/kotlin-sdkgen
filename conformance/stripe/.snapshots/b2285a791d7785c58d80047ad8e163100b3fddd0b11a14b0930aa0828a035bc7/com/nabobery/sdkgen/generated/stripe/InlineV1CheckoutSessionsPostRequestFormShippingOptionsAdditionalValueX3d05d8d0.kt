package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/fixed_amount/properties/currenc
 * y_options/additionalProperties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/fixed_amount/properties/currenc
 * y_options/additionalProperties
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0(
  public val amount: Int,
  public val taxBehavior:
      InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    public var taxBehavior:
        InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a? = null

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0 {
      check(amountValue != null) { "amount is required" }
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0(
        amount = amount,
        taxBehavior = taxBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0(
        amount = amount,
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemTaxBehaviorX7865557a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0(block: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0 = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
