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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FilePath/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FilePath/properties/type
 */
@Serializable(with = InlineFilePathTypeXd16b3395.Serializer::class)
public sealed class InlineFilePathTypeXd16b3395 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_path`.
   */
  public data object FilePath : InlineFilePathTypeXd16b3395() {
    public override val `value`: String = "file_path"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFilePathTypeXd16b3395()

  public companion object {
    public fun fromValue(`value`: String): InlineFilePathTypeXd16b3395 = when (value) {
      FilePath.value -> FilePath
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFilePathTypeXd16b3395> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFilePathTypeXd16b3395", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFilePathTypeXd16b3395 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFilePathTypeXd16b3395) {
      encoder.encodeString(value.value)
    }
  }
}
