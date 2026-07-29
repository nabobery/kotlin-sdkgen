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
 * The shipping cost to reverse.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1transactions~1create_reversal/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/shipping_cost
 */
@Serializable(with = InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f.Serializer::class)
public class InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f(
  public val amount: Int,
  public val amountTax: Int,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var amountTaxValue: Int? = null

    public var amountTax: Int
      get() = requireNotNull(amountTaxValue) { "amountTax is required" }
      set(`value`) {
        amountTaxValue = value
      }

    public fun build(): InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f {
      check(amountValue != null) { "amount is required" }
      check(amountTaxValue != null) { "amountTax is required" }
      return InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f(
        amount = amount,
        amountTax = amountTax,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val amountTax = json.decodeRequired<Int>(rawObject, "amount_tax")
      return InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f(
        amount = amount,
        amountTax = amountTax,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("amount_tax", json.encodeToJsonElement(value.amountTax))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f(block: InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f.Builder.() -> Unit): InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f = InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TaxTransactionsCreateReversalPostRequestFormShippingCostXf7eccb3f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
