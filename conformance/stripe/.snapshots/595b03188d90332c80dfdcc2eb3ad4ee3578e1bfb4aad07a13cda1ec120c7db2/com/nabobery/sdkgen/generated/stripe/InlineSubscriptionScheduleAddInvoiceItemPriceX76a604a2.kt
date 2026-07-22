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

public enum class InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2Branch {
    Branch1,
    Price,
    DeletedPrice,
}

public sealed class InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2DecodingException(
    message: String,
) : SerializationException(message)

public class InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2NoMatchException(
    message: String,
) : InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2DecodingException(message)

internal data class InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2Inspection(
    public val matchesBranch1: Boolean,
    public val matchesPrice: Boolean,
    public val matchesDeletedPrice: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesPrice, matchesDeletedPrice).count { it }
}

/**
 * ID of the price used to generate the invoice item.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription_schedule_add_invoice_item/properties/price
 */
@Serializable(with = InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2.Serializer::class)
public class InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val price: Price? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesPrice) json.decodeFromJsonElement<Price>(raw) else null }

    public val deletedPrice: DeletedPrice? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesDeletedPrice) json.decodeFromJsonElement<DeletedPrice>(raw) else null
        }

    public val matchedBranches: Set<InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2Branch.Branch1)
                if (inspection.matchesPrice) add(InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2Branch.Price)
                if (inspection.matchesDeletedPrice) {
                    add(
                        InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2Branch.DeletedPrice,
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
        ): InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2 {
            val inspection = inspectInlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2(raw)
            if (inspection.matchCount == 0) {
                throw InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2NoMatchException(
                    "InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2(
    element: JsonElement,
): InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesPrice = element.isJsonDecodable<Price>()
    val matchesDeletedPrice = element.isJsonDecodable<DeletedPrice>()
    return InlineSubscriptionScheduleAddInvoiceItemPriceX76a604a2Inspection(
        matchesBranch1 = matchesBranch1,
        matchesPrice = matchesPrice,
        matchesDeletedPrice = matchesDeletedPrice,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesPrice) add("Price: value does not match Price")
                if (!matchesDeletedPrice) add("DeletedPrice: value does not match DeletedPrice")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
