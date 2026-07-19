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
 */
@Serializable(with = InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand.Serializer::class)
public sealed class InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `view`.
   */
  public data object View : InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand() {
    public override val `value`: String = "view"
  }

  /**
   * Documented value. Wire value: `create`.
   */
  public data object Create : InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand() {
    public override val `value`: String = "create"
  }

  /**
   * Documented value. Wire value: `str_replace`.
   */
  public data object StrReplace : InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand() {
    public override val `value`: String = "str_replace"
  }

  /**
   * Documented value. Wire value: `insert`.
   */
  public data object Insert : InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand() {
    public override val `value`: String = "insert"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand =
      when (value) {
      View.value -> View
      Create.value -> Create
      StrReplace.value -> StrReplace
      Insert.value -> Insert
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputTextEditorServerToolItemPropertiesCommand) {
      encoder.encodeString(value.value)
    }
  }
}
