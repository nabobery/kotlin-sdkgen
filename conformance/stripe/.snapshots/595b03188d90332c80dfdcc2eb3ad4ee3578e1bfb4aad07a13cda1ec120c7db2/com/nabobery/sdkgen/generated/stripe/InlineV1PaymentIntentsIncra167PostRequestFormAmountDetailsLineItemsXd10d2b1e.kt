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

public enum class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eBranch {
    Branch1,
    InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2,
}

public sealed class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eNoMatchException(
    message: String,
) : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eDecodingException(message)

internal data class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eInspection(
    public val matchesBranch1: Boolean,
    public val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesBranch1,
                matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/line_items
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eInspection,
) {
    public val branch1:
        List<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsItemXe0b4e648>? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesBranch1) {
                json
                    .decodeFromJsonElement<List<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsItemXe0b4e648>>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2:
        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2) {
                json
                    .decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eBranch>
        get() =
            buildSet {
                if (inspection.matchesBranch1) {
                    add(
                        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eBranch.Branch1,
                    )
                }
                if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2) {
                    add(
                        InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eBranch.InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2,
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
        ): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e {
            val inspection = inspectInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eNoMatchException(
                    "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e(raw, json, inspection)
        }
    }

    public object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1e(
    element: JsonElement,
): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eInspection {
    val matchesBranch1 =
        element.isJsonDecodable<List<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsItemXe0b4e648>>() &&
            (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
    val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2 =
        element
            .isJsonDecodable<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2>()
    return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsLineItemsXd10d2b1eInspection(
        matchesBranch1 = matchesBranch1,
        matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2 = matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2,
        failures =
            buildList {
                if (!matchesBranch1) add("Branch1: value does not match List")
                if (!matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2) {
                    add(
                        "InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2: value does not match InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X5dfc12a2",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
