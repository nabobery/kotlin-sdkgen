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
 * ded/schema/properties/country_options/properties/mr.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/mr
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc(
    public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrTypeX78c68a25,
    public val standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5? = null,
) {
    public class Builder {
        private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrTypeX78c68a25? =
            null

        public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrTypeX78c68a25
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5? =
            null

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc {
            check(typeValue != null) { "type is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc(
                type = type,
                standard = standard,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrTypeX78c68a25>(
                    rawObject,
                    "type",
                )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc(
                type = type,
                standard =
                    rawObject["standard"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrStandardX384272a5>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                    value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
