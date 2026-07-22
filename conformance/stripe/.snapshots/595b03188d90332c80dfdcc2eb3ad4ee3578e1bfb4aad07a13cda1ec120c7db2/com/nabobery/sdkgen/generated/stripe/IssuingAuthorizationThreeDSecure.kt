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

@Serializable
public data class IssuingAuthorizationThreeDSecureView(
    public val result: InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_three_d_secure
 */
@Serializable(with = IssuingAuthorizationThreeDSecure.Serializer::class)
public class IssuingAuthorizationThreeDSecure(
    /**
     * The outcome of the 3D Secure authentication request.
     */
    public val result: InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3,
) {
    public class Builder {
        private var resultValue: InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3? = null

        public var result: InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3
            get() = requireNotNull(resultValue) { "result is required" }
            set(`value`) {
                resultValue = value
            }

        public fun build(): IssuingAuthorizationThreeDSecure {
            check(resultValue != null) { "result is required" }
            return IssuingAuthorizationThreeDSecure(
                result = result,
            )
        }
    }

    public companion object {
        public fun build(block: Builder.() -> Unit): IssuingAuthorizationThreeDSecure = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<IssuingAuthorizationThreeDSecure> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): IssuingAuthorizationThreeDSecure {
            val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationThreeDSecure")
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException("IssuingAuthorizationThreeDSecure must be a JSON object")
            val result = json.decodeRequired<InlineIssuingAuthorizationThreeDSecureResultX1b93b2a3>(rawObject, "result")
            return IssuingAuthorizationThreeDSecure(
                result = result,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: IssuingAuthorizationThreeDSecure,
        ) {
            val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationThreeDSecure")
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("result", json.encodeToJsonElement(value.result))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun issuingAuthorizationThreeDSecure(
    block: IssuingAuthorizationThreeDSecure.Builder.() -> Unit,
): IssuingAuthorizationThreeDSecure = IssuingAuthorizationThreeDSecure.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "IssuingAuthorizationThreeDSecure is missing required property '" + name + "'",
            )
    return decodeFromJsonElement(element)
}
