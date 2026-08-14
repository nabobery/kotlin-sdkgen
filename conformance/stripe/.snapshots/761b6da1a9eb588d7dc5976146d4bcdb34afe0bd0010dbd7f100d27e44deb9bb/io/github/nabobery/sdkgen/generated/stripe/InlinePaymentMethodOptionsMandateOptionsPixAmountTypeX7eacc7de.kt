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
 * Type of amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_method_options_mandate_options_pix/properties/amount_type
 */
@Serializable(with = InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de.Serializer::class)
public sealed class InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodOptionsMandateOptionsPixAmountTypeX7eacc7de) {
      encoder.encodeString(value.value)
    }
  }
}
