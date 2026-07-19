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
 * sdkgen://source/openapi.yaml#/components/schemas/ApplyPatchUpdateFileOperation/properties/type.
 */
@Serializable(with = InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `update_file`.
   */
  public data object UpdateFile : InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType() {
    public override val `value`: String = "update_file"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType =
      when (value) {
      UpdateFile.value -> UpdateFile
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasApplyPatchUpdateFileOperationPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
