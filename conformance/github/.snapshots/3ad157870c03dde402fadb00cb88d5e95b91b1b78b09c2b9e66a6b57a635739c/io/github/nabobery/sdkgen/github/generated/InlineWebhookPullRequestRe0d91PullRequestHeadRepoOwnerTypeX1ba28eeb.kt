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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/head/properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-created/properties/pull_request/
 * properties/head/properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestRe0d91PullRequestHeadRepoOwnerTypeX1ba28eeb.Serializer::class)
public sealed class InlineWebhookPullRequestRe0d91PullRequestHeadRepoOwnerTypeX1ba28eeb {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestRe0d91PullRequestHeadRepoOwnerTypeX1ba28eeb() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestRe0d91PullRequestHeadRepoOwnerTypeX1ba28eeb() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestRe0d91PullRequestHeadRepoOwnerTypeX1ba28eeb() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe0d91PullRequestHeadRepoOwnerTypeX1ba28eeb()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe0d91PullRequestHeadRepoOwnerTypeX1ba28eeb = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0d91PullRequestHeadRepoOwnerTypeX1ba28eeb> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe0d91PullRequestHeadRepoOwnerTypeX1ba28eeb", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0d91PullRequestHeadRepoOwnerTypeX1ba28eeb = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0d91PullRequestHeadRepoOwnerTypeX1ba28eeb) {
      encoder.encodeString(value.value)
    }
  }
}
