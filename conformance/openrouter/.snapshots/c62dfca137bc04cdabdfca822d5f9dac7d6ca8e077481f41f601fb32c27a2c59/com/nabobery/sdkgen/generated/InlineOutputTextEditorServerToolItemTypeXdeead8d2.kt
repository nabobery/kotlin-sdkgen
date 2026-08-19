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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputTextEditorServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputTextEditorServerToolItem/properties/type
 */
@Serializable(with = InlineOutputTextEditorServerToolItemTypeXdeead8d2.Serializer::class)
public sealed class InlineOutputTextEditorServerToolItemTypeXdeead8d2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:text_editor`.
   */
  public data object OpenrouterTextEditor : InlineOutputTextEditorServerToolItemTypeXdeead8d2() {
    public override val `value`: String = "openrouter:text_editor"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputTextEditorServerToolItemTypeXdeead8d2()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputTextEditorServerToolItemTypeXdeead8d2 = when (value) {
      OpenrouterTextEditor.value -> OpenrouterTextEditor
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputTextEditorServerToolItemTypeXdeead8d2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputTextEditorServerToolItemTypeXdeead8d2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputTextEditorServerToolItemTypeXdeead8d2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputTextEditorServerToolItemTypeXdeead8d2) {
      encoder.encodeString(value.value)
    }
  }
}
