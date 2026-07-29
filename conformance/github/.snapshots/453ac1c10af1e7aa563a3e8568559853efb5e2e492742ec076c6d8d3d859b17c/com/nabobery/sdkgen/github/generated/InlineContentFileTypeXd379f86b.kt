package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/content-file/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/content-file/properties/type
 */
@Serializable(with = InlineContentFileTypeXd379f86b.Serializer::class)
public sealed class InlineContentFileTypeXd379f86b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineContentFileTypeXd379f86b() {
    public override val `value`: String = "file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContentFileTypeXd379f86b()

  public companion object {
    public fun fromValue(`value`: String): InlineContentFileTypeXd379f86b = when (value) {
      File.value -> File
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineContentFileTypeXd379f86b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineContentFileTypeXd379f86b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContentFileTypeXd379f86b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContentFileTypeXd379f86b) {
      encoder.encodeString(value.value)
    }
  }
}
