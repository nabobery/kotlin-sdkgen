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
 * The type of amount that will be collected. The amount charged must be exact or up to the value of `amount` param for
 * `fixed` or `maximum` type respectively. Defaults to `maximum`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_mandate_options_payto/properties
 * /amount_type
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeXdc9c92c0.Serializer::class)
public sealed class InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeXdc9c92c0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeXdc9c92c0() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeXdc9c92c0() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeXdc9c92c0()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeXdc9c92c0 = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeXdc9c92c0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeXdc9c92c0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeXdc9c92c0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeXdc9c92c0) {
      encoder.encodeString(value.value)
    }
  }
}
