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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestUserTypeX2873a6af.Serializer::class)
public sealed class InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestUserTypeX2873a6af {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestUserTypeX2873a6af() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestUserTypeX2873a6af() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestUserTypeX2873a6af() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestUserTypeX2873a6af()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestUserTypeX2873a6af = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestUserTypeX2873a6af> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestUserTypeX2873a6af", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestUserTypeX2873a6af = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestRemovedOneOf1PullRequestUserTypeX2873a6af) {
      encoder.encodeString(value.value)
    }
  }
}
