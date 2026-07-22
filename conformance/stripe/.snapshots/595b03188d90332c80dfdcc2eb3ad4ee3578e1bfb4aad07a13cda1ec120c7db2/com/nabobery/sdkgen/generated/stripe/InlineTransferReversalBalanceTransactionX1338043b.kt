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

public enum class InlineTransferReversalBalanceTransactionX1338043bBranch {
    Branch1,
    BalanceTransaction,
}

public sealed class InlineTransferReversalBalanceTransactionX1338043bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineTransferReversalBalanceTransactionX1338043bNoMatchException(
    message: String,
) : InlineTransferReversalBalanceTransactionX1338043bDecodingException(message)

internal data class InlineTransferReversalBalanceTransactionX1338043bInspection(
    public val matchesBranch1: Boolean,
    public val matchesBalanceTransaction: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesBalanceTransaction).count { it }
}

/**
 * Balance transaction that describes the impact on your account balance.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/transfer_reversal/properties/balance_transaction
 */
@Serializable(with = InlineTransferReversalBalanceTransactionX1338043b.Serializer::class)
public class InlineTransferReversalBalanceTransactionX1338043b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTransferReversalBalanceTransactionX1338043bInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val balanceTransaction: BalanceTransaction? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBalanceTransaction) json.decodeFromJsonElement<BalanceTransaction>(raw) else null
        }

    public val matchedBranches: Set<InlineTransferReversalBalanceTransactionX1338043bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineTransferReversalBalanceTransactionX1338043bBranch.Branch1)
                if (inspection.matchesBalanceTransaction) {
                    add(
                        InlineTransferReversalBalanceTransactionX1338043bBranch.BalanceTransaction,
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
        ): InlineTransferReversalBalanceTransactionX1338043b {
            val inspection = inspectInlineTransferReversalBalanceTransactionX1338043b(raw)
            if (inspection.matchCount == 0) {
                throw InlineTransferReversalBalanceTransactionX1338043bNoMatchException(
                    "InlineTransferReversalBalanceTransactionX1338043b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTransferReversalBalanceTransactionX1338043b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTransferReversalBalanceTransactionX1338043b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTransferReversalBalanceTransactionX1338043b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTransferReversalBalanceTransactionX1338043b")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTransferReversalBalanceTransactionX1338043b,
        ) {
            encoder.requireJsonEncoder("InlineTransferReversalBalanceTransactionX1338043b").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTransferReversalBalanceTransactionX1338043b(
    element: JsonElement,
): InlineTransferReversalBalanceTransactionX1338043bInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesBalanceTransaction = element.isJsonDecodable<BalanceTransaction>()
    return InlineTransferReversalBalanceTransactionX1338043bInspection(
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
