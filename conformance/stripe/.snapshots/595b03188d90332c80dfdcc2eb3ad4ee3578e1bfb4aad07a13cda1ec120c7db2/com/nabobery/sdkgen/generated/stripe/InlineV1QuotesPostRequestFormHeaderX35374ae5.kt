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

public enum class InlineV1QuotesPostRequestFormHeaderX35374ae5Branch {
    Branch1,
    InlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb,
}

public sealed class InlineV1QuotesPostRequestFormHeaderX35374ae5DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormHeaderX35374ae5NoMatchException(
    message: String,
) : InlineV1QuotesPostRequestFormHeaderX35374ae5DecodingException(message)

internal data class InlineV1QuotesPostRequestFormHeaderX35374ae5Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb).count { it }
}

/**
 * A header that will be displayed on the quote PDF. If no value is passed, the default header configured in your [quote
 * template settings](https://dashboard.stripe.com/settings/billing/quote) will be used.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/header
 */
@Serializable(with = InlineV1QuotesPostRequestFormHeaderX35374ae5.Serializer::class)
public class InlineV1QuotesPostRequestFormHeaderX35374ae5 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1QuotesPostRequestFormHeaderX35374ae5Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb:
        InlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb) {
                json
                    .decodeFromJsonElement<InlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1QuotesPostRequestFormHeaderX35374ae5Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormHeaderX35374ae5Branch.Branch1)
                if (inspection.matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb) {
                    add(
                        InlineV1QuotesPostRequestFormHeaderX35374ae5Branch.InlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb,
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
        ): InlineV1QuotesPostRequestFormHeaderX35374ae5 {
            val inspection = inspectInlineV1QuotesPostRequestFormHeaderX35374ae5(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1QuotesPostRequestFormHeaderX35374ae5NoMatchException(
                    "InlineV1QuotesPostRequestFormHeaderX35374ae5 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1QuotesPostRequestFormHeaderX35374ae5(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormHeaderX35374ae5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormHeaderX35374ae5 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormHeaderX35374ae5")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormHeaderX35374ae5,
        ) {
            encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormHeaderX35374ae5").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1QuotesPostRequestFormHeaderX35374ae5(
    element: JsonElement,
): InlineV1QuotesPostRequestFormHeaderX35374ae5Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb =
        element
            .isJsonDecodable<InlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb>()
    return InlineV1QuotesPostRequestFormHeaderX35374ae5Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb = matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb) {
                    add(
                        "InlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb: value does not match InlineV1QuotesPostRequestFormHeaderAnyOf2X501145cb",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
