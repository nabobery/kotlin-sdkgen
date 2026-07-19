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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicCompactionUsageIteration/allOf/1/properties/type.
 */
@Serializable(with = InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType.Serializer::class)
public sealed class InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `compaction`.
   */
  public data object Compaction : InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType() {
    public override val `value`: String = "compaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType()

  public companion object {
    public fun fromValue(`value`: String): InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType = when (value) {
      Compaction.value -> Compaction
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicCompactionUsageIterationAllOf1PropertiesType) {
      encoder.encodeString(value.value)
    }
  }
}
