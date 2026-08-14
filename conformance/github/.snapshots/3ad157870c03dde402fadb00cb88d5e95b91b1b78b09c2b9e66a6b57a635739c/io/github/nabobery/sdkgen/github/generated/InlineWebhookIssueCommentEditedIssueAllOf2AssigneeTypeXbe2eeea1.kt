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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/1/properties/ass
 * ignee/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-edited/properties/issue/allOf/1/properties/ass
 * ignee/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1.Serializer::class)
public sealed class InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentEditedIssueAllOf2AssigneeTypeXbe2eeea1) {
      encoder.encodeString(value.value)
    }
  }
}
