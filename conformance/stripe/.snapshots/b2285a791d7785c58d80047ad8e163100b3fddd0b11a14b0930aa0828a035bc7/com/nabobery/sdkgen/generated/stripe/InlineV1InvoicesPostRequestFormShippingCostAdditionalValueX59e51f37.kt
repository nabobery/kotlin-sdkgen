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
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data/properties/fixed_amount/properties/currency_options/additiona
 * lProperties.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/shipping_cost/properties/shipping_rate_data/properties/fixed_amount/properties/currency_options/additiona
 * lProperties
 */
@Serializable(with = InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37.Serializer::class)
public class InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37(
  public val amount: Int,
  public val taxBehavior:
      InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTaxBehaviorXd38659b5? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    public var taxBehavior:
        InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTaxBehaviorXd38659b5? = null

    public fun build(): InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37 {
      check(amountValue != null) { "amount is required" }
      return InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37(
        amount = amount,
        taxBehavior = taxBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37 must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      return InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37(
        amount = amount,
        taxBehavior = rawObject["tax_behavior"]?.let { json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormShippingCostShippingRateDataTaxBehaviorXd38659b5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        value.taxBehavior?.let { put("tax_behavior", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37(block: InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37.Builder.() -> Unit): InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37 = InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1InvoicesPostRequestFormShippingCostAdditionalValueX59e51f37 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
