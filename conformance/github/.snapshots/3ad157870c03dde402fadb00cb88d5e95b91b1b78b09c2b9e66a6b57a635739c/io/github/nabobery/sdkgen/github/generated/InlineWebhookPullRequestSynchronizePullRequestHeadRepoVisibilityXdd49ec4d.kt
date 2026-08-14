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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * head/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-synchronize/properties/pull_request/properties/
 * head/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestSynchronizePullRequestHeadRepoVisibilityXdd49ec4d.Serializer::class)
public sealed class InlineWebhookPullRequestSynchronizePullRequestHeadRepoVisibilityXdd49ec4d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestSynchronizePullRequestHeadRepoVisibilityXdd49ec4d() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestSynchronizePullRequestHeadRepoVisibilityXdd49ec4d() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestSynchronizePullRequestHeadRepoVisibilityXdd49ec4d() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestSynchronizePullRequestHeadRepoVisibilityXdd49ec4d()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestSynchronizePullRequestHeadRepoVisibilityXdd49ec4d = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestSynchronizePullRequestHeadRepoVisibilityXdd49ec4d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestSynchronizePullRequestHeadRepoVisibilityXdd49ec4d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestSynchronizePullRequestHeadRepoVisibilityXdd49ec4d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestSynchronizePullRequestHeadRepoVisibilityXdd49ec4d) {
      encoder.encodeString(value.value)
    }
  }
}
