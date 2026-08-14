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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/pull_reques
 * t/properties/base/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-requested/oneOf/1/properties/pull_reques
 * t/properties/base/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoVisibilityX8c163e9d.Serializer::class)
public sealed class InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoVisibilityX8c163e9d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoVisibilityX8c163e9d() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoVisibilityX8c163e9d() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoVisibilityX8c163e9d() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoVisibilityX8c163e9d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoVisibilityX8c163e9d = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoVisibilityX8c163e9d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoVisibilityX8c163e9d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoVisibilityX8c163e9d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestReffb1OneOf2PullRequestBaseRepoVisibilityX8c163e9d) {
      encoder.encodeString(value.value)
    }
  }
}
