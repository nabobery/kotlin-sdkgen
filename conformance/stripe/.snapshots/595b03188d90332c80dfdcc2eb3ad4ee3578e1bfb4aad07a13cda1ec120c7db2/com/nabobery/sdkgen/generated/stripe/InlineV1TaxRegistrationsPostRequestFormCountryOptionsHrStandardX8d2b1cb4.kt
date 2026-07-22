package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/hr/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/hr/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4(
    public val placeOfSupplyScheme: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXadd3aad0,
) {
    public class Builder {
        private var placeOfSupplySchemeValue:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXadd3aad0? = null

        public var placeOfSupplyScheme:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXadd3aad0
            get() = requireNotNull(placeOfSupplySchemeValue) { "placeOfSupplyScheme is required" }
            set(`value`) {
                placeOfSupplySchemeValue = value
            }

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4 {
            check(placeOfSupplySchemeValue != null) { "placeOfSupplyScheme is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4 must be a JSON object",
                    )
            val placeOfSupplyScheme =
                json
                    .decodeRequired<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXadd3aad0>(
                        rawObject,
                        "place_of_supply_scheme",
                    )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("place_of_supply_scheme", json.encodeToJsonElement(value.placeOfSupplyScheme))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4 =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrStandardX8d2b1cb4 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
