package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_breakdown
 */
@Serializable(with = TaxProductResourceTaxBreakdown.Serializer::class)
public class TaxProductResourceTaxBreakdown(
  /**
   * The amount of tax, in the [smallest currency unit](https://docs.stripe.com/currencies#minor-units).
   */
  public val amount: Int,
  /**
   * Specifies whether the tax amount is included in the line item amount.
   */
  public val inclusive: Boolean,
  public val taxRateDetails: TaxProductResourceTaxRateDetails,
  /**
   * The reasoning behind this tax, for example, if the product is tax exempt. We might extend the possible values for
   * this field to support new tax rules.
   */
  public val taxabilityReason: InlineTaxProductResourceTaxBreakdownTaxabilityReasonXa4c62c9b,
  /**
   * The amount on which tax is calculated, in the [smallest currency
   * unit](https://docs.stripe.com/currencies#minor-units).
   */
  public val taxableAmount: Int,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var inclusiveValue: Boolean? = null

    public var inclusive: Boolean
      get() = requireNotNull(inclusiveValue) { "inclusive is required" }
      set(`value`) {
        inclusiveValue = value
      }

    private var taxRateDetailsValue: TaxProductResourceTaxRateDetails? = null

    public var taxRateDetails: TaxProductResourceTaxRateDetails
      get() = requireNotNull(taxRateDetailsValue) { "taxRateDetails is required" }
      set(`value`) {
        taxRateDetailsValue = value
      }

    private var taxabilityReasonValue:
        InlineTaxProductResourceTaxBreakdownTaxabilityReasonXa4c62c9b? = null

    public var taxabilityReason: InlineTaxProductResourceTaxBreakdownTaxabilityReasonXa4c62c9b
      get() = requireNotNull(taxabilityReasonValue) { "taxabilityReason is required" }
      set(`value`) {
        taxabilityReasonValue = value
      }

    private var taxableAmountValue: Int? = null

    public var taxableAmount: Int
      get() = requireNotNull(taxableAmountValue) { "taxableAmount is required" }
      set(`value`) {
        taxableAmountValue = value
      }

    public fun build(): TaxProductResourceTaxBreakdown {
      check(amountValue != null) { "amount is required" }
      check(inclusiveValue != null) { "inclusive is required" }
      check(taxRateDetailsValue != null) { "taxRateDetails is required" }
      check(taxabilityReasonValue != null) { "taxabilityReason is required" }
      check(taxableAmountValue != null) { "taxableAmount is required" }
      return TaxProductResourceTaxBreakdown(
        amount = amount,
        inclusive = inclusive,
        taxRateDetails = taxRateDetails,
        taxabilityReason = taxabilityReason,
        taxableAmount = taxableAmount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductResourceTaxBreakdown = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductResourceTaxBreakdown> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourceTaxBreakdown {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceTaxBreakdown")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourceTaxBreakdown must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val inclusive = json.decodeRequired<Boolean>(rawObject, "inclusive")
      val taxRateDetails = json.decodeRequired<TaxProductResourceTaxRateDetails>(rawObject, "tax_rate_details")
      val taxabilityReason = json.decodeRequired<InlineTaxProductResourceTaxBreakdownTaxabilityReasonXa4c62c9b>(rawObject, "taxability_reason")
      val taxableAmount = json.decodeRequired<Int>(rawObject, "taxable_amount")
      return TaxProductResourceTaxBreakdown(
        amount = amount,
        inclusive = inclusive,
        taxRateDetails = taxRateDetails,
        taxabilityReason = taxabilityReason,
        taxableAmount = taxableAmount,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourceTaxBreakdown) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceTaxBreakdown")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("inclusive", json.encodeToJsonElement(value.inclusive))
        put("tax_rate_details", json.encodeToJsonElement(value.taxRateDetails))
        put("taxability_reason", json.encodeToJsonElement(value.taxabilityReason))
        put("taxable_amount", json.encodeToJsonElement(value.taxableAmount))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourceTaxBreakdown(block: TaxProductResourceTaxBreakdown.Builder.() -> Unit): TaxProductResourceTaxBreakdown = TaxProductResourceTaxBreakdown.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductResourceTaxBreakdown is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
