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
 */
@Serializable(with = InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic.Serializer::class)
public sealed class InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `and`.
   */
  public data object And : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic() {
    public override val `value`: String = "and"
  }

  /**
   * Documented value. Wire value: `or`.
   */
  public data object Or : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic() {
    public override val `value`: String = "or"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic =
      when (value) {
      And.value -> And
      Or.value -> Or
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic =
      fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityFilterRuleGroupPropertiesLogic) {
      encoder.encodeString(value.value)
    }
  }
}
