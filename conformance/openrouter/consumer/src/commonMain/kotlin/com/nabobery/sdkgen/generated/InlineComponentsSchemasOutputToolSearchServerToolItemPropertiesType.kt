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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputToolSearchServerToolItem/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputToolSearchServerToolItemPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputToolSearchServerToolItemPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `openrouter:tool_search`.
   */
  public data object OpenrouterToolSearch : InlineComponentsSchemasOutputToolSearchServerToolItemPropertiesType() {
    public override val `value`: String = "openrouter:tool_search"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputToolSearchServerToolItemPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputToolSearchServerToolItemPropertiesType =
      when (value) {
      OpenrouterToolSearch.value -> OpenrouterToolSearch
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputToolSearchServerToolItemPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputToolSearchServerToolItemPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputToolSearchServerToolItemPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputToolSearchServerToolItemPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
