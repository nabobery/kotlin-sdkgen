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

public enum class InlineTreasuryOutboundTransferTransactionXb03a16d6Branch {
    Branch1,
    TreasuryTransaction,
}

public sealed class InlineTreasuryOutboundTransferTransactionXb03a16d6DecodingException(
    message: String,
) : SerializationException(message)

public class InlineTreasuryOutboundTransferTransactionXb03a16d6NoMatchException(
    message: String,
) : InlineTreasuryOutboundTransferTransactionXb03a16d6DecodingException(message)

internal data class InlineTreasuryOutboundTransferTransactionXb03a16d6Inspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/treasury.outbound_transfer/properties/transaction
 */
@Serializable(with = InlineTreasuryOutboundTransferTransactionXb03a16d6.Serializer::class)
public class InlineTreasuryOutboundTransferTransactionXb03a16d6 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineTreasuryOutboundTransferTransactionXb03a16d6Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val treasuryTransaction: TreasuryTransaction? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesTreasuryTransaction) json.decodeFromJsonElement<TreasuryTransaction>(raw) else null
        }

    public val matchedBranches: Set<InlineTreasuryOutboundTransferTransactionXb03a16d6Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineTreasuryOutboundTransferTransactionXb03a16d6Branch.Branch1)
                if (inspection.matchesTreasuryTransaction) {
                    add(
                        InlineTreasuryOutboundTransferTransactionXb03a16d6Branch.TreasuryTransaction,
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
        ): InlineTreasuryOutboundTransferTransactionXb03a16d6 {
            val inspection = inspectInlineTreasuryOutboundTransferTransactionXb03a16d6(raw)
            if (inspection.matchCount == 0) {
                throw InlineTreasuryOutboundTransferTransactionXb03a16d6NoMatchException(
                    "InlineTreasuryOutboundTransferTransactionXb03a16d6 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineTreasuryOutboundTransferTransactionXb03a16d6(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineTreasuryOutboundTransferTransactionXb03a16d6> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineTreasuryOutboundTransferTransactionXb03a16d6 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineTreasuryOutboundTransferTransactionXb03a16d6")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineTreasuryOutboundTransferTransactionXb03a16d6,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineTreasuryOutboundTransferTransactionXb03a16d6",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineTreasuryOutboundTransferTransactionXb03a16d6(
    element: JsonElement,
): InlineTreasuryOutboundTransferTransactionXb03a16d6Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesTreasuryTransaction = element.isJsonDecodable<TreasuryTransaction>()
    return InlineTreasuryOutboundTransferTransactionXb03a16d6Inspection(
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
