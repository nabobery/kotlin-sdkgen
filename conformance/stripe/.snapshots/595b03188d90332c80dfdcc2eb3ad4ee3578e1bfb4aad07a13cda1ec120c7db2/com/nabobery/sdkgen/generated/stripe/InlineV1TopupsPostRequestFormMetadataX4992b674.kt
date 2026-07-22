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

public enum class InlineV1TopupsPostRequestFormMetadataX4992b674Branch {
    Branch1,
    InlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75,
}

public sealed class InlineV1TopupsPostRequestFormMetadataX4992b674DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1TopupsPostRequestFormMetadataX4992b674NoMatchException(
    message: String,
) : InlineV1TopupsPostRequestFormMetadataX4992b674DecodingException(message)

internal data class InlineV1TopupsPostRequestFormMetadataX4992b674Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1topups~1{topup}/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/metadata
 */
@Serializable(with = InlineV1TopupsPostRequestFormMetadataX4992b674.Serializer::class)
public class InlineV1TopupsPostRequestFormMetadataX4992b674 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1TopupsPostRequestFormMetadataX4992b674Inspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75:
        InlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75) {
                json
                    .decodeFromJsonElement<InlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1TopupsPostRequestFormMetadataX4992b674Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1TopupsPostRequestFormMetadataX4992b674Branch.Branch1)
                if (inspection.matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75) {
                    add(
                        InlineV1TopupsPostRequestFormMetadataX4992b674Branch.InlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75,
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
        ): InlineV1TopupsPostRequestFormMetadataX4992b674 {
            val inspection = inspectInlineV1TopupsPostRequestFormMetadataX4992b674(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1TopupsPostRequestFormMetadataX4992b674NoMatchException(
                    "InlineV1TopupsPostRequestFormMetadataX4992b674 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1TopupsPostRequestFormMetadataX4992b674(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1TopupsPostRequestFormMetadataX4992b674> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1TopupsPostRequestFormMetadataX4992b674 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1TopupsPostRequestFormMetadataX4992b674")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1TopupsPostRequestFormMetadataX4992b674,
        ) {
            encoder.requireJsonEncoder("InlineV1TopupsPostRequestFormMetadataX4992b674").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1TopupsPostRequestFormMetadataX4992b674(
    element: JsonElement,
): InlineV1TopupsPostRequestFormMetadataX4992b674Inspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75 =
        element
            .isJsonDecodable<InlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75>()
    return InlineV1TopupsPostRequestFormMetadataX4992b674Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75 = matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75) {
                    add(
                        "InlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75: value does not match InlineV1TopupsPostRequestFormMetadataAnyOf2X852a7e75",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
