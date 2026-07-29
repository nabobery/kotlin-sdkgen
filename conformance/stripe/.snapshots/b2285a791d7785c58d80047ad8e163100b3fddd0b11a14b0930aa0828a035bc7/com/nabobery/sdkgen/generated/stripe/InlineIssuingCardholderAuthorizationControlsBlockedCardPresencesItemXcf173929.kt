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
 * sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_authorization_controls/properties/blocked_card_pr
 * esences/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_authorization_controls/properties/blocked_card_pr
 * esences/items
 */
@Serializable(with = InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929.Serializer::class)
public sealed class InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `not_present`.
   */
  public data object NotPresent : InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929() {
    public override val `value`: String = "not_present"
  }

  /**
   * Documented value. Wire value: `present`.
   */
  public data object Present : InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929() {
    public override val `value`: String = "present"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929 = when (value) {
      NotPresent.value -> NotPresent
      Present.value -> Present
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardholderAuthorizationControlsBlockedCardPresencesItemXcf173929) {
      encoder.encodeString(value.value)
    }
  }
}
