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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemWebSearchCall/properties/action/oneOf/2/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType
  .Serializer::class)
public sealed class InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `find_in_page`.
   */
  public data object FindInPage : InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType() {
    public override val `value`: String = "find_in_page"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType = when (value) {
      FindInPage.value -> FindInPage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputItemWebSearchCallPropertiesActionOneOf2PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
