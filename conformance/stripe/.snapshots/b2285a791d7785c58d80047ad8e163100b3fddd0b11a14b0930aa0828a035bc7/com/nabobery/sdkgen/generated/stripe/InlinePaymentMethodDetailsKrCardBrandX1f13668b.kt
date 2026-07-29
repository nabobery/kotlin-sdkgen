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
 * The local credit or debit card brand.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_kr_card/properties/brand
 */
@Serializable(with = InlinePaymentMethodDetailsKrCardBrandX1f13668b.Serializer::class)
public sealed class InlinePaymentMethodDetailsKrCardBrandX1f13668b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `bc`.
   */
  public data object Bc : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "bc"
  }

  /**
   * Documented value. Wire value: `citi`.
   */
  public data object Citi : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "citi"
  }

  /**
   * Documented value. Wire value: `hana`.
   */
  public data object Hana : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "hana"
  }

  /**
   * Documented value. Wire value: `hyundai`.
   */
  public data object Hyundai : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "hyundai"
  }

  /**
   * Documented value. Wire value: `jeju`.
   */
  public data object Jeju : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "jeju"
  }

  /**
   * Documented value. Wire value: `jeonbuk`.
   */
  public data object Jeonbuk : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "jeonbuk"
  }

  /**
   * Documented value. Wire value: `kakaobank`.
   */
  public data object Kakaobank : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "kakaobank"
  }

  /**
   * Documented value. Wire value: `kbank`.
   */
  public data object Kbank : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "kbank"
  }

  /**
   * Documented value. Wire value: `kdbbank`.
   */
  public data object Kdbbank : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "kdbbank"
  }

  /**
   * Documented value. Wire value: `kookmin`.
   */
  public data object Kookmin : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "kookmin"
  }

  /**
   * Documented value. Wire value: `kwangju`.
   */
  public data object Kwangju : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "kwangju"
  }

  /**
   * Documented value. Wire value: `lotte`.
   */
  public data object Lotte : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "lotte"
  }

  /**
   * Documented value. Wire value: `mg`.
   */
  public data object Mg : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "mg"
  }

  /**
   * Documented value. Wire value: `nh`.
   */
  public data object Nh : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "nh"
  }

  /**
   * Documented value. Wire value: `post`.
   */
  public data object Post : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "post"
  }

  /**
   * Documented value. Wire value: `samsung`.
   */
  public data object Samsung : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "samsung"
  }

  /**
   * Documented value. Wire value: `savingsbank`.
   */
  public data object Savingsbank : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "savingsbank"
  }

  /**
   * Documented value. Wire value: `shinhan`.
   */
  public data object Shinhan : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "shinhan"
  }

  /**
   * Documented value. Wire value: `shinhyup`.
   */
  public data object Shinhyup : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "shinhyup"
  }

  /**
   * Documented value. Wire value: `suhyup`.
   */
  public data object Suhyup : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "suhyup"
  }

  /**
   * Documented value. Wire value: `tossbank`.
   */
  public data object Tossbank : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "tossbank"
  }

  /**
   * Documented value. Wire value: `woori`.
   */
  public data object Woori : InlinePaymentMethodDetailsKrCardBrandX1f13668b() {
    public override val `value`: String = "woori"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlinePaymentMethodDetailsKrCardBrandX1f13668b()

  public companion object {
    public fun fromValue(`value`: String): InlinePaymentMethodDetailsKrCardBrandX1f13668b = when (value) {
      Bc.value -> Bc
      Citi.value -> Citi
      Hana.value -> Hana
      Hyundai.value -> Hyundai
      Jeju.value -> Jeju
      Jeonbuk.value -> Jeonbuk
      Kakaobank.value -> Kakaobank
      Kbank.value -> Kbank
      Kdbbank.value -> Kdbbank
      Kookmin.value -> Kookmin
      Kwangju.value -> Kwangju
      Lotte.value -> Lotte
      Mg.value -> Mg
      Nh.value -> Nh
      Post.value -> Post
      Samsung.value -> Samsung
      Savingsbank.value -> Savingsbank
      Shinhan.value -> Shinhan
      Shinhyup.value -> Shinhyup
      Suhyup.value -> Suhyup
      Tossbank.value -> Tossbank
      Woori.value -> Woori
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlinePaymentMethodDetailsKrCardBrandX1f13668b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlinePaymentMethodDetailsKrCardBrandX1f13668b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsKrCardBrandX1f13668b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsKrCardBrandX1f13668b) {
      encoder.encodeString(value.value)
    }
  }
}
