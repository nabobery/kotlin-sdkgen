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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/action
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedActionXc4835579.Serializer::class)
public sealed class InlineWebhookPullRequestReviewThreadResolvedActionXc4835579 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `resolved`.
   */
  public data object Resolved : InlineWebhookPullRequestReviewThreadResolvedActionXc4835579() {
    public override val `value`: String = "resolved"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewThreadResolvedActionXc4835579()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewThreadResolvedActionXc4835579 = when (value) {
      Resolved.value -> Resolved
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedActionXc4835579> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewThreadResolvedActionXc4835579", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedActionXc4835579 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedActionXc4835579) {
      encoder.encodeString(value.value)
    }
  }
}
