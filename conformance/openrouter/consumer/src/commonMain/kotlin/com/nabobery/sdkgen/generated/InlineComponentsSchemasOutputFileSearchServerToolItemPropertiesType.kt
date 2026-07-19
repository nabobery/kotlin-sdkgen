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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputFileSearchServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:file_search`.
   */
  public data object OpenrouterFileSearch : InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:file_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType =
      when (value) {
      OpenrouterFileSearch.value -> OpenrouterFileSearch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputFileSearchServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
