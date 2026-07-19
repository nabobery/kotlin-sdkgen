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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/action/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `search`.
   */
  public data object Search : InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType() {
    public override val `value`: String = "search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType = when (value) {
      Search.value -> Search
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
