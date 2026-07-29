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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/fixed_amount
 * .
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/shipping_options/anyOf/0/items/properties/shipping_rate_data/properties/fixed_amount
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c(
  public val amount: Int,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  currencyOptions: Map<String, InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX35179d02>? = null,
) {
  public val currencyOptions:
      Map<String, InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX35179d02>? =
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
        Map<String, InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX35179d02>?
        = null

    public var currencyOptions:
        Map<String, InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX35179d02>?
      get() = currencyOptionsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        currencyOptionsValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c(
        amount = amount,
        currency = currency,
        currencyOptions = currencyOptions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c(
        amount = amount,
        currency = currency,
        currencyOptions = rawObject["currency_options"]?.let { json.decodeFromJsonElement<Map<String, InlineV1CheckoutSessionsPostRequestFormShippingOptionsAdditionalValueX35179d02>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c")
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

public fun inlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c(block: InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c = InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormShippingOptionsAnyOf1FixedAmountX755af39c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
