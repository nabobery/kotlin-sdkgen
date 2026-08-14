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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/action
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedActionXdfc277b2.Serializer::class)
public sealed class InlineWebhookPullRequestReviewEditedActionXdfc277b2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `edited`.
   */
  public data object Edited : InlineWebhookPullRequestReviewEditedActionXdfc277b2() {
    public override val `value`: String = "edited"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewEditedActionXdfc277b2()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewEditedActionXdfc277b2 = when (value) {
      Edited.value -> Edited
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedActionXdfc277b2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewEditedActionXdfc277b2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedActionXdfc277b2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedActionXdfc277b2) {
      encoder.encodeString(value.value)
    }
  }
}
