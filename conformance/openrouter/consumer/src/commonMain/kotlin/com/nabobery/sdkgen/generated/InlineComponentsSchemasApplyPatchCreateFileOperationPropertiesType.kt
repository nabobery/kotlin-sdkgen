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
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchCreateFileOperation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `create_file`.
   */
  public data object CreateFile : InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType() {
    public override val `value`: String = "create_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType =
      when (value) {
      CreateFile.value -> CreateFile
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasApplyPatchCreateFileOperationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
