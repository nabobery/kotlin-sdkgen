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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-dismissed/properties/action
 */
@Serializable(with = InlineWebhookPullRequestReviewDismissedActionX2027caa7.Serializer::class)
public sealed class InlineWebhookPullRequestReviewDismissedActionX2027caa7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dismissed`.
   */
  public data object Dismissed : InlineWebhookPullRequestReviewDismissedActionX2027caa7() {
    public override val `value`: String = "dismissed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewDismissedActionX2027caa7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewDismissedActionX2027caa7 = when (value) {
      Dismissed.value -> Dismissed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewDismissedActionX2027caa7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewDismissedActionX2027caa7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewDismissedActionX2027caa7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewDismissedActionX2027caa7) {
      encoder.encodeString(value.value)
    }
  }
}
