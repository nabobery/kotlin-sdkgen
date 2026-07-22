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
 * ded/schema/properties/country_options/properties/me.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/me
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb(
    public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeTypeX12f25212,
    public val standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeStandardX244f6f76? = null,
) {
    public class Builder {
        private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeTypeX12f25212? =
            null

        public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeTypeX12f25212
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeStandardX244f6f76? =
            null

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb {
            check(typeValue != null) { "type is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb(
                type = type,
                standard = standard,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeTypeX12f25212>(
                    rawObject,
                    "type",
                )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb(
                type = type,
                standard =
                    rawObject["standard"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeStandardX244f6f76>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
