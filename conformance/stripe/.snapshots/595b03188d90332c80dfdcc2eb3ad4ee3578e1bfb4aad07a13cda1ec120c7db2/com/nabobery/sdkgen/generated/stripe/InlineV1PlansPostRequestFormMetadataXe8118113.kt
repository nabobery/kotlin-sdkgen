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

public enum class InlineV1PlansPostRequestFormMetadataXe8118113Branch {
    Branch1,
    InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a,
}

public sealed class InlineV1PlansPostRequestFormMetadataXe8118113DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PlansPostRequestFormMetadataXe8118113NoMatchException(
    message: String,
) : InlineV1PlansPostRequestFormMetadataXe8118113DecodingException(message)

internal data class InlineV1PlansPostRequestFormMetadataXe8118113Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1plans~1{plan}/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/metadata
 */
@Serializable(with = InlineV1PlansPostRequestFormMetadataXe8118113.Serializer::class)
public class InlineV1PlansPostRequestFormMetadataXe8118113 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PlansPostRequestFormMetadataXe8118113Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a:
        InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a) {
                json
                    .decodeFromJsonElement<InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1PlansPostRequestFormMetadataXe8118113Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1PlansPostRequestFormMetadataXe8118113Branch.Branch1)
                if (inspection.matchesInlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a) {
                    add(
                        InlineV1PlansPostRequestFormMetadataXe8118113Branch.InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a,
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
        ): InlineV1PlansPostRequestFormMetadataXe8118113 {
            val inspection = inspectInlineV1PlansPostRequestFormMetadataXe8118113(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PlansPostRequestFormMetadataXe8118113NoMatchException(
                    "InlineV1PlansPostRequestFormMetadataXe8118113 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PlansPostRequestFormMetadataXe8118113(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PlansPostRequestFormMetadataXe8118113> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PlansPostRequestFormMetadataXe8118113 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PlansPostRequestFormMetadataXe8118113")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PlansPostRequestFormMetadataXe8118113,
        ) {
            encoder.requireJsonEncoder("InlineV1PlansPostRequestFormMetadataXe8118113").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PlansPostRequestFormMetadataXe8118113(
    element: JsonElement,
): InlineV1PlansPostRequestFormMetadataXe8118113Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a =
        element
            .isJsonDecodable<InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a>()
    return InlineV1PlansPostRequestFormMetadataXe8118113Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a = matchesInlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a) {
                    add(
                        "InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a: value does not match InlineV1PlansPostRequestFormMetadataAnyOf2X8a4e8f7a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
