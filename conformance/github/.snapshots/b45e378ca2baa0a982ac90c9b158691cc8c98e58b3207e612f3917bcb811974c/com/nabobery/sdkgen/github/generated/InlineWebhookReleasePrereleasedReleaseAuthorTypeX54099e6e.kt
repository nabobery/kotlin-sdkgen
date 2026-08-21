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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-prereleased/properties/release/properties/author/pro
 * perties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-prereleased/properties/release/properties/author/pro
 * perties/type
 */
@Serializable(with = InlineWebhookReleasePrereleasedReleaseAuthorTypeX54099e6e.Serializer::class)
public sealed class InlineWebhookReleasePrereleasedReleaseAuthorTypeX54099e6e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookReleasePrereleasedReleaseAuthorTypeX54099e6e() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookReleasePrereleasedReleaseAuthorTypeX54099e6e() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookReleasePrereleasedReleaseAuthorTypeX54099e6e() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookReleasePrereleasedReleaseAuthorTypeX54099e6e()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookReleasePrereleasedReleaseAuthorTypeX54099e6e = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookReleasePrereleasedReleaseAuthorTypeX54099e6e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookReleasePrereleasedReleaseAuthorTypeX54099e6e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookReleasePrereleasedReleaseAuthorTypeX54099e6e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleasePrereleasedReleaseAuthorTypeX54099e6e) {
      encoder.encodeString(value.value)
    }
  }
}
