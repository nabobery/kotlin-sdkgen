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

public enum class InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddBranch {
    Branch1,
    InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e,
}

public sealed class InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddNoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e).count { it }
}

/**
 * The coupons to redeem into discounts for the subscription. A populated array overwrites the existing discounts on the
 * subscription. If not specified or empty array, it leaves the subscription's discounts unchanged. If empty string, it
 * clears the subscription's discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/discounts
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddInspection,
) {
    public val branch1: List<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e:
        InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddBranch.Branch1)
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e) {
                    add(
                        InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddBranch.InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e,
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
        ): InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddNoMatchException(
                    "InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormDiscountsXa2eec9dd(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf1ItemX1636bd8e>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e>()
    return InlineV1SubscriptionsPostRequestFormDiscountsXa2eec9ddInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e = matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e: value does not match InlineV1SubscriptionsPostRequestFormDiscountsAnyOf2X13abba9e",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
