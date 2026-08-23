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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properti
 * es/financial_connections/properties/prefetch/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/payment_settings/properties/payment_method_options/properties/us_bank_account/anyOf/0/properti
 * es/financial_connections/properties/prefetch/items
 */
@Serializable(with = InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd.Serializer::class)
public sealed class InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balances`.
   */
  public data object Balances : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd() {
    public override val `value`: String = "balances"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd = when (value) {
      Balances.value -> Balances
      Ownership.value -> Ownership
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormPaymentSettingsPaymentMethodOptionsItemX0c802dbd) {
      encoder.encodeString(value.value)
    }
  }
}
