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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseInputs/anyOf/1/items/anyOf/0/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message`.
   */
  public data object Message : InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType() {
    public override val `value`: String = "message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType =
      when (value) {
      Message.value -> Message
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasBaseInputsAnyOf1ItemsAnyOf0PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
