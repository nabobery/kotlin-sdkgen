package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/mr/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/mr/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5(
    public val placeOfSupplyScheme: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXe196f2b5? = null,
) {
    public class Builder {
        public var placeOfSupplyScheme:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXe196f2b5? = null

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5 =
            InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5 must be a JSON object",
                    )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5(
                placeOfSupplyScheme =
                    rawObject["place_of_supply_scheme"]?.let {
                        json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXe196f2b5>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.placeOfSupplyScheme?.let { put("place_of_supply_scheme", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5 =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5.build(block)
