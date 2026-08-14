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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/head/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-auto-merge-enabled/properties/pull_request/prop
 * erties/head/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestAutoMergeEnabledPullRequestHeadRepoVisibilityX82746233.Serializer::class)
public sealed class InlineWebhookPullRequestAutoMergeEnabledPullRequestHeadRepoVisibilityX82746233 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestAutoMergeEnabledPullRequestHeadRepoVisibilityX82746233() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestAutoMergeEnabledPullRequestHeadRepoVisibilityX82746233() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestAutoMergeEnabledPullRequestHeadRepoVisibilityX82746233() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestAutoMergeEnabledPullRequestHeadRepoVisibilityX82746233()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestAutoMergeEnabledPullRequestHeadRepoVisibilityX82746233 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestAutoMergeEnabledPullRequestHeadRepoVisibilityX82746233> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestAutoMergeEnabledPullRequestHeadRepoVisibilityX82746233", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestAutoMergeEnabledPullRequestHeadRepoVisibilityX82746233 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestAutoMergeEnabledPullRequestHeadRepoVisibilityX82746233) {
      encoder.encodeString(value.value)
    }
  }
}
