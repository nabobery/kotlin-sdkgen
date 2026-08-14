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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/base/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-thread-resolved/properties/pull_request/
 * properties/base/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestRe0df9PullRequestBaseRepoVisibilityX387d7b1c.Serializer::class)
public sealed class InlineWebhookPullRequestRe0df9PullRequestBaseRepoVisibilityX387d7b1c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestRe0df9PullRequestBaseRepoVisibilityX387d7b1c() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestRe0df9PullRequestBaseRepoVisibilityX387d7b1c() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestRe0df9PullRequestBaseRepoVisibilityX387d7b1c() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRe0df9PullRequestBaseRepoVisibilityX387d7b1c()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRe0df9PullRequestBaseRepoVisibilityX387d7b1c = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRe0df9PullRequestBaseRepoVisibilityX387d7b1c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRe0df9PullRequestBaseRepoVisibilityX387d7b1c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRe0df9PullRequestBaseRepoVisibilityX387d7b1c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRe0df9PullRequestBaseRepoVisibilityX387d7b1c) {
      encoder.encodeString(value.value)
    }
  }
}
