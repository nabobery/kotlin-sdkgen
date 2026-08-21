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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-fork/properties/forkee/allOf/0/properties/visibility.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-fork/properties/forkee/allOf/0/properties/visibility
 */
@Serializable(with = InlineWebhookForkForkeeAllOf1VisibilityX5d8003aa.Serializer::class)
public sealed class InlineWebhookForkForkeeAllOf1VisibilityX5d8003aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `public`.
   */
  public data object Public : InlineWebhookForkForkeeAllOf1VisibilityX5d8003aa() {
    public override val `value`: String = "public"
  }

  /**
   * Documented value. Wire value: `private`.
   */
  public data object Private : InlineWebhookForkForkeeAllOf1VisibilityX5d8003aa() {
    public override val `value`: String = "private"
  }

  /**
   * Documented value. Wire value: `internal`.
   */
  public data object Internal : InlineWebhookForkForkeeAllOf1VisibilityX5d8003aa() {
    public override val `value`: String = "internal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookForkForkeeAllOf1VisibilityX5d8003aa()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookForkForkeeAllOf1VisibilityX5d8003aa = when (value) {
      Public.value -> Public
      Private.value -> Private
      Internal.value -> Internal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineWebhookForkForkeeAllOf1VisibilityX5d8003aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookForkForkeeAllOf1VisibilityX5d8003aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookForkForkeeAllOf1VisibilityX5d8003aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookForkForkeeAllOf1VisibilityX5d8003aa) {
      encoder.encodeString(value.value)
    }
  }
}
