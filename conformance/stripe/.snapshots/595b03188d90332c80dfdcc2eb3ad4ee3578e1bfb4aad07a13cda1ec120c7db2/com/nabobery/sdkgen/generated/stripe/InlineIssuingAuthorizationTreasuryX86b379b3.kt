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

public enum class InlineIssuingAuthorizationTreasuryX86b379b3Branch {
    IssuingAuthorizationTreasury,
}

public sealed class InlineIssuingAuthorizationTreasuryX86b379b3DecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingAuthorizationTreasuryX86b379b3NoMatchException(
    message: String,
) : InlineIssuingAuthorizationTreasuryX86b379b3DecodingException(message)

internal data class InlineIssuingAuthorizationTreasuryX86b379b3Inspection(
    public val matchesIssuingAuthorizationTreasury: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingAuthorizationTreasury).count { it }
}

/**
 * [Treasury](https://docs.stripe.com/api/treasury) details related to this authorization if it was created on a
 * [FinancialAccount](https://docs.stripe.com/api/treasury/financial_accounts).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.authorization/properties/treasury
 */
@Serializable(with = InlineIssuingAuthorizationTreasuryX86b379b3.Serializer::class)
public class InlineIssuingAuthorizationTreasuryX86b379b3 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingAuthorizationTreasuryX86b379b3Inspection,
) {
    public val issuingAuthorizationTreasury: IssuingAuthorizationTreasuryView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingAuthorizationTreasury) {
                json
                    .decodeFromJsonElement<IssuingAuthorizationTreasuryView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingAuthorizationTreasuryX86b379b3Branch>
        get() =
            buildSet {
                if (inspection.matchesIssuingAuthorizationTreasury) {
                    add(
                        InlineIssuingAuthorizationTreasuryX86b379b3Branch.IssuingAuthorizationTreasury,
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
        ): InlineIssuingAuthorizationTreasuryX86b379b3 {
            val inspection = inspectInlineIssuingAuthorizationTreasuryX86b379b3(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingAuthorizationTreasuryX86b379b3NoMatchException(
                    "InlineIssuingAuthorizationTreasuryX86b379b3 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingAuthorizationTreasuryX86b379b3(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingAuthorizationTreasuryX86b379b3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingAuthorizationTreasuryX86b379b3 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingAuthorizationTreasuryX86b379b3")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingAuthorizationTreasuryX86b379b3,
        ) {
            encoder.requireJsonEncoder("InlineIssuingAuthorizationTreasuryX86b379b3").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingAuthorizationTreasuryX86b379b3(
    element: JsonElement,
): InlineIssuingAuthorizationTreasuryX86b379b3Inspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingAuthorizationTreasuryX86b379b3Inspection(
            matchesIssuingAuthorizationTreasury = false,
            failures = listOf("IssuingAuthorizationTreasury: expected JSON object"),
        )
    val matchesIssuingAuthorizationTreasury =
        raw["received_credits"].isStringArray() && raw["received_debits"].isStringArray()
    return InlineIssuingAuthorizationTreasuryX86b379b3Inspection(
        matchesIssuingAuthorizationTreasury = matchesIssuingAuthorizationTreasury,
        failures =
            buildList {
                if (!matchesIssuingAuthorizationTreasury) {
                    add(
                        "IssuingAuthorizationTreasury: required properties 'received_credits', 'received_debits' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
