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
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchUpdateFileOperation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchUpdateFileOperation/properties/type
 */
@Serializable(with = InlineApplyPatchUpdateFileOperationTypeX6ab9115a.Serializer::class)
public sealed class InlineApplyPatchUpdateFileOperationTypeX6ab9115a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `update_file`.
   */
  public data object UpdateFile : InlineApplyPatchUpdateFileOperationTypeX6ab9115a() {
    public override val `value`: String = "update_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplyPatchUpdateFileOperationTypeX6ab9115a()

  public companion object {
    public fun fromValue(`value`: String): InlineApplyPatchUpdateFileOperationTypeX6ab9115a = when (value) {
      UpdateFile.value -> UpdateFile
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplyPatchUpdateFileOperationTypeX6ab9115a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineApplyPatchUpdateFileOperationTypeX6ab9115a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplyPatchUpdateFileOperationTypeX6ab9115a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplyPatchUpdateFileOperationTypeX6ab9115a) {
      encoder.encodeString(value.value)
    }
  }
}
