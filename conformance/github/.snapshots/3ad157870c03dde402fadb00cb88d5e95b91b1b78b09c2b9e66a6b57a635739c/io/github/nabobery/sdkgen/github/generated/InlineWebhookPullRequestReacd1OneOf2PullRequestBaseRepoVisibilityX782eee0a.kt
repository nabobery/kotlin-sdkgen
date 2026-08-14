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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/pull_
 * request/properties/base/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-request-removed/oneOf/1/properties/pull_
 * request/properties/base/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestReacd1OneOf2PullRequestBaseRepoVisibilityX782eee0a.Serializer::class)
public sealed class InlineWebhookPullRequestReacd1OneOf2PullRequestBaseRepoVisibilityX782eee0a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestReacd1OneOf2PullRequestBaseRepoVisibilityX782eee0a() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestReacd1OneOf2PullRequestBaseRepoVisibilityX782eee0a() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestReacd1OneOf2PullRequestBaseRepoVisibilityX782eee0a() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReacd1OneOf2PullRequestBaseRepoVisibilityX782eee0a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReacd1OneOf2PullRequestBaseRepoVisibilityX782eee0a = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReacd1OneOf2PullRequestBaseRepoVisibilityX782eee0a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReacd1OneOf2PullRequestBaseRepoVisibilityX782eee0a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReacd1OneOf2PullRequestBaseRepoVisibilityX782eee0a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReacd1OneOf2PullRequestBaseRepoVisibilityX782eee0a) {
      encoder.encodeString(value.value)
    }
  }
}
