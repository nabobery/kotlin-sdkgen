package com.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ModerationPlugin/properties/id.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ModerationPlugin/properties/id
 */
@Serializable(with = InlineModerationPluginIdX7d3ab755.Serializer::class)
public sealed class InlineModerationPluginIdX7d3ab755 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `moderation`.
   */
  public data object Moderation : InlineModerationPluginIdX7d3ab755() {
    public override val `value`: String = "moderation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineModerationPluginIdX7d3ab755()

  public companion object {
    public fun fromValue(`value`: String): InlineModerationPluginIdX7d3ab755 = when (value) {
      Moderation.value -> Moderation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineModerationPluginIdX7d3ab755> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineModerationPluginIdX7d3ab755", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineModerationPluginIdX7d3ab755 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineModerationPluginIdX7d3ab755) {
      encoder.encodeString(value.value)
    }
  }
}
