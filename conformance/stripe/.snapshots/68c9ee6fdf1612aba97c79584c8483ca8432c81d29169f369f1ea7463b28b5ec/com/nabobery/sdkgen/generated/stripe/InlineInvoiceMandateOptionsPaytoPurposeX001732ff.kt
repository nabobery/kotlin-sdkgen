package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The purpose for which payments are made. Has a default value based on your merchant category code.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice_mandate_options_payto/properties/purpose
 */
@Serializable(with = InlineInvoiceMandateOptionsPaytoPurposeX001732ff.Serializer::class)
public sealed class InlineInvoiceMandateOptionsPaytoPurposeX001732ff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dependant_support`.
   */
  public data object DependantSupport : InlineInvoiceMandateOptionsPaytoPurposeX001732ff() {
    public override val `value`: String = "dependant_support"
  }

  /**
   * Documented value. Wire value: `government`.
   */
  public data object Government : InlineInvoiceMandateOptionsPaytoPurposeX001732ff() {
    public override val `value`: String = "government"
  }

  /**
   * Documented value. Wire value: `loan`.
   */
  public data object Loan : InlineInvoiceMandateOptionsPaytoPurposeX001732ff() {
    public override val `value`: String = "loan"
  }

  /**
   * Documented value. Wire value: `mortgage`.
   */
  public data object Mortgage : InlineInvoiceMandateOptionsPaytoPurposeX001732ff() {
    public override val `value`: String = "mortgage"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineInvoiceMandateOptionsPaytoPurposeX001732ff() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `pension`.
   */
  public data object Pension : InlineInvoiceMandateOptionsPaytoPurposeX001732ff() {
    public override val `value`: String = "pension"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineInvoiceMandateOptionsPaytoPurposeX001732ff() {
    public override val `value`: String = "personal"
  }

  /**
   * Documented value. Wire value: `retail`.
   */
  public data object Retail : InlineInvoiceMandateOptionsPaytoPurposeX001732ff() {
    public override val `value`: String = "retail"
  }

  /**
   * Documented value. Wire value: `salary`.
   */
  public data object Salary : InlineInvoiceMandateOptionsPaytoPurposeX001732ff() {
    public override val `value`: String = "salary"
  }

  /**
   * Documented value. Wire value: `tax`.
   */
  public data object Tax : InlineInvoiceMandateOptionsPaytoPurposeX001732ff() {
    public override val `value`: String = "tax"
  }

  /**
   * Documented value. Wire value: `utility`.
   */
  public data object Utility : InlineInvoiceMandateOptionsPaytoPurposeX001732ff() {
    public override val `value`: String = "utility"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoiceMandateOptionsPaytoPurposeX001732ff()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoiceMandateOptionsPaytoPurposeX001732ff = when (value) {
      DependantSupport.value -> DependantSupport
      Government.value -> Government
      Loan.value -> Loan
      Mortgage.value -> Mortgage
      Other.value -> Other
      Pension.value -> Pension
      Personal.value -> Personal
      Retail.value -> Retail
      Salary.value -> Salary
      Tax.value -> Tax
      Utility.value -> Utility
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceMandateOptionsPaytoPurposeX001732ff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineInvoiceMandateOptionsPaytoPurposeX001732ff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoiceMandateOptionsPaytoPurposeX001732ff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceMandateOptionsPaytoPurposeX001732ff) {
      encoder.encodeString(value.value)
    }
  }
}
