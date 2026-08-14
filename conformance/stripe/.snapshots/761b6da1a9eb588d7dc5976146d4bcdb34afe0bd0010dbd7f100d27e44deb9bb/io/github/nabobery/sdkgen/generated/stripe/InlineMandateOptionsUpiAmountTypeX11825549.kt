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
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_options_upi/properties/amount_type
 */
@Serializable(with = InlineMandateOptionsUpiAmountTypeX11825549.Serializer::class)
public sealed class InlineMandateOptionsUpiAmountTypeX11825549 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fixed`.
   */
  public data object Fixed : InlineMandateOptionsUpiAmountTypeX11825549() {
    public override val `value`: String = "fixed"
  }

  /**
   * Documented value. Wire value: `maximum`.
   */
  public data object Maximum : InlineMandateOptionsUpiAmountTypeX11825549() {
    public override val `value`: String = "maximum"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineMandateOptionsUpiAmountTypeX11825549()

  public companion object {
    public fun fromValue(`value`: String): InlineMandateOptionsUpiAmountTypeX11825549 = when (value) {
      Fixed.value -> Fixed
      Maximum.value -> Maximum
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineMandateOptionsUpiAmountTypeX11825549> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineMandateOptionsUpiAmountTypeX11825549", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineMandateOptionsUpiAmountTypeX11825549 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineMandateOptionsUpiAmountTypeX11825549) {
      encoder.encodeString(value.value)
    }
  }
}
