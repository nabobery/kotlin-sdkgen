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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/issue/allOf/0/properties/s
 * tate
 */
@Serializable(with = InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8.Serializer::class)
public sealed class InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUnpinnedIssueAllOf1StateX277707b8) {
      encoder.encodeString(value.value)
    }
  }
}
