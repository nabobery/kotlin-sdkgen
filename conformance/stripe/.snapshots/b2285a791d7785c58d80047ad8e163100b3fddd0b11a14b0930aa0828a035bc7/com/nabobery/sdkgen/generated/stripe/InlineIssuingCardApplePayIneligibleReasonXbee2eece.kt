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
 * Reason the card is ineligible for Apple Pay
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_apple_pay/properties/ineligible_reason
 */
@Serializable(with = InlineIssuingCardApplePayIneligibleReasonXbee2eece.Serializer::class)
public sealed class InlineIssuingCardApplePayIneligibleReasonXbee2eece {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `missing_agreement`.
   */
  public data object MissingAgreement : InlineIssuingCardApplePayIneligibleReasonXbee2eece() {
    public override val `value`: String = "missing_agreement"
  }

  /**
   * Documented value. Wire value: `missing_cardholder_contact`.
   */
  public data object MissingCardholderContact : InlineIssuingCardApplePayIneligibleReasonXbee2eece() {
    public override val `value`: String = "missing_cardholder_contact"
  }

  /**
   * Documented value. Wire value: `unsupported_region`.
   */
  public data object UnsupportedRegion : InlineIssuingCardApplePayIneligibleReasonXbee2eece() {
    public override val `value`: String = "unsupported_region"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardApplePayIneligibleReasonXbee2eece()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardApplePayIneligibleReasonXbee2eece = when (value) {
      MissingAgreement.value -> MissingAgreement
      MissingCardholderContact.value -> MissingCardholderContact
      UnsupportedRegion.value -> UnsupportedRegion
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardApplePayIneligibleReasonXbee2eece> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingCardApplePayIneligibleReasonXbee2eece", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardApplePayIneligibleReasonXbee2eece = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardApplePayIneligibleReasonXbee2eece) {
      encoder.encodeString(value.value)
    }
  }
}
