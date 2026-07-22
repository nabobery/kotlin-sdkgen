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

public enum class InlineProrationDetailsCreditedItemsXce2017bdBranch {
    InvoiceItemProrationCreditedItems,
}

public sealed class InlineProrationDetailsCreditedItemsXce2017bdDecodingException(
    message: String,
) : SerializationException(message)

public class InlineProrationDetailsCreditedItemsXce2017bdNoMatchException(
    message: String,
) : InlineProrationDetailsCreditedItemsXce2017bdDecodingException(message)

internal data class InlineProrationDetailsCreditedItemsXce2017bdInspection(
    public val matchesInvoiceItemProrationCreditedItems: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInvoiceItemProrationCreditedItems).count { it }
}

/**
 * For a credit proration, links to the debit invoice line items or invoice item that the credit applies to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/proration_details/properties/credited_items
 */
@Serializable(with = InlineProrationDetailsCreditedItemsXce2017bd.Serializer::class)
public class InlineProrationDetailsCreditedItemsXce2017bd internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineProrationDetailsCreditedItemsXce2017bdInspection,
) {
    public val invoiceItemProrationCreditedItems: InvoiceItemProrationCreditedItemsView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInvoiceItemProrationCreditedItems) {
                json
                    .decodeFromJsonElement<InvoiceItemProrationCreditedItemsView>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineProrationDetailsCreditedItemsXce2017bdBranch>
        get() =
            buildSet {
                if (inspection.matchesInvoiceItemProrationCreditedItems) {
                    add(
                        InlineProrationDetailsCreditedItemsXce2017bdBranch.InvoiceItemProrationCreditedItems,
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
        ): InlineProrationDetailsCreditedItemsXce2017bd {
            val inspection = inspectInlineProrationDetailsCreditedItemsXce2017bd(raw)
            if (inspection.matchCount == 0) {
                throw InlineProrationDetailsCreditedItemsXce2017bdNoMatchException(
                    "InlineProrationDetailsCreditedItemsXce2017bd matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineProrationDetailsCreditedItemsXce2017bd(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineProrationDetailsCreditedItemsXce2017bd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineProrationDetailsCreditedItemsXce2017bd {
            val jsonDecoder = decoder.requireJsonDecoder("InlineProrationDetailsCreditedItemsXce2017bd")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineProrationDetailsCreditedItemsXce2017bd,
        ) {
            encoder.requireJsonEncoder("InlineProrationDetailsCreditedItemsXce2017bd").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineProrationDetailsCreditedItemsXce2017bd(
    element: JsonElement,
): InlineProrationDetailsCreditedItemsXce2017bdInspection {
    val raw =
        element as? JsonObject ?: return InlineProrationDetailsCreditedItemsXce2017bdInspection(
            matchesInvoiceItemProrationCreditedItems = false,
            failures = listOf("InvoiceItemProrationCreditedItems: expected JSON object"),
        )
    val matchesInvoiceItemProrationCreditedItems = raw["type"] != null
    return InlineProrationDetailsCreditedItemsXce2017bdInspection(
        matchesInvoiceItemProrationCreditedItems = matchesInvoiceItemProrationCreditedItems,
        failures =
            buildList {
                if (!matchesInvoiceItemProrationCreditedItems) {
                    add(
                        "InvoiceItemProrationCreditedItems: required properties 'type' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
