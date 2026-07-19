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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchDeleteFileOperation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `delete_file`.
   */
  public data object DeleteFile : InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType() {
    public override val `value`: String = "delete_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType =
      when (value) {
      DeleteFile.value -> DeleteFile
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasApplyPatchDeleteFileOperationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
