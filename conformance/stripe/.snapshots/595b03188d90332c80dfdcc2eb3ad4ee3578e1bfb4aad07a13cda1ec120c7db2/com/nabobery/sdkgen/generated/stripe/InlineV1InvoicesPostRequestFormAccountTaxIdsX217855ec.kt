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

public enum class InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecBranch {
    Branch1,
    InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c,
}

public sealed class InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecNoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c).count { it }
}

/**
 * The account tax IDs associated with the invoice. Only editable when the invoice is a draft.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/account_tax_ids
 */
@Serializable(with = InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec.Serializer::class)
public class InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecInspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c:
        InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecBranch.Branch1)
                if (inspection.matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c) {
                    add(
                        InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecBranch.InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c,
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
        ): InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec {
            val inspection = inspectInlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecNoMatchException(
                    "InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormAccountTaxIdsX217855ec(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c>()
    return InlineV1InvoicesPostRequestFormAccountTaxIdsX217855ecInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c = matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c) {
                    add(
                        "InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c: value does not match InlineV1InvoicesPostRequestFormAccountTaxIdsAnyOf2X8928292c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
