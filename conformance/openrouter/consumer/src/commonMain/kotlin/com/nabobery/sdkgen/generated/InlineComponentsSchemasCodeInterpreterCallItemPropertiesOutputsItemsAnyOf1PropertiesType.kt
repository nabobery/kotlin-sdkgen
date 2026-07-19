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
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterCallItem/properties/outputs/items/anyOf/1/properties/
 * type.
 */
@Serializable(with = InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `logs`.
   */
  public data object Logs : InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType() {
    public override val `value`: String = "logs"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType = when (value) {
      Logs.value -> Logs
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasCodeInterpreterCallItemPropertiesOutputsItemsAnyOf1PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
