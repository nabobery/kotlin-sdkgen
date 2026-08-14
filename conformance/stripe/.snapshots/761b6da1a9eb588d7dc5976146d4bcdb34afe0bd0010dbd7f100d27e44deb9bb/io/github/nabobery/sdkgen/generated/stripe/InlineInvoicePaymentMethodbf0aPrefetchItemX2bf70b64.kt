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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_us_bank_account_linked_account_option
 * s/properties/prefetch/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/invoice_payment_method_options_us_bank_account_linked_account_option
 * s/properties/prefetch/items
 */
@Serializable(with = InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64.Serializer::class)
public sealed class InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balances`.
   */
  public data object Balances : InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64() {
    public override val `value`: String = "balances"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64()

  public companion object {
    public fun fromValue(`value`: String): InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64 = when (value) {
      Balances.value -> Balances
      Ownership.value -> Ownership
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineInvoicePaymentMethodbf0aPrefetchItemX2bf70b64) {
      encoder.encodeString(value.value)
    }
  }
}
