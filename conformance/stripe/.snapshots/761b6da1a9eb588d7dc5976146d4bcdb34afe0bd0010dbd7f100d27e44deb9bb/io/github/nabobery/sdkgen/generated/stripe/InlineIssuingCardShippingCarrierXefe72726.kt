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
 * The delivery company that shipped a card.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping/properties/carrier
 */
@Serializable(with = InlineIssuingCardShippingCarrierXefe72726.Serializer::class)
public sealed class InlineIssuingCardShippingCarrierXefe72726 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dhl`.
   */
  public data object Dhl : InlineIssuingCardShippingCarrierXefe72726() {
    public override val `value`: String = "dhl"
  }

  /**
   * Documented value. Wire value: `fedex`.
   */
  public data object Fedex : InlineIssuingCardShippingCarrierXefe72726() {
    public override val `value`: String = "fedex"
  }

  /**
   * Documented value. Wire value: `royal_mail`.
   */
  public data object RoyalMail : InlineIssuingCardShippingCarrierXefe72726() {
    public override val `value`: String = "royal_mail"
  }

  /**
   * Documented value. Wire value: `usps`.
   */
  public data object Usps : InlineIssuingCardShippingCarrierXefe72726() {
    public override val `value`: String = "usps"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardShippingCarrierXefe72726()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardShippingCarrierXefe72726 = when (value) {
      Dhl.value -> Dhl
      Fedex.value -> Fedex
      RoyalMail.value -> RoyalMail
      Usps.value -> Usps
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardShippingCarrierXefe72726> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardShippingCarrierXefe72726", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardShippingCarrierXefe72726 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardShippingCarrierXefe72726) {
      encoder.encodeString(value.value)
    }
  }
}
