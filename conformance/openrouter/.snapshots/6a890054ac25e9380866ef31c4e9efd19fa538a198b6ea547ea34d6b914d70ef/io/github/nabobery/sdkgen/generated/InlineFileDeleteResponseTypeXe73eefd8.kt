package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FileDeleteResponse/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileDeleteResponse/properties/type
 */
@Serializable(with = InlineFileDeleteResponseTypeXe73eefd8.Serializer::class)
public sealed class InlineFileDeleteResponseTypeXe73eefd8 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_deleted`.
   */
  public data object FileDeleted : InlineFileDeleteResponseTypeXe73eefd8() {
    public override val `value`: String = "file_deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFileDeleteResponseTypeXe73eefd8()

  public companion object {
    public fun fromValue(`value`: String): InlineFileDeleteResponseTypeXe73eefd8 = when (value) {
      FileDeleted.value -> FileDeleted
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFileDeleteResponseTypeXe73eefd8> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineFileDeleteResponseTypeXe73eefd8", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFileDeleteResponseTypeXe73eefd8 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFileDeleteResponseTypeXe73eefd8) {
      encoder.encodeString(value.value)
    }
  }
}
