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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/ComputerUseServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasComputerUseServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasComputerUseServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `computer_use_preview`.
   */
  public data object ComputerUsePreview : InlineComponentsSchemasComputerUseServerToolPropertiesType() {
    public override val `value`: String = "computer_use_preview"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasComputerUseServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasComputerUseServerToolPropertiesType = when (value) {
      ComputerUsePreview.value -> ComputerUsePreview
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasComputerUseServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasComputerUseServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasComputerUseServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasComputerUseServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
