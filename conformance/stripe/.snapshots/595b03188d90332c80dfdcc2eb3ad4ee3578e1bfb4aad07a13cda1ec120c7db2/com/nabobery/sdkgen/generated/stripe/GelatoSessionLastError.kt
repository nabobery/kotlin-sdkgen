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
public data class GelatoSessionLastErrorView(
    public val code: InlineGelatoSessionLastErrorCodeX68f6f737? = null,
    public val reason: String? = null,
)

/**
 * Shows last VerificationSession error
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_session_last_error
 */
@Serializable(with = GelatoSessionLastError.Serializer::class)
public class GelatoSessionLastError(
    /**
     * A short machine-readable string giving the reason for the verification or user-session failure.
     */
    public val code: InlineGelatoSessionLastErrorCodeX68f6f737? = null,
    /**
     * A message that explains the reason for verification or user-session failure.
     */
    public val reason: String? = null,
) {
    public class Builder {
        /**
         * A short machine-readable string giving the reason for the verification or user-session failure.
         */
        public var code: InlineGelatoSessionLastErrorCodeX68f6f737? = null

        /**
         * A message that explains the reason for verification or user-session failure.
         */
        public var reason: String? = null

        public fun build(): GelatoSessionLastError =
            GelatoSessionLastError(
                code = code,
                reason = reason,
            )
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): GelatoSessionLastError = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<GelatoSessionLastError> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): GelatoSessionLastError {
            val jsonDecoder = decoder.requireJsonDecoder("GelatoSessionLastError")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("GelatoSessionLastError must be a JSON object")
            return GelatoSessionLastError(
                code =
                    rawObject["code"]?.let { element ->
                        if (element ==
                            JsonNull
                        ) {
                            null
                        } else {
                            json.decodeFromJsonElement<InlineGelatoSessionLastErrorCodeX68f6f737?>(element)
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
            `value`: GelatoSessionLastError,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("GelatoSessionLastError")
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

public fun gelatoSessionLastError(block: GelatoSessionLastError.Builder.() -> Unit): GelatoSessionLastError =
    GelatoSessionLastError.build(block)
