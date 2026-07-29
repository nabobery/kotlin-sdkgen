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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/action.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/action
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629.Serializer::class)
public sealed class InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `unresolved`.
   */
  public data object Unresolved : InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629() {
    public override val `value`: String = "unresolved"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629 = when (value) {
      Unresolved.value -> Unresolved
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadUnresolvedActionX0edbe629) {
      encoder.encodeString(value.value)
    }
  }
}
