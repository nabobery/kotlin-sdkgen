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
 * Selected network to process this Subscription on. Depends on the available networks of the card attached to the
 * Subscription. Can be only set confirm-time.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_payment_method_options_card/properties/network
 */
@Serializable(with = InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa.Serializer::class)
public sealed class InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `amex`.
   */
  public data object Amex : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "amex"
  }

  /**
   * Documented value. Wire value: `cartes_bancaires`.
   */
  public data object CartesBancaires : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "cartes_bancaires"
  }

  /**
   * Documented value. Wire value: `diners`.
   */
  public data object Diners : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "diners"
  }

  /**
   * Documented value. Wire value: `discover`.
   */
  public data object Discover : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "discover"
  }

  /**
   * Documented value. Wire value: `eftpos_au`.
   */
  public data object EftposAu : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "eftpos_au"
  }

  /**
   * Documented value. Wire value: `girocard`.
   */
  public data object Girocard : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "girocard"
  }

  /**
   * Documented value. Wire value: `interac`.
   */
  public data object Interac : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "interac"
  }

  /**
   * Documented value. Wire value: `jcb`.
   */
  public data object Jcb : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "jcb"
  }

  /**
   * Documented value. Wire value: `link`.
   */
  public data object Link : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "link"
  }

  /**
   * Documented value. Wire value: `mastercard`.
   */
  public data object Mastercard : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "mastercard"
  }

  /**
   * Documented value. Wire value: `unionpay`.
   */
  public data object Unionpay : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "unionpay"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `visa`.
   */
  public data object Visa : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa() {
    public override val `value`: String = "visa"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa()

  public companion object {
    public fun fromValue(`value`: String): InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa = when (value) {
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

  internal object Serializer : KSerializer<InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionPaymentMethodOptionsCardNetworkXe9bf37aa) {
      encoder.encodeString(value.value)
    }
  }
}
