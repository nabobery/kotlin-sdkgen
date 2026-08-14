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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-commit-comment-created/properties/comment/properties/user/pr
 * operties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-commit-comment-created/properties/comment/properties/user/pr
 * operties/type
 */
@Serializable(with = InlineWebhookCommitCommentCreatedCommentUserTypeX3297e3eb.Serializer::class)
public sealed class InlineWebhookCommitCommentCreatedCommentUserTypeX3297e3eb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookCommitCommentCreatedCommentUserTypeX3297e3eb() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookCommitCommentCreatedCommentUserTypeX3297e3eb() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookCommitCommentCreatedCommentUserTypeX3297e3eb() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookCommitCommentCreatedCommentUserTypeX3297e3eb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookCommitCommentCreatedCommentUserTypeX3297e3eb = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookCommitCommentCreatedCommentUserTypeX3297e3eb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookCommitCommentCreatedCommentUserTypeX3297e3eb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookCommitCommentCreatedCommentUserTypeX3297e3eb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCommitCommentCreatedCommentUserTypeX3297e3eb) {
      encoder.encodeString(value.value)
    }
  }
}
