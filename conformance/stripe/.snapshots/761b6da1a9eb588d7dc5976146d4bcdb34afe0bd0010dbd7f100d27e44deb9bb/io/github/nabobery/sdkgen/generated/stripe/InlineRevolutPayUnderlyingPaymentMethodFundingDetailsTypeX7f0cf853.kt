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
 * funding type of the underlying payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/revolut_pay_underlying_payment_method_funding_details/properties/typ
 * e
 */
@Serializable(with = InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853.Serializer::class)
public sealed class InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `card`.
   */
  public data object Card : InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853() {
    public override val `value`: String = "card"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853()

  public companion object {
    public fun fromValue(`value`: String): InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853 = when (value) {
      Card.value -> Card
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineRevolutPayUnderlyingPaymentMethodFundingDetailsTypeX7f0cf853) {
      encoder.encodeString(value.value)
    }
  }
}
