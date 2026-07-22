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
 * ded/schema/properties/country_options/properties/bf.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/bf
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea(
    public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfTypeX36a4ac55,
    public val standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b? = null,
) {
    public class Builder {
        private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfTypeX36a4ac55? =
            null

        public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfTypeX36a4ac55
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b? =
            null

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea {
            check(typeValue != null) { "type is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea(
                type = type,
                standard = standard,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfTypeX36a4ac55>(
                    rawObject,
                    "type",
                )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea(
                type = type,
                standard =
                    rawObject["standard"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfStandardXfd9a215b>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
