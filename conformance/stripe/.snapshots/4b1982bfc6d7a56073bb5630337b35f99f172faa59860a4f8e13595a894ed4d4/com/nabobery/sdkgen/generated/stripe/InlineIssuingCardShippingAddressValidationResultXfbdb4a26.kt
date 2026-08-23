package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * The validation result for the shipping address.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_card_shipping_address_validation/properties/result
 */
@Serializable(with = InlineIssuingCardShippingAddressValidationResultXfbdb4a26.Serializer::class)
public sealed class InlineIssuingCardShippingAddressValidationResultXfbdb4a26 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `indeterminate`.
   */
  public data object Indeterminate : InlineIssuingCardShippingAddressValidationResultXfbdb4a26() {
    public override val `value`: String = "indeterminate"
  }

  /**
   * Documented value. Wire value: `likely_deliverable`.
   */
  public data object LikelyDeliverable : InlineIssuingCardShippingAddressValidationResultXfbdb4a26() {
    public override val `value`: String = "likely_deliverable"
  }

  /**
   * Documented value. Wire value: `likely_undeliverable`.
   */
  public data object LikelyUndeliverable : InlineIssuingCardShippingAddressValidationResultXfbdb4a26() {
    public override val `value`: String = "likely_undeliverable"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineIssuingCardShippingAddressValidationResultXfbdb4a26()

  public companion object {
    public fun fromValue(`value`: String): InlineIssuingCardShippingAddressValidationResultXfbdb4a26 = when (value) {
      Indeterminate.value -> Indeterminate
      LikelyDeliverable.value -> LikelyDeliverable
      LikelyUndeliverable.value -> LikelyUndeliverable
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardShippingAddressValidationResultXfbdb4a26> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineIssuingCardShippingAddressValidationResultXfbdb4a26", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineIssuingCardShippingAddressValidationResultXfbdb4a26 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardShippingAddressValidationResultXfbdb4a26) {
      encoder.encodeString(value.value)
    }
  }
}
