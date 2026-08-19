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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputFilesServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputFilesServerToolItem/properties/type
 */
@Serializable(with = InlineOutputFilesServerToolItemTypeX5fc5dc4b.Serializer::class)
public sealed class InlineOutputFilesServerToolItemTypeX5fc5dc4b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:files`.
   */
  public data object OpenrouterFiles : InlineOutputFilesServerToolItemTypeX5fc5dc4b() {
    public override val `value`: String = "openrouter:files"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputFilesServerToolItemTypeX5fc5dc4b()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputFilesServerToolItemTypeX5fc5dc4b = when (value) {
      OpenrouterFiles.value -> OpenrouterFiles
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputFilesServerToolItemTypeX5fc5dc4b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineOutputFilesServerToolItemTypeX5fc5dc4b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputFilesServerToolItemTypeX5fc5dc4b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputFilesServerToolItemTypeX5fc5dc4b) {
      encoder.encodeString(value.value)
    }
  }
}
