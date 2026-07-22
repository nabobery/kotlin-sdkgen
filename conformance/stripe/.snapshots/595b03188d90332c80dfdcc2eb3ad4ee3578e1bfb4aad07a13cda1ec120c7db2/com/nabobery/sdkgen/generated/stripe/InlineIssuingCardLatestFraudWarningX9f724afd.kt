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

public enum class InlineIssuingCardLatestFraudWarningX9f724afdBranch {
    IssuingCardFraudWarning,
}

public sealed class InlineIssuingCardLatestFraudWarningX9f724afdDecodingException(
    message: String,
) : SerializationException(message)

public class InlineIssuingCardLatestFraudWarningX9f724afdNoMatchException(
    message: String,
) : InlineIssuingCardLatestFraudWarningX9f724afdDecodingException(message)

internal data class InlineIssuingCardLatestFraudWarningX9f724afdInspection(
    public val matchesIssuingCardFraudWarning: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesIssuingCardFraudWarning).count { it }
}

/**
 * Stripe’s assessment of whether this card’s details have been compromised. If this property isn't null, cancel and
 * reissue the card to prevent fraudulent activity risk.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card/properties/latest_fraud_warning
 */
@Serializable(with = InlineIssuingCardLatestFraudWarningX9f724afd.Serializer::class)
public class InlineIssuingCardLatestFraudWarningX9f724afd internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineIssuingCardLatestFraudWarningX9f724afdInspection,
) {
    public val issuingCardFraudWarning: IssuingCardFraudWarningView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesIssuingCardFraudWarning) {
                json.decodeFromJsonElement<IssuingCardFraudWarningView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineIssuingCardLatestFraudWarningX9f724afdBranch>
        get() =
            buildSet {
                if (inspection.matchesIssuingCardFraudWarning) {
                    add(
                        InlineIssuingCardLatestFraudWarningX9f724afdBranch.IssuingCardFraudWarning,
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
        ): InlineIssuingCardLatestFraudWarningX9f724afd {
            val inspection = inspectInlineIssuingCardLatestFraudWarningX9f724afd(raw)
            if (inspection.matchCount == 0) {
                throw InlineIssuingCardLatestFraudWarningX9f724afdNoMatchException(
                    "InlineIssuingCardLatestFraudWarningX9f724afd matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineIssuingCardLatestFraudWarningX9f724afd(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineIssuingCardLatestFraudWarningX9f724afd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineIssuingCardLatestFraudWarningX9f724afd {
            val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardLatestFraudWarningX9f724afd")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineIssuingCardLatestFraudWarningX9f724afd,
        ) {
            encoder.requireJsonEncoder("InlineIssuingCardLatestFraudWarningX9f724afd").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineIssuingCardLatestFraudWarningX9f724afd(
    element: JsonElement,
): InlineIssuingCardLatestFraudWarningX9f724afdInspection {
    val raw =
        element as? JsonObject ?: return InlineIssuingCardLatestFraudWarningX9f724afdInspection(
            matchesIssuingCardFraudWarning = false,
            failures = listOf("IssuingCardFraudWarning: expected JSON object"),
        )
    val matchesIssuingCardFraudWarning = true
    return InlineIssuingCardLatestFraudWarningX9f724afdInspection(
        matchesIssuingCardFraudWarning = matchesIssuingCardFraudWarning,
        failures =
            buildList {
                if (!matchesIssuingCardFraudWarning) {
                    add(
                        "IssuingCardFraudWarning: required properties  do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
