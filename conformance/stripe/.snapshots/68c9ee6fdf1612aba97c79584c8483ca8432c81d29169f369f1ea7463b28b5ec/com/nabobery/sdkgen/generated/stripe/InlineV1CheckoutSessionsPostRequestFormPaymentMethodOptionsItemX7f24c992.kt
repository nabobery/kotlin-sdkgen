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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections/properties/p
 * refetch/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/us_bank_account/properties/financial_connections/properties/p
 * refetch/items
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `balances`.
   */
  public data object Balances : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992() {
    public override val `value`: String = "balances"
  }

  /**
   * Documented value. Wire value: `ownership`.
   */
  public data object Ownership : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992() {
    public override val `value`: String = "ownership"
  }

  /**
   * Documented value. Wire value: `transactions`.
   */
  public data object Transactions : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992() {
    public override val `value`: String = "transactions"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992 = when (value) {
      Balances.value -> Balances
      Ownership.value -> Ownership
      Transactions.value -> Transactions
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemX7f24c992) {
      encoder.encodeString(value.value)
    }
  }
}
