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
 * The purpose for which payments are made. Has a default value based on your merchant category code.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_options_payto/properties/purpose
 */
@Serializable(with = InlineMandateOptionsPaytoPurposeX3f3845f0.Serializer::class)
public sealed class InlineMandateOptionsPaytoPurposeX3f3845f0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dependant_support`.
   */
  public data object DependantSupport : InlineMandateOptionsPaytoPurposeX3f3845f0() {
    public override val `value`: String = "dependant_support"
  }

  /**
   * Documented value. Wire value: `government`.
   */
  public data object Government : InlineMandateOptionsPaytoPurposeX3f3845f0() {
    public override val `value`: String = "government"
  }

  /**
   * Documented value. Wire value: `loan`.
   */
  public data object Loan : InlineMandateOptionsPaytoPurposeX3f3845f0() {
    public override val `value`: String = "loan"
  }

  /**
   * Documented value. Wire value: `mortgage`.
   */
  public data object Mortgage : InlineMandateOptionsPaytoPurposeX3f3845f0() {
    public override val `value`: String = "mortgage"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineMandateOptionsPaytoPurposeX3f3845f0() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `pension`.
   */
  public data object Pension : InlineMandateOptionsPaytoPurposeX3f3845f0() {
    public override val `value`: String = "pension"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineMandateOptionsPaytoPurposeX3f3845f0() {
    public override val `value`: String = "personal"
  }

  /**
   * Documented value. Wire value: `retail`.
   */
  public data object Retail : InlineMandateOptionsPaytoPurposeX3f3845f0() {
    public override val `value`: String = "retail"
  }

  /**
   * Documented value. Wire value: `salary`.
   */
  public data object Salary : InlineMandateOptionsPaytoPurposeX3f3845f0() {
    public override val `value`: String = "salary"
  }

  /**
   * Documented value. Wire value: `tax`.
   */
  public data object Tax : InlineMandateOptionsPaytoPurposeX3f3845f0() {
    public override val `value`: String = "tax"
  }

  /**
   * Documented value. Wire value: `utility`.
   */
  public data object Utility : InlineMandateOptionsPaytoPurposeX3f3845f0() {
    public override val `value`: String = "utility"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandateOptionsPaytoPurposeX3f3845f0()

  public companion object {
    public fun fromValue(`value`: String): InlineMandateOptionsPaytoPurposeX3f3845f0 = when (value) {
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

  internal object Serializer : KSerializer<InlineMandateOptionsPaytoPurposeX3f3845f0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineMandateOptionsPaytoPurposeX3f3845f0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandateOptionsPaytoPurposeX3f3845f0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandateOptionsPaytoPurposeX3f3845f0) {
      encoder.encodeString(value.value)
    }
  }
}
