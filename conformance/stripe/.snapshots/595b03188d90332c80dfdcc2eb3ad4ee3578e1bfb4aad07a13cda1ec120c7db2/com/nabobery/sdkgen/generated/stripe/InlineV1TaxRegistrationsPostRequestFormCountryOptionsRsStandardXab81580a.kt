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
 * ded/schema/properties/country_options/properties/rs/properties/standard.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/rs/properties/standard
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a(
    public val placeOfSupplyScheme: InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d? = null,
) {
    public class Builder {
        public var placeOfSupplyScheme:
            InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d? = null

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a =
            InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a(
                placeOfSupplyScheme = placeOfSupplyScheme,
            )
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a must be a JSON object",
                    )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a(
                placeOfSupplyScheme =
                    rawObject["place_of_supply_scheme"]?.let {
                        json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormPlaceOfSupplySchemeX24a9382d>(
                            it,
                        )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsStandardXab81580a.build(block)
