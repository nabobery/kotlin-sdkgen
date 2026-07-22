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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/thread/proper
 * ties/comments/items/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/thread/proper
 * ties/comments/items/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443.Serializer::class)
public sealed class InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadResolvedThreadCommentsItemUserTypeXfd43c443) {
      encoder.encodeString(value.value)
    }
  }
}
