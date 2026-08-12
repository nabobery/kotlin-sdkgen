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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/head/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/head/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedPullRequestHeadUserTypeXcc61a2d1.Serializer::class)
public sealed class InlineWebhookPullRequestReviewThreadResolvedPullRequestHeadUserTypeXcc61a2d1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewThreadResolvedPullRequestHeadUserTypeXcc61a2d1() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewThreadResolvedPullRequestHeadUserTypeXcc61a2d1() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewThreadResolvedPullRequestHeadUserTypeXcc61a2d1() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewThreadResolvedPullRequestHeadUserTypeXcc61a2d1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewThreadResolvedPullRequestHeadUserTypeXcc61a2d1 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedPullRequestHeadUserTypeXcc61a2d1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewThreadResolvedPullRequestHeadUserTypeXcc61a2d1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedPullRequestHeadUserTypeXcc61a2d1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedPullRequestHeadUserTypeXcc61a2d1) {
      encoder.encodeString(value.value)
    }
  }
}
