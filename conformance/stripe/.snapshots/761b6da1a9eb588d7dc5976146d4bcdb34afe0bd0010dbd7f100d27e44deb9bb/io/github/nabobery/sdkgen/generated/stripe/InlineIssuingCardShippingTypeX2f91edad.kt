package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Packaging options.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping/properties/type
 */
@Serializable(with = InlineIssuingCardShippingTypeX2f91edad.Serializer::class)
public sealed class InlineIssuingCardShippingTypeX2f91edad {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bulk`.
   */
  public data object Bulk : InlineIssuingCardShippingTypeX2f91edad() {
    public override val `value`: String = "bulk"
  }

  /**
   * Documented value. Wire value: `individual`.
   */
  public data object Individual : InlineIssuingCardShippingTypeX2f91edad() {
    public override val `value`: String = "individual"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardShippingTypeX2f91edad()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardShippingTypeX2f91edad = when (value) {
      Bulk.value -> Bulk
      Individual.value -> Individual
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardShippingTypeX2f91edad> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineIssuingCardShippingTypeX2f91edad", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardShippingTypeX2f91edad = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardShippingTypeX2f91edad) {
      encoder.encodeString(value.value)
    }
  }
}
