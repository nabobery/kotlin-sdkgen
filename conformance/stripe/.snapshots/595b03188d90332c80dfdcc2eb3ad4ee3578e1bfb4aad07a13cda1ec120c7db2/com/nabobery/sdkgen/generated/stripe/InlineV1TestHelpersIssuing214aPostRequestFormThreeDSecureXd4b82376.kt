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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/three_d_secure.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/verification_data/properties/three_d_secure
 */
@Serializable(with = InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376.Serializer::class)
public class InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376(
    public val result: InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429,
) {
    public class Builder {
        private var resultValue:
            InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429? = null

        public var result: InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429
            get() = requireNotNull(resultValue) { "result is required" }
            set(`value`) {
                resultValue = value
            }

        public fun build(): InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376 {
            check(resultValue != null) { "result is required" }
            return InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376(
                result = result,
            )
        }
    }

    public companion object {
        public fun build(
            block: Builder.() -> Unit,
        ): InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376 = Builder().apply(block).build()
    }

    public object Serializer : KSerializer<InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376",
                )
            val json = jsonDecoder.json
            val rawObject =
                jsonDecoder.decodeJsonElement() as? JsonObject
                    ?: throw SerializationException(
                        "InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376 must be a JSON object",
                    )
            val result =
                json.decodeRequired<InlineV1TestHelpersIssuing214aPostRequestFormVerificationDataResultXd7fb0429>(
                    rawObject,
                    "result",
                )
            return InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376(
                result = result,
            )
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376,
        ) {
            val jsonEncoder =
                encoder.requireJsonEncoder(
                    "InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376",
                )
            val json = jsonEncoder.json
            val raw =
                buildJsonObject {
                    put("result", json.encodeToJsonElement(value.result))
                }
            jsonEncoder.encodeJsonElement(raw)
        }
    }
}

public fun inlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376(
    block: InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376.Builder.() -> Unit,
): InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376 =
    InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376.build(block)

private inline fun <reified T> Json.decodeRequired(
    raw: JsonObject,
    name: String,
): T {
    val element =
        raw[name]
            ?: throw SerializationException(
                "InlineV1TestHelpersIssuing214aPostRequestFormThreeDSecureXd4b82376 is missing required property '" +
                    name +
                    "'",
            )
    return decodeFromJsonElement(element)
}
