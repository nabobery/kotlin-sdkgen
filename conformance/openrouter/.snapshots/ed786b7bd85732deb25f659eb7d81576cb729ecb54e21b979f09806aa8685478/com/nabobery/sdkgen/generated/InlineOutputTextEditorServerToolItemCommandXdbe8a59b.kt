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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputTextEditorServerToolItem/properties/command.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputTextEditorServerToolItem/properties/command
 */
@Serializable(with = InlineOutputTextEditorServerToolItemCommandXdbe8a59b.Serializer::class)
public sealed class InlineOutputTextEditorServerToolItemCommandXdbe8a59b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `view`.
   */
  public data object View : InlineOutputTextEditorServerToolItemCommandXdbe8a59b() {
    public override val `value`: String = "view"
  }

  /**
   * Documented value. Wire value: `create`.
   */
  public data object Create : InlineOutputTextEditorServerToolItemCommandXdbe8a59b() {
    public override val `value`: String = "create"
  }

  /**
   * Documented value. Wire value: `str_replace`.
   */
  public data object StrReplace : InlineOutputTextEditorServerToolItemCommandXdbe8a59b() {
    public override val `value`: String = "str_replace"
  }

  /**
   * Documented value. Wire value: `insert`.
   */
  public data object Insert : InlineOutputTextEditorServerToolItemCommandXdbe8a59b() {
    public override val `value`: String = "insert"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputTextEditorServerToolItemCommandXdbe8a59b()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputTextEditorServerToolItemCommandXdbe8a59b = when (value) {
      View.value -> View
      Create.value -> Create
      StrReplace.value -> StrReplace
      Insert.value -> Insert
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputTextEditorServerToolItemCommandXdbe8a59b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputTextEditorServerToolItemCommandXdbe8a59b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputTextEditorServerToolItemCommandXdbe8a59b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputTextEditorServerToolItemCommandXdbe8a59b) {
      encoder.encodeString(value.value)
    }
  }
}
