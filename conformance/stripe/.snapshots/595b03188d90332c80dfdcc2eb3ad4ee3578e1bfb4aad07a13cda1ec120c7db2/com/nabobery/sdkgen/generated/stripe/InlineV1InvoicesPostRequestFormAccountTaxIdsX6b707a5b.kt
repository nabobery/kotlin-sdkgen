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

public enum class InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bBranch {
    Branch1,
    InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b,
}

public sealed class InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bNoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b).count { it }
}

/**
 * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/account_tax_ids
 */
@Serializable(with = InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b.Serializer::class)
public class InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bInspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b:
        InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bBranch.Branch1)
                if (inspection.matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b) {
                    add(
                        InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bBranch.InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b,
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
        ): InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b {
            val inspection = inspectInlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bNoMatchException(
                    "InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5b(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b>()
    return InlineV1InvoicesPostRequestFormAccountTaxIdsX6b707a5bInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b = matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b) {
                    add(
                        "InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b: value does not match InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X4c8e3a9b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
