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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fuel/properties/unit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/fuel/properties/unit
 */
@Serializable(with = InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef.Serializer::class)
public sealed class InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `charging_minute`.
     */
    public data object ChargingMinute : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef() {
        public override val `value`: String = "charging_minute"
    }

    /**
     * Documented value. Wire value: `imperial_gallon`.
     */
    public data object ImperialGallon : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef() {
        public override val `value`: String = "imperial_gallon"
    }

    /**
     * Documented value. Wire value: `kilogram`.
     */
    public data object Kilogram : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef() {
        public override val `value`: String = "kilogram"
    }

    /**
     * Documented value. Wire value: `kilowatt_hour`.
     */
    public data object KilowattHour : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef() {
        public override val `value`: String = "kilowatt_hour"
    }

    /**
     * Documented value. Wire value: `liter`.
     */
    public data object Liter : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef() {
        public override val `value`: String = "liter"
    }

    /**
     * Documented value. Wire value: `other`.
     */
    public data object Other : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef() {
        public override val `value`: String = "other"
    }

    /**
     * Documented value. Wire value: `pound`.
     */
    public data object Pound : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef() {
        public override val `value`: String = "pound"
    }

    /**
     * Documented value. Wire value: `us_gallon`.
     */
    public data object UsGallon : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef() {
        public override val `value`: String = "us_gallon"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef()

    public companion object {
        public fun fromValue(
            `value`: String,
        ): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef =
            when (value) {
                ChargingMinute.value -> ChargingMinute
                ImperialGallon.value -> ImperialGallon
                Kilogram.value -> Kilogram
                KilowattHour.value -> KilowattHour
                Liter.value -> Liter
                Other.value -> Other
                Pound.value -> Pound
                UsGallon.value -> UsGallon
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuingAuthorizationsPostRequestFormFuelUnitXe42791ef,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
