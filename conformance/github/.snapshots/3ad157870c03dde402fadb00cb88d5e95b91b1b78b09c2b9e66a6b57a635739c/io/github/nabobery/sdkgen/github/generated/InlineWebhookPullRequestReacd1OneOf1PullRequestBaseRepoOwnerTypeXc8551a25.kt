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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/base/properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/0/properties/pull_
 * request/properties/base/properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReacd1OneOf1PullRequestBaseRepoOwnerTypeXc8551a25.Serializer::class)
public sealed class InlineWebhookPullRequestReacd1OneOf1PullRequestBaseRepoOwnerTypeXc8551a25 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReacd1OneOf1PullRequestBaseRepoOwnerTypeXc8551a25() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReacd1OneOf1PullRequestBaseRepoOwnerTypeXc8551a25() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReacd1OneOf1PullRequestBaseRepoOwnerTypeXc8551a25() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReacd1OneOf1PullRequestBaseRepoOwnerTypeXc8551a25()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReacd1OneOf1PullRequestBaseRepoOwnerTypeXc8551a25 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReacd1OneOf1PullRequestBaseRepoOwnerTypeXc8551a25> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReacd1OneOf1PullRequestBaseRepoOwnerTypeXc8551a25", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReacd1OneOf1PullRequestBaseRepoOwnerTypeXc8551a25 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReacd1OneOf1PullRequestBaseRepoOwnerTypeXc8551a25) {
      encoder.encodeString(value.value)
    }
  }
}
