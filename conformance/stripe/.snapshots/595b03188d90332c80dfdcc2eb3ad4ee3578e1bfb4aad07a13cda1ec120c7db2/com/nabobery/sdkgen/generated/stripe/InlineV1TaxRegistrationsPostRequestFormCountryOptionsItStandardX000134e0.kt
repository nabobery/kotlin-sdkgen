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
 * ded/schema/properties/country_options/properties/it/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/it/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0(
    public val placeOfSupplyScheme: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX41a2184a,
) {
    public class Builder {
        private var placeOfSupplySchemeValue:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX41a2184a? = null

        public var placeOfSupplyScheme:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX41a2184a
            get() = requireNotNull(placeOfSupplySchemeValue) { "placeOfSupplyScheme is required" }
            set(`value`) {
                placeOfSupplySchemeValue = value
            }

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0 {
            check(placeOfSupplySchemeValue != null) { "placeOfSupplyScheme is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0 must be a JSON object",
                    )
            val placeOfSupplyScheme =
                json
                    .decodeRequired<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX41a2184a>(
                        rawObject,
                        "place_of_supply_scheme",
                    )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0 =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsItStandardX000134e0 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
