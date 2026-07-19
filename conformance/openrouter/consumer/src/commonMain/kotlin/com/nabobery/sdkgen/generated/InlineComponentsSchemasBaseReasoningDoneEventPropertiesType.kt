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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/BaseReasoningDoneEvent/properties/type.
 */
@Serializable(with = InlineComponentsSchemasBaseReasoningDoneEventPropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasBaseReasoningDoneEventPropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `response.reasoning_text.done`.
   */
  public data object ResponseReasoningTextDone : InlineComponentsSchemasBaseReasoningDoneEventPropertiesType() {
    public override val `value`: String = "response.reasoning_text.done"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasBaseReasoningDoneEventPropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasBaseReasoningDoneEventPropertiesType = when (value) {
      ResponseReasoningTextDone.value -> ResponseReasoningTextDone
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasBaseReasoningDoneEventPropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasBaseReasoningDoneEventPropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasBaseReasoningDoneEventPropertiesType =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasBaseReasoningDoneEventPropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
