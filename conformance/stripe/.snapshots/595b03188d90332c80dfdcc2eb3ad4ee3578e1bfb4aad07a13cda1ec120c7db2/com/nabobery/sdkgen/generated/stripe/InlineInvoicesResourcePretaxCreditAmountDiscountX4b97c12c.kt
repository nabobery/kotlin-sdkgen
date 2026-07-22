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

public enum class InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cBranch {
    Branch1,
    Discount,
    DeletedDiscount,
}

public sealed class InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cNoMatchException(
    message: String,
) : InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cDecodingException(message)

internal data class InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cInspection(
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
 * Source: sdkgen://source/openapi.json#/components/schemas/invoices_resource_pretax_credit_amount/properties/discount
 */
@Serializable(with = InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c.Serializer::class)
public class InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cInspection,
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

    public val matchedBranches: Set<InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cBranch.Branch1,
                    )
                }
                if (inspection.matchesDiscount) {
                    add(
                        InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cBranch.Discount,
                    )
                }
                if (inspection.matchesDeletedDiscount) {
                    add(
                        InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cBranch.DeletedDiscount,
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
        ): InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c {
            val inspection = inspectInlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c(raw)
            if (inspection.matchCount == 0) {
                throw InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cNoMatchException(
                    "InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12c(
    element: JsonElement,
): InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cInspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesDiscount = element.isJsonDecodable<Discount>()
    val matchesDeletedDiscount = element.isJsonDecodable<DeletedDiscount>()
    return InlineInvoicesResourcePretaxCreditAmountDiscountX4b97c12cInspection(
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
