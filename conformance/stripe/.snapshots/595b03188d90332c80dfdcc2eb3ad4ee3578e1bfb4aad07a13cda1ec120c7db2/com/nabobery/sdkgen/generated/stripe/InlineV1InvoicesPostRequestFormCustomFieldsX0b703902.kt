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

public enum class InlineV1InvoicesPostRequestFormCustomFieldsX0b703902Branch {
    Branch1,
    InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5,
}

public sealed class InlineV1InvoicesPostRequestFormCustomFieldsX0b703902DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormCustomFieldsX0b703902NoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormCustomFieldsX0b703902DecodingException(message)

internal data class InlineV1InvoicesPostRequestFormCustomFieldsX0b703902Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5).count { it }
}

/**
 * A list of up to 4 custom fields to be displayed on the invoice.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/custom_fields
 */
@Serializable(with = InlineV1InvoicesPostRequestFormCustomFieldsX0b703902.Serializer::class)
public class InlineV1InvoicesPostRequestFormCustomFieldsX0b703902 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormCustomFieldsX0b703902Inspection,
) {
    public val branch1: List<InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5:
        InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1InvoicesPostRequestFormCustomFieldsX0b703902Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormCustomFieldsX0b703902Branch.Branch1)
                if (inspection.matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5) {
                    add(
                        InlineV1InvoicesPostRequestFormCustomFieldsX0b703902Branch.InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5,
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
        ): InlineV1InvoicesPostRequestFormCustomFieldsX0b703902 {
            val inspection = inspectInlineV1InvoicesPostRequestFormCustomFieldsX0b703902(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormCustomFieldsX0b703902NoMatchException(
                    "InlineV1InvoicesPostRequestFormCustomFieldsX0b703902 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormCustomFieldsX0b703902(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormCustomFieldsX0b703902> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormCustomFieldsX0b703902 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormCustomFieldsX0b703902")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormCustomFieldsX0b703902,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesPostRequestFormCustomFieldsX0b703902",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormCustomFieldsX0b703902(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormCustomFieldsX0b703902Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1InvoicesPostRequestFormCustomFieldsAnyOf1ItemX5eae9dea>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5>()
    return InlineV1InvoicesPostRequestFormCustomFieldsX0b703902Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5 = matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5) {
                    add(
                        "InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5: value does not match InlineV1InvoicesPostRequestFormCustomFieldsAnyOf2X298077d5",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
