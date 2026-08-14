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
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_mandate_options_payto/properties
 * /purpose
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f.Serializer::class)
public sealed class InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dependant_support`.
   */
  public data object DependantSupport : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f() {
    public override val `value`: String = "dependant_support"
  }

  /**
   * Documented value. Wire value: `government`.
   */
  public data object Government : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f() {
    public override val `value`: String = "government"
  }

  /**
   * Documented value. Wire value: `loan`.
   */
  public data object Loan : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f() {
    public override val `value`: String = "loan"
  }

  /**
   * Documented value. Wire value: `mortgage`.
   */
  public data object Mortgage : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f() {
    public override val `value`: String = "mortgage"
  }

  /**
   * Documented value. Wire value: `other`.
   */
  public data object Other : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f() {
    public override val `value`: String = "other"
  }

  /**
   * Documented value. Wire value: `pension`.
   */
  public data object Pension : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f() {
    public override val `value`: String = "pension"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f() {
    public override val `value`: String = "personal"
  }

  /**
   * Documented value. Wire value: `retail`.
   */
  public data object Retail : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f() {
    public override val `value`: String = "retail"
  }

  /**
   * Documented value. Wire value: `salary`.
   */
  public data object Salary : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f() {
    public override val `value`: String = "salary"
  }

  /**
   * Documented value. Wire value: `tax`.
   */
  public data object Tax : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f() {
    public override val `value`: String = "tax"
  }

  /**
   * Documented value. Wire value: `utility`.
   */
  public data object Utility : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f() {
    public override val `value`: String = "utility"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f = when (value) {
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

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoPurposeX6b4ee11f) {
      encoder.encodeString(value.value)
    }
  }
}
