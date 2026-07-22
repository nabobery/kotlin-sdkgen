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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/1/properties/as
 * signee/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-created/properties/issue/allOf/1/properties/as
 * signee/properties/type
 */
@Serializable(with = InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c.Serializer::class)
public sealed class InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentCreatedIssueAllOf2AssigneeTypeX700bd77c) {
      encoder.encodeString(value.value)
    }
  }
}
