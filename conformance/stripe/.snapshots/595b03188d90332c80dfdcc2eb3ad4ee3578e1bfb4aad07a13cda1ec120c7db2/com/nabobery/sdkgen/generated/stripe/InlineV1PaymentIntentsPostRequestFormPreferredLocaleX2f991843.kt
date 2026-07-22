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
 * Forward-compatible enum for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/preferred_locale.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/preferred_locale
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843.Serializer::class)
public sealed class InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843 {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `cs-CZ`.
     */
    public data object CsCz : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "cs-CZ"
    }

    /**
     * Documented value. Wire value: `da-DK`.
     */
    public data object DaDk : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "da-DK"
    }

    /**
     * Documented value. Wire value: `de-AT`.
     */
    public data object DeAt : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "de-AT"
    }

    /**
     * Documented value. Wire value: `de-CH`.
     */
    public data object DeCh : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "de-CH"
    }

    /**
     * Documented value. Wire value: `de-DE`.
     */
    public data object DeDe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "de-DE"
    }

    /**
     * Documented value. Wire value: `el-GR`.
     */
    public data object ElGr : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "el-GR"
    }

    /**
     * Documented value. Wire value: `en-AT`.
     */
    public data object EnAt : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-AT"
    }

    /**
     * Documented value. Wire value: `en-AU`.
     */
    public data object EnAu : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-AU"
    }

    /**
     * Documented value. Wire value: `en-BE`.
     */
    public data object EnBe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-BE"
    }

    /**
     * Documented value. Wire value: `en-CA`.
     */
    public data object EnCa : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-CA"
    }

    /**
     * Documented value. Wire value: `en-CH`.
     */
    public data object EnCh : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-CH"
    }

    /**
     * Documented value. Wire value: `en-CZ`.
     */
    public data object EnCz : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-CZ"
    }

    /**
     * Documented value. Wire value: `en-DE`.
     */
    public data object EnDe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-DE"
    }

    /**
     * Documented value. Wire value: `en-DK`.
     */
    public data object EnDk : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-DK"
    }

    /**
     * Documented value. Wire value: `en-ES`.
     */
    public data object EnEs : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-ES"
    }

    /**
     * Documented value. Wire value: `en-FI`.
     */
    public data object EnFi : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-FI"
    }

    /**
     * Documented value. Wire value: `en-FR`.
     */
    public data object EnFr : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-FR"
    }

    /**
     * Documented value. Wire value: `en-GB`.
     */
    public data object EnGb : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-GB"
    }

    /**
     * Documented value. Wire value: `en-GR`.
     */
    public data object EnGr : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-GR"
    }

    /**
     * Documented value. Wire value: `en-IE`.
     */
    public data object EnIe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-IE"
    }

    /**
     * Documented value. Wire value: `en-IT`.
     */
    public data object EnIt : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-IT"
    }

    /**
     * Documented value. Wire value: `en-NL`.
     */
    public data object EnNl : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-NL"
    }

    /**
     * Documented value. Wire value: `en-NO`.
     */
    public data object EnNo : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-NO"
    }

    /**
     * Documented value. Wire value: `en-NZ`.
     */
    public data object EnNz : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-NZ"
    }

    /**
     * Documented value. Wire value: `en-PL`.
     */
    public data object EnPl : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-PL"
    }

    /**
     * Documented value. Wire value: `en-PT`.
     */
    public data object EnPt : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-PT"
    }

    /**
     * Documented value. Wire value: `en-RO`.
     */
    public data object EnRo : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-RO"
    }

    /**
     * Documented value. Wire value: `en-SE`.
     */
    public data object EnSe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-SE"
    }

    /**
     * Documented value. Wire value: `en-US`.
     */
    public data object EnUs : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "en-US"
    }

    /**
     * Documented value. Wire value: `es-ES`.
     */
    public data object EsEs : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "es-ES"
    }

    /**
     * Documented value. Wire value: `es-US`.
     */
    public data object EsUs : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "es-US"
    }

    /**
     * Documented value. Wire value: `fi-FI`.
     */
    public data object FiFi : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "fi-FI"
    }

    /**
     * Documented value. Wire value: `fr-BE`.
     */
    public data object FrBe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "fr-BE"
    }

    /**
     * Documented value. Wire value: `fr-CA`.
     */
    public data object FrCa : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "fr-CA"
    }

    /**
     * Documented value. Wire value: `fr-CH`.
     */
    public data object FrCh : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "fr-CH"
    }

    /**
     * Documented value. Wire value: `fr-FR`.
     */
    public data object FrFr : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "fr-FR"
    }

    /**
     * Documented value. Wire value: `it-CH`.
     */
    public data object ItCh : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "it-CH"
    }

    /**
     * Documented value. Wire value: `it-IT`.
     */
    public data object ItIt : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "it-IT"
    }

    /**
     * Documented value. Wire value: `nb-NO`.
     */
    public data object NbNo : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "nb-NO"
    }

    /**
     * Documented value. Wire value: `nl-BE`.
     */
    public data object NlBe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "nl-BE"
    }

    /**
     * Documented value. Wire value: `nl-NL`.
     */
    public data object NlNl : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "nl-NL"
    }

    /**
     * Documented value. Wire value: `pl-PL`.
     */
    public data object PlPl : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "pl-PL"
    }

    /**
     * Documented value. Wire value: `pt-PT`.
     */
    public data object PtPt : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "pt-PT"
    }

    /**
     * Documented value. Wire value: `ro-RO`.
     */
    public data object RoRo : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "ro-RO"
    }

    /**
     * Documented value. Wire value: `sv-FI`.
     */
    public data object SvFi : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "sv-FI"
    }

    /**
     * Documented value. Wire value: `sv-SE`.
     */
    public data object SvSe : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843() {
        public override val `value`: String = "sv-SE"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843()

    public companion object {
        public fun fromValue(`value`: String): InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843 =
            when (value) {
                CsCz.value -> CsCz
                DaDk.value -> DaDk
                DeAt.value -> DeAt
                DeCh.value -> DeCh
                DeDe.value -> DeDe
                ElGr.value -> ElGr
                EnAt.value -> EnAt
                EnAu.value -> EnAu
                EnBe.value -> EnBe
                EnCa.value -> EnCa
                EnCh.value -> EnCh
                EnCz.value -> EnCz
                EnDe.value -> EnDe
                EnDk.value -> EnDk
                EnEs.value -> EnEs
                EnFi.value -> EnFi
                EnFr.value -> EnFr
                EnGb.value -> EnGb
                EnGr.value -> EnGr
                EnIe.value -> EnIe
                EnIt.value -> EnIt
                EnNl.value -> EnNl
                EnNo.value -> EnNo
                EnNz.value -> EnNz
                EnPl.value -> EnPl
                EnPt.value -> EnPt
                EnRo.value -> EnRo
                EnSe.value -> EnSe
                EnUs.value -> EnUs
                EsEs.value -> EsEs
                EsUs.value -> EsUs
                FiFi.value -> FiFi
                FrBe.value -> FrBe
                FrCa.value -> FrCa
                FrCh.value -> FrCh
                FrFr.value -> FrFr
                ItCh.value -> ItCh
                ItIt.value -> ItIt
                NbNo.value -> NbNo
                NlBe.value -> NlBe
                NlNl.value -> NlNl
                PlPl.value -> PlPl
                PtPt.value -> PtPt
                RoRo.value -> RoRo
                SvFi.value -> SvFi
                SvSe.value -> SvSe
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843",
                PrimitiveKind.STRING,
            )

        override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843 =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsPostRequestFormPreferredLocaleX2f991843,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
