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

public enum class InlineV1AccountsPostRequestFormMetadataX5d8f3c72Branch {
    Branch1,
    InlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec,
}

public sealed class InlineV1AccountsPostRequestFormMetadataX5d8f3c72DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormMetadataX5d8f3c72NoMatchException(
    message: String,
) : InlineV1AccountsPostRequestFormMetadataX5d8f3c72DecodingException(message)

internal data class InlineV1AccountsPostRequestFormMetadataX5d8f3c72Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/metadata
 */
@Serializable(with = InlineV1AccountsPostRequestFormMetadataX5d8f3c72.Serializer::class)
public class InlineV1AccountsPostRequestFormMetadataX5d8f3c72 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPostRequestFormMetadataX5d8f3c72Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec:
        InlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1AccountsPostRequestFormMetadataX5d8f3c72Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormMetadataX5d8f3c72Branch.Branch1)
                if (inspection.matchesInlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec) {
                    add(
                        InlineV1AccountsPostRequestFormMetadataX5d8f3c72Branch.InlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec,
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
        ): InlineV1AccountsPostRequestFormMetadataX5d8f3c72 {
            val inspection = inspectInlineV1AccountsPostRequestFormMetadataX5d8f3c72(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPostRequestFormMetadataX5d8f3c72NoMatchException(
                    "InlineV1AccountsPostRequestFormMetadataX5d8f3c72 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPostRequestFormMetadataX5d8f3c72(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPostRequestFormMetadataX5d8f3c72> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormMetadataX5d8f3c72 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormMetadataX5d8f3c72")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPostRequestFormMetadataX5d8f3c72,
        ) {
            encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormMetadataX5d8f3c72").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPostRequestFormMetadataX5d8f3c72(
    element: JsonElement,
): InlineV1AccountsPostRequestFormMetadataX5d8f3c72Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec =
        element
            .isJsonDecodable<InlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec>()
    return InlineV1AccountsPostRequestFormMetadataX5d8f3c72Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec = matchesInlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec) {
                    add(
                        "InlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec: value does not match InlineV1AccountsPostRequestFormMetadataAnyOf2X6609aeec",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
