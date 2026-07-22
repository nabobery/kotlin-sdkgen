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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-prereleased/properties/action.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-release-prereleased/properties/action
 */
@Serializable(with = InlineWebhookReleasePrereleasedActionXae82b327.Serializer::class)
public sealed class InlineWebhookReleasePrereleasedActionXae82b327 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `prereleased`.
   */
  public data object Prereleased : InlineWebhookReleasePrereleasedActionXae82b327() {
    public override val `value`: String = "prereleased"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineWebhookReleasePrereleasedActionXae82b327()

  public companion object {
    public fun fromValue(`value`: String): InlineWebhookReleasePrereleasedActionXae82b327 = when (value) {
      Prereleased.value -> Prereleased
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineWebhookReleasePrereleasedActionXae82b327> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineWebhookReleasePrereleasedActionXae82b327", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineWebhookReleasePrereleasedActionXae82b327 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleasePrereleasedActionXae82b327) {
      encoder.encodeString(value.value)
    }
  }
}
