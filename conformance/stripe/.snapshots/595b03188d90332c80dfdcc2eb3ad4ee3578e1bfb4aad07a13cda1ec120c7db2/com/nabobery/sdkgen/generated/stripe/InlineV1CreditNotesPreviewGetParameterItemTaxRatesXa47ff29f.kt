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

public enum class InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fBranch {
    Branch1,
    InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b,
}

public sealed class InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fNoMatchException(
    message: String,
) : InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fDecodingException(message)

internal data class InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b,
            ).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/6/schema/items/properties/tax_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/6/schema/items/properties/tax_rates
 */
@Serializable(with = InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f.Serializer::class)
public class InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fInspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b:
        InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b) {
                json
                    .decodeFromJsonElement<InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b) {
                    add(
                        InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fBranch.InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b,
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
        ): InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f {
            val inspection = inspectInlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fNoMatchException(
                    "InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29f(
    element: JsonElement,
): InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b =
        element
            .isJsonDecodable<InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b>()
    return InlineV1CreditNotesPreviewGetParameterItemTaxRatesXa47ff29fInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b = matchesInlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b) {
                    add(
                        "InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b: value does not match InlineV1CreditNotesPreviewGetParameterItemTaxRatesAnyOf2X96400b5b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
