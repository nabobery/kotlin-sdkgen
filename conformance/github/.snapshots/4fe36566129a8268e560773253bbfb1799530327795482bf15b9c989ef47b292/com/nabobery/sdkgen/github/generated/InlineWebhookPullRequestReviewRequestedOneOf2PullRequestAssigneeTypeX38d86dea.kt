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
 * t/properties/assignee/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/pull_reques
 * t/properties/assignee/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea.Serializer::class)
public sealed class InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewRequestedOneOf2PullRequestAssigneeTypeX38d86dea) {
      encoder.encodeString(value.value)
    }
  }
}
