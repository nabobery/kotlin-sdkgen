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

public enum class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2Branch {
    Branch1,
    InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2,
}

public sealed class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2NoMatchException(
    message: String,
) : InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2DecodingException(message)

internal data class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}~1update_lines/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/lines/items/properties/metadata
 */
@Serializable(with = InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2.Serializer::class)
public class InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2:
        InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2) {
                    add(
                        InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2Branch.InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2,
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
        ): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2 {
            val inspection = inspectInlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2NoMatchException(
                    "InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2(
    element: JsonElement,
): InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2 =
        element
            .isJsonDecodable<InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2>()
    return InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataXbe574ef2Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2 = matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2) {
                    add(
                        "InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2: value does not match InlineV1InvoicesUpdateLinesPostRequestFormLinesItemMetadataAnyOf2Xacac53f2",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
