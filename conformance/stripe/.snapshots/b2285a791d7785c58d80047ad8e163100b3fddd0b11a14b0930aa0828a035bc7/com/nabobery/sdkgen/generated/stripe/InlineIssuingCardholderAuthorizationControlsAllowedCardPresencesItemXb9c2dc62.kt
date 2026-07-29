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
 * sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_authorization_controls/properties/allowed_card_pr
 * esences/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_authorization_controls/properties/allowed_card_pr
 * esences/items
 */
@Serializable(with = InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62.Serializer::class)
public sealed class InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `not_present`.
   */
  public data object NotPresent : InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62() {
    public override val `value`: String = "not_present"
  }

  /**
   * Documented value. Wire value: `present`.
   */
  public data object Present : InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62() {
    public override val `value`: String = "present"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62 = when (value) {
      NotPresent.value -> NotPresent
      Present.value -> Present
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderAuthorizationControlsAllowedCardPresencesItemXb9c2dc62) {
      encoder.encodeString(value.value)
    }
  }
}
