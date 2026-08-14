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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/RangeCapability/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/RangeCapability/properties/type
 */
@Serializable(with = InlineRangeCapabilityTypeX74b77171.Serializer::class)
public sealed class InlineRangeCapabilityTypeX74b77171 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `range`.
   */
  public data object Range : InlineRangeCapabilityTypeX74b77171() {
    public override val `value`: String = "range"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRangeCapabilityTypeX74b77171()

  public companion object {
    public fun fromValue(`value`: String): InlineRangeCapabilityTypeX74b77171 = when (value) {
      Range.value -> Range
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRangeCapabilityTypeX74b77171> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineRangeCapabilityTypeX74b77171", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRangeCapabilityTypeX74b77171 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRangeCapabilityTypeX74b77171) {
      encoder.encodeString(value.value)
    }
  }
}
