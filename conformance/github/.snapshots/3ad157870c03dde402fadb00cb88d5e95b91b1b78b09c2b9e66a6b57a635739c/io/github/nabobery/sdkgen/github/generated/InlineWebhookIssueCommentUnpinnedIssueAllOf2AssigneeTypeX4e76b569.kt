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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/1/properties/a
 * ssignee/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/1/properties/a
 * ssignee/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569.Serializer::class)
public sealed class InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUnpinnedIssueAllOf2AssigneeTypeX4e76b569) {
      encoder.encodeString(value.value)
    }
  }
}
