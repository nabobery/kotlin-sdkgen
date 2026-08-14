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
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/head/properties/repo/properties/v
 * isibility.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhooks_pull_request_5/properties/head/properties/repo/properties/v
 * isibility
 */
@Serializable(with = InlineWebhooksPullRequest5HeadRepoVisibilityX5e8161c3.Serializer::class)
public sealed class InlineWebhooksPullRequest5HeadRepoVisibilityX5e8161c3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhooksPullRequest5HeadRepoVisibilityX5e8161c3() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhooksPullRequest5HeadRepoVisibilityX5e8161c3() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhooksPullRequest5HeadRepoVisibilityX5e8161c3() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhooksPullRequest5HeadRepoVisibilityX5e8161c3()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhooksPullRequest5HeadRepoVisibilityX5e8161c3 = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhooksPullRequest5HeadRepoVisibilityX5e8161c3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineWebhooksPullRequest5HeadRepoVisibilityX5e8161c3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhooksPullRequest5HeadRepoVisibilityX5e8161c3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksPullRequest5HeadRepoVisibilityX5e8161c3) {
      encoder.encodeString(value.value)
    }
  }
}
