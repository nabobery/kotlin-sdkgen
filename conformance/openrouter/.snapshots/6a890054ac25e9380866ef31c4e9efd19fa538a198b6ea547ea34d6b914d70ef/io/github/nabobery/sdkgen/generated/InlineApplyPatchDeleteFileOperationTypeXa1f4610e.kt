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
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchDeleteFileOperation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchDeleteFileOperation/properties/type
 */
@Serializable(with = InlineApplyPatchDeleteFileOperationTypeXa1f4610e.Serializer::class)
public sealed class InlineApplyPatchDeleteFileOperationTypeXa1f4610e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `delete_file`.
   */
  public data object DeleteFile : InlineApplyPatchDeleteFileOperationTypeXa1f4610e() {
    public override val `value`: String = "delete_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplyPatchDeleteFileOperationTypeXa1f4610e()

  public companion object {
    public fun fromValue(`value`: String): InlineApplyPatchDeleteFileOperationTypeXa1f4610e = when (value) {
      DeleteFile.value -> DeleteFile
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplyPatchDeleteFileOperationTypeXa1f4610e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineApplyPatchDeleteFileOperationTypeXa1f4610e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplyPatchDeleteFileOperationTypeXa1f4610e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplyPatchDeleteFileOperationTypeXa1f4610e) {
      encoder.encodeString(value.value)
    }
  }
}
