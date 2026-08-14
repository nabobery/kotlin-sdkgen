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
 * One of `fixed` or `maximum`. If `fixed`, the `amount` param refers to the exact amount to be charged in future
 * payments. If `maximum`, the amount charged can be up to the value passed for the `amount` param.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_card_mandate_options/properties/amount_type
 */
@Serializable(with = InlinePaymentMethodOptionsCardMandateOptionsAmountTypeX8e5d3777.Serializer::class)
public sealed class InlinePaymentMethodOptionsCardMandateOptionsAmountTypeX8e5d3777 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlinePaymentMethodOptionsCardMandateOptionsAmountTypeX8e5d3777() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlinePaymentMethodOptionsCardMandateOptionsAmountTypeX8e5d3777() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsCardMandateOptionsAmountTypeX8e5d3777()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsCardMandateOptionsAmountTypeX8e5d3777 = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsCardMandateOptionsAmountTypeX8e5d3777> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsCardMandateOptionsAmountTypeX8e5d3777", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsCardMandateOptionsAmountTypeX8e5d3777 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsCardMandateOptionsAmountTypeX8e5d3777) {
      encoder.encodeString(value.value)
    }
  }
}
