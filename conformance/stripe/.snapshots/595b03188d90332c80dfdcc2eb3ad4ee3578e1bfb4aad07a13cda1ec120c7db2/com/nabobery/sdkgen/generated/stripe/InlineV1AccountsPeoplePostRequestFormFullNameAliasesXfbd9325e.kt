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

public enum class InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eBranch {
    Branch1,
    InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d,
}

public sealed class InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eNoMatchException(
    message: String,
) : InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eDecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d,
            ).count { it }
}

/**
 * A list of alternate names or aliases that the person is known by.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/full_name_aliases
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eInspection,
) {
    public val branch1: List<String>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null
        }

    public val inlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d:
        InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d) {
                    add(
                        InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eBranch.InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d,
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
        ): InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e {
            val inspection = inspectInlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eNoMatchException(
                    "InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325e(
    element: JsonElement,
): InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d =
        element
            .isJsonDecodable<InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d>()
    return InlineV1AccountsPeoplePostRequestFormFullNameAliasesXfbd9325eInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d = matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d) {
                    add(
                        "InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d: value does not match InlineV1AccountsPeoplePostRequestFormFullNameAliasesAnyOf2Xf09a781d",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
