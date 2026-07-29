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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/paypal/anyOf/0/properties/preferred_locale.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/paypal/anyOf/0/properties/preferred_locale
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cs-CZ`.
   */
  public data object CsCz : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "cs-CZ"
  }

  /**
   * Documented value. Wire value: `da-DK`.
   */
  public data object DaDk : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "da-DK"
  }

  /**
   * Documented value. Wire value: `de-AT`.
   */
  public data object DeAt : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "de-AT"
  }

  /**
   * Documented value. Wire value: `de-DE`.
   */
  public data object DeDe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "de-DE"
  }

  /**
   * Documented value. Wire value: `de-LU`.
   */
  public data object DeLu : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "de-LU"
  }

  /**
   * Documented value. Wire value: `el-GR`.
   */
  public data object ElGr : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "el-GR"
  }

  /**
   * Documented value. Wire value: `en-GB`.
   */
  public data object EnGb : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "en-GB"
  }

  /**
   * Documented value. Wire value: `en-US`.
   */
  public data object EnUs : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "en-US"
  }

  /**
   * Documented value. Wire value: `es-ES`.
   */
  public data object EsEs : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "es-ES"
  }

  /**
   * Documented value. Wire value: `fi-FI`.
   */
  public data object FiFi : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "fi-FI"
  }

  /**
   * Documented value. Wire value: `fr-BE`.
   */
  public data object FrBe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "fr-BE"
  }

  /**
   * Documented value. Wire value: `fr-FR`.
   */
  public data object FrFr : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "fr-FR"
  }

  /**
   * Documented value. Wire value: `fr-LU`.
   */
  public data object FrLu : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "fr-LU"
  }

  /**
   * Documented value. Wire value: `hu-HU`.
   */
  public data object HuHu : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "hu-HU"
  }

  /**
   * Documented value. Wire value: `it-IT`.
   */
  public data object ItIt : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "it-IT"
  }

  /**
   * Documented value. Wire value: `nl-BE`.
   */
  public data object NlBe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "nl-BE"
  }

  /**
   * Documented value. Wire value: `nl-NL`.
   */
  public data object NlNl : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "nl-NL"
  }

  /**
   * Documented value. Wire value: `pl-PL`.
   */
  public data object PlPl : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "pl-PL"
  }

  /**
   * Documented value. Wire value: `pt-PT`.
   */
  public data object PtPt : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "pt-PT"
  }

  /**
   * Documented value. Wire value: `sk-SK`.
   */
  public data object SkSk : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "sk-SK"
  }

  /**
   * Documented value. Wire value: `sv-SE`.
   */
  public data object SvSe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f() {
    public override val `value`: String = "sv-SE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f = when (value) {
      CsCz.value -> CsCz
      DaDk.value -> DaDk
      DeAt.value -> DeAt
      DeDe.value -> DeDe
      DeLu.value -> DeLu
      ElGr.value -> ElGr
      EnGb.value -> EnGb
      EnUs.value -> EnUs
      EsEs.value -> EsEs
      FiFi.value -> FiFi
      FrBe.value -> FrBe
      FrFr.value -> FrFr
      FrLu.value -> FrLu
      HuHu.value -> HuHu
      ItIt.value -> ItIt
      NlBe.value -> NlBe
      NlNl.value -> NlNl
      PlPl.value -> PlPl
      PtPt.value -> PtPt
      SkSk.value -> SkSk
      SvSe.value -> SvSe
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2990cf2f) {
      encoder.encodeString(value.value)
    }
  }
}
