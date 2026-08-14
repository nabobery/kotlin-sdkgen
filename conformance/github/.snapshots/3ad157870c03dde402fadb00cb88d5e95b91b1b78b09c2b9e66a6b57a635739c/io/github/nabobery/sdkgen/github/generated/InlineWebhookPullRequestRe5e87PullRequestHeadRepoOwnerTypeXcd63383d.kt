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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/head/properties/repo/properties/owner/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/head/properties/repo/properties/owner/properties/type
 */
@Serializable(with = InlineWebhookPullRequestRe5e87PullRequestHeadRepoOwnerTypeXcd63383d.Serializer::class)
public sealed class InlineWebhookPullRequestRe5e87PullRequestHeadRepoOwnerTypeXcd63383d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `Bot`.
   */
  public data object Bot : InlineWebhookPullRequestRe5e87PullRequestHeadRepoOwnerTypeXcd63383d() {
    public override val `value`: String = "Bot"
  }

  /**
   * Documented value. Wire value: `User`.
   */
  public data object User : InlineWebhookPullRequestRe5e87PullRequestHeadRepoOwnerTypeXcd63383d() {
    public override val `value`: String = "User"
  }

  /**
   * Documented value. Wire value: `Organization`.
   */
  public data object Organization : InlineWebhookPullRequestRe5e87PullRequestHeadRepoOwnerTypeXcd63383d() {
    public override val `value`: String = "Organization"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe5e87PullRequestHeadRepoOwnerTypeXcd63383d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe5e87PullRequestHeadRepoOwnerTypeXcd63383d = when (value) {
      Bot.value -> Bot
      User.value -> User
      Organization.value -> Organization
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe5e87PullRequestHeadRepoOwnerTypeXcd63383d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe5e87PullRequestHeadRepoOwnerTypeXcd63383d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5e87PullRequestHeadRepoOwnerTypeXcd63383d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5e87PullRequestHeadRepoOwnerTypeXcd63383d) {
      encoder.encodeString(value.value)
    }
  }
}
