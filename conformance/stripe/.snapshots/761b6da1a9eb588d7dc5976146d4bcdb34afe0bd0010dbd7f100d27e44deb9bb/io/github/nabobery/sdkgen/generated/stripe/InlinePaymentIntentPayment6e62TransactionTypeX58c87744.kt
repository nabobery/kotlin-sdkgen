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
 * Transaction type of the mandate.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payment_intent_payment_method_options_mandate_options_acss_debit/pro
 * perties/transaction_type
 */
@Serializable(with = InlinePaymentIntentPayment6e62TransactionTypeX58c87744.Serializer::class)
public sealed class InlinePaymentIntentPayment6e62TransactionTypeX58c87744 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `business`.
   */
  public data object Business : InlinePaymentIntentPayment6e62TransactionTypeX58c87744() {
    public override val `value`: String = "business"
  }

  /**
   * Documented value. Wire value: `personal`.
   */
  public data object Personal : InlinePaymentIntentPayment6e62TransactionTypeX58c87744() {
    public override val `value`: String = "personal"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentIntentPayment6e62TransactionTypeX58c87744()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentIntentPayment6e62TransactionTypeX58c87744 = when (value) {
      Business.value -> Business
      Personal.value -> Personal
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentPayment6e62TransactionTypeX58c87744> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlinePaymentIntentPayment6e62TransactionTypeX58c87744", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentIntentPayment6e62TransactionTypeX58c87744 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentPayment6e62TransactionTypeX58c87744) {
      encoder.encodeString(value.value)
    }
  }
}
