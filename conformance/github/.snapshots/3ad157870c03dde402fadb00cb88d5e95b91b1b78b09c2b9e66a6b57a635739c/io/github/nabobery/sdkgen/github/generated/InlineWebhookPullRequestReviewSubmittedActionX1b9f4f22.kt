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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/action
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedActionX1b9f4f22.Serializer::class)
public sealed class InlineWebhookPullRequestReviewSubmittedActionX1b9f4f22 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `submitted`.
   */
  public data object Submitted : InlineWebhookPullRequestReviewSubmittedActionX1b9f4f22() {
    public override val `value`: String = "submitted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewSubmittedActionX1b9f4f22()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewSubmittedActionX1b9f4f22 = when (value) {
      Submitted.value -> Submitted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedActionX1b9f4f22> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewSubmittedActionX1b9f4f22", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedActionX1b9f4f22 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedActionX1b9f4f22) {
      encoder.encodeString(value.value)
    }
  }
}
