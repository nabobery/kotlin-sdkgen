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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OpenRouterFileList/properties/_shape.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenRouterFileList/properties/_shape
 */
@Serializable(with = InlineOpenRouterFileListShapeX1640caf6.Serializer::class)
public sealed class InlineOpenRouterFileListShapeX1640caf6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter`.
   */
  public data object Openrouter : InlineOpenRouterFileListShapeX1640caf6() {
    public override val `value`: String = "openrouter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenRouterFileListShapeX1640caf6()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenRouterFileListShapeX1640caf6 = when (value) {
      Openrouter.value -> Openrouter
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenRouterFileListShapeX1640caf6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenRouterFileListShapeX1640caf6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenRouterFileListShapeX1640caf6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenRouterFileListShapeX1640caf6) {
      encoder.encodeString(value.value)
    }
  }
}
