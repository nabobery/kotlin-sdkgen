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

public enum class InlineQuoteTransferDataX81cc6d49Branch {
    QuotesResourceTransferData,
}

public sealed class InlineQuoteTransferDataX81cc6d49DecodingException(
    message: String,
) : SerializationException(message)

public class InlineQuoteTransferDataX81cc6d49NoMatchException(
    message: String,
) : InlineQuoteTransferDataX81cc6d49DecodingException(message)

internal data class InlineQuoteTransferDataX81cc6d49Inspection(
    public val matchesQuotesResourceTransferData: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesQuotesResourceTransferData).count { it }
}

/**
 * The account (if any) the payments will be attributed to for tax reporting, and where funds from each payment will be
 * transferred to for each of the invoices.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/quote/properties/transfer_data
 */
@Serializable(with = InlineQuoteTransferDataX81cc6d49.Serializer::class)
public class InlineQuoteTransferDataX81cc6d49 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineQuoteTransferDataX81cc6d49Inspection,
) {
    public val quotesResourceTransferData: QuotesResourceTransferDataView? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesQuotesResourceTransferData) {
                json.decodeFromJsonElement<QuotesResourceTransferDataView>(
                    raw,
                )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineQuoteTransferDataX81cc6d49Branch>
        get() =
            buildSet {
                if (inspection.matchesQuotesResourceTransferData) {
                    add(
                        InlineQuoteTransferDataX81cc6d49Branch.QuotesResourceTransferData,
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
        ): InlineQuoteTransferDataX81cc6d49 {
            val inspection = inspectInlineQuoteTransferDataX81cc6d49(raw)
            if (inspection.matchCount == 0) {
                throw InlineQuoteTransferDataX81cc6d49NoMatchException(
                    "InlineQuoteTransferDataX81cc6d49 matched 0 branches: " + inspection.failures.joinToString("; "),
                )
            }
            return InlineQuoteTransferDataX81cc6d49(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineQuoteTransferDataX81cc6d49> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineQuoteTransferDataX81cc6d49 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineQuoteTransferDataX81cc6d49")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineQuoteTransferDataX81cc6d49,
        ) {
            encoder.requireJsonEncoder("InlineQuoteTransferDataX81cc6d49").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineQuoteTransferDataX81cc6d49(element: JsonElement): InlineQuoteTransferDataX81cc6d49Inspection {
    val raw =
        element as? JsonObject ?: return InlineQuoteTransferDataX81cc6d49Inspection(
            matchesQuotesResourceTransferData = false,
            failures = listOf("QuotesResourceTransferData: expected JSON object"),
        )
    val matchesQuotesResourceTransferData = raw["destination"] != null
    return InlineQuoteTransferDataX81cc6d49Inspection(
        matchesQuotesResourceTransferData = matchesQuotesResourceTransferData,
        failures =
            buildList {
                if (!matchesQuotesResourceTransferData) {
                    add(
                        "QuotesResourceTransferData: required properties 'destination' do not match their declared types",
                    )
                }
            },
    )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean =
    this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
