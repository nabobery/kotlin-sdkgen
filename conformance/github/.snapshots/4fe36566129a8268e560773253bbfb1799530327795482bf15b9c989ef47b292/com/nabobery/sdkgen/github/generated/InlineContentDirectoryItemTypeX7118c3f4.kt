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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/content-directory/items/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/content-directory/items/properties/type
 */
@Serializable(with = InlineContentDirectoryItemTypeX7118c3f4.Serializer::class)
public sealed class InlineContentDirectoryItemTypeX7118c3f4 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `dir`.
   */
  public data object Dir : InlineContentDirectoryItemTypeX7118c3f4() {
    public override val `value`: String = "dir"
  }

  /**
   * Documented value. Wire value: `file`.
   */
  public data object File : InlineContentDirectoryItemTypeX7118c3f4() {
    public override val `value`: String = "file"
  }

  /**
   * Documented value. Wire value: `submodule`.
   */
  public data object Submodule : InlineContentDirectoryItemTypeX7118c3f4() {
    public override val `value`: String = "submodule"
  }

  /**
   * Documented value. Wire value: `symlink`.
   */
  public data object Symlink : InlineContentDirectoryItemTypeX7118c3f4() {
    public override val `value`: String = "symlink"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineContentDirectoryItemTypeX7118c3f4()

  public companion object {
    public fun fromValue(`value`: String): InlineContentDirectoryItemTypeX7118c3f4 = when (value) {
      Dir.value -> Dir
      File.value -> File
      Submodule.value -> Submodule
      Symlink.value -> Symlink
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineContentDirectoryItemTypeX7118c3f4> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineContentDirectoryItemTypeX7118c3f4", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineContentDirectoryItemTypeX7118c3f4 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineContentDirectoryItemTypeX7118c3f4) {
      encoder.encodeString(value.value)
    }
  }
}
