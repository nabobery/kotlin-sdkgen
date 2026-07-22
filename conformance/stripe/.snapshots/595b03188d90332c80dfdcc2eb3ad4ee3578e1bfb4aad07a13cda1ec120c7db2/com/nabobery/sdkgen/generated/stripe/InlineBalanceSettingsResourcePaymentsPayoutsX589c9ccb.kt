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

public enum class InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbBranch {
    BalanceSettingsResourcePayouts,
}

public sealed class InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbDecodingException(
    message: String,
) : SerializationException(message)

public class InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbNoMatchException(
    message: String,
) : InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbDecodingException(message)

internal data class InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbInspection(
    public val matchesBalanceSettingsResourcePayouts: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBalanceSettingsResourcePayouts).count { it }
}

/**
 * Settings specific to the account's payouts.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/balance_settings_resource_payments/properties/payouts
 */
@Serializable(with = InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb.Serializer::class)
public class InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbInspection,
) {
    public val balanceSettingsResourcePayouts: BalanceSettingsResourcePayoutsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBalanceSettingsResourcePayouts) {
                json
                    .decodeFromJsonElement<BalanceSettingsResourcePayoutsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbBranch>
        get() =
            buildSet {
                if (inspection.matchesBalanceSettingsResourcePayouts) {
                    add(
                        InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbBranch.BalanceSettingsResourcePayouts,
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
        ): InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb {
            val inspection = inspectInlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb(raw)
            if (inspection.matchCount == 0) {
                throw InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbNoMatchException(
                    "InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb {
            val jsonDecoder = decoder.requireJsonDecoder("InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineBalanceSettingsResourcePaymentsPayoutsX589c9ccb(
    element: JsonElement,
): InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbInspection {
    val raw =
        element as? JsonObject ?: return InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbInspection(
            matchesBalanceSettingsResourcePayouts = false,
            failures = listOf("BalanceSettingsResourcePayouts: expected JSON object"),
        )
    val matchesBalanceSettingsResourcePayouts = raw["status"] != null
    return InlineBalanceSettingsResourcePaymentsPayoutsX589c9ccbInspection(
        matchesBalanceSettingsResourcePayouts = matchesBalanceSettingsResourcePayouts,
        failures =
            buildList {
                if (!matchesBalanceSettingsResourcePayouts) {
                    add(
                        "BalanceSettingsResourcePayouts: required properties 'status' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
