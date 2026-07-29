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
 * The side of the first line of the range for a multi-line comment.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/thread/prop
 * erties/comments/items/properties/start_side
 */
@Serializable(with = InlineWebhookPullRequestRe5e87ThreadCommentsItemStartSideX22d094d9.Serializer::class)
public sealed class InlineWebhookPullRequestRe5e87ThreadCommentsItemStartSideX22d094d9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `LEFT`.
   */
  public data object Left : InlineWebhookPullRequestRe5e87ThreadCommentsItemStartSideX22d094d9() {
    public override val `value`: String = "LEFT"
  }

  /**
   * Documented value. Wire value: `RIGHT`.
   */
  public data object Right : InlineWebhookPullRequestRe5e87ThreadCommentsItemStartSideX22d094d9() {
    public override val `value`: String = "RIGHT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe5e87ThreadCommentsItemStartSideX22d094d9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe5e87ThreadCommentsItemStartSideX22d094d9 = when (value) {
      Left.value -> Left
      Right.value -> Right
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestRe5e87ThreadCommentsItemStartSideX22d094d9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe5e87ThreadCommentsItemStartSideX22d094d9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5e87ThreadCommentsItemStartSideX22d094d9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5e87ThreadCommentsItemStartSideX22d094d9) {
      encoder.encodeString(value.value)
    }
  }
}
