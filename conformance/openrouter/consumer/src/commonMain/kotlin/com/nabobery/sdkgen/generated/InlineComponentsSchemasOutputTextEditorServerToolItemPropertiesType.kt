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
 */
@Serializable(with = InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:text_editor`.
   */
  public data object OpenrouterTextEditor : InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:text_editor"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesType =
      when (value) {
      OpenrouterTextEditor.value -> OpenrouterTextEditor
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
