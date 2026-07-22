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

public enum class InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241Branch {
    Branch1,
    InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa,
}

public sealed class InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241NoMatchException(
    message: String,
) : InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241DecodingException(message)

internal data class InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa,
            ).count { it }
}

/**
 * The coupons to redeem into discounts for the subscription item.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_items/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/discounts
 */
@Serializable(with = InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241.Serializer::class)
public class InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241Inspection,
) {
    public val branch1: List<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX579f4976>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX579f4976>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa:
        InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches: Set<InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa) {
                    add(
                        InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241Branch.InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa,
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
        ): InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241 {
            val inspection = inspectInlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241NoMatchException(
                    "InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241 {
            val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241")
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241(
    element: JsonElement,
): InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf1ItemX579f4976>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa =
        element
            .isJsonDecodable<InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa>()
    return InlineV1SubscriptionItemsPostRequestFormDiscountsX3d881241Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa = matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa) {
                    add(
                        "InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa: value does not match InlineV1SubscriptionItemsPostRequestFormDiscountsAnyOf2Xaf0b80aa",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
