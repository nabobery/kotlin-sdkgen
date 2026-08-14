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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/hea
 * d/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-dequeued/properties/pull_request/properties/hea
 * d/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestDequeuedPullRequestHeadRepoVisibilityX50edda87.Serializer::class)
public sealed class InlineWebhookPullRequestDequeuedPullRequestHeadRepoVisibilityX50edda87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestDequeuedPullRequestHeadRepoVisibilityX50edda87() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestDequeuedPullRequestHeadRepoVisibilityX50edda87() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestDequeuedPullRequestHeadRepoVisibilityX50edda87() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestDequeuedPullRequestHeadRepoVisibilityX50edda87()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestDequeuedPullRequestHeadRepoVisibilityX50edda87 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestDequeuedPullRequestHeadRepoVisibilityX50edda87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestDequeuedPullRequestHeadRepoVisibilityX50edda87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestDequeuedPullRequestHeadRepoVisibilityX50edda87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestDequeuedPullRequestHeadRepoVisibilityX50edda87) {
      encoder.encodeString(value.value)
    }
  }
}
