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
 * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
 * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_card_mandate_options/properties/
 * amount_type
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74.Serializer::class)
public sealed class InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74 = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsCardMandateOptionsAmountTypeX329b3f74) {
      encoder.encodeString(value.value)
    }
  }
}
