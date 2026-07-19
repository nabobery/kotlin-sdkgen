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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FileDeleteResponse/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFileDeleteResponsePropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFileDeleteResponsePropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_deleted`.
   */
  public data object FileDeleted : InlineComponentsSchemasFileDeleteResponsePropertiesType() {
    public override val `value`: String = "file_deleted"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFileDeleteResponsePropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFileDeleteResponsePropertiesType = when (value) {
      FileDeleted.value -> FileDeleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileDeleteResponsePropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFileDeleteResponsePropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileDeleteResponsePropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFileDeleteResponsePropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
