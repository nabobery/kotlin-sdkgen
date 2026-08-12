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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/0/properties/us
 * er/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/0/properties/us
 * er/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c.Serializer::class)
public sealed class InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentDeletedIssueAllOf1UserTypeX43aa191c) {
      encoder.encodeString(value.value)
    }
  }
}
