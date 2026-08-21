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
 * ded/schema/properties/payment_method_options/properties/customer_balance/properties/bank_transfer/properties/type.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/customer_balance/properties/bank_transfer/properties/type
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `eu_bank_transfer`.
   */
  public data object EuBankTransfer : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82() {
    public override val `value`: String = "eu_bank_transfer"
  }

  /**
   * Documented value. Wire value: `gb_bank_transfer`.
   */
  public data object GbBankTransfer : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82() {
    public override val `value`: String = "gb_bank_transfer"
  }

  /**
   * Documented value. Wire value: `jp_bank_transfer`.
   */
  public data object JpBankTransfer : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82() {
    public override val `value`: String = "jp_bank_transfer"
  }

  /**
   * Documented value. Wire value: `mx_bank_transfer`.
   */
  public data object MxBankTransfer : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82() {
    public override val `value`: String = "mx_bank_transfer"
  }

  /**
   * Documented value. Wire value: `us_bank_transfer`.
   */
  public data object UsBankTransfer : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82() {
    public override val `value`: String = "us_bank_transfer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82 = when (value) {
      EuBankTransfer.value -> EuBankTransfer
      GbBankTransfer.value -> GbBankTransfer
      JpBankTransfer.value -> JpBankTransfer
      MxBankTransfer.value -> MxBankTransfer
      UsBankTransfer.value -> UsBankTransfer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsTypeX299d1c82) {
      encoder.encodeString(value.value)
    }
  }
}
