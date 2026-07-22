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

public enum class InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacBranch {
    Branch1,
    InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd,
}

public sealed class InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacNoMatchException(
    message: String,
) : InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacDecodingException(message)

internal data class InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/tax_amounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes/post/requestBody/content/application~1x-www-form-urlencoded/sc
 * hema/properties/lines/items/properties/tax_amounts
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac.Serializer::class)
public class InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacInspection,
) {
    public val branch1:
        List<InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd:
        InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd) {
                json
                    .decodeFromJsonElement<InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd) {
                    add(
                        InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacBranch.InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd,
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
        ): InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac {
            val inspection = inspectInlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacNoMatchException(
                    "InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eac(
    element: JsonElement,
): InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf1ItemXa9b67d44>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd =
        element
            .isJsonDecodable<InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd>()
    return InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsXf48d6eacInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd = matchesInlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd) {
                    add(
                        "InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd: value does not match InlineV1CreditNotesPostRequestFormLinesItemTaxAmountsAnyOf2Xb875d2dd",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
