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
 * The IETF language tag of the locale Checkout is displayed in. If blank or `auto`, the browser's locale is used.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/locale
 */
@Serializable(with = InlineCheckoutSessionLocaleX143da667.Serializer::class)
public sealed class InlineCheckoutSessionLocaleX143da667 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `auto`.
     */
    public data object Auto : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "auto"
    }

    /**
     * Documented value. Wire value: `bg`.
     */
    public data object Bg : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "bg"
    }

    /**
     * Documented value. Wire value: `cs`.
     */
    public data object Cs : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "cs"
    }

    /**
     * Documented value. Wire value: `da`.
     */
    public data object Da : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "da"
    }

    /**
     * Documented value. Wire value: `de`.
     */
    public data object De : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "de"
    }

    /**
     * Documented value. Wire value: `el`.
     */
    public data object El : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "el"
    }

    /**
     * Documented value. Wire value: `en`.
     */
    public data object En : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "en"
    }

    /**
     * Documented value. Wire value: `en-GB`.
     */
    public data object EnGb : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "en-GB"
    }

    /**
     * Documented value. Wire value: `es`.
     */
    public data object Es : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "es"
    }

    /**
     * Documented value. Wire value: `es-419`.
     */
    public data object Es419 : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "es-419"
    }

    /**
     * Documented value. Wire value: `et`.
     */
    public data object Et : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "et"
    }

    /**
     * Documented value. Wire value: `fi`.
     */
    public data object Fi : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "fi"
    }

    /**
     * Documented value. Wire value: `fil`.
     */
    public data object Fil : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "fil"
    }

    /**
     * Documented value. Wire value: `fr`.
     */
    public data object Fr : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "fr"
    }

    /**
     * Documented value. Wire value: `fr-CA`.
     */
    public data object FrCa : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "fr-CA"
    }

    /**
     * Documented value. Wire value: `hr`.
     */
    public data object Hr : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "hr"
    }

    /**
     * Documented value. Wire value: `hu`.
     */
    public data object Hu : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "hu"
    }

    /**
     * Documented value. Wire value: `id`.
     */
    public data object Id : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "id"
    }

    /**
     * Documented value. Wire value: `it`.
     */
    public data object It : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "it"
    }

    /**
     * Documented value. Wire value: `ja`.
     */
    public data object Ja : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "ja"
    }

    /**
     * Documented value. Wire value: `ko`.
     */
    public data object Ko : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "ko"
    }

    /**
     * Documented value. Wire value: `lt`.
     */
    public data object Lt : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "lt"
    }

    /**
     * Documented value. Wire value: `lv`.
     */
    public data object Lv : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "lv"
    }

    /**
     * Documented value. Wire value: `ms`.
     */
    public data object Ms : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "ms"
    }

    /**
     * Documented value. Wire value: `mt`.
     */
    public data object Mt : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "mt"
    }

    /**
     * Documented value. Wire value: `nb`.
     */
    public data object Nb : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "nb"
    }

    /**
     * Documented value. Wire value: `nl`.
     */
    public data object Nl : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "nl"
    }

    /**
     * Documented value. Wire value: `pl`.
     */
    public data object Pl : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "pl"
    }

    /**
     * Documented value. Wire value: `pt`.
     */
    public data object Pt : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "pt"
    }

    /**
     * Documented value. Wire value: `pt-BR`.
     */
    public data object PtBr : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "pt-BR"
    }

    /**
     * Documented value. Wire value: `ro`.
     */
    public data object Ro : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "ro"
    }

    /**
     * Documented value. Wire value: `ru`.
     */
    public data object Ru : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "ru"
    }

    /**
     * Documented value. Wire value: `sk`.
     */
    public data object Sk : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "sk"
    }

    /**
     * Documented value. Wire value: `sl`.
     */
    public data object Sl : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "sl"
    }

    /**
     * Documented value. Wire value: `sv`.
     */
    public data object Sv : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "sv"
    }

    /**
     * Documented value. Wire value: `th`.
     */
    public data object Th : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "th"
    }

    /**
     * Documented value. Wire value: `tr`.
     */
    public data object Tr : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "tr"
    }

    /**
     * Documented value. Wire value: `vi`.
     */
    public data object Vi : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "vi"
    }

    /**
     * Documented value. Wire value: `zh`.
     */
    public data object Zh : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "zh"
    }

    /**
     * Documented value. Wire value: `zh-HK`.
     */
    public data object ZhHk : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "zh-HK"
    }

    /**
     * Documented value. Wire value: `zh-TW`.
     */
    public data object ZhTw : InlineCheckoutSessionLocaleX143da667() {
        public override val `value`: String = "zh-TW"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineCheckoutSessionLocaleX143da667()

    public companion object {
        public fun fromValue(`value`: String): InlineCheckoutSessionLocaleX143da667 =
            when (value) {
                Auto.value -> Auto
                Bg.value -> Bg
                Cs.value -> Cs
                Da.value -> Da
                De.value -> De
                El.value -> El
                En.value -> En
                EnGb.value -> EnGb
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

    public object Serializer : KSerializer<InlineCheckoutSessionLocaleX143da667> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineCheckoutSessionLocaleX143da667",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineCheckoutSessionLocaleX143da667 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCheckoutSessionLocaleX143da667,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
