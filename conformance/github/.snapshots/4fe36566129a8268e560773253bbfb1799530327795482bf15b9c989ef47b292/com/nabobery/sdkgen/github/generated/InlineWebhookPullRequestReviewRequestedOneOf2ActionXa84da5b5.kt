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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/action
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf2ActionXa84da5b5.Serializer::class)
public sealed class InlineWebhookPullRequestReviewRequestedOneOf2ActionXa84da5b5 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `review_requested`.
   */
  public data object ReviewRequested : InlineWebhookPullRequestReviewRequestedOneOf2ActionXa84da5b5() {
    public override val `value`: String = "review_requested"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewRequestedOneOf2ActionXa84da5b5()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewRequestedOneOf2ActionXa84da5b5 = when (value) {
      ReviewRequested.value -> ReviewRequested
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf2ActionXa84da5b5> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewRequestedOneOf2ActionXa84da5b5", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf2ActionXa84da5b5 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf2ActionXa84da5b5) {
      encoder.encodeString(value.value)
    }
  }
}
