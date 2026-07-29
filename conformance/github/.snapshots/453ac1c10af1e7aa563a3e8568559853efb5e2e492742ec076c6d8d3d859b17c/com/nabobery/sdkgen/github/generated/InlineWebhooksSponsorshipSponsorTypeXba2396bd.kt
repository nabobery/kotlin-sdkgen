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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_sponsorship/properties/sponsor/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_sponsorship/properties/sponsor/properties/type
 */
@Serializable(with = InlineWebhooksSponsorshipSponsorTypeXba2396bd.Serializer::class)
public sealed class InlineWebhooksSponsorshipSponsorTypeXba2396bd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksSponsorshipSponsorTypeXba2396bd() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksSponsorshipSponsorTypeXba2396bd() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksSponsorshipSponsorTypeXba2396bd() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksSponsorshipSponsorTypeXba2396bd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksSponsorshipSponsorTypeXba2396bd = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksSponsorshipSponsorTypeXba2396bd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksSponsorshipSponsorTypeXba2396bd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksSponsorshipSponsorTypeXba2396bd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksSponsorshipSponsorTypeXba2396bd) {
      encoder.encodeString(value.value)
    }
  }
}
