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
 * Reason the card is ineligible for Google Pay
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_google_pay/properties/ineligible_reason
 */
@Serializable(with = InlineIssuingCardGooglePayIneligibleReasonX01a38feb.Serializer::class)
public sealed class InlineIssuingCardGooglePayIneligibleReasonX01a38feb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `missing_agreement`.
   */
  public data object MissingAgreement : InlineIssuingCardGooglePayIneligibleReasonX01a38feb() {
    public override val `value`: String = "missing_agreement"
  }

  /**
   * Documented value. Wire value: `missing_cardholder_contact`.
   */
  public data object MissingCardholderContact : InlineIssuingCardGooglePayIneligibleReasonX01a38feb() {
    public override val `value`: String = "missing_cardholder_contact"
  }

  /**
   * Documented value. Wire value: `unsupported_region`.
   */
  public data object UnsupportedRegion : InlineIssuingCardGooglePayIneligibleReasonX01a38feb() {
    public override val `value`: String = "unsupported_region"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardGooglePayIneligibleReasonX01a38feb()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardGooglePayIneligibleReasonX01a38feb = when (value) {
      MissingAgreement.value -> MissingAgreement
      MissingCardholderContact.value -> MissingCardholderContact
      UnsupportedRegion.value -> UnsupportedRegion
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardGooglePayIneligibleReasonX01a38feb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardGooglePayIneligibleReasonX01a38feb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardGooglePayIneligibleReasonX01a38feb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardGooglePayIneligibleReasonX01a38feb) {
      encoder.encodeString(value.value)
    }
  }
}
