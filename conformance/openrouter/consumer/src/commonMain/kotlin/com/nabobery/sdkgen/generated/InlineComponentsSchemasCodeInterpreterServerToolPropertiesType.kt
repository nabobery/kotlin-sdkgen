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
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasCodeInterpreterServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCodeInterpreterServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_interpreter`.
   */
  public data object CodeInterpreter : InlineComponentsSchemasCodeInterpreterServerToolPropertiesType() {
    public override val `value`: String = "code_interpreter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCodeInterpreterServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCodeInterpreterServerToolPropertiesType =
      when (value) {
      CodeInterpreter.value -> CodeInterpreter
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCodeInterpreterServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCodeInterpreterServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCodeInterpreterServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCodeInterpreterServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
