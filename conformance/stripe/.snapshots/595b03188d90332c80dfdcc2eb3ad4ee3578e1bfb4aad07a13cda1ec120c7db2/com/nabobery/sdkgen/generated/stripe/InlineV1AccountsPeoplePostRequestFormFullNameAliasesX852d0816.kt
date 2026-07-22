package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816Branch {
    Branch1,
    InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a,
}

public sealed class InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816NoMatchException(
    message: String,
) : InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816DecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a,
            ).count { it }
}

/**
 * A list of alternate names or aliases that the person is known by.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people~1{person}/post/requestBody/content/application~
 * 1x-www-form-urlencoded/schema/properties/full_name_aliases
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816Inspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a:
        InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a) {
                    add(
                        InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816Branch.InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a,
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
        ): InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816 {
            val inspection = inspectInlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816NoMatchException(
                    "InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816(
    element: JsonElement,
): InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a =
        element
            .isJsonDecodable<InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a>()
    return InlineV1AccountsPeoplePostRequestFormFullNameAliasesX852d0816Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a = matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a) {
                    add(
                        "InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a: value does not match InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2X23b7ad5a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
