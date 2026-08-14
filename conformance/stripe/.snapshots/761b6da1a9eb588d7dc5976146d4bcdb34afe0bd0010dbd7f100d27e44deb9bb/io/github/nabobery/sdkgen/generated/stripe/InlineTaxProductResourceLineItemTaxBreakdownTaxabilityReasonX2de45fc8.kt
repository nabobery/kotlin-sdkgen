package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The reasoning behind this tax, for example, if the product is tax exempt. The possible values for this field may be
 * extended as new tax rules are supported.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_line_item_tax_breakdown/properties/taxability_r
 * eason
 */
@Serializable(with = InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8.Serializer::class)
public sealed class InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `customer_exempt`.
   */
  public data object CustomerExempt : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "customer_exempt"
  }

  /**
   * Documented value. Wire value: `not_collecting`.
   */
  public data object NotCollecting : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "not_collecting"
  }

  /**
   * Documented value. Wire value: `not_subject_to_tax`.
   */
  public data object NotSubjectToTax : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "not_subject_to_tax"
  }

  /**
   * Documented value. Wire value: `not_supported`.
   */
  public data object NotSupported : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "not_supported"
  }

  /**
   * Documented value. Wire value: `portion_product_exempt`.
   */
  public data object PortionProductExempt : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "portion_product_exempt"
  }

  /**
   * Documented value. Wire value: `portion_reduced_rated`.
   */
  public data object PortionReducedRated : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "portion_reduced_rated"
  }

  /**
   * Documented value. Wire value: `portion_standard_rated`.
   */
  public data object PortionStandardRated : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "portion_standard_rated"
  }

  /**
   * Documented value. Wire value: `product_exempt`.
   */
  public data object ProductExempt : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "product_exempt"
  }

  /**
   * Documented value. Wire value: `product_exempt_holiday`.
   */
  public data object ProductExemptHoliday : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "product_exempt_holiday"
  }

  /**
   * Documented value. Wire value: `proportionally_rated`.
   */
  public data object ProportionallyRated : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "proportionally_rated"
  }

  /**
   * Documented value. Wire value: `reduced_rated`.
   */
  public data object ReducedRated : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "reduced_rated"
  }

  /**
   * Documented value. Wire value: `reverse_charge`.
   */
  public data object ReverseCharge : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "reverse_charge"
  }

  /**
   * Documented value. Wire value: `standard_rated`.
   */
  public data object StandardRated : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "standard_rated"
  }

  /**
   * Documented value. Wire value: `taxable_basis_reduced`.
   */
  public data object TaxableBasisReduced : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "taxable_basis_reduced"
  }

  /**
   * Documented value. Wire value: `zero_rated`.
   */
  public data object ZeroRated : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8() {
    public override val `value`: String = "zero_rated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8()

  public companion object {
    public fun fromValue(`value`: String): InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8 = when (value) {
      CustomerExempt.value -> CustomerExempt
      NotCollecting.value -> NotCollecting
      NotSubjectToTax.value -> NotSubjectToTax
      NotSupported.value -> NotSupported
      PortionProductExempt.value -> PortionProductExempt
      PortionReducedRated.value -> PortionReducedRated
      PortionStandardRated.value -> PortionStandardRated
      ProductExempt.value -> ProductExempt
      ProductExemptHoliday.value -> ProductExemptHoliday
      ProportionallyRated.value -> ProportionallyRated
      ReducedRated.value -> ReducedRated
      ReverseCharge.value -> ReverseCharge
      StandardRated.value -> StandardRated
      TaxableBasisReduced.value -> TaxableBasisReduced
      ZeroRated.value -> ZeroRated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineTaxProductResourceLineItemTaxBreakdownTaxabilityReasonX2de45fc8) {
      encoder.encodeString(value.value)
    }
  }
}
