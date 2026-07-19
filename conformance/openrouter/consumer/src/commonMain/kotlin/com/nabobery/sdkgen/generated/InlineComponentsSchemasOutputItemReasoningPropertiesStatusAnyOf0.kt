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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status/anyOf/0.
 */
@Serializable(with = InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `completed`.
   */
  public data object Completed : InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0() {
    public override val `value`: String = "completed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0 =
      when (value) {
      Completed.value -> Completed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf0) {
      encoder.encodeString(value.value)
    }
  }
}
