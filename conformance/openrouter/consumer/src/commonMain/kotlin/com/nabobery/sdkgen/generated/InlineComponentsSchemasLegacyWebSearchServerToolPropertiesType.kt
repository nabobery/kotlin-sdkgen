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
 * sdkgen://source/openapi.yaml#/components/schemas/Legacy_WebSearchServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search`.
   */
  public data object WebSearch : InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType() {
    public override val `value`: String = "web_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType =
      when (value) {
      WebSearch.value -> WebSearch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasLegacyWebSearchServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
