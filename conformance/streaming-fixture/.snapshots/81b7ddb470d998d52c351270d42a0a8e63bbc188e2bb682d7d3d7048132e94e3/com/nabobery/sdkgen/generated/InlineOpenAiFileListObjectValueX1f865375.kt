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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OpenAiFileList/properties/object.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAiFileList/properties/object
 */
@Serializable(with = InlineOpenAiFileListObjectValueX1f865375.Serializer::class)
public sealed class InlineOpenAiFileListObjectValueX1f865375 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineOpenAiFileListObjectValueX1f865375() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOpenAiFileListObjectValueX1f865375()

  public companion object {
    public fun fromValue(`value`: String): InlineOpenAiFileListObjectValueX1f865375 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiFileListObjectValueX1f865375> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOpenAiFileListObjectValueX1f865375", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOpenAiFileListObjectValueX1f865375 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiFileListObjectValueX1f865375) {
      encoder.encodeString(value.value)
    }
  }
}
