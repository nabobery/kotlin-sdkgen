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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/base
 * /properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-labeled/properties/pull_request/properties/base
 * /properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestLabeledPullRequestBaseRepoVisibilityXd5d1792a.Serializer::class)
public sealed class InlineWebhookPullRequestLabeledPullRequestBaseRepoVisibilityXd5d1792a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestLabeledPullRequestBaseRepoVisibilityXd5d1792a() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestLabeledPullRequestBaseRepoVisibilityXd5d1792a() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestLabeledPullRequestBaseRepoVisibilityXd5d1792a() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLabeledPullRequestBaseRepoVisibilityXd5d1792a()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLabeledPullRequestBaseRepoVisibilityXd5d1792a = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLabeledPullRequestBaseRepoVisibilityXd5d1792a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLabeledPullRequestBaseRepoVisibilityXd5d1792a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLabeledPullRequestBaseRepoVisibilityXd5d1792a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLabeledPullRequestBaseRepoVisibilityXd5d1792a) {
      encoder.encodeString(value.value)
    }
  }
}
