package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/fixed_amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/shipping_options/items/properties/shipping_rate_data/properties/fixed_amount
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741(
  public val amount: Int,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  currencyOptions: Map<String, InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0>? = null,
) {
  public val currencyOptions:
      Map<String, InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0>? =
      currencyOptions?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var currencyValue: String? = null

    public var currency: String
      get() = requireNotNull(currencyValue) { "currency is required" }
      set(`value`) {
        currencyValue = value
      }

    private var currencyOptionsValue:
        Map<String, InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0>?
        = null

    public var currencyOptions:
        Map<String, InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0>?
      get() = currencyOptionsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        currencyOptionsValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741 {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741(
        amount = amount,
        currency = currency,
        currencyOptions = currencyOptions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741(
        amount = amount,
        currency = currency,
        currencyOptions = rawObject["currency_options"]?.let { json.decodeFromJsonElement<Map<String, InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX3d05d8d0>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("currency", value.currency)
        value.currencyOptions?.let { put("currency_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741(block: InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741 = InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsItemFixedAmountX4b990741 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
