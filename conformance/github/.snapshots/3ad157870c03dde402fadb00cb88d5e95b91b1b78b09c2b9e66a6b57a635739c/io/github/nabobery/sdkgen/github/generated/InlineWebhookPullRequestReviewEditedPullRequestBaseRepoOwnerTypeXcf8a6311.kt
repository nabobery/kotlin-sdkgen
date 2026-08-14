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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/base/properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-edited/properties/pull_request/propertie
 * s/base/properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestReviewEditedPullRequestBaseRepoOwnerTypeXcf8a6311.Serializer::class)
public sealed class InlineWebhookPullRequestReviewEditedPullRequestBaseRepoOwnerTypeXcf8a6311 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestReviewEditedPullRequestBaseRepoOwnerTypeXcf8a6311() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestReviewEditedPullRequestBaseRepoOwnerTypeXcf8a6311() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestReviewEditedPullRequestBaseRepoOwnerTypeXcf8a6311() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReviewEditedPullRequestBaseRepoOwnerTypeXcf8a6311()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReviewEditedPullRequestBaseRepoOwnerTypeXcf8a6311 = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReviewEditedPullRequestBaseRepoOwnerTypeXcf8a6311> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReviewEditedPullRequestBaseRepoOwnerTypeXcf8a6311", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReviewEditedPullRequestBaseRepoOwnerTypeXcf8a6311 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReviewEditedPullRequestBaseRepoOwnerTypeXcf8a6311) {
      encoder.encodeString(value.value)
    }
  }
}
