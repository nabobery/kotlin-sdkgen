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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/base/
 * properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-locked/properties/pull_request/properties/base/
 * properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestLockedPullRequestBaseRepoVisibilityX522e2bc3.Serializer::class)
public sealed class InlineWebhookPullRequestLockedPullRequestBaseRepoVisibilityX522e2bc3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestLockedPullRequestBaseRepoVisibilityX522e2bc3() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestLockedPullRequestBaseRepoVisibilityX522e2bc3() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestLockedPullRequestBaseRepoVisibilityX522e2bc3() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestLockedPullRequestBaseRepoVisibilityX522e2bc3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestLockedPullRequestBaseRepoVisibilityX522e2bc3 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestLockedPullRequestBaseRepoVisibilityX522e2bc3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestLockedPullRequestBaseRepoVisibilityX522e2bc3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestLockedPullRequestBaseRepoVisibilityX522e2bc3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestLockedPullRequestBaseRepoVisibilityX522e2bc3) {
      encoder.encodeString(value.value)
    }
  }
}
