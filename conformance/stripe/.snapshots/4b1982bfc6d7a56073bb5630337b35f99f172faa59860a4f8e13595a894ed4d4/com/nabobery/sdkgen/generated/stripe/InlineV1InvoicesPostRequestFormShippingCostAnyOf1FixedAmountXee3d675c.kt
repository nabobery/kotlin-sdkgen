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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/fixed_amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/shipping_cost/anyOf/0/properties/shipping_rate_data/properties/fixed_amount
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c(
  public val amount: Int,
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String,
  currencyOptions: Map<String, InlineV1InvoicesPostRequestFormShippingCostAnyOf1AdditionalValueXf2996672>? = null,
) {
  public val currencyOptions:
      Map<String, InlineV1InvoicesPostRequestFormShippingCostAnyOf1AdditionalValueXf2996672>? =
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
        Map<String, InlineV1InvoicesPostRequestFormShippingCostAnyOf1AdditionalValueXf2996672>? =
        null

    public var currencyOptions:
        Map<String, InlineV1InvoicesPostRequestFormShippingCostAnyOf1AdditionalValueXf2996672>?
      get() = currencyOptionsValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        currencyOptionsValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c {
      check(amountValue != null) { "amount is required" }
      check(currencyValue != null) { "currency is required" }
      return InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c(
        amount = amount,
        currency = currency,
        currencyOptions = currencyOptions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val currency = json.decodeRequired<String>(rawObject, "currency")
      return InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c(
        amount = amount,
        currency = currency,
        currencyOptions = rawObject["currency_options"]?.let { json.decodeFromJsonElement<Map<String, InlineV1InvoicesPostRequestFormShippingCostAnyOf1AdditionalValueXf2996672>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c")
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

public fun inlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c(block: InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c.Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c = InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingCostAnyOf1FixedAmountXee3d675c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
