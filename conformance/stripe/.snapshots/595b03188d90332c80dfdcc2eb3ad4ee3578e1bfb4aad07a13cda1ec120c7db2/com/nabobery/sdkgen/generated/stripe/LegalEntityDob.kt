package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.Int
import kotlin.Unit

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/legal_entity_dob
 */
@Serializable(with = LegalEntityDob.Serializer::class)
public class LegalEntityDob(
    /**
     * The day of birth, between 1 and 31.
     */
    public val day: Int? = null,
    /**
     * The month of birth, between 1 and 12.
     */
    public val month: Int? = null,
    /**
     * The four-digit year of birth.
     */
    public val year: Int? = null,
) {
    public class Builder {
        /**
         * The day of birth, between 1 and 31.
         */
        public var day: Int? = null

        /**
         * The month of birth, between 1 and 12.
         */
        public var month: Int? = null

        /**
         * The four-digit year of birth.
         */
        public var year: Int? = null

        public fun build(): LegalEntityDob =
            LegalEntityDob(
                day = day,
                month = month,
                year = year,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): LegalEntityDob = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<LegalEntityDob> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): LegalEntityDob {
            val jsonDecoder = decoder.requireJsonDecoder("LegalEntityDob")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("LegalEntityDob must be a JSON object")
            return LegalEntityDob(
                day =
                    rawObject["day"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                month =
                    rawObject["month"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
                year =
                    rawObject["year"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<Int?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: LegalEntityDob,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("LegalEntityDob")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.day?.let { put("day", json.encodeToJsonElement(it)) }
                    value.month?.let { put("month", json.encodeToJsonElement(it)) }
                    value.year?.let { put("year", json.encodeToJsonElement(it)) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun legalEntityDob(block: LegalEntityDob.Builder.() -> Unit): LegalEntityDob = LegalEntityDob.build(block)
