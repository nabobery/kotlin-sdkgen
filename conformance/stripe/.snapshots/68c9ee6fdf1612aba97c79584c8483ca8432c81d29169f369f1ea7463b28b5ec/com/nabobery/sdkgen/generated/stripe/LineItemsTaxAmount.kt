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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/line_items_tax_amount
 */
@Serializable(with = LineItemsTaxAmount.Serializer::class)
public class LineItemsTaxAmount(
  /**
   * Amount of tax applied for this rate.
   */
  public val amount: Int,
  public val rate: TaxRate,
  /**
   * The reasoning behind this tax, for example, if the product is tax exempt. The possible values for this field may be
   * extended as new tax rules are supported.
   */
  public val taxabilityReason: InlineLineItemsTaxAmountTaxabilityReasonX796c6e30? = null,
  /**
   * The amount on which tax is calculated, in cents (or local equivalent).
   */
  public val taxableAmount: Int? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var rateValue: TaxRate? = null

    public var rate: TaxRate
      get() = requireNotNull(rateValue) { "rate is required" }
      set(`value`) {
        rateValue = value
      }

    /**
     * The reasoning behind this tax, for example, if the product is tax exempt. The possible values for this field may
     * be extended as new tax rules are supported.
     */
    public var taxabilityReason: InlineLineItemsTaxAmountTaxabilityReasonX796c6e30? = null

    /**
     * The amount on which tax is calculated, in cents (or local equivalent).
     */
    public var taxableAmount: Int? = null

    public fun build(): LineItemsTaxAmount {
      check(amountValue != null) { "amount is required" }
      check(rateValue != null) { "rate is required" }
      return LineItemsTaxAmount(
        amount = amount,
        rate = rate,
        taxabilityReason = taxabilityReason,
        taxableAmount = taxableAmount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): LineItemsTaxAmount = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<LineItemsTaxAmount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): LineItemsTaxAmount {
      val jsonDecoder = decoder.requireJsonDecoder("LineItemsTaxAmount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("LineItemsTaxAmount must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val rate = json.decodeRequired<TaxRate>(rawObject, "rate")
      return LineItemsTaxAmount(
        amount = amount,
        rate = rate,
        taxabilityReason = rawObject["taxability_reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineLineItemsTaxAmountTaxabilityReasonX796c6e30?>(element) },
        taxableAmount = rawObject["taxable_amount"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: LineItemsTaxAmount) {
      val jsonEncoder = encoder.requireJsonEncoder("LineItemsTaxAmount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("rate", json.encodeToJsonElement(value.rate))
        value.taxabilityReason?.let { put("taxability_reason", json.encodeToJsonElement(it)) }
        value.taxableAmount?.let { put("taxable_amount", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun lineItemsTaxAmount(block: LineItemsTaxAmount.Builder.() -> Unit): LineItemsTaxAmount = LineItemsTaxAmount.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("LineItemsTaxAmount is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
