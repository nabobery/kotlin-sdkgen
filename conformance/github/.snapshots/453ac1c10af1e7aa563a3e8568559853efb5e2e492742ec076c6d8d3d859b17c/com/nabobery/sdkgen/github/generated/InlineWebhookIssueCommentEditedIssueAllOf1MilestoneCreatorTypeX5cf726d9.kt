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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/0/properties/mil
 * estone/properties/creator/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/0/properties/mil
 * estone/properties/creator/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9.Serializer::class)
public sealed class InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentEditedIssueAllOf1MilestoneCreatorTypeX5cf726d9) {
      encoder.encodeString(value.value)
    }
  }
}
