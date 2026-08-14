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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/base/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/base/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestRed95bPullRequestBaseRepoVisibilityX5a48cdff.Serializer::class)
public sealed class InlineWebhookPullRequestRed95bPullRequestBaseRepoVisibilityX5a48cdff {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestRed95bPullRequestBaseRepoVisibilityX5a48cdff() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestRed95bPullRequestBaseRepoVisibilityX5a48cdff() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestRed95bPullRequestBaseRepoVisibilityX5a48cdff() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRed95bPullRequestBaseRepoVisibilityX5a48cdff()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRed95bPullRequestBaseRepoVisibilityX5a48cdff = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRed95bPullRequestBaseRepoVisibilityX5a48cdff> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRed95bPullRequestBaseRepoVisibilityX5a48cdff", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRed95bPullRequestBaseRepoVisibilityX5a48cdff = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRed95bPullRequestBaseRepoVisibilityX5a48cdff) {
      encoder.encodeString(value.value)
    }
  }
}
