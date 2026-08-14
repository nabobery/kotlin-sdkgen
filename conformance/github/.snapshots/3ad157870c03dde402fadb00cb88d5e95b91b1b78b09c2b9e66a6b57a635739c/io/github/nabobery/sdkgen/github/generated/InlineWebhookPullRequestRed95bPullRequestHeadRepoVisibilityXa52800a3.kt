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
 * roperties/head/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-review-comment-edited/properties/pull_request/p
 * roperties/head/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestRed95bPullRequestHeadRepoVisibilityXa52800a3.Serializer::class)
public sealed class InlineWebhookPullRequestRed95bPullRequestHeadRepoVisibilityXa52800a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestRed95bPullRequestHeadRepoVisibilityXa52800a3() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestRed95bPullRequestHeadRepoVisibilityXa52800a3() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestRed95bPullRequestHeadRepoVisibilityXa52800a3() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestRed95bPullRequestHeadRepoVisibilityXa52800a3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestRed95bPullRequestHeadRepoVisibilityXa52800a3 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestRed95bPullRequestHeadRepoVisibilityXa52800a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestRed95bPullRequestHeadRepoVisibilityXa52800a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestRed95bPullRequestHeadRepoVisibilityXa52800a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestRed95bPullRequestHeadRepoVisibilityXa52800a3) {
      encoder.encodeString(value.value)
    }
  }
}
