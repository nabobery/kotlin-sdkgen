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

public enum class InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013Branch {
    Branch1,
    InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4,
}

public sealed class InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013NoMatchException(
    message: String,
) : InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013DecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/invoice_creation/properties/invoice_data/properties/account_tax_ids
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013Inspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4:
        InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4) {
                json
                    .decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4) {
                    add(
                        InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013Branch.InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4,
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
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013 {
            val inspection = inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013NoMatchException(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013(
    element: JsonElement,
): InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4 =
        element
            .isJsonDecodable<InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4>()
    return InlineV1PaymentLinksPostRequestFormInvoiceCreationAccountTaxIdsX5302e013Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4 = matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4) {
                    add(
                        "InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4: value does not match InlineV1PaymentLinksPostRequestFormInvoiceCreationInvoiceDataAnyOf2X37122bd4",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
