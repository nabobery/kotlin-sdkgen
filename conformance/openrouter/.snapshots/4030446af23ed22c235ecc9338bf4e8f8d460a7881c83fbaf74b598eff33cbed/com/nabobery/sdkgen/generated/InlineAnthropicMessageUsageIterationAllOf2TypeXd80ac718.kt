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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicMessageUsageIteration/allOf/1/properties/type
 */
@Serializable(with = InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718.Serializer::class)
public sealed class InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `message`.
   */
  public data object Message : InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718() {
    public override val `value`: String = "message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718 = when (value) {
      Message.value -> Message
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicMessageUsageIterationAllOf2TypeXd80ac718) {
      encoder.encodeString(value.value)
    }
  }
}
