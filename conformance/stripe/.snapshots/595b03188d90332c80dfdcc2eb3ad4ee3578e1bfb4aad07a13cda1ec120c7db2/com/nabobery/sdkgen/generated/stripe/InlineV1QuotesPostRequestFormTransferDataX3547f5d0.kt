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

public enum class InlineV1QuotesPostRequestFormTransferDataX3547f5d0Branch {
    InlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61,
    InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc,
}

public sealed class InlineV1QuotesPostRequestFormTransferDataX3547f5d0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormTransferDataX3547f5d0NoMatchException(
    message: String,
) : InlineV1QuotesPostRequestFormTransferDataX3547f5d0DecodingException(message)

internal data class InlineV1QuotesPostRequestFormTransferDataX3547f5d0Inspection(
    public val matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61: Boolean,
    public val matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61,
                matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc,
            ).count {
                it
            }
}

/**
 * The data with which to automatically create a Transfer for each of the invoices.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/transfer_data
 */
@Serializable(with = InlineV1QuotesPostRequestFormTransferDataX3547f5d0.Serializer::class)
public class InlineV1QuotesPostRequestFormTransferDataX3547f5d0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1QuotesPostRequestFormTransferDataX3547f5d0Inspection,
) {
    public val inlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61:
        InlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61) {
                json
                    .decodeFromJsonElement<InlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc:
        InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc) {
                json
                    .decodeFromJsonElement<InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1QuotesPostRequestFormTransferDataX3547f5d0Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61) {
                    add(
                        InlineV1QuotesPostRequestFormTransferDataX3547f5d0Branch.InlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61,
                    )
                }
                if (inspection.matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc) {
                    add(
                        InlineV1QuotesPostRequestFormTransferDataX3547f5d0Branch.InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc,
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
        ): InlineV1QuotesPostRequestFormTransferDataX3547f5d0 {
            val inspection = inspectInlineV1QuotesPostRequestFormTransferDataX3547f5d0(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1QuotesPostRequestFormTransferDataX3547f5d0NoMatchException(
                    "InlineV1QuotesPostRequestFormTransferDataX3547f5d0 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1QuotesPostRequestFormTransferDataX3547f5d0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormTransferDataX3547f5d0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormTransferDataX3547f5d0 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormTransferDataX3547f5d0")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormTransferDataX3547f5d0,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1QuotesPostRequestFormTransferDataX3547f5d0",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1QuotesPostRequestFormTransferDataX3547f5d0(
    element: JsonElement,
): InlineV1QuotesPostRequestFormTransferDataX3547f5d0Inspection {
    val matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61 =
        element
            .isJsonDecodable<InlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61>()
    val matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc =
        element
            .isJsonDecodable<InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc>()
    return InlineV1QuotesPostRequestFormTransferDataX3547f5d0Inspection(
        matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61 = matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61,
        matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc = matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc,
        failures =
            buildList {
                if (!matchesInlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61) {
                    add(
                        "InlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61: value does not match InlineV1QuotesPostRequestFormTransferDataAnyOf1X21525c61",
                    )
                }
                if (!matchesInlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc) {
                    add(
                        "InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc: value does not match InlineV1QuotesPostRequestFormTransferDataAnyOf2Xc79047fc",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
