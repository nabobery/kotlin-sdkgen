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

public enum class InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039Branch {
    Branch1,
    InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765,
}

public sealed class InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039NoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765).count { it }
}

/**
 * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented
 * with the branding and support information of the specified account. See the [Invoices with
 * Connect](https://docs.stripe.com/billing/invoices/connect) documentation for details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/on_behalf_of
 */
@Serializable(with = InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039.Serializer::class)
public class InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765:
        InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039Branch.Branch1)
                if (inspection.matchesInlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765) {
                    add(
                        InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039Branch.InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765,
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
        ): InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039 {
            val inspection = inspectInlineV1InvoicesPostRequestFormOnBehalfOfX1772b039(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039NoMatchException(
                    "InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormOnBehalfOfX1772b039(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765>()
    return InlineV1InvoicesPostRequestFormOnBehalfOfX1772b039Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765 = matchesInlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765) {
                    add(
                        "InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765: value does not match InlineV1InvoicesPostRequestFormOnBehalfOfAnyOf2X84ed7765",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
