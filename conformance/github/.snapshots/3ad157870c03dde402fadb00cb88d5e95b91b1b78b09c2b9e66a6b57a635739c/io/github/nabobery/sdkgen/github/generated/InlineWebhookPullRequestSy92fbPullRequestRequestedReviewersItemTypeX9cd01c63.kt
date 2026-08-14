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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * requested_reviewers/items/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * requested_reviewers/items/oneOf/0/properties/type
 */
@Serializable(with = InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63.Serializer::class)
public sealed class InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSy92fbPullRequestRequestedReviewersItemTypeX9cd01c63) {
      encoder.encodeString(value.value)
    }
  }
}
