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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/OutputMessage/properties/phase/anyOf/1.
 */
@Serializable(with = InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1.Serializer::class)
public sealed class InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `final_answer`.
   */
  public data object FinalAnswer : InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1() {
    public override val `value`: String = "final_answer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1 = when (value) {
      FinalAnswer.value -> FinalAnswer
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1 =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasOutputMessagePropertiesPhaseAnyOf1) {
      encoder.encodeString(value.value)
    }
  }
}
