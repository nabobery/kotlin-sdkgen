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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/head/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/head/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadUnresolvedPullRequestHeadUserTypeX92183fe7.Serializer::class)
public sealed class InlineWebhookPullRequestReviewThreadUnresolvedPullRequestHeadUserTypeX92183fe7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewThreadUnresolvedPullRequestHeadUserTypeX92183fe7() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewThreadUnresolvedPullRequestHeadUserTypeX92183fe7() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewThreadUnresolvedPullRequestHeadUserTypeX92183fe7() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewThreadUnresolvedPullRequestHeadUserTypeX92183fe7()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestHeadUserTypeX92183fe7 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestHeadUserTypeX92183fe7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewThreadUnresolvedPullRequestHeadUserTypeX92183fe7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestHeadUserTypeX92183fe7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestHeadUserTypeX92183fe7) {
      encoder.encodeString(value.value)
    }
  }
}
