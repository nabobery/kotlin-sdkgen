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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/network.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/card/anyOf/0/properties/network
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b.Serializer::class)
public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `amex`.
   */
  public data object Amex : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "amex"
  }

  /**
   * Documented value. Wire value: `cartes_bancaires`.
   */
  public data object CartesBancaires : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "cartes_bancaires"
  }

  /**
   * Documented value. Wire value: `diners`.
   */
  public data object Diners : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "diners"
  }

  /**
   * Documented value. Wire value: `discover`.
   */
  public data object Discover : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "discover"
  }

  /**
   * Documented value. Wire value: `eftpos_au`.
   */
  public data object EftposAu : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "eftpos_au"
  }

  /**
   * Documented value. Wire value: `girocard`.
   */
  public data object Girocard : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "girocard"
  }

  /**
   * Documented value. Wire value: `interac`.
   */
  public data object Interac : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "interac"
  }

  /**
   * Documented value. Wire value: `jcb`.
   */
  public data object Jcb : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "jcb"
  }

  /**
   * Documented value. Wire value: `link`.
   */
  public data object Link : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "link"
  }

  /**
   * Documented value. Wire value: `mastercard`.
   */
  public data object Mastercard : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "mastercard"
  }

  /**
   * Documented value. Wire value: `unionpay`.
   */
  public data object Unionpay : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "unionpay"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `visa`.
   */
  public data object Visa : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b() {
    public override val `value`: String = "visa"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b = when (value) {
      Amex.value -> Amex
      CartesBancaires.value -> CartesBancaires
      Diners.value -> Diners
      Discover.value -> Discover
      EftposAu.value -> EftposAu
      Girocard.value -> Girocard
      Interac.value -> Interac
      Jcb.value -> Jcb
      Link.value -> Link
      Mastercard.value -> Mastercard
      Unionpay.value -> Unionpay
      Unknown.value -> Unknown
      Visa.value -> Visa
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsNetworkX8e379a6b) {
      encoder.encodeString(value.value)
    }
  }
}
