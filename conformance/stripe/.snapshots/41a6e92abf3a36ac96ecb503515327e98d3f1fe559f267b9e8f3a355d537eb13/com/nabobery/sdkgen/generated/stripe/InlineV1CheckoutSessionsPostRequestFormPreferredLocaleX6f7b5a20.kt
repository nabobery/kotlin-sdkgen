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
 * ded/schema/properties/payment_method_options/properties/paypal/properties/preferred_locale.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/paypal/properties/preferred_locale
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `cs-CZ`.
   */
  public data object CsCz : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "cs-CZ"
  }

  /**
   * Documented value. Wire value: `da-DK`.
   */
  public data object DaDk : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "da-DK"
  }

  /**
   * Documented value. Wire value: `de-AT`.
   */
  public data object DeAt : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "de-AT"
  }

  /**
   * Documented value. Wire value: `de-DE`.
   */
  public data object DeDe : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "de-DE"
  }

  /**
   * Documented value. Wire value: `de-LU`.
   */
  public data object DeLu : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "de-LU"
  }

  /**
   * Documented value. Wire value: `el-GR`.
   */
  public data object ElGr : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "el-GR"
  }

  /**
   * Documented value. Wire value: `en-GB`.
   */
  public data object EnGb : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "en-GB"
  }

  /**
   * Documented value. Wire value: `en-US`.
   */
  public data object EnUs : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "en-US"
  }

  /**
   * Documented value. Wire value: `es-ES`.
   */
  public data object EsEs : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "es-ES"
  }

  /**
   * Documented value. Wire value: `fi-FI`.
   */
  public data object FiFi : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "fi-FI"
  }

  /**
   * Documented value. Wire value: `fr-BE`.
   */
  public data object FrBe : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "fr-BE"
  }

  /**
   * Documented value. Wire value: `fr-FR`.
   */
  public data object FrFr : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "fr-FR"
  }

  /**
   * Documented value. Wire value: `fr-LU`.
   */
  public data object FrLu : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "fr-LU"
  }

  /**
   * Documented value. Wire value: `hu-HU`.
   */
  public data object HuHu : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "hu-HU"
  }

  /**
   * Documented value. Wire value: `it-IT`.
   */
  public data object ItIt : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "it-IT"
  }

  /**
   * Documented value. Wire value: `nl-BE`.
   */
  public data object NlBe : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "nl-BE"
  }

  /**
   * Documented value. Wire value: `nl-NL`.
   */
  public data object NlNl : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "nl-NL"
  }

  /**
   * Documented value. Wire value: `pl-PL`.
   */
  public data object PlPl : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "pl-PL"
  }

  /**
   * Documented value. Wire value: `pt-PT`.
   */
  public data object PtPt : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "pt-PT"
  }

  /**
   * Documented value. Wire value: `sk-SK`.
   */
  public data object SkSk : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "sk-SK"
  }

  /**
   * Documented value. Wire value: `sv-SE`.
   */
  public data object SvSe : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20() {
    public override val `value`: String = "sv-SE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20 = when (value) {
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

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPreferredLocaleX6f7b5a20) {
      encoder.encodeString(value.value)
    }
  }
}
