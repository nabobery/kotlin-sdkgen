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
 * Result from a selfie check
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_selfie_report
 */
@Serializable(with = GelatoSelfieReport.Serializer::class)
public class GelatoSelfieReport(
    /**
     * Status of this `selfie` check.
     */
    public val status: InlineGelatoSelfieReportStatusX07703f81,
    /**
     * ID of the [File](https://docs.stripe.com/api/files) holding the image of the identity document used in this check.
     */
    public val document: String? = null,
    /**
     * Details on the verification error. Present when status is `unverified`.
     */
    public val error: InlineGelatoSelfieReportErrorX46da4547? = null,
    /**
     * ID of the [File](https://docs.stripe.com/api/files) holding the image of the selfie used in this check.
     */
    public val selfie: String? = null,
) {
    public class Builder {
        private var statusValue: InlineGelatoSelfieReportStatusX07703f81? = null

        public var status: InlineGelatoSelfieReportStatusX07703f81
            get() = requireNotNull(statusValue) { "status is required" }
            set(`value`) {
                statusValue = value
            }

        /**
         * ID of the [File](https://docs.stripe.com/api/files) holding the image of the identity document used in this
         * check.
         */
        public var document: String? = null

        /**
         * Details on the verification error. Present when status is `unverified`.
         */
        public var error: InlineGelatoSelfieReportErrorX46da4547? = null

        /**
         * ID of the [File](https://docs.stripe.com/api/files) holding the image of the selfie used in this check.
         */
        public var selfie: String? = null

        public fun build(): GelatoSelfieReport {
            check(statusValue != null) { "status is required" }
            return GelatoSelfieReport(
                status = status,
                document = document,
                error = error,
                selfie = selfie,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): GelatoSelfieReport = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<GelatoSelfieReport> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): GelatoSelfieReport {
            val jsonDecoder = decoder.requireJsonDecoder("GelatoSelfieReport")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("GelatoSelfieReport must be a JSON object")
            val status = json.decodeRequired<InlineGelatoSelfieReportStatusX07703f81>(rawObject, "status")
            return GelatoSelfieReport(
                status = status,
                document =
                    rawObject["document"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<String?>(element)
                        }
                    },
                error =
                    rawObject["error"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineGelatoSelfieReportErrorX46da4547?>(element)
                        }
                    },
                selfie =
                    rawObject["selfie"]?.let { element ->
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
            `value`: GelatoSelfieReport,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("GelatoSelfieReport")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("status", json.encodeToJsonElement(value.status))
                    value.document?.let { put("document", it) }
                    value.error?.let { put("error", json.encodeToJsonElement(it)) }
                    value.selfie?.let { put("selfie", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun gelatoSelfieReport(block: GelatoSelfieReport.Builder.() -> Unit): GelatoSelfieReport =
    GelatoSelfieReport.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name] ?: throw SerializationException("GelatoSelfieReport is missing required property '" + name + "'")
    return decodeFromJsonElement(element)
}
