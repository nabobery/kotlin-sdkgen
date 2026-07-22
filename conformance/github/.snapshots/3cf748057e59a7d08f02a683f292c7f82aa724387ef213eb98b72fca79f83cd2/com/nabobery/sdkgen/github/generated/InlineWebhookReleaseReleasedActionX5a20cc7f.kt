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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-released/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-released/properties/action
 */
@Serializable(with = InlineWebhookReleaseReleasedActionX5a20cc7f.Serializer::class)
public sealed class InlineWebhookReleaseReleasedActionX5a20cc7f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `released`.
   */
  public data object Released : InlineWebhookReleaseReleasedActionX5a20cc7f() {
    public override val `value`: String = "released"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookReleaseReleasedActionX5a20cc7f()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookReleaseReleasedActionX5a20cc7f = when (value) {
      Released.value -> Released
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookReleaseReleasedActionX5a20cc7f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookReleaseReleasedActionX5a20cc7f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookReleaseReleasedActionX5a20cc7f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleaseReleasedActionX5a20cc7f) {
      encoder.encodeString(value.value)
    }
  }
}
