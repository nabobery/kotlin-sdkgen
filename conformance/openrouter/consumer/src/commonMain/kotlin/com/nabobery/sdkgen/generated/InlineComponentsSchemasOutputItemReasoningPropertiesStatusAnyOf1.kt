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
 * sdkgen://source/openapi.yaml#/components/schemas/OutputItemReasoning/properties/status/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `incomplete`.
   */
  public data object Incomplete : InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1() {
    public override val `value`: String = "incomplete"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1 =
      when (value) {
      Incomplete.value -> Incomplete
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasOutputItemReasoningPropertiesStatusAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
