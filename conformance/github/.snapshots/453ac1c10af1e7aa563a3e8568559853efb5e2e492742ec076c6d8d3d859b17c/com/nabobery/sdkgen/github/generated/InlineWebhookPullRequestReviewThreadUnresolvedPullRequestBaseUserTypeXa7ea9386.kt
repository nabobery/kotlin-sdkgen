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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/base/properties/user/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/base/properties/user/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewThreadUnresolvedPullRequestBaseUserTypeXa7ea9386.Serializer::class)
public sealed class InlineWebhookPullRequestReviewThreadUnresolvedPullRequestBaseUserTypeXa7ea9386 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewThreadUnresolvedPullRequestBaseUserTypeXa7ea9386() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewThreadUnresolvedPullRequestBaseUserTypeXa7ea9386() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewThreadUnresolvedPullRequestBaseUserTypeXa7ea9386() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewThreadUnresolvedPullRequestBaseUserTypeXa7ea9386()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestBaseUserTypeXa7ea9386 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestReviewThreadUnresolvedPullRequestBaseUserTypeXa7ea9386> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewThreadUnresolvedPullRequestBaseUserTypeXa7ea9386", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewThreadUnresolvedPullRequestBaseUserTypeXa7ea9386 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewThreadUnresolvedPullRequestBaseUserTypeXa7ea9386) {
      encoder.encodeString(value.value)
    }
  }
}
