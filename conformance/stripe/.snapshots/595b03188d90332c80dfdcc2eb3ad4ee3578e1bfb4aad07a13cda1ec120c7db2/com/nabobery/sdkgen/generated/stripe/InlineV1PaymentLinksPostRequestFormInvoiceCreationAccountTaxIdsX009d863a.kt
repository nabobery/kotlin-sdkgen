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
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aBranch {
    Branch1,
    InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790,
}

public sealed class InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aNoMatchException(
    message: String,
) : InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/invoice_creation/properties/invoice_data/properties/account_tax_ids
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aInspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790) {
                    add(
                        InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aBranch.InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790,
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
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a {
            val inspection = inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aNoMatchException(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863a(
    element: JsonElement,
): InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790 =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790>()
    return InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX009d863aInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790 = matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790: value does not match InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xe63f1790",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
