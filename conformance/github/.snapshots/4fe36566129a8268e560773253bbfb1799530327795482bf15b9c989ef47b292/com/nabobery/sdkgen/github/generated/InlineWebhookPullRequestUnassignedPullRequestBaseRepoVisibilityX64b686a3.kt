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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/b
 * ase/properties/repo/properties/visibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-unassigned/properties/pull_request/properties/b
 * ase/properties/repo/properties/visibility
 */
@Serializable(with = InlineWebhookPullRequestUnassignedPullRequestBaseRepoVisibilityX64b686a3.Serializer::class)
public sealed class InlineWebhookPullRequestUnassignedPullRequestBaseRepoVisibilityX64b686a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookPullRequestUnassignedPullRequestBaseRepoVisibilityX64b686a3() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookPullRequestUnassignedPullRequestBaseRepoVisibilityX64b686a3() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookPullRequestUnassignedPullRequestBaseRepoVisibilityX64b686a3() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookPullRequestUnassignedPullRequestBaseRepoVisibilityX64b686a3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookPullRequestUnassignedPullRequestBaseRepoVisibilityX64b686a3 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookPullRequestUnassignedPullRequestBaseRepoVisibilityX64b686a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookPullRequestUnassignedPullRequestBaseRepoVisibilityX64b686a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestUnassignedPullRequestBaseRepoVisibilityX64b686a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestUnassignedPullRequestBaseRepoVisibilityX64b686a3) {
      encoder.encodeString(value.value)
    }
  }
}
