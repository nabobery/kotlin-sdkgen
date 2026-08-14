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
 * Selected network to process this SetupIntent on. Depends on the available networks of the card attached to the setup
 * intent. Can be only set confirm-time.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/setup_intent_payment_method_options_card/properties/network
 */
@Serializable(with = InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df.Serializer::class)
public sealed class InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `amex`.
   */
  public data object Amex : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "amex"
  }

  /**
   * Documented value. Wire value: `cartes_bancaires`.
   */
  public data object CartesBancaires : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "cartes_bancaires"
  }

  /**
   * Documented value. Wire value: `diners`.
   */
  public data object Diners : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "diners"
  }

  /**
   * Documented value. Wire value: `discover`.
   */
  public data object Discover : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "discover"
  }

  /**
   * Documented value. Wire value: `eftpos_au`.
   */
  public data object EftposAu : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "eftpos_au"
  }

  /**
   * Documented value. Wire value: `girocard`.
   */
  public data object Girocard : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "girocard"
  }

  /**
   * Documented value. Wire value: `interac`.
   */
  public data object Interac : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "interac"
  }

  /**
   * Documented value. Wire value: `jcb`.
   */
  public data object Jcb : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "jcb"
  }

  /**
   * Documented value. Wire value: `link`.
   */
  public data object Link : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "link"
  }

  /**
   * Documented value. Wire value: `mastercard`.
   */
  public data object Mastercard : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "mastercard"
  }

  /**
   * Documented value. Wire value: `unionpay`.
   */
  public data object Unionpay : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "unionpay"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `visa`.
   */
  public data object Visa : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df() {
    public override val `value`: String = "visa"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df()

  public companion object {
    public fun fromValue(`value`: String): InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df = when (value) {
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

  internal object Serializer : KSerializer<InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSetupIntentPaymentMethodOptionsCardNetworkX741ae9df) {
      encoder.encodeString(value.value)
    }
  }
}
