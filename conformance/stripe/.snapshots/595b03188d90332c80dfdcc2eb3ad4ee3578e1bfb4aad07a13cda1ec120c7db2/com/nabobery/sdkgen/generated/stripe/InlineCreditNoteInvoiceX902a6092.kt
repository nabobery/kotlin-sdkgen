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

public enum class InlineCreditNoteInvoiceX902a6092Branch {
    Branch1,
    Invoice,
}

public sealed class InlineCreditNoteInvoiceX902a6092DecodingException(
    message: String,
) : SerializationException(message)

public class InlineCreditNoteInvoiceX902a6092NoMatchException(
    message: String,
) : InlineCreditNoteInvoiceX902a6092DecodingException(message)

internal data class InlineCreditNoteInvoiceX902a6092Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInvoice: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInvoice).count { it }
}

/**
 * ID of the invoice.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_note/properties/invoice
 */
@Serializable(with = InlineCreditNoteInvoiceX902a6092.Serializer::class)
public class InlineCreditNoteInvoiceX902a6092 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineCreditNoteInvoiceX902a6092Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val invoice: Invoice? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesInvoice) json.decodeFromJsonElement<Invoice>(raw) else null }

    public val matchedBranches: Set<InlineCreditNoteInvoiceX902a6092Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineCreditNoteInvoiceX902a6092Branch.Branch1)
                if (inspection.matchesInvoice) add(InlineCreditNoteInvoiceX902a6092Branch.Invoice)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineCreditNoteInvoiceX902a6092 {
            val inspection = inspectInlineCreditNoteInvoiceX902a6092(raw)
            if (inspection.matchCount == 0) {
                throw InlineCreditNoteInvoiceX902a6092NoMatchException(
                    "InlineCreditNoteInvoiceX902a6092 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineCreditNoteInvoiceX902a6092(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineCreditNoteInvoiceX902a6092> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineCreditNoteInvoiceX902a6092 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineCreditNoteInvoiceX902a6092")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCreditNoteInvoiceX902a6092,
        ) {
            encoder.requireJsonEncoder("InlineCreditNoteInvoiceX902a6092").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineCreditNoteInvoiceX902a6092(element: JsonElement): InlineCreditNoteInvoiceX902a6092Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInvoice = element.isJsonDecodable<Invoice>()
    return InlineCreditNoteInvoiceX902a6092Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInvoice = matchesInvoice,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInvoice) add("Invoice: value does not match Invoice")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
