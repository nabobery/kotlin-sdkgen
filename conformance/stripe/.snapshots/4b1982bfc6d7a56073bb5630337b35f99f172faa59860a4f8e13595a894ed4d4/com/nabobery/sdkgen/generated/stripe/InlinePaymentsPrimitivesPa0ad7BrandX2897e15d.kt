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
 * Card brand. Can be `amex`, `cartes_bancaires`, `diners`, `discover`, `eftpos_au`, `jcb`, `link`, `mastercard`,
 * `unionpay`, `visa` or `unknown`.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/payments_primitives_payment_records_resource_payment_method_card_det
 * ails/properties/brand
 */
@Serializable(with = InlinePaymentsPrimitivesPa0ad7BrandX2897e15d.Serializer::class)
public sealed class InlinePaymentsPrimitivesPa0ad7BrandX2897e15d {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `amex`.
   */
  public data object Amex : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "amex"
  }

  /**
   * Documented value. Wire value: `cartes_bancaires`.
   */
  public data object CartesBancaires : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "cartes_bancaires"
  }

  /**
   * Documented value. Wire value: `diners`.
   */
  public data object Diners : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "diners"
  }

  /**
   * Documented value. Wire value: `discover`.
   */
  public data object Discover : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "discover"
  }

  /**
   * Documented value. Wire value: `eftpos_au`.
   */
  public data object EftposAu : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "eftpos_au"
  }

  /**
   * Documented value. Wire value: `interac`.
   */
  public data object Interac : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "interac"
  }

  /**
   * Documented value. Wire value: `jcb`.
   */
  public data object Jcb : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "jcb"
  }

  /**
   * Documented value. Wire value: `link`.
   */
  public data object Link : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "link"
  }

  /**
   * Documented value. Wire value: `mastercard`.
   */
  public data object Mastercard : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "mastercard"
  }

  /**
   * Documented value. Wire value: `unionpay`.
   */
  public data object Unionpay : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "unionpay"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "unknown"
  }

  /**
   * Documented value. Wire value: `visa`.
   */
  public data object Visa : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d() {
    public override val `value`: String = "visa"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentsPrimitivesPa0ad7BrandX2897e15d()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentsPrimitivesPa0ad7BrandX2897e15d = when (value) {
      Amex.value -> Amex
      CartesBancaires.value -> CartesBancaires
      Diners.value -> Diners
      Discover.value -> Discover
      EftposAu.value -> EftposAu
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

  internal object Serializer : KSerializer<InlinePaymentsPrimitivesPa0ad7BrandX2897e15d> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentsPrimitivesPa0ad7BrandX2897e15d", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentsPrimitivesPa0ad7BrandX2897e15d = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentsPrimitivesPa0ad7BrandX2897e15d) {
      encoder.encodeString(value.value)
    }
  }
}
