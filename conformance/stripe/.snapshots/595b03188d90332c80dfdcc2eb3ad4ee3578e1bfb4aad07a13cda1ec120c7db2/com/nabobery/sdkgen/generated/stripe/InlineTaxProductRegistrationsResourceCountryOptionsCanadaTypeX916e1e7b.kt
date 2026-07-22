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
 * Type of registration in Canada.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_canada/properties
 * /type
 */
@Serializable(with = InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b.Serializer::class)
public sealed class InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `province_standard`.
     */
    public data object ProvinceStandard : InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b() {
        public override val `value`: String = "province_standard"
    }

    /**
     * Documented value. Wire value: `simplified`.
     */
    public data object Simplified : InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b() {
        public override val `value`: String = "simplified"
    }

    /**
     * Documented value. Wire value: `standard`.
     */
    public data object Standard : InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b() {
        public override val `value`: String = "standard"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b()

    public companion object {
        public fun fromValue(`value`: String): InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b =
            when (value) {
                ProvinceStandard.value -> ProvinceStandard
                Simplified.value -> Simplified
                Standard.value -> Standard
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTaxProductRegistrationsResourceCountryOptionsCanadaTypeX916e1e7b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
