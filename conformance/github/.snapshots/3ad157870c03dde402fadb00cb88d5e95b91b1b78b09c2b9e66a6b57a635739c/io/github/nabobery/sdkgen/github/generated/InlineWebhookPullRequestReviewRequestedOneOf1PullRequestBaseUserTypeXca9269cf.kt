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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/base/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/0/properties/pull_reques
 * t/properties/base/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf1PullRequestBaseUserTypeXca9269cf.Serializer::class)
public sealed class InlineWebhookPullRequestReviewRequestedOneOf1PullRequestBaseUserTypeXca9269cf {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewRequestedOneOf1PullRequestBaseUserTypeXca9269cf() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewRequestedOneOf1PullRequestBaseUserTypeXca9269cf() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewRequestedOneOf1PullRequestBaseUserTypeXca9269cf() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewRequestedOneOf1PullRequestBaseUserTypeXca9269cf()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestBaseUserTypeXca9269cf = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf1PullRequestBaseUserTypeXca9269cf> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewRequestedOneOf1PullRequestBaseUserTypeXca9269cf", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf1PullRequestBaseUserTypeXca9269cf = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf1PullRequestBaseUserTypeXca9269cf) {
      encoder.encodeString(value.value)
    }
  }
}
