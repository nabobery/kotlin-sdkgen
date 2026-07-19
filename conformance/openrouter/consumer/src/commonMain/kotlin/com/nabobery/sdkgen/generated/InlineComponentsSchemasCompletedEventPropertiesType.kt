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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CompletedEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasCompletedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasCompletedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.completed`.
   */
  public data object ResponseCompleted : InlineComponentsSchemasCompletedEventPropertiesType() {
    public override val `value`: String = "response.completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasCompletedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasCompletedEventPropertiesType = when (value) {
      ResponseCompleted.value -> ResponseCompleted
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasCompletedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasCompletedEventPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasCompletedEventPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasCompletedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
