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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issue-comment-pinned/properties/action
 */
@Serializable(with = InlineWebhookIssueCommentPinnedActionX3eabf0da.Serializer::class)
public sealed class InlineWebhookIssueCommentPinnedActionX3eabf0da {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pinned`.
   */
  public data object Pinned : InlineWebhookIssueCommentPinnedActionX3eabf0da() {
    public override val `value`: String = "pinned"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookIssueCommentPinnedActionX3eabf0da()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookIssueCommentPinnedActionX3eabf0da = when (value) {
      Pinned.value -> Pinned
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookIssueCommentPinnedActionX3eabf0da> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookIssueCommentPinnedActionX3eabf0da", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookIssueCommentPinnedActionX3eabf0da = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssueCommentPinnedActionX3eabf0da) {
      encoder.encodeString(value.value)
    }
  }
}
