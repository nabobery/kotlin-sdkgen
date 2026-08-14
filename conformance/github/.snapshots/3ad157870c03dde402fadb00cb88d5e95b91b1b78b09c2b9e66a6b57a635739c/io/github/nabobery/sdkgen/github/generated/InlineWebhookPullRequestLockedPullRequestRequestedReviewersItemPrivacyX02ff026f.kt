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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/reque
 * sted_reviewers/items/oneOf/1/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/reque
 * sted_reviewers/items/oneOf/1/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyX02ff026f.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyX02ff026f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyX02ff026f() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyX02ff026f() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyX02ff026f() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyX02ff026f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyX02ff026f = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyX02ff026f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyX02ff026f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyX02ff026f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyX02ff026f) {
      encoder.encodeString(value.value)
    }
  }
}
