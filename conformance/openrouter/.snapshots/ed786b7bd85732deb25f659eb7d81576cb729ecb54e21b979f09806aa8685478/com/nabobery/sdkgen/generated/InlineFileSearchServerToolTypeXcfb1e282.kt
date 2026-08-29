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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FileSearchServerTool/properties/type
 */
@Serializable(with = InlineFileSearchServerToolTypeXcfb1e282.Serializer::class)
public sealed class InlineFileSearchServerToolTypeXcfb1e282 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_search`.
   */
  public data object FileSearch : InlineFileSearchServerToolTypeXcfb1e282() {
    public override val `value`: String = "file_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineFileSearchServerToolTypeXcfb1e282()

  public companion object {
    public fun fromValue(`value`: String): InlineFileSearchServerToolTypeXcfb1e282 = when (value) {
      FileSearch.value -> FileSearch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineFileSearchServerToolTypeXcfb1e282> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineFileSearchServerToolTypeXcfb1e282", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineFileSearchServerToolTypeXcfb1e282 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineFileSearchServerToolTypeXcfb1e282) {
      encoder.encodeString(value.value)
    }
  }
}
