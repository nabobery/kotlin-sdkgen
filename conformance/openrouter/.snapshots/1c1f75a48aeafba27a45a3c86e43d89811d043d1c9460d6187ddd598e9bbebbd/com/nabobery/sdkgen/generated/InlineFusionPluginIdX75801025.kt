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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin/properties/id.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FusionPlugin/properties/id
 */
@Serializable(with = InlineFusionPluginIdX75801025.Serializer::class)
public sealed class InlineFusionPluginIdX75801025 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `fusion`.
   */
  public data object Fusion : InlineFusionPluginIdX75801025() {
    public override val `value`: String = "fusion"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFusionPluginIdX75801025()

  public companion object {
    public fun fromValue(`value`: String): InlineFusionPluginIdX75801025 = when (value) {
      Fusion.value -> Fusion
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFusionPluginIdX75801025> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFusionPluginIdX75801025", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFusionPluginIdX75801025 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFusionPluginIdX75801025) {
      encoder.encodeString(value.value)
    }
  }
}
