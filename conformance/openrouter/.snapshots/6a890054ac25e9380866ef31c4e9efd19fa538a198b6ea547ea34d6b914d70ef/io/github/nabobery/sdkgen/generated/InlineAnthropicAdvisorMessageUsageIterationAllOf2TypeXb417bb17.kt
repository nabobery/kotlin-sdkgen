package io.github.nabobery.sdkgen.generated

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
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicAdvisorMessageUsageIteration/allOf/1/properties/type
 */
@Serializable(with = InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17.Serializer::class)
public sealed class InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `advisor_message`.
   */
  public data object AdvisorMessage : InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17() {
    public override val `value`: String = "advisor_message"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17 = when (value) {
      AdvisorMessage.value -> AdvisorMessage
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicAdvisorMessageUsageIterationAllOf2TypeXb417bb17) {
      encoder.encodeString(value.value)
    }
  }
}
