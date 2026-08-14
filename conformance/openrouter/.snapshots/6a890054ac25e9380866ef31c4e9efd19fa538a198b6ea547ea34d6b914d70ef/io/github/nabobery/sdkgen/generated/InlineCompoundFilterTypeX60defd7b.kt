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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/schemas/CompoundFilter/properties/type.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CompoundFilter/properties/type
 */
@Serializable(with = InlineCompoundFilterTypeX60defd7b.Serializer::class)
public sealed class InlineCompoundFilterTypeX60defd7b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `and`.
   */
  public data object And : InlineCompoundFilterTypeX60defd7b() {
    public override val `value`: String = "and"
  }

  /**
   * Documented value. Wire value: `or`.
   */
  public data object Or : InlineCompoundFilterTypeX60defd7b() {
    public override val `value`: String = "or"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCompoundFilterTypeX60defd7b()

  public companion object {
    public fun fromValue(`value`: String): InlineCompoundFilterTypeX60defd7b = when (value) {
      And.value -> And
      Or.value -> Or
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCompoundFilterTypeX60defd7b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.InlineCompoundFilterTypeX60defd7b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCompoundFilterTypeX60defd7b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCompoundFilterTypeX60defd7b) {
      encoder.encodeString(value.value)
    }
  }
}
