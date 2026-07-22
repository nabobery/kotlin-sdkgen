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
 * ded/schema/properties/country_options/properties/ng.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ng
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc(
    public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgTypeX10c21aa1,
) {
    public class Builder {
        private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgTypeX10c21aa1? =
            null

        public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgTypeX10c21aa1
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc {
            check(typeValue != null) { "type is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc(
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgTypeX10c21aa1>(
                    rawObject,
                    "type",
                )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc(
                type = type,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
