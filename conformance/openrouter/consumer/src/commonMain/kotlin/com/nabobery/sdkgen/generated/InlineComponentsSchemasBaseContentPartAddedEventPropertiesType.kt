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
 * sdkgen://source/openapi.yaml#/components/schemas/BaseContentPartAddedEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseContentPartAddedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseContentPartAddedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.content_part.added`.
   */
  public data object ResponseContentPartAdded : InlineComponentsSchemasBaseContentPartAddedEventPropertiesType() {
    public override val `value`: String = "response.content_part.added"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseContentPartAddedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseContentPartAddedEventPropertiesType =
      when (value) {
      ResponseContentPartAdded.value -> ResponseContentPartAdded
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseContentPartAddedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseContentPartAddedEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseContentPartAddedEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseContentPartAddedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
