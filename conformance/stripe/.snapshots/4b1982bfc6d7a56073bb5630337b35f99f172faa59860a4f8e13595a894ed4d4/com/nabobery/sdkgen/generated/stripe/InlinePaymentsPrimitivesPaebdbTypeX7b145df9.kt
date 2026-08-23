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
 * Funding type of the underlying payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_revolut_
 * pay_details_resource_funding/properties/type
 */
@Serializable(with = InlinePaymentsPrimitivesPaebdbTypeX7b145df9.Serializer::class)
public sealed class InlinePaymentsPrimitivesPaebdbTypeX7b145df9 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlinePaymentsPrimitivesPaebdbTypeX7b145df9() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPaebdbTypeX7b145df9()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPaebdbTypeX7b145df9 = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPaebdbTypeX7b145df9> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPaebdbTypeX7b145df9", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPaebdbTypeX7b145df9 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPaebdbTypeX7b145df9) {
      encoder.encodeString(value.value)
    }
  }
}
