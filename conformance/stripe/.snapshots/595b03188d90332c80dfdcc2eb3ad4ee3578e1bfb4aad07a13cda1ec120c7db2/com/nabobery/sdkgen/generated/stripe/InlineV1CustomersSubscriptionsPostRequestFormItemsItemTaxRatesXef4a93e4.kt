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

public enum class InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4Branch {
    Branch1,
    InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4NoMatchException(
    message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/items/items/properties/tax_rates
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4Inspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2:
        InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2) {
                json
                    .decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2) {
                    add(
                        InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4Branch.InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2,
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
        ): InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4 {
            val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4NoMatchException(
                    "InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4(
    element: JsonElement,
): InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2 =
        element
            .isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2>()
    return InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesXef4a93e4Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2 = matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2) {
                    add(
                        "InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2: value does not match InlineV1CustomersSubscriptionsPostRequestFormItemsItemTaxRatesAnyOf2X76c313a2",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
