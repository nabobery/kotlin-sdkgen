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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicAdvisorMessageUsageIteration/allOf/1/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `advisor_message`.
   */
  public data object AdvisorMessage : InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType() {
    public override val `value`: String = "advisor_message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType = when (value) {
      AdvisorMessage.value -> AdvisorMessage
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicAdvisorMessageUsageIterationAllOf1PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
