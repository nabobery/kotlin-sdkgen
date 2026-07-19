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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputCodeInterpreterServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputCodeInterpreterServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputCodeInterpreterServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:code_interpreter`.
   */
  public data object OpenrouterCodeInterpreter : InlineComponentsSchemasOutputCodeInterpreterServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:code_interpreter"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputCodeInterpreterServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputCodeInterpreterServerToolItemPropertiesType =
      when (value) {
      OpenrouterCodeInterpreter.value -> OpenrouterCodeInterpreter
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputCodeInterpreterServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputCodeInterpreterServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputCodeInterpreterServerToolItemPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputCodeInterpreterServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
