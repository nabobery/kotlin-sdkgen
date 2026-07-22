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
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/us/properties/local_amusement_tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options/properties/us/properties/local_amusement_tax
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e(
    public val jurisdiction: String,
) {
    public class Builder {
        private var jurisdictionValue: String? = null

        public var jurisdiction: String
            get() = requireNotNull(jurisdictionValue) { "jurisdiction is required" }
            set(`value`) {
                jurisdictionValue = value
            }

        public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e {
            check(jurisdictionValue != null) { "jurisdiction is required" }
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e(
                jurisdiction = jurisdiction,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e must be a JSON object",
                    )
            val jurisdiction = json.decodeRequired<String>(rawObject, "jurisdiction")
            return InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e(
                jurisdiction = jurisdiction,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("jurisdiction", value.jurisdiction)
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e(
    block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e =
    InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormCountryOptionsLocalAmusementTaxXff2ebd6e is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
