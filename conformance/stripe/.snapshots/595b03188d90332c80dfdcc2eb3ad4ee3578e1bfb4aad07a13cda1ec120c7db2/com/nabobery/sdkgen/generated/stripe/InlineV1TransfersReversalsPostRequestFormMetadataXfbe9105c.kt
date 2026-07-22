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

public enum class InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cBranch {
    Branch1,
    InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b,
}

public sealed class InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cNoMatchException(
    message: String,
) : InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cDecodingException(message)

internal data class InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b,
            ).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1transfers~1{transfer}~1reversals~1{id}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c.Serializer::class)
public class InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cInspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b:
        InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b) {
                json
                    .decodeFromJsonElement<InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b) {
                    add(
                        InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cBranch.InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b,
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
        ): InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c {
            val inspection = inspectInlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cNoMatchException(
                    "InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TransfersReversalsPostRequestFormMetadataXfbe9105c(
    element: JsonElement,
): InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cInspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b =
        element
            .isJsonDecodable<InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b>()
    return InlineV1TransfersReversalsPostRequestFormMetadataXfbe9105cInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b = matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b) {
                    add(
                        "InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b: value does not match InlineV1TransfersReversalsPostRequestFormMetadataAnyOf2X6e78514b",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
