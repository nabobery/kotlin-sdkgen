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

public enum class InlineCustomerBalanceTransactionCreditNoteX36733346Branch {
    Branch1,
    CreditNote,
}

public sealed class InlineCustomerBalanceTransactionCreditNoteX36733346DecodingException(
    message: String,
) : SerializationException(message)

public class InlineCustomerBalanceTransactionCreditNoteX36733346NoMatchException(
    message: String,
) : InlineCustomerBalanceTransactionCreditNoteX36733346DecodingException(message)

internal data class InlineCustomerBalanceTransactionCreditNoteX36733346Inspection(
    public val matchesBranch1: Boolean,
    public val matchesCreditNote: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesCreditNote).count { it }
}

/**
 * The ID of the credit note (if any) related to the transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer_balance_transaction/properties/credit_note
 */
@Serializable(with = InlineCustomerBalanceTransactionCreditNoteX36733346.Serializer::class)
public class InlineCustomerBalanceTransactionCreditNoteX36733346 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineCustomerBalanceTransactionCreditNoteX36733346Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val creditNote: CreditNote? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesCreditNote) json.decodeFromJsonElement<CreditNote>(raw) else null
        }

    public val matchedBranches: Set<InlineCustomerBalanceTransactionCreditNoteX36733346Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineCustomerBalanceTransactionCreditNoteX36733346Branch.Branch1)
                if (inspection.matchesCreditNote) {
                    add(
                        InlineCustomerBalanceTransactionCreditNoteX36733346Branch.CreditNote,
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
        ): InlineCustomerBalanceTransactionCreditNoteX36733346 {
            val inspection = inspectInlineCustomerBalanceTransactionCreditNoteX36733346(raw)
            if (inspection.matchCount == 0) {
                throw InlineCustomerBalanceTransactionCreditNoteX36733346NoMatchException(
                    "InlineCustomerBalanceTransactionCreditNoteX36733346 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineCustomerBalanceTransactionCreditNoteX36733346(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineCustomerBalanceTransactionCreditNoteX36733346> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineCustomerBalanceTransactionCreditNoteX36733346 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerBalanceTransactionCreditNoteX36733346")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCustomerBalanceTransactionCreditNoteX36733346,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineCustomerBalanceTransactionCreditNoteX36733346",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineCustomerBalanceTransactionCreditNoteX36733346(
    element: JsonElement,
): InlineCustomerBalanceTransactionCreditNoteX36733346Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesCreditNote = element.isJsonDecodable<CreditNote>()
    return InlineCustomerBalanceTransactionCreditNoteX36733346Inspection(
        matchesBranch1 = matchesBranch1,
        matchesCreditNote = matchesCreditNote,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesCreditNote) add("CreditNote: value does not match CreditNote")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
