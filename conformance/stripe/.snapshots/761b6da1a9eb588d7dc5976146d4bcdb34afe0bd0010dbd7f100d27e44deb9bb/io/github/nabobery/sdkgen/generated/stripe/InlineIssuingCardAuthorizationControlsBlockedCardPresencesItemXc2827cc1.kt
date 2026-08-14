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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/issuing_card_authorization_controls/properties/blocked_card_presence
 * s/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_card_authorization_controls/properties/blocked_card_presence
 * s/items
 */
@Serializable(with = InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1.Serializer::class)
public sealed class InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `not_present`.
   */
  public data object NotPresent : InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1() {
    public override val `value`: String = "not_present"
  }

  /**
   * Documented value. Wire value: `present`.
   */
  public data object Present : InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1() {
    public override val `value`: String = "present"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1 = when (value) {
      NotPresent.value -> NotPresent
      Present.value -> Present
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardAuthorizationControlsBlockedCardPresencesItemXc2827cc1) {
      encoder.encodeString(value.value)
    }
  }
}
