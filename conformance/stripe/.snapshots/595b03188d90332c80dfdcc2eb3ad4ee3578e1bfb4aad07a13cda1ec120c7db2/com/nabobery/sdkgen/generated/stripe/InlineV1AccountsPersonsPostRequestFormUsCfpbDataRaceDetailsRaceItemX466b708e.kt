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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/us_cfpb_data/properties/race_details/properties/race/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/us_cfpb_data/properties/race_details/properties/race/items
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e.Serializer::class)
public sealed class InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `african_american`.
     */
    public data object AfricanAmerican : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "african_american"
    }

    /**
     * Documented value. Wire value: `american_indian_or_alaska_native`.
     */
    public data object AmericanIndianOrAlaskaNative : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "american_indian_or_alaska_native"
    }

    /**
     * Documented value. Wire value: `asian`.
     */
    public data object Asian : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "asian"
    }

    /**
     * Documented value. Wire value: `asian_indian`.
     */
    public data object AsianIndian : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "asian_indian"
    }

    /**
     * Documented value. Wire value: `black_or_african_american`.
     */
    public data object BlackOrAfricanAmerican : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "black_or_african_american"
    }

    /**
     * Documented value. Wire value: `chinese`.
     */
    public data object Chinese : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "chinese"
    }

    /**
     * Documented value. Wire value: `ethiopian`.
     */
    public data object Ethiopian : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "ethiopian"
    }

    /**
     * Documented value. Wire value: `filipino`.
     */
    public data object Filipino : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "filipino"
    }

    /**
     * Documented value. Wire value: `guamanian_or_chamorro`.
     */
    public data object GuamanianOrChamorro : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "guamanian_or_chamorro"
    }

    /**
     * Documented value. Wire value: `haitian`.
     */
    public data object Haitian : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "haitian"
    }

    /**
     * Documented value. Wire value: `jamaican`.
     */
    public data object Jamaican : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "jamaican"
    }

    /**
     * Documented value. Wire value: `japanese`.
     */
    public data object Japanese : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "japanese"
    }

    /**
     * Documented value. Wire value: `korean`.
     */
    public data object Korean : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "korean"
    }

    /**
     * Documented value. Wire value: `native_hawaiian`.
     */
    public data object NativeHawaiian : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "native_hawaiian"
    }

    /**
     * Documented value. Wire value: `native_hawaiian_or_other_pacific_islander`.
     */
    public data object NativeHawaiianOrOtherPacificIslander : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "native_hawaiian_or_other_pacific_islander"
    }

    /**
     * Documented value. Wire value: `nigerian`.
     */
    public data object Nigerian : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "nigerian"
    }

    /**
     * Documented value. Wire value: `other_asian`.
     */
    public data object OtherAsian : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "other_asian"
    }

    /**
     * Documented value. Wire value: `other_black_or_african_american`.
     */
    public data object OtherBlackOrAfricanAmerican : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "other_black_or_african_american"
    }

    /**
     * Documented value. Wire value: `other_pacific_islander`.
     */
    public data object OtherPacificIslander : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "other_pacific_islander"
    }

    /**
     * Documented value. Wire value: `prefer_not_to_answer`.
     */
    public data object PreferNotToAnswer : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "prefer_not_to_answer"
    }

    /**
     * Documented value. Wire value: `samoan`.
     */
    public data object Samoan : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "samoan"
    }

    /**
     * Documented value. Wire value: `somali`.
     */
    public data object Somali : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "somali"
    }

    /**
     * Documented value. Wire value: `vietnamese`.
     */
    public data object Vietnamese : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "vietnamese"
    }

    /**
     * Documented value. Wire value: `white`.
     */
    public data object White : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e() {
        public override val `value`: String = "white"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e =
            when (value) {
                AfricanAmerican.value -> AfricanAmerican
                AmericanIndianOrAlaskaNative.value -> AmericanIndianOrAlaskaNative
                Asian.value -> Asian
                AsianIndian.value -> AsianIndian
                BlackOrAfricanAmerican.value -> BlackOrAfricanAmerican
                Chinese.value -> Chinese
                Ethiopian.value -> Ethiopian
                Filipino.value -> Filipino
                GuamanianOrChamorro.value -> GuamanianOrChamorro
                Haitian.value -> Haitian
                Jamaican.value -> Jamaican
                Japanese.value -> Japanese
                Korean.value -> Korean
                NativeHawaiian.value -> NativeHawaiian
                NativeHawaiianOrOtherPacificIslander.value -> NativeHawaiianOrOtherPacificIslander
                Nigerian.value -> Nigerian
                OtherAsian.value -> OtherAsian
                OtherBlackOrAfricanAmerican.value -> OtherBlackOrAfricanAmerican
                OtherPacificIslander.value -> OtherPacificIslander
                PreferNotToAnswer.value -> PreferNotToAnswer
                Samoan.value -> Samoan
                Somali.value -> Somali
                Vietnamese.value -> Vietnamese
                White.value -> White
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormUsCfpbDataRaceDetailsRaceItemX466b708e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
