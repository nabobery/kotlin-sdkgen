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

public enum class InlineIssuingAuthorizationAmountDetailsX5b709ff0Branch {
    IssuingAuthorizationAmountDetails,
}

public sealed class InlineIssuingAuthorizationAmountDetailsX5b709ff0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationAmountDetailsX5b709ff0NoMatchException(
    message: String,
) : InlineIssuingAuthorizationAmountDetailsX5b709ff0DecodingException(message)

internal data class InlineIssuingAuthorizationAmountDetailsX5b709ff0Inspection(
    public val matchesIssuingAuthorizationAmountDetails: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingAuthorizationAmountDetails).count { it }
}

/**
 * Detailed breakdown of amount components. These amounts are denominated in `currency` and in the [smallest currency
 * unit](https://docs.stripe.com/currencies#zero-decimal).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/amount_details
 */
@Serializable(with = InlineIssuingAuthorizationAmountDetailsX5b709ff0.Serializer::class)
public class InlineIssuingAuthorizationAmountDetailsX5b709ff0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingAuthorizationAmountDetailsX5b709ff0Inspection,
) {
    public val issuingAuthorizationAmountDetails: IssuingAuthorizationAmountDetailsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingAuthorizationAmountDetails) {
                json
                    .decodeFromJsonElement<IssuingAuthorizationAmountDetailsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingAuthorizationAmountDetailsX5b709ff0Branch>
        get() =
            buildSet {
                if (inspection.matchesIssuingAuthorizationAmountDetails) {
                    add(
                        InlineIssuingAuthorizationAmountDetailsX5b709ff0Branch.IssuingAuthorizationAmountDetails,
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
        ): InlineIssuingAuthorizationAmountDetailsX5b709ff0 {
            val inspection = inspectInlineIssuingAuthorizationAmountDetailsX5b709ff0(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingAuthorizationAmountDetailsX5b709ff0NoMatchException(
                    "InlineIssuingAuthorizationAmountDetailsX5b709ff0 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingAuthorizationAmountDetailsX5b709ff0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingAuthorizationAmountDetailsX5b709ff0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationAmountDetailsX5b709ff0 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationAmountDetailsX5b709ff0")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingAuthorizationAmountDetailsX5b709ff0,
        ) {
            encoder.requireJsonEncoder("InlineIssuingAuthorizationAmountDetailsX5b709ff0").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingAuthorizationAmountDetailsX5b709ff0(
    element: JsonElement,
): InlineIssuingAuthorizationAmountDetailsX5b709ff0Inspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingAuthorizationAmountDetailsX5b709ff0Inspection(
            matchesIssuingAuthorizationAmountDetails = false,
            failures = listOf("IssuingAuthorizationAmountDetails: expected JSON object"),
        )
    val matchesIssuingAuthorizationAmountDetails = true
    return InlineIssuingAuthorizationAmountDetailsX5b709ff0Inspection(
        matchesIssuingAuthorizationAmountDetails = matchesIssuingAuthorizationAmountDetails,
        failures =
            buildList {
                if (!matchesIssuingAuthorizationAmountDetails) {
                    add(
                        "IssuingAuthorizationAmountDetails: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
