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

public enum class InlineV1ChargesGetParameterX3e2709beBranch {
    InlineV1ChargesGetParameterAnyOf1X7a2241fc,
    Branch2,
}

public sealed class InlineV1ChargesGetParameterX3e2709beDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1ChargesGetParameterX3e2709beNoMatchException(
    message: String,
) : InlineV1ChargesGetParameterX3e2709beDecodingException(message)

internal data class InlineV1ChargesGetParameterX3e2709beInspection(
    public val matchesInlineV1ChargesGetParameterAnyOf1X7a2241fc: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInlineV1ChargesGetParameterAnyOf1X7a2241fc, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1charges/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1charges/get/parameters/0/schema
 */
@Serializable(with = InlineV1ChargesGetParameterX3e2709be.Serializer::class)
public class InlineV1ChargesGetParameterX3e2709be internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1ChargesGetParameterX3e2709beInspection,
) {
    public val inlineV1ChargesGetParameterAnyOf1X7a2241fc: InlineV1ChargesGetParameterAnyOf1X7a2241fc?
        by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1ChargesGetParameterAnyOf1X7a2241fc) {
                json
                    .decodeFromJsonElement<InlineV1ChargesGetParameterAnyOf1X7a2241fc>(
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

    public val matchedBranches: Set<InlineV1ChargesGetParameterX3e2709beBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1ChargesGetParameterAnyOf1X7a2241fc) {
                    add(
                        InlineV1ChargesGetParameterX3e2709beBranch.InlineV1ChargesGetParameterAnyOf1X7a2241fc,
                    )
                }
                if (inspection.matchesBranch2) add(InlineV1ChargesGetParameterX3e2709beBranch.Branch2)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1ChargesGetParameterX3e2709be {
            val inspection = inspectInlineV1ChargesGetParameterX3e2709be(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1ChargesGetParameterX3e2709beNoMatchException(
                    "InlineV1ChargesGetParameterX3e2709be matched 0 branches: " +
                        inspection.failures.joinToString(
                            "; ",
                        ),
                )
            }
            return InlineV1ChargesGetParameterX3e2709be(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1ChargesGetParameterX3e2709be> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ChargesGetParameterX3e2709be {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesGetParameterX3e2709be")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesGetParameterX3e2709be,
        ) {
            encoder.requireJsonEncoder("InlineV1ChargesGetParameterX3e2709be").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1ChargesGetParameterX3e2709be(
    element: JsonElement,
): InlineV1ChargesGetParameterX3e2709beInspection {
    val matchesInlineV1ChargesGetParameterAnyOf1X7a2241fc =
        element
            .isJsonDecodable<InlineV1ChargesGetParameterAnyOf1X7a2241fc>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    return InlineV1ChargesGetParameterX3e2709beInspection(
        matchesInlineV1ChargesGetParameterAnyOf1X7a2241fc = matchesInlineV1ChargesGetParameterAnyOf1X7a2241fc,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1ChargesGetParameterAnyOf1X7a2241fc) {
                    add(
                        "InlineV1ChargesGetParameterAnyOf1X7a2241fc: value does not match InlineV1ChargesGetParameterAnyOf1X7a2241fc",
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
