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

public enum class InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9Branch {
    Branch1,
    InlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c,
}

public sealed class InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9NoMatchException(
    message: String,
) : InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9DecodingException(message)

internal data class InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/6/schema/items/properties/tax_amounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/6/schema/items/properties/tax_amounts
 */
@Serializable(with = InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9.Serializer::class)
public class InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9Inspection,
) {
    public val branch1: List<InlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf1ItemX867cec5e>?
        by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf1ItemX867cec5e>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c:
        InlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c) {
                json
                    .decodeFromJsonElement<InlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c) {
                    add(
                        InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9Branch.InlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c,
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
        ): InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9 {
            val inspection = inspectInlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9NoMatchException(
                    "InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9(
    element: JsonElement,
): InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf1ItemX867cec5e>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c =
        element
            .isJsonDecodable<InlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c>()
    return InlineV1CreditNotesPreviewGetParameterItemTaxAmountsX6bac37f9Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c = matchesInlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c) {
                    add(
                        "InlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c: value does not match InlineV1CreditNotesPreviewGetParameterItemTaxAmountsAnyOf2Xbf2eeb2c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
