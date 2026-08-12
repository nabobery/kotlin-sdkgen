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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/requested_t
 * eam/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/requested_t
 * eam/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf2RequestedTeamPrivacyX08685c47.Serializer::class)
public sealed class InlineWebhookPullRequestReviewRequestedOneOf2RequestedTeamPrivacyX08685c47 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestReviewRequestedOneOf2RequestedTeamPrivacyX08685c47() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestReviewRequestedOneOf2RequestedTeamPrivacyX08685c47() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestReviewRequestedOneOf2RequestedTeamPrivacyX08685c47() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewRequestedOneOf2RequestedTeamPrivacyX08685c47()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewRequestedOneOf2RequestedTeamPrivacyX08685c47 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf2RequestedTeamPrivacyX08685c47> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewRequestedOneOf2RequestedTeamPrivacyX08685c47", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf2RequestedTeamPrivacyX08685c47 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf2RequestedTeamPrivacyX08685c47) {
      encoder.encodeString(value.value)
    }
  }
}
