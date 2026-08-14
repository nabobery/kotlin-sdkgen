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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/action
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf1ActionXf4755b37.Serializer::class)
public sealed class InlineWebhookPullRequestReviewRequestedOneOf1ActionXf4755b37 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `review_requested`.
   */
  public data object ReviewRequested : InlineWebhookPullRequestReviewRequestedOneOf1ActionXf4755b37() {
    public override val `value`: String = "review_requested"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewRequestedOneOf1ActionXf4755b37()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewRequestedOneOf1ActionXf4755b37 = when (value) {
      ReviewRequested.value -> ReviewRequested
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf1ActionXf4755b37> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewRequestedOneOf1ActionXf4755b37", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf1ActionXf4755b37 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf1ActionXf4755b37) {
      encoder.encodeString(value.value)
    }
  }
}
