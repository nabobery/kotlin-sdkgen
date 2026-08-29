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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/req
 * uested_reviewers/items/oneOf/0/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-assigned/properties/pull_request/properties/req
 * uested_reviewers/items/oneOf/0/properties/type
 */
@Serializable(with = InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f.Serializer::class)
public sealed class InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f() {
    public override val `value`: String = "Organization"
  }

  /**
   * Documented value. Wire value: `Mannequin`.
   */
  public data object Mannequin : InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f() {
    public override val `value`: String = "Mannequin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      Mannequin.value -> Mannequin
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAsbb98PullRequestRequestedReviewersItemTypeXefd5114f) {
      encoder.encodeString(value.value)
    }
  }
}
