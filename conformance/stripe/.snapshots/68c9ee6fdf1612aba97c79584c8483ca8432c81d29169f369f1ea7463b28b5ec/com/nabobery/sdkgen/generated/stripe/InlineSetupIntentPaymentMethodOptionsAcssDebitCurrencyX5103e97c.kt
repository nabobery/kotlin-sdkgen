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
 * Currency supported by the bank account
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_acss_debit/properties/currency
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c.Serializer::class)
public sealed class InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cad`.
   */
  public data object Cad : InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c() {
    public override val `value`: String = "cad"
  }

  /**
   * Documented value. Wire value: `usd`.
   */
  public data object Usd : InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c() {
    public override val `value`: String = "usd"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c = when (value) {
      Cad.value -> Cad
      Usd.value -> Usd
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsAcssDebitCurrencyX5103e97c) {
      encoder.encodeString(value.value)
    }
  }
}
