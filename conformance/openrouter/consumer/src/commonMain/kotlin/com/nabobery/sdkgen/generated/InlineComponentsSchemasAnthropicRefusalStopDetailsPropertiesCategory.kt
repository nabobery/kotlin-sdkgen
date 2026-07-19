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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicRefusalStopDetails/properties/category.
 */
@Serializable(with = InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cyber`.
   */
  public data object Cyber : InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory() {
    public override val `value`: String = "cyber"
  }

  /**
   * Documented value. Wire value: `bio`.
   */
  public data object Bio : InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory() {
    public override val `value`: String = "bio"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory =
      when (value) {
      Cyber.value -> Cyber
      Bio.value -> Bio
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicRefusalStopDetailsPropertiesCategory) {
      encoder.encodeString(value.value)
    }
  }
}
