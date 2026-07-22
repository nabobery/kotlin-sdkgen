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

public enum class InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50Branch {
    Branch1,
    InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e,
}

public sealed class InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50NoMatchException(
    message: String,
) : InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50DecodingException(message)

internal data class InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e).count { it }
}

/**
 * The account on behalf of which to charge.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/on_behalf_of
 */
@Serializable(with = InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50.Serializer::class)
public class InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50Inspection,
) {
    public val branch1: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

    public val inlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e:
        InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e) {
                json
                    .decodeFromJsonElement<InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50Branch.Branch1)
                if (inspection.matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e) {
                    add(
                        InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50Branch.InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e,
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
        ): InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50 {
            val inspection = inspectInlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50NoMatchException(
                    "InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50,
        ) {
            encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50(
    element: JsonElement,
): InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50Inspection {
    val matchesBranch1 = element.isJsonDecodable<String>()
    val matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e =
        element
            .isJsonDecodable<InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e>()
    return InlineV1QuotesPostRequestFormOnBehalfOfXd94a4d50Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e = matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match String")
                if (!matchesInlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e) {
                    add(
                        "InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e: value does not match InlineV1QuotesPostRequestFormOnBehalfOfAnyOf2Xa2655a8e",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
