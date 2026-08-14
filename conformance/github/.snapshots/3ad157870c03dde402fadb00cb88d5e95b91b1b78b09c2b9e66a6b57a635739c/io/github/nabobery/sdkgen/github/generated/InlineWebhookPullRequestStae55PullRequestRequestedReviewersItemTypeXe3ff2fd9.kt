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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/requ
 * ested_reviewers/items/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/requ
 * ested_reviewers/items/oneOf/0/properties/type
 */
@Serializable(with = InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9.Serializer::class)
public sealed class InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStae55PullRequestRequestedReviewersItemTypeXe3ff2fd9) {
      encoder.encodeString(value.value)
    }
  }
}
