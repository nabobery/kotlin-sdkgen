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
 */
@Serializable(with = InlineComponentsSchemasFileSearchServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFileSearchServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `file_search`.
   */
  public data object FileSearch : InlineComponentsSchemasFileSearchServerToolPropertiesType() {
    public override val `value`: String = "file_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFileSearchServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFileSearchServerToolPropertiesType = when (value) {
      FileSearch.value -> FileSearch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFileSearchServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFileSearchServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFileSearchServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFileSearchServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
