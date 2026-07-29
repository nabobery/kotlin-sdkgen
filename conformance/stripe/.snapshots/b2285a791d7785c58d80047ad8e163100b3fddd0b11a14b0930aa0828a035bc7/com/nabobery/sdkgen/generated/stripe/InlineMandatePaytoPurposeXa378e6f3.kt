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
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_payto/properties/purpose
 */
@Serializable(with = InlineMandatePaytoPurposeXa378e6f3.Serializer::class)
public sealed class InlineMandatePaytoPurposeXa378e6f3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dependant_support`.
   */
  public data object DependantSupport : InlineMandatePaytoPurposeXa378e6f3() {
    public override val `value`: String = "dependant_support"
  }

  /**
   * Documented value. Wire value: `government`.
   */
  public data object Government : InlineMandatePaytoPurposeXa378e6f3() {
    public override val `value`: String = "government"
  }

  /**
   * Documented value. Wire value: `loan`.
   */
  public data object Loan : InlineMandatePaytoPurposeXa378e6f3() {
    public override val `value`: String = "loan"
  }

  /**
   * Documented value. Wire value: `mortgage`.
   */
  public data object Mortgage : InlineMandatePaytoPurposeXa378e6f3() {
    public override val `value`: String = "mortgage"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineMandatePaytoPurposeXa378e6f3() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `pension`.
   */
  public data object Pension : InlineMandatePaytoPurposeXa378e6f3() {
    public override val `value`: String = "pension"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineMandatePaytoPurposeXa378e6f3() {
    public override val `value`: String = "personal"
  }

  /**
   * Documented value. Wire value: `retail`.
   */
  public data object Retail : InlineMandatePaytoPurposeXa378e6f3() {
    public override val `value`: String = "retail"
  }

  /**
   * Documented value. Wire value: `salary`.
   */
  public data object Salary : InlineMandatePaytoPurposeXa378e6f3() {
    public override val `value`: String = "salary"
  }

  /**
   * Documented value. Wire value: `tax`.
   */
  public data object Tax : InlineMandatePaytoPurposeXa378e6f3() {
    public override val `value`: String = "tax"
  }

  /**
   * Documented value. Wire value: `utility`.
   */
  public data object Utility : InlineMandatePaytoPurposeXa378e6f3() {
    public override val `value`: String = "utility"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandatePaytoPurposeXa378e6f3()

  public companion object {
    public fun fromValue(`value`: String): InlineMandatePaytoPurposeXa378e6f3 = when (value) {
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

  public object Serializer : KSerializer<InlineMandatePaytoPurposeXa378e6f3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineMandatePaytoPurposeXa378e6f3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandatePaytoPurposeXa378e6f3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandatePaytoPurposeXa378e6f3) {
      encoder.encodeString(value.value)
    }
  }
}
