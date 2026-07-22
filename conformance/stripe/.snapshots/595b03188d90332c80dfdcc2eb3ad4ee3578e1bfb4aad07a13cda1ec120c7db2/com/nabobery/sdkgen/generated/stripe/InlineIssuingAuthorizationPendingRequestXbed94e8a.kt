package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineIssuingAuthorizationPendingRequestXbed94e8aBranch {
    IssuingAuthorizationPendingRequest,
}

public sealed class InlineIssuingAuthorizationPendingRequestXbed94e8aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationPendingRequestXbed94e8aNoMatchException(
    message: String,
) : InlineIssuingAuthorizationPendingRequestXbed94e8aDecodingException(message)

internal data class InlineIssuingAuthorizationPendingRequestXbed94e8aInspection(
    public val matchesIssuingAuthorizationPendingRequest: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingAuthorizationPendingRequest).count { it }
}

/**
 * The pending authorization request. This field will only be non-null during an `issuing_authorization.request`
 * webhook.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/pending_request
 */
@Serializable(with = InlineIssuingAuthorizationPendingRequestXbed94e8a.Serializer::class)
public class InlineIssuingAuthorizationPendingRequestXbed94e8a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingAuthorizationPendingRequestXbed94e8aInspection,
) {
    public val issuingAuthorizationPendingRequest: IssuingAuthorizationPendingRequestView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingAuthorizationPendingRequest) {
                json
                    .decodeFromJsonElement<IssuingAuthorizationPendingRequestView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingAuthorizationPendingRequestXbed94e8aBranch>
        get() =
            buildSet {
                if (inspection.matchesIssuingAuthorizationPendingRequest) {
                    add(
                        InlineIssuingAuthorizationPendingRequestXbed94e8aBranch.IssuingAuthorizationPendingRequest,
                    )
                }
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineIssuingAuthorizationPendingRequestXbed94e8a {
            val inspection = inspectInlineIssuingAuthorizationPendingRequestXbed94e8a(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingAuthorizationPendingRequestXbed94e8aNoMatchException(
                    "InlineIssuingAuthorizationPendingRequestXbed94e8a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingAuthorizationPendingRequestXbed94e8a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingAuthorizationPendingRequestXbed94e8a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationPendingRequestXbed94e8a {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationPendingRequestXbed94e8a")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingAuthorizationPendingRequestXbed94e8a,
        ) {
            encoder.requireJsonEncoder("InlineIssuingAuthorizationPendingRequestXbed94e8a").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingAuthorizationPendingRequestXbed94e8a(
    element: JsonElement,
): InlineIssuingAuthorizationPendingRequestXbed94e8aInspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingAuthorizationPendingRequestXbed94e8aInspection(
            matchesIssuingAuthorizationPendingRequest = false,
            failures = listOf("IssuingAuthorizationPendingRequest: expected JSON object"),
        )
    val matchesIssuingAuthorizationPendingRequest =
        raw["amount"] != null && raw["currency"].isString() && raw["is_amount_controllable"] != null &&
            raw["merchant_amount"] != null &&
            raw["merchant_currency"].isString()
    return InlineIssuingAuthorizationPendingRequestXbed94e8aInspection(
        matchesIssuingAuthorizationPendingRequest = matchesIssuingAuthorizationPendingRequest,
        failures =
            buildList {
                if (!matchesIssuingAuthorizationPendingRequest) {
                    add(
                        "IssuingAuthorizationPendingRequest: required properties 'amount', 'currency', 'is_amount_controllable', 'merchant_amount', 'merchant_currency' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
