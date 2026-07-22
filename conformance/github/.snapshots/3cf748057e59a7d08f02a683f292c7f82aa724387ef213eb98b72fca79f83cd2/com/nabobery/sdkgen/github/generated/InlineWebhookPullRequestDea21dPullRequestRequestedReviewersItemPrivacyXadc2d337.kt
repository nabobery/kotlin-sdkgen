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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/req
 * uested_reviewers/items/oneOf/1/properties/parent/properties/privacy.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/req
 * uested_reviewers/items/oneOf/1/properties/parent/properties/privacy
 */
@Serializable(with = InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemPrivacyXadc2d337.Serializer::class)
public sealed class InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemPrivacyXadc2d337 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open`.
   */
  public data object Open : InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemPrivacyXadc2d337() {
    public override val `value`: String = "open"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemPrivacyXadc2d337() {
    public override val `value`: String = "closed"
  }

  /**
   * Documented value. Wire value: `secret`.
   */
  public data object Secret : InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemPrivacyXadc2d337() {
    public override val `value`: String = "secret"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemPrivacyXadc2d337()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemPrivacyXadc2d337 = when (value) {
      Open.value -> Open
      Closed.value -> Closed
      Secret.value -> Secret
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemPrivacyXadc2d337> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemPrivacyXadc2d337", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemPrivacyXadc2d337 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemPrivacyXadc2d337) {
      encoder.encodeString(value.value)
    }
  }
}
