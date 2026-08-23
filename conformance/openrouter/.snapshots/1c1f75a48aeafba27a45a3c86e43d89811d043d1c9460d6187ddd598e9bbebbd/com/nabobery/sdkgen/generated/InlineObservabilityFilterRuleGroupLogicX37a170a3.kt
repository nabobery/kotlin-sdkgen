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
 * sdkgen://source/openapi.yaml#/components/schemas/ObservabilityFilterRuleGroup/properties/logic.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityFilterRuleGroup/properties/logic
 */
@Serializable(with = InlineObservabilityFilterRuleGroupLogicX37a170a3.Serializer::class)
public sealed class InlineObservabilityFilterRuleGroupLogicX37a170a3 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `and`.
   */
  public data object And : InlineObservabilityFilterRuleGroupLogicX37a170a3() {
    public override val `value`: String = "and"
  }

  /**
   * Documented value. Wire value: `or`.
   */
  public data object Or : InlineObservabilityFilterRuleGroupLogicX37a170a3() {
    public override val `value`: String = "or"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineObservabilityFilterRuleGroupLogicX37a170a3()

  public companion object {
    public fun fromValue(`value`: String): InlineObservabilityFilterRuleGroupLogicX37a170a3 = when (value) {
      And.value -> And
      Or.value -> Or
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineObservabilityFilterRuleGroupLogicX37a170a3> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineObservabilityFilterRuleGroupLogicX37a170a3", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineObservabilityFilterRuleGroupLogicX37a170a3 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityFilterRuleGroupLogicX37a170a3) {
      encoder.encodeString(value.value)
    }
  }
}
