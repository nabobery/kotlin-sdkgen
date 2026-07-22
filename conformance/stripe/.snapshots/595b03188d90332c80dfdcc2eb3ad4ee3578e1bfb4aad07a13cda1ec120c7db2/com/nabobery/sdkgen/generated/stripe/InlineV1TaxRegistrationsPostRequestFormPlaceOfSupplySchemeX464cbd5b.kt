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
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/me/properties/standard/properties/place_of_supply_scheme.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/me/properties/standard/properties/place_of_supply_scheme
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX464cbd5b.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX464cbd5b {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `inbound_goods`.
     */
    public data object InboundGoods : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX464cbd5b() {
        public override val `value`: String = "inbound_goods"
    }

    /**
     * Documented value. Wire value: `standard`.
     */
    public data object Standard : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX464cbd5b() {
        public override val `value`: String = "standard"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX464cbd5b()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX464cbd5b =
            when (value) {
                InboundGoods.value -> InboundGoods
                Standard.value -> Standard
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX464cbd5b> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX464cbd5b",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX464cbd5b = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX464cbd5b,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
