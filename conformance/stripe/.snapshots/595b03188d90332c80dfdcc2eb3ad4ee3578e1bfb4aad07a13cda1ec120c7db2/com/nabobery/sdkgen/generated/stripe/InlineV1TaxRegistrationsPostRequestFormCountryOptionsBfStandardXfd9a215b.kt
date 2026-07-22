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
 * ded/schema/properties/country_options/properties/bf/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/bf/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b(
    public val placeOfSupplyScheme: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXf06d5a92? = null,
) {
    public class Builder {
        public var placeOfSupplyScheme:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXf06d5a92? = null

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b =
            InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b must be a JSON object",
                    )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b(
                placeOfSupplyScheme =
                    rawObject["place_of_supply_scheme"]?.let {
                        json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeXf06d5a92>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b.build(block)
