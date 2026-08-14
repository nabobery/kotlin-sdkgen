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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/reque
 * sted_reviewers/items/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/reque
 * sted_reviewers/items/oneOf/0/properties/type
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestRequestedReviewersItemTypeX89cbdacd) {
      encoder.encodeString(value.value)
    }
  }
}
