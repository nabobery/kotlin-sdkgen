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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputWebSearchServerToolItem/properties/action/properties/sources/i
 * tems/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSod5a49116
  .Serializer::class)
public sealed class InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSod5a49116 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `url`.
   */
  public data object Url : InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSod5a49116() {
    public override val `value`: String = "url"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSod5a49116()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSod5a49116 = when (value) {
      Url.value -> Url
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSod5a49116> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSod5a49116", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSod5a49116 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputWebSearchServerToolItemPropertiesActionPropertiesSod5a49116) {
      encoder.encodeString(value.value)
    }
  }
}
