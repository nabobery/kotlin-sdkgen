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

public enum class InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecBranch {
    Branch1,
    InlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c,
}

public sealed class InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecNoMatchException(
    message: String,
) : InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecDecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecInspection,
) {
    public val branch1: JsonObject? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

    public val inlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c:
        InlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecBranch.Branch1)
                if (inspection.matchesInlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c) {
                    add(
                        InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecBranch.InlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c,
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
        ): InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec {
            val inspection = inspectInlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecNoMatchException(
                    "InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ec(
    element: JsonElement,
): InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecInspection {
    val matchesBranch1 = element.isJsonDecodable<JsonObject>()
    val matchesInlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c =
        element
            .isJsonDecodable<InlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c>()
    return InlineV1AccountsPeoplePostRequestFormMetadataXae6fb3ecInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c = matchesInlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match JsonObject")
                if (!matchesInlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c) {
                    add(
                        "InlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c: value does not match InlineV1AccountsPeoplePostRequestFormMetadataAnyOf2X39552d6c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
