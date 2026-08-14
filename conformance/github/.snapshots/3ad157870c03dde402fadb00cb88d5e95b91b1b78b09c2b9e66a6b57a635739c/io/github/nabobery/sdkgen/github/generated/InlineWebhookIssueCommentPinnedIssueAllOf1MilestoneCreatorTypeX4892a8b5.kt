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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/0/properties/mil
 * estone/properties/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/0/properties/mil
 * estone/properties/creator/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5.Serializer::class)
public sealed class InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentPinnedIssueAllOf1MilestoneCreatorTypeX4892a8b5) {
      encoder.encodeString(value.value)
    }
  }
}
