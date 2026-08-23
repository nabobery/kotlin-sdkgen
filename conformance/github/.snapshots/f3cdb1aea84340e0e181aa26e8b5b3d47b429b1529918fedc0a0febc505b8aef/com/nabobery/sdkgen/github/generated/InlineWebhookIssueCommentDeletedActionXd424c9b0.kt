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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/action
 */
@Serializable(with = InlineWebhookIssueCommentDeletedActionXd424c9b0.Serializer::class)
public sealed class InlineWebhookIssueCommentDeletedActionXd424c9b0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `deleted`.
   */
  public data object Deleted : InlineWebhookIssueCommentDeletedActionXd424c9b0() {
    public override val `value`: String = "deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentDeletedActionXd424c9b0()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentDeletedActionXd424c9b0 = when (value) {
      Deleted.value -> Deleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentDeletedActionXd424c9b0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentDeletedActionXd424c9b0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentDeletedActionXd424c9b0 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentDeletedActionXd424c9b0) {
      encoder.encodeString(value.value)
    }
  }
}
