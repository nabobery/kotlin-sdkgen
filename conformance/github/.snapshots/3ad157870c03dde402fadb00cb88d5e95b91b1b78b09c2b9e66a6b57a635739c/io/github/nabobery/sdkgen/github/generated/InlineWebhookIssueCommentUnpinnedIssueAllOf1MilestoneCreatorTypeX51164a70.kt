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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/m
 * ilestone/properties/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/m
 * ilestone/properties/creator/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70.Serializer::class)
public sealed class InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUnpinnedIssueAllOf1MilestoneCreatorTypeX51164a70) {
      encoder.encodeString(value.value)
    }
  }
}
