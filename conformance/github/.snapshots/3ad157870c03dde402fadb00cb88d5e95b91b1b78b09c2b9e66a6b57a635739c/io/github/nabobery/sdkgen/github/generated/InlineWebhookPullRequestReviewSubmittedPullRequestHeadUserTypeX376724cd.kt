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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/head/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/head/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserTypeX376724cd.Serializer::class)
public sealed class InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserTypeX376724cd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserTypeX376724cd() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserTypeX376724cd() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserTypeX376724cd() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserTypeX376724cd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserTypeX376724cd = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserTypeX376724cd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserTypeX376724cd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserTypeX376724cd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedPullRequestHeadUserTypeX376724cd) {
      encoder.encodeString(value.value)
    }
  }
}
