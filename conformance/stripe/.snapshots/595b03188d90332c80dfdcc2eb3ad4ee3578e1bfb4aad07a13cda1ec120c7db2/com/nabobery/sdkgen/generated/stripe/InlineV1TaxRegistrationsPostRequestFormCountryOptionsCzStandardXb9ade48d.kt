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
 * ded/schema/properties/country_options/properties/cz/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/cz/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d(
    public val placeOfSupplyScheme: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX46c9ec76,
) {
    public class Builder {
        private var placeOfSupplySchemeValue:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX46c9ec76? = null

        public var placeOfSupplyScheme:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX46c9ec76
            get() = requireNotNull(placeOfSupplySchemeValue) { "placeOfSupplyScheme is required" }
            set(`value`) {
                placeOfSupplySchemeValue = value
            }

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d {
            check(placeOfSupplySchemeValue != null) { "placeOfSupplyScheme is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d must be a JSON object",
                    )
            val placeOfSupplyScheme =
                json
                    .decodeRequired<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX46c9ec76>(
                        rawObject,
                        "place_of_supply_scheme",
                    )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzStandardXb9ade48d is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
