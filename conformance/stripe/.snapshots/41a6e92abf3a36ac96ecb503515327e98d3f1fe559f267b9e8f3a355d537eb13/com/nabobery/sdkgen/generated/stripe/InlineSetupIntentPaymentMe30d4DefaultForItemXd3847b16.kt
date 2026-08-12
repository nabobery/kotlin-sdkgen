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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_mandate_options_acss_debit/prope
 * rties/default_for/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_mandate_options_acss_debit/prope
 * rties/default_for/items
 */
@Serializable(with = InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16.Serializer::class)
public sealed class InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `invoice`.
   */
  public data object Invoice : InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16() {
    public override val `value`: String = "invoice"
  }

  /**
   * Documented value. Wire value: `subscription`.
   */
  public data object Subscription : InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16() {
    public override val `value`: String = "subscription"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16 = when (value) {
      Invoice.value -> Invoice
      Subscription.value -> Subscription
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMe30d4DefaultForItemXd3847b16) {
      encoder.encodeString(value.value)
    }
  }
}
