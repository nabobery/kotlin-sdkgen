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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/req
 * uested_reviewers/items/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/req
 * uested_reviewers/items/oneOf/0/properties/type
 */
@Serializable(with = InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemTypeX7a6e3e78.Serializer::class)
public sealed class InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemTypeX7a6e3e78 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemTypeX7a6e3e78() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemTypeX7a6e3e78() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemTypeX7a6e3e78() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemTypeX7a6e3e78()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemTypeX7a6e3e78 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemTypeX7a6e3e78> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemTypeX7a6e3e78", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemTypeX7a6e3e78 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDea21dPullRequestRequestedReviewersItemTypeX7a6e3e78) {
      encoder.encodeString(value.value)
    }
  }
}
