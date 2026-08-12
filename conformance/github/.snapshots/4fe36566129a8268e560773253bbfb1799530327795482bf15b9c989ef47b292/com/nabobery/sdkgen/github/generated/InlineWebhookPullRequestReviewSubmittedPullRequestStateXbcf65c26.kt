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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/state.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/state
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedPullRequestStateXbcf65c26.Serializer::class)
public sealed class InlineWebhookPullRequestReviewSubmittedPullRequestStateXbcf65c26 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReviewSubmittedPullRequestStateXbcf65c26() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReviewSubmittedPullRequestStateXbcf65c26() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewSubmittedPullRequestStateXbcf65c26()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewSubmittedPullRequestStateXbcf65c26 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedPullRequestStateXbcf65c26> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewSubmittedPullRequestStateXbcf65c26", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedPullRequestStateXbcf65c26 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedPullRequestStateXbcf65c26) {
      encoder.encodeString(value.value)
    }
  }
}
