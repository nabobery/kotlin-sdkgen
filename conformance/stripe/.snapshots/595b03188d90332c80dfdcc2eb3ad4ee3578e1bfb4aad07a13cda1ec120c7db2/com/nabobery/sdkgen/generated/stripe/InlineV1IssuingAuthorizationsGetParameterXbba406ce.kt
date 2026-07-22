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

public enum class InlineV1IssuingAuthorizationsGetParameterXbba406ceBranch {
    InlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8,
    Branch2,
}

public sealed class InlineV1IssuingAuthorizationsGetParameterXbba406ceDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingAuthorizationsGetParameterXbba406ceNoMatchException(
    message: String,
) : InlineV1IssuingAuthorizationsGetParameterXbba406ceDecodingException(message)

internal data class InlineV1IssuingAuthorizationsGetParameterXbba406ceInspection(
    public val matchesInlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations/get/parameters/2/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations/get/parameters/2/schema
 */
@Serializable(with = InlineV1IssuingAuthorizationsGetParameterXbba406ce.Serializer::class)
public class InlineV1IssuingAuthorizationsGetParameterXbba406ce internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingAuthorizationsGetParameterXbba406ceInspection,
) {
    public val inlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8:
        InlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8) {
                json
                    .decodeFromJsonElement<InlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val branch2: Int? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

    public val matchedBranches: Set<InlineV1IssuingAuthorizationsGetParameterXbba406ceBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8) {
                    add(
                        InlineV1IssuingAuthorizationsGetParameterXbba406ceBranch.InlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8,
                    )
                }
                if (inspection.matchesBranch2) add(InlineV1IssuingAuthorizationsGetParameterXbba406ceBranch.Branch2)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1IssuingAuthorizationsGetParameterXbba406ce {
            val inspection = inspectInlineV1IssuingAuthorizationsGetParameterXbba406ce(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingAuthorizationsGetParameterXbba406ceNoMatchException(
                    "InlineV1IssuingAuthorizationsGetParameterXbba406ce matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingAuthorizationsGetParameterXbba406ce(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingAuthorizationsGetParameterXbba406ce> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingAuthorizationsGetParameterXbba406ce {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingAuthorizationsGetParameterXbba406ce")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingAuthorizationsGetParameterXbba406ce,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1IssuingAuthorizationsGetParameterXbba406ce",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingAuthorizationsGetParameterXbba406ce(
    element: JsonElement,
): InlineV1IssuingAuthorizationsGetParameterXbba406ceInspection {
    val matchesInlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8 =
        element
            .isJsonDecodable<InlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    return InlineV1IssuingAuthorizationsGetParameterXbba406ceInspection(
        matchesInlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8 = matchesInlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8) {
                    add(
                        "InlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8: value does not match InlineV1IssuingAuthorizationsGetParameterAnyOf1X40b6f7f8",
                    )
                }
                if (!matchesBranch2) add("Branch2: value does not match Int")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
