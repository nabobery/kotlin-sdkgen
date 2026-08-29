package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_sponsorship/properties/sponsorable/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_sponsorship/properties/sponsorable/properties/type
 */
@Serializable(with = InlineWebhooksSponsorshipSponsorableTypeXa54f3660.Serializer::class)
public sealed class InlineWebhooksSponsorshipSponsorableTypeXa54f3660 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksSponsorshipSponsorableTypeXa54f3660() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksSponsorshipSponsorableTypeXa54f3660() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksSponsorshipSponsorableTypeXa54f3660() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksSponsorshipSponsorableTypeXa54f3660()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksSponsorshipSponsorableTypeXa54f3660 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksSponsorshipSponsorableTypeXa54f3660> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksSponsorshipSponsorableTypeXa54f3660", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksSponsorshipSponsorableTypeXa54f3660 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksSponsorshipSponsorableTypeXa54f3660) {
      encoder.encodeString(value.value)
    }
  }
}
