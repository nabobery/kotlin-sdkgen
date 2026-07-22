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
 * ded/schema/properties/country_options/properties/bb.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/bb
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971(
    public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbTypeXaa66ff7f,
    public val standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbStandardX2cf58619? = null,
) {
    public class Builder {
        private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbTypeXaa66ff7f? =
            null

        public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbTypeXaa66ff7f
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbStandardX2cf58619? =
            null

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971 {
            check(typeValue != null) { "type is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971(
                type = type,
                standard = standard,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971 must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbTypeXaa66ff7f>(
                    rawObject,
                    "type",
                )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971(
                type = type,
                standard =
                    rawObject["standard"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbStandardX2cf58619>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971 =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
