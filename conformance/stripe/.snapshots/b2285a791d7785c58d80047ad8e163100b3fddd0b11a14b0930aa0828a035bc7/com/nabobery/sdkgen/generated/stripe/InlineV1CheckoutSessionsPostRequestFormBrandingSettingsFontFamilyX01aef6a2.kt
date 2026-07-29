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
 * ded/schema/properties/branding_settings/properties/font_family.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/branding_settings/properties/font_family
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2.Serializer::class)
public sealed class InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = ""
  }

  /**
   * Documented value. Wire value: `be_vietnam_pro`.
   */
  public data object BeVietnamPro : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "be_vietnam_pro"
  }

  /**
   * Documented value. Wire value: `bitter`.
   */
  public data object Bitter : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "bitter"
  }

  /**
   * Documented value. Wire value: `chakra_petch`.
   */
  public data object ChakraPetch : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "chakra_petch"
  }

  /**
   * Documented value. Wire value: `default`.
   */
  public data object Default : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "default"
  }

  /**
   * Documented value. Wire value: `hahmlet`.
   */
  public data object Hahmlet : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "hahmlet"
  }

  /**
   * Documented value. Wire value: `inconsolata`.
   */
  public data object Inconsolata : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "inconsolata"
  }

  /**
   * Documented value. Wire value: `inter`.
   */
  public data object Inter : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "inter"
  }

  /**
   * Documented value. Wire value: `lato`.
   */
  public data object Lato : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "lato"
  }

  /**
   * Documented value. Wire value: `lora`.
   */
  public data object Lora : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "lora"
  }

  /**
   * Documented value. Wire value: `m_plus_1_code`.
   */
  public data object MPlus1Code : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "m_plus_1_code"
  }

  /**
   * Documented value. Wire value: `montserrat`.
   */
  public data object Montserrat : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "montserrat"
  }

  /**
   * Documented value. Wire value: `noto_sans`.
   */
  public data object NotoSans : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "noto_sans"
  }

  /**
   * Documented value. Wire value: `noto_sans_jp`.
   */
  public data object NotoSansJp : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "noto_sans_jp"
  }

  /**
   * Documented value. Wire value: `noto_serif`.
   */
  public data object NotoSerif : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "noto_serif"
  }

  /**
   * Documented value. Wire value: `nunito`.
   */
  public data object Nunito : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "nunito"
  }

  /**
   * Documented value. Wire value: `open_sans`.
   */
  public data object OpenSans : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "open_sans"
  }

  /**
   * Documented value. Wire value: `pridi`.
   */
  public data object Pridi : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "pridi"
  }

  /**
   * Documented value. Wire value: `pt_sans`.
   */
  public data object PtSans : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "pt_sans"
  }

  /**
   * Documented value. Wire value: `pt_serif`.
   */
  public data object PtSerif : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "pt_serif"
  }

  /**
   * Documented value. Wire value: `raleway`.
   */
  public data object Raleway : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "raleway"
  }

  /**
   * Documented value. Wire value: `roboto`.
   */
  public data object Roboto : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "roboto"
  }

  /**
   * Documented value. Wire value: `roboto_slab`.
   */
  public data object RobotoSlab : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "roboto_slab"
  }

  /**
   * Documented value. Wire value: `source_sans_pro`.
   */
  public data object SourceSansPro : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "source_sans_pro"
  }

  /**
   * Documented value. Wire value: `titillium_web`.
   */
  public data object TitilliumWeb : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "titillium_web"
  }

  /**
   * Documented value. Wire value: `ubuntu_mono`.
   */
  public data object UbuntuMono : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "ubuntu_mono"
  }

  /**
   * Documented value. Wire value: `zen_maru_gothic`.
   */
  public data object ZenMaruGothic : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2() {
    public override val `value`: String = "zen_maru_gothic"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2()

  public companion object {
    public fun fromValue(`value`: String): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2 = when (value) {
      Value.value -> Value
      BeVietnamPro.value -> BeVietnamPro
      Bitter.value -> Bitter
      ChakraPetch.value -> ChakraPetch
      Default.value -> Default
      Hahmlet.value -> Hahmlet
      Inconsolata.value -> Inconsolata
      Inter.value -> Inter
      Lato.value -> Lato
      Lora.value -> Lora
      MPlus1Code.value -> MPlus1Code
      Montserrat.value -> Montserrat
      NotoSans.value -> NotoSans
      NotoSansJp.value -> NotoSansJp
      NotoSerif.value -> NotoSerif
      Nunito.value -> Nunito
      OpenSans.value -> OpenSans
      Pridi.value -> Pridi
      PtSans.value -> PtSans
      PtSerif.value -> PtSerif
      Raleway.value -> Raleway
      Roboto.value -> Roboto
      RobotoSlab.value -> RobotoSlab
      SourceSansPro.value -> SourceSansPro
      TitilliumWeb.value -> TitilliumWeb
      UbuntuMono.value -> UbuntuMono
      ZenMaruGothic.value -> ZenMaruGothic
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormBrandingSettingsFontFamilyX01aef6a2) {
      encoder.encodeString(value.value)
    }
  }
}
