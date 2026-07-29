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
 * The status of the most recent automated tax calculation for this session.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_pages_checkout_session_automatic_tax/properties/status
 */
@Serializable(with = InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa.Serializer::class)
public sealed class InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `complete`.
   */
  public data object Complete : InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa() {
    public override val `value`: String = "complete"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa() {
    public override val `value`: String = "failed"
  }

  /**
   * Documented value. Wire value: `requires_location_inputs`.
   */
  public data object RequiresLocationInputs : InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa() {
    public override val `value`: String = "requires_location_inputs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa = when (value) {
      Complete.value -> Complete
      Failed.value -> Failed
      RequiresLocationInputs.value -> RequiresLocationInputs
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentPagesCheckoutSessionAutomaticTaxStatusX0e24e6fa) {
      encoder.encodeString(value.value)
    }
  }
}
