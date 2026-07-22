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

public enum class InlineCreditNotesPretaxCreditAmountDiscountX67821026Branch {
    Branch1,
    Discount,
    DeletedDiscount,
}

public sealed class InlineCreditNotesPretaxCreditAmountDiscountX67821026DecodingException(
    message: String,
) : SerializationException(message)

public class InlineCreditNotesPretaxCreditAmountDiscountX67821026NoMatchException(
    message: String,
) : InlineCreditNotesPretaxCreditAmountDiscountX67821026DecodingException(message)

internal data class InlineCreditNotesPretaxCreditAmountDiscountX67821026Inspection(
    public val matchesBranch1: Boolean,
    public val matchesDiscount: Boolean,
    public val matchesDeletedDiscount: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesDiscount, matchesDeletedDiscount).count { it }
}

/**
 * The discount that was applied to get this pretax credit amount.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/credit_notes_pretax_credit_amount/properties/discount
 */
@Serializable(with = InlineCreditNotesPretaxCreditAmountDiscountX67821026.Serializer::class)
public class InlineCreditNotesPretaxCreditAmountDiscountX67821026 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineCreditNotesPretaxCreditAmountDiscountX67821026Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val discount: Discount? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesDiscount) json.decodeFromJsonElement<Discount>(raw) else null }

    public val deletedDiscount: DeletedDiscount? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesDeletedDiscount) json.decodeFromJsonElement<DeletedDiscount>(raw) else null
        }

    public val matchedBranches: Set<InlineCreditNotesPretaxCreditAmountDiscountX67821026Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineCreditNotesPretaxCreditAmountDiscountX67821026Branch.Branch1)
                if (inspection.matchesDiscount) add(InlineCreditNotesPretaxCreditAmountDiscountX67821026Branch.Discount)
                if (inspection.matchesDeletedDiscount) {
                    add(
                        InlineCreditNotesPretaxCreditAmountDiscountX67821026Branch.DeletedDiscount,
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
        ): InlineCreditNotesPretaxCreditAmountDiscountX67821026 {
            val inspection = inspectInlineCreditNotesPretaxCreditAmountDiscountX67821026(raw)
            if (inspection.matchCount == 0) {
                throw InlineCreditNotesPretaxCreditAmountDiscountX67821026NoMatchException(
                    "InlineCreditNotesPretaxCreditAmountDiscountX67821026 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineCreditNotesPretaxCreditAmountDiscountX67821026(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineCreditNotesPretaxCreditAmountDiscountX67821026> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineCreditNotesPretaxCreditAmountDiscountX67821026 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineCreditNotesPretaxCreditAmountDiscountX67821026")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineCreditNotesPretaxCreditAmountDiscountX67821026,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineCreditNotesPretaxCreditAmountDiscountX67821026",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineCreditNotesPretaxCreditAmountDiscountX67821026(
    element: JsonElement,
): InlineCreditNotesPretaxCreditAmountDiscountX67821026Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesDiscount = element.isJsonDecodable<Discount>()
    val matchesDeletedDiscount = element.isJsonDecodable<DeletedDiscount>()
    return InlineCreditNotesPretaxCreditAmountDiscountX67821026Inspection(
        matchesBranch1 = matchesBranch1,
        matchesDiscount = matchesDiscount,
        matchesDeletedDiscount = matchesDeletedDiscount,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesDiscount) add("Discount: value does not match Discount")
                if (!matchesDeletedDiscount) add("DeletedDiscount: value does not match DeletedDiscount")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
