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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-ready-for-review/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-ready-for-review/properties/action
 */
@Serializable(with = InlineWebhookPullRequestReadyForReviewActionXbc481d19.Serializer::class)
public sealed class InlineWebhookPullRequestReadyForReviewActionXbc481d19 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ready_for_review`.
   */
  public data object ReadyForReview : InlineWebhookPullRequestReadyForReviewActionXbc481d19() {
    public override val `value`: String = "ready_for_review"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReadyForReviewActionXbc481d19()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReadyForReviewActionXbc481d19 = when (value) {
      ReadyForReview.value -> ReadyForReview
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReadyForReviewActionXbc481d19> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReadyForReviewActionXbc481d19", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReadyForReviewActionXbc481d19 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReadyForReviewActionXbc481d19) {
      encoder.encodeString(value.value)
    }
  }
}
