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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/a
 * ssignee/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/a
 * ssignee/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2.Serializer::class)
public sealed class InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUnpinnedIssueAllOf1AssigneeTypeX620c6eb2) {
      encoder.encodeString(value.value)
    }
  }
}
