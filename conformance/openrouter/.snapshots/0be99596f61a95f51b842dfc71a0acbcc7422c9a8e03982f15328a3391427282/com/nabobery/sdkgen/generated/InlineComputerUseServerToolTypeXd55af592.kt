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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ComputerUseServerTool/properties/type
 */
@Serializable(with = InlineComputerUseServerToolTypeXd55af592.Serializer::class)
public sealed class InlineComputerUseServerToolTypeXd55af592 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `computer_use_preview`.
   */
  public data object ComputerUsePreview : InlineComputerUseServerToolTypeXd55af592() {
    public override val `value`: String = "computer_use_preview"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComputerUseServerToolTypeXd55af592()

  public companion object {
    public fun fromValue(`value`: String): InlineComputerUseServerToolTypeXd55af592 = when (value) {
      ComputerUsePreview.value -> ComputerUsePreview
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineComputerUseServerToolTypeXd55af592> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComputerUseServerToolTypeXd55af592", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComputerUseServerToolTypeXd55af592 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComputerUseServerToolTypeXd55af592) {
      encoder.encodeString(value.value)
    }
  }
}
