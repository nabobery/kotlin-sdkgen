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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_release/properties/author/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_release/properties/author/properties/type
 */
@Serializable(with = InlineWebhooksReleaseAuthorTypeXf3fdd82a.Serializer::class)
public sealed class InlineWebhooksReleaseAuthorTypeXf3fdd82a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhooksReleaseAuthorTypeXf3fdd82a() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhooksReleaseAuthorTypeXf3fdd82a() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhooksReleaseAuthorTypeXf3fdd82a() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksReleaseAuthorTypeXf3fdd82a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksReleaseAuthorTypeXf3fdd82a = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhooksReleaseAuthorTypeXf3fdd82a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksReleaseAuthorTypeXf3fdd82a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksReleaseAuthorTypeXf3fdd82a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksReleaseAuthorTypeXf3fdd82a) {
      encoder.encodeString(value.value)
    }
  }
}
