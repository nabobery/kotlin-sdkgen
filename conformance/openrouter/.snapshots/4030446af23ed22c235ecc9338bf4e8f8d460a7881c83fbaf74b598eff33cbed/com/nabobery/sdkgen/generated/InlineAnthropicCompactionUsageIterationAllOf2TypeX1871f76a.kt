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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicCompactionUsageIteration/allOf/1/properties/type
 */
@Serializable(with = InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a.Serializer::class)
public sealed class InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `compaction`.
   */
  public data object Compaction : InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a() {
    public override val `value`: String = "compaction"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a()

  public companion object {
    public fun fromValue(`value`: String): InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a = when (value) {
      Compaction.value -> Compaction
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicCompactionUsageIterationAllOf2TypeX1871f76a) {
      encoder.encodeString(value.value)
    }
  }
}
