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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/us_cfpb_data/properties/ethnicity_details/properties/ethnicity/items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/us_cfpb_data/properties/ethnicity_details/properties/ethnicity/items
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e.Serializer::class)
public sealed class InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `cuban`.
     */
    public data object Cuban : InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e() {
        public override val `value`: String = "cuban"
    }

    /**
     * Documented value. Wire value: `hispanic_or_latino`.
     */
    public data object HispanicOrLatino : InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e() {
        public override val `value`: String = "hispanic_or_latino"
    }

    /**
     * Documented value. Wire value: `mexican`.
     */
    public data object Mexican : InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e() {
        public override val `value`: String = "mexican"
    }

    /**
     * Documented value. Wire value: `not_hispanic_or_latino`.
     */
    public data object NotHispanicOrLatino : InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e() {
        public override val `value`: String = "not_hispanic_or_latino"
    }

    /**
     * Documented value. Wire value: `other_hispanic_or_latino`.
     */
    public data object OtherHispanicOrLatino : InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e() {
        public override val `value`: String = "other_hispanic_or_latino"
    }

    /**
     * Documented value. Wire value: `prefer_not_to_answer`.
     */
    public data object PreferNotToAnswer : InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e() {
        public override val `value`: String = "prefer_not_to_answer"
    }

    /**
     * Documented value. Wire value: `puerto_rican`.
     */
    public data object PuertoRican : InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e() {
        public override val `value`: String = "puerto_rican"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e =
            when (value) {
                Cuban.value -> Cuban
                HispanicOrLatino.value -> HispanicOrLatino
                Mexican.value -> Mexican
                NotHispanicOrLatino.value -> NotHispanicOrLatino
                OtherHispanicOrLatino.value -> OtherHispanicOrLatino
                PreferNotToAnswer.value -> PreferNotToAnswer
                PuertoRican.value -> PuertoRican
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e =
            fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPersonsPostRequestFormUsCfpbDataEthnicityDetailsItemX6ca4356e,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
