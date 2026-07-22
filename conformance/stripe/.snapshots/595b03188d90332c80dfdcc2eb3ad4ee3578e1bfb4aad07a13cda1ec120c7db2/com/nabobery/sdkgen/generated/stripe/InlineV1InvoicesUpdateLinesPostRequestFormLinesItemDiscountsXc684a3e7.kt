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

public enum class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7Branch {
    Branch1,
    InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920,
}

public sealed class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7NoMatchException(
    message: String,
) : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7DecodingException(message)

internal data class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/discounts
 */
@Serializable(with = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7.Serializer::class)
public class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7Inspection,
) {
    public val branch1:
        List<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf1ItemX8a16a763>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf1ItemX8a16a763>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920:
        InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920) {
                    add(
                        InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7Branch.InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920,
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
        ): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7 {
            val inspection = inspectInlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7NoMatchException(
                    "InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7(
    element: JsonElement,
): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf1ItemX8a16a763>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920 =
        element
            .isJsonDecodable<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920>()
    return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsXc684a3e7Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920 = matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920) {
                    add(
                        "InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920: value does not match InlineV1InvoicesUpdateLinesPostRequestFormLinesItemDiscountsAnyOf2X0dc7e920",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
