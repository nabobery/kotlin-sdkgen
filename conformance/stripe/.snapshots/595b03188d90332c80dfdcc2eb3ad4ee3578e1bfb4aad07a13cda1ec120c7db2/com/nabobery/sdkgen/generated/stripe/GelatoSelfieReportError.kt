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
import kotlin.String
import kotlin.Unit

@Serializable
public data class GelatoSelfieReportErrorView(
    public val code: InlineGelatoSelfieReportErrorCodeX38374890? = null,
    public val reason: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_selfie_report_error
 */
@Serializable(with = GelatoSelfieReportError.Serializer::class)
public class GelatoSelfieReportError(
    /**
     * A short machine-readable string giving the reason for the verification failure.
     */
    public val code: InlineGelatoSelfieReportErrorCodeX38374890? = null,
    /**
     * A human-readable message giving the reason for the failure. These messages can be shown to your users.
     */
    public val reason: String? = null,
) {
    public class Builder {
        /**
         * A short machine-readable string giving the reason for the verification failure.
         */
        public var code: InlineGelatoSelfieReportErrorCodeX38374890? = null

        /**
         * A human-readable message giving the reason for the failure. These messages can be shown to your users.
         */
        public var reason: String? = null

        public fun build(): GelatoSelfieReportError =
            GelatoSelfieReportError(
                code = code,
                reason = reason,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): GelatoSelfieReportError = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<GelatoSelfieReportError> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): GelatoSelfieReportError {
            val jsonDecoder = decoder.requireJsonDecoder("GelatoSelfieReportError")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("GelatoSelfieReportError must be a JSON object")
            return GelatoSelfieReportError(
                code =
                    rawObject["code"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineGelatoSelfieReportErrorCodeX38374890?>(element)
                        }
                    },
                reason =
                    rawObject["reason"]?.let { element ->
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
            `value`: GelatoSelfieReportError,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("GelatoSelfieReportError")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    value.code?.let { put("code", json.encodeToJsonElement(it)) }
                    value.reason?.let { put("reason", it) }
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun gelatoSelfieReportError(block: GelatoSelfieReportError.Builder.() -> Unit): GelatoSelfieReportError =
    GelatoSelfieReportError.build(block)
