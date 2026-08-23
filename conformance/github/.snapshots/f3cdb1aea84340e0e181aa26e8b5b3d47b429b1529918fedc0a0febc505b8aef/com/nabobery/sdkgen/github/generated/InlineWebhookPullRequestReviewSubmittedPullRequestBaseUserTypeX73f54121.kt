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
 * ties/base/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/base/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedPullRequestBaseUserTypeX73f54121.Serializer::class)
public sealed class InlineWebhookPullRequestReviewSubmittedPullRequestBaseUserTypeX73f54121 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewSubmittedPullRequestBaseUserTypeX73f54121() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewSubmittedPullRequestBaseUserTypeX73f54121() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewSubmittedPullRequestBaseUserTypeX73f54121() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewSubmittedPullRequestBaseUserTypeX73f54121()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewSubmittedPullRequestBaseUserTypeX73f54121 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedPullRequestBaseUserTypeX73f54121> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewSubmittedPullRequestBaseUserTypeX73f54121", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedPullRequestBaseUserTypeX73f54121 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedPullRequestBaseUserTypeX73f54121) {
      encoder.encodeString(value.value)
    }
  }
}
