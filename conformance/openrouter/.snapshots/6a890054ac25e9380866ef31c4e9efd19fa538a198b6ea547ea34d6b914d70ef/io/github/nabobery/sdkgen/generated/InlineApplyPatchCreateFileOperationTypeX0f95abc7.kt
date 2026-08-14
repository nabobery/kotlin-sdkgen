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
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCreateFileOperation/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCreateFileOperation/properties/type
 */
@Serializable(with = InlineApplyPatchCreateFileOperationTypeX0f95abc7.Serializer::class)
public sealed class InlineApplyPatchCreateFileOperationTypeX0f95abc7 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `create_file`.
   */
  public data object CreateFile : InlineApplyPatchCreateFileOperationTypeX0f95abc7() {
    public override val `value`: String = "create_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineApplyPatchCreateFileOperationTypeX0f95abc7()

  public companion object {
    public fun fromValue(`value`: String): InlineApplyPatchCreateFileOperationTypeX0f95abc7 = when (value) {
      CreateFile.value -> CreateFile
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineApplyPatchCreateFileOperationTypeX0f95abc7> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineApplyPatchCreateFileOperationTypeX0f95abc7", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineApplyPatchCreateFileOperationTypeX0f95abc7 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineApplyPatchCreateFileOperationTypeX0f95abc7) {
      encoder.encodeString(value.value)
    }
  }
}
