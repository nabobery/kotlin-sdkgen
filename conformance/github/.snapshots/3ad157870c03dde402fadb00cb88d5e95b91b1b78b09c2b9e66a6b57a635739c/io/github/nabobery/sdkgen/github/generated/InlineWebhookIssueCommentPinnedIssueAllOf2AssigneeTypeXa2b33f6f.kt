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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/1/properties/ass
 * ignee/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/issue/allOf/1/properties/ass
 * ignee/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f.Serializer::class)
public sealed class InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentPinnedIssueAllOf2AssigneeTypeXa2b33f6f) {
      encoder.encodeString(value.value)
    }
  }
}
