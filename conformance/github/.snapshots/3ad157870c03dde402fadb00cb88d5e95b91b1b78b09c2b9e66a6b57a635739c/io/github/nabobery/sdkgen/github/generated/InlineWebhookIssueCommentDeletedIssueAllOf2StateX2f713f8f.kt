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
 * State of the issue; either 'open' or 'closed'
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-deleted/properties/issue/allOf/1/properties/st
 * ate
 */
@Serializable(with = InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f.Serializer::class)
public sealed class InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentDeletedIssueAllOf2StateX2f713f8f) {
      encoder.encodeString(value.value)
    }
  }
}
