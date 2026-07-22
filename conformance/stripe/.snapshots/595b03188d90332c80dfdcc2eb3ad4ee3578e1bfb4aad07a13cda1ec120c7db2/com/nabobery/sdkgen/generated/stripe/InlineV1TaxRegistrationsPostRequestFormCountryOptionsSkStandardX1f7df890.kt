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
 * ded/schema/properties/country_options/properties/sk/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/sk/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890(
    public val placeOfSupplyScheme: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX01dbfe19,
) {
    public class Builder {
        private var placeOfSupplySchemeValue:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX01dbfe19? = null

        public var placeOfSupplyScheme:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX01dbfe19
            get() = requireNotNull(placeOfSupplySchemeValue) { "placeOfSupplyScheme is required" }
            set(`value`) {
                placeOfSupplySchemeValue = value
            }

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890 {
            check(placeOfSupplySchemeValue != null) { "placeOfSupplyScheme is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890 must be a JSON object",
                    )
            val placeOfSupplyScheme =
                json
                    .decodeRequired<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX01dbfe19>(
                        rawObject,
                        "place_of_supply_scheme",
                    )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890 =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkStandardX1f7df890 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
