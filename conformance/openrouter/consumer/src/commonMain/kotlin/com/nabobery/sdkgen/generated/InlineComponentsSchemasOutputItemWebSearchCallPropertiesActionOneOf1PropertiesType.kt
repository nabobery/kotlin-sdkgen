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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/1/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `open_page`.
   */
  public data object OpenPage : InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType() {
    public override val `value`: String = "open_page"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType = when (value) {
      OpenPage.value -> OpenPage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf1PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
