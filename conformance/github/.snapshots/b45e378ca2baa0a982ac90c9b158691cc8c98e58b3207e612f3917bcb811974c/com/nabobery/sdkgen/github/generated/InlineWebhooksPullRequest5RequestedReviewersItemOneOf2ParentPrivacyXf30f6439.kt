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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/requested_reviewers/items/oneOf/1
 * /properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/requested_reviewers/items/oneOf/1
 * /properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhooksPullRequest5RequestedReviewersItemOneOf2ParentPrivacyXf30f6439.Serializer::class)
public sealed class InlineWebhooksPullRequest5RequestedReviewersItemOneOf2ParentPrivacyXf30f6439 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhooksPullRequest5RequestedReviewersItemOneOf2ParentPrivacyXf30f6439() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhooksPullRequest5RequestedReviewersItemOneOf2ParentPrivacyXf30f6439() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhooksPullRequest5RequestedReviewersItemOneOf2ParentPrivacyXf30f6439() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5RequestedReviewersItemOneOf2ParentPrivacyXf30f6439()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5RequestedReviewersItemOneOf2ParentPrivacyXf30f6439 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5RequestedReviewersItemOneOf2ParentPrivacyXf30f6439> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5RequestedReviewersItemOneOf2ParentPrivacyXf30f6439", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5RequestedReviewersItemOneOf2ParentPrivacyXf30f6439 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5RequestedReviewersItemOneOf2ParentPrivacyXf30f6439) {
      encoder.encodeString(value.value)
    }
  }
}
