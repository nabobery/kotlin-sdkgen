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
 * Bank account verification method. The default value is `automatic`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/checkout_acss_debit_payment_method_options/properties/verification_m
 * ethod
 */
@Serializable(with = InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d.Serializer::class)
public sealed class InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `automatic`.
   */
  public data object Automatic : InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d() {
    public override val `value`: String = "automatic"
  }

  /**
   * Documented value. Wire value: `instant`.
   */
  public data object Instant : InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d() {
    public override val `value`: String = "instant"
  }

  /**
   * Documented value. Wire value: `microdeposits`.
   */
  public data object Microdeposits : InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d() {
    public override val `value`: String = "microdeposits"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d()

  public companion object {
    public fun fromValue(`value`: String): InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d = when (value) {
      Automatic.value -> Automatic
      Instant.value -> Instant
      Microdeposits.value -> Microdeposits
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutAcssDebitPaymentMethodOptionsVerificationMethodX47ad3a9d) {
      encoder.encodeString(value.value)
    }
  }
}
