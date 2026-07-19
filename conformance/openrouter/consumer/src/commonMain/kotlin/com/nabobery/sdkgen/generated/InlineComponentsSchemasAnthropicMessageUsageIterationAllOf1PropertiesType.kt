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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicMessageUsageIteration/allOf/1/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message`.
   */
  public data object Message : InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType() {
    public override val `value`: String = "message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType =
      when (value) {
      Message.value -> Message
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicMessageUsageIterationAllOf1PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
