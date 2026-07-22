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
 * ded/schema/properties/country_options/properties/bd.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/bd
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db(
    public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdTypeX59ff6cd7,
    public val standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91? = null,
) {
    public class Builder {
        private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdTypeX59ff6cd7? =
            null

        public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdTypeX59ff6cd7
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public var standard: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91? =
            null

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db {
            check(typeValue != null) { "type is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db(
                type = type,
                standard = standard,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdTypeX59ff6cd7>(
                    rawObject,
                    "type",
                )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db(
                type = type,
                standard =
                    rawObject["standard"]?.let {
                        json
                            .decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdStandardX57958c91>(
                                it,
                            )
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
