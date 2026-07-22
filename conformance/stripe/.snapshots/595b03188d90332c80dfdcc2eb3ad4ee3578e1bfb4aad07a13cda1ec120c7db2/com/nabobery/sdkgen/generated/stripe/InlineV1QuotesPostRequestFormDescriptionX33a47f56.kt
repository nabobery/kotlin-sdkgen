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

public enum class InlineV1QuotesPostRequestFormDescriptionX33a47f56Branch {
    Branch1,
    InlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf,
}

public sealed class InlineV1QuotesPostRequestFormDescriptionX33a47f56DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormDescriptionX33a47f56NoMatchException(
    message: String,
) : InlineV1QuotesPostRequestFormDescriptionX33a47f56DecodingException(message)

internal data class InlineV1QuotesPostRequestFormDescriptionX33a47f56Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf).count { it }
}

/**
 * A description that will be displayed on the quote PDF.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/description
 */
@Serializable(with = InlineV1QuotesPostRequestFormDescriptionX33a47f56.Serializer::class)
public class InlineV1QuotesPostRequestFormDescriptionX33a47f56 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1QuotesPostRequestFormDescriptionX33a47f56Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf:
        InlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf) {
                json
                    .decodeFromJsonElement<InlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1QuotesPostRequestFormDescriptionX33a47f56Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormDescriptionX33a47f56Branch.Branch1)
                if (inspection.matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf) {
                    add(
                        InlineV1QuotesPostRequestFormDescriptionX33a47f56Branch.InlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf,
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
        ): InlineV1QuotesPostRequestFormDescriptionX33a47f56 {
            val inspection = inspectInlineV1QuotesPostRequestFormDescriptionX33a47f56(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1QuotesPostRequestFormDescriptionX33a47f56NoMatchException(
                    "InlineV1QuotesPostRequestFormDescriptionX33a47f56 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1QuotesPostRequestFormDescriptionX33a47f56(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormDescriptionX33a47f56> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormDescriptionX33a47f56 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormDescriptionX33a47f56")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormDescriptionX33a47f56,
        ) {
            encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormDescriptionX33a47f56").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1QuotesPostRequestFormDescriptionX33a47f56(
    element: JsonElement,
): InlineV1QuotesPostRequestFormDescriptionX33a47f56Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf =
        element
            .isJsonDecodable<InlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf>()
    return InlineV1QuotesPostRequestFormDescriptionX33a47f56Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf = matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf) {
                    add(
                        "InlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf: value does not match InlineV1QuotesPostRequestFormDescriptionAnyOf2Xbf7c6fcf",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
