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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer/properties/typ
 * e.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer/properties/typ
 * e
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eu_bank_transfer`.
   */
  public data object EuBankTransfer : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db() {
    public override val `value`: String = "eu_bank_transfer"
  }

  /**
   * Documented value. Wire value: `gb_bank_transfer`.
   */
  public data object GbBankTransfer : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db() {
    public override val `value`: String = "gb_bank_transfer"
  }

  /**
   * Documented value. Wire value: `jp_bank_transfer`.
   */
  public data object JpBankTransfer : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db() {
    public override val `value`: String = "jp_bank_transfer"
  }

  /**
   * Documented value. Wire value: `mx_bank_transfer`.
   */
  public data object MxBankTransfer : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db() {
    public override val `value`: String = "mx_bank_transfer"
  }

  /**
   * Documented value. Wire value: `us_bank_transfer`.
   */
  public data object UsBankTransfer : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db() {
    public override val `value`: String = "us_bank_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db = when (value) {
      EuBankTransfer.value -> EuBankTransfer
      GbBankTransfer.value -> GbBankTransfer
      JpBankTransfer.value -> JpBankTransfer
      MxBankTransfer.value -> MxBankTransfer
      UsBankTransfer.value -> UsBankTransfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsTypeXb93dc9db) {
      encoder.encodeString(value.value)
    }
  }
}
