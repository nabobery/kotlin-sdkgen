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

public enum class InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daBranch {
    IssuingAuthorizationThreeDSecure,
}

public sealed class InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daDecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daNoMatchException(
    message: String,
) : InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daDecodingException(message)

internal data class InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daInspection(
    public val matchesIssuingAuthorizationThreeDSecure: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingAuthorizationThreeDSecure).count { it }
}

/**
 * 3D Secure details.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/issuing_authorization_verification_data/properties/three_d_secure
 */
@Serializable(with = InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da.Serializer::class)
public class InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daInspection,
) {
    public val issuingAuthorizationThreeDSecure: IssuingAuthorizationThreeDSecureView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingAuthorizationThreeDSecure) {
                json
                    .decodeFromJsonElement<IssuingAuthorizationThreeDSecureView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daBranch>
        get() =
            buildSet {
                if (inspection.matchesIssuingAuthorizationThreeDSecure) {
                    add(
                        InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daBranch.IssuingAuthorizationThreeDSecure,
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
        ): InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da {
            val inspection = inspectInlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daNoMatchException(
                    "InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6da(
    element: JsonElement,
): InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daInspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daInspection(
            matchesIssuingAuthorizationThreeDSecure = false,
            failures = listOf("IssuingAuthorizationThreeDSecure: expected JSON object"),
        )
    val matchesIssuingAuthorizationThreeDSecure = raw["result"] != null
    return InlineIssuingAuthorizationVerificationDataThreeDSecureX2581b6daInspection(
        matchesIssuingAuthorizationThreeDSecure = matchesIssuingAuthorizationThreeDSecure,
        failures =
            buildList {
                if (!matchesIssuingAuthorizationThreeDSecure) {
                    add(
                        "IssuingAuthorizationThreeDSecure: required properties 'result' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
