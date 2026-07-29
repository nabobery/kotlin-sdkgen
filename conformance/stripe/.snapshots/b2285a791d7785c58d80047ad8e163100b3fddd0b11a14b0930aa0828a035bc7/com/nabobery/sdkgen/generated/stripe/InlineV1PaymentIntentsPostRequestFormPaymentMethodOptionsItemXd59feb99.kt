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
 * /schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer/properties/req
 * uested_address_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/customer_balance/anyOf/0/properties/bank_transfer/properties/req
 * uested_address_types/items
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `aba`.
   */
  public data object Aba : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99() {
    public override val `value`: String = "aba"
  }

  /**
   * Documented value. Wire value: `iban`.
   */
  public data object Iban : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99() {
    public override val `value`: String = "iban"
  }

  /**
   * Documented value. Wire value: `sepa`.
   */
  public data object Sepa : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99() {
    public override val `value`: String = "sepa"
  }

  /**
   * Documented value. Wire value: `sort_code`.
   */
  public data object SortCode : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99() {
    public override val `value`: String = "sort_code"
  }

  /**
   * Documented value. Wire value: `spei`.
   */
  public data object Spei : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99() {
    public override val `value`: String = "spei"
  }

  /**
   * Documented value. Wire value: `swift`.
   */
  public data object Swift : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99() {
    public override val `value`: String = "swift"
  }

  /**
   * Documented value. Wire value: `zengin`.
   */
  public data object Zengin : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99() {
    public override val `value`: String = "zengin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99 = when (value) {
      Aba.value -> Aba
      Iban.value -> Iban
      Sepa.value -> Sepa
      SortCode.value -> SortCode
      Spei.value -> Spei
      Swift.value -> Swift
      Zengin.value -> Zengin
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsItemXd59feb99) {
      encoder.encodeString(value.value)
    }
  }
}
