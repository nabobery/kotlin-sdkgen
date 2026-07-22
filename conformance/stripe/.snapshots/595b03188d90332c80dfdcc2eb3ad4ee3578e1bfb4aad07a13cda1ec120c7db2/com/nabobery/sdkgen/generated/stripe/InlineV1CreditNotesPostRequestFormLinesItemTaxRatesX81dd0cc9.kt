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

public enum class InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9Branch {
    Branch1,
    InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d,
}

public sealed class InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9NoMatchException(
    message: String,
) : InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9DecodingException(message)

internal data class InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/tax_rates
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9.Serializer::class)
public class InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9Inspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d:
        InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d) {
                json
                    .decodeFromJsonElement<InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d) {
                    add(
                        InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9Branch.InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d,
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
        ): InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9 {
            val inspection = inspectInlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9NoMatchException(
                    "InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9(
    element: JsonElement,
): InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d =
        element
            .isJsonDecodable<InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d>()
    return InlineV1CreditNotesPostRequestFormLinesItemTaxRatesX81dd0cc9Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d = matchesInlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d) {
                    add(
                        "InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d: value does not match InlineV1CreditNotesPostRequestFormLinesItemTaxRatesAnyOf2Xe5c8d48d",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
