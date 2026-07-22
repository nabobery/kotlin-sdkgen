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

public enum class InlineV1SetupAttemptsGetParameterX58b2fbf8Branch {
    InlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de,
    Branch2,
}

public sealed class InlineV1SetupAttemptsGetParameterX58b2fbf8DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SetupAttemptsGetParameterX58b2fbf8NoMatchException(
    message: String,
) : InlineV1SetupAttemptsGetParameterX58b2fbf8DecodingException(message)

internal data class InlineV1SetupAttemptsGetParameterX58b2fbf8Inspection(
    public val matchesInlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1setup_attempts/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1setup_attempts/get/parameters/0/schema
 */
@Serializable(with = InlineV1SetupAttemptsGetParameterX58b2fbf8.Serializer::class)
public class InlineV1SetupAttemptsGetParameterX58b2fbf8 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SetupAttemptsGetParameterX58b2fbf8Inspection,
) {
    public val inlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de:
        InlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de) {
                json
                    .decodeFromJsonElement<InlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de>(
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

    public val matchedBranches: Set<InlineV1SetupAttemptsGetParameterX58b2fbf8Branch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de) {
                    add(
                        InlineV1SetupAttemptsGetParameterX58b2fbf8Branch.InlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de,
                    )
                }
                if (inspection.matchesBranch2) add(InlineV1SetupAttemptsGetParameterX58b2fbf8Branch.Branch2)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1SetupAttemptsGetParameterX58b2fbf8 {
            val inspection = inspectInlineV1SetupAttemptsGetParameterX58b2fbf8(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SetupAttemptsGetParameterX58b2fbf8NoMatchException(
                    "InlineV1SetupAttemptsGetParameterX58b2fbf8 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SetupAttemptsGetParameterX58b2fbf8(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SetupAttemptsGetParameterX58b2fbf8> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SetupAttemptsGetParameterX58b2fbf8 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupAttemptsGetParameterX58b2fbf8")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SetupAttemptsGetParameterX58b2fbf8,
        ) {
            encoder.requireJsonEncoder("InlineV1SetupAttemptsGetParameterX58b2fbf8").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SetupAttemptsGetParameterX58b2fbf8(
    element: JsonElement,
): InlineV1SetupAttemptsGetParameterX58b2fbf8Inspection {
    val matchesInlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de =
        element
            .isJsonDecodable<InlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    return InlineV1SetupAttemptsGetParameterX58b2fbf8Inspection(
        matchesInlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de = matchesInlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de) {
                    add(
                        "InlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de: value does not match InlineV1SetupAttemptsGetParameterAnyOf1Xa963d6de",
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
