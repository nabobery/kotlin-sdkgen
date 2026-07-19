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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningDeltaEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseReasoningDeltaEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseReasoningDeltaEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_text.delta`.
   */
  public data object ResponseReasoningTextDelta : InlineComponentsSchemasBaseReasoningDeltaEventPropertiesType() {
    public override val `value`: String = "response.reasoning_text.delta"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseReasoningDeltaEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseReasoningDeltaEventPropertiesType = when (value) {
      ResponseReasoningTextDelta.value -> ResponseReasoningTextDelta
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseReasoningDeltaEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseReasoningDeltaEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseReasoningDeltaEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseReasoningDeltaEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
