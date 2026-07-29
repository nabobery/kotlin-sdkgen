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
 * sdkgen://source/openapi.json#/components/schemas/issuing_card_authorization_controls/properties/allowed_card_presence
 * s/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_card_authorization_controls/properties/allowed_card_presence
 * s/items
 */
@Serializable(with = InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622.Serializer::class)
public sealed class InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `not_present`.
   */
  public data object NotPresent : InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622() {
    public override val `value`: String = "not_present"
  }

  /**
   * Documented value. Wire value: `present`.
   */
  public data object Present : InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622() {
    public override val `value`: String = "present"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622 = when (value) {
      NotPresent.value -> NotPresent
      Present.value -> Present
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardAuthorizationControlsAllowedCardPresencesItemXf5ad0622) {
      encoder.encodeString(value.value)
    }
  }
}
