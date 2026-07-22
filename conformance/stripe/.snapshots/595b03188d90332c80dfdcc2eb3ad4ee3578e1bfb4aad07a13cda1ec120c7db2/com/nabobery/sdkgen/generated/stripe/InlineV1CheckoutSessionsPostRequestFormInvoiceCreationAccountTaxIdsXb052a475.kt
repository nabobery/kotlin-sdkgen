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

public enum class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475Branch {
    Branch1,
    InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475NoMatchException(
    message: String,
) : InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475DecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/invoice_creation/properties/invoice_data/properties/account_tax_ids
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475Inspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36:
        InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36) {
                json
                    .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475Branch.InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36,
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
        ): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475 {
            val inspection = inspectInlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475NoMatchException(
                    "InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475(
    element: JsonElement,
): InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36 =
        element
            .isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36>()
    return InlineV1CheckoutSessionsPostRequestFormInvoiceCreationAccountTaxIdsXb052a475Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36 = matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36) {
                    add(
                        "InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36: value does not match InlineV1CheckoutSessionsPostRequestFormInvoiceCreationInvoiceDataAnyOf2Xf1d2af36",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
