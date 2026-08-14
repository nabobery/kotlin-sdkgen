package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-push/properties/repository/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-push/properties/repository/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPushRepositoryOwnerTypeX2ac2a17b.Serializer::class)
public sealed class InlineWebhookPushRepositoryOwnerTypeX2ac2a17b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPushRepositoryOwnerTypeX2ac2a17b() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPushRepositoryOwnerTypeX2ac2a17b() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPushRepositoryOwnerTypeX2ac2a17b() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPushRepositoryOwnerTypeX2ac2a17b()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPushRepositoryOwnerTypeX2ac2a17b = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPushRepositoryOwnerTypeX2ac2a17b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPushRepositoryOwnerTypeX2ac2a17b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPushRepositoryOwnerTypeX2ac2a17b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPushRepositoryOwnerTypeX2ac2a17b) {
      encoder.encodeString(value.value)
    }
  }
}
