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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormX98b4d7b7.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormX98b4d7b7(
    /**
     * Time at which the Tax Registration becomes active. It can be either `now` to indicate the current time, or a future
     * timestamp measured in seconds since the Unix epoch.
     */
    public val activeFrom: InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a,
    /**
     * Two-letter country code ([ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2)).
     */
    public val country: String,
    /**
     * Specific options for a registration in the specified `country`.
     */
    public val countryOptions: InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f,
    /**
     * Specifies which fields in the response should be expanded.
     */
    public val expand: List<String>? = null,
    /**
     * If set, the Tax Registration stops being active at this time. If not set, the Tax Registration will be active
     * indefinitely. Timestamp measured in seconds since the Unix epoch.
     */
    public val expiresAt: Int? = null,
) {
    public class Builder {
        private var activeFromValue: InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a? = null

        public var activeFrom: InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a
            get() = requireNotNull(activeFromValue) { "activeFrom is required" }
            set(`value`) {
                activeFromValue = value
            }

        private var countryValue: String? = null

        public var country: String
            get() = requireNotNull(countryValue) { "country is required" }
            set(`value`) {
                countryValue = value
            }

        private var countryOptionsValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f? =
            null

        public var countryOptions: InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f
            get() = requireNotNull(countryOptionsValue) { "countryOptions is required" }
            set(`value`) {
                countryOptionsValue = value
            }

        /**
         * Specifies which fields in the response should be expanded.
         */
        public var expand: List<String>? = null

        /**
         * If set, the Tax Registration stops being active at this time. If not set, the Tax Registration will be active
         * indefinitely. Timestamp measured in seconds since the Unix epoch.
         */
        public var expiresAt: Int? = null

        public fun build(): InlineV1TaxRegistrationsPostRequestFormX98b4d7b7 {
            check(activeFromValue != null) { "activeFrom is required" }
            check(countryValue != null) { "country is required" }
            check(countryOptionsValue != null) { "countryOptions is required" }
            return InlineV1TaxRegistrationsPostRequestFormX98b4d7b7(
                activeFrom = activeFrom,
                country = country,
                countryOptions = countryOptions,
                expand = expand,
                expiresAt = expiresAt,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormX98b4d7b7 =
            Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormX98b4d7b7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormX98b4d7b7 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormX98b4d7b7")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TaxRegistrationsPostRequestFormX98b4d7b7 must be a JSON object",
                    )
            val activeFrom =
                json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a>(
                    rawObject,
                    "active_from",
                )
            val country = json.decodeRequired<String>(rawObject, "country")
            val countryOptions =
                json.decodeRequired<InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f>(
                    rawObject,
                    "country_options",
                )
            return InlineV1TaxRegistrationsPostRequestFormX98b4d7b7(
                activeFrom = activeFrom,
                country = country,
                countryOptions = countryOptions,
                expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
                expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TaxRegistrationsPostRequestFormX98b4d7b7,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormX98b4d7b7")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("active_from", json.encodeToJsonElement(value.activeFrom))
                    put("country", value.country)
                    put("country_options", json.encodeToJsonElement(value.countryOptions))
                    value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
                    value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TaxRegistrationsPostRequestFormX98b4d7b7(
    block: InlineV1TaxRegistrationsPostRequestFormX98b4d7b7.Builder.() -> Unit,
): InlineV1TaxRegistrationsPostRequestFormX98b4d7b7 = InlineV1TaxRegistrationsPostRequestFormX98b4d7b7.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TaxRegistrationsPostRequestFormX98b4d7b7 is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
