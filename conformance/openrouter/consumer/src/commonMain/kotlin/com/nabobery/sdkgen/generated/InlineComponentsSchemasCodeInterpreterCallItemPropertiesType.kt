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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasCodeInterpreterCallItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCodeInterpreterCallItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `code_interpreter_call`.
   */
  public data object CodeInterpreterCall : InlineComponentsSchemasCodeInterpreterCallItemPropertiesType() {
    public override val `value`: String = "code_interpreter_call"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCodeInterpreterCallItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCodeInterpreterCallItemPropertiesType = when (value) {
      CodeInterpreterCall.value -> CodeInterpreterCall
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCodeInterpreterCallItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCodeInterpreterCallItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCodeInterpreterCallItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCodeInterpreterCallItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
