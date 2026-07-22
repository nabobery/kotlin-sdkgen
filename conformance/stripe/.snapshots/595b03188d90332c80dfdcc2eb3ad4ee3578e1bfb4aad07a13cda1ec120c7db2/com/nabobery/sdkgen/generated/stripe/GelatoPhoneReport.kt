package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put
import kotlin.String
import kotlin.Unit

/**
 * Result from a phone check
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_phone_report
 */
@Serializable(with = GelatoPhoneReport.Serializer::class)
public class GelatoPhoneReport(
    /**
     * Status of this `phone` check.
     */
    public val status: InlineGelatoPhoneReportStatusX57a0ae0c,
    /**
     * Details on the verification error. Present when status is `unverified`.
     */
    public val error: InlineGelatoPhoneReportErrorX675018cc? = null,
    /**
     * Phone to be verified.
     */
    public val phone: String? = null,
) {
    public class Builder {
        private var statusValue: InlineGelatoPhoneReportStatusX57a0ae0c? = null

        public var status: InlineGelatoPhoneReportStatusX57a0ae0c
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        /**
         * Details on the verification error. Present when status is `unverified`.
         */
        public var error: InlineGelatoPhoneReportErrorX675018cc? = null

        /**
         * Phone to be verified.
         */
        public var phone: String? = null

        public fun build(): GelatoPhoneReport {
            check(statusValue != null) { "status is required" }
            return GelatoPhoneReport(
                status = status,
                error = error,
                phone = phone,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): GelatoPhoneReport = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<GelatoPhoneReport> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): GelatoPhoneReport {
            val jsonDecoder = decoder.requireJsonDecoder("GelatoPhoneReport")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("GelatoPhoneReport must be a JSON object")
            val status = json.decodeRequired<InlineGelatoPhoneReportStatusX57a0ae0c>(rawObject, "status")
            return GelatoPhoneReport(
                status = status,
                error =
                    rawObject["error"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineGelatoPhoneReportErrorX675018cc?>(element)
                        }
                    },
                phone =
                    rawObject["phone"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: GelatoPhoneReport,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("GelatoPhoneReport")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("status", json.encodeToJsonElement(value.status))
                    value.error?.let { put("error", json.encodeToJsonElement(it)) }
                    value.phone?.let { put("phone", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun gelatoPhoneReport(block: GelatoPhoneReport.Builder.() -> Unit): GelatoPhoneReport =
    GelatoPhoneReport.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("GelatoPhoneReport is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
