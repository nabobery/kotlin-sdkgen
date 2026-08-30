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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OpenAiFileList/properties/_shape.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAiFileList/properties/_shape
 */
@Serializable(with = InlineOpenAiFileListShapeX12980995.Serializer::class)
public sealed class InlineOpenAiFileListShapeX12980995 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openai`.
   */
  public data object Openai : InlineOpenAiFileListShapeX12980995() {
    public override val `value`: String = "openai"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiFileListShapeX12980995()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiFileListShapeX12980995 = when (value) {
      Openai.value -> Openai
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiFileListShapeX12980995> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiFileListShapeX12980995", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiFileListShapeX12980995 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiFileListShapeX12980995) {
      encoder.encodeString(value.value)
    }
  }
}
