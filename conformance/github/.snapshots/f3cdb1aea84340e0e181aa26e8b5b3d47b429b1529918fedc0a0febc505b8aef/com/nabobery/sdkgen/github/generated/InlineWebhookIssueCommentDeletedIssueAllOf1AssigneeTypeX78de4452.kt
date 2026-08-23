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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/0/properties/as
 * signee/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/0/properties/as
 * signee/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452.Serializer::class)
public sealed class InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentDeletedIssueAllOf1AssigneeTypeX78de4452) {
      encoder.encodeString(value.value)
    }
  }
}
