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
 * Transaction type of the mandate.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_mandate_options_acss_debit/prope
 * rties/transaction_type
 */
@Serializable(with = InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557.Serializer::class)
public sealed class InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business`.
   */
  public data object Business : InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557() {
    public override val `value`: String = "business"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557() {
    public override val `value`: String = "personal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557 = when (value) {
      Business.value -> Business
      Personal.value -> Personal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMe30d4TransactionTypeX9254f557) {
      encoder.encodeString(value.value)
    }
  }
}
