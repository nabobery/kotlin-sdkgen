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

public enum class InlineV1PayoutsGetParameterX388d8ebcBranch {
    InlineV1PayoutsGetParameterAnyOf1Xbe200ca6,
    Branch2,
}

public sealed class InlineV1PayoutsGetParameterX388d8ebcDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PayoutsGetParameterX388d8ebcNoMatchException(
    message: String,
) : InlineV1PayoutsGetParameterX388d8ebcDecodingException(message)

internal data class InlineV1PayoutsGetParameterX388d8ebcInspection(
    public val matchesInlineV1PayoutsGetParameterAnyOf1Xbe200ca6: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInlineV1PayoutsGetParameterAnyOf1Xbe200ca6, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1payouts/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1payouts/get/parameters/1/schema
 */
@Serializable(with = InlineV1PayoutsGetParameterX388d8ebc.Serializer::class)
public class InlineV1PayoutsGetParameterX388d8ebc internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PayoutsGetParameterX388d8ebcInspection,
) {
    public val inlineV1PayoutsGetParameterAnyOf1Xbe200ca6: InlineV1PayoutsGetParameterAnyOf1Xbe200ca6?
        by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PayoutsGetParameterAnyOf1Xbe200ca6) {
                json
                    .decodeFromJsonElement<InlineV1PayoutsGetParameterAnyOf1Xbe200ca6>(
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

    public val matchedBranches: Set<InlineV1PayoutsGetParameterX388d8ebcBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1PayoutsGetParameterAnyOf1Xbe200ca6) {
                    add(
                        InlineV1PayoutsGetParameterX388d8ebcBranch.InlineV1PayoutsGetParameterAnyOf1Xbe200ca6,
                    )
                }
                if (inspection.matchesBranch2) add(InlineV1PayoutsGetParameterX388d8ebcBranch.Branch2)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1PayoutsGetParameterX388d8ebc {
            val inspection = inspectInlineV1PayoutsGetParameterX388d8ebc(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PayoutsGetParameterX388d8ebcNoMatchException(
                    "InlineV1PayoutsGetParameterX388d8ebc matched 0 branches: " +
                        inspection.failures.joinToString(
                            "; ",
                        ),
                )
            }
            return InlineV1PayoutsGetParameterX388d8ebc(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PayoutsGetParameterX388d8ebc> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1PayoutsGetParameterX388d8ebc {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1PayoutsGetParameterX388d8ebc")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PayoutsGetParameterX388d8ebc,
        ) {
            encoder.requireJsonEncoder("InlineV1PayoutsGetParameterX388d8ebc").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PayoutsGetParameterX388d8ebc(
    element: JsonElement,
): InlineV1PayoutsGetParameterX388d8ebcInspection {
    val matchesInlineV1PayoutsGetParameterAnyOf1Xbe200ca6 =
        element
            .isJsonDecodable<InlineV1PayoutsGetParameterAnyOf1Xbe200ca6>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    return InlineV1PayoutsGetParameterX388d8ebcInspection(
        matchesInlineV1PayoutsGetParameterAnyOf1Xbe200ca6 = matchesInlineV1PayoutsGetParameterAnyOf1Xbe200ca6,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1PayoutsGetParameterAnyOf1Xbe200ca6) {
                    add(
                        "InlineV1PayoutsGetParameterAnyOf1Xbe200ca6: value does not match InlineV1PayoutsGetParameterAnyOf1Xbe200ca6",
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
