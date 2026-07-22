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

public enum class InlineV1InvoicesPostRequestFormMetadataXb27b75ddBranch {
    Branch1,
    InlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575,
}

public sealed class InlineV1InvoicesPostRequestFormMetadataXb27b75ddDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormMetadataXb27b75ddNoMatchException(
    message: String,
) : InlineV1InvoicesPostRequestFormMetadataXb27b75ddDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormMetadataXb27b75ddInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/metadata
 */
@Serializable(with = InlineV1InvoicesPostRequestFormMetadataXb27b75dd.Serializer::class)
public class InlineV1InvoicesPostRequestFormMetadataXb27b75dd internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1InvoicesPostRequestFormMetadataXb27b75ddInspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575:
        InlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575) {
                json
                    .decodeFromJsonElement<InlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1InvoicesPostRequestFormMetadataXb27b75ddBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormMetadataXb27b75ddBranch.Branch1)
                if (inspection.matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575) {
                    add(
                        InlineV1InvoicesPostRequestFormMetadataXb27b75ddBranch.InlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575,
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
        ): InlineV1InvoicesPostRequestFormMetadataXb27b75dd {
            val inspection = inspectInlineV1InvoicesPostRequestFormMetadataXb27b75dd(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1InvoicesPostRequestFormMetadataXb27b75ddNoMatchException(
                    "InlineV1InvoicesPostRequestFormMetadataXb27b75dd matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1InvoicesPostRequestFormMetadataXb27b75dd(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1InvoicesPostRequestFormMetadataXb27b75dd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormMetadataXb27b75dd {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormMetadataXb27b75dd")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1InvoicesPostRequestFormMetadataXb27b75dd,
        ) {
            encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormMetadataXb27b75dd").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1InvoicesPostRequestFormMetadataXb27b75dd(
    element: JsonElement,
): InlineV1InvoicesPostRequestFormMetadataXb27b75ddInspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575 =
        element
            .isJsonDecodable<InlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575>()
    return InlineV1InvoicesPostRequestFormMetadataXb27b75ddInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575 = matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575) {
                    add(
                        "InlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575: value does not match InlineV1InvoicesPostRequestFormMetadataAnyOf2X97141575",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
