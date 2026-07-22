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
 * ded/schema/properties/country_options/properties/rs/properties/standard/properties/place_of_supply_scheme.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/rs/properties/standard/properties/place_of_supply_scheme
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d.Serializer::class)
public sealed class InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d {
    public abstract val `value`: String

    /**
     * Documented value. Wire value: `inbound_goods`.
     */
    public data object InboundGoods : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d() {
        public override val `value`: String = "inbound_goods"
    }

    /**
     * Documented value. Wire value: `standard`.
     */
    public data object Standard : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d() {
        public override val `value`: String = "standard"
    }

    public data class SdkUnknown(
        public override val `value`: String,
    ) : InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d()

    public companion object {
        public fun fromValue(`value`: String): InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d =
            when (value) {
                InboundGoods.value -> InboundGoods
                Standard.value -> Standard
                else -> SdkUnknown(value)
            }
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d> {
        override val descriptor: SerialDescriptor =
            PrimitiveSerialDescriptor(
                "com.nabobery.sdkgen.generated.stripe.InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d",
                PrimitiveKind.STRING,
            )

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d = fromValue(decoder.decodeString())

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d,
        ) {
            encoder.encodeString(value.value)
        }
    }
}
