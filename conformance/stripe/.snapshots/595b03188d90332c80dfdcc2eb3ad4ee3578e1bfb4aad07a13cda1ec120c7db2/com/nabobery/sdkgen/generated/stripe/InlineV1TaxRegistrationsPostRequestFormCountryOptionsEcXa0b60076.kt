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
 * ded/schema/properties/country_options/properties/ec.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ec
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076(
    public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8,
) {
    public class Builder {
        private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8? =
            null

        public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076 {
            check(typeValue != null) { "type is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076(
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076 must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcTypeX8277d1e8>(
                    rawObject,
                    "type",
                )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076(
                type = type,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("type", json.encodeToJsonElement(value.type))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076 =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076 is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
