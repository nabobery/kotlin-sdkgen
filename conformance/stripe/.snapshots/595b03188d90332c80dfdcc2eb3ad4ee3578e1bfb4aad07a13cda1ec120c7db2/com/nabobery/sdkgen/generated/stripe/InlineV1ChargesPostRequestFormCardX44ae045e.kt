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

public enum class InlineV1ChargesPostRequestFormCardX44ae045eBranch {
    InlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d,
    Branch2,
}

public sealed class InlineV1ChargesPostRequestFormCardX44ae045eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1ChargesPostRequestFormCardX44ae045eNoMatchException(
    message: String,
) : InlineV1ChargesPostRequestFormCardX44ae045eDecodingException(message)

internal data class InlineV1ChargesPostRequestFormCardX44ae045eInspection(
    public val matchesInlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d: Boolean,
    public val matchesBranch2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesInlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d, matchesBranch2).count { it }
}

/**
 * A token, like the ones returned by [Stripe.js](https://stripe.com/docs/js).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/card
 */
@Serializable(with = InlineV1ChargesPostRequestFormCardX44ae045e.Serializer::class)
public class InlineV1ChargesPostRequestFormCardX44ae045e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1ChargesPostRequestFormCardX44ae045eInspection,
) {
    public val inlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d:
        InlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d) {
                json
                    .decodeFromJsonElement<InlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val branch2: String? by
        lazy(
            LazyThreadSafetyMode.NONE,
        ) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

    public val matchedBranches: Set<InlineV1ChargesPostRequestFormCardX44ae045eBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d) {
                    add(
                        InlineV1ChargesPostRequestFormCardX44ae045eBranch.InlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d,
                    )
                }
                if (inspection.matchesBranch2) add(InlineV1ChargesPostRequestFormCardX44ae045eBranch.Branch2)
            }

    public companion object {
        /**
         * Builds a validated wrapper around raw JSON without rewriting it.
         */
        public fun fromRaw(
            raw: JsonElement,
            json: Json = SdkJson,
        ): InlineV1ChargesPostRequestFormCardX44ae045e {
            val inspection = inspectInlineV1ChargesPostRequestFormCardX44ae045e(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1ChargesPostRequestFormCardX44ae045eNoMatchException(
                    "InlineV1ChargesPostRequestFormCardX44ae045e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1ChargesPostRequestFormCardX44ae045e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1ChargesPostRequestFormCardX44ae045e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1ChargesPostRequestFormCardX44ae045e {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesPostRequestFormCardX44ae045e")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1ChargesPostRequestFormCardX44ae045e,
        ) {
            encoder.requireJsonEncoder("InlineV1ChargesPostRequestFormCardX44ae045e").encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1ChargesPostRequestFormCardX44ae045e(
    element: JsonElement,
): InlineV1ChargesPostRequestFormCardX44ae045eInspection {
    val matchesInlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d =
        element
            .isJsonDecodable<InlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d>()
    val matchesBranch2 = element.isJsonDecodable<String>()
    return InlineV1ChargesPostRequestFormCardX44ae045eInspection(
        matchesInlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d = matchesInlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d,
        matchesBranch2 = matchesBranch2,
        failures =
            buildList {
                if (!matchesInlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d) {
                    add(
                        "InlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d: value does not match InlineV1ChargesPostRequestFormCardAnyOf1X47b2c78d",
                    )
                }
                if (!matchesBranch2) add("Branch2: value does not match String")
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
