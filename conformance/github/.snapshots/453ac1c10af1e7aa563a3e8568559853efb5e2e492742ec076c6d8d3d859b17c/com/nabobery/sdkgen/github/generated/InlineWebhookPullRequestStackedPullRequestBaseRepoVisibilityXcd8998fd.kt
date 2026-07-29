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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/base
 * /properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-stacked/properties/pull_request/properties/base
 * /properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestStackedPullRequestBaseRepoVisibilityXcd8998fd.Serializer::class)
public sealed class InlineWebhookPullRequestStackedPullRequestBaseRepoVisibilityXcd8998fd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestStackedPullRequestBaseRepoVisibilityXcd8998fd() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestStackedPullRequestBaseRepoVisibilityXcd8998fd() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestStackedPullRequestBaseRepoVisibilityXcd8998fd() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestStackedPullRequestBaseRepoVisibilityXcd8998fd()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestStackedPullRequestBaseRepoVisibilityXcd8998fd = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestStackedPullRequestBaseRepoVisibilityXcd8998fd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestStackedPullRequestBaseRepoVisibilityXcd8998fd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestStackedPullRequestBaseRepoVisibilityXcd8998fd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestStackedPullRequestBaseRepoVisibilityXcd8998fd) {
      encoder.encodeString(value.value)
    }
  }
}
