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

public enum class InlineV1IssuingDisputesGetParameterX942b23d5Branch {
    InlineV1IssuingDisputesGetParameterAnyOf1X95b9516d,
    Branch2,
}

public sealed class InlineV1IssuingDisputesGetParameterX942b23d5DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1IssuingDisputesGetParameterX942b23d5NoMatchException(
    message: String,
) : InlineV1IssuingDisputesGetParameterX942b23d5DecodingException(message)

internal data class InlineV1IssuingDisputesGetParameterX942b23d5Inspection(
    public val matchesInlineV1IssuingDisputesGetParameterAnyOf1X95b9516d: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInlineV1IssuingDisputesGetParameterAnyOf1X95b9516d, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1disputes/get/parameters/0/schema
 */
@Serializable(with = InlineV1IssuingDisputesGetParameterX942b23d5.Serializer::class)
public class InlineV1IssuingDisputesGetParameterX942b23d5 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1IssuingDisputesGetParameterX942b23d5Inspection,
) {
    public val inlineV1IssuingDisputesGetParameterAnyOf1X95b9516d:
        InlineV1IssuingDisputesGetParameterAnyOf1X95b9516d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1IssuingDisputesGetParameterAnyOf1X95b9516d) {
                json
                    .decodeFromJsonElement<InlineV1IssuingDisputesGetParameterAnyOf1X95b9516d>(
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

    public val matchedBranches: Set<InlineV1IssuingDisputesGetParameterX942b23d5Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1IssuingDisputesGetParameterAnyOf1X95b9516d) {
                    add(
                        InlineV1IssuingDisputesGetParameterX942b23d5Branch.InlineV1IssuingDisputesGetParameterAnyOf1X95b9516d,
                    )
                }
                if (inspection.matchesBranch2) add(InlineV1IssuingDisputesGetParameterX942b23d5Branch.Branch2)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1IssuingDisputesGetParameterX942b23d5 {
            val inspection = inspectInlineV1IssuingDisputesGetParameterX942b23d5(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1IssuingDisputesGetParameterX942b23d5NoMatchException(
                    "InlineV1IssuingDisputesGetParameterX942b23d5 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1IssuingDisputesGetParameterX942b23d5(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1IssuingDisputesGetParameterX942b23d5> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1IssuingDisputesGetParameterX942b23d5 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingDisputesGetParameterX942b23d5")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1IssuingDisputesGetParameterX942b23d5,
        ) {
            encoder.requireJsonEncoder("InlineV1IssuingDisputesGetParameterX942b23d5").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1IssuingDisputesGetParameterX942b23d5(
    element: JsonElement,
): InlineV1IssuingDisputesGetParameterX942b23d5Inspection {
    val matchesInlineV1IssuingDisputesGetParameterAnyOf1X95b9516d =
        element
            .isJsonDecodable<InlineV1IssuingDisputesGetParameterAnyOf1X95b9516d>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    return InlineV1IssuingDisputesGetParameterX942b23d5Inspection(
        matchesInlineV1IssuingDisputesGetParameterAnyOf1X95b9516d = matchesInlineV1IssuingDisputesGetParameterAnyOf1X95b9516d,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1IssuingDisputesGetParameterAnyOf1X95b9516d) {
                    add(
                        "InlineV1IssuingDisputesGetParameterAnyOf1X95b9516d: value does not match InlineV1IssuingDisputesGetParameterAnyOf1X95b9516d",
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
