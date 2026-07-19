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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/WebSearchServerTool/properties/type.
 */
@Serializable(with = InlineComponentsSchemasWebSearchServerToolPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasWebSearchServerToolPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `web_search_2025_08_26`.
   */
  public data object WebSearch20250826 : InlineComponentsSchemasWebSearchServerToolPropertiesType() {
    public override val `value`: String = "web_search_2025_08_26"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasWebSearchServerToolPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasWebSearchServerToolPropertiesType = when (value) {
      WebSearch20250826.value -> WebSearch20250826
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasWebSearchServerToolPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasWebSearchServerToolPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasWebSearchServerToolPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasWebSearchServerToolPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
