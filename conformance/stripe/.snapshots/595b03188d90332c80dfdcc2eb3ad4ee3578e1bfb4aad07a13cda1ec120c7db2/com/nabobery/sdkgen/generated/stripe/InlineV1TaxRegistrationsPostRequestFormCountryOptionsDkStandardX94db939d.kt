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
 * ded/schema/properties/country_options/properties/dk/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/dk/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d(
    public val placeOfSupplyScheme: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa57c972e,
) {
    public class Builder {
        private var placeOfSupplySchemeValue:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa57c972e? = null

        public var placeOfSupplyScheme:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa57c972e
            get() = requireNotNull(placeOfSupplySchemeValue) { "placeOfSupplyScheme is required" }
            set(`value`) {
                placeOfSupplySchemeValue = value
            }

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d {
            check(placeOfSupplySchemeValue != null) { "placeOfSupplyScheme is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d must be a JSON object",
                    )
            val placeOfSupplyScheme =
                json
                    .decodeRequired<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXa57c972e>(
                        rawObject,
                        "place_of_supply_scheme",
                    )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkStandardX94db939d is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
