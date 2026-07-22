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

public enum class InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3Branch {
    Branch1,
    InlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12,
}

public sealed class InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3DecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3NoMatchException(
    message: String,
) : InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3Inspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/items/items/properties/discounts
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3 internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3Inspection,
) {
    public val branch1:
        List<InlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf1ItemX4ddb14d1>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf1ItemX4ddb14d1>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12:
        InlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3Branch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3Branch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12) {
                    add(
                        InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3Branch.InlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12,
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
        ): InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3 {
            val inspection = inspectInlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3NoMatchException(
                    "InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3 matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3 {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3(
    element: JsonElement,
): InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3Inspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf1ItemX4ddb14d1>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12 =
        element
            .isJsonDecodable<InlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12>()
    return InlineV1SubscriptionsPostRequestFormItemsItemDiscountsX964ac1a3Inspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12 = matchesInlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12) {
                    add(
                        "InlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12: value does not match InlineV1SubscriptionsPostRequestFormItemsItemDiscountsAnyOf2X4e87ae12",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
