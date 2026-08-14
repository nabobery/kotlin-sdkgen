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
 * ties/assignee/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-submitted/properties/pull_request/proper
 * ties/assignee/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06.Serializer::class)
public sealed class InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewSubmittedPullRequestAssigneeTypeX174c2e06) {
      encoder.encodeString(value.value)
    }
  }
}
