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
 * Whether the card was present at the point of sale for the authorization.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/card_presence
 */
@Serializable(with = InlineIssuingAuthorizationCardPresenceX536d5448.Serializer::class)
public sealed class InlineIssuingAuthorizationCardPresenceX536d5448 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `not_present`.
   */
  public data object NotPresent : InlineIssuingAuthorizationCardPresenceX536d5448() {
    public override val `value`: String = "not_present"
  }

  /**
   * Documented value. Wire value: `present`.
   */
  public data object Present : InlineIssuingAuthorizationCardPresenceX536d5448() {
    public override val `value`: String = "present"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingAuthorizationCardPresenceX536d5448()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingAuthorizationCardPresenceX536d5448 = when (value) {
      NotPresent.value -> NotPresent
      Present.value -> Present
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingAuthorizationCardPresenceX536d5448> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingAuthorizationCardPresenceX536d5448", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationCardPresenceX536d5448 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingAuthorizationCardPresenceX536d5448) {
      encoder.encodeString(value.value)
    }
  }
}
