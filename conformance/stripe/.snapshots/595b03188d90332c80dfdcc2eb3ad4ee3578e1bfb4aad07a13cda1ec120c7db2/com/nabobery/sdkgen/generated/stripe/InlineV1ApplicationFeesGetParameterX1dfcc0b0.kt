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

public enum class InlineV1ApplicationFeesGetParameterX1dfcc0b0Branch {
    InlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8,
    Branch2,
}

public sealed class InlineV1ApplicationFeesGetParameterX1dfcc0b0DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1ApplicationFeesGetParameterX1dfcc0b0NoMatchException(
    message: String,
) : InlineV1ApplicationFeesGetParameterX1dfcc0b0DecodingException(message)

internal data class InlineV1ApplicationFeesGetParameterX1dfcc0b0Inspection(
    public val matchesInlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1application_fees/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1application_fees/get/parameters/1/schema
 */
@Serializable(with = InlineV1ApplicationFeesGetParameterX1dfcc0b0.Serializer::class)
public class InlineV1ApplicationFeesGetParameterX1dfcc0b0 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1ApplicationFeesGetParameterX1dfcc0b0Inspection,
) {
    public val inlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8:
        InlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8) {
                json
                    .decodeFromJsonElement<InlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8>(
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

    public val matchedBranches: Set<InlineV1ApplicationFeesGetParameterX1dfcc0b0Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8) {
                    add(
                        InlineV1ApplicationFeesGetParameterX1dfcc0b0Branch.InlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8,
                    )
                }
                if (inspection.matchesBranch2) add(InlineV1ApplicationFeesGetParameterX1dfcc0b0Branch.Branch2)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1ApplicationFeesGetParameterX1dfcc0b0 {
            val inspection = inspectInlineV1ApplicationFeesGetParameterX1dfcc0b0(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1ApplicationFeesGetParameterX1dfcc0b0NoMatchException(
                    "InlineV1ApplicationFeesGetParameterX1dfcc0b0 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1ApplicationFeesGetParameterX1dfcc0b0(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1ApplicationFeesGetParameterX1dfcc0b0> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ApplicationFeesGetParameterX1dfcc0b0 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ApplicationFeesGetParameterX1dfcc0b0")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ApplicationFeesGetParameterX1dfcc0b0,
        ) {
            encoder.requireJsonEncoder("InlineV1ApplicationFeesGetParameterX1dfcc0b0").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1ApplicationFeesGetParameterX1dfcc0b0(
    element: JsonElement,
): InlineV1ApplicationFeesGetParameterX1dfcc0b0Inspection {
    val matchesInlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8 =
        element
            .isJsonDecodable<InlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    return InlineV1ApplicationFeesGetParameterX1dfcc0b0Inspection(
        matchesInlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8 = matchesInlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8) {
                    add(
                        "InlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8: value does not match InlineV1ApplicationFeesGetParameterAnyOf1X724ff4b8",
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
