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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/FailedEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasFailedEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasFailedEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.failed`.
   */
  public data object ResponseFailed : InlineComponentsSchemasFailedEventPropertiesType() {
    public override val `value`: String = "response.failed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasFailedEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasFailedEventPropertiesType = when (value) {
      ResponseFailed.value -> ResponseFailed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasFailedEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasFailedEventPropertiesType",
          PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasFailedEventPropertiesType = fromValue(decoder
      .decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasFailedEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
