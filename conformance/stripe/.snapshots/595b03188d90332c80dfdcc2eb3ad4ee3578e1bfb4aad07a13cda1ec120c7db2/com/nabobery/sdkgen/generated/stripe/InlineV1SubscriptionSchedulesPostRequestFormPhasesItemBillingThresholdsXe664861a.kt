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

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aBranch {
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085,
    InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aDecodingException(
    message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aNoMatchException(
    message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aInspection(
    public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085: Boolean,
    public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc: Boolean,
    public val failures: List<String>,
) {
    public val matchCount: Int
        get() =
            listOf(
                matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085,
                matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc,
            ).count {
                it
            }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/items/items/properties/billing_thresholds
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a internal constructor(
    /**
     * Raw JSON retained as the serialization authority.
     */
    public val raw: JsonElement,
    private val json: Json,
    private val inspection: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aInspection,
) {
    public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc:
        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc? by
        lazy(LazyThreadSafetyMode.NONE) {
            if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc) {
                json
                    .decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc>(
                        raw,
                    )
            } else {
                null
            }
        }

    public val matchedBranches:
        Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aBranch>
        get() =
            buildSet {
                if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085,
                    )
                }
                if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc) {
                    add(
                        InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc,
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
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a {
            val inspection =
                inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a(raw)
            if (inspection.matchCount == 0) {
                throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aNoMatchException(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a matched 0 branches: " +
                        inspection.failures.joinToString("; "),
                )
            }
            return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a(
                raw,
                json,
                inspection,
            )
        }
    }

    public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a> {
        override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

        override fun deserialize(
            decoder: Decoder,
        ): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a {
            val jsonDecoder =
                decoder.requireJsonDecoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a",
                )
            return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
        }

        override fun serialize(
            encoder: Encoder,
            `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a,
        ) {
            encoder
                .requireJsonEncoder(
                    "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a",
                ).encodeJsonElement(value.raw)
        }
    }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861a(
    element: JsonElement,
): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aInspection {
    val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085 =
        element
            .isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085>()
    val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc =
        element
            .isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc>()
    return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemBillingThresholdsXe664861aInspection(
        matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085,
        matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc,
        failures =
            buildList {
                if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085) {
                    add(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf1X1a1b5085",
                    )
                }
                if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc) {
                    add(
                        "InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemItemsItemAnyOf2X644b15fc",
                    )
                }
            },
    )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
    val element = this ?: return false
    return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
