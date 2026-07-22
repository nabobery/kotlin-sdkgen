package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dBranch {
    Branch1,
    InlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2,
}

public sealed class InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dNoMatchException(
    message: String,
) : InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dDecodingException(message)

internal data class InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2,
            ).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1transactions~1{transaction}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d.Serializer::class)
public class InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dInspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2:
        InlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2) {
                json
                    .decodeFromJsonElement<InlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2) {
                    add(
                        InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dBranch.InlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2,
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
        ): InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d {
            val inspection = inspectInlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dNoMatchException(
                    "InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d(
    element: JsonElement,
): InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dInspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2 =
        element
            .isJsonDecodable<InlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2>()
    return InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14dInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2 = matchesInlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2) {
                    add(
                        "InlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2: value does not match InlineV1IssuingTransactionsPostRequestFormMetadataAnyOf2X3a4f97b2",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
