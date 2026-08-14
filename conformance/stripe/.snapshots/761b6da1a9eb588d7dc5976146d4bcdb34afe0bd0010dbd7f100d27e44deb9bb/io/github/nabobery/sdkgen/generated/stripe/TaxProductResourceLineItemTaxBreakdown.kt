package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_line_item_tax_breakdown
 */
@Serializable(with = TaxProductResourceLineItemTaxBreakdown.Serializer::class)
public class TaxProductResourceLineItemTaxBreakdown(
  /**
   * The amount of tax, in the [smallest currency unit](https://docs.stripe.com/currencies#minor-units).
   */
  public val amount: Int,
  public val jurisdiction: TaxProductResourceJurisdiction,
  /**
   * Indicates whether the jurisdiction was determined by the origin (merchant's address) or destination (customer's
   * address).
   */
  public val sourcing: InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456,
  /**
   * The reasoning behind this tax, for example, if the product is tax exempt. The possible values for this field may be
   * extended as new tax rules are supported.
   */
  public val taxabilityReason:
      InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8,
  /**
   * The amount on which tax is calculated, in the [smallest currency
   * unit](https://docs.stripe.com/currencies#minor-units).
   */
  public val taxableAmount: Int,
  /**
   * Details regarding the rate for this tax. This field will be `null` when the tax is not imposed, for example if the
   * product is exempt from tax.
   */
  public val taxRateDetails:
      InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130? = null,
) {
  public class Builder {
    private var amountValue: Int? = null

    public var amount: Int
      get() = requireNotNull(amountValue) { "amount is required" }
      set(`value`) {
        amountValue = value
      }

    private var jurisdictionValue: TaxProductResourceJurisdiction? = null

    public var jurisdiction: TaxProductResourceJurisdiction
      get() = requireNotNull(jurisdictionValue) { "jurisdiction is required" }
      set(`value`) {
        jurisdictionValue = value
      }

    private var sourcingValue: InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456? = null

    public var sourcing: InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456
      get() = requireNotNull(sourcingValue) { "sourcing is required" }
      set(`value`) {
        sourcingValue = value
      }

    private var taxabilityReasonValue:
        InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8? = null

    public var taxabilityReason:
        InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8
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

    /**
     * Details regarding the rate for this tax. This field will be `null` when the tax is not imposed, for example if
     * the product is exempt from tax.
     */
    public var taxRateDetails: InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130?
        = null

    public fun build(): TaxProductResourceLineItemTaxBreakdown {
      check(amountValue != null) { "amount is required" }
      check(jurisdictionValue != null) { "jurisdiction is required" }
      check(sourcingValue != null) { "sourcing is required" }
      check(taxabilityReasonValue != null) { "taxabilityReason is required" }
      check(taxableAmountValue != null) { "taxableAmount is required" }
      return TaxProductResourceLineItemTaxBreakdown(
        amount = amount,
        jurisdiction = jurisdiction,
        sourcing = sourcing,
        taxabilityReason = taxabilityReason,
        taxableAmount = taxableAmount,
        taxRateDetails = taxRateDetails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductResourceLineItemTaxBreakdown = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductResourceLineItemTaxBreakdown> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourceLineItemTaxBreakdown {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceLineItemTaxBreakdown")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourceLineItemTaxBreakdown must be a JSON object")
      val amount = json.decodeRequired<Int>(rawObject, "amount")
      val jurisdiction = json.decodeRequired<TaxProductResourceJurisdiction>(rawObject, "jurisdiction")
      val sourcing = json.decodeRequired<InlineTaxProductResourceLineItemTaxBreakdownSourcingX2d203456>(rawObject, "sourcing")
      val taxabilityReason = json.decodeRequired<InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8>(rawObject, "taxability_reason")
      val taxableAmount = json.decodeRequired<Int>(rawObject, "taxable_amount")
      return TaxProductResourceLineItemTaxBreakdown(
        amount = amount,
        jurisdiction = jurisdiction,
        sourcing = sourcing,
        taxabilityReason = taxabilityReason,
        taxableAmount = taxableAmount,
        taxRateDetails = rawObject["tax_rate_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineTaxProductResourceLineItemTaxBreakdownTaxRateDetailsXff548130?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourceLineItemTaxBreakdown) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceLineItemTaxBreakdown")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("amount", json.encodeToJsonElement(value.amount))
        put("jurisdiction", json.encodeToJsonElement(value.jurisdiction))
        put("sourcing", json.encodeToJsonElement(value.sourcing))
        put("taxability_reason", json.encodeToJsonElement(value.taxabilityReason))
        put("taxable_amount", json.encodeToJsonElement(value.taxableAmount))
        value.taxRateDetails?.let { put("tax_rate_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourceLineItemTaxBreakdown(block: TaxProductResourceLineItemTaxBreakdown.Builder.() -> Unit): TaxProductResourceLineItemTaxBreakdown = TaxProductResourceLineItemTaxBreakdown.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductResourceLineItemTaxBreakdown is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
