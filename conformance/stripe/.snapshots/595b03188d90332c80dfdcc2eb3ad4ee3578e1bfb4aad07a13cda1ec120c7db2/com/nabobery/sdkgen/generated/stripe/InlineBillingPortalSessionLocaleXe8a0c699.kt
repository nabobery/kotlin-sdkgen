package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlin.String

/**
 * The IETF language tag of the locale Customer Portal is displayed in. If blank or auto, the customer’s
 * `preferred_locales` or browser’s locale is used.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_portal.session/properties/locale
 */
@Serializable(with = InlineBillingPortalSessionLocaleXe8a0c699.Serializer::class)
public sealed class InlineBillingPortalSessionLocaleXe8a0c699 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `auto`.
     */
    public data object Auto : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "auto"
    }

    /**
     * Documented value. Wire value: `bg`.
     */
    public data object Bg : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "bg"
    }

    /**
     * Documented value. Wire value: `cs`.
     */
    public data object Cs : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "cs"
    }

    /**
     * Documented value. Wire value: `da`.
     */
    public data object Da : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "da"
    }

    /**
     * Documented value. Wire value: `de`.
     */
    public data object De : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "de"
    }

    /**
     * Documented value. Wire value: `el`.
     */
    public data object El : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "el"
    }

    /**
     * Documented value. Wire value: `en`.
     */
    public data object En : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "en"
    }

    /**
     * Documented value. Wire value: `en-AU`.
     */
    public data object EnAu : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "en-AU"
    }

    /**
     * Documented value. Wire value: `en-CA`.
     */
    public data object EnCa : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "en-CA"
    }

    /**
     * Documented value. Wire value: `en-GB`.
     */
    public data object EnGb : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "en-GB"
    }

    /**
     * Documented value. Wire value: `en-IE`.
     */
    public data object EnIe : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "en-IE"
    }

    /**
     * Documented value. Wire value: `en-IN`.
     */
    public data object EnIn : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "en-IN"
    }

    /**
     * Documented value. Wire value: `en-NZ`.
     */
    public data object EnNz : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "en-NZ"
    }

    /**
     * Documented value. Wire value: `en-SG`.
     */
    public data object EnSg : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "en-SG"
    }

    /**
     * Documented value. Wire value: `es`.
     */
    public data object Es : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "es"
    }

    /**
     * Documented value. Wire value: `es-419`.
     */
    public data object Es419 : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "es-419"
    }

    /**
     * Documented value. Wire value: `et`.
     */
    public data object Et : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "et"
    }

    /**
     * Documented value. Wire value: `fi`.
     */
    public data object Fi : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "fi"
    }

    /**
     * Documented value. Wire value: `fil`.
     */
    public data object Fil : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "fil"
    }

    /**
     * Documented value. Wire value: `fr`.
     */
    public data object Fr : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "fr"
    }

    /**
     * Documented value. Wire value: `fr-CA`.
     */
    public data object FrCa : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "fr-CA"
    }

    /**
     * Documented value. Wire value: `hr`.
     */
    public data object Hr : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "hr"
    }

    /**
     * Documented value. Wire value: `hu`.
     */
    public data object Hu : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "hu"
    }

    /**
     * Documented value. Wire value: `id`.
     */
    public data object Id : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "id"
    }

    /**
     * Documented value. Wire value: `it`.
     */
    public data object It : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "it"
    }

    /**
     * Documented value. Wire value: `ja`.
     */
    public data object Ja : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "ja"
    }

    /**
     * Documented value. Wire value: `ko`.
     */
    public data object Ko : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "ko"
    }

    /**
     * Documented value. Wire value: `lt`.
     */
    public data object Lt : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "lt"
    }

    /**
     * Documented value. Wire value: `lv`.
     */
    public data object Lv : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "lv"
    }

    /**
     * Documented value. Wire value: `ms`.
     */
    public data object Ms : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "ms"
    }

    /**
     * Documented value. Wire value: `mt`.
     */
    public data object Mt : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "mt"
    }

    /**
     * Documented value. Wire value: `nb`.
     */
    public data object Nb : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "nb"
    }

    /**
     * Documented value. Wire value: `nl`.
     */
    public data object Nl : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "nl"
    }

    /**
     * Documented value. Wire value: `pl`.
     */
    public data object Pl : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "pl"
    }

    /**
     * Documented value. Wire value: `pt`.
     */
    public data object Pt : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "pt"
    }

    /**
     * Documented value. Wire value: `pt-BR`.
     */
    public data object PtBr : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "pt-BR"
    }

    /**
     * Documented value. Wire value: `ro`.
     */
    public data object Ro : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "ro"
    }

    /**
     * Documented value. Wire value: `ru`.
     */
    public data object Ru : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "ru"
    }

    /**
     * Documented value. Wire value: `sk`.
     */
    public data object Sk : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "sk"
    }

    /**
     * Documented value. Wire value: `sl`.
     */
    public data object Sl : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "sl"
    }

    /**
     * Documented value. Wire value: `sv`.
     */
    public data object Sv : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "sv"
    }

    /**
     * Documented value. Wire value: `th`.
     */
    public data object Th : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "th"
    }

    /**
     * Documented value. Wire value: `tr`.
     */
    public data object Tr : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "tr"
    }

    /**
     * Documented value. Wire value: `vi`.
     */
    public data object Vi : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "vi"
    }

    /**
     * Documented value. Wire value: `zh`.
     */
    public data object Zh : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "zh"
    }

    /**
     * Documented value. Wire value: `zh-HK`.
     */
    public data object ZhHk : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "zh-HK"
    }

    /**
     * Documented value. Wire value: `zh-TW`.
     */
    public data object ZhTw : InlineBillingPortalSessionLocaleXe8a0c699() {
        public override val `value`: String = "zh-TW"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineBillingPortalSessionLocaleXe8a0c699()

    public companion object {
        public fun fromValue(`value`: String): InlineBillingPortalSessionLocaleXe8a0c699 =
            when (value) {
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

    public object Serializer : KSerializer<InlineBillingPortalSessionLocaleXe8a0c699> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineBillingPortalSessionLocaleXe8a0c699",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineBillingPortalSessionLocaleXe8a0c699 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBillingPortalSessionLocaleXe8a0c699,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
