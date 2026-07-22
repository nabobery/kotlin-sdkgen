package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineTopupBalanceTransactionX090a295dBranch {
    Branch1,
    BalanceTransaction,
}

public sealed class InlineTopupBalanceTransactionX090a295dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineTopupBalanceTransactionX090a295dNoMatchException(
    message: String,
) : InlineTopupBalanceTransactionX090a295dDecodingException(message)

internal data class InlineTopupBalanceTransactionX090a295dInspection(
    public val matchesBranch1: Boolean,
    public val matchesBalanceTransaction: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * ID of the balance transaction that describes the impact of this top-up on your account balance. May not be specified
 * depending on status of top-up.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/topup/properties/balance_transaction
 */
@Serializable(with = InlineTopupBalanceTransactionX090a295d.Serializer::class)
public class InlineTopupBalanceTransactionX090a295d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTopupBalanceTransactionX090a295dInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val balanceTransaction: BalanceTransaction? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null
        }

    public val matchedBranches: Set<InlineTopupBalanceTransactionX090a295dBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineTopupBalanceTransactionX090a295dBranch.Branch1)
                if (inspection.matchesBalanceTransaction) {
                    add(
                        InlineTopupBalanceTransactionX090a295dBranch.BalanceTransaction,
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
        ): InlineTopupBalanceTransactionX090a295d {
            val inspection = inspectInlineTopupBalanceTransactionX090a295d(raw)
            if (inspection.matchCount == 0) {
                throw InlineTopupBalanceTransactionX090a295dNoMatchException(
                    "InlineTopupBalanceTransactionX090a295d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTopupBalanceTransactionX090a295d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTopupBalanceTransactionX090a295d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTopupBalanceTransactionX090a295d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTopupBalanceTransactionX090a295d")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTopupBalanceTransactionX090a295d,
        ) {
            encoder.requireJsonEncoder("InlineTopupBalanceTransactionX090a295d").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTopupBalanceTransactionX090a295d(
    element: JsonElement,
): InlineTopupBalanceTransactionX090a295dInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
    return InlineTopupBalanceTransactionX090a295dInspection(
        matchesBranch1 = matchesBranch1,
        matchesBalanceTransaction = matchesBalanceTransaction,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesBalanceTransaction) add("BalanceTransaction: value does not match BalanceTransaction")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
