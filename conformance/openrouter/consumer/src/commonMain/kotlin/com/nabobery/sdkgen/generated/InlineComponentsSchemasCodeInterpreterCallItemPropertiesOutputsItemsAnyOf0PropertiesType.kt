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
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/0/properties/
 * type.
 */
@Serializable(with = InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `image`.
   */
  public data object Image : InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType() {
    public override val `value`: String = "image"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType = when (value) {
      Image.value -> Image
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf0PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
