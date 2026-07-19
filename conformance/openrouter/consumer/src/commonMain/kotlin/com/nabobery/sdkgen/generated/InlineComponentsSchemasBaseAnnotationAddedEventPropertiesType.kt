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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseAnnotationAddedEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseAnnotationAddedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseAnnotationAddedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.output_text.annotation.added`.
   */
  public data object ResponseOutputTextAnnotationAdded : InlineComponentsSchemasBaseAnnotationAddedEventPropertiesType() {
    public override val `value`: String = "response.output_text.annotation.added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseAnnotationAddedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseAnnotationAddedEventPropertiesType =
      when (value) {
      ResponseOutputTextAnnotationAdded.value -> ResponseOutputTextAnnotationAdded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseAnnotationAddedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseAnnotationAddedEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseAnnotationAddedEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseAnnotationAddedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
