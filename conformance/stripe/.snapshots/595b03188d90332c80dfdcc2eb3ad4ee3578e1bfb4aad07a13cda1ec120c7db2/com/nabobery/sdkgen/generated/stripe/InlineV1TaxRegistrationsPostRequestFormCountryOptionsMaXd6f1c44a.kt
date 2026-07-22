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
 * ded/schema/properties/country_options/properties/ma.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/ma
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a(
    public val type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaTypeXd043cfde,
) {
    public class Builder {
        private var typeValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaTypeXd043cfde? =
            null

        public var type: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaTypeXd043cfde
            get() = requireNotNull(typeValue) { "type is required" }
            set(`value`) {
                typeValue = value
            }

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a {
            check(typeValue != null) { "type is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a(
                type = type,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a must be a JSON object",
                    )
            val type =
                json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaTypeXd043cfde>(
                    rawObject,
                    "type",
                )
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a(
                type = type,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a",
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a is missing required property '" + name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
