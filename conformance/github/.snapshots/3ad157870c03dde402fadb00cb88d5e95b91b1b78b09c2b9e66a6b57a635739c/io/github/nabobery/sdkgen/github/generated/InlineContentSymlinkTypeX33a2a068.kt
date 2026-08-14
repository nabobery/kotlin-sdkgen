package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/content-symlink/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/content-symlink/properties/type
 */
@Serializable(with = InlineContentSymlinkTypeX33a2a068.Serializer::class)
public sealed class InlineContentSymlinkTypeX33a2a068 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `symlink`.
   */
  public data object Symlink : InlineContentSymlinkTypeX33a2a068() {
    public override val `value`: String = "symlink"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContentSymlinkTypeX33a2a068()

  public companion object {
    public fun fromValue(`value`: String): InlineContentSymlinkTypeX33a2a068 = when (value) {
      Symlink.value -> Symlink
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContentSymlinkTypeX33a2a068> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineContentSymlinkTypeX33a2a068", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContentSymlinkTypeX33a2a068 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContentSymlinkTypeX33a2a068) {
      encoder.encodeString(value.value)
    }
  }
}
