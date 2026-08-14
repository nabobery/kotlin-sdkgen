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
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/customer_balance/properties/bank_transfer/properties/requeste
 * d_address_types/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/customer_balance/properties/bank_transfer/properties/requeste
 * d_address_types/items
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `aba`.
   */
  public data object Aba : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd() {
    public override val `value`: String = "aba"
  }

  /**
   * Documented value. Wire value: `iban`.
   */
  public data object Iban : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd() {
    public override val `value`: String = "iban"
  }

  /**
   * Documented value. Wire value: `sepa`.
   */
  public data object Sepa : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd() {
    public override val `value`: String = "sepa"
  }

  /**
   * Documented value. Wire value: `sort_code`.
   */
  public data object SortCode : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd() {
    public override val `value`: String = "sort_code"
  }

  /**
   * Documented value. Wire value: `spei`.
   */
  public data object Spei : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd() {
    public override val `value`: String = "spei"
  }

  /**
   * Documented value. Wire value: `swift`.
   */
  public data object Swift : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd() {
    public override val `value`: String = "swift"
  }

  /**
   * Documented value. Wire value: `zengin`.
   */
  public data object Zengin : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd() {
    public override val `value`: String = "zengin"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd = when (value) {
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

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsItemXfac2a4fd) {
      encoder.encodeString(value.value)
    }
  }
}
