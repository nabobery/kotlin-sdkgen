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
 * The IETF language tag of the locale customer portal is displayed in. If blank or auto, the customer’s
 * `preferred_locales` or browser’s locale is used.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing_portal~1sessions/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/locale
 */
@Serializable(with = InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84.Serializer::class)
public sealed class InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `auto`.
   */
  public data object Auto : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "auto"
  }

  /**
   * Documented value. Wire value: `bg`.
   */
  public data object Bg : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "bg"
  }

  /**
   * Documented value. Wire value: `cs`.
   */
  public data object Cs : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "cs"
  }

  /**
   * Documented value. Wire value: `da`.
   */
  public data object Da : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "da"
  }

  /**
   * Documented value. Wire value: `de`.
   */
  public data object De : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "de"
  }

  /**
   * Documented value. Wire value: `el`.
   */
  public data object El : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "el"
  }

  /**
   * Documented value. Wire value: `en`.
   */
  public data object En : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "en"
  }

  /**
   * Documented value. Wire value: `en-AU`.
   */
  public data object EnAu : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "en-AU"
  }

  /**
   * Documented value. Wire value: `en-CA`.
   */
  public data object EnCa : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "en-CA"
  }

  /**
   * Documented value. Wire value: `en-GB`.
   */
  public data object EnGb : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "en-GB"
  }

  /**
   * Documented value. Wire value: `en-IE`.
   */
  public data object EnIe : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "en-IE"
  }

  /**
   * Documented value. Wire value: `en-IN`.
   */
  public data object EnIn : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "en-IN"
  }

  /**
   * Documented value. Wire value: `en-NZ`.
   */
  public data object EnNz : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "en-NZ"
  }

  /**
   * Documented value. Wire value: `en-SG`.
   */
  public data object EnSg : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "en-SG"
  }

  /**
   * Documented value. Wire value: `es`.
   */
  public data object Es : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "es"
  }

  /**
   * Documented value. Wire value: `es-419`.
   */
  public data object Es419 : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "es-419"
  }

  /**
   * Documented value. Wire value: `et`.
   */
  public data object Et : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "et"
  }

  /**
   * Documented value. Wire value: `fi`.
   */
  public data object Fi : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "fi"
  }

  /**
   * Documented value. Wire value: `fil`.
   */
  public data object Fil : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "fil"
  }

  /**
   * Documented value. Wire value: `fr`.
   */
  public data object Fr : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "fr"
  }

  /**
   * Documented value. Wire value: `fr-CA`.
   */
  public data object FrCa : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "fr-CA"
  }

  /**
   * Documented value. Wire value: `hr`.
   */
  public data object Hr : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "hr"
  }

  /**
   * Documented value. Wire value: `hu`.
   */
  public data object Hu : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "hu"
  }

  /**
   * Documented value. Wire value: `id`.
   */
  public data object Id : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "id"
  }

  /**
   * Documented value. Wire value: `it`.
   */
  public data object It : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "it"
  }

  /**
   * Documented value. Wire value: `ja`.
   */
  public data object Ja : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "ja"
  }

  /**
   * Documented value. Wire value: `ko`.
   */
  public data object Ko : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "ko"
  }

  /**
   * Documented value. Wire value: `lt`.
   */
  public data object Lt : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "lt"
  }

  /**
   * Documented value. Wire value: `lv`.
   */
  public data object Lv : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "lv"
  }

  /**
   * Documented value. Wire value: `ms`.
   */
  public data object Ms : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "ms"
  }

  /**
   * Documented value. Wire value: `mt`.
   */
  public data object Mt : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "mt"
  }

  /**
   * Documented value. Wire value: `nb`.
   */
  public data object Nb : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "nb"
  }

  /**
   * Documented value. Wire value: `nl`.
   */
  public data object Nl : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "nl"
  }

  /**
   * Documented value. Wire value: `pl`.
   */
  public data object Pl : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "pl"
  }

  /**
   * Documented value. Wire value: `pt`.
   */
  public data object Pt : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "pt"
  }

  /**
   * Documented value. Wire value: `pt-BR`.
   */
  public data object PtBr : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "pt-BR"
  }

  /**
   * Documented value. Wire value: `ro`.
   */
  public data object Ro : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "ro"
  }

  /**
   * Documented value. Wire value: `ru`.
   */
  public data object Ru : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "ru"
  }

  /**
   * Documented value. Wire value: `sk`.
   */
  public data object Sk : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "sk"
  }

  /**
   * Documented value. Wire value: `sl`.
   */
  public data object Sl : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "sl"
  }

  /**
   * Documented value. Wire value: `sv`.
   */
  public data object Sv : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "sv"
  }

  /**
   * Documented value. Wire value: `th`.
   */
  public data object Th : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "th"
  }

  /**
   * Documented value. Wire value: `tr`.
   */
  public data object Tr : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "tr"
  }

  /**
   * Documented value. Wire value: `vi`.
   */
  public data object Vi : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "vi"
  }

  /**
   * Documented value. Wire value: `zh`.
   */
  public data object Zh : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "zh"
  }

  /**
   * Documented value. Wire value: `zh-HK`.
   */
  public data object ZhHk : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "zh-HK"
  }

  /**
   * Documented value. Wire value: `zh-TW`.
   */
  public data object ZhTw : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84() {
    public override val `value`: String = "zh-TW"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84()

  public companion object {
    public fun fromValue(`value`: String): InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84 = when (value) {
      Auto.value -> Auto
      Bg.value -> Bg
      Cs.value -> Cs
      Da.value -> Da
      De.value -> De
      El.value -> El
      En.value -> En
      EnAu.value -> EnAu
      EnCa.value -> EnCa
      EnGb.value -> EnGb
      EnIe.value -> EnIe
      EnIn.value -> EnIn
      EnNz.value -> EnNz
      EnSg.value -> EnSg
      Es.value -> Es
      Es419.value -> Es419
      Et.value -> Et
      Fi.value -> Fi
      Fil.value -> Fil
      Fr.value -> Fr
      FrCa.value -> FrCa
      Hr.value -> Hr
      Hu.value -> Hu
      Id.value -> Id
      It.value -> It
      Ja.value -> Ja
      Ko.value -> Ko
      Lt.value -> Lt
      Lv.value -> Lv
      Ms.value -> Ms
      Mt.value -> Mt
      Nb.value -> Nb
      Nl.value -> Nl
      Pl.value -> Pl
      Pt.value -> Pt
      PtBr.value -> PtBr
      Ro.value -> Ro
      Ru.value -> Ru
      Sk.value -> Sk
      Sl.value -> Sl
      Sv.value -> Sv
      Th.value -> Th
      Tr.value -> Tr
      Vi.value -> Vi
      Zh.value -> Zh
      ZhHk.value -> ZhHk
      ZhTw.value -> ZhTw
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingPortalSessionsPostRequestFormLocaleX6afe2d84) {
      encoder.encodeString(value.value)
    }
  }
}
