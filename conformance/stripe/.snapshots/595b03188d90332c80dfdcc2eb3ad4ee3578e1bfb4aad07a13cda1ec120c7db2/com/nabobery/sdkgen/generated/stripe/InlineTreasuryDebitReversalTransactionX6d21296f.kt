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

public enum class InlineTreasuryDebitReversalTransactionX6d21296fBranch {
    Branch1,
    TreasuryTransaction,
}

public sealed class InlineTreasuryDebitReversalTransactionX6d21296fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineTreasuryDebitReversalTransactionX6d21296fNoMatchException(
    message: String,
) : InlineTreasuryDebitReversalTransactionX6d21296fDecodingException(message)

internal data class InlineTreasuryDebitReversalTransactionX6d21296fInspection(
    public val matchesBranch1: Boolean,
    public val matchesTreasuryTransaction: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesTreasuryTransaction).count { it }
}

/**
 * The Transaction associated with this object.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.debit_reversal/properties/transaction
 */
@Serializable(with = InlineTreasuryDebitReversalTransactionX6d21296f.Serializer::class)
public class InlineTreasuryDebitReversalTransactionX6d21296f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTreasuryDebitReversalTransactionX6d21296fInspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val treasuryTransaction: TreasuryTransaction? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTreasuryTransaction) json.decodeFromJsonElement<TreasuryTransaction>(raw) else null
        }

    public val matchedBranches: Set<InlineTreasuryDebitReversalTransactionX6d21296fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineTreasuryDebitReversalTransactionX6d21296fBranch.Branch1)
                if (inspection.matchesTreasuryTransaction) {
                    add(
                        InlineTreasuryDebitReversalTransactionX6d21296fBranch.TreasuryTransaction,
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
        ): InlineTreasuryDebitReversalTransactionX6d21296f {
            val inspection = inspectInlineTreasuryDebitReversalTransactionX6d21296f(raw)
            if (inspection.matchCount == 0) {
                throw InlineTreasuryDebitReversalTransactionX6d21296fNoMatchException(
                    "InlineTreasuryDebitReversalTransactionX6d21296f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTreasuryDebitReversalTransactionX6d21296f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTreasuryDebitReversalTransactionX6d21296f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTreasuryDebitReversalTransactionX6d21296f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryDebitReversalTransactionX6d21296f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryDebitReversalTransactionX6d21296f,
        ) {
            encoder.requireJsonEncoder("InlineTreasuryDebitReversalTransactionX6d21296f").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTreasuryDebitReversalTransactionX6d21296f(
    element: JsonElement,
): InlineTreasuryDebitReversalTransactionX6d21296fInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesTreasuryTransaction = element.isJsonDecodable<TreasuryTransaction>()
    return InlineTreasuryDebitReversalTransactionX6d21296fInspection(
        matchesBranch1 = matchesBranch1,
        matchesTreasuryTransaction = matchesTreasuryTransaction,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesTreasuryTransaction) add("TreasuryTransaction: value does not match TreasuryTransaction")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
