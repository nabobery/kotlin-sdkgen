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
 * The type of amount that will be collected. The amount charged must be exact or up to the value of `amount` param for
 * `fixed` or `maximum` type respectively. Defaults to `maximum`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_mandate_options_payto/properti
 * es/amount_type
 */
@Serializable(with = InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6.Serializer::class)
public sealed class InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6 = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPaymentMethodOptionsMandateOptionsPaytoAmountTypeX1f60e6d6) {
      encoder.encodeString(value.value)
    }
  }
}
