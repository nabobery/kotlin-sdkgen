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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:web_search`.
   */
  public data object OpenrouterWebSearch : InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:web_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType =
      when (value) {
      OpenrouterWebSearch.value -> OpenrouterWebSearch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
