package com.nabobery.sdkgen.generated.stripe

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement
import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set

public enum class InlineV1AccountsPeoplePostRequestFormDobXbd651902Branch {
    InlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d,
    InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a,
}

public sealed class InlineV1AccountsPeoplePostRequestFormDobXbd651902DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormDobXbd651902NoMatchException(
    message: String,
) : InlineV1AccountsPeoplePostRequestFormDobXbd651902DecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormDobXbd651902Inspection(
    public val matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d: Boolean,
    public val matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d,
                matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a,
            ).count {
                it
            }
}

/**
 * The person's date of birth.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/dob
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormDobXbd651902.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormDobXbd651902 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1AccountsPeoplePostRequestFormDobXbd651902Inspection,
) {
    public val inlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d:
        InlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a:
        InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a) {
                json
                    .decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1AccountsPeoplePostRequestFormDobXbd651902Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d) {
                    add(
                        InlineV1AccountsPeoplePostRequestFormDobXbd651902Branch.InlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d,
                    )
                }
                if (inspection.matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a) {
                    add(
                        InlineV1AccountsPeoplePostRequestFormDobXbd651902Branch.InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a,
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
        ): InlineV1AccountsPeoplePostRequestFormDobXbd651902 {
            val inspection = inspectInlineV1AccountsPeoplePostRequestFormDobXbd651902(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1AccountsPeoplePostRequestFormDobXbd651902NoMatchException(
                    "InlineV1AccountsPeoplePostRequestFormDobXbd651902 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1AccountsPeoplePostRequestFormDobXbd651902(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormDobXbd651902> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormDobXbd651902 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormDobXbd651902")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1AccountsPeoplePostRequestFormDobXbd651902,
        ) {
            encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormDobXbd651902").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormDobXbd651902(
    element: JsonElement,
): InlineV1AccountsPeoplePostRequestFormDobXbd651902Inspection {
    val matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d =
        element
            .isJsonDecodable<InlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d>()
    val matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a =
        element
            .isJsonDecodable<InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a>()
    return InlineV1AccountsPeoplePostRequestFormDobXbd651902Inspection(
        matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d = matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d,
        matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a = matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a,
        failures =
            buildList {
                if (!matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d) {
                    add(
                        "InlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d: value does not match InlineV1AccountsPeoplePostRequestFormDobAnyOf1X9981aa1d",
                    )
                }
                if (!matchesInlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a) {
                    add(
                        "InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a: value does not match InlineV1AccountsPeoplePostRequestFormDobAnyOf2Xfd472b1a",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
