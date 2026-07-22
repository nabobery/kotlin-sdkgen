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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/reque
 * sted_reviewers/items/oneOf/1/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/reque
 * sted_reviewers/items/oneOf/1/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyXd1dd0ba1.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyXd1dd0ba1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyXd1dd0ba1() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyXd1dd0ba1() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyXd1dd0ba1() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyXd1dd0ba1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyXd1dd0ba1 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyXd1dd0ba1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyXd1dd0ba1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyXd1dd0ba1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemPrivacyXd1dd0ba1) {
      encoder.encodeString(value.value)
    }
  }
}
