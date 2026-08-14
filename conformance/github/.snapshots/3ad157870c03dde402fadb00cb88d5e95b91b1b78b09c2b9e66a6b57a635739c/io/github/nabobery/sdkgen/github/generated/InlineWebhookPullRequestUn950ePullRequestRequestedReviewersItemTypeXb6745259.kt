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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/re
 * quested_reviewers/items/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unlabeled/properties/pull_request/properties/re
 * quested_reviewers/items/oneOf/0/properties/type
 */
@Serializable(with = InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259.Serializer::class)
public sealed class InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUn950ePullRequestRequestedReviewersItemTypeXb6745259) {
      encoder.encodeString(value.value)
    }
  }
}
