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

public enum class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cBranch {
    InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d,
    Branch2,
    InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c,
}

public sealed class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cNoMatchException(
    message: String,
) : InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cDecodingException(message)

internal data class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cInspection(
    public val matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d: Boolean,
    public val matchesBranch2: Boolean,
    public val matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d,
                matchesBranch2,
                matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/effective_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/effective_date
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c.Serializer::class)
public class InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cInspection,
) {
    public val inlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d:
        InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d) {
                json
                    .decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d>(
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

    public val inlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c:
        InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c) {
                json
                    .decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d) {
                    add(
                        InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cBranch.InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d,
                    )
                }
                if (inspection.matchesBranch2) {
                    add(
                        InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cBranch.Branch2,
                    )
                }
                if (inspection.matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c) {
                    add(
                        InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cBranch.InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c,
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
        ): InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c {
            val inspection = inspectInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cNoMatchException(
                    "InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94c(
    element: JsonElement,
): InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cInspection {
    val matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d =
        element
            .isJsonDecodable<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d>()
    val matchesBranch2 = element.isJsonDecodable<Int>()
    val matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c =
        element
            .isJsonDecodable<InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c>()
    return InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateX8945a94cInspection(
        matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d = matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d,
        matchesBranch2 = matchesBranch2,
        matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c = matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c,
        failures =
            buildList {
                if (!matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d) {
                    add(
                        "InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d: value does not match InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf1X998a869d",
                    )
                }
                if (!matchesBranch2) add("Branch2: value does not match Int")
                if (!matchesInlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c) {
                    add(
                        "InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c: value does not match InlineV1QuotesPostRequestFormSubscriptionDataEffectiveDateAnyOf3X6e410b2c",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
