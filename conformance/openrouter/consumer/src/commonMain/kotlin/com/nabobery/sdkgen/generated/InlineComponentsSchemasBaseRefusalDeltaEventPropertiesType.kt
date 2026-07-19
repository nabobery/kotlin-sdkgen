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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseRefusalDeltaEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseRefusalDeltaEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseRefusalDeltaEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.refusal.delta`.
   */
  public data object ResponseRefusalDelta : InlineComponentsSchemasBaseRefusalDeltaEventPropertiesType() {
    public override val `value`: String = "response.refusal.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseRefusalDeltaEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseRefusalDeltaEventPropertiesType = when (value) {
      ResponseRefusalDelta.value -> ResponseRefusalDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseRefusalDeltaEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseRefusalDeltaEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseRefusalDeltaEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseRefusalDeltaEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
