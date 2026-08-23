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
 * State of the issue; either 'open' or 'closed'
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/0/properties/st
 * ate
 */
@Serializable(with = InlineWebhookIssueCommentDeletedIssueAllOf1StateX2b5f460f.Serializer::class)
public sealed class InlineWebhookIssueCommentDeletedIssueAllOf1StateX2b5f460f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookIssueCommentDeletedIssueAllOf1StateX2b5f460f() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssueCommentDeletedIssueAllOf1StateX2b5f460f() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentDeletedIssueAllOf1StateX2b5f460f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentDeletedIssueAllOf1StateX2b5f460f = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentDeletedIssueAllOf1StateX2b5f460f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentDeletedIssueAllOf1StateX2b5f460f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentDeletedIssueAllOf1StateX2b5f460f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentDeletedIssueAllOf1StateX2b5f460f) {
      encoder.encodeString(value.value)
    }
  }
}
