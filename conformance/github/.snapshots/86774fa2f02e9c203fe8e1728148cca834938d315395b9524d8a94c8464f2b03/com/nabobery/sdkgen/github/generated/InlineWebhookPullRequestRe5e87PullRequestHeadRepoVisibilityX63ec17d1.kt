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
 * t/properties/head/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-unresolved/properties/pull_reques
 * t/properties/head/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestRe5e87PullRequestHeadRepoVisibilityX63ec17d1.Serializer::class)
public sealed class InlineWebhookPullRequestRe5e87PullRequestHeadRepoVisibilityX63ec17d1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestRe5e87PullRequestHeadRepoVisibilityX63ec17d1() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestRe5e87PullRequestHeadRepoVisibilityX63ec17d1() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestRe5e87PullRequestHeadRepoVisibilityX63ec17d1() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe5e87PullRequestHeadRepoVisibilityX63ec17d1()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe5e87PullRequestHeadRepoVisibilityX63ec17d1 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe5e87PullRequestHeadRepoVisibilityX63ec17d1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe5e87PullRequestHeadRepoVisibilityX63ec17d1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe5e87PullRequestHeadRepoVisibilityX63ec17d1 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe5e87PullRequestHeadRepoVisibilityX63ec17d1) {
      encoder.encodeString(value.value)
    }
  }
}
