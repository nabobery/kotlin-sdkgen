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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/pull_reques
 * t/properties/base/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/pull_reques
 * t/properties/base/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf2PullRequestBaseUserTypeX76c8809d.Serializer::class)
public sealed class InlineWebhookPullRequestReviewRequestedOneOf2PullRequestBaseUserTypeX76c8809d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewRequestedOneOf2PullRequestBaseUserTypeX76c8809d() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewRequestedOneOf2PullRequestBaseUserTypeX76c8809d() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewRequestedOneOf2PullRequestBaseUserTypeX76c8809d() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewRequestedOneOf2PullRequestBaseUserTypeX76c8809d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewRequestedOneOf2PullRequestBaseUserTypeX76c8809d = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf2PullRequestBaseUserTypeX76c8809d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewRequestedOneOf2PullRequestBaseUserTypeX76c8809d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf2PullRequestBaseUserTypeX76c8809d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf2PullRequestBaseUserTypeX76c8809d) {
      encoder.encodeString(value.value)
    }
  }
}
