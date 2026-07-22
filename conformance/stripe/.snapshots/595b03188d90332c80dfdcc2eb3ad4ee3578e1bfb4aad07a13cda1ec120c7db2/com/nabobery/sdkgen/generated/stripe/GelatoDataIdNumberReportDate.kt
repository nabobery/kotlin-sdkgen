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

@Serializable
public data class GelatoDataIdNumberReportDateView(
    public val day: Int? = null,
    public val month: Int? = null,
    public val year: Int? = null,
)

/**
 * Point in Time
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_data_id_number_report_date
 */
@Serializable(with = GelatoDataIdNumberReportDate.Serializer::class)
public class GelatoDataIdNumberReportDate(
    /**
     * Numerical day between 1 and 31.
     */
    public val day: Int? = null,
    /**
     * Numerical month between 1 and 12.
     */
    public val month: Int? = null,
    /**
     * The four-digit year.
     */
    public val year: Int? = null,
) {
    public class Builder {
        /**
         * Numerical day between 1 and 31.
         */
        public var day: Int? = null

        /**
         * Numerical month between 1 and 12.
         */
        public var month: Int? = null

        /**
         * The four-digit year.
         */
        public var year: Int? = null

        public fun build(): GelatoDataIdNumberReportDate =
            GelatoDataIdNumberReportDate(
                day = day,
                month = month,
                year = year,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): GelatoDataIdNumberReportDate = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<GelatoDataIdNumberReportDate> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): GelatoDataIdNumberReportDate {
            val jsonDecoder = decoder.requireJsonDecoder("GelatoDataIdNumberReportDate")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("GelatoDataIdNumberReportDate must be a JSON object")
            return GelatoDataIdNumberReportDate(
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
            `value`: GelatoDataIdNumberReportDate,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("GelatoDataIdNumberReportDate")
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

public fun gelatoDataIdNumberReportDate(
    block: GelatoDataIdNumberReportDate.Builder.() -> Unit,
): GelatoDataIdNumberReportDate = GelatoDataIdNumberReportDate.build(block)
