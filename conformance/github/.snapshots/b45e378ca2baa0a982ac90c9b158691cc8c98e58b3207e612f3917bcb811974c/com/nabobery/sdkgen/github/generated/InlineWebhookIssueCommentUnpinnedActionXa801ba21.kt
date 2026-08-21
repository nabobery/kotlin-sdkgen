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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-unpinned/properties/action
 */
@Serializable(with = InlineWebhookIssueCommentUnpinnedActionXa801ba21.Serializer::class)
public sealed class InlineWebhookIssueCommentUnpinnedActionXa801ba21 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unpinned`.
   */
  public data object Unpinned : InlineWebhookIssueCommentUnpinnedActionXa801ba21() {
    public override val `value`: String = "unpinned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentUnpinnedActionXa801ba21()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentUnpinnedActionXa801ba21 = when (value) {
      Unpinned.value -> Unpinned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentUnpinnedActionXa801ba21> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentUnpinnedActionXa801ba21", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentUnpinnedActionXa801ba21 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentUnpinnedActionXa801ba21) {
      encoder.encodeString(value.value)
    }
  }
}
