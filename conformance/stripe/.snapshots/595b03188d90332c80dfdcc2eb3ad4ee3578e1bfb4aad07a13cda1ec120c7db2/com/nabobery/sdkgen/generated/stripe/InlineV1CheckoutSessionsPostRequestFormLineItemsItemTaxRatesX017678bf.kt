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

public enum class InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfBranch {
    Branch1,
    InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfNoMatchException(
    message: String,
) : InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfDecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions~1{session}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/line_items/items/properties/tax_rates
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfInspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db:
        InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db) {
                json
                    .decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db) {
                    add(
                        InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfBranch.InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db,
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
        ): InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf {
            val inspection = inspectInlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfNoMatchException(
                    "InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bf(
    element: JsonElement,
): InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db =
        element
            .isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db>()
    return InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesX017678bfInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db = matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db) {
                    add(
                        "InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db: value does not match InlineV1CheckoutSessionsPostRequestFormLineItemsItemTaxRatesAnyOf2X8f1941db",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
