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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputItemAddedEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasOutputItemAddedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemAddedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.output_item.added`.
   */
  public data object ResponseOutputItemAdded : InlineComponentsSchemasOutputItemAddedEventPropertiesType() {
    public override val `value`: String = "response.output_item.added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemAddedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemAddedEventPropertiesType = when (value) {
      ResponseOutputItemAdded.value -> ResponseOutputItemAdded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemAddedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemAddedEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemAddedEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputItemAddedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
