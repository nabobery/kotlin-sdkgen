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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/OutputFileSearchServerToolItem/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputFileSearchServerToolItem/properties/type
 */
@Serializable(with = InlineOutputFileSearchServerToolItemTypeX848145bc.Serializer::class)
public sealed class InlineOutputFileSearchServerToolItemTypeX848145bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:file_search`.
   */
  public data object OpenrouterFileSearch : InlineOutputFileSearchServerToolItemTypeX848145bc() {
    public override val `value`: String = "openrouter:file_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOutputFileSearchServerToolItemTypeX848145bc()

  public companion object {
    public fun fromValue(`value`: String): InlineOutputFileSearchServerToolItemTypeX848145bc = when (value) {
      OpenrouterFileSearch.value -> OpenrouterFileSearch
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOutputFileSearchServerToolItemTypeX848145bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineOutputFileSearchServerToolItemTypeX848145bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOutputFileSearchServerToolItemTypeX848145bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOutputFileSearchServerToolItemTypeX848145bc) {
      encoder.encodeString(value.value)
    }
  }
}
